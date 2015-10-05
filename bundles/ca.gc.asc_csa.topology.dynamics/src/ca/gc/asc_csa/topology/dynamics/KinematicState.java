/**
 * <copyright>
 * </copyright>
 *
 * $Id: KinematicState.java,v 1.5.2.2 2015/02/03 20:01:37 rlarcheveque Exp $
 */
package ca.gc.asc_csa.topology.dynamics;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.math.Tuple3d;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kinematic State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class defining a kinematic state. Such state defines position, velocity and acceleration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.KinematicState#getPosition <em>Position</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.KinematicState#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.KinematicState#getLinearVelocity <em>Linear Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.KinematicState#getAngularVelocity <em>Angular Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.KinematicState#getLinearAcceleration <em>Linear Acceleration</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.KinematicState#getAngularAcceleration <em>Angular Acceleration</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getKinematicState()
 * @model
 * @generated
 */
public interface KinematicState extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyrights Canadian Space Agency 2012.";

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Tuple3d)
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getKinematicState_Position()
	 * @model containment="true"
	 * @generated
	 */
	Tuple3d getPosition();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.topology.dynamics.KinematicState#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Tuple3d value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' containment reference.
	 * @see #setOrientation(Tuple3d)
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getKinematicState_Orientation()
	 * @model containment="true"
	 * @generated
	 */
	Tuple3d getOrientation();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.topology.dynamics.KinematicState#getOrientation <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' containment reference.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(Tuple3d value);

	/**
	 * Returns the value of the '<em><b>Linear Velocity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Velocity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Velocity</em>' containment reference.
	 * @see #setLinearVelocity(Tuple3d)
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getKinematicState_LinearVelocity()
	 * @model containment="true"
	 * @generated
	 */
	Tuple3d getLinearVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.topology.dynamics.KinematicState#getLinearVelocity <em>Linear Velocity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Velocity</em>' containment reference.
	 * @see #getLinearVelocity()
	 * @generated
	 */
	void setLinearVelocity(Tuple3d value);

	/**
	 * Returns the value of the '<em><b>Angular Velocity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angular Velocity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angular Velocity</em>' containment reference.
	 * @see #setAngularVelocity(Tuple3d)
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getKinematicState_AngularVelocity()
	 * @model containment="true"
	 * @generated
	 */
	Tuple3d getAngularVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.topology.dynamics.KinematicState#getAngularVelocity <em>Angular Velocity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angular Velocity</em>' containment reference.
	 * @see #getAngularVelocity()
	 * @generated
	 */
	void setAngularVelocity(Tuple3d value);

	/**
	 * Returns the value of the '<em><b>Linear Acceleration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Acceleration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Acceleration</em>' containment reference.
	 * @see #setLinearAcceleration(Tuple3d)
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getKinematicState_LinearAcceleration()
	 * @model containment="true"
	 * @generated
	 */
	Tuple3d getLinearAcceleration();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.topology.dynamics.KinematicState#getLinearAcceleration <em>Linear Acceleration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Acceleration</em>' containment reference.
	 * @see #getLinearAcceleration()
	 * @generated
	 */
	void setLinearAcceleration(Tuple3d value);

	/**
	 * Returns the value of the '<em><b>Angular Acceleration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angular Acceleration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angular Acceleration</em>' containment reference.
	 * @see #setAngularAcceleration(Tuple3d)
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getKinematicState_AngularAcceleration()
	 * @model containment="true"
	 * @generated
	 */
	Tuple3d getAngularAcceleration();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.topology.dynamics.KinematicState#getAngularAcceleration <em>Angular Acceleration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angular Acceleration</em>' containment reference.
	 * @see #getAngularAcceleration()
	 * @generated
	 */
	void setAngularAcceleration(Tuple3d value);
} // KinematicState
