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
import ca.gc.asc_csa.apogy.common.converters.tests.types.B;
import ca.gc.asc_csa.apogy.common.converters.tests.types.D;

public class ConverterDtoB implements IConverter {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Class getOutputType() {		
		return B.class;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Class getInputType() {		
		return D.class;
	}

	@Override
	public boolean canConvert(Object input) 
	{	
		return input instanceof D;
	}

	@Override
	public Object convert(Object input) throws Exception 
	{
		D d = (D) input;
		B b = new B();		
		b.setDescription(d.getDescription() + "->DtoB");
		return b;
	}

}
