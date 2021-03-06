package ca.gc.asc_csa.apogy.addons.sensors.fov.impl;
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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.addons.sensors.fov.AngularSpan;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage;
import ca.gc.asc_csa.apogy.common.math.GeometricUtils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Angular Span</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.impl.AngularSpanImpl#getMinimumAngle <em>Minimum Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.impl.AngularSpanImpl#getMaximumAngle <em>Maximum Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.impl.AngularSpanImpl#getSpanningAngle <em>Spanning Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.impl.AngularSpanImpl#getCenterAngle <em>Center Angle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AngularSpanImpl extends MinimalEObjectImpl.Container implements AngularSpan {
	/**
	 * The default value of the '{@link #getMinimumAngle() <em>Minimum Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimumAngle() <em>Minimum Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumAngle()
	 * @generated
	 * @ordered
	 */
	protected double minimumAngle = MINIMUM_ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumAngle() <em>Maximum Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximumAngle() <em>Maximum Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumAngle()
	 * @generated
	 * @ordered
	 */
	protected double maximumAngle = MAXIMUM_ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpanningAngle() <em>Spanning Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpanningAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double SPANNING_ANGLE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getCenterAngle() <em>Center Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double CENTER_ANGLE_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngularSpanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsSensorsFOVPackage.Literals.ANGULAR_SPAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimumAngle() {
		return minimumAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumAngle(double newMinimumAngle) {
		double oldMinimumAngle = minimumAngle;
		minimumAngle = newMinimumAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsFOVPackage.ANGULAR_SPAN__MINIMUM_ANGLE, oldMinimumAngle, minimumAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumAngle() {
		return maximumAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumAngle(double newMaximumAngle) {
		double oldMaximumAngle = maximumAngle;
		maximumAngle = newMaximumAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsFOVPackage.ANGULAR_SPAN__MAXIMUM_ANGLE, oldMaximumAngle, maximumAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double getSpanningAngle() 
	{
		return getMaximumAngle() - getMinimumAngle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double getCenterAngle()
	{		
		return (getMinimumAngle() +  getMaximumAngle()) / 2.0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public boolean isWithinRange(double angle)
	{
		double min = GeometricUtils.normalizeAngleToPositiveValue(getMinimumAngle());
		double max = GeometricUtils.normalizeAngleToPositiveValue(getMaximumAngle());
		double normalizedAngle = GeometricUtils.normalizeAngleToPositiveValue(angle);
		return ((normalizedAngle >= min) && (normalizedAngle <= max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsSensorsFOVPackage.ANGULAR_SPAN__MINIMUM_ANGLE:
				return getMinimumAngle();
			case ApogyAddonsSensorsFOVPackage.ANGULAR_SPAN__MAXIMUM_ANGLE:
				return getMaximumAngle();
			case ApogyAddonsSensorsFOVPackage.ANGULAR_SPAN__SPANNING_ANGLE:
				return getSpanningAngle();
			case ApogyAddonsSensorsFOVPackage.ANGULAR_SPAN__CENTER_ANGLE:
				return getCenterAngle();
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
			case ApogyAddonsSensorsFOVPackage.ANGULAR_SPAN__MINIMUM_ANGLE:
				setMinimumAngle((Double)newValue);
				return;
			case ApogyAddonsSensorsFOVPackage.ANGULAR_SPAN__MAXIMUM_ANGLE:
				setMaximumAngle((Double)newValue);
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
			case ApogyAddonsSensorsFOVPackage.ANGULAR_SPAN__MINIMUM_ANGLE:
				setMinimumAngle(MINIMUM_ANGLE_EDEFAULT);
				return;
			case ApogyAddonsSensorsFOVPackage.ANGULAR_SPAN__MAXIMUM_ANGLE:
				setMaximumAngle(MAXIMUM_ANGLE_EDEFAULT);
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
			case ApogyAddonsSensorsFOVPackage.ANGULAR_SPAN__MINIMUM_ANGLE:
				return minimumAngle != MINIMUM_ANGLE_EDEFAULT;
			case ApogyAddonsSensorsFOVPackage.ANGULAR_SPAN__MAXIMUM_ANGLE:
				return maximumAngle != MAXIMUM_ANGLE_EDEFAULT;
			case ApogyAddonsSensorsFOVPackage.ANGULAR_SPAN__SPANNING_ANGLE:
				return getSpanningAngle() != SPANNING_ANGLE_EDEFAULT;
			case ApogyAddonsSensorsFOVPackage.ANGULAR_SPAN__CENTER_ANGLE:
				return getCenterAngle() != CENTER_ANGLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyAddonsSensorsFOVPackage.ANGULAR_SPAN___IS_WITHIN_RANGE__DOUBLE:
				return isWithinRange((Double)arguments.get(0));
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
		result.append(" (minimumAngle: ");
		result.append(minimumAngle);
		result.append(", maximumAngle: ");
		result.append(maximumAngle);
		result.append(')');
		return result.toString();
	}

} //AngularSpanImpl
