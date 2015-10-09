package org.eclipse.symphony.common.databinding.converters;

import java.text.NumberFormat;


public class DoubleToStringConverter extends AbstractNumberConverter 
{	
	public DoubleToStringConverter()
	{
		super(Double.class, String.class);
	}
	
	public DoubleToStringConverter(NumberFormat numberFormat)
	{
		super(Double.class, String.class);
		setNumberFormat(numberFormat);
	}
	
	public Object convert(Object fromObject) 
	{
		if(getNumberFormat() != null)
		{
			Double value = (Double) fromObject;
			return getNumberFormat().format(value);
		}
		else
		{
			return fromObject.toString();
		}
	}
}
