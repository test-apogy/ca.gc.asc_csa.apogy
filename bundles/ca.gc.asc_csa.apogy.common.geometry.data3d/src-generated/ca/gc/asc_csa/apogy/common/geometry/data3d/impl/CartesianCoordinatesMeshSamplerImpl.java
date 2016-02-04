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
import ca.gc.asc_csa.apogy.common.geometry.data.impl.MeshCoordinatesShapesSamplerImpl;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesMeshSampler;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Coordinates Mesh Sampler</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CartesianCoordinatesMeshSamplerImpl extends MeshCoordinatesShapesSamplerImpl<CartesianPositionCoordinates, CartesianPolygon> implements CartesianCoordinatesMeshSampler {

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
		return ApogyCommonGeometryData3DPackage.Literals.CARTESIAN_COORDINATES_MESH_SAMPLER;
	}

	@Override
	protected CartesianPositionCoordinates copyCoordinates(CartesianPositionCoordinates point)
	{
		return ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(point);
	}

	@Override
	protected ca.gc.asc_csa.apogy.common.geometry.data.Mesh<CartesianPositionCoordinates, CartesianPolygon> createMesh()
	{
		return ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesMesh();
	}

	@Override
	protected CartesianPolygon createPolygon()
	{
		return ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianPolygon();
	}
	
} //CartesianCoordinatesMeshSamplerImpl
