package ca.gc.asc_csa.apogy.core.environment.ui.databindings.converters;

import java.text.NumberFormat;
import java.util.Date;

import org.eclipse.core.databinding.conversion.Converter;
import ca.gc.asc_csa.apogy.core.environment.AstronomyUtils;
import ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates;
import ca.gc.asc_csa.apogy.core.environment.HorizontalCoordinates;

public class DateToMoonHorizontalCoordinatesStringConverter extends Converter 
{	
	// ENUM
	public enum Coords
	{
		ALTITUDE,
		AZIMUTH
	}

	private NumberFormat numberFormat = null;
	private GeographicCoordinates geographicCoordinates = null;
	private Coords coords = Coords.ALTITUDE;
	
	public DateToMoonHorizontalCoordinatesStringConverter()
	{
		super(Date.class, String.class);
	}
	
	public DateToMoonHorizontalCoordinatesStringConverter(NumberFormat numberFormat, GeographicCoordinates geographicCoordinates, Coords coords)
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

	public Coords getCoords() {
		return coords;
	}

	public void setCoords(Coords coords) {
		this.coords = coords;
	}

	@Override
	public Object convert(Object fromObject) 
	{
		Date date = (Date) fromObject;
		HorizontalCoordinates moonCoordinates = AstronomyUtils.INSTANCE.getHorizontalMoonPosition(date, getGeographicCoordinates().getLongitude(), getGeographicCoordinates().getLatitude());
		
		Double value = new Double(0.0);
		if(getCoords() == Coords.ALTITUDE)
		{
			value = Math.toDegrees(moonCoordinates.getAltitude());
		}
		else
		{
			value = Math.toDegrees(moonCoordinates.getAzimuth());
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
