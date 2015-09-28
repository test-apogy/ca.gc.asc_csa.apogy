package ca.gc.asc_csa.eclipse.core.databinding.converters;

import org.eclipse.core.databinding.conversion.Converter;

public class StringToBooleanConverter extends Converter {

	public StringToBooleanConverter() 
	{
		super(String.class, Boolean.class);
	}

	public StringToBooleanConverter(Object fromType, Object toType)
	{
		super(fromType, toType);
	}
	
	public Object convert(Object fromObject) {
		return new Boolean((String)fromObject);
	}
}
