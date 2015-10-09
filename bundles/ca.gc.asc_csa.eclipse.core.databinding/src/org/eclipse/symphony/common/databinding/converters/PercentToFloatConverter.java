package org.eclipse.symphony.common.databinding.converters;

import org.eclipse.core.databinding.conversion.Converter;


public class PercentToFloatConverter extends Converter 
{
	public PercentToFloatConverter()
	{
		super(Integer.class, Float.class);
	}
	
	public Object convert(Object fromObject) 
	{
		Integer value = (Integer) fromObject;
		if(value > 100)
			value = 100;
		else if(value < 0)
			value = 0;
		return  value / 100.0f;
	}
}
