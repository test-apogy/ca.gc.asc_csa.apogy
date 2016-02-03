package ca.gc.asc_csa.apogy.common.geometry.data25d.impl;
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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.common.geometry.data25d.Coordinates25D;
import ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DPackage;
import ca.gc.asc_csa.apogy.common.geometry.data25d.VolumetricCoordinatesSet25D;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volumetric Coordinates Set25 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class VolumetricCoordinatesSet25DImpl extends CoordinatesSet25DImpl implements VolumetricCoordinatesSet25D
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumetricCoordinatesSet25DImpl()
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
		return ApogyCommonGeometryData25DPackage.Literals.VOLUMETRIC_COORDINATES_SET25_D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CartesianPositionCoordinates getCartesianPositionCoordinates(Coordinates25D coordinates)
	{
		return ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(coordinates.getU(), coordinates.getV(), coordinates.getW());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCommonGeometryData25DPackage.VOLUMETRIC_COORDINATES_SET25_D___GET_CARTESIAN_POSITION_COORDINATES__COORDINATES25D:
				return getCartesianPositionCoordinates((Coordinates25D)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //VolumetricCoordinatesSet25DImpl
