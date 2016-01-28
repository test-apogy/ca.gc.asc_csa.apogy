package org.eclipse.symphony.common.databinding.converters;

import org.eclipse.core.databinding.conversion.Converter;

public class BooleanToStringConverter extends Converter 
{
	public BooleanToStringConverter() 
	{
		super(Boolean.class, String.class);
	}

	public BooleanToStringConverter(Object fromType, Object toType)
	{
		super(fromType, toType);
	}

	public Object convert(Object fromObject) 
	{		
		return fromObject.toString();
	}
}
