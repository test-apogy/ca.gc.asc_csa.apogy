package org.eclipse.symphony.common.databinding.converters;

import java.text.NumberFormat;

public class FloatToStringConverter extends AbstractNumberConverter 
{
	public FloatToStringConverter()
	{
		super(Float.class, String.class);
	}
	
	public FloatToStringConverter(NumberFormat numberFormat)
	{
		super(Float.class, String.class);
		setNumberFormat(numberFormat);
	}
		
	public Object convert(Object fromObject) 
	{
		if(getNumberFormat() != null)
		{
			try
			{
				Float value = (Float) fromObject;
				return getNumberFormat().format(value);
			}
			catch(Exception e)
			{
				return fromObject.toString();
			}
		}
		else
		{
			return fromObject.toString();
		}
	}
}
