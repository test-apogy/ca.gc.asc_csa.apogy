package ca.gc.asc_csa.apogy.common.converters.tests;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.util.List;

import junit.framework.TestCase;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import ca.gc.asc_csa.apogy.common.converters.IConverter;
import ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersFacade;
import ca.gc.asc_csa.apogy.common.converters.tests.types.A;
import ca.gc.asc_csa.apogy.common.converters.tests.types.B;
import ca.gc.asc_csa.apogy.common.converters.tests.types.C;
import ca.gc.asc_csa.apogy.common.converters.ui.ApogyCommonConvertersUIFacade;
import org.junit.Test;

public class ApogyCommonConvertersFacadeTest extends TestCase
{
	@SuppressWarnings("rawtypes")
	@Test
	public void testConvertISelection() 
	{
		A input = new A();
		input.setDescription("A");
		IStructuredSelection structuredSelection = new StructuredSelection(input);
		
		List results = ApogyCommonConvertersUIFacade.INSTANCE.convert(structuredSelection, B.class);
		
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
		
		List results = ApogyCommonConvertersUIFacade.INSTANCE.convert(structuredSelection, B.class);
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
		B b = (B) ApogyCommonConvertersFacade.INSTANCE.convert(a, B.class);
		assertNotNull(b);
		assertTrue(b.getDescription().compareTo("A->AtoB") == 0);	
		
		// Convert B to C
		b = new B();
		b.setDescription("B");
		C c = (C) ApogyCommonConvertersFacade.INSTANCE.convert(b, C.class);
		assertNotNull(c);
		assertTrue(c.getDescription().compareTo("B->BtoC") == 0);	
	}
	
	@Test
	public void testConvert2() 
	{
		C input = new C();
		input.setDescription("A");
		A result = (A) ApogyCommonConvertersFacade.INSTANCE.convert(input, A.class);
		assertTrue(result==null);		
	}
	
	@Test
	public void testConverterChaining() 
	{
		A input = new A();
		input.setDescription("A");
		C c = (C) ApogyCommonConvertersFacade.INSTANCE.convert(input,C.class);
		assertNotNull(c);		
		assertTrue(c.getDescription().compareTo("A->AtoB->BtoC") == 0);				
	}

	@Test
	public void testGetAllRegisteredConverters() 
	{
		List<IConverter> converters = ApogyCommonConvertersFacade.INSTANCE.getAllRegisteredConverters();
		
		for(int i = 0; i < converters.size(); i++)
		{
			IConverter converter = converters.get(i);
			System.out.println(converter.getClass().getName() + "\t" + converter.getInputType().getSimpleName() + " -> " + converter.getOutputType().getSimpleName());
		}
		
		assertTrue(converters.size() > 0);
	}

}
