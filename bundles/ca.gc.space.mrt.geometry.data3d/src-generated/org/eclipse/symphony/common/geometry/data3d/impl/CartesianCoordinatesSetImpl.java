/**
 * Canadian Space Agency 2007.
 *
 * $Id: CartesianCoordinatesSetImpl.java,v 1.3.4.5 2015/09/22 19:39:41 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.geometry.data3d.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.vecmath.Point3d;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.symphony.common.geometry.data.DataPackage;
import org.eclipse.symphony.common.geometry.data.impl.CoordinatesSetImpl;
import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet;
import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Data3dPackage;
import org.eclipse.symphony.common.geometry.data3d.Geometry3dUtilities;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Cartesian Coordinates Set</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CartesianCoordinatesSetImpl extends CoordinatesSetImpl<CartesianPositionCoordinates> implements
		CartesianCoordinatesSet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7069770794769023332L;

	private int currentPointId = 0;

	/**
	 * Map used to maintain relationships between coordinates and point Id.
	 */
	private Map<CartesianPositionCoordinates, Integer> pointsToPointIdMap;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected CartesianCoordinatesSetImpl() {
		super();
		
		// Finally, we add ourselves as a listener of this point cloud.
		this.eAdapters().add(new Adapter() {

			public Notifier getTarget() {
				// TODO Auto-generated method stub
				return null;
			}

			public boolean isAdapterForType(Object type) {
				// TODO Auto-generated method stub
				return false;
			}

			@SuppressWarnings("unchecked")
			public void notifyChanged(Notification notification) {
				if (notification
						.getFeatureID(CartesianCoordinatesSet.class) == DataPackage.COORDINATES_SET__POINTS) {
					if (notification.getEventType() == Notification.ADD
							|| notification.getEventType() == Notification.ADD_MANY) {
						if (notification.getNewValue() != null) {
							if (notification.getNewValue() instanceof List) {
								List<CartesianPositionCoordinates> points = (List<CartesianPositionCoordinates>) notification
										.getNewValue();
								for (CartesianPositionCoordinates point : points) {
									pointAdded(point);
								}
							} else {
								CartesianPositionCoordinates point = (CartesianPositionCoordinates) notification
										.getNewValue();
								pointAdded(point);
							}
						}
					}
				}
			}

			public void setTarget(Notifier newTarget) {
			}
		});

	}
	
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data3dPackage.Literals.CARTESIAN_COORDINATES_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<CartesianPositionCoordinates> getPoints() {
		if (points == null) {
			points = new EObjectContainmentEList<CartesianPositionCoordinates>(CartesianPositionCoordinates.class, this, Data3dPackage.CARTESIAN_COORDINATES_SET__POINTS);
		}
		return points;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CartesianCoordinatesSetExtent getExtent() 
	{
		return Geometry3dUtilities.getCartesianCoordinatesSetExtent(getPoints());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Data3dPackage.CARTESIAN_COORDINATES_SET___GET_EXTENT:
				return getExtent();
		}
		return super.eInvoke(operationID, arguments);
	}


	private Map<CartesianPositionCoordinates, Integer> getPointsToPointIdMap() {

		if (pointsToPointIdMap == null) {
			pointsToPointIdMap = new HashMap<CartesianPositionCoordinates, Integer>();
		}

		return pointsToPointIdMap;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public int getPointId(CartesianPositionCoordinates point) {
		Integer pid = getPointsToPointIdMap().get(point);

		int pidValue = pid == null ? -1 : pid.intValue();

		return pidValue;
	}

	protected void pointAdded(CartesianPositionCoordinates point) {
		getPointsToPointIdMap().put(point, currentPointId++);
	}

	@Override
	public boolean equals(Object obj) {

		boolean equals = false;
		if (obj instanceof CartesianCoordinatesSet) {
			CartesianCoordinatesSet pointCloud = (CartesianCoordinatesSet) obj;

			equals = pointCloud.getPoints().size() == this
					.getPoints().size();

			// We verify that every point value are the same.
			for (int i = 0; i < pointCloud.getPoints().size()
					&& equals; i++) {
				CartesianPositionCoordinates pSource = pointCloud
						.getPoints().get(i);
				CartesianPositionCoordinates pTarget = this
						.getPoints().get(i);

				Point3d p = pSource.asPoint3d();
				p.sub(pTarget.asPoint3d());

				p.absolute();

				// To be equal, the difference between point i from
				// source and point i from target, must be less than 1e-10.
				equals = p.x <= 1e-10 && p.y <= 1e-10 && p.z <= 1e-10;

			}
		}
		return equals;
	}
		
} // CartesianCoordinatesSetImpl
