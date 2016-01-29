package ca.gc.asc_csa.apogy.common.databinding.converters;

import java.text.NumberFormat;

public class ByteToStringConverter extends AbstractNumberConverter 
{

	public ByteToStringConverter()
	{
		super(Byte.class, String.class);
	}
	
	public ByteToStringConverter(NumberFormat numberFormat)
	{
		super(Byte.class, String.class);
		setNumberFormat(numberFormat);
	}
	
	public Object convert(Object fromObject) 
	{	
		if(getNumberFormat() != null)
		{
			Byte value = (Byte) fromObject;
			return getNumberFormat().format(value);
		}
		else
		{
			return fromObject.toString();
		}
	}

}
