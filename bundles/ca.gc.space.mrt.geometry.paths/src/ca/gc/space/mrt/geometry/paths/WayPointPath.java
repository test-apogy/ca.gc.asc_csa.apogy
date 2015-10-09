/**
 * Canadian Space Agency 2007.
 *
 * $Id: WayPointPath.java,v 1.2.4.2 2015/05/21 15:50:36 pallard Exp $
 */
package ca.gc.space.mrt.geometry.paths;

import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Way Point Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.paths.WayPointPath#getLenght <em>Lenght</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.paths.PathsPackage#getWayPointPath()
 * @model
 * @generated
 */
public interface WayPointPath extends CartesianCoordinatesSet, Path {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

	/**
	 * Returns the value of the '<em><b>Lenght</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lenght</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lenght</em>' attribute.
	 * @see ca.gc.space.mrt.geometry.paths.PathsPackage#getWayPointPath_Lenght()
	 * @model default="0.0" required="true" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	double getLenght();

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	CartesianPositionCoordinates getEndPoint();

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	CartesianPositionCoordinates getStartPoint();

} // WayPointPath
