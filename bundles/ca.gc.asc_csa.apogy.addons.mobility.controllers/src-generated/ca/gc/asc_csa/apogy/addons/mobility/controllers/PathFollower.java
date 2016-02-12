package ca.gc.asc_csa.apogy.addons.mobility.controllers;
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

import ca.gc.asc_csa.apogy.addons.geometry.paths.Path;

import ca.gc.asc_csa.apogy.addons.mobility.MobilePlatform;

import ca.gc.asc_csa.apogy.addons.sensors.pose.PoseSensor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Follower</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A PathFollower is an entity that makes a MobilePlatform follow a specified Path.
 * The default implementation of PathFollower listens for changes in the SensorStatus
 * of its PoseSensor and the MobilePlateformStatus of its MobilePlateform and pauses
 * or resumes the path following accordingly.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower#getPath <em>Path</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower#getPlatform <em>Platform</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower#getPoseSensor <em>Pose Sensor</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower#isDestinationReached <em>Destination Reached</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower#getPathFollowerState <em>Path Follower State</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.ApogyAddonsMobilityControllersPackage#getPathFollower()
 * @model
 * @generated
 */
public interface PathFollower<PlatformType extends MobilePlatform, PathType extends Path> extends EObject {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' reference.
	 * @see #setPath(Path)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.ApogyAddonsMobilityControllersPackage#getPathFollower_Path()
	 * @model
	 * @generated
	 */
	PathType getPath();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower#getPath <em>Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(PathType value);

	/**
	 * Returns the value of the '<em><b>Platform</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' reference.
	 * @see #setPlatform(MobilePlatform)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.ApogyAddonsMobilityControllersPackage#getPathFollower_Platform()
	 * @model
	 * @generated
	 */
	PlatformType getPlatform();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower#getPlatform <em>Platform</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform</em>' reference.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(PlatformType value);

	/**
	 * Returns the value of the '<em><b>Pose Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pose Sensor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pose Sensor</em>' reference.
	 * @see #setPoseSensor(PoseSensor)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.ApogyAddonsMobilityControllersPackage#getPathFollower_PoseSensor()
	 * @model
	 * @generated
	 */
	PoseSensor getPoseSensor();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower#getPoseSensor <em>Pose Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pose Sensor</em>' reference.
	 * @see #getPoseSensor()
	 * @generated
	 */
	void setPoseSensor(PoseSensor value);

	/**
	 * Returns the value of the '<em><b>Destination Reached</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Reached</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Reached</em>' attribute.
	 * @see #setDestinationReached(boolean)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.ApogyAddonsMobilityControllersPackage#getPathFollower_DestinationReached()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDestinationReached();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower#isDestinationReached <em>Destination Reached</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Reached</em>' attribute.
	 * @see #isDestinationReached()
	 * @generated
	 */
	void setDestinationReached(boolean value);

	/**
	 * Returns the value of the '<em><b>Path Follower State</b></em>' attribute.
	 * The default value is <code>"IDLE"</code>.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollowerState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Follower State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Follower State</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollowerState
	 * @see #setPathFollowerState(PathFollowerState)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.ApogyAddonsMobilityControllersPackage#getPathFollower_PathFollowerState()
	 * @model default="IDLE" unique="false"
	 * @generated
	 */
	PathFollowerState getPathFollowerState();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower#getPathFollowerState <em>Path Follower State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Follower State</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollowerState
	 * @see #getPathFollowerState()
	 * @generated
	 */
	void setPathFollowerState(PathFollowerState value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	boolean start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	boolean pause();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	boolean resume();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	boolean stop();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" stateUnique="false"
	 * @generated
	 */
	boolean isTransitionValid(PathFollowerState state);

} // PathFollower
