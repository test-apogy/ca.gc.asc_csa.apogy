/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment;

import ca.gc.space.mrt.geometry.data3d.CartesianTriangularMesh;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Cartesian Triangular Mesh Map Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Map Layer that contains a Cartesian Triangular Mesh.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.BasicCartesianTriangularMeshMapLayer#getMesh <em>Mesh</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage#getBasicCartesianTriangularMeshMapLayer()
 * @model
 * @generated
 */
public interface BasicCartesianTriangularMeshMapLayer extends CartesianTriangularMeshMapLayer {
	/**
	 * Returns the value of the '<em><b>Mesh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mesh</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesh</em>' containment reference.
	 * @see #setMesh(CartesianTriangularMesh)
	 * @see ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage#getBasicCartesianTriangularMeshMapLayer_Mesh()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' propertyCategory='TRIANGULAR_MESH'"
	 * @generated
	 */
	CartesianTriangularMesh getMesh();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.BasicCartesianTriangularMeshMapLayer#getMesh <em>Mesh</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mesh</em>' containment reference.
	 * @see #getMesh()
	 * @generated
	 */
	void setMesh(CartesianTriangularMesh value);

} // BasicCartesianTriangularMeshMapLayer
