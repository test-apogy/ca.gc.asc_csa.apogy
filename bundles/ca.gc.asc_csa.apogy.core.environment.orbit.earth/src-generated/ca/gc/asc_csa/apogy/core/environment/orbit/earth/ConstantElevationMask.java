/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.orbit.earth;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Elevation Mask</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ConstantElevationMask#getConstantElevation <em>Constant Elevation</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getConstantElevationMask()
 * @model
 * @generated
 */
public interface ConstantElevationMask extends ElevationMask {
	/**
	 * Returns the value of the '<em><b>Constant Elevation</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant Elevation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The elevation, in radians.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constant Elevation</em>' attribute.
	 * @see #setConstantElevation(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getConstantElevationMask_ConstantElevation()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' apogy_units='rad'"
	 * @generated
	 */
	double getConstantElevation();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ConstantElevationMask#getConstantElevation <em>Constant Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant Elevation</em>' attribute.
	 * @see #getConstantElevation()
	 * @generated
	 */
	void setConstantElevation(double value);

} // ConstantElevationMask