/**
 * <copyright>
 * </copyright>
 *
 * $Id: HingeConstraint.java,v 1.4.2.2 2015/02/03 20:01:37 rlarcheveque Exp $
 */
package ca.gc.asc_csa.topology.dynamics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hinge Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This constraint is used to rotate a pair of bodies about a single axis (no translation).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.HingeConstraint#getAngularCurrentState <em>Angular Current State</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getHingeConstraint()
 * @model
 * @generated
 */
public interface HingeConstraint extends AbstractConstraint {
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
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getHingeConstraint_AngularCurrentState()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConstraintState getAngularCurrentState();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.topology.dynamics.HingeConstraint#getAngularCurrentState <em>Angular Current State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angular Current State</em>' containment reference.
	 * @see #getAngularCurrentState()
	 * @generated
	 */
	void setAngularCurrentState(ConstraintState value);

} // HingeConstraint
