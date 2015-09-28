package ca.gc.asc_csa.eclipse.core.databinding.converters;

import java.text.NumberFormat;

public class IntegerToStringConverter extends AbstractNumberConverter  {
	
	public IntegerToStringConverter() 
	{
		super(Integer.class, String.class);
	}

	public IntegerToStringConverter(NumberFormat numberFormat)
	{
		super(Integer.class, String.class);
		setNumberFormat(numberFormat);
	}
	
	public Object convert(Object fromObject) 
	{
		if(getNumberFormat() != null)
		{
			Integer value = (Integer) fromObject;
			return getNumberFormat().format(value);
		}
		else
		{
			return fromObject.toString();
		}
	}
}
