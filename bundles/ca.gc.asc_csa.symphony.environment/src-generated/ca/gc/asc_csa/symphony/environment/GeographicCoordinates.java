/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geographic Coordinates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A location on Earth.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.GeographicCoordinates#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.GeographicCoordinates#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.GeographicCoordinates#getElevation <em>Elevation</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage#getGeographicCoordinates()
 * @model
 * @generated
 */
public interface GeographicCoordinates extends EObject
{

  /**
	 * Returns the value of the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The longitude, in radians. Longitude East of Greenwich are positive, West of Greenwich are negative.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Longitude</em>' attribute.
	 * @see #setLongitude(double)
	 * @see ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage#getGeographicCoordinates_Longitude()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
  double getLongitude();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.GeographicCoordinates#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' attribute.
	 * @see #getLongitude()
	 * @generated
	 */
  void setLongitude(double value);

  /**
	 * Returns the value of the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The latitude, in radians. Latitude North of the equator are positive, South of the equator are negative.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latitude</em>' attribute.
	 * @see #setLatitude(double)
	 * @see ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage#getGeographicCoordinates_Latitude()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
  double getLatitude();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.GeographicCoordinates#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #getLatitude()
	 * @generated
	 */
  void setLatitude(double value);

  /**
	 * Returns the value of the '<em><b>Elevation</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Height above the Earth's sea level, in meters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elevation</em>' attribute.
	 * @see #setElevation(double)
	 * @see ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage#getGeographicCoordinates_Elevation()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='m'"
	 * @generated
	 */
  double getElevation();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.GeographicCoordinates#getElevation <em>Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation</em>' attribute.
	 * @see #getElevation()
	 * @generated
	 */
  void setElevation(double value);
} // GeographicCoordinates
