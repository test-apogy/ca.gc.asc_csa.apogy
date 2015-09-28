package ca.gc.asc_csa.eclipse.core.databinding.converters;

import java.text.NumberFormat;
import java.text.ParseException;

public class StringToIntegerConverter extends AbstractNumberConverter {

	public StringToIntegerConverter() {
		super(String.class, Integer.class);
	}

	public StringToIntegerConverter(NumberFormat numberFormat) {
		super(String.class, Integer.class);
		setNumberFormat(numberFormat);
	}
	
	public Object convert(Object fromObject) 
	{
		if(getNumberFormat() != null)
		{				
			try 
			{
				return new Integer(getNumberFormat().parse( (String) fromObject).intValue());
			} 
			catch (ParseException e) 
			{			
				e.printStackTrace();
			}
		}
		return new Integer((String)fromObject);	
	}
}
