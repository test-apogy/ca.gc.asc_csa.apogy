/**
 * Canadian Space Agency 2008.
 *
 * $Id: NormalPointCloudImpl.java,v 1.2.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package org.eclipse.symphony.common.geometry.data3d.impl;

import java.util.List;

import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage;
import org.eclipse.symphony.common.geometry.data3d.NormalPointCloud;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Point Cloud</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.impl.NormalPointCloudImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.impl.NormalPointCloudImpl#getNormals <em>Normals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalPointCloudImpl extends MinimalEObjectImpl.Container implements NormalPointCloud {
	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected List<Point3d> points;

	/**
	 * The cached value of the '{@link #getNormals() <em>Normals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormals()
	 * @generated
	 * @ordered
	 */
	protected List<Vector3d> normals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalPointCloudImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CommonGeometryData3DPackage.Literals.NORMAL_POINT_CLOUD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Point3d> getPoints() {
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoints(List<Point3d> newPoints) {
		List<Point3d> oldPoints = points;
		points = newPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonGeometryData3DPackage.NORMAL_POINT_CLOUD__POINTS, oldPoints, points));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Vector3d> getNormals() {
		return normals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormals(List<Vector3d> newNormals) {
		List<Vector3d> oldNormals = normals;
		normals = newNormals;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonGeometryData3DPackage.NORMAL_POINT_CLOUD__NORMALS, oldNormals, normals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__CommonGeometryData3DPackage.NORMAL_POINT_CLOUD__POINTS:
				return getPoints();
			case Symphony__CommonGeometryData3DPackage.NORMAL_POINT_CLOUD__NORMALS:
				return getNormals();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Symphony__CommonGeometryData3DPackage.NORMAL_POINT_CLOUD__POINTS:
				setPoints((List<Point3d>)newValue);
				return;
			case Symphony__CommonGeometryData3DPackage.NORMAL_POINT_CLOUD__NORMALS:
				setNormals((List<Vector3d>)newValue);
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
			case Symphony__CommonGeometryData3DPackage.NORMAL_POINT_CLOUD__POINTS:
				setPoints((List<Point3d>)null);
				return;
			case Symphony__CommonGeometryData3DPackage.NORMAL_POINT_CLOUD__NORMALS:
				setNormals((List<Vector3d>)null);
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
			case Symphony__CommonGeometryData3DPackage.NORMAL_POINT_CLOUD__POINTS:
				return points != null;
			case Symphony__CommonGeometryData3DPackage.NORMAL_POINT_CLOUD__NORMALS:
				return normals != null;
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
		result.append(" (points: ");
		result.append(points);
		result.append(", normals: ");
		result.append(normals);
		result.append(')');
		return result.toString();
	}

} //NormalPointCloudImpl
