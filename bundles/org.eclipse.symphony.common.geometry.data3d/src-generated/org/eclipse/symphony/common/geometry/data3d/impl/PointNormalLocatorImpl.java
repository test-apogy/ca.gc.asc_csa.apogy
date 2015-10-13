/**
 * Canadian Space Agency 2008.
 *
 * $Id: PointNormalLocatorImpl.java,v 1.3.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package org.eclipse.symphony.common.geometry.data3d.impl;

import java.lang.reflect.InvocationTargetException;

import javax.vecmath.GVector;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.geometry.data3d.Data3dPackage;
import org.eclipse.symphony.common.geometry.data3d.NormalPointCloud;
import org.eclipse.symphony.common.geometry.data3d.PointNormalLocator;

import edu.wlu.cs.levy.CG.KDTree;
import edu.wlu.cs.levy.CG.KeyDuplicateException;
import edu.wlu.cs.levy.CG.KeySizeException;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Point Normal Locator</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.impl.PointNormalLocatorImpl#getDataSet <em>Data Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointNormalLocatorImpl extends MinimalEObjectImpl.Container implements
		PointNormalLocator {
	/**
	 * The cached value of the '{@link #getDataSet() <em>Data Set</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDataSet()
	 * @generated
	 * @ordered
	 */
	protected NormalPointCloud dataSet;

	private KDTree kdTree;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PointNormalLocatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data3dPackage.Literals.POINT_NORMAL_LOCATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NormalPointCloud getDataSet() {
		if (dataSet != null && dataSet.eIsProxy()) {
			InternalEObject oldDataSet = (InternalEObject)dataSet;
			dataSet = (NormalPointCloud)eResolveProxy(oldDataSet);
			if (dataSet != oldDataSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Data3dPackage.POINT_NORMAL_LOCATOR__DATA_SET, oldDataSet, dataSet));
			}
		}
		return dataSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NormalPointCloud basicGetDataSet() {
		return dataSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSet(NormalPointCloud newDataSet) {
		NormalPointCloud oldDataSet = dataSet;
		dataSet = newDataSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3dPackage.POINT_NORMAL_LOCATOR__DATA_SET, oldDataSet, dataSet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public GVector findClosestPoint(Point3d point, Vector3d normal) {
		int pid = findClosestPointId(point, normal);

		GVector closestPoint = null;

		if (pid != -1) {
			closestPoint = packGVector(pid);
		}

		return closestPoint;
	}

	private double[] packKey(Point3d point, Vector3d normal) {
		return new double[] { point.x, point.y, point.z, normal.x, normal.y,
				normal.z };
	}

	private GVector packGVector(Point3d point, Vector3d normal) {
		return new GVector(packKey(point, normal));
	}

	private GVector packGVector(int pointId) {
		Point3d point = getDataSet().getPoints().get(pointId);
		Vector3d normal = getDataSet().getNormals().get(pointId);

		return packGVector(point, normal);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public EList<GVector> findPointsWithinRadius(double radius, Point3d point,
			Vector3d normal) {

		int[] pointIds = findPointIdsWithinRadius(radius, point, normal);

		return pointIdsToEList(pointIds);

	}

	private EList<GVector> pointIdsToEList(int[] pointIds) {
		EList<GVector> values = new BasicEList<GVector>();

		if (pointIds != null && pointIds.length > 0) {
			for (int id : pointIds) {
				values.add(packGVector(id));
			}
		}

		return values;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public EList<GVector> findClosestNPoints(int n, Point3d point,
			Vector3d normal) {
		int[] pointIds = findClosestNPointIds(n, point, normal);

		return pointIdsToEList(pointIds);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public int findClosestPointId(Point3d point, Vector3d normal) {
		double[] key = packKey(point, normal);

		try {
			Integer pointId = (Integer) getKdTree().nearest(key);

			return pointId;

		} catch (KeySizeException e) {
			throw new IllegalArgumentException(e);
		} catch (NullPointerException e) {
			// Can occur at
			// edu.wlu.cs.levy.CG.KDTree.nearest(KDTree.java:204)
			return -1;
		}

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public int[] findPointIdsWithinRadius(double radius, Point3d point,
			Vector3d normal) {

		double[] lowerRange = packKey(point, normal);
		double[] upperRange = packKey(point, normal);

		for (int i = 0; i < upperRange.length; i++) {
			lowerRange[i] -= radius;
			upperRange[i] += radius;
		}

		try {
			Object[] range = getKdTree().range(lowerRange, upperRange);

			int[] result = null;

			if (range != null && range.length > 0) {

				result = generateIntArray(range);

			}

			return result;

		} catch (KeySizeException e) {
			throw new IllegalArgumentException(e);
		}
	}

	private int[] generateIntArray(Object[] values) {
		int[] result = null;

		if (values != null && values.length != 0) {
			result = new int[values.length];

			for (int i = 0; i < values.length; i++) {
				result[i] = (Integer) values[i];
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public int[] findClosestNPointIds(int n, Point3d point, Vector3d normal) {

		try {
			Object[] nearest = getKdTree().nearest(packKey(point, normal), n);

			return generateIntArray(nearest);

		} catch (KeySizeException e) {
			throw new IllegalArgumentException(e);
		}

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Data3dPackage.POINT_NORMAL_LOCATOR__DATA_SET:
				if (resolve) return getDataSet();
				return basicGetDataSet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Data3dPackage.POINT_NORMAL_LOCATOR__DATA_SET:
				setDataSet((NormalPointCloud)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Data3dPackage.POINT_NORMAL_LOCATOR__DATA_SET:
				setDataSet((NormalPointCloud)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Data3dPackage.POINT_NORMAL_LOCATOR__DATA_SET:
				return dataSet != null;
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
			case Data3dPackage.POINT_NORMAL_LOCATOR___FIND_CLOSEST_POINT__POINT3D_VECTOR3D:
				return findClosestPoint((Point3d)arguments.get(0), (Vector3d)arguments.get(1));
			case Data3dPackage.POINT_NORMAL_LOCATOR___FIND_POINTS_WITHIN_RADIUS__DOUBLE_POINT3D_VECTOR3D:
				return findPointsWithinRadius((Double)arguments.get(0), (Point3d)arguments.get(1), (Vector3d)arguments.get(2));
			case Data3dPackage.POINT_NORMAL_LOCATOR___FIND_CLOSEST_NPOINTS__INT_POINT3D_VECTOR3D:
				return findClosestNPoints((Integer)arguments.get(0), (Point3d)arguments.get(1), (Vector3d)arguments.get(2));
			case Data3dPackage.POINT_NORMAL_LOCATOR___FIND_CLOSEST_POINT_ID__POINT3D_VECTOR3D:
				return findClosestPointId((Point3d)arguments.get(0), (Vector3d)arguments.get(1));
			case Data3dPackage.POINT_NORMAL_LOCATOR___FIND_POINT_IDS_WITHIN_RADIUS__DOUBLE_POINT3D_VECTOR3D:
				return findPointIdsWithinRadius((Double)arguments.get(0), (Point3d)arguments.get(1), (Vector3d)arguments.get(2));
			case Data3dPackage.POINT_NORMAL_LOCATOR___FIND_CLOSEST_NPOINT_IDS__INT_POINT3D_VECTOR3D:
				return findClosestNPointIds((Integer)arguments.get(0), (Point3d)arguments.get(1), (Vector3d)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

	private KDTree getKdTree() {
		if (kdTree == null) {
			buildKdTree();
		}
		return kdTree;
	}

	private void buildKdTree() {
		if (getDataSet() == null) {
			throw new IllegalArgumentException("A dataset must be provided");
		}

		if (getDataSet().getNormals().size() != getDataSet().getPoints().size()) {
			throw new IllegalArgumentException(
					"Number of normals must be equal to the number of points");
		}

		kdTree = new KDTree(6);

		for (int i = 0; i < getDataSet().getPoints().size(); i++) {
			Point3d point = getDataSet().getPoints().get(i);
			Vector3d normal = getDataSet().getNormals().get(i);

			double[] data = new double[] { point.x, point.y, point.z, normal.x,
					normal.y, normal.z };

			try {
				kdTree.insert(data, new Integer(i));
			} catch (KeySizeException e) {
//				e.printStackTrace();
			} catch (KeyDuplicateException e) {
//				e.printStackTrace();
			}
		}
	}

} // PointNormalLocatorImpl
