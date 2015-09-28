package ca.gc.asc_csa.eclipse.core.databinding.converters;

import org.eclipse.core.databinding.conversion.Converter;


public class FloatToIntegerConverter extends Converter 
{
	public FloatToIntegerConverter()
	{
		super(Float.class, Integer.class);
	}
	
	public Object convert(Object fromObject) 
	{
		Float value = (Float) fromObject;
		return value.intValue();
	}
}
