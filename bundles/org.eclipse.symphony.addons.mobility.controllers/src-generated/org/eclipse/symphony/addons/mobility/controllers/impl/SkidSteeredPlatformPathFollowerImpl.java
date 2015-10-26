/**
 * <copyright>
 * </copyright>
 *
 * $Id: SkidSteeredPlatformPathFollowerImpl.java,v 1.3.4.2 2015/05/21 15:50:44 pallard Exp $
 */
package org.eclipse.symphony.addons.mobility.controllers.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.geometry.paths.Path;
import org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform;
import org.eclipse.symphony.addons.mobility.controllers.ControllersPackage;
import org.eclipse.symphony.addons.mobility.controllers.SkidSteeredPlatformPathFollower;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skid Steered Platform Path Follower</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.impl.SkidSteeredPlatformPathFollowerImpl#getMaximumAngularVelocity <em>Maximum Angular Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.impl.SkidSteeredPlatformPathFollowerImpl#getMaximumLinearVelocity <em>Maximum Linear Velocity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SkidSteeredPlatformPathFollowerImpl<PlateformType extends SkidSteeredMobilePlatform, PathType extends Path> extends PathFollowerImpl<PlateformType, PathType> implements SkidSteeredPlatformPathFollower<PlateformType, PathType>
{
	/**
	 * The default value of the '{@link #getMaximumAngularVelocity() <em>Maximum Angular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_ANGULAR_VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximumAngularVelocity() <em>Maximum Angular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected double maximumAngularVelocity = MAXIMUM_ANGULAR_VELOCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumLinearVelocity() <em>Maximum Linear Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumLinearVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_LINEAR_VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximumLinearVelocity() <em>Maximum Linear Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumLinearVelocity()
	 * @generated
	 * @ordered
	 */
	protected double maximumLinearVelocity = MAXIMUM_LINEAR_VELOCITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SkidSteeredPlatformPathFollowerImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ControllersPackage.Literals.SKID_STEERED_PLATFORM_PATH_FOLLOWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setPlatform(PlateformType newPlatform) {
		super.setPlatform(newPlatform);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumAngularVelocity()
	{
		return maximumAngularVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumAngularVelocity(double newMaximumAngularVelocity)
	{
		double oldMaximumAngularVelocity = maximumAngularVelocity;
		maximumAngularVelocity = newMaximumAngularVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControllersPackage.SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_ANGULAR_VELOCITY, oldMaximumAngularVelocity, maximumAngularVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumLinearVelocity()
	{
		return maximumLinearVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumLinearVelocity(double newMaximumLinearVelocity)
	{
		double oldMaximumLinearVelocity = maximumLinearVelocity;
		maximumLinearVelocity = newMaximumLinearVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControllersPackage.SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_LINEAR_VELOCITY, oldMaximumLinearVelocity, maximumLinearVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case ControllersPackage.SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_ANGULAR_VELOCITY:
				return getMaximumAngularVelocity();
			case ControllersPackage.SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_LINEAR_VELOCITY:
				return getMaximumLinearVelocity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case ControllersPackage.SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_ANGULAR_VELOCITY:
				setMaximumAngularVelocity((Double)newValue);
				return;
			case ControllersPackage.SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_LINEAR_VELOCITY:
				setMaximumLinearVelocity((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case ControllersPackage.SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_ANGULAR_VELOCITY:
				setMaximumAngularVelocity(MAXIMUM_ANGULAR_VELOCITY_EDEFAULT);
				return;
			case ControllersPackage.SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_LINEAR_VELOCITY:
				setMaximumLinearVelocity(MAXIMUM_LINEAR_VELOCITY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case ControllersPackage.SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_ANGULAR_VELOCITY:
				return maximumAngularVelocity != MAXIMUM_ANGULAR_VELOCITY_EDEFAULT;
			case ControllersPackage.SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_LINEAR_VELOCITY:
				return maximumLinearVelocity != MAXIMUM_LINEAR_VELOCITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (maximumAngularVelocity: ");
		result.append(maximumAngularVelocity);
		result.append(", maximumLinearVelocity: ");
		result.append(maximumLinearVelocity);
		result.append(')');
		return result.toString();
	}

} //SkidSteeredPlatformPathFollowerImpl
