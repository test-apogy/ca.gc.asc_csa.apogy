package ca.gc.asc_csa.apogy.common.images.ui.expressions;
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

import java.util.List;

import org.eclipse.core.expressions.PropertyTester;
import ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersFacade;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;

public class ImagePropertyTester extends PropertyTester
{
	public static final String PROPERTY_NAMESPACE = "ca.gc.asc_csa.apogy.common.images.ui.expressions.ImagePropertyTester";
	public static final String PROPERTY_CAN_CONVERT_TO_ABSTRACT_EIMAGE = "canConvertToAbstractEImage";
	
	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue)
	{	
		boolean result = false;
		
		if (PROPERTY_CAN_CONVERT_TO_ABSTRACT_EIMAGE.equals(property))
		{
			if (receiver instanceof List<?>)
			{
				List<?> list = (List<?>) receiver;
				
				if (!list.isEmpty())
				{
					result = (ApogyCommonConvertersFacade.INSTANCE.convert(list.get(0), AbstractEImage.class) != null);		
				}
			}
		}
		
		return result;
	}
}