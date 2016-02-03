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


public class PercentToFloatConverter extends Converter 
{
	public PercentToFloatConverter()
	{
		super(Integer.class, Float.class);
	}
	
	public Object convert(Object fromObject) 
	{
		Integer value = (Integer) fromObject;
		if(value > 100)
			value = 100;
		else if(value < 0)
			value = 0;
		return  value / 100.0f;
	}
}
