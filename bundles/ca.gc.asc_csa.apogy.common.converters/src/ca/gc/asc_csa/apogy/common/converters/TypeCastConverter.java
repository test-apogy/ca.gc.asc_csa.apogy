package ca.gc.asc_csa.apogy.common.converters;
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

public class TypeCastConverter implements IConverter {

	private Class<?> inputType = null; 
	private Class<?> outputType = null;
	
	public TypeCastConverter(Class<?> inputType, Class<?> outputType)
	{
		this.inputType = inputType;
		this.outputType = outputType;
	}
	
	@Override
	public Class<?> getOutputType() {		
		return outputType;
	}

	@Override
	public Class<?> getInputType() {
		return inputType;
	}

	@Override
	public boolean canConvert(Object input) 
	{ 
		return outputType.isAssignableFrom(input.getClass());
	}

	@Override
	public Object convert(Object input) throws Exception 
	{		
		return input;
	}

}
