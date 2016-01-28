package ca.gc.asc_csa.apogy.common.databinding.converters;

import org.eclipse.core.databinding.conversion.Converter;


public class DoubleToStringInteger extends Converter 
{	
	public DoubleToStringInteger()
	{
		super(Double.class, Integer.class);
	}

	
	public Object convert(Object fromObject) 
	{
		return  ((Double) fromObject).intValue();
	}
}
