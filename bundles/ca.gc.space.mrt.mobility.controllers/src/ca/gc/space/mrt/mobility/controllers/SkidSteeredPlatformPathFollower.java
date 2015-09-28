/**
 * <copyright>
 * </copyright>
 *
 * $Id: SkidSteeredPlatformPathFollower.java,v 1.2.4.2 2015/05/21 15:50:44 pallard Exp $
 */
package ca.gc.space.mrt.mobility.controllers;

import ca.gc.space.mrt.geometry.paths.Path;
import ca.gc.space.mrt.mobility.SkidSteeredMobilePlateform;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skid Steered Platform Path Follower</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.mobility.controllers.SkidSteeredPlatformPathFollower#getMaximumAngularVelocity <em>Maximum Angular Velocity</em>}</li>
 *   <li>{@link ca.gc.space.mrt.mobility.controllers.SkidSteeredPlatformPathFollower#getMaximumLinearVelocity <em>Maximum Linear Velocity</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.mobility.controllers.ControllersPackage#getSkidSteeredPlatformPathFollower()
 * @model
 * @generated
 */
public interface SkidSteeredPlatformPathFollower<PlateformType extends SkidSteeredMobilePlateform, PathType extends Path> extends PathFollower<PlateformType, PathType>
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

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
	 * @see ca.gc.space.mrt.mobility.controllers.ControllersPackage#getSkidSteeredPlatformPathFollower_MaximumAngularVelocity()
	 * @model
	 * @generated
	 */
	double getMaximumAngularVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.mobility.controllers.SkidSteeredPlatformPathFollower#getMaximumAngularVelocity <em>Maximum Angular Velocity</em>}' attribute.
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
	 * @see ca.gc.space.mrt.mobility.controllers.ControllersPackage#getSkidSteeredPlatformPathFollower_MaximumLinearVelocity()
	 * @model
	 * @generated
	 */
	double getMaximumLinearVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.mobility.controllers.SkidSteeredPlatformPathFollower#getMaximumLinearVelocity <em>Maximum Linear Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Linear Velocity</em>' attribute.
	 * @see #getMaximumLinearVelocity()
	 * @generated
	 */
	void setMaximumLinearVelocity(double value);

} // SkidSteeredPlatformPathFollower
