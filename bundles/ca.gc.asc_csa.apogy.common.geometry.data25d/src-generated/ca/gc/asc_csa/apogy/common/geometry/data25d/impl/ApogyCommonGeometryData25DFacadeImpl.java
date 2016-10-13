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
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.common.geometry.data25d.Coordinates25D;
import ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DFactory;
import ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DPackage;
import ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data25d.VolumetricCoordinatesSet25D;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyCommonGeometryData25DFacadeImpl extends MinimalEObjectImpl.Container implements ApogyCommonGeometryData25DFacade
{
	private static ApogyCommonGeometryData25DFacade instance;

	public static ApogyCommonGeometryData25DFacade getInstance() {
		if (instance == null) {
			instance = new ApogyCommonGeometryData25DFacadeImpl();
		}

		return instance;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyCommonGeometryData25DFacadeImpl()
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
		return ApogyCommonGeometryData25DPackage.Literals.APOGY_COMMON_GEOMETRY_DATA25_DFACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Coordinates25D createCoordinates25D(Coordinates25D coordinates25D)
	{
		return createCoordinates25D(coordinates25D.getU(), coordinates25D.getV(), coordinates25D.getW());		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Coordinates25D createCoordinates25D(double u, double v, double w)
	{
		Coordinates25D coord = ApogyCommonGeometryData25DFactory.eINSTANCE.createCoordinates25D();
		
		coord.setU(u);
		coord.setV(v);
		coord.setW(w);
		
		return coord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public <T extends VolumetricCoordinatesSet25D> CartesianCoordinatesSet createCartesianCoordinatesSet(T volumetricCoordinatesSet25D)
	{				
		List<CartesianPositionCoordinates> pointList = new ArrayList<CartesianPositionCoordinates>();
		int numberOfPoints = volumetricCoordinatesSet25D.getPoints().size();
		for(int i = 0; i < numberOfPoints; i++)
		{
			Coordinates25D point25D = volumetricCoordinatesSet25D.getPoints().get(i);
		
			CartesianPositionCoordinates point = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(volumetricCoordinatesSet25D.getCartesianPositionCoordinates(point25D));
			pointList.add(point);						
		}
		
		// Adds all the point to the set in one shot.
		CartesianCoordinatesSet coordinateSet = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesSet();
		coordinateSet.getPoints().addAll(pointList);
		
		return coordinateSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCommonGeometryData25DPackage.APOGY_COMMON_GEOMETRY_DATA25_DFACADE___CREATE_COORDINATES25_D__COORDINATES25D:
				return createCoordinates25D((Coordinates25D)arguments.get(0));
			case ApogyCommonGeometryData25DPackage.APOGY_COMMON_GEOMETRY_DATA25_DFACADE___CREATE_COORDINATES25_D__DOUBLE_DOUBLE_DOUBLE:
				return createCoordinates25D((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
			case ApogyCommonGeometryData25DPackage.APOGY_COMMON_GEOMETRY_DATA25_DFACADE___CREATE_CARTESIAN_COORDINATES_SET__VOLUMETRICCOORDINATESSET25D:
				return createCartesianCoordinatesSet((VolumetricCoordinatesSet25D)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ApogyCommonGeometryData25DFacadeImpl
