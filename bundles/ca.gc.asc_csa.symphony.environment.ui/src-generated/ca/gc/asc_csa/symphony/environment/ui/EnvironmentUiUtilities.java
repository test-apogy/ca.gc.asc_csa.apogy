/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.ui;

import javax.vecmath.Color3f;
import javax.vecmath.Point3f;

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.symphony.environment.Star;
import ca.gc.asc_csa.symphony.environment.ui.impl.EnvironmentUiUtilitiesImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Ui Utilities</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIPackage#getEnvironmentUiUtilities()
 * @model
 * @generated
 */
public interface EnvironmentUiUtilities extends EObject
{
	public static final EnvironmentUiUtilities INSTANCE = EnvironmentUiUtilitiesImpl.getInstance();

	public static final double LOWER_SUN_ALTITUDE_FOR_TRANSPARENCY = Math.toRadians(-5.0);
	public static final double LOWER_SUN_ALTITUDE_TRANSPARENCY = 1.0;
	public static final double UPPER_SUN_ALTITUDE_FOR_TRANSPARENCY = Math.toRadians(0.0);
	public static final double UPPER_SUN_ALTITUDE_TRANSPARENCY = 0.0;

	public static final Color3f DAY_SKY_COLOR = new Color3f(0, 0, 1);
	public static final Color3f SUNSET_SKY_COLOR = new Color3f(((float)  201 / 255), 0 , 1);
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.symphony.environment.ui.Point3f" unique="false" starUnique="false"
	 * @generated
	 */
  Point3f toPoint3f(Star star);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" magnitudeUnique="false" magnitudeRangeMinimumUnique="false" magnitudeRangeMaximumUnique="false" minimumPointSizeUnique="false" maximumPointSizeUnique="false"
	 * @generated
	 */
  float getPointSizeForMagnitude(float magnitude, float magnitudeRangeMinimum, float magnitudeRangeMaximum, float minimumPointSize, float maximumPointSize);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the sun color for a given altitude above the horizon.
	 * @param sunAltitude The altitude above the horizon, in radians.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.symphony.environment.ui.Color3f" unique="false" sunAltitudeUnique="false"
	 * @generated
	 */
  Color3f getSunLightColor(double sunAltitude);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the transparency value (between no transparency 0 and full transparency 1.0) to be used for the blus sky as a function of the sun altitude angle.
	 * @param sunAltitude The altitude above the horizon, in radians.
	 * <!-- end-model-doc -->
	 * @model unique="false" sunAltitudeUnique="false"
	 * @generated
	 */
  double getSkyTransparency(double sunAltitude);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the sky color for a given altitude above the horizon.
	 * @param sunAltitude The altitude above the horizon, in radians.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.symphony.environment.ui.Color3f" unique="false" sunAltitudeUnique="false"
	 * @generated
	 */
  Color3f getSkyColor(double sunAltitude);

} // EnvironmentUiUtilities
