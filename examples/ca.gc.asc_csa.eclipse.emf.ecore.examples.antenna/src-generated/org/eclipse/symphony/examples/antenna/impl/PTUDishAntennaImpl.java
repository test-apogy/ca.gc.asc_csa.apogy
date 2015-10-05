/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.antenna.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.examples.antenna.EMFEcoreExampleAntennaPackage;
import org.eclipse.symphony.examples.antenna.PTUDishAntenna;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PTU Dish Antenna</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.antenna.impl.PTUDishAntennaImpl#getPanAngle <em>Pan Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.antenna.impl.PTUDishAntennaImpl#getTiltAngle <em>Tilt Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.antenna.impl.PTUDishAntennaImpl#isTrackingSun <em>Tracking Sun</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PTUDishAntennaImpl extends DishAntennaImpl implements PTUDishAntenna
{
	/**
	 * The default value of the '{@link #getPanAngle() <em>Pan Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double PAN_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPanAngle() <em>Pan Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanAngle()
	 * @generated
	 * @ordered
	 */
	protected double panAngle = PAN_ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTiltAngle() <em>Tilt Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiltAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double TILT_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTiltAngle() <em>Tilt Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiltAngle()
	 * @generated
	 * @ordered
	 */
	protected double tiltAngle = TILT_ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isTrackingSun() <em>Tracking Sun</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrackingSun()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRACKING_SUN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTrackingSun() <em>Tracking Sun</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrackingSun()
	 * @generated
	 * @ordered
	 */
	protected boolean trackingSun = TRACKING_SUN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PTUDishAntennaImpl()
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
		return EMFEcoreExampleAntennaPackage.Literals.PTU_DISH_ANTENNA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPanAngle()
	{
		return panAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanAngle(double newPanAngle)
	{
		double oldPanAngle = panAngle;
		panAngle = newPanAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleAntennaPackage.PTU_DISH_ANTENNA__PAN_ANGLE, oldPanAngle, panAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTiltAngle()
	{
		return tiltAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTiltAngle(double newTiltAngle)
	{
		double oldTiltAngle = tiltAngle;
		tiltAngle = newTiltAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleAntennaPackage.PTU_DISH_ANTENNA__TILT_ANGLE, oldTiltAngle, tiltAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTrackingSun() {
		return trackingSun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackingSun(boolean newTrackingSun) {
		boolean oldTrackingSun = trackingSun;
		trackingSun = newTrackingSun;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleAntennaPackage.PTU_DISH_ANTENNA__TRACKING_SUN, oldTrackingSun, trackingSun));
	}

	/**
	 * Command the PTU (and implicitly the camera) to move to the
	 * specified pan and tilt angles.
	 * @param panAngle The target pan angle for the PTU (given in radians.)
	 * @param tiltAngle The target tilt angle for the PTU (given in radians.)
	 * @generated_NOT
	 */
	abstract public void moveTo(double panAngle, double tiltAngle);

	/**
	 * This is used to toggle whether the PTU (and implicitly the
	 * antenna mounted on it) should be following the sun.  If
	 * true, then the antenna will continue tracking the sun until
	 * it is told otherwise.
	 *
	 * @param track Whether or not the PTU antenna should be following the sun.
	 * @generated_NOT
	 */
	abstract public void trackSun(boolean track);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case EMFEcoreExampleAntennaPackage.PTU_DISH_ANTENNA__PAN_ANGLE:
				return getPanAngle();
			case EMFEcoreExampleAntennaPackage.PTU_DISH_ANTENNA__TILT_ANGLE:
				return getTiltAngle();
			case EMFEcoreExampleAntennaPackage.PTU_DISH_ANTENNA__TRACKING_SUN:
				return isTrackingSun();
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
			case EMFEcoreExampleAntennaPackage.PTU_DISH_ANTENNA__PAN_ANGLE:
				setPanAngle((Double)newValue);
				return;
			case EMFEcoreExampleAntennaPackage.PTU_DISH_ANTENNA__TILT_ANGLE:
				setTiltAngle((Double)newValue);
				return;
			case EMFEcoreExampleAntennaPackage.PTU_DISH_ANTENNA__TRACKING_SUN:
				setTrackingSun((Boolean)newValue);
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
			case EMFEcoreExampleAntennaPackage.PTU_DISH_ANTENNA__PAN_ANGLE:
				setPanAngle(PAN_ANGLE_EDEFAULT);
				return;
			case EMFEcoreExampleAntennaPackage.PTU_DISH_ANTENNA__TILT_ANGLE:
				setTiltAngle(TILT_ANGLE_EDEFAULT);
				return;
			case EMFEcoreExampleAntennaPackage.PTU_DISH_ANTENNA__TRACKING_SUN:
				setTrackingSun(TRACKING_SUN_EDEFAULT);
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
			case EMFEcoreExampleAntennaPackage.PTU_DISH_ANTENNA__PAN_ANGLE:
				return panAngle != PAN_ANGLE_EDEFAULT;
			case EMFEcoreExampleAntennaPackage.PTU_DISH_ANTENNA__TILT_ANGLE:
				return tiltAngle != TILT_ANGLE_EDEFAULT;
			case EMFEcoreExampleAntennaPackage.PTU_DISH_ANTENNA__TRACKING_SUN:
				return trackingSun != TRACKING_SUN_EDEFAULT;
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
			case EMFEcoreExampleAntennaPackage.PTU_DISH_ANTENNA___MOVE_TO__DOUBLE_DOUBLE:
				moveTo((Double)arguments.get(0), (Double)arguments.get(1));
				return null;
			case EMFEcoreExampleAntennaPackage.PTU_DISH_ANTENNA___TRACK_SUN__BOOLEAN:
				trackSun((Boolean)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (panAngle: ");
		result.append(panAngle);
		result.append(", tiltAngle: ");
		result.append(tiltAngle);
		result.append(", trackingSun: ");
		result.append(trackingSun);
		result.append(')');
		return result.toString();
	}

} //PTUDishAntennaImpl
