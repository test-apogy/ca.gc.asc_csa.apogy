/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;

import org.eclipse.symphony.common.math.Tuple3d;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Earth Surface Worksite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A specialization of Worksite defining a are or volume at the Earth surface.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.EarthSurfaceWorksite#getGeographicalCoordinates <em>Geographical Coordinates</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.EarthSurfaceWorksite#getXAxisAzimuth <em>XAxis Azimuth</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.EarthSurfaceWorksite#getEarthSky <em>Earth Sky</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getEarthSurfaceWorksite()
 * @model
 * @generated
 */
public interface EarthSurfaceWorksite extends SurfaceWorksite
{

  /**
	 * Returns the value of the '<em><b>Geographical Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Geographical Coordinates</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The geographical coordinates of the origin of the worksite, in the WS84 datum.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geographical Coordinates</em>' containment reference.
	 * @see #setGeographicalCoordinates(GeographicCoordinates)
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getEarthSurfaceWorksite_GeographicalCoordinates()
	 * @model containment="true" required="true"
	 * @generated
	 */
  GeographicCoordinates getGeographicalCoordinates();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.EarthSurfaceWorksite#getGeographicalCoordinates <em>Geographical Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geographical Coordinates</em>' containment reference.
	 * @see #getGeographicalCoordinates()
	 * @generated
	 */
  void setGeographicalCoordinates(GeographicCoordinates value);

  /**
	 * Returns the value of the '<em><b>XAxis Azimuth</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Azimuth, relative to true North, of the X axis of the worksite coordinates system. Follows the right hand rule.
	 * Note that the Z axis is pointing up (toward zenith).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XAxis Azimuth</em>' attribute.
	 * @see #setXAxisAzimuth(double)
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getEarthSurfaceWorksite_XAxisAzimuth()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
  double getXAxisAzimuth();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.EarthSurfaceWorksite#getXAxisAzimuth <em>XAxis Azimuth</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XAxis Azimuth</em>' attribute.
	 * @see #getXAxisAzimuth()
	 * @generated
	 */
  void setXAxisAzimuth(double value);

  /**
	 * Returns the value of the '<em><b>Earth Sky</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Earth Sky</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The EarthSky associated with the worksite,
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Earth Sky</em>' reference.
	 * @see #setEarthSky(EarthSky)
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getEarthSurfaceWorksite_EarthSky()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
  EarthSky getEarthSky();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.EarthSurfaceWorksite#getEarthSky <em>Earth Sky</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Earth Sky</em>' reference.
	 * @see #getEarthSky()
	 * @generated
	 */
  void setEarthSky(EarthSky value);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Converts a position expressed as XYZ in the EarthSurfaceWorksite frame to a WS84 GeographicCoordinates.
	 * @param position The position in the worksite coordinates system.
	 * @return The GeographicCoordinates of the position, in the WS84 datum.
	 * <!-- end-model-doc -->
	 * @model unique="false" positionUnique="false"
	 * @generated
	 */
	GeographicCoordinates convertToGeographicCoordinates(Tuple3d position);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Converts a WS84 GeographicCoordinates to a XYZ position in the EarthSurfaceWorksite frame.
	 * @param geographicalCoordinates The geographical coordinates expressed in the WS84 datum.
	 * @return The XYZ position in the worksite coordinates system.
	 * <!-- end-model-doc -->
	 * @model unique="false" geographicalCoordinatesUnique="false"
	 * @generated
	 */
	Tuple3d convertToXYZPosition(GeographicCoordinates geographicalCoordinates);
} // EarthSurfaceWorksite
