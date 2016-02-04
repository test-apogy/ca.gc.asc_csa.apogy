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

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.PointLocator;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Point Locator</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class PointLocatorImpl extends MinimalEObjectImpl.Container implements PointLocator {


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
		return ApogyCommonGeometryData3DPackage.Literals.POINT_LOCATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<CartesianPositionCoordinates> getPoints() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addPoint(CartesianPositionCoordinates point) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addPoints(List<CartesianPositionCoordinates> points) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removePoint(CartesianPositionCoordinates point) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removePoints(List<CartesianPositionCoordinates> points) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void clearPoints() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPositionCoordinates findClosestPoint(CartesianPositionCoordinates point) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<CartesianPositionCoordinates> findClosestPoints(CartesianPositionCoordinates point, int maximumNumberOfNeighbors) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<CartesianPositionCoordinates> findPointsWithinRadius(CartesianPositionCoordinates point, double radius) {
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCommonGeometryData3DPackage.POINT_LOCATOR___GET_POINTS:
				return getPoints();
			case ApogyCommonGeometryData3DPackage.POINT_LOCATOR___ADD_POINT__CARTESIANPOSITIONCOORDINATES:
				addPoint((CartesianPositionCoordinates)arguments.get(0));
				return null;
			case ApogyCommonGeometryData3DPackage.POINT_LOCATOR___ADD_POINTS__LIST:
				addPoints((List<CartesianPositionCoordinates>)arguments.get(0));
				return null;
			case ApogyCommonGeometryData3DPackage.POINT_LOCATOR___REMOVE_POINT__CARTESIANPOSITIONCOORDINATES:
				removePoint((CartesianPositionCoordinates)arguments.get(0));
				return null;
			case ApogyCommonGeometryData3DPackage.POINT_LOCATOR___REMOVE_POINTS__LIST:
				removePoints((List<CartesianPositionCoordinates>)arguments.get(0));
				return null;
			case ApogyCommonGeometryData3DPackage.POINT_LOCATOR___CLEAR_POINTS:
				clearPoints();
				return null;
			case ApogyCommonGeometryData3DPackage.POINT_LOCATOR___FIND_CLOSEST_POINT__CARTESIANPOSITIONCOORDINATES:
				return findClosestPoint((CartesianPositionCoordinates)arguments.get(0));
			case ApogyCommonGeometryData3DPackage.POINT_LOCATOR___FIND_CLOSEST_POINTS__CARTESIANPOSITIONCOORDINATES_INT:
				return findClosestPoints((CartesianPositionCoordinates)arguments.get(0), (Integer)arguments.get(1));
			case ApogyCommonGeometryData3DPackage.POINT_LOCATOR___FIND_POINTS_WITHIN_RADIUS__CARTESIANPOSITIONCOORDINATES_DOUBLE:
				return findPointsWithinRadius((CartesianPositionCoordinates)arguments.get(0), (Double)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}
} // PointLocatorImpl
