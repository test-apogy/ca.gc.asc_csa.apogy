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
import ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data.impl.CoordinatesSetShapesSamplerImpl;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetShapeSampler;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Coordinates Set Shape Sampler</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CartesianCoordinatesSetShapeSamplerImpl extends CoordinatesSetShapesSamplerImpl<CartesianPositionCoordinates> implements CartesianCoordinatesSetShapeSampler {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianCoordinatesSetShapeSamplerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonGeometryData3DPackage.Literals.CARTESIAN_COORDINATES_SET_SHAPE_SAMPLER;
	}
	
	@Override
	protected CoordinatesSet<CartesianPositionCoordinates> createCoordinatesSet(CoordinatesSet<CartesianPositionCoordinates> input)
	{
		return ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesSet();
	}
	
	@Override
	protected CartesianPositionCoordinates copyCoordinates(
			CartesianPositionCoordinates point) 
	{		
		return ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(point);
	}
	
} //CartesianCoordinatesSetShapeSamplerImpl
