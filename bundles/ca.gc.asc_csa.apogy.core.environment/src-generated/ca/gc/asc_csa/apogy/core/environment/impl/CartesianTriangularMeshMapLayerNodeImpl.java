/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer;
import ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayerNode;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Triangular Mesh Map Layer Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CartesianTriangularMeshMapLayerNodeImpl extends AbstractMapLayerNodeImpl implements CartesianTriangularMeshMapLayerNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianTriangularMeshMapLayerNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentPackage.Literals.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CartesianTriangularMeshMapLayer getCartesianTriangularMeshMapLayer() 
	{
		if(getAbstractMapLayer() instanceof CartesianTriangularMeshMapLayer)
		{
			return (CartesianTriangularMeshMapLayer) getAbstractMapLayer();
		}
		else
		{
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE___GET_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER:
				return getCartesianTriangularMeshMapLayer();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CartesianTriangularMeshMapLayerNodeImpl
