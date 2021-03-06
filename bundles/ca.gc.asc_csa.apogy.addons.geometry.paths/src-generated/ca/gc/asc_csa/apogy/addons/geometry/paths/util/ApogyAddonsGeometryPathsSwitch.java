package ca.gc.asc_csa.apogy.addons.geometry.paths.util;
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ca.gc.asc_csa.apogy.addons.geometry.paths.*;

import ca.gc.asc_csa.apogy.common.geometry.data.Coordinates;
import ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSet;

import ca.gc.asc_csa.apogy.common.geometry.data3d.AbstractCartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;

import ca.gc.asc_csa.apogy.common.processors.Monitorable;
import ca.gc.asc_csa.apogy.common.processors.Processor;

import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsPackage
 * @generated
 */
public class ApogyAddonsGeometryPathsSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApogyAddonsGeometryPathsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsGeometryPathsSwitch() {
		if (modelPackage == null) {
			modelPackage = ApogyAddonsGeometryPathsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ApogyAddonsGeometryPathsPackage.WAY_POINT: {
				WayPoint wayPoint = (WayPoint)theEObject;
				T1 result = caseWayPoint(wayPoint);
				if (result == null) result = caseCartesianPositionCoordinates(wayPoint);
				if (result == null) result = caseGroupNode(wayPoint);
				if (result == null) result = caseCoordinates(wayPoint);
				if (result == null) result = caseNode(wayPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsGeometryPathsPackage.PATH: {
				Path path = (Path)theEObject;
				T1 result = casePath(path);
				if (result == null) result = caseNode(path);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsGeometryPathsPackage.WAY_POINT_PATH: {
				WayPointPath wayPointPath = (WayPointPath)theEObject;
				T1 result = caseWayPointPath(wayPointPath);
				if (result == null) result = caseCartesianCoordinatesSet(wayPointPath);
				if (result == null) result = casePath(wayPointPath);
				if (result == null) result = caseAbstractCartesianCoordinatesSet(wayPointPath);
				if (result == null) result = caseNode(wayPointPath);
				if (result == null) result = caseCoordinatesSet(wayPointPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsGeometryPathsPackage.WAY_POINT_PATH_INTERPOLATOR: {
				WayPointPathInterpolator wayPointPathInterpolator = (WayPointPathInterpolator)theEObject;
				T1 result = caseWayPointPathInterpolator(wayPointPathInterpolator);
				if (result == null) result = caseProcessor(wayPointPathInterpolator);
				if (result == null) result = caseMonitorable(wayPointPathInterpolator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsGeometryPathsPackage.CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR: {
				CatmullRomWayPointPathInterpolator catmullRomWayPointPathInterpolator = (CatmullRomWayPointPathInterpolator)theEObject;
				T1 result = caseCatmullRomWayPointPathInterpolator(catmullRomWayPointPathInterpolator);
				if (result == null) result = caseWayPointPathInterpolator(catmullRomWayPointPathInterpolator);
				if (result == null) result = caseProcessor(catmullRomWayPointPathInterpolator);
				if (result == null) result = caseMonitorable(catmullRomWayPointPathInterpolator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsGeometryPathsPackage.SEGMENT_WAY_POINT_PATH_INTERPOLATOR: {
				SegmentWayPointPathInterpolator segmentWayPointPathInterpolator = (SegmentWayPointPathInterpolator)theEObject;
				T1 result = caseSegmentWayPointPathInterpolator(segmentWayPointPathInterpolator);
				if (result == null) result = caseWayPointPathInterpolator(segmentWayPointPathInterpolator);
				if (result == null) result = caseProcessor(segmentWayPointPathInterpolator);
				if (result == null) result = caseMonitorable(segmentWayPointPathInterpolator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsGeometryPathsPackage.WAY_POINT_PATH_FILTER: {
				WayPointPathFilter wayPointPathFilter = (WayPointPathFilter)theEObject;
				T1 result = caseWayPointPathFilter(wayPointPathFilter);
				if (result == null) result = caseProcessor(wayPointPathFilter);
				if (result == null) result = caseMonitorable(wayPointPathFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsGeometryPathsPackage.MINIMUM_DISTANCE_FILTER: {
				MinimumDistanceFilter minimumDistanceFilter = (MinimumDistanceFilter)theEObject;
				T1 result = caseMinimumDistanceFilter(minimumDistanceFilter);
				if (result == null) result = caseWayPointPathFilter(minimumDistanceFilter);
				if (result == null) result = caseProcessor(minimumDistanceFilter);
				if (result == null) result = caseMonitorable(minimumDistanceFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsGeometryPathsPackage.UNIFORM_DISTANCE_WAY_POINT_PATH_INTERPOLATOR: {
				UniformDistanceWayPointPathInterpolator uniformDistanceWayPointPathInterpolator = (UniformDistanceWayPointPathInterpolator)theEObject;
				T1 result = caseUniformDistanceWayPointPathInterpolator(uniformDistanceWayPointPathInterpolator);
				if (result == null) result = caseWayPointPathFilter(uniformDistanceWayPointPathInterpolator);
				if (result == null) result = caseProcessor(uniformDistanceWayPointPathInterpolator);
				if (result == null) result = caseMonitorable(uniformDistanceWayPointPathInterpolator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsGeometryPathsPackage.APOGY_ADDONS_GEOMETRY_PATHS_FACADE: {
				ApogyAddonsGeometryPathsFacade apogyAddonsGeometryPathsFacade = (ApogyAddonsGeometryPathsFacade)theEObject;
				T1 result = caseApogyAddonsGeometryPathsFacade(apogyAddonsGeometryPathsFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Way Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Way Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseWayPoint(WayPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePath(Path object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Way Point Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Way Point Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseWayPointPath(WayPointPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Way Point Path Interpolator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Way Point Path Interpolator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseWayPointPathInterpolator(WayPointPathInterpolator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catmull Rom Way Point Path Interpolator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catmull Rom Way Point Path Interpolator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCatmullRomWayPointPathInterpolator(CatmullRomWayPointPathInterpolator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Segment Way Point Path Interpolator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Segment Way Point Path Interpolator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSegmentWayPointPathInterpolator(SegmentWayPointPathInterpolator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Way Point Path Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Way Point Path Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseWayPointPathFilter(WayPointPathFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minimum Distance Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minimum Distance Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMinimumDistanceFilter(MinimumDistanceFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uniform Distance Way Point Path Interpolator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uniform Distance Way Point Path Interpolator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUniformDistanceWayPointPathInterpolator(UniformDistanceWayPointPathInterpolator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseApogyAddonsGeometryPathsFacade(ApogyAddonsGeometryPathsFacade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCoordinates(Coordinates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Position Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Position Coordinates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCartesianPositionCoordinates(CartesianPositionCoordinates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGroupNode(GroupNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinates Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinates Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Coordinates> T1 caseCoordinatesSet(CoordinatesSet<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Cartesian Coordinates Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Cartesian Coordinates Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends CartesianPositionCoordinates> T1 caseAbstractCartesianCoordinatesSet(AbstractCartesianCoordinatesSet<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Coordinates Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Coordinates Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCartesianCoordinatesSet(CartesianCoordinatesSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitorable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitorable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMonitorable(Monitorable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <I, O> T1 caseProcessor(Processor<I, O> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //ApogyAddonsGeometryPathsSwitch
