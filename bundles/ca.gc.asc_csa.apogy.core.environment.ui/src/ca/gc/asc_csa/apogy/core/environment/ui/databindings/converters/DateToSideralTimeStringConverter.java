package ca.gc.asc_csa.apogy.core.environment.ui.databindings.converters;

import java.util.Date;

import org.eclipse.core.databinding.conversion.Converter;
import ca.gc.asc_csa.apogy.core.environment.AstronomyUtils;

public class DateToSideralTimeStringConverter extends Converter 
{	
	private double observerLongitude = 0.0;
	
	public DateToSideralTimeStringConverter()
	{
		super(Date.class, String.class);
	}
	
	public DateToSideralTimeStringConverter(double observerLongitude)
	{
		super(Date.class, String.class);
		setObserverLongitude(observerLongitude);
	}
	
	
	public double getObserverLongitude() {
		return observerLongitude;
	}

	public void setObserverLongitude(double observerLongitude) {
		this.observerLongitude = observerLongitude;
	}

	@Override
	public Object convert(Object fromObject) 
	{
		Date date = (Date) fromObject;
		double sideralTime = AstronomyUtils.INSTANCE.getLocalSideralTime(date, getObserverLongitude());
		return AstronomyUtils.INSTANCE.convertToHHmmssString(sideralTime);
	}
		
}
