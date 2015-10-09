/**
 * <copyright>
 * </copyright>
 *
 * $Id: CylindricalConstraint.java,v 1.4.2.2 2015/02/03 20:01:37 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.topology.addons.dynamics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cylindrical Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The cylindrical constraint is a 2 DOF constraint (one prismatic and one angular).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.CylindricalConstraint#getAngularCurrentState <em>Angular Current State</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.CylindricalConstraint#getLinearCurrentState <em>Linear Current State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getCylindricalConstraint()
 * @model
 * @generated
 */
public interface CylindricalConstraint extends AbstractConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyrights Canadian Space Agency 2012.";

	/**
	 * Returns the value of the '<em><b>Angular Current State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angular Current State</em>' containment reference.
	 * @see #setAngularCurrentState(ConstraintState)
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getCylindricalConstraint_AngularCurrentState()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConstraintState getAngularCurrentState();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.dynamics.CylindricalConstraint#getAngularCurrentState <em>Angular Current State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angular Current State</em>' containment reference.
	 * @see #getAngularCurrentState()
	 * @generated
	 */
	void setAngularCurrentState(ConstraintState value);

	/**
	 * Returns the value of the '<em><b>Linear Current State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linear Current State</em>' containment reference.
	 * @see #setLinearCurrentState(ConstraintState)
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getCylindricalConstraint_LinearCurrentState()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConstraintState getLinearCurrentState();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.dynamics.CylindricalConstraint#getLinearCurrentState <em>Linear Current State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Current State</em>' containment reference.
	 * @see #getLinearCurrentState()
	 * @generated
	 */
	void setLinearCurrentState(ConstraintState value);

} // CylindricalConstraint
