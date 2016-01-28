package org.eclipse.symphony.core.environment.converters;

import javax.vecmath.Matrix4d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.converters.IConverter;
import org.eclipse.symphony.common.math.Symphony__CommonMathFacade;
import org.eclipse.symphony.core.Positioned;
import org.eclipse.symphony.core.SymphonyEnvironment;
import org.eclipse.symphony.core.environment.EarthSurfaceWorksite;
import org.eclipse.symphony.core.environment.GeographicCoordinates;
import org.eclipse.symphony.core.invocator.InvocatorSession;

public class PositionedToGeographicalCoordinatesConverter implements IConverter{

	@Override
	public Class<?> getOutputType() 
	{	
		return GeographicCoordinates.class;
	}

	@Override
	public Class<?> getInputType() 
	{		
		return Positioned.class;
	}

	@Override
	public boolean canConvert(Object input) 
	{
		if(input instanceof Positioned)
		{
			Positioned positioned = (Positioned) input;
			
			if(positioned.getPose() != null)
			{
				EarthSurfaceWorksite worksite = getEarthSurfaceWorksite(positioned);
				if(worksite != null)
				{
					return true;
				}
			}
		}
		
		return false;
	}

	@Override
	public Object convert(Object input) throws Exception 
	{
		if(canConvert(input))
		{
			Positioned positioned = (Positioned) input;
			Matrix4d matrix = positioned.getPose().asMatrix4d();
			Vector3d position = new Vector3d();
			matrix.get(position);
						
			EarthSurfaceWorksite worksite = getEarthSurfaceWorksite(positioned);						
			return worksite.convertToGeographicCoordinates(Symphony__CommonMathFacade.INSTANCE.createTuple3d(position));
		}
		else
		{
			return null;
		}
	}

	protected EarthSurfaceWorksite getEarthSurfaceWorksite(Positioned positioned)
	{
		EarthSurfaceWorksite earthSurfaceWorksite = null;
		EObject container = positioned.eContainer();
		
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
