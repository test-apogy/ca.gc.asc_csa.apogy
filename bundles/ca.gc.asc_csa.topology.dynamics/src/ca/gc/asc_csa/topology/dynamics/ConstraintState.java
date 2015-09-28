/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConstraintState.java,v 1.4.2.2 2015/02/03 20:01:37 rlarcheveque Exp $
 */
package ca.gc.asc_csa.topology.dynamics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the constraint's state which are position, velocity and force. Each values are represented on the constraint axis (e.g. if the constraint is prismatic, position will be the distance from the origin of the constraint, for angular constraints, the position will be the angle from the origin of the constraint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.ConstraintState#getPosition <em>Position</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.ConstraintState#getVelocity <em>Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.ConstraintState#getForce <em>Force</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getConstraintState()
 * @model
 * @generated
 */
public interface ConstraintState extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyrights Canadian Space Agency 2012.";

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(double)
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getConstraintState_Position()
	 * @model
	 * @generated
	 */
	double getPosition();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.topology.dynamics.ConstraintState#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(double value);

	/**
	 * Returns the value of the '<em><b>Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Velocity</em>' attribute.
	 * @see #setVelocity(double)
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getConstraintState_Velocity()
	 * @model
	 * @generated
	 */
	double getVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.topology.dynamics.ConstraintState#getVelocity <em>Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Velocity</em>' attribute.
	 * @see #getVelocity()
	 * @generated
	 */
	void setVelocity(double value);

	/**
	 * Returns the value of the '<em><b>Force</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Force</em>' attribute.
	 * @see #setForce(double)
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getConstraintState_Force()
	 * @model
	 * @generated
	 */
	double getForce();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.topology.dynamics.ConstraintState#getForce <em>Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force</em>' attribute.
	 * @see #getForce()
	 * @generated
	 */
	void setForce(double value);

} // ConstraintState
