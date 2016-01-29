/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d;

import javax.vecmath.Matrix4d;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mesh Localizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Class that provides an estimate of relative pose between two meshes, assuming the two meshes cover overlapping area of a surface.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getMeshLocalizer()
 * @model
 * @generated
 */
public interface MeshLocalizer extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Localize a floating mesh with respect to a fixed mesh.
	 * The transform returned is the transform between the floating mesh and the origin (i.e. a revised version of the floatingMeshTransformEstimate).
	 * @param fixedMesh The mesh that is considered fixed.
	 * @param fixedMeshTransform The transform of the fixed mesh relative to a common reference frame.
	 * @param floatingMesh The mesh that is considered floating relative to the fixed one.
	 * @param floatingMeshTransformEstimate An starting estimate of the pose of the floating mesh relative to the common reference frame.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.geometry.data3d.Matrix4d" unique="false" exceptions="ca.gc.asc_csa.apogy.common.geometry.data3d.Exception" fixedMeshUnique="false" fixedMeshTransformDataType="ca.gc.asc_csa.apogy.common.geometry.data3d.Matrix4d" fixedMeshTransformUnique="false" floatingMeshUnique="false" floatingMeshTransformEstimateDataType="ca.gc.asc_csa.apogy.common.geometry.data3d.Matrix4d" floatingMeshTransformEstimateUnique="false"
	 * @generated
	 */
	Matrix4d localize(CartesianTriangularMesh fixedMesh, Matrix4d fixedMeshTransform, CartesianTriangularMesh floatingMesh, Matrix4d floatingMeshTransformEstimate) throws Exception;

} // MeshLocalizer