package ca.gc.asc_csa.apogy.examples.lidar.impl;
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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.addons.sensors.fov.RectangularFrustrumFieldOfView;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.examples.lidar.ApogyExamplesLidarPackage;
import ca.gc.asc_csa.apogy.examples.lidar.Lidar;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lidar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.lidar.impl.LidarImpl#getFov <em>Fov</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.lidar.impl.LidarImpl#isInitialized <em>Initialized</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LidarImpl extends MinimalEObjectImpl.Container implements Lidar
{
	/**
	 * The cached value of the '{@link #getFov() <em>Fov</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFov()
	 * @generated
	 * @ordered
	 */
	protected RectangularFrustrumFieldOfView fov;
	
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LidarImpl()
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
		return ApogyExamplesLidarPackage.Literals.LIDAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangularFrustrumFieldOfView getFov()
	{
		return fov;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFov(RectangularFrustrumFieldOfView newFov, NotificationChain msgs)
	{
		RectangularFrustrumFieldOfView oldFov = fov;
		fov = newFov;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyExamplesLidarPackage.LIDAR__FOV, oldFov, newFov);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFov(RectangularFrustrumFieldOfView newFov)
	{
		if (newFov != fov) {
			NotificationChain msgs = null;
			if (fov != null)
				msgs = ((InternalEObject)fov).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesLidarPackage.LIDAR__FOV, null, msgs);
			if (newFov != null)
				msgs = ((InternalEObject)newFov).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesLidarPackage.LIDAR__FOV, null, msgs);
			msgs = basicSetFov(newFov, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesLidarPackage.LIDAR__FOV, newFov, newFov));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesLidarPackage.LIDAR__INITIALIZED, oldInitialized, initialized));
	}

	/**
	 * This operation is used to perform the steps necessary to initialize
	 * the Lidar unit.
	 * @return Whether or not the Lidar's initialization was successfully completed
	 * @generated_NOT
	 */
	abstract public boolean init();

	/**
	 * This operation is used to acquire a depth scan of the field of view, with the given
	 * horizontal and vertical resolution.
	 * <p>
	 * Note: This method operates synchronously and will block until the entire scan has been
	 *       completed.  
	 * @param horizontalResolution The horizontal angular resolution of the scan (in radians.)
	 * @param verticalResolution The vertical angular resolution of the scan (in radians.)
	 * @return The resulting scan with the given horizontal and vertical angular resolution.
	 * @see #acquireScanNonBlocking(double, double)
	 * @generated_NOT
	 */
	abstract public CartesianCoordinatesSet acquireScan(double horizontalResolution,
														double verticalResolution);

	/**
	 * This operation is used to acquire a depth scan of the field of view, with the given
	 * horizontal and vertical resolution.
	 * <p>
	 * Note: This method operates asynchronously and as such, will return immediately, even
	 *       if the scan is not yet completed.
	 * @param horizontalResolution The horizontal angular resolution of the scan (in radians.)
	 * @param verticalResolution The vertical angular resolution of the scan (in radians.)
	 * @return The resulting scan with the given horizontal and vertical angular resolution.
	 * @see #acquireScan(double, double)
	 * @generated_NOT
	 */
	abstract public CartesianCoordinatesSet acquireScanNonBlocking(double horizontalResolution,
																   double verticalResolution);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID) {
			case ApogyExamplesLidarPackage.LIDAR__FOV:
				return basicSetFov(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case ApogyExamplesLidarPackage.LIDAR__FOV:
				return getFov();
			case ApogyExamplesLidarPackage.LIDAR__INITIALIZED:
				return isInitialized();
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
			case ApogyExamplesLidarPackage.LIDAR__FOV:
				setFov((RectangularFrustrumFieldOfView)newValue);
				return;
			case ApogyExamplesLidarPackage.LIDAR__INITIALIZED:
				setInitialized((Boolean)newValue);
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
			case ApogyExamplesLidarPackage.LIDAR__FOV:
				setFov((RectangularFrustrumFieldOfView)null);
				return;
			case ApogyExamplesLidarPackage.LIDAR__INITIALIZED:
				setInitialized(INITIALIZED_EDEFAULT);
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
			case ApogyExamplesLidarPackage.LIDAR__FOV:
				return fov != null;
			case ApogyExamplesLidarPackage.LIDAR__INITIALIZED:
				return initialized != INITIALIZED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
	{
		switch (operationID) {
			case ApogyExamplesLidarPackage.LIDAR___INIT:
				return init();
			case ApogyExamplesLidarPackage.LIDAR___ACQUIRE_SCAN__DOUBLE_DOUBLE:
				return acquireScan((Double)arguments.get(0), (Double)arguments.get(1));
			case ApogyExamplesLidarPackage.LIDAR___ACQUIRE_SCAN_NON_BLOCKING__DOUBLE_DOUBLE:
				return acquireScanNonBlocking((Double)arguments.get(0), (Double)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(')');
		return result.toString();
	}

} //LidarImpl
