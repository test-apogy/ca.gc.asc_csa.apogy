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

import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.core.databinding.conversion.Converter;

public class DateToStringConverter extends Converter  {
	private SimpleDateFormat sdf;
	
	public DateToStringConverter() {
		super(Date.class,String.class);
		sdf = null;
	}
	
	public DateToStringConverter(SimpleDateFormat sdf) {
		super(Date.class,String.class);
		this.sdf = sdf;
	}

	public Object convert(Object fromObject) {
		Date date = (Date) fromObject;
		if(sdf == null)
			return date.toString();
		else
			return sdf.format(date);
	}
	

}
