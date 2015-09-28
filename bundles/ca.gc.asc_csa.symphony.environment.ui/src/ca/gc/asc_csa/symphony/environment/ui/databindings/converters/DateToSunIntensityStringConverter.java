package ca.gc.asc_csa.symphony.environment.ui.databindings.converters;

import java.text.NumberFormat;
import java.util.Date;

import org.eclipse.core.databinding.conversion.Converter;

import ca.gc.asc_csa.symphony.environment.AstronomyUtils;
import ca.gc.asc_csa.symphony.environment.AtmosphereUtils;
import ca.gc.asc_csa.symphony.environment.GeographicCoordinates;
import ca.gc.asc_csa.symphony.environment.HorizontalCoordinates;

public class DateToSunIntensityStringConverter extends Converter 
{
	private NumberFormat numberFormat = null;
	private GeographicCoordinates geographicCoordinates = null;
	
	public DateToSunIntensityStringConverter()
	{
		super(Date.class, String.class);
	}
	
	public DateToSunIntensityStringConverter(NumberFormat numberFormat, GeographicCoordinates geographicCoordinates)
	{
		super(Date.class, String.class);
		setNumberFormat(numberFormat);
		setGeographicCoordinates(geographicCoordinates);		
	}
	
	public NumberFormat getNumberFormat() {
		return numberFormat;
	}

	public void setNumberFormat(NumberFormat numberFormat) {
		this.numberFormat = numberFormat;
	}

	public GeographicCoordinates getGeographicCoordinates() {
		return geographicCoordinates;
	}

	public void setGeographicCoordinates(GeographicCoordinates geographicCoordinates) {
		this.geographicCoordinates = geographicCoordinates;
	}

	@Override
	public Object convert(Object fromObject) 
	{
		Date date = (Date) fromObject;
		
		HorizontalCoordinates sunCoordinates = AstronomyUtils.INSTANCE.getHorizontalSunPosition(date, getGeographicCoordinates().getLongitude(), getGeographicCoordinates().getLatitude());
		
		Double value = AtmosphereUtils.INSTANCE.getDirectSunIntensity(sunCoordinates.getAltitude(), getGeographicCoordinates().getElevation());
					
		// Applies Number format if available
		if(getNumberFormat() != null)
		{
			return getNumberFormat().format(value);
		}
		else
		{
			return value.toString();			
		}
	}
}
