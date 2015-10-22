/**
 * <copyright>
 * </copyright>
 *
 * $Id: SkidSteeredPlatformPathFollower.java,v 1.2.4.2 2015/05/21 15:50:44 pallard Exp $
 */
package org.eclipse.symphony.addons.mobility.controllers;

import org.eclipse.symphony.addons.geometry.paths.Path;
import org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlateform;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skid Steered Platform Path Follower</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.SkidSteeredPlatformPathFollower#getMaximumAngularVelocity <em>Maximum Angular Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.SkidSteeredPlatformPathFollower#getMaximumLinearVelocity <em>Maximum Linear Velocity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.mobility.controllers.ControllersPackage#getSkidSteeredPlatformPathFollower()
 * @model
 * @generated
 */
public interface SkidSteeredPlatformPathFollower<PlateformType extends SkidSteeredMobilePlateform, PathType extends Path> extends PathFollower<PlateformType, PathType>
{
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
	 * @see org.eclipse.symphony.addons.mobility.controllers.ControllersPackage#getSkidSteeredPlatformPathFollower_MaximumAngularVelocity()
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
	 * @see org.eclipse.symphony.addons.mobility.controllers.ControllersPackage#getSkidSteeredPlatformPathFollower_MaximumLinearVelocity()
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
