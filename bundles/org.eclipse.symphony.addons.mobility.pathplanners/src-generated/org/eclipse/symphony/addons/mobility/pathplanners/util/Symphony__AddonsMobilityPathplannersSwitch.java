/**
 * Canadian Space Agency 2007.
 *
 * $Id: Symphony__AddonsMobilityPathplannersSwitch.java,v 1.5.4.3 2015/09/22 19:39:42 rlarcheveque Exp $
 */
package org.eclipse.symphony.addons.mobility.pathplanners.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.symphony.addons.mobility.pathplanners.CircularExclusionZone;
import org.eclipse.symphony.addons.mobility.pathplanners.ExclusionZone;
import org.eclipse.symphony.addons.mobility.pathplanners.MeshWayPointPathPlanner;
import org.eclipse.symphony.addons.mobility.pathplanners.Symphony__AddonsMobilityPathplannersFacade;
import org.eclipse.symphony.addons.mobility.pathplanners.Symphony__AddonsMobilityPathplannersPackage;
import org.eclipse.symphony.addons.mobility.pathplanners.WayPointPathPlanner;
import org.eclipse.symphony.common.geometry.data.Coordinates;
import org.eclipse.symphony.common.geometry.data.CoordinatesSamplingShape;
import org.eclipse.symphony.common.geometry.data.Polygon;
import org.eclipse.symphony.common.geometry.data.PolygonSamplingShape;
import org.eclipse.symphony.common.geometry.data.SamplingShape;
import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;
import org.eclipse.symphony.common.processors.Monitorable;
import org.eclipse.symphony.common.processors.Processor;
import org.eclipse.symphony.common.topology.Node;

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
 * @see org.eclipse.symphony.addons.mobility.pathplanners.Symphony__AddonsMobilityPathplannersPackage
 * @generated
 */
public class Symphony__AddonsMobilityPathplannersSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Symphony__AddonsMobilityPathplannersPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsMobilityPathplannersSwitch() {
		if (modelPackage == null) {
			modelPackage = Symphony__AddonsMobilityPathplannersPackage.eINSTANCE;
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
			case Symphony__AddonsMobilityPathplannersPackage.WAY_POINT_PATH_PLANNER: {
				WayPointPathPlanner wayPointPathPlanner = (WayPointPathPlanner)theEObject;
				T1 result = caseWayPointPathPlanner(wayPointPathPlanner);
				if (result == null) result = caseProcessor(wayPointPathPlanner);
				if (result == null) result = caseMonitorable(wayPointPathPlanner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__AddonsMobilityPathplannersPackage.MESH_WAY_POINT_PATH_PLANNER: {
				MeshWayPointPathPlanner<?> meshWayPointPathPlanner = (MeshWayPointPathPlanner<?>)theEObject;
				T1 result = caseMeshWayPointPathPlanner(meshWayPointPathPlanner);
				if (result == null) result = caseWayPointPathPlanner(meshWayPointPathPlanner);
				if (result == null) result = caseProcessor(meshWayPointPathPlanner);
				if (result == null) result = caseMonitorable(meshWayPointPathPlanner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__AddonsMobilityPathplannersPackage.EXCLUSION_ZONE: {
				ExclusionZone exclusionZone = (ExclusionZone)theEObject;
				T1 result = caseExclusionZone(exclusionZone);
				if (result == null) result = caseNode(exclusionZone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__AddonsMobilityPathplannersPackage.CIRCULAR_EXCLUSION_ZONE: {
				CircularExclusionZone circularExclusionZone = (CircularExclusionZone)theEObject;
				T1 result = caseCircularExclusionZone(circularExclusionZone);
				if (result == null) result = caseExclusionZone(circularExclusionZone);
				if (result == null) result = caseCoordinatesSamplingShape(circularExclusionZone);
				if (result == null) result = casePolygonSamplingShape(circularExclusionZone);
				if (result == null) result = caseNode(circularExclusionZone);
				if (result == null) result = caseSamplingShape(circularExclusionZone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__AddonsMobilityPathplannersPackage.SYMPHONY_ADDONS_MOBILITY_PATHPLANNERS_FACADE: {
				Symphony__AddonsMobilityPathplannersFacade symphony__AddonsMobilityPathplannersFacade = (Symphony__AddonsMobilityPathplannersFacade)theEObject;
				T1 result = caseSymphony__AddonsMobilityPathplannersFacade(symphony__AddonsMobilityPathplannersFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Way Point Path Planner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Way Point Path Planner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseWayPointPathPlanner(WayPointPathPlanner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mesh Way Point Path Planner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mesh Way Point Path Planner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends CartesianPolygon> T1 caseMeshWayPointPathPlanner(MeshWayPointPathPlanner<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusion Zone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusion Zone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseExclusionZone(ExclusionZone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circular Exclusion Zone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circular Exclusion Zone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCircularExclusionZone(CircularExclusionZone object) {
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
	public T1 caseSymphony__AddonsMobilityPathplannersFacade(Symphony__AddonsMobilityPathplannersFacade object) {
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
	public T1 caseNode(Node object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sampling Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sampling Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSamplingShape(SamplingShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinates Sampling Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinates Sampling Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Coordinates> T1 caseCoordinatesSamplingShape(CoordinatesSamplingShape<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon Sampling Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon Sampling Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> T1 casePolygonSamplingShape(PolygonSamplingShape<CoordinatesType, PolygonType> object) {
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

} //Symphony__AddonsMobilityPathplannersSwitch
