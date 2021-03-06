package ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl;
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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.common.math.Matrix3x3;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ElevationMask;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ground Station</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.GroundStationImpl#getFieldOfViewOrientation <em>Field Of View Orientation</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.GroundStationImpl#getElevationMask <em>Elevation Mask</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroundStationImpl extends EarthSurfaceLocationImpl implements GroundStation {
	/**
	 * The cached value of the '{@link #getFieldOfViewOrientation() <em>Field Of View Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldOfViewOrientation()
	 * @generated
	 * @ordered
	 */
	protected Matrix3x3 fieldOfViewOrientation;
	/**
	 * The cached value of the '{@link #getElevationMask() <em>Elevation Mask</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevationMask()
	 * @generated
	 * @ordered
	 */
	protected ElevationMask elevationMask;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroundStationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentOrbitEarthPackage.Literals.GROUND_STATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix3x3 getFieldOfViewOrientation() {
		return fieldOfViewOrientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFieldOfViewOrientation(Matrix3x3 newFieldOfViewOrientation, NotificationChain msgs) {
		Matrix3x3 oldFieldOfViewOrientation = fieldOfViewOrientation;
		fieldOfViewOrientation = newFieldOfViewOrientation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.GROUND_STATION__FIELD_OF_VIEW_ORIENTATION, oldFieldOfViewOrientation, newFieldOfViewOrientation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldOfViewOrientation(Matrix3x3 newFieldOfViewOrientation) {
		if (newFieldOfViewOrientation != fieldOfViewOrientation) {
			NotificationChain msgs = null;
			if (fieldOfViewOrientation != null)
				msgs = ((InternalEObject)fieldOfViewOrientation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitEarthPackage.GROUND_STATION__FIELD_OF_VIEW_ORIENTATION, null, msgs);
			if (newFieldOfViewOrientation != null)
				msgs = ((InternalEObject)newFieldOfViewOrientation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitEarthPackage.GROUND_STATION__FIELD_OF_VIEW_ORIENTATION, null, msgs);
			msgs = basicSetFieldOfViewOrientation(newFieldOfViewOrientation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.GROUND_STATION__FIELD_OF_VIEW_ORIENTATION, newFieldOfViewOrientation, newFieldOfViewOrientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevationMask getElevationMask() {
		return elevationMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElevationMask(ElevationMask newElevationMask, NotificationChain msgs) {
		ElevationMask oldElevationMask = elevationMask;
		elevationMask = newElevationMask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.GROUND_STATION__ELEVATION_MASK, oldElevationMask, newElevationMask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElevationMask(ElevationMask newElevationMask) {
		if (newElevationMask != elevationMask) {
			NotificationChain msgs = null;
			if (elevationMask != null)
				msgs = ((InternalEObject)elevationMask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitEarthPackage.GROUND_STATION__ELEVATION_MASK, null, msgs);
			if (newElevationMask != null)
				msgs = ((InternalEObject)newElevationMask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitEarthPackage.GROUND_STATION__ELEVATION_MASK, null, msgs);
			msgs = basicSetElevationMask(newElevationMask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.GROUND_STATION__ELEVATION_MASK, newElevationMask, newElevationMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreEnvironmentOrbitEarthPackage.GROUND_STATION__FIELD_OF_VIEW_ORIENTATION:
				return basicSetFieldOfViewOrientation(null, msgs);
			case ApogyCoreEnvironmentOrbitEarthPackage.GROUND_STATION__ELEVATION_MASK:
				return basicSetElevationMask(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreEnvironmentOrbitEarthPackage.GROUND_STATION__FIELD_OF_VIEW_ORIENTATION:
				return getFieldOfViewOrientation();
			case ApogyCoreEnvironmentOrbitEarthPackage.GROUND_STATION__ELEVATION_MASK:
				return getElevationMask();
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
			case ApogyCoreEnvironmentOrbitEarthPackage.GROUND_STATION__FIELD_OF_VIEW_ORIENTATION:
				setFieldOfViewOrientation((Matrix3x3)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.GROUND_STATION__ELEVATION_MASK:
				setElevationMask((ElevationMask)newValue);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.GROUND_STATION__FIELD_OF_VIEW_ORIENTATION:
				setFieldOfViewOrientation((Matrix3x3)null);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.GROUND_STATION__ELEVATION_MASK:
				setElevationMask((ElevationMask)null);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.GROUND_STATION__FIELD_OF_VIEW_ORIENTATION:
				return fieldOfViewOrientation != null;
			case ApogyCoreEnvironmentOrbitEarthPackage.GROUND_STATION__ELEVATION_MASK:
				return elevationMask != null;
		}
		return super.eIsSet(featureID);
	}

} //GroundStationImpl
