/**
 * Canadian Space Agency 2008.
 *
 * $Id: CartesianTriangularMeshPolygonSamplerImpl.java,v 1.2.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package org.eclipse.symphony.common.geometry.data3d.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.geometry.data.Mesh;
import org.eclipse.symphony.common.geometry.data.impl.MeshPolygonShapesSamplerImpl;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangle;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMeshPolygonSampler;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFacade;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFactory;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Triangular Mesh Polygon Sampler</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CartesianTriangularMeshPolygonSamplerImpl extends MeshPolygonShapesSamplerImpl<CartesianPositionCoordinates, CartesianTriangle> implements CartesianTriangularMeshPolygonSampler
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianTriangularMeshPolygonSamplerImpl()
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
		return Symphony__CommonGeometryData3DPackage.Literals.CARTESIAN_TRIANGULAR_MESH_POLYGON_SAMPLER;
	}

	@Override
	protected CartesianPositionCoordinates copyCoordinates(CartesianPositionCoordinates point)
	{
		return Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(point);
	}

	@Override
	protected Mesh<CartesianPositionCoordinates, CartesianTriangle> createMesh()
	{		
		return Symphony__CommonGeometryData3DFactory.eINSTANCE.createCartesianTriangularMesh();
	}

	@Override
	protected CartesianTriangle createPolygon()
	{
		return Symphony__CommonGeometryData3DFactory.eINSTANCE.createCartesianTriangle();
	}

} //CartesianTriangularMeshPolygonSamplerImpl
