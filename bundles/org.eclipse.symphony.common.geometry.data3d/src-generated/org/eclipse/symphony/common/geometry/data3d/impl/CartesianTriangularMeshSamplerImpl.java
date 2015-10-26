/**
 * Canadian Space Agency 2008.
 *
 * $Id: CartesianTriangularMeshSamplerImpl.java,v 1.2.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package org.eclipse.symphony.common.geometry.data3d.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.geometry.data.Mesh;
import org.eclipse.symphony.common.geometry.data.impl.MeshCoordinatesShapesSamplerImpl;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangle;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMeshSampler;
import org.eclipse.symphony.common.geometry.data3d.Data3dFacade;
import org.eclipse.symphony.common.geometry.data3d.Data3dFactory;
import org.eclipse.symphony.common.geometry.data3d.Data3dPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Triangular Mesh Sampler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CartesianTriangularMeshSamplerImpl extends MeshCoordinatesShapesSamplerImpl<CartesianPositionCoordinates, CartesianTriangle> implements CartesianTriangularMeshSampler
{
	private static Data3dFacade data3dFacade = Data3dFactory.eINSTANCE.createData3dFacade();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianTriangularMeshSamplerImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return Data3dPackage.Literals.CARTESIAN_TRIANGULAR_MESH_SAMPLER;
	}

	@Override
	protected CartesianPositionCoordinates copyCoordinates(CartesianPositionCoordinates point)
	{
		return data3dFacade.createCartesianPositionCoordinates(point);
	}

	@Override
	protected Mesh<CartesianPositionCoordinates, CartesianTriangle> createMesh()
	{
		return Data3dFactory.eINSTANCE.createCartesianTriangularMesh();
	}

	@Override
	protected CartesianTriangle createPolygon()
	{		
		return Data3dFactory.eINSTANCE.createCartesianTriangle();
	}

	@Override
	public Mesh<CartesianPositionCoordinates, CartesianTriangle> process(Mesh<CartesianPositionCoordinates, CartesianTriangle> input) throws Exception
	{		
		return super.process(input);
	}
} //CartesianTriangularMeshSamplerImpl
