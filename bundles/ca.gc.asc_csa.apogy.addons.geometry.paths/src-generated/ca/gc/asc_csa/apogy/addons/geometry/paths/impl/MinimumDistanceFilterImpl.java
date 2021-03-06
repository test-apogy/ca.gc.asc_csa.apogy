package ca.gc.asc_csa.apogy.addons.geometry.paths.impl;
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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.addons.geometry.paths.MinimumDistanceFilter;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsFactory;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsPackage;
import ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPath;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Geometry3DUtilities;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Minimum Distance Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.geometry.paths.impl.MinimumDistanceFilterImpl#getMinimumDistance <em>Minimum Distance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MinimumDistanceFilterImpl extends WayPointPathFilterImpl implements MinimumDistanceFilter {
	
	
	/**
	 * The default value of the '{@link #getMinimumDistance() <em>Minimum Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_DISTANCE_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getMinimumDistance() <em>Minimum Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumDistance()
	 * @generated
	 * @ordered
	 */
	protected double minimumDistance = MINIMUM_DISTANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinimumDistanceFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsGeometryPathsPackage.Literals.MINIMUM_DISTANCE_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimumDistance() {
		return minimumDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumDistance(double newMinimumDistance) {
		double oldMinimumDistance = minimumDistance;
		minimumDistance = newMinimumDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsGeometryPathsPackage.MINIMUM_DISTANCE_FILTER__MINIMUM_DISTANCE, oldMinimumDistance, minimumDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsGeometryPathsPackage.MINIMUM_DISTANCE_FILTER__MINIMUM_DISTANCE:
				return getMinimumDistance();
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
			case ApogyAddonsGeometryPathsPackage.MINIMUM_DISTANCE_FILTER__MINIMUM_DISTANCE:
				setMinimumDistance((Double)newValue);
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
			case ApogyAddonsGeometryPathsPackage.MINIMUM_DISTANCE_FILTER__MINIMUM_DISTANCE:
				setMinimumDistance(MINIMUM_DISTANCE_EDEFAULT);
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
			case ApogyAddonsGeometryPathsPackage.MINIMUM_DISTANCE_FILTER__MINIMUM_DISTANCE:
				return minimumDistance != MINIMUM_DISTANCE_EDEFAULT;
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
		result.append(" (minimumDistance: ");
		result.append(minimumDistance);
		result.append(')');
		return result.toString();
	}

	@Override
	public WayPointPath process(WayPointPath input) throws Exception {

		if(input == null)
		{
			throw(new IllegalArgumentException("Cannot pass null WayPointPath as input."));
		}
		
		// If there are enough points to allow for filtering.
		if(input.getPoints().size() > 2)
		{
			WayPointPath filtered = ApogyAddonsGeometryPathsFactory.eINSTANCE.createWayPointPath();
			
			if(getProgressMonitor() != null) getProgressMonitor().beginTask("Filtering WayPointPath.", input.getPoints().size());
			
			// The first way point is always kept.
			filtered.getPoints().add(ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(input.getPoints().get(0)));
			if(getProgressMonitor() != null) getProgressMonitor().worked(1);
			
			// Goes through the list of points and adds to the filtered list only those that are further apart then the specified minimum distance.
			CartesianPositionCoordinates previousPoint = input.getPoints().get(0);
			for(int i = 1; i < input.getPoints().size(); i++)
			{
				CartesianPositionCoordinates nextPoint = input.getPoints().get(i);
				double distance = Geometry3DUtilities.getDistance(previousPoint, nextPoint);								
				
				if(distance > getMinimumDistance())
				{
					filtered.getPoints().add(ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(nextPoint));
					previousPoint = nextPoint;
				}
				
				if(getProgressMonitor() != null) getProgressMonitor().worked(1);
			}
						
			// Adds the last point from the original list if required.
			if(!input.getEndPoint().equals(filtered.getEndPoint()))
			{				
				filtered.getPoints().add(input.getEndPoint());			
			}			
			if(getProgressMonitor() != null) getProgressMonitor().worked(1);
			
			// Done.
			if(getProgressMonitor() != null) getProgressMonitor().done();
			return filtered;
		}
		else
		{
			if(getProgressMonitor() != null) getProgressMonitor().done();
			return input;
		}
	}
} //MinimumDistanceFilterImpl
