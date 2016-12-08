/**
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
package ca.gc.asc_csa.apogy.core.environment.surface.ui.impl;

import ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.VehicleVariableAnnotation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle Variable Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.VehicleVariableAnnotationImpl#getVehicleLength <em>Vehicle Length</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.VehicleVariableAnnotationImpl#getVehicleWidth <em>Vehicle Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehicleVariableAnnotationImpl extends PoseVariableAnnotationImpl implements VehicleVariableAnnotation {
	/**
	 * The default value of the '{@link #getVehicleLength() <em>Vehicle Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleLength()
	 * @generated
	 * @ordered
	 */
	protected static final double VEHICLE_LENGTH_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getVehicleLength() <em>Vehicle Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleLength()
	 * @generated
	 * @ordered
	 */
	protected double vehicleLength = VEHICLE_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getVehicleWidth() <em>Vehicle Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double VEHICLE_WIDTH_EDEFAULT = 0.5;

	/**
	 * The cached value of the '{@link #getVehicleWidth() <em>Vehicle Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleWidth()
	 * @generated
	 * @ordered
	 */
	protected double vehicleWidth = VEHICLE_WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleVariableAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogySurfaceEnvironmentUIPackage.Literals.VEHICLE_VARIABLE_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVehicleLength() {
		return vehicleLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicleLength(double newVehicleLength) {
		double oldVehicleLength = vehicleLength;
		vehicleLength = newVehicleLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentUIPackage.VEHICLE_VARIABLE_ANNOTATION__VEHICLE_LENGTH, oldVehicleLength, vehicleLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVehicleWidth() {
		return vehicleWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicleWidth(double newVehicleWidth) {
		double oldVehicleWidth = vehicleWidth;
		vehicleWidth = newVehicleWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentUIPackage.VEHICLE_VARIABLE_ANNOTATION__VEHICLE_WIDTH, oldVehicleWidth, vehicleWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogySurfaceEnvironmentUIPackage.VEHICLE_VARIABLE_ANNOTATION__VEHICLE_LENGTH:
				return getVehicleLength();
			case ApogySurfaceEnvironmentUIPackage.VEHICLE_VARIABLE_ANNOTATION__VEHICLE_WIDTH:
				return getVehicleWidth();
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
			case ApogySurfaceEnvironmentUIPackage.VEHICLE_VARIABLE_ANNOTATION__VEHICLE_LENGTH:
				setVehicleLength((Double)newValue);
				return;
			case ApogySurfaceEnvironmentUIPackage.VEHICLE_VARIABLE_ANNOTATION__VEHICLE_WIDTH:
				setVehicleWidth((Double)newValue);
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
			case ApogySurfaceEnvironmentUIPackage.VEHICLE_VARIABLE_ANNOTATION__VEHICLE_LENGTH:
				setVehicleLength(VEHICLE_LENGTH_EDEFAULT);
				return;
			case ApogySurfaceEnvironmentUIPackage.VEHICLE_VARIABLE_ANNOTATION__VEHICLE_WIDTH:
				setVehicleWidth(VEHICLE_WIDTH_EDEFAULT);
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
			case ApogySurfaceEnvironmentUIPackage.VEHICLE_VARIABLE_ANNOTATION__VEHICLE_LENGTH:
				return vehicleLength != VEHICLE_LENGTH_EDEFAULT;
			case ApogySurfaceEnvironmentUIPackage.VEHICLE_VARIABLE_ANNOTATION__VEHICLE_WIDTH:
				return vehicleWidth != VEHICLE_WIDTH_EDEFAULT;
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
		result.append(" (vehicleLength: ");
		result.append(vehicleLength);
		result.append(", vehicleWidth: ");
		result.append(vehicleWidth);
		result.append(')');
		return result.toString();
	}

} //VehicleVariableAnnotationImpl
