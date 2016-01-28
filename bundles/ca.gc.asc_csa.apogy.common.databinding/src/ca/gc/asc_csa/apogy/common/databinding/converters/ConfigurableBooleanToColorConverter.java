package org.eclipse.symphony.common.databinding.converters;

import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.swt.graphics.Color;

public class ConfigurableBooleanToColorConverter extends Converter 
{
	private Color falseColor = null;
	private Color trueColor = null;
	
	/**
	 * Creates a ConfigurableBooleanToColorConverter with true and false Colors.
	 * @param trueString The Color to display when the condition is true.
	 * @param falseString The Color to display when the condition is false.	 
	 */
	public ConfigurableBooleanToColorConverter(Color trueColor, Color falseColor) 
	{
		super(Boolean.class, Color.class);
		this.falseColor = falseColor;
		this.trueColor = trueColor;
	}

	public ConfigurableBooleanToColorConverter(Object fromType, Object toType)
	{
		super(fromType, toType);
	}

	public Object convert(Object fromObject) 
	{		
		Boolean condition = (Boolean) fromObject;
		
		if(condition) return trueColor;
		else return falseColor;
	}
}
