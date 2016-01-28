package org.eclipse.symphony.common.converters.tests;

import java.util.List;

import junit.framework.TestCase;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.symphony.common.converters.IConverter;
import org.eclipse.symphony.common.converters.Symphony__CommonConvertersFacade;
import org.eclipse.symphony.common.converters.tests.types.A;
import org.eclipse.symphony.common.converters.tests.types.B;
import org.eclipse.symphony.common.converters.tests.types.C;
import org.eclipse.symphony.common.converters.ui.Symphony__CommonConvertersUIFacade;
import org.junit.Test;

public class Symphony__CommonConvertersFacadeTest extends TestCase
{
	@SuppressWarnings("rawtypes")
	@Test
	public void testConvertISelection() 
	{
		A input = new A();
		input.setDescription("A");
		IStructuredSelection structuredSelection = new StructuredSelection(input);
		
		List results = Symphony__CommonConvertersUIFacade.INSTANCE.convert(structuredSelection, B.class);
		
		assertEquals(1, results.size());		
		B result = (B) results.get(0);
		
		assertNotNull(result);
		assertTrue(result.getDescription().compareTo("A->AtoB") == 0);
	}

	@SuppressWarnings("rawtypes")
	@Test
	public void testConvertISelection2() 
	{
		// Tries converting a selection that already contains the proper type.
		B b = new B();
		IStructuredSelection structuredSelection = new StructuredSelection(b);
		
		List results = Symphony__CommonConvertersUIFacade.INSTANCE.convert(structuredSelection, B.class);
		assertEquals(1, results.size());	
		
		B result = (B) results.get(0);
		assertEquals(b, result);
	}
	
	@Test
	public void testConvert() 
	{
		
		// Convert A to B
		A a = new A();
		a.setDescription("A");
		B b = (B) Symphony__CommonConvertersFacade.INSTANCE.convert(a, B.class);
		assertNotNull(b);
		assertTrue(b.getDescription().compareTo("A->AtoB") == 0);	
		
		// Convert B to C
		b = new B();
		b.setDescription("B");
		C c = (C) Symphony__CommonConvertersFacade.INSTANCE.convert(b, C.class);
		assertNotNull(c);
		assertTrue(c.getDescription().compareTo("B->BtoC") == 0);	
	}
	
	@Test
	public void testConvert2() 
	{
		C input = new C();
		input.setDescription("A");
		A result = (A) Symphony__CommonConvertersFacade.INSTANCE.convert(input, A.class);
		assertTrue(result==null);		
	}
	
	@Test
	public void testConverterChaining() 
	{
		A input = new A();
		input.setDescription("A");
		C c = (C) Symphony__CommonConvertersFacade.INSTANCE.convert(input,C.class);
		assertNotNull(c);		
		assertTrue(c.getDescription().compareTo("A->AtoB->BtoC") == 0);				
	}

	@Test
	public void testGetAllRegisteredConverters() 
	{
		List<IConverter> converters = Symphony__CommonConvertersFacade.INSTANCE.getAllRegisteredConverters();
		
		for(int i = 0; i < converters.size(); i++)
		{
			IConverter converter = converters.get(i);
			System.out.println(converter.getClass().getName() + "\t" + converter.getInputType().getSimpleName() + " -> " + converter.getOutputType().getSimpleName());
		}
		
		assertTrue(converters.size() > 0);
	}

}
