package ca.gc.asc_csa.apogy.common.databinding.converters;

import org.eclipse.core.databinding.conversion.Converter;


public class FloatToIntegerAbsoluteConverter extends Converter 
{
	
	public FloatToIntegerAbsoluteConverter()
	{
		super(Float.class, Integer.class);
	}
	
	public Object convert(Object fromObject) 
	{
		Float value = (Float) fromObject;
		return (int) Math.abs(value);
	}
}
