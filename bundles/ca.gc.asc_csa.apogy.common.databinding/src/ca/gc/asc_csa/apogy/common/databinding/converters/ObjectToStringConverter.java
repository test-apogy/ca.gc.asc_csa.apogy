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

public class ObjectToStringConverter extends Converter 
{

	public ObjectToStringConverter()
	{
		super(Object.class, String.class);
	}
	
	/**
	 * Converter an Object to a String. The toString() method is used. 
	 * @param fromObject The object to convert. Can be null.
	 * @return The fromObject.toString() result, or null if the fromObject is null.
	 */
	public Object convert(Object fromObject) 
	{
		if(fromObject != null)
		{
			return fromObject.toString();
		}
		else
		{
			return null;
		}
	}
}
