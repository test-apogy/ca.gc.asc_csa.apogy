package ca.gc.asc_csa.apogy.common.databinding.converters;

import org.eclipse.core.databinding.conversion.Converter;


public class DoubleToIntegerScaleConverter extends Converter 
{
	private int minimum;
	private int maximum;
	
	public DoubleToIntegerScaleConverter()
	{
		super(Double.class, Integer.class);
	}
	
	public DoubleToIntegerScaleConverter(int min, int max)
	{
		super(Double.class, Integer.class);
		minimum = min;
		maximum = max;
	}
	
	public Object convert(Object fromObject) 
	{
		Double value = (Double) fromObject;
		return ((maximum - minimum) / 2) + value.intValue();
	}
}
