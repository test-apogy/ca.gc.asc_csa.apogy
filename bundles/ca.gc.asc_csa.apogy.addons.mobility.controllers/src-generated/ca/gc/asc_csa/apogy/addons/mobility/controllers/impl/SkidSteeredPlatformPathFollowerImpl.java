package ca.gc.asc_csa.apogy.addons.mobility.controllers.impl;
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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.addons.geometry.paths.Path;
import ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform;
import ca.gc.asc_csa.apogy.addons.mobility.controllers.ApogyAddonsMobilityControllersPackage;
import ca.gc.asc_csa.apogy.addons.mobility.controllers.SkidSteeredPlatformPathFollower;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skid Steered Platform Path Follower</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.SkidSteeredPlatformPathFollowerImpl#getMaximumAngularVelocity <em>Maximum Angular Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.SkidSteeredPlatformPathFollowerImpl#getMaximumLinearVelocity <em>Maximum Linear Velocity</em>}</li>
 * </ul>
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
		return ApogyAddonsMobilityControllersPackage.Literals.SKID_STEERED_PLATFORM_PATH_FOLLOWER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityControllersPackage.SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_ANGULAR_VELOCITY, oldMaximumAngularVelocity, maximumAngularVelocity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityControllersPackage.SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_LINEAR_VELOCITY, oldMaximumLinearVelocity, maximumLinearVelocity));
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
			case ApogyAddonsMobilityControllersPackage.SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_ANGULAR_VELOCITY:
				return getMaximumAngularVelocity();
			case ApogyAddonsMobilityControllersPackage.SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_LINEAR_VELOCITY:
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
			case ApogyAddonsMobilityControllersPackage.SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_ANGULAR_VELOCITY:
				setMaximumAngularVelocity((Double)newValue);
				return;
			case ApogyAddonsMobilityControllersPackage.SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_LINEAR_VELOCITY:
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
			case ApogyAddonsMobilityControllersPackage.SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_ANGULAR_VELOCITY:
				setMaximumAngularVelocity(MAXIMUM_ANGULAR_VELOCITY_EDEFAULT);
				return;
			case ApogyAddonsMobilityControllersPackage.SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_LINEAR_VELOCITY:
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
			case ApogyAddonsMobilityControllersPackage.SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_ANGULAR_VELOCITY:
				return maximumAngularVelocity != MAXIMUM_ANGULAR_VELOCITY_EDEFAULT;
			case ApogyAddonsMobilityControllersPackage.SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_LINEAR_VELOCITY:
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
