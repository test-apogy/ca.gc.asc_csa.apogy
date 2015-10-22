/**
 * Canadian Space Agency 2007.
 *
 * $Id: WayPointPathPlanner.java,v 1.2.4.2 2015/05/21 15:50:52 pallard Exp $
 */
package org.eclipse.symphony.addons.mobility.pathplanners;

import org.eclipse.symphony.addons.geometry.paths.WayPointPath;
import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.processors.Processor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Way Point Path Planner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A path planner that produces a WayPoinPath.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.mobility.pathplanners.WayPointPathPlanner#getCurrentPosition <em>Current Position</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.pathplanners.WayPointPathPlanner#getCurrentDestination <em>Current Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.mobility.pathplanners.PathplannersPackage#getWayPointPathPlanner()
 * @model
 * @generated
 */
public interface WayPointPathPlanner extends Processor<CartesianCoordinatesSet, WayPointPath> {
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
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.PathplannersPackage#getWayPointPathPlanner_CurrentPosition()
	 * @model transient="true"
	 * @generated
	 */
	CartesianPositionCoordinates getCurrentPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.pathplanners.WayPointPathPlanner#getCurrentPosition <em>Current Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Position</em>' reference.
	 * @see #getCurrentPosition()
	 * @generated
	 */
	void setCurrentPosition(CartesianPositionCoordinates value);

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
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.PathplannersPackage#getWayPointPathPlanner_CurrentDestination()
	 * @model transient="true"
	 * @generated
	 */
	CartesianPositionCoordinates getCurrentDestination();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.pathplanners.WayPointPathPlanner#getCurrentDestination <em>Current Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Destination</em>' reference.
	 * @see #getCurrentDestination()
	 * @generated
	 */
	void setCurrentDestination(CartesianPositionCoordinates value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" exceptions="org.eclipse.symphony.common.processors.Exception" currentPositionUnique="false" destinationPositionUnique="false"
	 * @generated
	 */
	WayPointPath plan(CartesianPositionCoordinates currentPosition, CartesianPositionCoordinates destinationPosition) throws Exception;

} // WayPointPathPlanner
