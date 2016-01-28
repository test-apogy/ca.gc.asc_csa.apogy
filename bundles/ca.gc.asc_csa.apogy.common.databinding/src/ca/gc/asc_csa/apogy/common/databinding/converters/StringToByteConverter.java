package ca.gc.asc_csa.apogy.common.databinding.converters;

import java.text.NumberFormat;
import java.text.ParseException;

public class StringToByteConverter extends AbstractNumberConverter 
{
	public StringToByteConverter()
	{
		super(String.class, Byte.class);
	}

	public StringToByteConverter(NumberFormat numberFormat)
	{
		super(String.class, Byte.class);
		setNumberFormat(numberFormat);
	}
	
	public Object convert(Object fromObject) 
	{
		if(getNumberFormat() != null)
		{				
			try 
			{
				return new Byte(getNumberFormat().parse( (String) fromObject).byteValue());
			} 
			catch (ParseException e) 
			{			
				e.printStackTrace();
			}
		}
		return new Byte((String)fromObject);
	}

}
