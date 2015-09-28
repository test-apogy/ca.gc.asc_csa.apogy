/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.asc_csa.symphony.environment.AtmosphereUtils;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atmosphere Utils</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AtmosphereUtilsImpl extends MinimalEObjectImpl.Container implements AtmosphereUtils
{
	public static AtmosphereUtils INSTANCE = AtmosphereUtilsImpl.getInstance(); 
	public static final double MEAN_SUN_APPARENT_ANGULAR_DIAMETER = Math.toRadians(0.5);

	
	private static AtmosphereUtils instance = null;
	public static AtmosphereUtils getInstance() {
		if (instance == null) {
			instance = new AtmosphereUtilsImpl();
		}
		return instance;
	}
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AtmosphereUtilsImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return SymphonyEnvironmentPackage.Literals.ATMOSPHERE_UTILS;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public double getAirMass(double sunAltitudeAngle)
  {
		double altitude = sunAltitudeAngle;
		
		// Clamps the sunAltitude to 0.
		if(sunAltitudeAngle >= 0.0)
		{
			double theta = Math.toRadians(90) - altitude;		
			double airMass = 1.0 / (Math.cos(theta) + 0.50572 * Math.pow(96.07995 - Math.toDegrees(theta), -1.6364));
			return airMass;
		}
		else
		{
			return Double.POSITIVE_INFINITY;
		}	
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public double getDirectSunIntensity(double sunAltitudeAngle, double heightAboveSeaLevel)
  {
		// Computes the air mass for altitude above the horizon
		double airMass = 0;
		if(sunAltitudeAngle > 0)
		{			
			airMass = getAirMass(sunAltitudeAngle);
		}
		else
		{
			airMass = getAirMass(0);
		}
				
		if(sunAltitudeAngle >= -(MEAN_SUN_APPARENT_ANGULAR_DIAMETER / 2.0))
		{			
			double heightInKm = heightAboveSeaLevel / 1000.0;
			double a = 0.14;
			
			// Use formula described in http://pvcdrom.pveducation.org/SUNLIGHT/AIRMASS.HTM.
			double directSunIntensity = 1353.0 * ( (1.0 - a * heightInKm) * Math.pow(0.7, Math.pow(airMass, 0.678)) + a * heightInKm);
			
			// If the sun is partly below the horizon.			
			if(sunAltitudeAngle <= (MEAN_SUN_APPARENT_ANGULAR_DIAMETER / 2.0))
			{
				double r = MEAN_SUN_APPARENT_ANGULAR_DIAMETER / 2.0;
				double sunDiskArea = (Math.PI * r * r);
				double visibleSunDiskArea = 0.0;
				
				// Model the sun disk being partly hidden behind the horizon.	
				double d = Math.abs(sunAltitudeAngle);
				double theta = 2 * Math.acos(d/r);
				if(sunAltitudeAngle >= 0)
				{																
					double hiddenSunDiskArea = ((r * r) / 2.0) * (theta - Math.sin(theta));
					visibleSunDiskArea = sunDiskArea - hiddenSunDiskArea;
				}
				else
				{															
					visibleSunDiskArea = ((r * r) / 2.0) * (theta - Math.sin(theta));
				}								
								
				double sunApparentFraction = visibleSunDiskArea / sunDiskArea;	
				directSunIntensity = directSunIntensity * sunApparentFraction;				
			}						
		
			return directSunIntensity;
		}
		else
		{
			return 0.0;
		}
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public double getDiffuseSunIntensity(double sunAltitudeAngle, double heightAboveSeaLevel)
  {
	  return 0.1 * getDirectSunIntensity(sunAltitudeAngle, heightAboveSeaLevel);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public double getAtmosphereRefractionCorrection(double geometricAltitude)
  {
		double atmosphereRefractionCorrection = 0.0;
		
		// 85° to 90°
		if(geometricAltitude >= Math.toRadians(85.0))
		{
			// No correction.
			atmosphereRefractionCorrection = 0.0;
		}
		// 5° to 85°
		else if( (geometricAltitude >= Math.toRadians(5.0)) && (geometricAltitude < Math.toRadians(85.0)) )
		{			
			double correctionInArcSeconds =    (58.1 / Math.tan(geometricAltitude)) - 
											   (0.07/ Math.pow(Math.tan(geometricAltitude),3)) +
											   (0.000086 / Math.pow(Math.tan(geometricAltitude),5));			
			atmosphereRefractionCorrection = Math.toRadians((correctionInArcSeconds / 3600.0));
		}
		// -0.575° to 5°
		else if((geometricAltitude >= Math.toRadians(-0.575)) && (geometricAltitude < Math.toRadians(5.0)))
		{
			double elevationInDegrees = Math.toDegrees(geometricAltitude);
			double correctionInArcSeconds = (1735 -
					 						 518.2 * elevationInDegrees +
					 						 103.4 * Math.pow(elevationInDegrees, 2) -
					 						 12.79 * Math.pow(elevationInDegrees, 3) +
					 						 0.711 * Math.pow(elevationInDegrees, 4));						
			
			atmosphereRefractionCorrection = Math.toRadians((correctionInArcSeconds / 3600.0));
		}
		// < -0.575°
		else 
		{
			double correctionInArcSeconds = (-20.774 / Math.tan(geometricAltitude));
			atmosphereRefractionCorrection = Math.toRadians((correctionInArcSeconds / 3600.0));
		}
		
		return atmosphereRefractionCorrection;
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case SymphonyEnvironmentPackage.ATMOSPHERE_UTILS___GET_AIR_MASS__DOUBLE:
				return getAirMass((Double)arguments.get(0));
			case SymphonyEnvironmentPackage.ATMOSPHERE_UTILS___GET_DIRECT_SUN_INTENSITY__DOUBLE_DOUBLE:
				return getDirectSunIntensity((Double)arguments.get(0), (Double)arguments.get(1));
			case SymphonyEnvironmentPackage.ATMOSPHERE_UTILS___GET_DIFFUSE_SUN_INTENSITY__DOUBLE_DOUBLE:
				return getDiffuseSunIntensity((Double)arguments.get(0), (Double)arguments.get(1));
			case SymphonyEnvironmentPackage.ATMOSPHERE_UTILS___GET_ATMOSPHERE_REFRACTION_CORRECTION__DOUBLE:
				return getAtmosphereRefractionCorrection((Double)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AtmosphereUtilsImpl
