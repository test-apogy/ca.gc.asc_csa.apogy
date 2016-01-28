package ca.gc.asc_csa.apogy.common.databinding.converters;

import java.text.NumberFormat;
import java.text.ParseException;

public class StringToFloatConverter extends AbstractNumberConverter {

	public StringToFloatConverter()
	{
		super(String.class, Float.class);
	}
	
	public StringToFloatConverter(NumberFormat numberFormat)
	{
		super(String.class, Float.class);
		setNumberFormat(numberFormat);
	}
	
	public Object convert(Object fromObject) 
	{
		if(getNumberFormat() != null)
		{				
			try 
			{
				return new Float(getNumberFormat().parse( (String) fromObject).floatValue());
			} 
			catch (ParseException e) 
			{			
				e.printStackTrace();
			}
		}
		return new Float((String)fromObject);	
	}

}
