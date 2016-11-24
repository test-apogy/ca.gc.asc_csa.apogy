package ca.gc.asc_csa.apogy.common.geometry.data3d.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.vecmath.Point3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;

import ca.gc.asc_csa.apogy.common.geometry.data.ApogyCommonGeometryDataPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetExtent;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Geometry3DUtilities;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Cartesian Coordinates Set</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class CartesianCoordinatesSetImpl extends AbstractCartesianCoordinatesSetImpl<CartesianPositionCoordinates> implements
		CartesianCoordinatesSet {
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
		this.eAdapters().add(new AdapterImpl() {

			@SuppressWarnings("unchecked")
			public void notifyChanged(Notification notification) {
				if (notification
						.getFeatureID(CartesianCoordinatesSet.class) == ApogyCommonGeometryDataPackage.COORDINATES_SET__POINTS) {
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
		});
	}
	
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonGeometryData3DPackage.Literals.CARTESIAN_COORDINATES_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CartesianCoordinatesSetExtent getExtent() 
	{
		return Geometry3DUtilities.getCartesianCoordinatesSetExtent(getPoints());
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
