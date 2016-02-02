package ca.gc.asc_csa.apogy.core.environment.ui.databindings.converters;
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

import ca.gc.asc_csa.apogy.common.databinding.converters.StringToDoubleConverter;

public class DegreeStringToRadiansConverter extends StringToDoubleConverter 
{
	public DegreeStringToRadiansConverter()
	{
		super();
	}
	
	@Override
	public Object convert(Object fromObject) 
	{
		double degreesValue = Double.parseDouble((String) fromObject);
		return new Double(Math.toRadians(degreesValue));
	}
}
