package org.eclipse.symphony.common.databinding.converters;

import java.text.NumberFormat;

public class ShortToStringConverter extends AbstractNumberConverter 
{

	public ShortToStringConverter() 
	{
		super(Short.class, String.class);
	}
	
	public ShortToStringConverter(NumberFormat numberFormat) 
	{
		super(Short.class, String.class);
		setNumberFormat(numberFormat);
	}
	
	public Object convert(Object fromObject) 
	{
		if(getNumberFormat() != null)
		{
			Short value = (Short) fromObject;
			return getNumberFormat().format(value);
		}
		else
		{
			return fromObject.toString();
		}
	}

}
