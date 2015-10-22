/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.impl;

import java.util.Date;

import javax.vecmath.Matrix3d;
import javax.vecmath.Point3d;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.topology.TransformNode;
import org.eclipse.symphony.core.environment.AstronomyUtils;
import org.eclipse.symphony.core.environment.EarthSky;
import org.eclipse.symphony.core.environment.EarthSkyNode;
import org.eclipse.symphony.core.environment.EarthSurfaceWorksite;
import org.eclipse.symphony.core.environment.HorizontalCoordinates;
import org.eclipse.symphony.core.environment.Moon;
import org.eclipse.symphony.core.environment.Sky;
import org.eclipse.symphony.core.environment.StarField;
import org.eclipse.symphony.core.environment.Sun;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Earth Sky Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EarthSkyNodeImpl extends SkyNodeImpl implements EarthSkyNode
{
	private Adapter earthSkyAdapter = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EarthSkyNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyEnvironmentPackage.Literals.EARTH_SKY_NODE;
	}

	@Override
	public void setSky(Sky newSky) 
	{
		// Unregister from previous Sky if applicable.
		if(getSky() != null) getSky().eAdapters().remove(getEarthSkyAdapter());
		
		// Register to new Sky if applicable.
		if(newSky != null) newSky.eAdapters().add(getEarthSkyAdapter());
		
		// Updates sky.
		super.setSky(newSky);
	}
	
	
	public Adapter getEarthSkyAdapter() 
	{
		if(earthSkyAdapter == null)
		{
			earthSkyAdapter = new AdapterImpl()
			{
				public void notifyChanged(Notification msg) 
				{
					//System.out.println("EarthSkyNode " + msg);
					
					// Process events from the EarthSky
					if(msg.getNotifier() instanceof EarthSky)
					{
						EarthSky earthSky = (EarthSky) msg.getNotifier();
						
						if(msg.getFeatureID(EarthSky.class) == SymphonyEnvironmentPackage.EARTH_SKY__SUN_HORIZONTAL_COORDINATES)
						{				
							//System.out.println("Sun has moved ! ");
							
							// Sun has moved, update the Sun transform
							HorizontalCoordinates sunHorizontalCoordinates = (HorizontalCoordinates) msg.getNewValue();
														
							Sun sun = earthSky.getSun();
																										
							Point3d sunPosition = AstronomyUtils.INSTANCE.convertFromHorizontalCoordinatesToHorizontalRectangular(sunHorizontalCoordinates);				
							
							// Updates the Sun TransformNode
							if(sun != null) 
							{
								TransformNode sunTransformNode = (TransformNode) sun.getParent();										
								sunTransformNode.setPosition(MathFacade.INSTANCE.createTuple3d(sunPosition));
							}
						}
						else if(msg.getFeatureID(EarthSky.class) == SymphonyEnvironmentPackage.EARTH_SKY__MOON_HORIZONTAL_COORDINATES)
						{
							//System.out.println("Moon has moved ! ");
							
							// Moon has moved, updates the Moon transform
							HorizontalCoordinates moonHorizontalCoordinates = (HorizontalCoordinates) msg.getNewValue();
							
							Moon moon = earthSky.getMoon();
							
							Point3d moonPosition = AstronomyUtils.INSTANCE.convertFromHorizontalCoordinatesToHorizontalRectangular(moonHorizontalCoordinates);
							
							
							// Updates the Moon TransformNode.	
							if(moon != null) 
							{
								TransformNode moonTransformNode = (TransformNode) moon.getParent();								
								moonTransformNode.setPosition(MathFacade.INSTANCE.createTuple3d(moonPosition));
							}							
						}
						else if(msg.getFeatureID(EarthSky.class) == SymphonyEnvironmentPackage.SKY__TIME)
						{
							//System.out.println("Time has changed ! ");
							
							// Time has changed, update the Star position.
							Date newTime = (Date) msg.getNewValue();
							
							StarField starField = earthSky.getStarField();
							
							// Computes the new star field rotation matrix.		
							EarthSurfaceWorksite worksite = (EarthSurfaceWorksite) earthSky.getSurfaceWorksite();
							Matrix3d m = updateStarsRotationMatrix(worksite, newTime.getTime());
										
							// Updates the StarField TransformNode.
							if(starField != null) 
							{
								TransformNode starFieldTransformNode = (TransformNode) starField.getParent();																
								starFieldTransformNode.setRotationMatrix(MathFacade.INSTANCE.createMatrix3x3( m));			
							}
						}
					}
				}
			};
		}
		return earthSkyAdapter;
	}

	private Matrix3d updateStarsRotationMatrix(EarthSurfaceWorksite worksite, long newTime)
	{
		Date date = new Date(newTime);
		double observerLongitude = 0.0d;
		double observerLatitude  = 0.0d;
						
		if(worksite.getGeographicalCoordinates() != null)
		{
			observerLongitude = worksite.getGeographicalCoordinates().getLongitude();
			observerLatitude = worksite.getGeographicalCoordinates().getLatitude();
		}
		// Computes the rotation matrix that represents the rotation axis of the earth
		// in the local horizontal frame.
		Matrix3d earthRotationAxisMatrix = new Matrix3d();
		earthRotationAxisMatrix.rotY(Math.toRadians(90) - observerLatitude);
				
		// Computes the rotation matrix that take into account the rotation of the earth at the specified time 
		double localSideralTime = AstronomyUtils.INSTANCE.getLocalSideralTime(date, observerLongitude);								
		Matrix3d earthRotationMatrix = new Matrix3d();
		earthRotationMatrix.rotZ(-localSideralTime + Math.toRadians(180));

		// Multiply both matrix together.
		Matrix3d m = new Matrix3d();
		m.mul(earthRotationAxisMatrix, earthRotationMatrix);
		
		return m;
	}		
} //EarthSkyNodeImpl
