package ca.gc.asc_csa.apogy.addons.mobility.impl;
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
import ca.gc.asc_csa.apogy.addons.mobility.ApogyAddonsMobilityPackage;
import ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skid Steered Mobile Plateform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.impl.SkidSteeredMobilePlatformImpl#getCommandedRightWheelsVelocity <em>Commanded Right Wheels Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.impl.SkidSteeredMobilePlatformImpl#getActualRightWheelsVelocity <em>Actual Right Wheels Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.impl.SkidSteeredMobilePlatformImpl#getCommandedLeftWheelsVelocity <em>Commanded Left Wheels Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.impl.SkidSteeredMobilePlatformImpl#getActualLeftWheelsVelocity <em>Actual Left Wheels Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.impl.SkidSteeredMobilePlatformImpl#getCommandedAngularVelocity <em>Commanded Angular Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.impl.SkidSteeredMobilePlatformImpl#getActualAngularVelocity <em>Actual Angular Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.impl.SkidSteeredMobilePlatformImpl#getCommandedTranslationVelocity <em>Commanded Translation Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.impl.SkidSteeredMobilePlatformImpl#getActualTranslationVelocity <em>Actual Translation Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.impl.SkidSteeredMobilePlatformImpl#getEffectiveSteeringWidth <em>Effective Steering Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkidSteeredMobilePlatformImpl extends MobilePlatformImpl implements SkidSteeredMobilePlatform {
	/**
	 * The default value of the '{@link #getCommandedRightWheelsVelocity() <em>Commanded Right Wheels Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandedRightWheelsVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double COMMANDED_RIGHT_WHEELS_VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCommandedRightWheelsVelocity() <em>Commanded Right Wheels Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandedRightWheelsVelocity()
	 * @generated
	 * @ordered
	 */
	protected double commandedRightWheelsVelocity = COMMANDED_RIGHT_WHEELS_VELOCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualRightWheelsVelocity() <em>Actual Right Wheels Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualRightWheelsVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTUAL_RIGHT_WHEELS_VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActualRightWheelsVelocity() <em>Actual Right Wheels Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualRightWheelsVelocity()
	 * @generated
	 * @ordered
	 */
	protected double actualRightWheelsVelocity = ACTUAL_RIGHT_WHEELS_VELOCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommandedLeftWheelsVelocity() <em>Commanded Left Wheels Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandedLeftWheelsVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double COMMANDED_LEFT_WHEELS_VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCommandedLeftWheelsVelocity() <em>Commanded Left Wheels Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandedLeftWheelsVelocity()
	 * @generated
	 * @ordered
	 */
	protected double commandedLeftWheelsVelocity = COMMANDED_LEFT_WHEELS_VELOCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualLeftWheelsVelocity() <em>Actual Left Wheels Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualLeftWheelsVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTUAL_LEFT_WHEELS_VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActualLeftWheelsVelocity() <em>Actual Left Wheels Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualLeftWheelsVelocity()
	 * @generated
	 * @ordered
	 */
	protected double actualLeftWheelsVelocity = ACTUAL_LEFT_WHEELS_VELOCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommandedAngularVelocity() <em>Commanded Angular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandedAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double COMMANDED_ANGULAR_VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCommandedAngularVelocity() <em>Commanded Angular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandedAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected double commandedAngularVelocity = COMMANDED_ANGULAR_VELOCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualAngularVelocity() <em>Actual Angular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTUAL_ANGULAR_VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActualAngularVelocity() <em>Actual Angular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected double actualAngularVelocity = ACTUAL_ANGULAR_VELOCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommandedTranslationVelocity() <em>Commanded Translation Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandedTranslationVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double COMMANDED_TRANSLATION_VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCommandedTranslationVelocity() <em>Commanded Translation Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandedTranslationVelocity()
	 * @generated
	 * @ordered
	 */
	protected double commandedTranslationVelocity = COMMANDED_TRANSLATION_VELOCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualTranslationVelocity() <em>Actual Translation Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualTranslationVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTUAL_TRANSLATION_VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActualTranslationVelocity() <em>Actual Translation Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualTranslationVelocity()
	 * @generated
	 * @ordered
	 */
	protected double actualTranslationVelocity = ACTUAL_TRANSLATION_VELOCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffectiveSteeringWidth() <em>Effective Steering Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveSteeringWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double EFFECTIVE_STEERING_WIDTH_EDEFAULT = 0.5;

	/**
	 * The cached value of the '{@link #getEffectiveSteeringWidth() <em>Effective Steering Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveSteeringWidth()
	 * @generated
	 * @ordered
	 */
	protected double effectiveSteeringWidth = EFFECTIVE_STEERING_WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SkidSteeredMobilePlatformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsMobilityPackage.Literals.SKID_STEERED_MOBILE_PLATFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCommandedRightWheelsVelocity() {
		return commandedRightWheelsVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandedRightWheelsVelocity(double newCommandedRightWheelsVelocity) {
		double oldCommandedRightWheelsVelocity = commandedRightWheelsVelocity;
		commandedRightWheelsVelocity = newCommandedRightWheelsVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__COMMANDED_RIGHT_WHEELS_VELOCITY, oldCommandedRightWheelsVelocity, commandedRightWheelsVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActualRightWheelsVelocity()
	{
		return actualRightWheelsVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualRightWheelsVelocity(double newActualRightWheelsVelocity)
	{
		double oldActualRightWheelsVelocity = actualRightWheelsVelocity;
		actualRightWheelsVelocity = newActualRightWheelsVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__ACTUAL_RIGHT_WHEELS_VELOCITY, oldActualRightWheelsVelocity, actualRightWheelsVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCommandedLeftWheelsVelocity() {
		return commandedLeftWheelsVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandedLeftWheelsVelocity(double newCommandedLeftWheelsVelocity) {
		double oldCommandedLeftWheelsVelocity = commandedLeftWheelsVelocity;
		commandedLeftWheelsVelocity = newCommandedLeftWheelsVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__COMMANDED_LEFT_WHEELS_VELOCITY, oldCommandedLeftWheelsVelocity, commandedLeftWheelsVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActualLeftWheelsVelocity()
	{
		return actualLeftWheelsVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualLeftWheelsVelocity(double newActualLeftWheelsVelocity)
	{
		double oldActualLeftWheelsVelocity = actualLeftWheelsVelocity;
		actualLeftWheelsVelocity = newActualLeftWheelsVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__ACTUAL_LEFT_WHEELS_VELOCITY, oldActualLeftWheelsVelocity, actualLeftWheelsVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCommandedAngularVelocity()
	{
		return commandedAngularVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandedAngularVelocity(double newCommandedAngularVelocity)
	{
		double oldCommandedAngularVelocity = commandedAngularVelocity;
		commandedAngularVelocity = newCommandedAngularVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__COMMANDED_ANGULAR_VELOCITY, oldCommandedAngularVelocity, commandedAngularVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActualAngularVelocity()
	{
		return actualAngularVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualAngularVelocity(double newActualAngularVelocity)
	{
		double oldActualAngularVelocity = actualAngularVelocity;
		actualAngularVelocity = newActualAngularVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__ACTUAL_ANGULAR_VELOCITY, oldActualAngularVelocity, actualAngularVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCommandedTranslationVelocity()
	{
		return commandedTranslationVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandedTranslationVelocity(double newCommandedTranslationVelocity)
	{
		double oldCommandedTranslationVelocity = commandedTranslationVelocity;
		commandedTranslationVelocity = newCommandedTranslationVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__COMMANDED_TRANSLATION_VELOCITY, oldCommandedTranslationVelocity, commandedTranslationVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActualTranslationVelocity()
	{
		return actualTranslationVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualTranslationVelocity(double newActualTranslationVelocity)
	{
		double oldActualTranslationVelocity = actualTranslationVelocity;
		actualTranslationVelocity = newActualTranslationVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__ACTUAL_TRANSLATION_VELOCITY, oldActualTranslationVelocity, actualTranslationVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEffectiveSteeringWidth()
	{
		return effectiveSteeringWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveSteeringWidth(double newEffectiveSteeringWidth)
	{
		double oldEffectiveSteeringWidth = effectiveSteeringWidth;
		effectiveSteeringWidth = newEffectiveSteeringWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__EFFECTIVE_STEERING_WIDTH, oldEffectiveSteeringWidth, effectiveSteeringWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__COMMANDED_RIGHT_WHEELS_VELOCITY:
				return getCommandedRightWheelsVelocity();
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__ACTUAL_RIGHT_WHEELS_VELOCITY:
				return getActualRightWheelsVelocity();
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__COMMANDED_LEFT_WHEELS_VELOCITY:
				return getCommandedLeftWheelsVelocity();
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__ACTUAL_LEFT_WHEELS_VELOCITY:
				return getActualLeftWheelsVelocity();
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__COMMANDED_ANGULAR_VELOCITY:
				return getCommandedAngularVelocity();
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__ACTUAL_ANGULAR_VELOCITY:
				return getActualAngularVelocity();
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__COMMANDED_TRANSLATION_VELOCITY:
				return getCommandedTranslationVelocity();
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__ACTUAL_TRANSLATION_VELOCITY:
				return getActualTranslationVelocity();
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__EFFECTIVE_STEERING_WIDTH:
				return getEffectiveSteeringWidth();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__COMMANDED_RIGHT_WHEELS_VELOCITY:
				setCommandedRightWheelsVelocity((Double)newValue);
				return;
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__ACTUAL_RIGHT_WHEELS_VELOCITY:
				setActualRightWheelsVelocity((Double)newValue);
				return;
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__COMMANDED_LEFT_WHEELS_VELOCITY:
				setCommandedLeftWheelsVelocity((Double)newValue);
				return;
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__ACTUAL_LEFT_WHEELS_VELOCITY:
				setActualLeftWheelsVelocity((Double)newValue);
				return;
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__COMMANDED_ANGULAR_VELOCITY:
				setCommandedAngularVelocity((Double)newValue);
				return;
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__ACTUAL_ANGULAR_VELOCITY:
				setActualAngularVelocity((Double)newValue);
				return;
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__COMMANDED_TRANSLATION_VELOCITY:
				setCommandedTranslationVelocity((Double)newValue);
				return;
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__ACTUAL_TRANSLATION_VELOCITY:
				setActualTranslationVelocity((Double)newValue);
				return;
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__EFFECTIVE_STEERING_WIDTH:
				setEffectiveSteeringWidth((Double)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__COMMANDED_RIGHT_WHEELS_VELOCITY:
				setCommandedRightWheelsVelocity(COMMANDED_RIGHT_WHEELS_VELOCITY_EDEFAULT);
				return;
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__ACTUAL_RIGHT_WHEELS_VELOCITY:
				setActualRightWheelsVelocity(ACTUAL_RIGHT_WHEELS_VELOCITY_EDEFAULT);
				return;
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__COMMANDED_LEFT_WHEELS_VELOCITY:
				setCommandedLeftWheelsVelocity(COMMANDED_LEFT_WHEELS_VELOCITY_EDEFAULT);
				return;
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__ACTUAL_LEFT_WHEELS_VELOCITY:
				setActualLeftWheelsVelocity(ACTUAL_LEFT_WHEELS_VELOCITY_EDEFAULT);
				return;
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__COMMANDED_ANGULAR_VELOCITY:
				setCommandedAngularVelocity(COMMANDED_ANGULAR_VELOCITY_EDEFAULT);
				return;
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__ACTUAL_ANGULAR_VELOCITY:
				setActualAngularVelocity(ACTUAL_ANGULAR_VELOCITY_EDEFAULT);
				return;
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__COMMANDED_TRANSLATION_VELOCITY:
				setCommandedTranslationVelocity(COMMANDED_TRANSLATION_VELOCITY_EDEFAULT);
				return;
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__ACTUAL_TRANSLATION_VELOCITY:
				setActualTranslationVelocity(ACTUAL_TRANSLATION_VELOCITY_EDEFAULT);
				return;
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__EFFECTIVE_STEERING_WIDTH:
				setEffectiveSteeringWidth(EFFECTIVE_STEERING_WIDTH_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__COMMANDED_RIGHT_WHEELS_VELOCITY:
				return commandedRightWheelsVelocity != COMMANDED_RIGHT_WHEELS_VELOCITY_EDEFAULT;
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__ACTUAL_RIGHT_WHEELS_VELOCITY:
				return actualRightWheelsVelocity != ACTUAL_RIGHT_WHEELS_VELOCITY_EDEFAULT;
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__COMMANDED_LEFT_WHEELS_VELOCITY:
				return commandedLeftWheelsVelocity != COMMANDED_LEFT_WHEELS_VELOCITY_EDEFAULT;
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__ACTUAL_LEFT_WHEELS_VELOCITY:
				return actualLeftWheelsVelocity != ACTUAL_LEFT_WHEELS_VELOCITY_EDEFAULT;
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__COMMANDED_ANGULAR_VELOCITY:
				return commandedAngularVelocity != COMMANDED_ANGULAR_VELOCITY_EDEFAULT;
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__ACTUAL_ANGULAR_VELOCITY:
				return actualAngularVelocity != ACTUAL_ANGULAR_VELOCITY_EDEFAULT;
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__COMMANDED_TRANSLATION_VELOCITY:
				return commandedTranslationVelocity != COMMANDED_TRANSLATION_VELOCITY_EDEFAULT;
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__ACTUAL_TRANSLATION_VELOCITY:
				return actualTranslationVelocity != ACTUAL_TRANSLATION_VELOCITY_EDEFAULT;
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__EFFECTIVE_STEERING_WIDTH:
				return effectiveSteeringWidth != EFFECTIVE_STEERING_WIDTH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (commandedRightWheelsVelocity: ");
		result.append(commandedRightWheelsVelocity);
		result.append(", actualRightWheelsVelocity: ");
		result.append(actualRightWheelsVelocity);
		result.append(", commandedLeftWheelsVelocity: ");
		result.append(commandedLeftWheelsVelocity);
		result.append(", actualLeftWheelsVelocity: ");
		result.append(actualLeftWheelsVelocity);
		result.append(", commandedAngularVelocity: ");
		result.append(commandedAngularVelocity);
		result.append(", actualAngularVelocity: ");
		result.append(actualAngularVelocity);
		result.append(", commandedTranslationVelocity: ");
		result.append(commandedTranslationVelocity);
		result.append(", actualTranslationVelocity: ");
		result.append(actualTranslationVelocity);
		result.append(", effectiveSteeringWidth: ");
		result.append(effectiveSteeringWidth);
		result.append(')');
		return result.toString();
	}

} //SkidSteeredMobilePlatformImpl
