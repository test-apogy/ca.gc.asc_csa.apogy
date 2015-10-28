package org.eclipse.symphony.common.converters.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;

import junit.framework.TestCase;

import org.eclipse.symphony.common.converters.ChainedConverter;
import org.eclipse.symphony.common.converters.IConverter;
import org.eclipse.symphony.common.converters.graphs.ConverterEdge;
import org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade;
import org.eclipse.symphony.common.converters.tests.converters.ConverterAAtoA;
import org.eclipse.symphony.common.converters.tests.converters.ConverterAAtoC;
import org.eclipse.symphony.common.converters.tests.converters.ConverterAtoB;
import org.eclipse.symphony.common.converters.tests.converters.ConverterAtoBB;
import org.eclipse.symphony.common.converters.tests.converters.ConverterAtoC;
import org.eclipse.symphony.common.converters.tests.converters.ConverterAtoF;
import org.eclipse.symphony.common.converters.tests.converters.ConverterBtoA;
import org.eclipse.symphony.common.converters.tests.converters.ConverterBtoC;
import org.eclipse.symphony.common.converters.tests.converters.ConverterBtoD;
import org.eclipse.symphony.common.converters.tests.converters.ConverterDtoB;
import org.eclipse.symphony.common.converters.tests.types.A;
import org.eclipse.symphony.common.converters.tests.types.AA;
import org.eclipse.symphony.common.converters.tests.types.AAA;
import org.eclipse.symphony.common.converters.tests.types.B;
import org.eclipse.symphony.common.converters.tests.types.BB;
import org.eclipse.symphony.common.converters.tests.types.C;
import org.eclipse.symphony.common.converters.tests.types.D;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;
import org.junit.Test;

public class Symphony__CommonConvertersGraphsFacadeTest extends TestCase 
{
	@Test
	public void testCreateGraph() 
	{
		List<IConverter> converters = new ArrayList<IConverter>();
		converters.add(new ConverterAtoB());
		converters.add(new ConverterBtoC());
		SimpleDirectedWeightedGraph<Class<?>, ConverterEdge>  graph = Symphony__CommonConvertersGraphsFacade.INSTANCE.createGraph(converters);
		assertEquals(2, graph.edgeSet().size());
		assertEquals(3, graph.vertexSet().size());	
	}
	
	@Test
	public void testFindConverter() 
	{
		List<IConverter> converters = new ArrayList<IConverter>();
		converters.add(new ConverterBtoD());
		converters.add(new ConverterAtoB());
		converters.add(new ConverterBtoC());		
		SimpleDirectedWeightedGraph<Class<?>, ConverterEdge>  graph = Symphony__CommonConvertersGraphsFacade.INSTANCE.createGraph(converters);
		
		// Test a simple case where no chaining is required.
		IConverter converter = Symphony__CommonConvertersGraphsFacade.INSTANCE.findConverter(graph, A.class, B.class);
		assertNotNull(converter);
		A a = new A();
		a.setDescription("A");
		B b = null;
		try 
		{
			b = (B) converter.convert(a);
		} 
		catch (Exception e) 
		{			
			e.printStackTrace();
			fail();
		}
		assertNotNull(b);
		assertEquals("A->AtoB", b.getDescription());	
		
		// Test a case where chaining is required.
		converter = Symphony__CommonConvertersGraphsFacade.INSTANCE.findConverter(graph, A.class, C.class);
		C c = null;
		try 
		{
			c = (C) converter.convert(a);
		} 
		catch (Exception e) 
		{			
			e.printStackTrace();
			fail();
		}
		assertNotNull(c);
		assertEquals("A->AtoB->BtoC", c.getDescription());
		
		// Test a case where chaining is required.
		converter = Symphony__CommonConvertersGraphsFacade.INSTANCE.findConverter(graph, A.class, D.class);
		D d = null;
		try 
		{
			d = (D) converter.convert(a);
		} 
		catch (Exception e) 
		{			
			e.printStackTrace();
			fail();
		}
		assertNotNull(d);
		assertEquals("A->AtoB->BtoD", d.getDescription());
	}
	
	@Test
	public void testComplexChaining()
	{
		// Populate the list of converters.
		List<IConverter> converters = new ArrayList<IConverter>();
			
		ConverterAtoC aToC = new ConverterAtoC(true);
			
		converters.add(new ConverterAtoF());
		converters.add(aToC);
		converters.add(new ConverterAtoB());
		converters.add(new ConverterBtoA());
		converters.add(new ConverterBtoC());
		converters.add(new ConverterBtoD());
			
		// Creates the conversion graph 
		SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph = Symphony__CommonConvertersGraphsFacade.INSTANCE.createGraph(converters);
			
		A a = new A();
						
		//IConverter converter = ConverterGraphUtilities.findConverterNEW(graph, A.class, C.class, a);
		IConverter converter = Symphony__CommonConvertersGraphsFacade.INSTANCE.findConverter(graph, A.class, C.class);
		assertNotNull(converter);
		System.out.println("Converter : " + converter.toString());
						
		try 
		{
			C c = (C) converter.convert(a);
			assertNotNull(c);
		} 
		catch (Exception e) 
		{
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testGenerateTypeCastConverters()
	{
		List<IConverter> converters = new ArrayList<IConverter>();		
	
		converters.add(new ConverterAtoB());
		converters.add(new ConverterAAtoC());
		converters.add(new ConverterBtoC());	

		// Creates a graph that requires one typeCastConverter from AA to A
		SimpleDirectedWeightedGraph<Class<?>, ConverterEdge>  graph = Symphony__CommonConvertersGraphsFacade.INSTANCE.createGraph(converters);
		
		List<IConverter> typeCastConverters = Symphony__CommonConvertersGraphsFacade.INSTANCE.generateTypeCastConverters(graph);
		assertEquals(1, typeCastConverters.size());
		IConverter converter = typeCastConverters.get(0);
		assertNotNull(converter);
		assertEquals(AA.class, converter.getInputType());
		assertEquals(A.class, converter.getOutputType());
		
		// Redo the test, but add a converter between A and AA. This should produce NO typeCastConverter.
		converters.add(new ConverterAAtoA());	
		graph = Symphony__CommonConvertersGraphsFacade.INSTANCE.createGraph(converters);
		
		typeCastConverters = Symphony__CommonConvertersGraphsFacade.INSTANCE.generateTypeCastConverters(graph);
		assertEquals(0, typeCastConverters.size());
	}
	
	@Test
	public void testConvertFromSubTypeToType()
	{
		// Populate the list of converters.
		List<IConverter> converters = new ArrayList<IConverter>();				
		converters.add(new ConverterAtoB());
			
		// Creates the conversion graph 
		SimpleDirectedWeightedGraph<Class<?>, ConverterEdge>  graph = Symphony__CommonConvertersGraphsFacade.INSTANCE.createGraph(converters);
			
		AA aa = new AA();
		aa.setDescription("AA");
		B b = (B) Symphony__CommonConvertersGraphsFacade.INSTANCE.convert(graph, aa, B.class);
		assertNotNull(b);
		assertEquals("AA->AtoB", b.getDescription());
						
		// Adds another converter to the list and do the same test. This converter should not change anything
		converters.add(new ConverterAAtoC());
		graph = Symphony__CommonConvertersGraphsFacade.INSTANCE.createGraph(converters);
		b = (B) Symphony__CommonConvertersGraphsFacade.INSTANCE.convert(graph, aa, B.class);
		assertNotNull(b);
		assertEquals("AA->AtoB", b.getDescription());
			
		// Adds a converter from AA to A. This converter should be used instead of the TypeCast one.
		converters.add(new ConverterAAtoA());
		graph = Symphony__CommonConvertersGraphsFacade.INSTANCE.createGraph(converters);
		b = (B) Symphony__CommonConvertersGraphsFacade.INSTANCE.convert(graph, aa, B.class);
		assertNotNull(b);	
		assertNotNull(b.getDescription());				
		assertEquals("AA->AAtoA->AtoB", b.getDescription());
	}
	
	@Test
	public void testConvertFromSubTypeToSuperType()
	{
		// Populate the list of converters.
		List<IConverter> converters = new ArrayList<IConverter>();				
		converters.add(new ConverterAtoBB());
		converters.add(new ConverterDtoB());
		
		// Creates the conversion graph 
		SimpleDirectedWeightedGraph<Class<?>, ConverterEdge>  graph = Symphony__CommonConvertersGraphsFacade.INSTANCE.createGraph(converters);
		
		AA aa = new AA();
		aa.setDescription("AA");
				
		B b = (B) Symphony__CommonConvertersGraphsFacade.INSTANCE.convert(graph, aa, B.class);
		assertNotNull(b);
		String description = b.getDescription();
		
		assertNotNull(description);		
		assertEquals("AA->AtoBB", description);
	}
	
	@Test
	public void testSourceTypePrecedence()
	{
		// Populate the list of converters.
		List<IConverter> converters = new ArrayList<IConverter>();				
		converters.add(new ConverterAtoC());
		converters.add(new ConverterAAtoC());
		converters.add(new ConverterAtoB());
		
		// Creates the conversion graph 
		SimpleDirectedWeightedGraph<Class<?>, ConverterEdge>  graph = Symphony__CommonConvertersGraphsFacade.INSTANCE.createGraph(converters);

		AA aa = new AA();
		aa.setDescription("AA");
				
		C c = (C) Symphony__CommonConvertersGraphsFacade.INSTANCE.convert(graph, aa, C.class);
		assertNotNull(c);
		assertNotNull(c.getDescription());		
		assertEquals("AA->AAtoC", c.getDescription());
		
		// Re-do the test but invert the order in which the converter were added. Should not change anything in the result.
		converters = new ArrayList<IConverter>();				
		converters.add(new ConverterAtoB());		
		converters.add(new ConverterAAtoC());
		converters.add(new ConverterAtoC());
		
		graph = Symphony__CommonConvertersGraphsFacade.INSTANCE.createGraph(converters);

		aa = new AA();
		aa.setDescription("AA");
				
		c = (C) Symphony__CommonConvertersGraphsFacade.INSTANCE.convert(graph, aa, C.class);
		assertNotNull(c);
		assertNotNull(c.getDescription());		
		assertEquals("AA->AAtoC", c.getDescription());
	}
	
	@Test
	public void testFindClosestSuperType()
	{
		List<Class<?>> classes = new ArrayList<Class<?>>();
		classes.add(A.class);
		classes.add(C.class);
		classes.add(BB.class);		
		classes.add(B.class);
		
		// This should return A.class
		Class<?> result = Symphony__CommonConvertersGraphsFacade.INSTANCE.findClosestSuperType(classes, AA.class);
		assertEquals(A.class, result);
		
		// This should return B
		result = Symphony__CommonConvertersGraphsFacade.INSTANCE.findClosestSuperType(classes, B.class);
		assertEquals(B.class, result);
		
		// This should return null
		result = Symphony__CommonConvertersGraphsFacade.INSTANCE.findClosestSuperType(classes, D.class);
		assertNull(result);
				
		// Adds AA to the list.
		classes.add(AA.class);
		result = Symphony__CommonConvertersGraphsFacade.INSTANCE.findClosestSuperType(classes, AA.class);
		assertEquals(AA.class, result);
	}
	
	@Test
	public void testFindClosestSubType()
	{
		List<Class<?>> classes = new ArrayList<Class<?>>();
		classes.add(A.class);
		classes.add(C.class);
		classes.add(BB.class);		
		classes.add(B.class);
		
		// This should return BB.class
		Class<?> result = Symphony__CommonConvertersGraphsFacade.INSTANCE.findClosestSubType(classes, BB.class);
		assertEquals(BB.class, result);	
		
		result = Symphony__CommonConvertersGraphsFacade.INSTANCE.findClosestSubType(classes, B.class);
		assertEquals(B.class, result);

		result = Symphony__CommonConvertersGraphsFacade.INSTANCE.findClosestSubType(classes, AA.class);
		assertEquals(null, result);
	}
	
	@Test
	public void testGetSourceVertex()
	{
		// Populate the list of converters.
		List<IConverter> converters = new ArrayList<IConverter>();				
		converters.add(new ConverterAtoC());
		converters.add(new ConverterAAtoC());
		converters.add(new ConverterAtoB());
		
		// Creates the conversion graph 
		SimpleDirectedWeightedGraph<Class<?>, ConverterEdge>  graph = Symphony__CommonConvertersGraphsFacade.INSTANCE.createGraph(converters);

		List<Class<?>> results = Symphony__CommonConvertersGraphsFacade.INSTANCE.getSourceVertex(graph, AA.class);
		assertEquals(2, results.size());
		assertEquals(AA.class, results.get(0));
		assertEquals(A.class, results.get(1));
		
		results = Symphony__CommonConvertersGraphsFacade.INSTANCE.getSourceVertex(graph, A.class);
		assertEquals(1, results.size());		
		assertEquals(A.class, results.get(0));
		
		results = Symphony__CommonConvertersGraphsFacade.INSTANCE.getSourceVertex(graph, AAA.class);
		assertEquals(2, results.size());
		assertEquals(AA.class, results.get(0));
		assertEquals(A.class, results.get(1));
				
		// No C as input, thus should return an empty list.
		results = Symphony__CommonConvertersGraphsFacade.INSTANCE.getSourceVertex(graph, C.class);		
		assertEquals(0, results.size());
	}
	
	@Test
	public void testGetDestinationVertex()
	{
		// Populate the list of converters.
		List<IConverter> converters = new ArrayList<IConverter>();				
		converters.add(new ConverterAtoC());
		converters.add(new ConverterAAtoC());
		converters.add(new ConverterAtoB());
		converters.add(new ConverterAtoBB());
			
		// Creates the conversion graph 
		SimpleDirectedWeightedGraph<Class<?>, ConverterEdge>  graph = Symphony__CommonConvertersGraphsFacade.INSTANCE.createGraph(converters);
	
		List<Class<?>> results = Symphony__CommonConvertersGraphsFacade.INSTANCE.getDestinationVertex(graph, C.class);
		assertEquals(1, results.size());
		assertEquals(C.class, results.get(0));		
			
		results = Symphony__CommonConvertersGraphsFacade.INSTANCE.getDestinationVertex(graph, BB.class);
		assertEquals(1, results.size());		
		assertEquals(BB.class, results.get(0));
			
		results = Symphony__CommonConvertersGraphsFacade.INSTANCE.getDestinationVertex(graph, B.class);
		assertEquals(2, results.size());
		assertEquals(B.class, results.get(0));
		assertEquals(BB.class, results.get(1));
					
		// No A as output, thus should return an empty list.
		results = Symphony__CommonConvertersGraphsFacade.INSTANCE.getDestinationVertex(graph,A.class);		
		assertEquals(0, results.size());
	}
	
	@Test
	public void testfindAllPathBetweenVertices()
	{
		// Populate the list of converters.
		List<IConverter> converters = new ArrayList<IConverter>();
			
		converters.add(new ConverterAtoF());
		converters.add(new ConverterAtoC());
		converters.add(new ConverterAtoB());
		converters.add(new ConverterBtoA());
		converters.add(new ConverterBtoC());
		converters.add(new ConverterBtoD());
			
		// Creates the conversion graph 
		SimpleDirectedWeightedGraph<Class<?>, ConverterEdge>  graph = Symphony__CommonConvertersGraphsFacade.INSTANCE.createGraph(converters);
	
		SortedSet<ChainedConverter> converterSet = Symphony__CommonConvertersGraphsFacade.INSTANCE.findAllConvertersBetweenVertices(graph, A.class, C.class);			
		assertNotNull(converterSet);
		assertEquals(2, converterSet.size());
			
		for(ChainedConverter converter : converterSet)
		{
			System.out.println(converter.toString());
		}
	}
}
