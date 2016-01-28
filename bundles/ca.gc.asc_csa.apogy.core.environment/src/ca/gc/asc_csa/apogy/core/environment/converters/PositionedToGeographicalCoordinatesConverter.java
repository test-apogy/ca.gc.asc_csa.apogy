package ca.gc.asc_csa.apogy.core.environment.converters;

import javax.vecmath.Matrix4d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.converters.IConverter;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.core.Positioned;
import ca.gc.asc_csa.apogy.core.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite;
import ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;

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
			return worksite.convertToGeographicCoordinates(ApogyCommonMathFacade.INSTANCE.createTuple3d(position));
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
				if(session.getEnvironment() instanceof ApogyEnvironment)
				{
					ApogyEnvironment se = (ApogyEnvironment) session.getEnvironment();
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
