package org.eclipse.symphony.core.environment.converters;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.converters.IConverter;
import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.core.SymphonyEnvironment;
import org.eclipse.symphony.core.environment.EarthSurfaceWorksite;
import org.eclipse.symphony.core.environment.GeographicCoordinates;
import org.eclipse.symphony.core.invocator.InvocatorSession;

public class GeographicalCoordinatesToPositionConverter implements IConverter{

	@Override
	public Class<?> getOutputType() 
	{	
		return Tuple3d.class;
	}

	@Override
	public Class<?> getInputType() 
	{		
		return GeographicCoordinates.class;
	}

	@Override
	public boolean canConvert(Object input) 
	{
		if(input instanceof GeographicCoordinates)
		{
			GeographicCoordinates coordinates = (GeographicCoordinates) input;
			
			EarthSurfaceWorksite worksite = getEarthSurfaceWorksite(coordinates);
			if(worksite != null)
			{
				return true;
			}		
		}
		
		return false;
	}

	@Override
	public Object convert(Object input) throws Exception 
	{
		if(canConvert(input))
		{
			GeographicCoordinates coordinates = (GeographicCoordinates) input;								
			EarthSurfaceWorksite worksite = getEarthSurfaceWorksite(coordinates);						
			return worksite.convertToXYZPosition(coordinates);
		}
		else
		{
			return null;
		}
	}

	protected EarthSurfaceWorksite getEarthSurfaceWorksite(GeographicCoordinates coordinates)
	{
		EarthSurfaceWorksite earthSurfaceWorksite = null;
		EObject container = coordinates.eContainer();
		
		while(earthSurfaceWorksite == null && container != null)
		{
			if(container instanceof EarthSurfaceWorksite)
			{
				earthSurfaceWorksite = (EarthSurfaceWorksite) container;
			}
			else if(container instanceof InvocatorSession)
			{
				InvocatorSession session = (InvocatorSession) container;
				if(session.getEnvironment() instanceof SymphonyEnvironment)
				{
					SymphonyEnvironment se = (SymphonyEnvironment) session.getEnvironment();
					if(se.getActiveWorksite() instanceof EarthSurfaceWorksite)
					{
						earthSurfaceWorksite = (EarthSurfaceWorksite) se.getActiveWorksite();
					}
				}
			}
			else
			{
				container = container.eContainer();
			}
		}
		
		return earthSurfaceWorksite;				
	}
}
