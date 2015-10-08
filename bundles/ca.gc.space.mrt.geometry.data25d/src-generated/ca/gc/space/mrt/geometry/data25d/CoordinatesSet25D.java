/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.space.mrt.geometry.data25d;

import ca.gc.space.mrt.geometry.data.CoordinatesSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinates Set25 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data25d.CoordinatesSet25D#isEnforceUniqueness <em>Enforce Uniqueness</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.data25d.Data25dPackage#getCoordinatesSet25D()
 * @model
 * @generated
 */
public interface CoordinatesSet25D extends CoordinatesSet<Coordinates25D> {
	/**
	 * Returns the value of the '<em><b>Enforce Uniqueness</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When this parameter is set to true, this parameter ensures that all points added are unique.  The drawback is that performance is significantly decreased.  This feature can be bypassed by setting this attribute to false.  Default is true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enforce Uniqueness</em>' attribute.
	 * @see #setEnforceUniqueness(boolean)
	 * @see ca.gc.space.mrt.geometry.data25d.Data25dPackage#getCoordinatesSet25D_EnforceUniqueness()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isEnforceUniqueness();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data25d.CoordinatesSet25D#isEnforceUniqueness <em>Enforce Uniqueness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enforce Uniqueness</em>' attribute.
	 * @see #isEnforceUniqueness()
	 * @generated
	 */
	void setEnforceUniqueness(boolean value);

} // CoordinatesSet25D