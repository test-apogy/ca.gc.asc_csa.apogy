package org.eclipse.symphony.common.databinding.converters;

import org.eclipse.core.databinding.conversion.Converter;

public class ConfigurableBooleanToStringConverter extends Converter 
{
	private String falseString = "FALSE";
	private String trueString = "TRUE";
	
	/**
	 * Creates a ConfigurableBooleanToStringConverter with true and false strings.
	 * @param trueString The string to display when the condition is true.
	 * @param falseString The string to display when the condition is false.	 
	 */
	public ConfigurableBooleanToStringConverter(String trueString, String falseString) 
	{
		super(Boolean.class, String.class);
		this.falseString = falseString;
		this.trueString = trueString;
	}

	public ConfigurableBooleanToStringConverter(Object fromType, Object toType)
	{
		super(fromType, toType);
	}

	public Object convert(Object fromObject) 
	{		
		Boolean condition = (Boolean) fromObject;
		
		if(condition) return trueString;
		else return falseString;
	}
}
