package ca.gc.asc_csa.apogy.common.databinding.converters;

import org.eclipse.core.databinding.conversion.Converter;

public class BooleanToDoubleConverter extends Converter 
{
	public BooleanToDoubleConverter()
	{
		super(Boolean.class, Double.class);
	}
	
	public Object convert(Object fromObject) 
	{
		if(fromObject instanceof Boolean)
		{
			Boolean bool = (Boolean) fromObject;
			if(bool)
			{
				return new Double(1.0);
			}
			else
			{
				return new Double(0.0);
			}
		}
		else
		{
			return null;	
		}		
	}
}
