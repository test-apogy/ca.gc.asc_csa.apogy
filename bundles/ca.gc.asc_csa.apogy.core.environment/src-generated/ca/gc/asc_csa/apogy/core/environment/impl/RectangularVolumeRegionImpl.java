package ca.gc.asc_csa.apogy.core.environment.impl;
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
import ca.gc.asc_csa.apogy.core.environment.RectangularVolumeRegion;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rectangular Volume Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.RectangularVolumeRegionImpl#getZMin <em>ZMin</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.RectangularVolumeRegionImpl#getZMax <em>ZMax</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.RectangularVolumeRegionImpl#getZDimension <em>ZDimension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RectangularVolumeRegionImpl extends RectangularRegionImpl implements RectangularVolumeRegion {
	/**
	 * The default value of the '{@link #getZMin() <em>ZMin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZMin()
	 * @generated
	 * @ordered
	 */
	protected static final double ZMIN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getZMin() <em>ZMin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZMin()
	 * @generated
	 * @ordered
	 */
	protected double zMin = ZMIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getZMax() <em>ZMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZMax()
	 * @generated
	 * @ordered
	 */
	protected static final double ZMAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getZMax() <em>ZMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZMax()
	 * @generated
	 * @ordered
	 */
	protected double zMax = ZMAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getZDimension() <em>ZDimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZDimension()
	 * @generated
	 * @ordered
	 */
	protected static final double ZDIMENSION_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RectangularVolumeRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentPackage.Literals.RECTANGULAR_VOLUME_REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getZMin() {
		return zMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZMin(double newZMin) {
		double oldZMin = zMin;
		zMin = newZMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.RECTANGULAR_VOLUME_REGION__ZMIN, oldZMin, zMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getZMax() {
		return zMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZMax(double newZMax) {
		double oldZMax = zMax;
		zMax = newZMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.RECTANGULAR_VOLUME_REGION__ZMAX, oldZMax, zMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double getZDimension() 
	{
		return getZMax() - getZMin();
	}
	  
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreEnvironmentPackage.RECTANGULAR_VOLUME_REGION__ZMIN:
				return getZMin();
			case ApogyCoreEnvironmentPackage.RECTANGULAR_VOLUME_REGION__ZMAX:
				return getZMax();
			case ApogyCoreEnvironmentPackage.RECTANGULAR_VOLUME_REGION__ZDIMENSION:
				return getZDimension();
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
			case ApogyCoreEnvironmentPackage.RECTANGULAR_VOLUME_REGION__ZMIN:
				setZMin((Double)newValue);
				return;
			case ApogyCoreEnvironmentPackage.RECTANGULAR_VOLUME_REGION__ZMAX:
				setZMax((Double)newValue);
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
			case ApogyCoreEnvironmentPackage.RECTANGULAR_VOLUME_REGION__ZMIN:
				setZMin(ZMIN_EDEFAULT);
				return;
			case ApogyCoreEnvironmentPackage.RECTANGULAR_VOLUME_REGION__ZMAX:
				setZMax(ZMAX_EDEFAULT);
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
			case ApogyCoreEnvironmentPackage.RECTANGULAR_VOLUME_REGION__ZMIN:
				return zMin != ZMIN_EDEFAULT;
			case ApogyCoreEnvironmentPackage.RECTANGULAR_VOLUME_REGION__ZMAX:
				return zMax != ZMAX_EDEFAULT;
			case ApogyCoreEnvironmentPackage.RECTANGULAR_VOLUME_REGION__ZDIMENSION:
				return getZDimension() != ZDIMENSION_EDEFAULT;
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
		result.append(" (zMin: ");
		result.append(zMin);
		result.append(", zMax: ");
		result.append(zMax);
		result.append(')');
		return result.toString();
	}

} //RectangularVolumeRegionImpl
