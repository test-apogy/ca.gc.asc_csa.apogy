/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartesian Triangular Mesh Colorizer By Slope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A specialization of CartesianTriangularMeshColorizer that colorize a mesh based on the normal at each vertex.
 * This implementation compute the normal at a given vertex by computing the weighted average (by triangle area) of
 * each triangle that share the specified point as a vertex.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMeshColorizerBySlope#getNormalAxis <em>Normal Axis</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getCartesianTriangularMeshColorizerBySlope()
 * @model
 * @generated
 */
public interface CartesianTriangularMeshColorizerBySlope extends CartesianTriangularMeshColorizer {
	/**
	 * Returns the value of the '<em><b>Normal Axis</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianAxis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The axis against which to measure the local slope.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Normal Axis</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianAxis
	 * @see #setNormalAxis(CartesianAxis)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getCartesianTriangularMeshColorizerBySlope_NormalAxis()
	 * @model unique="false"
	 * @generated
	 */
	CartesianAxis getNormalAxis();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMeshColorizerBySlope#getNormalAxis <em>Normal Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Axis</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianAxis
	 * @see #getNormalAxis()
	 * @generated
	 */
	void setNormalAxis(CartesianAxis value);

} // CartesianTriangularMeshColorizerBySlope
