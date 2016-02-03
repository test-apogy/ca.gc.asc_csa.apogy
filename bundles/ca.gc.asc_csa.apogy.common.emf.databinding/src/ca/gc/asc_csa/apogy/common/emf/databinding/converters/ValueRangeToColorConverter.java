package ca.gc.asc_csa.apogy.common.emf.databinding.converters;
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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.graphics.Color;
import ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIFacade;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.Ranges;


public class ValueRangeToColorConverter extends Converter 
{	
	private EStructuralFeature eStructuralFeature = null;
	
	public ValueRangeToColorConverter(EStructuralFeature eStructuralFeature) 
	{
		super(Object.class, Color.class);
		this.eStructuralFeature = eStructuralFeature;
	}
	
	public Object convert(Object fromObject) 
	{
		Ranges range = getNewValueRange(fromObject);	
		Color color = ApogyCommonEMFUIFacade.INSTANCE.getColorForRange(range);
		return color;
	}
	
	/**
	 * Return the new range associated with the value found in the notification.
	 * @param msg The notification message.
	 * @return The new Ranges.
	 */
	protected Ranges getNewValueRange(Object value)
	{
		try
		{
			return ApogyCommonEMFFacade.INSTANCE.getRange(eStructuralFeature, value);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return Ranges.UNKNOWN;
		}
	}
}
