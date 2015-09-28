/**
 * <copyright>
 * </copyright>
 *
 * $Id: PrismaticConstraint.java,v 1.4.2.2 2015/02/03 20:01:37 rlarcheveque Exp $
 */
package ca.gc.asc_csa.topology.dynamics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prismatic Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This constraint is used to move a body to move along an axis (no rotation).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.PrismaticConstraint#getLinearCurrentState <em>Linear Current State</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getPrismaticConstraint()
 * @model
 * @generated
 */
public interface PrismaticConstraint extends AbstractConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyrights Canadian Space Agency 2012.";

	/**
	 * Returns the value of the '<em><b>Linear Current State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linear Current State</em>' containment reference.
	 * @see #setLinearCurrentState(ConstraintState)
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getPrismaticConstraint_LinearCurrentState()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConstraintState getLinearCurrentState();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.topology.dynamics.PrismaticConstraint#getLinearCurrentState <em>Linear Current State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Current State</em>' containment reference.
	 * @see #getLinearCurrentState()
	 * @generated
	 */
	void setLinearCurrentState(ConstraintState value);

} // PrismaticConstraint
