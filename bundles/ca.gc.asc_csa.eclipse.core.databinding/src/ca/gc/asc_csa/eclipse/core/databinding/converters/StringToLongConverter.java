package ca.gc.asc_csa.eclipse.core.databinding.converters;

import java.text.NumberFormat;
import java.text.ParseException;

public class StringToLongConverter extends AbstractNumberConverter 
{
	public StringToLongConverter()
	{
		super(String.class, Long.class);
	}
	
	public StringToLongConverter(NumberFormat numberFormat)
	{
		super(String.class, Long.class);
		setNumberFormat(numberFormat);
	}
	
	public Object convert(Object fromObject) 
	{
		if(getNumberFormat() != null)
		{				
			try 
			{
				return new Long(getNumberFormat().parse( (String) fromObject).longValue());
			} 
			catch (ParseException e) 
			{			
				e.printStackTrace();
			}
		}
		return new Long((String)fromObject);		
	}

}
