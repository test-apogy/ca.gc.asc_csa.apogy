/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.symphony.examples.satellite.AcquireImageSatelliteCommand;
import org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acquire Image Satellite Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.AcquireImageSatelliteCommandImpl#getRollAngle <em>Roll Angle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcquireImageSatelliteCommandImpl extends AbstractSatelliteCommandImpl implements AcquireImageSatelliteCommand {
	/**
	 * The default value of the '{@link #getRollAngle() <em>Roll Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double ROLL_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRollAngle() <em>Roll Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollAngle()
	 * @generated
	 * @ordered
	 */
	protected double rollAngle = ROLL_ANGLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcquireImageSatelliteCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__ExamplesSatellitePackage.Literals.ACQUIRE_IMAGE_SATELLITE_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRollAngle() {
		return rollAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRollAngle(double newRollAngle) {
		double oldRollAngle = rollAngle;
		rollAngle = newRollAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__ExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__ROLL_ANGLE, oldRollAngle, rollAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__ExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__ROLL_ANGLE:
				return getRollAngle();
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
			case Symphony__ExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__ROLL_ANGLE:
				setRollAngle((Double)newValue);
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
			case Symphony__ExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__ROLL_ANGLE:
				setRollAngle(ROLL_ANGLE_EDEFAULT);
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
			case Symphony__ExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__ROLL_ANGLE:
				return rollAngle != ROLL_ANGLE_EDEFAULT;
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
		result.append(" (rollAngle: ");
		result.append(rollAngle);
		result.append(')');
		return result.toString();
	}

} //AcquireImageSatelliteCommandImpl
