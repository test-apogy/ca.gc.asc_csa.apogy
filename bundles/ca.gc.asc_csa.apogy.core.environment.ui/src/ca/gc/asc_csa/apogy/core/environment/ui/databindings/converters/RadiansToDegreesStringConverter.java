package ca.gc.asc_csa.apogy.core.environment.ui.databindings.converters;

import java.text.NumberFormat;

import ca.gc.asc_csa.apogy.common.databinding.converters.DoubleToStringConverter;

public class RadiansToDegreesStringConverter extends DoubleToStringConverter 
{
	public RadiansToDegreesStringConverter(NumberFormat numberFormat)
	{
		super(numberFormat);
	}
	
	@Override
	public Object convert(Object fromObject) 
	{
		if(getNumberFormat() != null)
		{
			Double value = (Double) fromObject;
			Double degreesValue = Math.toDegrees(value);
			return getNumberFormat().format(degreesValue);
		}
		else
		{
			return fromObject.toString();
		}
	}
}
