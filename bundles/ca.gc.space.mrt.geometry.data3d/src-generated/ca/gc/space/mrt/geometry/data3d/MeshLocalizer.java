/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.space.mrt.geometry.data3d;

import javax.vecmath.Matrix4d;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mesh Localizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Localize a floating mesh with respect to a fixed mesh. The transform returned is the transform between the floating mesh and the origin (i.e. a revised version of the floatingMeshTransformEstimate).
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getMeshLocalizer()
 * @model
 * @generated
 */
public interface MeshLocalizer extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.space.mrt.geometry.data3d.Matrix4d" unique="false" exceptions="ca.gc.space.mrt.geometry.data3d.Exception" fixedMeshUnique="false" fixedMeshTransformDataType="ca.gc.space.mrt.geometry.data3d.Matrix4d" fixedMeshTransformUnique="false" floatingMeshUnique="false" floatingMeshTransformEstimateDataType="ca.gc.space.mrt.geometry.data3d.Matrix4d" floatingMeshTransformEstimateUnique="false"
	 * @generated
	 */
	Matrix4d localize(CartesianTriangularMesh fixedMesh, Matrix4d fixedMeshTransform, CartesianTriangularMesh floatingMesh, Matrix4d floatingMeshTransformEstimate) throws Exception;

} // MeshLocalizer
