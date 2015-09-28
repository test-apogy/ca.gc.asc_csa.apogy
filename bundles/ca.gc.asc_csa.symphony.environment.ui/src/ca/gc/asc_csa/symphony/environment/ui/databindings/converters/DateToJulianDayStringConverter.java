package ca.gc.asc_csa.symphony.environment.ui.databindings.converters;

import java.text.NumberFormat;
import java.util.Date;

import org.eclipse.core.databinding.conversion.Converter;

import ca.gc.asc_csa.symphony.environment.EnvironmentUtilities;

public class DateToJulianDayStringConverter extends Converter 
{
	private NumberFormat numberFormat = null;
	
	public DateToJulianDayStringConverter()
	{
		super(Date.class, String.class);
	}
	
	public DateToJulianDayStringConverter(NumberFormat numberFormat)
	{
		super(Date.class, String.class);
		setNumberFormat(numberFormat);
	}
	

	public NumberFormat getNumberFormat() {
		return numberFormat;
	}

	public void setNumberFormat(NumberFormat numberFormat) {
		this.numberFormat = numberFormat;
	}
	
	@Override
	public Object convert(Object fromObject) 
	{
		if(getNumberFormat() != null)
		{
			Date date = (Date) fromObject;
			Double julianDate = EnvironmentUtilities.INSTANCE.convertToJulianDate(date);					
			return getNumberFormat().format(julianDate);
		}
		else
		{
			return fromObject.toString();
		}		
	}
		
}
