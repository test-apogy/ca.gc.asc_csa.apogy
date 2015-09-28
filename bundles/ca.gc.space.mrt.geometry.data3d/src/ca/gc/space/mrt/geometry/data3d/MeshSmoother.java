/**
 * Canadian Space Agency 2008.
 *
 * $Id: MeshSmoother.java,v 1.2.4.2 2015/05/21 15:50:48 pallard Exp $
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
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MeshSmoother extends Processor<CartesianTriangularMesh, CartesianTriangularMesh> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

	/**
	 * Returns the value of the '<em><b>Number Of Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Iterations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Iterations</em>' attribute.
	 * @see #setNumberOfIterations(int)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getMeshSmoother_NumberOfIterations()
	 * @model
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
