package ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.databindings;

import org.eclipse.core.databinding.conversion.Converter;

public class NumberToDoubleConverter extends Converter 
{
	public NumberToDoubleConverter()
	{
		super(Number.class, Double.class);
	}
	
	public Object convert(Object fromObject) 
	{
		if(fromObject instanceof Number)
		{
			return new Double(((Number) fromObject).doubleValue());
		}
		else
		{
			return null;	
		}		
	}
}
