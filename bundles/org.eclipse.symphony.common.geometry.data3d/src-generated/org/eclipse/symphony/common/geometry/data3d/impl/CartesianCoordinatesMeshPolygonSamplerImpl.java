/**
 * Canadian Space Agency 2008.
 *
 * $Id: CartesianCoordinatesMeshPolygonSamplerImpl.java,v 1.2.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package org.eclipse.symphony.common.geometry.data3d.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.geometry.data.Mesh;
import org.eclipse.symphony.common.geometry.data.impl.MeshPolygonShapesSamplerImpl;
import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesMeshPolygonSampler;
import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Data3dFacade;
import org.eclipse.symphony.common.geometry.data3d.Data3dFactory;
import org.eclipse.symphony.common.geometry.data3d.Data3dPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Coordinates Mesh Polygon Sampler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CartesianCoordinatesMeshPolygonSamplerImpl extends MeshPolygonShapesSamplerImpl<CartesianPositionCoordinates, CartesianPolygon> implements CartesianCoordinatesMeshPolygonSampler
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianCoordinatesMeshPolygonSamplerImpl()
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
		return Data3dPackage.Literals.CARTESIAN_COORDINATES_MESH_POLYGON_SAMPLER;
	}

	@Override
	protected CartesianPositionCoordinates copyCoordinates(CartesianPositionCoordinates point)
	{
		return Data3dFacade.INSTANCE.createCartesianPositionCoordinates(point);
	}

	@Override
	protected Mesh<CartesianPositionCoordinates, CartesianPolygon> createMesh()
	{
		return Data3dFactory.eINSTANCE.createCartesianCoordinatesMesh();
	}

	@Override
	protected CartesianPolygon createPolygon()
	{
		return Data3dFactory.eINSTANCE.createCartesianPolygon();
	}

} //CartesianCoordinatesMeshPolygonSamplerImpl
