/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.addons.dynamics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Universal Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This constraint is two-axis rotation constraint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.UniversalConstraint#getAngular0CurrentState <em>Angular0 Current State</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.UniversalConstraint#getAngular1CurrentState <em>Angular1 Current State</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.topology.addons.dynamics.Symphony__CommonTopologyDynamicsPackage#getUniversalConstraint()
 * @model
 * @generated
 */
public interface UniversalConstraint extends AbstractConstraint {
	/**
	 * Returns the value of the '<em><b>Angular0 Current State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angular0 Current State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angular0 Current State</em>' containment reference.
	 * @see #setAngular0CurrentState(ConstraintState)
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.Symphony__CommonTopologyDynamicsPackage#getUniversalConstraint_Angular0CurrentState()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConstraintState getAngular0CurrentState();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.dynamics.UniversalConstraint#getAngular0CurrentState <em>Angular0 Current State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angular0 Current State</em>' containment reference.
	 * @see #getAngular0CurrentState()
	 * @generated
	 */
	void setAngular0CurrentState(ConstraintState value);

	/**
	 * Returns the value of the '<em><b>Angular1 Current State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angular1 Current State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angular1 Current State</em>' containment reference.
	 * @see #setAngular1CurrentState(ConstraintState)
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.Symphony__CommonTopologyDynamicsPackage#getUniversalConstraint_Angular1CurrentState()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConstraintState getAngular1CurrentState();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.dynamics.UniversalConstraint#getAngular1CurrentState <em>Angular1 Current State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angular1 Current State</em>' containment reference.
	 * @see #getAngular1CurrentState()
	 * @generated
	 */
	void setAngular1CurrentState(ConstraintState value);

} // UniversalConstraint
