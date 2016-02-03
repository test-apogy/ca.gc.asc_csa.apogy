package ca.gc.asc_csa.apogy.common.geometry.data3d.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.common.geometry.data.Mesh;
import ca.gc.asc_csa.apogy.common.geometry.data.impl.MeshPolygonShapesSamplerImpl;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangle;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMeshPolygonSampler;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;

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
		return ApogyCommonGeometryData3DPackage.Literals.CARTESIAN_TRIANGULAR_MESH_POLYGON_SAMPLER;
	}

	@Override
	protected CartesianPositionCoordinates copyCoordinates(CartesianPositionCoordinates point)
	{
		return ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(point);
	}

	@Override
	protected Mesh<CartesianPositionCoordinates, CartesianTriangle> createMesh()
	{		
		return ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianTriangularMesh();
	}

	@Override
	protected CartesianTriangle createPolygon()
	{
		return ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianTriangle();
	}

} //CartesianTriangularMeshPolygonSamplerImpl
