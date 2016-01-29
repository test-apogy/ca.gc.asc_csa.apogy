package ca.gc.asc_csa.apogy.common.databinding.converters;

import java.text.NumberFormat;

public class LongToStringConverter extends AbstractNumberConverter {

	public LongToStringConverter()
	{
		super(Long.class, String.class);
	}
	
	public LongToStringConverter(NumberFormat numberFormat)
	{
		super(Long.class, String.class);
		setNumberFormat(numberFormat);
	}
	
	public Object convert(Object fromObject) 
	{
		if(getNumberFormat() != null)
		{
			Long value = (Long) fromObject;
			return getNumberFormat().format(value);
		}
		else
		{
			return fromObject.toString();
		}
	}

}
