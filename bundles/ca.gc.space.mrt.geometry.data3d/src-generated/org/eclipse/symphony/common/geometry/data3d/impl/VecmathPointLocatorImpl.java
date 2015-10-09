/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.vecmath.Point3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.geometry.data3d.Data3dPackage;
import org.eclipse.symphony.common.geometry.data3d.VecmathPointLocator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vecmath Point Locator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.impl.VecmathPointLocatorImpl#getPoints <em>Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VecmathPointLocatorImpl extends MinimalEObjectImpl.Container implements VecmathPointLocator {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VecmathPointLocatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data3dPackage.Literals.VECMATH_POINT_LOCATOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Data3dPackage.VECMATH_POINT_LOCATOR__POINTS, oldPoints, points));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point3d findClosestPoint(Point3d point) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Point3d> findPointsWithinRadius(double radius, Point3d point) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int findClosestPointId(Point3d point) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int[] findPointIdsWithinRadius(double radius, Point3d point) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Point3d> findClosestNPoints(Point3d referencePoint, int n) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int[] findClosestNPointIds(Point3d referencePoint, int n) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Data3dPackage.VECMATH_POINT_LOCATOR__POINTS:
				return getPoints();
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
			case Data3dPackage.VECMATH_POINT_LOCATOR__POINTS:
				setPoints((List<Point3d>)newValue);
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
			case Data3dPackage.VECMATH_POINT_LOCATOR__POINTS:
				setPoints((List<Point3d>)null);
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
			case Data3dPackage.VECMATH_POINT_LOCATOR__POINTS:
				return points != null;
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
			case Data3dPackage.VECMATH_POINT_LOCATOR___FIND_CLOSEST_POINT__POINT3D:
				return findClosestPoint((Point3d)arguments.get(0));
			case Data3dPackage.VECMATH_POINT_LOCATOR___FIND_POINTS_WITHIN_RADIUS__DOUBLE_POINT3D:
				return findPointsWithinRadius((Double)arguments.get(0), (Point3d)arguments.get(1));
			case Data3dPackage.VECMATH_POINT_LOCATOR___FIND_CLOSEST_POINT_ID__POINT3D:
				return findClosestPointId((Point3d)arguments.get(0));
			case Data3dPackage.VECMATH_POINT_LOCATOR___FIND_POINT_IDS_WITHIN_RADIUS__DOUBLE_POINT3D:
				return findPointIdsWithinRadius((Double)arguments.get(0), (Point3d)arguments.get(1));
			case Data3dPackage.VECMATH_POINT_LOCATOR___FIND_CLOSEST_NPOINTS__POINT3D_INT:
				return findClosestNPoints((Point3d)arguments.get(0), (Integer)arguments.get(1));
			case Data3dPackage.VECMATH_POINT_LOCATOR___FIND_CLOSEST_NPOINT_IDS__POINT3D_INT:
				return findClosestNPointIds((Point3d)arguments.get(0), (Integer)arguments.get(1));
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
		result.append(" (points: ");
		result.append(points);
		result.append(')');
		return result.toString();
	}

} //VecmathPointLocatorImpl
