package ca.gc.asc_csa.eclipse.converters.graphs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.jgrapht.GraphPath;
import org.jgrapht.alg.KShortestPaths;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

import ca.gc.asc_csa.eclipse.converters.ChainedConverter;
import ca.gc.asc_csa.eclipse.converters.IConverter;
import ca.gc.asc_csa.eclipse.converters.TypeCastConverter;

public class ConverterGraphUtilities 
{
	/**
	 * Creates a converter graph where the vertex are the input and output types and the edges contains the converters.
	 * @param converters The list of converter to include in the graph.
	 * @return The converter graph.
	 */
	@SuppressWarnings("serial")	
	public synchronized static SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> createGraph(final List<IConverter> converters)
	{
		// Creates a instance of SimpleDirectedWeightedGraph with the getEdgeWeight method overloaded.
		SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> simpleDirectedWeightedGraph = new SimpleDirectedWeightedGraph<Class<?>, ConverterEdge>(ConverterEdge.class)
		{
			@Override
			public double getEdgeWeight(ConverterEdge e) 
			{					
				return 1.0;
			}			
		};		
			 
		// Adds the converters provided.
		addConverters(simpleDirectedWeightedGraph, converters);
					
		return simpleDirectedWeightedGraph;
	}
	
	/**
	 * Adds a list of IConverter to an existing graph.
	 * @param graph The graph to which converters will be added.
	 * @param converters The list of IConverter to be added to the graph.
	 */
	public synchronized static void addConverters(final SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph, final List<IConverter> converters)
	{
		// Adds the input and output types as vertices.
		Iterator<IConverter> itConverters = converters.iterator();
		Set<Class<?>> typeSet = new HashSet<Class<?>>();
		while(itConverters.hasNext())
		{
			IConverter converter = itConverters.next();
			typeSet.add(converter.getInputType());
			typeSet.add(converter.getOutputType());
		}
			
		Iterator<Class<?>> typeIt = typeSet.iterator();
		while(typeIt.hasNext())
		{
			graph.addVertex(typeIt.next());
		}
			
		// Adds the edges.		
		itConverters = converters.iterator();
		while(itConverters.hasNext())
		{
			IConverter converter = itConverters.next();
			ConverterEdge edge = new ConverterEdge(converter.getInputType(), converter.getOutputType(), converter);
			graph.addEdge(converter.getInputType(), converter.getOutputType(), edge);
		}
	}
	
	/**
	 * Generate the list of IConverter between types that can bes type casted and that do not have yet a converter.
	 * @param graph The graph of the conversion.
	 * @return A list of IConverter that converts types that are compatible.
	 */
	public synchronized static List<IConverter> generateTypeCastConverters(final SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph)
	{
		List<IConverter> castConverters = new ArrayList<IConverter>();
			
		// Checks each vertex for compatible type (i.e. check if each vertex is a sub type of another vertex)
		List<Class<?>> vertices = new ArrayList<Class<?>>();
		vertices.addAll(graph.vertexSet());				
			
		Iterator<Class<?>> it  = graph.vertexSet().iterator();
		while(it.hasNext())
		{
			Class<?> currentVertex = it.next();
				
			vertices = new ArrayList<Class<?>>();
			vertices.addAll(graph.vertexSet());
			Iterator<Class<?>> verticesIt = vertices.iterator();
			while(verticesIt.hasNext())
			{
				Class<?> potentialSuperType = verticesIt.next();
					
				// Skip current vertex as a potential supertype.
				if(potentialSuperType != currentVertex)
				{
					if(potentialSuperType.isAssignableFrom(currentVertex))
					{
						// Checks that there is not already a direct converter that exist from currentVertex to potentialSuperType						
						boolean converterAlreadyExist = false;
						Set<ConverterEdge> outgoingEdges = graph.outgoingEdgesOf(currentVertex);
						Iterator<ConverterEdge> outIterator = outgoingEdges.iterator();
						while(outIterator.hasNext() && !converterAlreadyExist)
						{
							ConverterEdge edge = outIterator.next();
							if(edge.getTo() == potentialSuperType)
							{
								converterAlreadyExist = true; 
							}
						}
							
						if(!converterAlreadyExist)
						{																				
							// Creates a typecast converter that convert the currentVertex to the potential one.
							TypeCastConverter converter = new TypeCastConverter(currentVertex, potentialSuperType);
							castConverters.add(converter);
						}
					}
				}
			}		
		}
			
		return castConverters;		
	}
	
	/**
	 * Converts the input object to an object of the specified outputType.
	 * @param graph The graph containing the converters.
	 * @param input The input object.
	 * @param outputType The output type.
	 * @return The result of the conversion, null if no conversion was found.
	 */
	public synchronized static Object convert(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph, Object input, Class<?> outputType)
	{
		Object result = null;
			
		if(input != null)
		{
			List<Class<?>> potentialSources = getSourceVertex(graph, input.getClass());
			List<Class<?>> potentialDestination = getDestinationVertex(graph, outputType);
				
			Iterator<Class<?>> sourcesIterator = potentialSources.iterator();
			while(sourcesIterator.hasNext() && (result == null))
			{
				Class<?> sourceVertex = sourcesIterator.next();
					
				Iterator<Class<?>> destinationIterator = potentialDestination.iterator();
				while(destinationIterator.hasNext() && (result == null))
				{
					Class<?> destinationVertex = destinationIterator.next();
						
					// Gets all the converters from source to destination.
					SortedSet<ChainedConverter> convertersSet = findAllConvertersBetweenVertices(graph, sourceVertex, destinationVertex);
						
					Iterator<ChainedConverter> it = convertersSet.iterator();
					while(it.hasNext() && result == null)
					{
						try
						{
							ChainedConverter converter = it.next();								
							result = converter.convert(input);
						}
						catch(Throwable t)
						{								
						}
					}
				}
			}
		}
		
		return result;		
	}
	
	/**
	 * Return the list of ChainedConverter that could convert from a source to a destination type.
	 * @param graph The graph containing the converters.
	 * @param inputType The input type.
	 * @param outputType The output type.
	 * @return The list of ChainedConverter. Never null, but can be empty.
	 */
	public synchronized static SortedSet<ChainedConverter> findAllConvertersBetweenVertices(final SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph, final Class<?> inputType, final Class<?> outputType)
	{
		SortedSet<ChainedConverter> convertersSet = new TreeSet<ChainedConverter>(createComparator());
		
		KShortestPaths<Class<?>, ConverterEdge> kShortestPaths = new KShortestPaths<Class<?>, ConverterEdge>(graph, inputType, 10);
		
		List<GraphPath<Class<?>, ConverterEdge>> shortestPath = kShortestPaths.getPaths(outputType);
		
		if(shortestPath != null)
		{
			for(GraphPath<Class<?>, ConverterEdge> graphPath : shortestPath)
			{
				if(graphPath.getEdgeList() != null)
				{
					List<IConverter> converters = new ArrayList<IConverter>();
					for(ConverterEdge edge : graphPath.getEdgeList())
					{
						IConverter converter = edge.getConverter();
						converters.add(converter);
					}
					convertersSet.add(new ChainedConverter(converters));
				}
			}
		}
		
		return convertersSet;
	}
	
	/**
	 * Tries to find a converter between two types by searching a converter graph.
	 * @param graph The converter graph.
	 * @param inputType The input type.
	 * @param outputType The output type.
	 * @return The Chained converter that convert inputType to outputType, null if none was found.
	 */
	public synchronized static ChainedConverter findConverter(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph, Class<?> inputType, Class<?> outputType)
	{		
		try
		{
			SortedSet<ChainedConverter> converters = findAllConvertersBetweenVertices(graph, inputType, outputType);
			if(!converters.isEmpty())
			{
				return converters.first();
			}
			else
			{
				return null;
			}
		}
		catch (Exception e) 
		{			
			return null;
		}		
	}
	
	/**
	 * Given a graph, returns the list of all types that can be converted FROM (i.e. types with at least one outgoing converter).
	 * @param graph The provided graph.
	 * @return The list of all input types. 
	 */
	public synchronized static Set<Class<?>> getAllInputTypes(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph)
	{
		Set<Class<?>> inputTypes = new HashSet<Class<?>>();
			
		Iterator<ConverterEdge> it = graph.edgeSet().iterator();
		while(it.hasNext())
		{
			ConverterEdge edge = it.next();
			inputTypes.add(edge.getFrom());
		}
			
		return inputTypes;		
	}
	
	/**
	 * Given a graph, returns the list of all types that can be converted TO (i.e. types with at least one ingoing converter).
	 * @param graph The provided graph.
	 * @return The list of all output types. 
	 */
	public synchronized static Set<Class<?>> getAllOutputTypes(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph)
	{
		Set<Class<?>> inputTypes = new HashSet<Class<?>>();
			
		Iterator<ConverterEdge> it = graph.edgeSet().iterator();
		while(it.hasNext())
		{
			ConverterEdge edge = it.next();
			inputTypes.add(edge.getTo());
		}
			
		return inputTypes;		
	}
	
	/**
	 * Return a sorted list (from most specific to least specific) of potential source vertex for a specified input type.
	 * @param graph The graph of converters.
	 * @param inputType The input type.
	 * @return A sorted set of vertex.
	 */
	public synchronized static List<Class<?>> getSourceVertex(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph, Class<?> inputType)
	{
		List<Class<?>> potentialSourceVertices = new ArrayList<Class<?>>();
			
		List<Class<?>> classes = new ArrayList<Class<?>>();
		classes.addAll(getAllInputTypes(graph));	
		boolean done = false;

		while(classes.size() > 0 && !done)
		{
			Class<?> bestMatch = findClosestSuperType(classes, inputType);
			if(bestMatch != null)
			{
				potentialSourceVertices.add(bestMatch);
				classes.remove(bestMatch);
			}
			else
			{
				done = true;
			}
		}
			
		return potentialSourceVertices;
	}
	
	/**
	 * Return a sorted list (from most specific to least specific) of potential destination vertex for a specified input type.
	 * @param graph The graph of converters.
	 * @param inputType The output type.
	 * @return A sorted set of vertex.
	 */
	public synchronized static List<Class<?>> getDestinationVertex(final SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph, final Class<?> outputType)
	{
		List<Class<?>> potentialDestinationVertices = new ArrayList<Class<?>>();
			
		List<Class<?>> classes = new ArrayList<Class<?>>();
		classes.addAll(getAllOutputTypes(graph));	
				
		boolean done = false;
		while(classes.size() > 0 && !done)
		{
			Class<?> bestMatch = findClosestSubType(classes, outputType);
			if(bestMatch != null)
			{
				potentialDestinationVertices.add(bestMatch);
				classes.remove(bestMatch);
			}
			else
			{
				done = true;
			}
		}
			
		return potentialDestinationVertices;		
	}
	
	/**
	 * Return the class from a list that is closest to a specified type.
	 * @param classes The list of class to search.
	 * @param targetType The specified type.
	 * @return The closest type, null if none was found.
	 */
	public synchronized static Class<?> findClosestSuperType(List<Class<?>> classes, Class<?> targetType)
	{
		Class<?> closestMatch = null;
			
		Iterator<Class<?>> iterator = classes.iterator();
		while (iterator.hasNext()) 
		{
			Class<?> c = iterator.next();

			// If c is a super class or interface of aClass
			if (c.isAssignableFrom(targetType))
			{
				// If no match found yet or the current match is a
				// superclass of the current one.
				if ((closestMatch == null) || (closestMatch.isAssignableFrom(c))) 
				{
					closestMatch = c;
				}
			}
		}
			
		return closestMatch;		
	}
	
	/**
	 * Return the class from a list that is closest to a specified type.
	 * @param classes The list of class to search.
	 * @param targetType The specified type.
	 * @return The closest type, null if none was found.
	 */
	public synchronized static Class<?> findClosestSubType(final List<Class<?>> classes, final Class<?> targetType)
	{
		Class<?> closestMatch = null;
						
		Iterator<Class<?>> iterator = classes.iterator();
		while (iterator.hasNext()) 
		{
			Class<?> c = iterator.next();

			// If c is a sub class or interface of aClass
			if (targetType.isAssignableFrom(c))
			{
				// If no match found yet or the current match is a superclass of the current one.
				if ((closestMatch == null) || (c.isAssignableFrom(closestMatch))) 
				{
					closestMatch = c;
				}
			}
		}
			
		return closestMatch;
	}
	
	/**
	 * Return the list of all converters, including type cast ones, contained in a given graph.
	 * @param graph The graph.
	 * @return The list of converters.
	 */
	public synchronized static List<IConverter> getAllConverters(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph)
	{
		List<IConverter> converters = new ArrayList<IConverter>();
			
		Iterator<ConverterEdge> it = graph.edgeSet().iterator();
		while(it.hasNext())
		{
			ConverterEdge edge = it.next();
			converters.add(edge.getConverter());
		}
			
		return converters;
	}
	
	/**
	 * Return the list of all converters, EXCLUDING type cast ones, contained in a given graph.
	 * @param graph The graph.
	 * @return The list of converters.
	 */
	public synchronized static List<IConverter> getAllNonTypeCastConverters(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph)
	{
		List<IConverter> converters = new ArrayList<IConverter>();
			
		Iterator<ConverterEdge> it = graph.edgeSet().iterator();
		while(it.hasNext())
		{
			ConverterEdge edge = it.next();
			if(! (edge.getConverter() instanceof TypeCastConverter))
			{
				converters.add(edge.getConverter());
			}
		}
			
		return converters;		
	}
	
	/**
	 * Creates a map that maps input types to available destination types.
	 * @param graph The specified graph.
	 * @return A map mapping input types to available destination types.
	 */
	public synchronized static Map<Class<?>, List<Class<?>>> getAvailableDestinationTypeMap(final SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph)
	{
		HashMap<Class<?>, List<Class<?>>> map = new HashMap<Class<?>, List<Class<?>>>();
			
		Set<Class<?>> inputTypes = getAllInputTypes(graph);
		Iterator<Class<?>> inputTypesIt = inputTypes.iterator();
		while(inputTypesIt.hasNext())
		{
			Class<?> inputType = inputTypesIt.next();
			List<Class<?>> outputTypes = new ArrayList<Class<?>>();
				
			Set<Class<?>> graphOutputTypes = getAllOutputTypes(graph);
			Iterator<Class<?>> outputTypesIt = graphOutputTypes.iterator();
			while(outputTypesIt.hasNext())
			{
				Class<?> outputType = outputTypesIt.next();
				if(outputType != inputType)
				{				
					ChainedConverter c = findConverter(graph, inputType, outputType);
					if(c != null)
					{
						outputTypes.add(outputType);
					}
				}
			}
							
			map.put(inputType, outputTypes);
		}						

		return map;		
	}
	
	/**
	 * Creates a Comparator of ChainedConverter.
	 * @return The Comparator.
	 */
	public synchronized static Comparator<ChainedConverter> createComparator()
	{
		Comparator<ChainedConverter> comparator = new Comparator<ChainedConverter>() 
		{
			@Override
			public int compare(ChainedConverter o1, ChainedConverter o2) 
			{
				if(o1.getChainSize() < o2.getChainSize())
				{
					return -1;
				}
				else if(o1.getChainSize() > o2.getChainSize())
				{
					return 1;
				}
				else
				{
					return o1.getClass().getName().compareTo(o2.getClass().getName());
				}						
			}
		};
		
		return comparator;
	}
}
