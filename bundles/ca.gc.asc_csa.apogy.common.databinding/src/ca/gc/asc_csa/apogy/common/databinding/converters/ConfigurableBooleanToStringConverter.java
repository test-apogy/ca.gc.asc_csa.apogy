package ca.gc.asc_csa.apogy.common.databinding.converters;
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

import org.eclipse.core.databinding.conversion.Converter;

public class ConfigurableBooleanToStringConverter extends Converter 
{
	private String falseString = "FALSE";
	private String trueString = "TRUE";
	
	/**
	 * Creates a ConfigurableBooleanToStringConverter with true and false strings.
	 * @param trueString The string to display when the condition is true.
	 * @param falseString The string to display when the condition is false.	 
	 */
	public ConfigurableBooleanToStringConverter(String trueString, String falseString) 
	{
		super(Boolean.class, String.class);
		this.falseString = falseString;
		this.trueString = trueString;
	}

	public ConfigurableBooleanToStringConverter(Object fromType, Object toType)
	{
		super(fromType, toType);
	}

	public Object convert(Object fromObject) 
	{		
		Boolean condition = (Boolean) fromObject;
		
		if(condition) return trueString;
		else return falseString;
	}
}
