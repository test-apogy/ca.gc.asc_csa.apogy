package ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.databindings;
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
import java.util.Date;

import org.eclipse.core.databinding.conversion.Converter;

import ca.gc.asc_csa.apogy.core.environment.EnvironmentUtilities;

public class DateToJulianDayStringConverter extends Converter 
{
	private NumberFormat numberFormat = null;
	
	public DateToJulianDayStringConverter()
	{
		super(Date.class, String.class);
	}
	
	public DateToJulianDayStringConverter(NumberFormat numberFormat)
	{
		super(Date.class, String.class);
		setNumberFormat(numberFormat);
	}
	

	public NumberFormat getNumberFormat() {
		return numberFormat;
	}

	public void setNumberFormat(NumberFormat numberFormat) {
		this.numberFormat = numberFormat;
	}
	
	@Override
	public Object convert(Object fromObject) 
	{
		if(getNumberFormat() != null)
		{
			Date date = (Date) fromObject;
			Double julianDate = EnvironmentUtilities.INSTANCE.convertToJulianDate(date);					
			return getNumberFormat().format(julianDate);
		}
		else
		{
			return fromObject.toString();
		}		
	}
		
}
