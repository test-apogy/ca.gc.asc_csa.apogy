/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equatorial Coordinates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The equatorial coordinate system is a widely-used method of mapping celestial objects.
 * It functions by projecting the Earth's geographic poles and equator onto the celestial
 * sphere. The projection of the Earth's equator onto the celestial sphere is called the
 * celestial equator. Similarly, the projections of the Earth's north and south geographic
 * poles become the north and south celestial poles, respectively.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates#getRightAscension <em>Right Ascension</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates#getDeclination <em>Declination</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates#getRadius <em>Radius</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getEquatorialCoordinates()
 * @model
 * @generated
 */
public interface EquatorialCoordinates extends EObject
{
  /**
	 * Returns the value of the '<em><b>Right Ascension</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Ascension</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Ascension</em>' attribute.
	 * @see #setRightAscension(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getEquatorialCoordinates_RightAscension()
	 * @model unique="false"
	 * @generated
	 */
  double getRightAscension();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates#getRightAscension <em>Right Ascension</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Ascension</em>' attribute.
	 * @see #getRightAscension()
	 * @generated
	 */
  void setRightAscension(double value);

  /**
	 * Returns the value of the '<em><b>Declination</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declination</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Declination</em>' attribute.
	 * @see #setDeclination(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getEquatorialCoordinates_Declination()
	 * @model unique="false"
	 * @generated
	 */
  double getDeclination();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates#getDeclination <em>Declination</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declination</em>' attribute.
	 * @see #getDeclination()
	 * @generated
	 */
  void setDeclination(double value);

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
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getEquatorialCoordinates_Radius()
	 * @model unique="false"
	 * @generated
	 */
  double getRadius();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
  void setRadius(double value);

} // EquatorialCoordinates
