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


public class DoubleToIntegerScaleConverter extends Converter 
{
	private int minimum;
	private int maximum;
	
	public DoubleToIntegerScaleConverter()
	{
		super(Double.class, Integer.class);
	}
	
	public DoubleToIntegerScaleConverter(int min, int max)
	{
		super(Double.class, Integer.class);
		minimum = min;
		maximum = max;
	}
	
	public Object convert(Object fromObject) 
	{
		Double value = (Double) fromObject;
		return ((maximum - minimum) / 2) + value.intValue();
	}
}
