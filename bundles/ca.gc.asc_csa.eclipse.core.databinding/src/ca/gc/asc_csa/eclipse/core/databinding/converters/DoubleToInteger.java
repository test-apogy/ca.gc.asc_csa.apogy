package ca.gc.asc_csa.eclipse.core.databinding.converters;

import org.eclipse.core.databinding.conversion.Converter;


public class DoubleToInteger extends Converter 
{	
	public DoubleToInteger()
	{
		super(Double.class, Integer.class);
	}

	
	public Object convert(Object fromObject) 
	{
		Double value = (Double) fromObject;
		int i = (int) Math.round(value);
		return  new Integer(i);
	}
}
