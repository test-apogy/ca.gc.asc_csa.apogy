/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.addons.mobility.controllers;

import org.eclipse.symphony.addons.geometry.paths.Path;

import org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skid Steered Platform Path Follower</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.SkidSteeredPlatformPathFollower#getMaximumAngularVelocity <em>Maximum Angular Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.SkidSteeredPlatformPathFollower#getMaximumLinearVelocity <em>Maximum Linear Velocity</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.mobility.controllers.Symphony__AddonsMobilityControllersPackage#getSkidSteeredPlatformPathFollower()
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
	 * @see org.eclipse.symphony.addons.mobility.controllers.Symphony__AddonsMobilityControllersPackage#getSkidSteeredPlatformPathFollower_MaximumAngularVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getMaximumAngularVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.controllers.SkidSteeredPlatformPathFollower#getMaximumAngularVelocity <em>Maximum Angular Velocity</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.mobility.controllers.Symphony__AddonsMobilityControllersPackage#getSkidSteeredPlatformPathFollower_MaximumLinearVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getMaximumLinearVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.controllers.SkidSteeredPlatformPathFollower#getMaximumLinearVelocity <em>Maximum Linear Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Linear Velocity</em>' attribute.
	 * @see #getMaximumLinearVelocity()
	 * @generated
	 */
	void setMaximumLinearVelocity(double value);

} // SkidSteeredPlatformPathFollower
