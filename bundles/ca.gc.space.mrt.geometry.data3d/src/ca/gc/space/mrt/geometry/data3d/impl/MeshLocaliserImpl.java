/**
 * Canadian Space Agency 2008.
 *
 * $Id: MeshLocaliserImpl.java,v 1.4.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d.impl;

import java.lang.reflect.InvocationTargetException;

import javax.vecmath.Matrix4d;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ca.gc.space.mrt.geometry.data3d.CartesianTriangularMesh;
import ca.gc.space.mrt.geometry.data3d.Data3dPackage;
import ca.gc.space.mrt.geometry.data3d.MeshLocaliser;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mesh Localiser</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MeshLocaliserImpl extends EObjectImpl implements MeshLocaliser {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2008.";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeshLocaliserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data3dPackage.Literals.MESH_LOCALISER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix4d localise(CartesianTriangularMesh fixedMesh, Matrix4d fixedMeshTransform, CartesianTriangularMesh floatingMesh, Matrix4d floatingMeshTransformEstimate) throws Exception {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Data3dPackage.MESH_LOCALISER___LOCALISE__CARTESIANTRIANGULARMESH_MATRIX4D_CARTESIANTRIANGULARMESH_MATRIX4D:
			try {
				return localise((CartesianTriangularMesh)arguments.get(0), (Matrix4d)arguments.get(1), (CartesianTriangularMesh)arguments.get(2), (Matrix4d)arguments.get(3));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return super.eInvoke(operationID, arguments);
	}

} //MeshLocaliserImpl
