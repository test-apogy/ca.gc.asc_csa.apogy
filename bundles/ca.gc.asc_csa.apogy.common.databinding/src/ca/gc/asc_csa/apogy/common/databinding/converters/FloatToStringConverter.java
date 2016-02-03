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

import java.text.NumberFormat;

public class FloatToStringConverter extends AbstractNumberConverter 
{
	public FloatToStringConverter()
	{
		super(Float.class, String.class);
	}
	
	public FloatToStringConverter(NumberFormat numberFormat)
	{
		super(Float.class, String.class);
		setNumberFormat(numberFormat);
	}
		
	public Object convert(Object fromObject) 
	{
		if(getNumberFormat() != null)
		{
			try
			{
				Float value = (Float) fromObject;
				return getNumberFormat().format(value);
			}
			catch(Exception e)
			{
				return fromObject.toString();
			}
		}
		else
		{
			return fromObject.toString();
		}
	}
}
