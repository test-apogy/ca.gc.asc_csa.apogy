/**
 * Canadian Space Agency 2008.
 *
 * $Id: CartesianTriangularMeshSamplerImpl.java,v 1.2.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d.impl;

import org.eclipse.emf.ecore.EClass;

import ca.gc.space.mrt.geometry.data.Mesh;
import ca.gc.space.mrt.geometry.data.impl.MeshCoordinatesShapesSamplerImpl;
import ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.space.mrt.geometry.data3d.CartesianTriangle;
import ca.gc.space.mrt.geometry.data3d.CartesianTriangularMeshSampler;
import ca.gc.space.mrt.geometry.data3d.Data3dFacade;
import ca.gc.space.mrt.geometry.data3d.Data3dFactory;
import ca.gc.space.mrt.geometry.data3d.Data3dPackage;

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