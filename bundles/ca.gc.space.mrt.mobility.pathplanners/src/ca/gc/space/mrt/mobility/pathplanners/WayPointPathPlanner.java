/**
 * Canadian Space Agency 2007.
 *
 * $Id: WayPointPathPlanner.java,v 1.2.4.2 2015/05/21 15:50:52 pallard Exp $
 */
package ca.gc.space.mrt.mobility.pathplanners;

import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;

import ca.gc.space.mrt.common.processors.Processor;
import ca.gc.space.mrt.geometry.paths.WayPointPath;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Way Point Path Planner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A path planner that produces a WayPoinPath.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.mobility.pathplanners.WayPointPathPlanner#getCurrentDestination <em>Current Destination</em>}</li>
 *   <li>{@link ca.gc.space.mrt.mobility.pathplanners.WayPointPathPlanner#getCurrentPosition <em>Current Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.mobility.pathplanners.PathplannersPackage#getWayPointPathPlanner()
 * @model
 * @generated
 */
public interface WayPointPathPlanner extends Processor<CartesianCoordinatesSet, WayPointPath> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

	/**
	 * Returns the value of the '<em><b>Current Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Destination</em>' reference.
	 * @see #setCurrentDestination(CartesianPositionCoordinates)
	 * @see ca.gc.space.mrt.mobility.pathplanners.PathplannersPackage#getWayPointPathPlanner_CurrentDestination()
	 * @model transient="true"
	 * @generated
	 */
	CartesianPositionCoordinates getCurrentDestination();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.mobility.pathplanners.WayPointPathPlanner#getCurrentDestination <em>Current Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Destination</em>' reference.
	 * @see #getCurrentDestination()
	 * @generated
	 */
	void setCurrentDestination(CartesianPositionCoordinates value);

	/**
	 * Returns the value of the '<em><b>Current Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Position</em>' reference.
	 * @see #setCurrentPosition(CartesianPositionCoordinates)
	 * @see ca.gc.space.mrt.mobility.pathplanners.PathplannersPackage#getWayPointPathPlanner_CurrentPosition()
	 * @model transient="true"
	 * @generated
	 */
	CartesianPositionCoordinates getCurrentPosition();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.mobility.pathplanners.WayPointPathPlanner#getCurrentPosition <em>Current Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Position</em>' reference.
	 * @see #getCurrentPosition()
	 * @generated
	 */
	void setCurrentPosition(CartesianPositionCoordinates value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="ca.gc.space.mrt.common.processors.Exception" currentPositionRequired="true" destinationPositionRequired="true"
	 * @generated
	 */
	WayPointPath plan(CartesianPositionCoordinates currentPosition, CartesianPositionCoordinates destinationPosition) throws Exception;

} // WayPointPathPlanner
