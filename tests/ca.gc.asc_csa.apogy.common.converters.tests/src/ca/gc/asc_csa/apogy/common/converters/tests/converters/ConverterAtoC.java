package ca.gc.asc_csa.apogy.common.converters.tests.converters;
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

import ca.gc.asc_csa.apogy.common.converters.IConverter;
import ca.gc.asc_csa.apogy.common.converters.tests.types.A;
import ca.gc.asc_csa.apogy.common.converters.tests.types.C;

public class ConverterAtoC implements IConverter 
{
	private boolean canConvert = true;
	
	public ConverterAtoC() 
	{
		this(true);
	}
	
	public ConverterAtoC(boolean canConvert) 
	{
		this.canConvert = canConvert;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Class getOutputType() {		
		return C.class;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Class getInputType() {		
		return A.class;
	}

	@Override
	public boolean canConvert(Object input) 
	{	
		if(canConvert)
		{
			return (input != null);
		}
		else
		{
			return false;
		}
	}

	@Override
	public Object convert(Object input) throws Exception 
	{
		A a = (A) input;
		C c = new C();		
		c.setDescription(a.getDescription() + "->AtoC");
		return c;
	}

}
