package ca.gc.asc_csa.apogy.common.databinding.converters;

import java.text.NumberFormat;
import java.text.ParseException;

public class StringToShortConverter extends AbstractNumberConverter 
{
	public StringToShortConverter()
	{
		super(String.class, Short.class);
	}

	public StringToShortConverter(NumberFormat numberFormat)
	{
		super(String.class, Short.class);
		setNumberFormat(numberFormat);
	}
	
	public Object convert(Object fromObject) 
	{
		if(getNumberFormat() != null)
		{				
			try 
			{
				return new Short(getNumberFormat().parse( (String) fromObject).shortValue());
			} 
			catch (ParseException e) 
			{			
				e.printStackTrace();
			}
		}
		return new Short((String)fromObject);
	}

}
