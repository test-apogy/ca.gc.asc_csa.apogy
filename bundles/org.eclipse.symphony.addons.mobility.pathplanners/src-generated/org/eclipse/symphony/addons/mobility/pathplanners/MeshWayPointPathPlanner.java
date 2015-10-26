/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.mobility.pathplanners;

import org.eclipse.symphony.common.geometry.data.Mesh;

import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mesh Way Point Path Planner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A path planner that produces a WayPoinPath based on a triangular mesh.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.mobility.pathplanners.MeshWayPointPathPlanner#getMesh <em>Mesh</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.mobility.pathplanners.Symphony__AddonsMobilityPathplannersPackage#getMeshWayPointPathPlanner()
 * @model
 * @generated
 */
public interface MeshWayPointPathPlanner<T extends CartesianPolygon> extends WayPointPathPlanner {
	/**
	 * Returns the value of the '<em><b>Mesh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mesh</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesh</em>' reference.
	 * @see #setMesh(Mesh)
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.Symphony__AddonsMobilityPathplannersPackage#getMeshWayPointPathPlanner_Mesh()
	 * @model transient="true"
	 * @generated
	 */
	Mesh<CartesianPositionCoordinates, CartesianPolygon> getMesh();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.pathplanners.MeshWayPointPathPlanner#getMesh <em>Mesh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mesh</em>' reference.
	 * @see #getMesh()
	 * @generated
	 */
	void setMesh(Mesh<CartesianPositionCoordinates, CartesianPolygon> value);

} // MeshWayPointPathPlanner
