/**
 * <copyright>
 * </copyright>
 *
 * $Id: UniversalConstraint.java,v 1.5.2.2 2015/02/03 20:01:37 rlarcheveque Exp $
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
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.UniversalConstraint#getAngular0CurrentState <em>Angular0 Current State</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.UniversalConstraint#getAngular1CurrentState <em>Angular1 Current State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getUniversalConstraint()
 * @model
 * @generated
 */
public interface UniversalConstraint extends AbstractConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyrights Canadian Space Agency 2012.";

	/**
	 * Returns the value of the '<em><b>Angular0 Current State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angular0 Current State</em>' containment reference.
	 * @see #setAngular0CurrentState(ConstraintState)
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getUniversalConstraint_Angular0CurrentState()
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angular1 Current State</em>' containment reference.
	 * @see #setAngular1CurrentState(ConstraintState)
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getUniversalConstraint_Angular1CurrentState()
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
