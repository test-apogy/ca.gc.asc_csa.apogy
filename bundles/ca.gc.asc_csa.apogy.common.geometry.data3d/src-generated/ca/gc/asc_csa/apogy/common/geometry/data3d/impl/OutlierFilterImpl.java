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

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.OutlierFilter;
import ca.gc.asc_csa.apogy.common.geometry.data3d.PointLocator;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;
import ca.gc.asc_csa.apogy.common.processors.impl.ProcessorImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Outlier Filter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.OutlierFilterImpl#getMaxDistance <em>Max Distance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutlierFilterImpl extends
		ProcessorImpl<CartesianCoordinatesSet, CartesianCoordinatesSet>
		implements OutlierFilter {
	/**
	 * The default value of the '{@link #getMaxDistance() <em>Max Distance</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMaxDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_DISTANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxDistance() <em>Max Distance</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMaxDistance()
	 * @generated
	 * @ordered
	 */
	protected double maxDistance = MAX_DISTANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected OutlierFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonGeometryData3DPackage.Literals.OUTLIER_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setInput(CartesianCoordinatesSet newInput) {
		super.setInput(newInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setOutput(CartesianCoordinatesSet newOutput) {
		super.setOutput(newOutput);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxDistance() {
		return maxDistance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDistance(double newMaxDistance) {
		double oldMaxDistance = maxDistance;
		maxDistance = newMaxDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonGeometryData3DPackage.OUTLIER_FILTER__MAX_DISTANCE, oldMaxDistance, maxDistance));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonGeometryData3DPackage.OUTLIER_FILTER__MAX_DISTANCE:
				return getMaxDistance();
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
			case ApogyCommonGeometryData3DPackage.OUTLIER_FILTER__MAX_DISTANCE:
				setMaxDistance((Double)newValue);
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
			case ApogyCommonGeometryData3DPackage.OUTLIER_FILTER__MAX_DISTANCE:
				setMaxDistance(MAX_DISTANCE_EDEFAULT);
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
			case ApogyCommonGeometryData3DPackage.OUTLIER_FILTER__MAX_DISTANCE:
				return maxDistance != MAX_DISTANCE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (maxDistance: ");
		result.append(maxDistance);
		result.append(')');
		return result.toString();
	}

	@Override
	public CartesianCoordinatesSet process(CartesianCoordinatesSet input) throws Exception {

		PointLocator locator = ApogyCommonGeometryData3DFactory.eINSTANCE.createKDTreeBasedPointLocator();
		locator.addPoints(input.getPoints());		

		List<CartesianPositionCoordinates> pointsToRemove = new LinkedList<CartesianPositionCoordinates>();

		// For each point, we find its closest point.
		for (CartesianPositionCoordinates point : input.getPoints()) 
		{
			// We find the 2 closest points, first one beeing the point itself.
			List<CartesianPositionCoordinates> pointsWithinRadius = locator.findPointsWithinRadius(point, getMaxDistance());

			// We should find points in this radius, if we find only the point
			// itself,
			// then the point is considered to be an outlier.
			if (pointsWithinRadius.size() <= 1) 
			{
				pointsToRemove.add(point);
			}

		}

		// We remove the points.
		for (CartesianPositionCoordinates point : pointsToRemove) 
		{
			input.getPoints().remove(point);
		}

		setOutput(input);

		return input;
	}

} // OutlierFilterImpl
