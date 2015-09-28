package ca.gc.asc_csa.symphony.environment.ui.databindings.converters;

import ca.gc.asc_csa.eclipse.core.databinding.converters.StringToDoubleConverter;

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
