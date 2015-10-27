/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage;
import org.eclipse.symphony.examples.satellite.SatelliteCommandRoll;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Satellite Command Roll</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.SatelliteCommandRollImpl#getTargetRollAngle <em>Target Roll Angle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SatelliteCommandRollImpl extends SatelliteCommandImpl implements SatelliteCommandRoll {
	/**
	 * The default value of the '{@link #getTargetRollAngle() <em>Target Roll Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRollAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double TARGET_ROLL_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTargetRollAngle() <em>Target Roll Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRollAngle()
	 * @generated
	 * @ordered
	 */
	protected double targetRollAngle = TARGET_ROLL_ANGLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SatelliteCommandRollImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__ExamplesSatellitePackage.Literals.SATELLITE_COMMAND_ROLL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTargetRollAngle() {
		return targetRollAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRollAngle(double newTargetRollAngle) {
		double oldTargetRollAngle = targetRollAngle;
		targetRollAngle = newTargetRollAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__ExamplesSatellitePackage.SATELLITE_COMMAND_ROLL__TARGET_ROLL_ANGLE, oldTargetRollAngle, targetRollAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__ExamplesSatellitePackage.SATELLITE_COMMAND_ROLL__TARGET_ROLL_ANGLE:
				return getTargetRollAngle();
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
			case Symphony__ExamplesSatellitePackage.SATELLITE_COMMAND_ROLL__TARGET_ROLL_ANGLE:
				setTargetRollAngle((Double)newValue);
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
			case Symphony__ExamplesSatellitePackage.SATELLITE_COMMAND_ROLL__TARGET_ROLL_ANGLE:
				setTargetRollAngle(TARGET_ROLL_ANGLE_EDEFAULT);
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
			case Symphony__ExamplesSatellitePackage.SATELLITE_COMMAND_ROLL__TARGET_ROLL_ANGLE:
				return targetRollAngle != TARGET_ROLL_ANGLE_EDEFAULT;
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
		result.append(" (targetRollAngle: ");
		result.append(targetRollAngle);
		result.append(')');
		return result.toString();
	}

} //SatelliteCommandRollImpl
