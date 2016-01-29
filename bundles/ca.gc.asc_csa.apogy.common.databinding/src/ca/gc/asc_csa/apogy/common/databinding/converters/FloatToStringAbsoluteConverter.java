package ca.gc.asc_csa.apogy.common.databinding.converters;

import java.text.NumberFormat;

public class FloatToStringAbsoluteConverter extends AbstractNumberConverter 
{
	public FloatToStringAbsoluteConverter()
	{
		super(Float.class, String.class);
	}
	
	public FloatToStringAbsoluteConverter(NumberFormat numberFormat)
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
				Float value = (Float) Math.abs((Float) fromObject);
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
