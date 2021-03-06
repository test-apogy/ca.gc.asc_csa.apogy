package ca.gc.asc_csa.apogy.common.topology.addons.dynamics;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.common.math.Tuple3d;

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
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState#getPosition <em>Position</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState#getLinearVelocity <em>Linear Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState#getAngularVelocity <em>Angular Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState#getLinearAcceleration <em>Linear Acceleration</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState#getAngularAcceleration <em>Angular Acceleration</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage#getKinematicState()
 * @model
 * @generated
 */
public interface KinematicState extends EObject {
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
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage#getKinematicState_Position()
	 * @model containment="true"
	 * @generated
	 */
	Tuple3d getPosition();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState#getPosition <em>Position</em>}' containment reference.
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
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage#getKinematicState_Orientation()
	 * @model containment="true"
	 * @generated
	 */
	Tuple3d getOrientation();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState#getOrientation <em>Orientation</em>}' containment reference.
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
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage#getKinematicState_LinearVelocity()
	 * @model containment="true"
	 * @generated
	 */
	Tuple3d getLinearVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState#getLinearVelocity <em>Linear Velocity</em>}' containment reference.
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
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage#getKinematicState_AngularVelocity()
	 * @model containment="true"
	 * @generated
	 */
	Tuple3d getAngularVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState#getAngularVelocity <em>Angular Velocity</em>}' containment reference.
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
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage#getKinematicState_LinearAcceleration()
	 * @model containment="true"
	 * @generated
	 */
	Tuple3d getLinearAcceleration();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState#getLinearAcceleration <em>Linear Acceleration</em>}' containment reference.
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
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage#getKinematicState_AngularAcceleration()
	 * @model containment="true"
	 * @generated
	 */
	Tuple3d getAngularAcceleration();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState#getAngularAcceleration <em>Angular Acceleration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angular Acceleration</em>' containment reference.
	 * @see #getAngularAcceleration()
	 * @generated
	 */
	void setAngularAcceleration(Tuple3d value);

} // KinematicState
