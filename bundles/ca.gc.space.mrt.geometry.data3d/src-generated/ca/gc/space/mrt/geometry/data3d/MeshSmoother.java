/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.space.mrt.geometry.data3d;

import ca.gc.space.mrt.common.processors.Processor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mesh Smoother</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.MeshSmoother#getNumberOfIterations <em>Number Of Iterations</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getMeshSmoother()
 * @model
 * @generated
 */
public interface MeshSmoother extends Processor<CartesianCoordinatesSet, CartesianTriangularMesh> {
	/**
	 * Returns the value of the '<em><b>Number Of Iterations</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Iterations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Iterations</em>' attribute.
	 * @see #setNumberOfIterations(int)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getMeshSmoother_NumberOfIterations()
	 * @model default="1" unique="false"
	 * @generated
	 */
	int getNumberOfIterations();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.MeshSmoother#getNumberOfIterations <em>Number Of Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Iterations</em>' attribute.
	 * @see #getNumberOfIterations()
	 * @generated
	 */
	void setNumberOfIterations(int value);

} // MeshSmoother
