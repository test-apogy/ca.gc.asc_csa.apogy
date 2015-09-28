/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.orbit;

import ca.gc.asc_csa.symphony.core.AbstractOrbitModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orbit Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Class that defines an orbit model. An orbit model specifies both initial condition (through the initial Orbit), and
 * a propagation method (through the AbstractOrbitPropagator).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.OrbitModel#getInitialOrbit <em>Initial Orbit</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.OrbitModel#getPropagator <em>Propagator</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.environment.orbit.SymphonyOrbitEnvironmentPackage#getOrbitModel()
 * @model
 * @generated
 */
public interface OrbitModel extends AbstractOrbitModel {

	/**
	 * Returns the value of the '<em><b>Initial Orbit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Orbit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Orbit</em>' containment reference.
	 * @see #setInitialOrbit(Orbit)
	 * @see ca.gc.asc_csa.symphony.environment.orbit.SymphonyOrbitEnvironmentPackage#getOrbitModel_InitialOrbit()
	 * @model containment="true"
	 * @generated
	 */
	Orbit getInitialOrbit();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.orbit.OrbitModel#getInitialOrbit <em>Initial Orbit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Orbit</em>' containment reference.
	 * @see #getInitialOrbit()
	 * @generated
	 */
	void setInitialOrbit(Orbit value);

	/**
	 * Returns the value of the '<em><b>Propagator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propagator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propagator</em>' containment reference.
	 * @see #setPropagator(AbstractOrbitPropagator)
	 * @see ca.gc.asc_csa.symphony.environment.orbit.SymphonyOrbitEnvironmentPackage#getOrbitModel_Propagator()
	 * @model containment="true"
	 * @generated
	 */
	AbstractOrbitPropagator getPropagator();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.orbit.OrbitModel#getPropagator <em>Propagator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propagator</em>' containment reference.
	 * @see #getPropagator()
	 * @generated
	 */
	void setPropagator(AbstractOrbitPropagator value);

} // OrbitModel
