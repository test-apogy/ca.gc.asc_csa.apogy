/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleRangeSensorImpl.java,v 1.3.4.2 2015/05/21 15:50:21 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.range.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.sensors.range.Symphony__AddonsSensorsRangePackage;
import org.eclipse.symphony.addons.sensors.range.SimpleRangeSensor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Range Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.impl.SimpleRangeSensorImpl#getDistanceMeasured <em>Distance Measured</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleRangeSensorImpl extends RangeSensorImpl implements SimpleRangeSensor
{
	/**
	 * The default value of the '{@link #getDistanceMeasured() <em>Distance Measured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceMeasured()
	 * @generated
	 * @ordered
	 */
	protected static final double DISTANCE_MEASURED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDistanceMeasured() <em>Distance Measured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceMeasured()
	 * @generated
	 * @ordered
	 */
	protected double distanceMeasured = DISTANCE_MEASURED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleRangeSensorImpl()
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
		return Symphony__AddonsSensorsRangePackage.Literals.SIMPLE_RANGE_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDistanceMeasured()
	{
		return distanceMeasured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceMeasured(double newDistanceMeasured)
	{
		double oldDistanceMeasured = distanceMeasured;
		distanceMeasured = newDistanceMeasured;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsSensorsRangePackage.SIMPLE_RANGE_SENSOR__DISTANCE_MEASURED, oldDistanceMeasured, distanceMeasured));
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
			case Symphony__AddonsSensorsRangePackage.SIMPLE_RANGE_SENSOR__DISTANCE_MEASURED:
				return getDistanceMeasured();
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
			case Symphony__AddonsSensorsRangePackage.SIMPLE_RANGE_SENSOR__DISTANCE_MEASURED:
				setDistanceMeasured((Double)newValue);
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
			case Symphony__AddonsSensorsRangePackage.SIMPLE_RANGE_SENSOR__DISTANCE_MEASURED:
				setDistanceMeasured(DISTANCE_MEASURED_EDEFAULT);
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
			case Symphony__AddonsSensorsRangePackage.SIMPLE_RANGE_SENSOR__DISTANCE_MEASURED:
				return distanceMeasured != DISTANCE_MEASURED_EDEFAULT;
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
		result.append(" (distanceMeasured: ");
		result.append(distanceMeasured);
		result.append(')');
		return result.toString();
	}

} //SimpleRangeSensorImpl
