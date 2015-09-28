/**
 * Canadian Space Agency 2008.
 *
 * $Id: MeshLocaliser.java,v 1.3.4.2 2015/05/21 15:50:48 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d;

import javax.vecmath.Matrix4d;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mesh Localiser</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getMeshLocaliser()
 * @model
 * @generated
 */
public interface MeshLocaliser extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Localise a floating mesh with respect to a fixed mesh. The transform returned is the transform between the floating mesh and the origin (i.e. a revised version of the floatingMeshTransformEstimate).
	 * @param fixedMesh The mesh that is considered to be fixed.
	 * @param fixedMeshTransform The transform that connect the fixed mesh to the origin.
	 * @param floatingMesh The mesh that is considered to be floating. Its position will be modified to align it with the fixed mesh.
	 * @param floatingMeshTransformEstimate The transform estimate that connect the floating mesh to the origin.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.space.mrt.geometry.data3d.Matrix4d" exceptions="ca.gc.space.mrt.common.processors.Exception" fixedMeshTransformDataType="ca.gc.space.mrt.geometry.data3d.Matrix4d" floatingMeshTransformEstimateDataType="ca.gc.space.mrt.geometry.data3d.Matrix4d"
	 * @generated
	 */
	Matrix4d localise(CartesianTriangularMesh fixedMesh, Matrix4d fixedMeshTransform, CartesianTriangularMesh floatingMesh, Matrix4d floatingMeshTransformEstimate) throws Exception;

} // MeshLocaliser
