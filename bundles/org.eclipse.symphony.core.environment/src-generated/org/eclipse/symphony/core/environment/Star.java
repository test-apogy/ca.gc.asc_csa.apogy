/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Star</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A star.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.Star#getMagnitude <em>Magnitude</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Star#getEquatorialCoordinates <em>Equatorial Coordinates</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getStar()
 * @model
 * @generated
 */
public interface Star extends EObject
{
  /**
	 * Returns the value of the '<em><b>Magnitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Magnitude</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Magnitude</em>' attribute.
	 * @see #setMagnitude(float)
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getStar_Magnitude()
	 * @model unique="false"
	 * @generated
	 */
  float getMagnitude();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.Star#getMagnitude <em>Magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Magnitude</em>' attribute.
	 * @see #getMagnitude()
	 * @generated
	 */
  void setMagnitude(float value);

  /**
	 * Returns the value of the '<em><b>Equatorial Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Equatorial Coordinates</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Equatorial Coordinates</em>' reference.
	 * @see #setEquatorialCoordinates(EquatorialCoordinates)
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getStar_EquatorialCoordinates()
	 * @model transient="true"
	 * @generated
	 */
  EquatorialCoordinates getEquatorialCoordinates();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.Star#getEquatorialCoordinates <em>Equatorial Coordinates</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equatorial Coordinates</em>' reference.
	 * @see #getEquatorialCoordinates()
	 * @generated
	 */
  void setEquatorialCoordinates(EquatorialCoordinates value);

} // Star
