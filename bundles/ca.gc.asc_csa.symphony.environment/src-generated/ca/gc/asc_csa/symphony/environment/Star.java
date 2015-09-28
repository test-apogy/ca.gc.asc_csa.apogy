/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment;

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
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.Star#getMagnitude <em>Magnitude</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.Star#getEquatorialCoordinates <em>Equatorial Coordinates</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage#getStar()
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
	 * @see ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage#getStar_Magnitude()
	 * @model unique="false"
	 * @generated
	 */
  float getMagnitude();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.Star#getMagnitude <em>Magnitude</em>}' attribute.
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
	 * @see ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage#getStar_EquatorialCoordinates()
	 * @model transient="true"
	 * @generated
	 */
  EquatorialCoordinates getEquatorialCoordinates();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.Star#getEquatorialCoordinates <em>Equatorial Coordinates</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equatorial Coordinates</em>' reference.
	 * @see #getEquatorialCoordinates()
	 * @generated
	 */
  void setEquatorialCoordinates(EquatorialCoordinates value);

} // Star
