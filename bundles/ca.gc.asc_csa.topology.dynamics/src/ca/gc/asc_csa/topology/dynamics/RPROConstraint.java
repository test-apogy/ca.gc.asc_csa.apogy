/**
 * <copyright>
 * </copyright>
 *
 * $Id: RPROConstraint.java,v 1.4.2.2 2015/02/03 20:01:37 rlarcheveque Exp $
 */
package ca.gc.asc_csa.topology.dynamics;

import org.eclipse.symphony.common.math.Tuple3d;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RPRO Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * (Relative Position Relative Orientation) is a constraint used to fix two parts with a given distance and orientation. Both linear and angular strengths describes the forces needed to respect this constraint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.RPROConstraint#getLinearStrength <em>Linear Strength</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.RPROConstraint#getAngularStrength <em>Angular Strength</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getRPROConstraint()
 * @model
 * @generated
 */
public interface RPROConstraint extends AbstractConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyrights Canadian Space Agency 2012.";

	/**
	 * Returns the value of the '<em><b>Linear Strength</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linear Strength</em>' reference.
	 * @see #setLinearStrength(Tuple3d)
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getRPROConstraint_LinearStrength()
	 * @model
	 * @generated
	 */
	Tuple3d getLinearStrength();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.topology.dynamics.RPROConstraint#getLinearStrength <em>Linear Strength</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Strength</em>' reference.
	 * @see #getLinearStrength()
	 * @generated
	 */
	void setLinearStrength(Tuple3d value);

	/**
	 * Returns the value of the '<em><b>Angular Strength</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angular Strength</em>' reference.
	 * @see #setAngularStrength(Tuple3d)
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getRPROConstraint_AngularStrength()
	 * @model
	 * @generated
	 */
	Tuple3d getAngularStrength();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.topology.dynamics.RPROConstraint#getAngularStrength <em>Angular Strength</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angular Strength</em>' reference.
	 * @see #getAngularStrength()
	 * @generated
	 */
	void setAngularStrength(Tuple3d value);

} // RPROConstraint
