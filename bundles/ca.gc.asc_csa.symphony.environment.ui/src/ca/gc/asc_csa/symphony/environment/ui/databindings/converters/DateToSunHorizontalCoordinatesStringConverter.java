package ca.gc.asc_csa.symphony.environment.ui.databindings.converters;

import java.text.NumberFormat;
import java.util.Date;

import org.eclipse.core.databinding.conversion.Converter;

import ca.gc.asc_csa.symphony.environment.AstronomyUtils;
import ca.gc.asc_csa.symphony.environment.GeographicCoordinates;
import ca.gc.asc_csa.symphony.environment.HorizontalCoordinates;

public class DateToSunHorizontalCoordinatesStringConverter extends Converter 
{	
	// ENUM
	public enum COORDS
	{
		ALTITUDE, AZIMUTH
	}

	private NumberFormat numberFormat = null;
	private GeographicCoordinates geographicCoordinates = null;
	private COORDS coords = COORDS.ALTITUDE;
	
	public DateToSunHorizontalCoordinatesStringConverter()
	{
		super(Date.class, String.class);
	}
	
	public DateToSunHorizontalCoordinatesStringConverter(NumberFormat numberFormat, GeographicCoordinates geographicCoordinates, COORDS coords)
	{
		super(Date.class, String.class);
		setNumberFormat(numberFormat);
		setGeographicCoordinates(geographicCoordinates);
		setCoords(coords);
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

	public COORDS getCoords() {
		return coords;
	}

	public void setCoords(COORDS coords) {
		this.coords = coords;
	}

	@Override
	public Object convert(Object fromObject) 
	{
		Date date = (Date) fromObject;
		HorizontalCoordinates sunCoordinates = AstronomyUtils.INSTANCE.getHorizontalSunPosition(date, getGeographicCoordinates().getLongitude(), getGeographicCoordinates().getLatitude());
		
		Double value = new Double(0.0);
		if(getCoords() == COORDS.ALTITUDE)
		{
			value = Math.toDegrees(sunCoordinates.getAltitude());
		}
		else
		{
			value = Math.toDegrees(sunCoordinates.getAzimuth());
		}
		
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
