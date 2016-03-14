/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d;

import ca.gc.asc_csa.apogy.common.processors.Processor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartesian Triangular Mesh Colorizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A Processor that creates a colorized copy of an input Cartesian Triangular Mesh by providing color for each Cartesian
 * Triangular Mesh vertex.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getCartesianTriangularMeshColorizer()
 * @model abstract="true"
 * @generated
 */
public interface CartesianTriangularMeshColorizer extends Processor<CartesianTriangularMesh, ColoredCartesianTriangularMesh> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * This method provides the color that should be associated with the specified vertex that is part
	 * of the input CartesianTriangularMesh. This method must be overloaded by sub-classes.
	 * @param mesh The mesh containing the point.
	 * @param point The point for which to generate color.
	 * <!-- end-model-doc -->
	 * @model unique="false" meshUnique="false" pointUnique="false"
	 * @generated
	 */
	RGBAColor computeColor(CartesianTriangularMesh mesh, CartesianPositionCoordinates point);

} // CartesianTriangularMeshColorizer
