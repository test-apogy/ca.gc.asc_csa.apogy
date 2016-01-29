/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.topology.addons.dynamics;

import ca.gc.asc_csa.apogy.common.math.Tuple3d;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RPRO Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Relative Position Relative Orientation (RPRO) is a constraint used to fix two parts with a
 * given distance and orientation. Both linear and angular strengths describes the forces needed
 * to respect this constraint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.RPROConstraint#getLinearStrength <em>Linear Strength</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.RPROConstraint#getAngularStrength <em>Angular Strength</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage#getRPROConstraint()
 * @model
 * @generated
 */
public interface RPROConstraint extends AbstractConstraint {
	/**
	 * Returns the value of the '<em><b>Linear Strength</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Strength</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Strength</em>' reference.
	 * @see #setLinearStrength(Tuple3d)
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage#getRPROConstraint_LinearStrength()
	 * @model
	 * @generated
	 */
	Tuple3d getLinearStrength();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.RPROConstraint#getLinearStrength <em>Linear Strength</em>}' reference.
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
	 * <p>
	 * If the meaning of the '<em>Angular Strength</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angular Strength</em>' reference.
	 * @see #setAngularStrength(Tuple3d)
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage#getRPROConstraint_AngularStrength()
	 * @model
	 * @generated
	 */
	Tuple3d getAngularStrength();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.RPROConstraint#getAngularStrength <em>Angular Strength</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angular Strength</em>' reference.
	 * @see #getAngularStrength()
	 * @generated
	 */
	void setAngularStrength(Tuple3d value);

} // RPROConstraint
