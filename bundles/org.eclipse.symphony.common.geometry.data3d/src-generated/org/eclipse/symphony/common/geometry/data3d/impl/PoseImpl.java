/**
 * Canadian Space Agency 2007.
 *
 * $Id: PoseImpl.java,v 1.2.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package org.eclipse.symphony.common.geometry.data3d.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.geometry.data3d.CartesianOrientationCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage;
import org.eclipse.symphony.common.geometry.data3d.Pose;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.impl.PoseImpl#getXRotation <em>XRotation</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.impl.PoseImpl#getYRotation <em>YRotation</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.impl.PoseImpl#getZRotation <em>ZRotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PoseImpl extends CartesianPositionCoordinatesImpl implements Pose {
	/**
	 * The default value of the '{@link #getXRotation() <em>XRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRotation()
	 * @generated
	 * @ordered
	 */
	protected static final double XROTATION_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getXRotation() <em>XRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRotation()
	 * @generated
	 * @ordered
	 */
	protected double xRotation = XROTATION_EDEFAULT;
	/**
	 * The default value of the '{@link #getYRotation() <em>YRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYRotation()
	 * @generated
	 * @ordered
	 */
	protected static final double YROTATION_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getYRotation() <em>YRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYRotation()
	 * @generated
	 * @ordered
	 */
	protected double yRotation = YROTATION_EDEFAULT;
	/**
	 * The default value of the '{@link #getZRotation() <em>ZRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZRotation()
	 * @generated
	 * @ordered
	 */
	protected static final double ZROTATION_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getZRotation() <em>ZRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZRotation()
	 * @generated
	 * @ordered
	 */
	protected double zRotation = ZROTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PoseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CommonGeometryData3DPackage.Literals.POSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXRotation() {
		return xRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRotation(double newXRotation) {
		double oldXRotation = xRotation;
		xRotation = newXRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonGeometryData3DPackage.POSE__XROTATION, oldXRotation, xRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYRotation() {
		return yRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYRotation(double newYRotation) {
		double oldYRotation = yRotation;
		yRotation = newYRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonGeometryData3DPackage.POSE__YROTATION, oldYRotation, yRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getZRotation() {
		return zRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZRotation(double newZRotation) {
		double oldZRotation = zRotation;
		zRotation = newZRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonGeometryData3DPackage.POSE__ZROTATION, oldZRotation, zRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__CommonGeometryData3DPackage.POSE__XROTATION:
				return getXRotation();
			case Symphony__CommonGeometryData3DPackage.POSE__YROTATION:
				return getYRotation();
			case Symphony__CommonGeometryData3DPackage.POSE__ZROTATION:
				return getZRotation();
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
			case Symphony__CommonGeometryData3DPackage.POSE__XROTATION:
				setXRotation((Double)newValue);
				return;
			case Symphony__CommonGeometryData3DPackage.POSE__YROTATION:
				setYRotation((Double)newValue);
				return;
			case Symphony__CommonGeometryData3DPackage.POSE__ZROTATION:
				setZRotation((Double)newValue);
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
			case Symphony__CommonGeometryData3DPackage.POSE__XROTATION:
				setXRotation(XROTATION_EDEFAULT);
				return;
			case Symphony__CommonGeometryData3DPackage.POSE__YROTATION:
				setYRotation(YROTATION_EDEFAULT);
				return;
			case Symphony__CommonGeometryData3DPackage.POSE__ZROTATION:
				setZRotation(ZROTATION_EDEFAULT);
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
			case Symphony__CommonGeometryData3DPackage.POSE__XROTATION:
				return xRotation != XROTATION_EDEFAULT;
			case Symphony__CommonGeometryData3DPackage.POSE__YROTATION:
				return yRotation != YROTATION_EDEFAULT;
			case Symphony__CommonGeometryData3DPackage.POSE__ZROTATION:
				return zRotation != ZROTATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CartesianOrientationCoordinates.class) {
			switch (derivedFeatureID) {
				case Symphony__CommonGeometryData3DPackage.POSE__XROTATION: return Symphony__CommonGeometryData3DPackage.CARTESIAN_ORIENTATION_COORDINATES__XROTATION;
				case Symphony__CommonGeometryData3DPackage.POSE__YROTATION: return Symphony__CommonGeometryData3DPackage.CARTESIAN_ORIENTATION_COORDINATES__YROTATION;
				case Symphony__CommonGeometryData3DPackage.POSE__ZROTATION: return Symphony__CommonGeometryData3DPackage.CARTESIAN_ORIENTATION_COORDINATES__ZROTATION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CartesianOrientationCoordinates.class) {
			switch (baseFeatureID) {
				case Symphony__CommonGeometryData3DPackage.CARTESIAN_ORIENTATION_COORDINATES__XROTATION: return Symphony__CommonGeometryData3DPackage.POSE__XROTATION;
				case Symphony__CommonGeometryData3DPackage.CARTESIAN_ORIENTATION_COORDINATES__YROTATION: return Symphony__CommonGeometryData3DPackage.POSE__YROTATION;
				case Symphony__CommonGeometryData3DPackage.CARTESIAN_ORIENTATION_COORDINATES__ZROTATION: return Symphony__CommonGeometryData3DPackage.POSE__ZROTATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (xRotation: ");
		result.append(xRotation);
		result.append(", yRotation: ");
		result.append(yRotation);
		result.append(", zRotation: ");
		result.append(zRotation);
		result.append(')');
		return result.toString();
	}

} //PoseImpl
