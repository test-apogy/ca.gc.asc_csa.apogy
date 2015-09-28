/**
 * Canadian Space Agency 2008.
 *
 * $Id: VecmathKdTreePointLocatorImpl.java,v 1.3.4.4 2015/09/22 20:02:14 rlarcheveque Exp $
 */
package ca.gc.space.mrt.geometry.data3d.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.vecmath.Point3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ca.gc.space.mrt.geometry.data3d.Data3dPackage;
import ca.gc.space.mrt.geometry.data3d.VecmathKdTreePointLocator;
import edu.wlu.cs.levy.CG.KDTree;
import edu.wlu.cs.levy.CG.KeyDuplicateException;
import edu.wlu.cs.levy.CG.KeySizeException;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Vecmath Kd Tree Point Locator</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.impl.VecmathKdTreePointLocatorImpl#getPoints <em>Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VecmathKdTreePointLocatorImpl extends EObjectImpl implements
		VecmathKdTreePointLocator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2008.";

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected List<Point3d> points;

	private boolean isDirty;

	private KDTree kdTree;

	private double[] queryBuffer1;

	private double[] queryBuffer2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected VecmathKdTreePointLocatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data3dPackage.Literals.VECMATH_KD_TREE_POINT_LOCATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public List<Point3d> getPoints() {
		return points;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void setPoints(List<Point3d> newPoints) {
		List<Point3d> oldPoints = points;
		points = newPoints;
		isDirty = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Data3dPackage.VECMATH_KD_TREE_POINT_LOCATOR__POINTS,
					oldPoints, points));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Point3d findClosestPoint(Point3d point) {
		int pid = findClosestPointId(point);

		if (pid == -1) {
			return null;
		} else {
			return getPoints().get(pid);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public EList<Point3d> findPointsWithinRadius(double radius, Point3d point) {
		int[] closestPid = findPointIdsWithinRadius(radius, point);

		EList<Point3d> result = new BasicEList<Point3d>(closestPid.length);

		for (int i = 0; i < closestPid.length; i++) {
			result.add(getPoints().get(closestPid[i]));
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public int findClosestPointId(Point3d point) {
		getQueryBuffer1()[0] = point.getX();
		getQueryBuffer1()[1] = point.getY();
		getQueryBuffer1()[2] = point.getZ();

		Integer closestPoint = -1;

		try {
			Object nearest = getKdTree().nearest(getQueryBuffer1());

			if (nearest != null) {
				closestPoint = (Integer) nearest;
			}

		} catch (KeySizeException e) {
			e.printStackTrace();
		}

		return closestPoint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public int[] findPointIdsWithinRadius(double radius, Point3d point) {
		// The lower bound.
		getQueryBuffer1()[0] = point.getX() - Math.abs(radius);
		getQueryBuffer1()[1] = point.getY() - Math.abs(radius);
		getQueryBuffer1()[2] = point.getZ() - Math.abs(radius);

		// The upper bound.
		getQueryBuffer2()[0] = point.getX() + Math.abs(radius);
		getQueryBuffer2()[1] = point.getY() + Math.abs(radius);
		getQueryBuffer2()[2] = point.getZ() + Math.abs(radius);

		int[] result;

		try {
			Object[] range = getKdTree().range(getQueryBuffer1(),
					getQueryBuffer2());

			result = new int[range.length];

			for (int i = 0; i < range.length; i++) {
				result[i] = (Integer) range[i];
			}
		} catch (KeySizeException e) {
			result = new int[0];
			e.printStackTrace();
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public EList<Point3d> findClosestNPoints(Point3d referencePoint, int n) {

		int[] pids = findClosestNPointIds(referencePoint, n);

		EList<Point3d> result = new BasicEList<Point3d>(pids.length);

		for (int i = 0; i < pids.length; i++) {
			result.add(getPoints().get(pids[i]));
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public int[] findClosestNPointIds(Point3d referencePoint, int n) {

		if (referencePoint == null) {
			throw new IllegalArgumentException();
		}

		if (n <= 0) {
			throw new IllegalArgumentException();
		}

		getQueryBuffer1()[0] = referencePoint.x;
		getQueryBuffer1()[1] = referencePoint.y;
		getQueryBuffer1()[2] = referencePoint.z;

		try {
			Object[] nearest = getKdTree().nearest(getQueryBuffer1(), n);

			int[] result = new int[nearest.length];

			for (int i = 0; i < nearest.length; i++) {
				result[i] = ((Integer) nearest[i]).intValue();
			}

			return result;

		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException();
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
			case Data3dPackage.VECMATH_KD_TREE_POINT_LOCATOR__POINTS:
				return getPoints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Data3dPackage.VECMATH_KD_TREE_POINT_LOCATOR__POINTS:
				setPoints((List<Point3d>)newValue);
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
			case Data3dPackage.VECMATH_KD_TREE_POINT_LOCATOR__POINTS:
				setPoints((List<Point3d>)null);
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
			case Data3dPackage.VECMATH_KD_TREE_POINT_LOCATOR__POINTS:
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
			case Data3dPackage.VECMATH_KD_TREE_POINT_LOCATOR___FIND_CLOSEST_POINT__POINT3D:
				return findClosestPoint((Point3d)arguments.get(0));
			case Data3dPackage.VECMATH_KD_TREE_POINT_LOCATOR___FIND_POINTS_WITHIN_RADIUS__DOUBLE_POINT3D:
				return findPointsWithinRadius((Double)arguments.get(0), (Point3d)arguments.get(1));
			case Data3dPackage.VECMATH_KD_TREE_POINT_LOCATOR___FIND_CLOSEST_POINT_ID__POINT3D:
				return findClosestPointId((Point3d)arguments.get(0));
			case Data3dPackage.VECMATH_KD_TREE_POINT_LOCATOR___FIND_POINT_IDS_WITHIN_RADIUS__DOUBLE_POINT3D:
				return findPointIdsWithinRadius((Double)arguments.get(0), (Point3d)arguments.get(1));
			case Data3dPackage.VECMATH_KD_TREE_POINT_LOCATOR___FIND_CLOSEST_NPOINTS__POINT3D_INT:
				return findClosestNPoints((Point3d)arguments.get(0), (Integer)arguments.get(1));
			case Data3dPackage.VECMATH_KD_TREE_POINT_LOCATOR___FIND_CLOSEST_NPOINT_IDS__POINT3D_INT:
				return findClosestNPointIds((Point3d)arguments.get(0), (Integer)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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

	private KDTree getKdTree() {
		if (kdTree == null || isDirty) {
			if (getPoints() == null) {
				throw new IllegalArgumentException();
			}

			kdTree = new KDTree(3);

			// We build the kd tree.
			int pid = 0;
			for (Point3d point : getPoints()) {
				double key[] = new double[] { point.getX(), point.getY(),
						point.getZ() };
				try {
					kdTree.insert(key, pid++);
				} catch (KeySizeException e) {
					e.printStackTrace();
				} catch (KeyDuplicateException e) {
					// We simply log the exception.
					// Status logEntry = new Status(Status.WARNING,
					// Activator.ID,
					// "Error while inserting point into the kd tree: "
					// + e.getMessage(), e);
				}
			}

			isDirty = false;
		}
		return kdTree;
	}

	private double[] getQueryBuffer1() {
		if (queryBuffer1 == null) {
			queryBuffer1 = new double[3];
		}
		return queryBuffer1;
	}

	private double[] getQueryBuffer2() {
		if (queryBuffer2 == null) {
			queryBuffer2 = new double[3];
		}
		return queryBuffer2;
	}

} // VecmathKdTreePointLocatorImpl
