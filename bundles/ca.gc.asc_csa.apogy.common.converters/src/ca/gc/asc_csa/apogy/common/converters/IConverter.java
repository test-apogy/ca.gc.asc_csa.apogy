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

public interface IConverter
{
	/**
	 * Return the type of the conversion output.
	 * @return The type of the output.
	 */
	public Class<?> getOutputType();
	
	/**
	 * Returns the type of conversion of the input.
	 * @return The type of the input.
	 */
	public Class<?> getInputType();
	
	/**
	 * Whether or not the specified input object can be converted to the output. This method is called 
	 * prior to the convert method to avoid to go through costly conversion to find out that the conversion
	 * cannot take place. 
	 * @param input The input object.
	 * @return True if the object can be converted, false otherwise.
	 */
	public boolean canConvert(final Object input);
	
	/**
	 * Converts the input to an object of the output type.
	 * @param input The input object.
	 * @return The output of the conversion.
	 * @exception If the conversion failed.
	 */
	public Object convert(final Object input) throws Exception;	
}
