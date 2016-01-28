package ca.gc.asc_csa.apogy.common.databinding.converters;

import java.text.NumberFormat;

import org.eclipse.core.databinding.conversion.Converter;

public abstract class AbstractNumberConverter extends Converter 
{	
	private NumberFormat numberFormat = null;
	
	public AbstractNumberConverter() 
	{
		super(Number.class, String.class);
	}

	public AbstractNumberConverter(Object fromType, Object toType)
	{
		super(fromType, toType);
	}
	
	public NumberFormat getNumberFormat() {
		return numberFormat;
	}

	public void setNumberFormat(NumberFormat numberFormat) {
		this.numberFormat = numberFormat;
	}
}
