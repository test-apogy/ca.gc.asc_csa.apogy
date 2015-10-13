package org.eclipse.symphony.core.environment.ui.databindings.converters;

import org.eclipse.symphony.common.databinding.converters.StringToDoubleConverter;

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
