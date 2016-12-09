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

import java.util.Date;

import org.eclipse.core.databinding.conversion.Converter;

import ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils;

public class DateToSideralTimeStringConverter extends Converter 
{	
	private double observerLongitude = 0.0;
	
	public DateToSideralTimeStringConverter()
	{
		super(Date.class, String.class);
	}
	
	public DateToSideralTimeStringConverter(double observerLongitude)
	{
		super(Date.class, String.class);
		setObserverLongitude(observerLongitude);
	}
	
	
	public double getObserverLongitude() {
		return observerLongitude;
	}

	public void setObserverLongitude(double observerLongitude) {
		this.observerLongitude = observerLongitude;
	}

	@Override
	public Object convert(Object fromObject) 
	{
		Date date = (Date) fromObject;
		double sideralTime = AstronomyUtils.INSTANCE.getLocalSideralTime(date, getObserverLongitude());
		return AstronomyUtils.INSTANCE.convertToHHmmssString(sideralTime);
	}
		
}
