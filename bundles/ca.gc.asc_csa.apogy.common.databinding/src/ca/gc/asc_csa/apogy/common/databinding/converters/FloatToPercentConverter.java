package ca.gc.asc_csa.apogy.common.databinding.converters;

import org.eclipse.core.databinding.conversion.Converter;


public class FloatToPercentConverter extends Converter 
{
	public FloatToPercentConverter()
	{
		super(Float.class, Integer.class);
	}
	
	public Object convert(Object fromObject) 
	{
		Float value = (Float) fromObject;
		if(value > 1)
			value = 1f;
		else if(value < 0)
			value = 0f;
		return Math.round(value * 100.0f);
	}
}
