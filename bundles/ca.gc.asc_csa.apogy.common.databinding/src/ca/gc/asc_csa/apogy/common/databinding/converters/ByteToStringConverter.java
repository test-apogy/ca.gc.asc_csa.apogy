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

public class ByteToStringConverter extends AbstractNumberConverter 
{

	public ByteToStringConverter()
	{
		super(Byte.class, String.class);
	}
	
	public ByteToStringConverter(NumberFormat numberFormat)
	{
		super(Byte.class, String.class);
		setNumberFormat(numberFormat);
	}
	
	public Object convert(Object fromObject) 
	{	
		if(getNumberFormat() != null)
		{
			Byte value = (Byte) fromObject;
			return getNumberFormat().format(value);
		}
		else
		{
			return fromObject.toString();
		}
	}

}
