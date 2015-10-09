package org.eclipse.symphony.common.databinding.converters;

import org.eclipse.core.databinding.conversion.Converter;

public class NumberToDoubleConverter extends Converter 
{
	public NumberToDoubleConverter()
	{
		super(Number.class, Double.class);
	}
	
	public Object convert(Object fromObject) 
	{
		if(fromObject instanceof Number)
		{
			return new Double(((Number) fromObject).doubleValue());
		}
		else
		{
			return null;	
		}		
	}
}
