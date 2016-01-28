/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Horizontal Coordinates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The horizontal coordinate system is a celestial coordinate system that uses the
 * observer's local horizon as the fundamental plane. This conveniently divides the
 * sky into the upper hemisphere that you can see, and the lower hemisphere that you
 * cannot (because the Earth is in the way). The pole of the upper hemisphere is called
 * the zenith. The pole of the lower hemisphere is called the nadir.
 * 
 * The horizontal coordinates are:
 * 
 * - altitude (Alt): sometimes referred to as elevation, that is the angle between the
 *                   object and the observer's local horizon
 * 
 * - azimuth (Az): the angle of the object around the horizon, usually measured from the
 *                 north point towards the east. In former times, it was common to refer
 *                 to azimuth from the south, as it was then zero at the same time the hour
 *                 angle of a star was zero. This assumes, however, that the star (upper)
 *                 culminates in the south, which is only true for most stars in the
 *                 Northern Hemisphere
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.HorizontalCoordinates#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.HorizontalCoordinates#getAzimuth <em>Azimuth</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.HorizontalCoordinates#getRadius <em>Radius</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getHorizontalCoordinates()
 * @model
 * @generated
 */
public interface HorizontalCoordinates extends EObject
{

  /**
	 * Returns the value of the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Altitude</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude</em>' attribute.
	 * @see #setAltitude(double)
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getHorizontalCoordinates_Altitude()
	 * @model unique="false"
	 * @generated
	 */
  double getAltitude();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.HorizontalCoordinates#getAltitude <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' attribute.
	 * @see #getAltitude()
	 * @generated
	 */
  void setAltitude(double value);

  /**
	 * Returns the value of the '<em><b>Azimuth</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Azimuth</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Azimuth</em>' attribute.
	 * @see #setAzimuth(double)
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getHorizontalCoordinates_Azimuth()
	 * @model unique="false"
	 * @generated
	 */
  double getAzimuth();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.HorizontalCoordinates#getAzimuth <em>Azimuth</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azimuth</em>' attribute.
	 * @see #getAzimuth()
	 * @generated
	 */
  void setAzimuth(double value);

  /**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Radius</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getHorizontalCoordinates_Radius()
	 * @model unique="false"
	 * @generated
	 */
  double getRadius();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.HorizontalCoordinates#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
  void setRadius(double value);
} // HorizontalCoordinates
