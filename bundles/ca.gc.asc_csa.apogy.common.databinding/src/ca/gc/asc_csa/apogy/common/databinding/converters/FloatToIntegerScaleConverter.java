package ca.gc.asc_csa.apogy.common.databinding.converters;

import org.eclipse.core.databinding.conversion.Converter;


public class FloatToIntegerScaleConverter extends Converter 
{
	private int minimum;
	private int maximum;
	
	public FloatToIntegerScaleConverter()
	{
		super(Float.class, Integer.class);
	}
	
	public FloatToIntegerScaleConverter(int min, int max)
	{
		super(Float.class, Integer.class);
		minimum = min;
		maximum = max;
	}
	
	public Object convert(Object fromObject) 
	{
		Float value = (Float) fromObject;
		return ((maximum - minimum) / 2) + value.intValue();
	}
}
