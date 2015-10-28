/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.converters.graphs.impl;

import java.lang.reflect.InvocationTargetException;
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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.converters.ChainedConverter;
import org.eclipse.symphony.common.converters.IConverter;
import org.eclipse.symphony.common.converters.TypeCastConverter;
import org.eclipse.symphony.common.converters.graphs.ConverterEdge;
import org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade;
import org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsPackage;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.KShortestPaths;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Symphony__CommonConvertersGraphsFacadeImpl extends MinimalEObjectImpl.Container implements Symphony__CommonConvertersGraphsFacade {
	
	private static Symphony__CommonConvertersGraphsFacade instance = null;
	
	public static Symphony__CommonConvertersGraphsFacade getInstance()
	{
		if (instance == null)
		{
			instance = new Symphony__CommonConvertersGraphsFacadeImpl();
		}
		
		return instance;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Symphony__CommonConvertersGraphsFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CommonConvertersGraphsPackage.Literals.SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@SuppressWarnings("serial")
	@Override
	public synchronized SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> createGraph(List<IConverter> converters)
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public synchronized void addConverters(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph,
										   List<IConverter> converters)
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public synchronized List<IConverter> generateTypeCastConverters(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph)
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public synchronized Object convert(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph,
						  			   Object input,
						  			   Class<?> outputType)
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public synchronized SortedSet<ChainedConverter> findAllConvertersBetweenVertices(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph,
																					 Class<?> inputType,
																					 Class<?> outputType)
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public synchronized ChainedConverter findConverter(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph,
													   Class<?> inputType,
													   Class<?> outputType)
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public synchronized Set<Class<?>> getAllInputTypes(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph)
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public synchronized Set<Class<?>> getAllOutputTypes(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph)
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public synchronized List<Class<?>> getSourceVertex(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph,
													   Class<?> inputType)
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public synchronized List<Class<?>> getDestinationVertex(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph,
															Class<?> outputType)
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public synchronized Class<?> findClosestSuperType(List<Class<?>> classes,
													  Class<?> targetType)
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public synchronized Class<?> findClosestSubType(List<Class<?>> classes,
													Class<?> targetType)
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public synchronized List<IConverter> getAllConverters(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph)
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public synchronized List<IConverter> getAllNonTypeCastConverters(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph)
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public synchronized Map<Class<?>, List<Class<?>>> getAvailableDestinationTypeMap(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph)
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public synchronized Comparator<ChainedConverter> createComparator()
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Symphony__CommonConvertersGraphsPackage.SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___CREATE_GRAPH__LIST:
				return createGraph((List<IConverter>)arguments.get(0));
			case Symphony__CommonConvertersGraphsPackage.SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___ADD_CONVERTERS__SIMPLEDIRECTEDWEIGHTEDGRAPH_LIST:
				addConverters((SimpleDirectedWeightedGraph<Class<?>, ConverterEdge>)arguments.get(0), (List<IConverter>)arguments.get(1));
				return null;
			case Symphony__CommonConvertersGraphsPackage.SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GENERATE_TYPE_CAST_CONVERTERS__SIMPLEDIRECTEDWEIGHTEDGRAPH:
				return generateTypeCastConverters((SimpleDirectedWeightedGraph<Class<?>, ConverterEdge>)arguments.get(0));
			case Symphony__CommonConvertersGraphsPackage.SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___CONVERT__SIMPLEDIRECTEDWEIGHTEDGRAPH_OBJECT_CLASS:
				return convert((SimpleDirectedWeightedGraph<Class<?>, ConverterEdge>)arguments.get(0), arguments.get(1), (Class<?>)arguments.get(2));
			case Symphony__CommonConvertersGraphsPackage.SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___FIND_ALL_CONVERTERS_BETWEEN_VERTICES__SIMPLEDIRECTEDWEIGHTEDGRAPH_CLASS_CLASS:
				return findAllConvertersBetweenVertices((SimpleDirectedWeightedGraph<Class<?>, ConverterEdge>)arguments.get(0), (Class<?>)arguments.get(1), (Class<?>)arguments.get(2));
			case Symphony__CommonConvertersGraphsPackage.SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___FIND_CONVERTER__SIMPLEDIRECTEDWEIGHTEDGRAPH_CLASS_CLASS:
				return findConverter((SimpleDirectedWeightedGraph<Class<?>, ConverterEdge>)arguments.get(0), (Class<?>)arguments.get(1), (Class<?>)arguments.get(2));
			case Symphony__CommonConvertersGraphsPackage.SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_ALL_INPUT_TYPES__SIMPLEDIRECTEDWEIGHTEDGRAPH:
				return getAllInputTypes((SimpleDirectedWeightedGraph<Class<?>, ConverterEdge>)arguments.get(0));
			case Symphony__CommonConvertersGraphsPackage.SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_ALL_OUTPUT_TYPES__SIMPLEDIRECTEDWEIGHTEDGRAPH:
				return getAllOutputTypes((SimpleDirectedWeightedGraph<Class<?>, ConverterEdge>)arguments.get(0));
			case Symphony__CommonConvertersGraphsPackage.SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_SOURCE_VERTEX__SIMPLEDIRECTEDWEIGHTEDGRAPH_CLASS:
				return getSourceVertex((SimpleDirectedWeightedGraph<Class<?>, ConverterEdge>)arguments.get(0), (Class<?>)arguments.get(1));
			case Symphony__CommonConvertersGraphsPackage.SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_DESTINATION_VERTEX__SIMPLEDIRECTEDWEIGHTEDGRAPH_CLASS:
				return getDestinationVertex((SimpleDirectedWeightedGraph<Class<?>, ConverterEdge>)arguments.get(0), (Class<?>)arguments.get(1));
			case Symphony__CommonConvertersGraphsPackage.SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___FIND_CLOSEST_SUPER_TYPE__LIST_CLASS:
				return findClosestSuperType((List<Class<?>>)arguments.get(0), (Class<?>)arguments.get(1));
			case Symphony__CommonConvertersGraphsPackage.SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___FIND_CLOSEST_SUB_TYPE__LIST_CLASS:
				return findClosestSubType((List<Class<?>>)arguments.get(0), (Class<?>)arguments.get(1));
			case Symphony__CommonConvertersGraphsPackage.SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_ALL_CONVERTERS__SIMPLEDIRECTEDWEIGHTEDGRAPH:
				return getAllConverters((SimpleDirectedWeightedGraph<Class<?>, ConverterEdge>)arguments.get(0));
			case Symphony__CommonConvertersGraphsPackage.SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_ALL_NON_TYPE_CAST_CONVERTERS__SIMPLEDIRECTEDWEIGHTEDGRAPH:
				return getAllNonTypeCastConverters((SimpleDirectedWeightedGraph<Class<?>, ConverterEdge>)arguments.get(0));
			case Symphony__CommonConvertersGraphsPackage.SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_AVAILABLE_DESTINATION_TYPE_MAP__SIMPLEDIRECTEDWEIGHTEDGRAPH:
				return getAvailableDestinationTypeMap((SimpleDirectedWeightedGraph<Class<?>, ConverterEdge>)arguments.get(0));
			case Symphony__CommonConvertersGraphsPackage.SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___CREATE_COMPARATOR:
				return createComparator();
		}
		return super.eInvoke(operationID, arguments);
	}

} //Symphony__CommonConvertersGraphsFacadeImpl
