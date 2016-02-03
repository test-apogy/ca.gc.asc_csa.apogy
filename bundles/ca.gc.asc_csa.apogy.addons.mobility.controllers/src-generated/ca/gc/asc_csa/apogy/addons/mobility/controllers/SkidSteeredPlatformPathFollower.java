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

import ca.gc.asc_csa.apogy.addons.geometry.paths.Path;

import ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skid Steered Platform Path Follower</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.SkidSteeredPlatformPathFollower#getMaximumAngularVelocity <em>Maximum Angular Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.SkidSteeredPlatformPathFollower#getMaximumLinearVelocity <em>Maximum Linear Velocity</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.ApogyAddonsMobilityControllersPackage#getSkidSteeredPlatformPathFollower()
 * @model
 * @generated
 */
public interface SkidSteeredPlatformPathFollower<PlateformType extends SkidSteeredMobilePlatform, PathType extends Path> extends PathFollower<PlateformType, PathType> {
	/**
	 * Returns the value of the '<em><b>Maximum Angular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Angular Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Angular Velocity</em>' attribute.
	 * @see #setMaximumAngularVelocity(double)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.ApogyAddonsMobilityControllersPackage#getSkidSteeredPlatformPathFollower_MaximumAngularVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getMaximumAngularVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.SkidSteeredPlatformPathFollower#getMaximumAngularVelocity <em>Maximum Angular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Angular Velocity</em>' attribute.
	 * @see #getMaximumAngularVelocity()
	 * @generated
	 */
	void setMaximumAngularVelocity(double value);

	/**
	 * Returns the value of the '<em><b>Maximum Linear Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Linear Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Linear Velocity</em>' attribute.
	 * @see #setMaximumLinearVelocity(double)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.controllers.ApogyAddonsMobilityControllersPackage#getSkidSteeredPlatformPathFollower_MaximumLinearVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getMaximumLinearVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.SkidSteeredPlatformPathFollower#getMaximumLinearVelocity <em>Maximum Linear Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Linear Velocity</em>' attribute.
	 * @see #getMaximumLinearVelocity()
	 * @generated
	 */
	void setMaximumLinearVelocity(double value);

} // SkidSteeredPlatformPathFollower
