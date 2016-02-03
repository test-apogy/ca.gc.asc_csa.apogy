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

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import ca.gc.asc_csa.apogy.common.converters.ChainedConverter;
import ca.gc.asc_csa.apogy.common.converters.IConverter;
import ca.gc.asc_csa.apogy.common.converters.tests.converters.ConverterAtoB;
import ca.gc.asc_csa.apogy.common.converters.tests.converters.ConverterBtoC;
import ca.gc.asc_csa.apogy.common.converters.tests.types.A;
import ca.gc.asc_csa.apogy.common.converters.tests.types.C;
import org.junit.Test;

public class ChainedConverterTest extends TestCase {

	@Test
	public void testGetOutputType() 
	{
		List<IConverter> converters = new ArrayList<IConverter>();		
		ChainedConverter chainedConverter = new ChainedConverter(converters);
				
		assertNull(chainedConverter.getOutputType());
		
		// Adds a few converters.
		converters.add(new ConverterAtoB());
		converters.add(new ConverterBtoC());
		
		chainedConverter = new ChainedConverter(converters);		
		assertTrue(chainedConverter.getOutputType() == C.class);
	}

	@Test
	public void testGetInputType() 
	{
		List<IConverter> converters = new ArrayList<IConverter>();		
		ChainedConverter chainedConverter = new ChainedConverter(converters);
				
		assertNull(chainedConverter.getInputType());
		
		// Adds a few converters.
		converters.add(new ConverterAtoB());
		converters.add(new ConverterBtoC());
		
		chainedConverter = new ChainedConverter(converters);		
		assertTrue(chainedConverter.getInputType() == A.class);
	}

	@Test
	public void testCanConvert() 
	{
	}

	@Test
	public void testConvert() 
	{
		List<IConverter> converters = new ArrayList<IConverter>();				
		converters.add(new ConverterAtoB());
		converters.add(new ConverterBtoC());		
		ChainedConverter chainedConverter = new ChainedConverter(converters);
		A a = new A();
		a.setDescription("A");
		C c = null;
		try 
		{
			c = (C) chainedConverter.convert(a);
		} 
		catch (Exception e) 
		{			
			e.printStackTrace();
			fail();
		}
		assertNotNull(c);				
		assertTrue(c.getDescription().compareTo("A->AtoB->BtoC") == 0);		
	}

}
