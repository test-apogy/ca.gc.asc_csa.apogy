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
import org.eclipse.swt.graphics.Color;

public class ConfigurableBooleanToColorConverter extends Converter 
{
	private Color falseColor = null;
	private Color trueColor = null;
	
	/**
	 * Creates a ConfigurableBooleanToColorConverter with true and false Colors.
	 * @param trueString The Color to display when the condition is true.
	 * @param falseString The Color to display when the condition is false.	 
	 */
	public ConfigurableBooleanToColorConverter(Color trueColor, Color falseColor) 
	{
		super(Boolean.class, Color.class);
		this.falseColor = falseColor;
		this.trueColor = trueColor;
	}

	public ConfigurableBooleanToColorConverter(Object fromType, Object toType)
	{
		super(fromType, toType);
	}

	public Object convert(Object fromObject) 
	{		
		Boolean condition = (Boolean) fromObject;
		
		if(condition) return trueColor;
		else return falseColor;
	}
}
