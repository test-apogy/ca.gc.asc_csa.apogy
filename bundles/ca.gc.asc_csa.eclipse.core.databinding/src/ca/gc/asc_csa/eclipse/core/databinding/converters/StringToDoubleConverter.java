package ca.gc.asc_csa.eclipse.core.databinding.converters;

import java.text.NumberFormat;
import java.text.ParseException;

public class StringToDoubleConverter extends AbstractNumberConverter {

	public StringToDoubleConverter() {
		super(String.class, Double.class);
	}

	public StringToDoubleConverter(NumberFormat numberFormat) 
	{
		super(String.class, Double.class);
		setNumberFormat(numberFormat);
	}
	
	public Object convert(Object fromObject) 
	{
		if(getNumberFormat() != null)
		{				
			try 
			{
				return new Double(getNumberFormat().parse( (String) fromObject).doubleValue());
			} 
			catch (ParseException e) 
			{			
				e.printStackTrace();
			}
		}
		return new Double((String)fromObject);		
	}
}
