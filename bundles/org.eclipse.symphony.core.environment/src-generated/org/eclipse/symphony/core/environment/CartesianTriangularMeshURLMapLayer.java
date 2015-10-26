/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;

import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartesian Triangular Mesh URL Map Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Map Layer that contains a URL to a Cartesian Triangular Mesh.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.CartesianTriangularMeshURLMapLayer#getMesh <em>Mesh</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getCartesianTriangularMeshURLMapLayer()
 * @model
 * @generated
 */
public interface CartesianTriangularMeshURLMapLayer extends CartesianTriangularMeshMapLayer, URLMapLayer
{

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
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getCartesianTriangularMeshURLMapLayer_Mesh()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' propertyCategory='TRIANGULAR_MESH'"
	 * @generated
	 */
  CartesianTriangularMesh getMesh();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.CartesianTriangularMeshURLMapLayer#getMesh <em>Mesh</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mesh</em>' reference.
	 * @see #getMesh()
	 * @generated
	 */
  void setMesh(CartesianTriangularMesh value);
} // CartesianTriangularMeshURLMapLayer
