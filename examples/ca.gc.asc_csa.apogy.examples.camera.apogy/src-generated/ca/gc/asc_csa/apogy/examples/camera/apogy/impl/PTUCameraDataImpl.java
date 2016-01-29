/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.apogy.examples.camera.apogy.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.examples.camera.apogy.PTUCameraData;
import ca.gc.asc_csa.apogy.examples.camera.apogy.ApogyExamplesCameraApogyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PTU Camera Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.camera.apogy.impl.PTUCameraDataImpl#getPanAngle <em>Pan Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.camera.apogy.impl.PTUCameraDataImpl#getTiltAngle <em>Tilt Angle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PTUCameraDataImpl extends CameraDataImpl implements PTUCameraData
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PTUCameraDataImpl()
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
		return ApogyExamplesCameraApogyPackage.Literals.PTU_CAMERA_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPanAngle() {
		return panAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanAngle(double newPanAngle) {
		double oldPanAngle = panAngle;
		panAngle = newPanAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesCameraApogyPackage.PTU_CAMERA_DATA__PAN_ANGLE, oldPanAngle, panAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTiltAngle() {
		return tiltAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTiltAngle(double newTiltAngle) {
		double oldTiltAngle = tiltAngle;
		tiltAngle = newTiltAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesCameraApogyPackage.PTU_CAMERA_DATA__TILT_ANGLE, oldTiltAngle, tiltAngle));
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
			case ApogyExamplesCameraApogyPackage.PTU_CAMERA_DATA__PAN_ANGLE:
				return getPanAngle();
			case ApogyExamplesCameraApogyPackage.PTU_CAMERA_DATA__TILT_ANGLE:
				return getTiltAngle();
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
			case ApogyExamplesCameraApogyPackage.PTU_CAMERA_DATA__PAN_ANGLE:
				setPanAngle((Double)newValue);
				return;
			case ApogyExamplesCameraApogyPackage.PTU_CAMERA_DATA__TILT_ANGLE:
				setTiltAngle((Double)newValue);
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
			case ApogyExamplesCameraApogyPackage.PTU_CAMERA_DATA__PAN_ANGLE:
				setPanAngle(PAN_ANGLE_EDEFAULT);
				return;
			case ApogyExamplesCameraApogyPackage.PTU_CAMERA_DATA__TILT_ANGLE:
				setTiltAngle(TILT_ANGLE_EDEFAULT);
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
			case ApogyExamplesCameraApogyPackage.PTU_CAMERA_DATA__PAN_ANGLE:
				return panAngle != PAN_ANGLE_EDEFAULT;
			case ApogyExamplesCameraApogyPackage.PTU_CAMERA_DATA__TILT_ANGLE:
				return tiltAngle != TILT_ANGLE_EDEFAULT;
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
		result.append(" (panAngle: ");
		result.append(panAngle);
		result.append(", tiltAngle: ");
		result.append(tiltAngle);
		result.append(')');
		return result.toString();
	}

} //PTUCameraDataImpl
