package ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.impl;
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
import ca.gc.asc_csa.apogy.core.impl.ApogyInitializationDataImpl;
import ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.MobilePlatformData;
import ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.ApogyExamplesMobilePlatformApogyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mobile Platform Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.impl.MobilePlatformDataImpl#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.impl.MobilePlatformDataImpl#isDisposed <em>Disposed</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.impl.MobilePlatformDataImpl#getLinearVelocity <em>Linear Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.impl.MobilePlatformDataImpl#getAngularVelocity <em>Angular Velocity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobilePlatformDataImpl extends ApogyInitializationDataImpl implements MobilePlatformData {
	/**
	 * The default value of the '{@link #isInitialized() <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIALIZED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitialized() <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialized()
	 * @generated
	 * @ordered
	 */
	protected boolean initialized = INITIALIZED_EDEFAULT;

	/**
	 * The default value of the '{@link #isDisposed() <em>Disposed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisposed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISPOSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisposed() <em>Disposed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisposed()
	 * @generated
	 * @ordered
	 */
	protected boolean disposed = DISPOSED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinearVelocity() <em>Linear Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double LINEAR_VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLinearVelocity() <em>Linear Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearVelocity()
	 * @generated
	 * @ordered
	 */
	protected double linearVelocity = LINEAR_VELOCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAngularVelocity() <em>Angular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double ANGULAR_VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAngularVelocity() <em>Angular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected double angularVelocity = ANGULAR_VELOCITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobilePlatformDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesMobilePlatformApogyPackage.Literals.MOBILE_PLATFORM_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitialized() {
		return initialized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialized(boolean newInitialized) {
		boolean oldInitialized = initialized;
		initialized = newInitialized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesMobilePlatformApogyPackage.MOBILE_PLATFORM_DATA__INITIALIZED, oldInitialized, initialized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisposed() {
		return disposed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisposed(boolean newDisposed) {
		boolean oldDisposed = disposed;
		disposed = newDisposed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesMobilePlatformApogyPackage.MOBILE_PLATFORM_DATA__DISPOSED, oldDisposed, disposed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLinearVelocity() {
		return linearVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearVelocity(double newLinearVelocity) {
		double oldLinearVelocity = linearVelocity;
		linearVelocity = newLinearVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesMobilePlatformApogyPackage.MOBILE_PLATFORM_DATA__LINEAR_VELOCITY, oldLinearVelocity, linearVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAngularVelocity() {
		return angularVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngularVelocity(double newAngularVelocity) {
		double oldAngularVelocity = angularVelocity;
		angularVelocity = newAngularVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesMobilePlatformApogyPackage.MOBILE_PLATFORM_DATA__ANGULAR_VELOCITY, oldAngularVelocity, angularVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyExamplesMobilePlatformApogyPackage.MOBILE_PLATFORM_DATA__INITIALIZED:
				return isInitialized();
			case ApogyExamplesMobilePlatformApogyPackage.MOBILE_PLATFORM_DATA__DISPOSED:
				return isDisposed();
			case ApogyExamplesMobilePlatformApogyPackage.MOBILE_PLATFORM_DATA__LINEAR_VELOCITY:
				return getLinearVelocity();
			case ApogyExamplesMobilePlatformApogyPackage.MOBILE_PLATFORM_DATA__ANGULAR_VELOCITY:
				return getAngularVelocity();
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
			case ApogyExamplesMobilePlatformApogyPackage.MOBILE_PLATFORM_DATA__INITIALIZED:
				setInitialized((Boolean)newValue);
				return;
			case ApogyExamplesMobilePlatformApogyPackage.MOBILE_PLATFORM_DATA__DISPOSED:
				setDisposed((Boolean)newValue);
				return;
			case ApogyExamplesMobilePlatformApogyPackage.MOBILE_PLATFORM_DATA__LINEAR_VELOCITY:
				setLinearVelocity((Double)newValue);
				return;
			case ApogyExamplesMobilePlatformApogyPackage.MOBILE_PLATFORM_DATA__ANGULAR_VELOCITY:
				setAngularVelocity((Double)newValue);
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
			case ApogyExamplesMobilePlatformApogyPackage.MOBILE_PLATFORM_DATA__INITIALIZED:
				setInitialized(INITIALIZED_EDEFAULT);
				return;
			case ApogyExamplesMobilePlatformApogyPackage.MOBILE_PLATFORM_DATA__DISPOSED:
				setDisposed(DISPOSED_EDEFAULT);
				return;
			case ApogyExamplesMobilePlatformApogyPackage.MOBILE_PLATFORM_DATA__LINEAR_VELOCITY:
				setLinearVelocity(LINEAR_VELOCITY_EDEFAULT);
				return;
			case ApogyExamplesMobilePlatformApogyPackage.MOBILE_PLATFORM_DATA__ANGULAR_VELOCITY:
				setAngularVelocity(ANGULAR_VELOCITY_EDEFAULT);
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
			case ApogyExamplesMobilePlatformApogyPackage.MOBILE_PLATFORM_DATA__INITIALIZED:
				return initialized != INITIALIZED_EDEFAULT;
			case ApogyExamplesMobilePlatformApogyPackage.MOBILE_PLATFORM_DATA__DISPOSED:
				return disposed != DISPOSED_EDEFAULT;
			case ApogyExamplesMobilePlatformApogyPackage.MOBILE_PLATFORM_DATA__LINEAR_VELOCITY:
				return linearVelocity != LINEAR_VELOCITY_EDEFAULT;
			case ApogyExamplesMobilePlatformApogyPackage.MOBILE_PLATFORM_DATA__ANGULAR_VELOCITY:
				return angularVelocity != ANGULAR_VELOCITY_EDEFAULT;
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
		result.append(" (initialized: ");
		result.append(initialized);
		result.append(", disposed: ");
		result.append(disposed);
		result.append(", linearVelocity: ");
		result.append(linearVelocity);
		result.append(", angularVelocity: ");
		result.append(angularVelocity);
		result.append(')');
		return result.toString();
	}

} //MobilePlatformDataImpl
