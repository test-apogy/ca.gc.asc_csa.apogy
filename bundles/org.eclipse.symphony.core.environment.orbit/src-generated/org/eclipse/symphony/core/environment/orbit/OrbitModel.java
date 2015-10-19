/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit;

import org.eclipse.symphony.core.AbstractOrbitModel;

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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.OrbitModel#getInitialOrbit <em>Initial Orbit</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.OrbitModel#getPropagator <em>Propagator</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.orbit.SymphonyOrbitEnvironmentPackage#getOrbitModel()
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
	 * @see org.eclipse.symphony.core.environment.orbit.SymphonyOrbitEnvironmentPackage#getOrbitModel_InitialOrbit()
	 * @model containment="true"
	 * @generated
	 */
	Orbit getInitialOrbit();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.OrbitModel#getInitialOrbit <em>Initial Orbit</em>}' containment reference.
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
	 * @see org.eclipse.symphony.core.environment.orbit.SymphonyOrbitEnvironmentPackage#getOrbitModel_Propagator()
	 * @model containment="true"
	 * @generated
	 */
	AbstractOrbitPropagator getPropagator();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.OrbitModel#getPropagator <em>Propagator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propagator</em>' containment reference.
	 * @see #getPropagator()
	 * @generated
	 */
	void setPropagator(AbstractOrbitPropagator value);

} // OrbitModel
