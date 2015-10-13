/**
 * Canadian Space Agency 2007.
 *
 * $Id: PointLocatorImpl.java,v 1.3.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package org.eclipse.symphony.common.geometry.data3d.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Data3dPackage;
import org.eclipse.symphony.common.geometry.data3d.PointLocator;

import edu.wlu.cs.levy.CG.KDTree;
import edu.wlu.cs.levy.CG.KeyDuplicateException;
import edu.wlu.cs.levy.CG.KeySizeException;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Point Locator</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.impl.PointLocatorImpl#getPoints <em>Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointLocatorImpl extends MinimalEObjectImpl.Container implements PointLocator {

	private KDTree searchTree;

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected List<CartesianPositionCoordinates> points;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PointLocatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data3dPackage.Literals.POINT_LOCATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public List<CartesianPositionCoordinates> getPoints() {
		return points;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void setPoints(List<CartesianPositionCoordinates> newPoints) {

		searchTree = null;
		List<CartesianPositionCoordinates> oldPoints = points;
		points = newPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Data3dPackage.POINT_LOCATOR__POINTS, oldPoints, points));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public CartesianPositionCoordinates findClosestPoint(
			CartesianPositionCoordinates point) {

		CartesianPositionCoordinates closestPoint = null;

		if (getSearchTree() != null) {
			// We get the closest point id.
			double[] key = new double[] { point.getX(), point.getY(),
					point.getZ() };

			try {
				Object obj = getSearchTree().nearest(key);

				if (obj != null) {
					int id = (Integer) obj;

					closestPoint = getPoints().get(id);
				}

			} catch (KeySizeException e) {
				e.printStackTrace();
			}
		}

		return closestPoint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public EList<CartesianPositionCoordinates> findPointsWithinRadius(
			double radius, CartesianPositionCoordinates point) {

		EList<CartesianPositionCoordinates> points = new BasicEList<CartesianPositionCoordinates>();

		if (getSearchTree() != null) {

			double x = point.getX();
			double y = point.getY();
			double z = point.getZ();

			double[] lower = new double[] { x - radius, y - radius, z - radius };
			double[] upper = new double[] { x + radius, y + radius, z + radius };

			try {
				Object[] range = getSearchTree().range(lower, upper);

				if (range != null && range.length > 0) {
					for (Object object : range) {
						int id = (Integer) object;
						points.add(getPoints().get(id));
					}
				}
			} catch (KeySizeException e) {
				e.printStackTrace();
			}

		}

		return points;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Data3dPackage.POINT_LOCATOR__POINTS:
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
			case Data3dPackage.POINT_LOCATOR__POINTS:
				setPoints((List<CartesianPositionCoordinates>)newValue);
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
			case Data3dPackage.POINT_LOCATOR__POINTS:
				setPoints((List<CartesianPositionCoordinates>)null);
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
			case Data3dPackage.POINT_LOCATOR__POINTS:
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
			case Data3dPackage.POINT_LOCATOR___FIND_CLOSEST_POINT__CARTESIANPOSITIONCOORDINATES:
				return findClosestPoint((CartesianPositionCoordinates)arguments.get(0));
			case Data3dPackage.POINT_LOCATOR___FIND_POINTS_WITHIN_RADIUS__DOUBLE_CARTESIANPOSITIONCOORDINATES:
				return findPointsWithinRadius((Double)arguments.get(0), (CartesianPositionCoordinates)arguments.get(1));
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

	private KDTree getSearchTree() {
		if (searchTree == null && getPoints() != null
				&& getPoints().size() != 0) {

			searchTree = new KDTree(3);

			int id = 0;

			for (CartesianPositionCoordinates point : getPoints()) {
				double[] key = new double[] { point.getX(), point.getY(),
						point.getZ() };

				try {
					searchTree.insert(key, new Integer(id));
				} catch (KeySizeException e) {
				} catch (KeyDuplicateException e) {
				}

				id++;
			}
		}
		return searchTree;
	}

} // PointLocatorImpl
