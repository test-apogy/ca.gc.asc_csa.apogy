package ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl;
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

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPath;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ApogyAddonsMobilityPathplannersPackage;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.WayPointPathPlanner;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.processors.impl.ProcessorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Way Point Path Planner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.WayPointPathPlannerImpl#getCurrentPosition <em>Current Position</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.WayPointPathPlannerImpl#getCurrentDestination <em>Current Destination</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WayPointPathPlannerImpl extends ProcessorImpl<CartesianCoordinatesSet, WayPointPath> implements WayPointPathPlanner {
	/**
	 * The cached value of the '{@link #getCurrentPosition() <em>Current Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPosition()
	 * @generated
	 * @ordered
	 */
	protected CartesianPositionCoordinates currentPosition;

	/**
	 * The cached value of the '{@link #getCurrentDestination() <em>Current Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDestination()
	 * @generated
	 * @ordered
	 */
	protected CartesianPositionCoordinates currentDestination;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WayPointPathPlannerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsMobilityPathplannersPackage.Literals.WAY_POINT_PATH_PLANNER;
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
	public void setOutput(WayPointPath newOutput) {
		super.setOutput(newOutput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPositionCoordinates getCurrentPosition()
	{
		if (currentPosition != null && currentPosition.eIsProxy()) {
			InternalEObject oldCurrentPosition = (InternalEObject)currentPosition;
			currentPosition = (CartesianPositionCoordinates)eResolveProxy(oldCurrentPosition);
			if (currentPosition != oldCurrentPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsMobilityPathplannersPackage.WAY_POINT_PATH_PLANNER__CURRENT_POSITION, oldCurrentPosition, currentPosition));
			}
		}
		return currentPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPositionCoordinates basicGetCurrentPosition()
	{
		return currentPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentPosition(CartesianPositionCoordinates newCurrentPosition) {
		CartesianPositionCoordinates oldCurrentPosition = currentPosition;
		currentPosition = newCurrentPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityPathplannersPackage.WAY_POINT_PATH_PLANNER__CURRENT_POSITION, oldCurrentPosition, currentPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPositionCoordinates getCurrentDestination() {
		if (currentDestination != null && currentDestination.eIsProxy()) {
			InternalEObject oldCurrentDestination = (InternalEObject)currentDestination;
			currentDestination = (CartesianPositionCoordinates)eResolveProxy(oldCurrentDestination);
			if (currentDestination != oldCurrentDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsMobilityPathplannersPackage.WAY_POINT_PATH_PLANNER__CURRENT_DESTINATION, oldCurrentDestination, currentDestination));
			}
		}
		return currentDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPositionCoordinates basicGetCurrentDestination() {
		return currentDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentDestination(CartesianPositionCoordinates newCurrentDestination) {
		CartesianPositionCoordinates oldCurrentDestination = currentDestination;
		currentDestination = newCurrentDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityPathplannersPackage.WAY_POINT_PATH_PLANNER__CURRENT_DESTINATION, oldCurrentDestination, currentDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WayPointPath plan(CartesianPositionCoordinates currentPosition, CartesianPositionCoordinates destinationPosition) throws Exception {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case ApogyAddonsMobilityPathplannersPackage.WAY_POINT_PATH_PLANNER__CURRENT_POSITION:
				if (resolve) return getCurrentPosition();
				return basicGetCurrentPosition();
			case ApogyAddonsMobilityPathplannersPackage.WAY_POINT_PATH_PLANNER__CURRENT_DESTINATION:
				if (resolve) return getCurrentDestination();
				return basicGetCurrentDestination();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case ApogyAddonsMobilityPathplannersPackage.WAY_POINT_PATH_PLANNER__CURRENT_POSITION:
				setCurrentPosition((CartesianPositionCoordinates)newValue);
				return;
			case ApogyAddonsMobilityPathplannersPackage.WAY_POINT_PATH_PLANNER__CURRENT_DESTINATION:
				setCurrentDestination((CartesianPositionCoordinates)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case ApogyAddonsMobilityPathplannersPackage.WAY_POINT_PATH_PLANNER__CURRENT_POSITION:
				setCurrentPosition((CartesianPositionCoordinates)null);
				return;
			case ApogyAddonsMobilityPathplannersPackage.WAY_POINT_PATH_PLANNER__CURRENT_DESTINATION:
				setCurrentDestination((CartesianPositionCoordinates)null);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case ApogyAddonsMobilityPathplannersPackage.WAY_POINT_PATH_PLANNER__CURRENT_POSITION:
				return currentPosition != null;
			case ApogyAddonsMobilityPathplannersPackage.WAY_POINT_PATH_PLANNER__CURRENT_DESTINATION:
				return currentDestination != null;
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
			case ApogyAddonsMobilityPathplannersPackage.WAY_POINT_PATH_PLANNER___PLAN__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES:
				try {
					return plan((CartesianPositionCoordinates)arguments.get(0), (CartesianPositionCoordinates)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}
} //WayPointPathPlannerImpl
