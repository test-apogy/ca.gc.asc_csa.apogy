/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.orbit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initial Orbit Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A class containing an initial orbit. Mainly used by some AbstractOrbitPropagator sub-classes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.InitialOrbitContainer#getStartOrbit <em>Start Orbit</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage#getInitialOrbitContainer()
 * @model
 * @generated
 */
public interface InitialOrbitContainer extends InitialOrbitProvider {
	/**
	 * Returns the value of the '<em><b>Start Orbit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The initial orbit to propagate in time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Orbit</em>' reference.
	 * @see #setStartOrbit(Orbit)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage#getInitialOrbitContainer_StartOrbit()
	 * @model required="true"
	 * @generated
	 */
	Orbit getStartOrbit();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.InitialOrbitContainer#getStartOrbit <em>Start Orbit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Orbit</em>' reference.
	 * @see #getStartOrbit()
	 * @generated
	 */
	void setStartOrbit(Orbit value);

} // InitialOrbitContainer
