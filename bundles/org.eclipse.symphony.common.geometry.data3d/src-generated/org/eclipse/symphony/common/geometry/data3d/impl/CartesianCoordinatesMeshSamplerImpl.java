/**
 * Canadian Space Agency 2008.
 *
 * $Id: CartesianCoordinatesMeshSamplerImpl.java,v 1.2.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package org.eclipse.symphony.common.geometry.data3d.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.geometry.data.impl.MeshCoordinatesShapesSamplerImpl;
import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesMeshSampler;
import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Data3dFacade;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFactory;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Coordinates Mesh Sampler</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CartesianCoordinatesMeshSamplerImpl extends MeshCoordinatesShapesSamplerImpl<CartesianPositionCoordinates, CartesianPolygon> implements CartesianCoordinatesMeshSampler {

	private static Data3dFacade data3dFacade = Symphony__CommonGeometryData3DFactory.eINSTANCE.createData3dFacade();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianCoordinatesMeshSamplerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CommonGeometryData3DPackage.Literals.CARTESIAN_COORDINATES_MESH_SAMPLER;
	}

	@Override
	protected CartesianPositionCoordinates copyCoordinates(CartesianPositionCoordinates point)
	{
		return data3dFacade.createCartesianPositionCoordinates(point);
	}

	@Override
	protected org.eclipse.symphony.common.geometry.data.Mesh<CartesianPositionCoordinates, CartesianPolygon> createMesh()
	{
		return Symphony__CommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesMesh();
	}

	@Override
	protected CartesianPolygon createPolygon()
	{
		return Symphony__CommonGeometryData3DFactory.eINSTANCE.createCartesianPolygon();
	}
	
} //CartesianCoordinatesMeshSamplerImpl
