/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.addons.dynamics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the constraint's state which are position, velocity and force.
 * 
 * Each values are represented on the constraint axis (e.g. if the constraint is prismatic,
 * position will be the distance from the origin of the constraint, for angular constraints,
 * the position will be the angle from the origin of the constraint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.ConstraintState#getPosition <em>Position</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.ConstraintState#getVelocity <em>Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.ConstraintState#getForce <em>Force</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getConstraintState()
 * @model
 * @generated
 */
public interface ConstraintState extends EObject {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(double)
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getConstraintState_Position()
	 * @model unique="false"
	 * @generated
	 */
	double getPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.dynamics.ConstraintState#getPosition <em>Position</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Velocity</em>' attribute.
	 * @see #setVelocity(double)
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getConstraintState_Velocity()
	 * @model unique="false"
	 * @generated
	 */
	double getVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.dynamics.ConstraintState#getVelocity <em>Velocity</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Force</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force</em>' attribute.
	 * @see #setForce(double)
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getConstraintState_Force()
	 * @model unique="false"
	 * @generated
	 */
	double getForce();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.dynamics.ConstraintState#getForce <em>Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force</em>' attribute.
	 * @see #getForce()
	 * @generated
	 */
	void setForce(double value);

} // ConstraintState
