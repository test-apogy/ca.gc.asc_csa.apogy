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

import ca.gc.asc_csa.apogy.core.environment.earth.GeographicCoordinates;
import ca.gc.asc_csa.apogy.core.environment.earth.HorizontalCoordinates;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.AtmosphereUtils;

public class DateToSunIntensityStringConverter extends Converter 
{
	private NumberFormat numberFormat = null;
	private GeographicCoordinates geographicCoordinates = null;
	
	public DateToSunIntensityStringConverter()
	{
		super(Date.class, String.class);
	}
	
	public DateToSunIntensityStringConverter(NumberFormat numberFormat, GeographicCoordinates geographicCoordinates)
	{
		super(Date.class, String.class);
		setNumberFormat(numberFormat);
		setGeographicCoordinates(geographicCoordinates);		
	}
	
	public NumberFormat getNumberFormat() {
		return numberFormat;
	}

	public void setNumberFormat(NumberFormat numberFormat) {
		this.numberFormat = numberFormat;
	}

	public GeographicCoordinates getGeographicCoordinates() {
		return geographicCoordinates;
	}

	public void setGeographicCoordinates(GeographicCoordinates geographicCoordinates) {
		this.geographicCoordinates = geographicCoordinates;
	}

	@Override
	public Object convert(Object fromObject) 
	{
		Date date = (Date) fromObject;
		
		HorizontalCoordinates sunCoordinates = AstronomyUtils.INSTANCE.getHorizontalSunPosition(date, getGeographicCoordinates().getLongitude(), getGeographicCoordinates().getLatitude());
		
		Double value = AtmosphereUtils.INSTANCE.getDirectSunIntensity(sunCoordinates.getAltitude(), getGeographicCoordinates().getElevation());
					
		// Applies Number format if available
		if(getNumberFormat() != null)
		{
			return getNumberFormat().format(value);
		}
		else
		{
			return value.toString();			
		}
	}
}
