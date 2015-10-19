/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh;
import org.eclipse.symphony.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mesh Node Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Class representing a Node and CartesianTriangularMesh association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.MeshNodeEntry#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.MeshNodeEntry#getMesh <em>Mesh</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.vehicle.SymphonyToolsVehiclePackage#getMeshNodeEntry()
 * @model
 * @generated
 */
public interface MeshNodeEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(Node)
	 * @see org.eclipse.symphony.addons.vehicle.SymphonyToolsVehiclePackage#getMeshNodeEntry_Node()
	 * @model
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.vehicle.MeshNodeEntry#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Node value);

	/**
	 * Returns the value of the '<em><b>Mesh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mesh</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesh</em>' reference.
	 * @see #setMesh(CartesianTriangularMesh)
	 * @see org.eclipse.symphony.addons.vehicle.SymphonyToolsVehiclePackage#getMeshNodeEntry_Mesh()
	 * @model
	 * @generated
	 */
	CartesianTriangularMesh getMesh();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.vehicle.MeshNodeEntry#getMesh <em>Mesh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mesh</em>' reference.
	 * @see #getMesh()
	 * @generated
	 */
	void setMesh(CartesianTriangularMesh value);

} // MeshNodeEntry
