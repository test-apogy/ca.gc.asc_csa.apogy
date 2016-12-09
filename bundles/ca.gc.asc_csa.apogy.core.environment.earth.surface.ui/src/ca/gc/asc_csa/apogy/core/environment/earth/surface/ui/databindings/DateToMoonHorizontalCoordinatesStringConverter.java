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

public class DateToMoonHorizontalCoordinatesStringConverter extends Converter 
{	
	// ENUM
	public enum Coords
	{
		ALTITUDE,
		AZIMUTH
	}

	private NumberFormat numberFormat = null;
	private GeographicCoordinates geographicCoordinates = null;
	private Coords coords = Coords.ALTITUDE;
	
	public DateToMoonHorizontalCoordinatesStringConverter()
	{
		super(Date.class, String.class);
	}
	
	public DateToMoonHorizontalCoordinatesStringConverter(NumberFormat numberFormat, GeographicCoordinates geographicCoordinates, Coords coords)
	{
		super(Date.class, String.class);
		setNumberFormat(numberFormat);
		setGeographicCoordinates(geographicCoordinates);
		setCoords(coords);
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

	public Coords getCoords() {
		return coords;
	}

	public void setCoords(Coords coords) {
		this.coords = coords;
	}

	@Override
	public Object convert(Object fromObject) 
	{
		Date date = (Date) fromObject;
		HorizontalCoordinates moonCoordinates = AstronomyUtils.INSTANCE.getHorizontalMoonPosition(date, getGeographicCoordinates().getLongitude(), getGeographicCoordinates().getLatitude());
		
		Double value = new Double(0.0);
		if(getCoords() == Coords.ALTITUDE)
		{
			value = Math.toDegrees(moonCoordinates.getAltitude());
		}
		else
		{
			value = Math.toDegrees(moonCoordinates.getAzimuth());
		}
		
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
