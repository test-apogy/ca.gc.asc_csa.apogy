/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.core.environment.impl.AtmosphereUtilsImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atmosphere Utils</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getAtmosphereUtils()
 * @model
 * @generated
 */
public interface AtmosphereUtils extends EObject
{
	
	public static AtmosphereUtils INSTANCE = AtmosphereUtilsImpl.getInstance(); 

	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Computes the air mass. The Air Mass is the path length which light
	 * takes through the atmosphere normalized to the shortest possible path
	 * length (that is, when the sun is directly overhead). The Air Mass
	 * quantifies the reduction in the power of light as it passes through
	 * the atmosphere and is absorbed by air and dust.
	 * @param sunAltitudeAngle The sun elevation angle above the horizon, in radians.
	 * @see http://pvcdrom.pveducation.org/SUNLIGHT/AIRMASS.HTM.
	 * <!-- end-model-doc -->
	 * @model unique="false" sunAltitudeAngleUnique="false"
	 *        sunAltitudeAngleAnnotation="http://www.eclipse.org/emf/2002/GenModel symphony_units='rad'"
	 * @generated
	 */
  double getAirMass(double sunAltitudeAngle);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Computes the intensity of the direct component of sunlight, in Watts/m^2.
	 * @param sunAltitudeAngle The sun elevation angle above the horizon, in radians.
	 * @param heightAboveSeaLevel Height above sea level, in meters.
	 * @see http://pvcdrom.pveducation.org/SUNLIGHT/AIRMASS.HTM
	 * <!-- end-model-doc -->
	 * @model unique="false" sunAltitudeAngleUnique="false"
	 *        sunAltitudeAngleAnnotation="http://www.eclipse.org/emf/2002/GenModel symphony_units='rad'" heightAboveSeaLevelUnique="false"
	 *        heightAboveSeaLevelAnnotation="http://www.eclipse.org/emf/2002/GenModel symphony_units='m'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel symphony_units='W/m\262'"
	 * @generated
	 */
  double getDirectSunIntensity(double sunAltitudeAngle, double heightAboveSeaLevel);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Computes the intensity of the diffuse component of sunlight, in Watts/m^2.
	 * @param sunAltitudeAngle The sun elevation angle above the horizon, in radians.
	 * @param heightAboveSeaLevel Height above sea level, in meters.
	 * @see http://pvcdrom.pveducation.org/SUNLIGHT/AIRMASS.HTM
	 * <!-- end-model-doc -->
	 * @model unique="false" sunAltitudeAngleUnique="false"
	 *        sunAltitudeAngleAnnotation="http://www.eclipse.org/emf/2002/GenModel symphony_units='rad'" heightAboveSeaLevelUnique="false"
	 *        heightAboveSeaLevelAnnotation="http://www.eclipse.org/emf/2002/GenModel symphony_units='m'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel symphony_units='W/m\262'"
	 * @generated
	 */
  double getDiffuseSunIntensity(double sunAltitudeAngle, double heightAboveSeaLevel);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Computes the change in altitude that needs to be added to the altitude of
	 * HorizontalCoordinates to take into account the Earth's atmosphere refraction.
	 * The calculations in the NOAA Sunrise/Sunset and Solar Position Calculators are
	 * based on equations from Astronomical Algorithms, by Jean Meeus. The sunrise and
	 * sunset results have been verified to be accurate to within a minute for locations
	 * between +/- 72° latitude, and within 10 minutes outside of those latitudes.
	 * @param geometricAltitude The true altitude (as defined in HorizontalCoordinates) of the object, in radians.
	 * @see ../doc/AtmosphereRefractionCalculations.html or http://www.srrb.noaa.gov/highlights/sunrise/calcdetails.html.
	 * <!-- end-model-doc -->
	 * @model unique="false" geometricAltitudeUnique="false"
	 *        geometricAltitudeAnnotation="http://www.eclipse.org/emf/2002/GenModel symphony_units='rad'"
	 * @generated
	 */
  double getAtmosphereRefractionCorrection(double geometricAltitude);

} // AtmosphereUtils
