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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangle;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMap;
import ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMapMesher;
import ca.gc.asc_csa.apogy.common.processors.impl.ProcessorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Digital Elevation Map Mesher</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DigitalElevationMapMesherImpl extends ProcessorImpl<DigitalElevationMap, CartesianTriangularMesh> implements DigitalElevationMapMesher {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DigitalElevationMapMesherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonGeometryData3DPackage.Literals.DIGITAL_ELEVATION_MAP_MESHER;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setInput(DigitalElevationMap newInput) {
		super.setInput(newInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setOutput(CartesianTriangularMesh newOutput) {
		super.setOutput(newOutput);
	}

	@Override
	public CartesianTriangularMesh process(DigitalElevationMap input) throws Exception 
	{
		CartesianTriangularMesh result = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianTriangularMesh();
		
		// Copies the points to the mesh.
		List<CartesianPositionCoordinates> points = new ArrayList<CartesianPositionCoordinates>();
		for(CartesianPositionCoordinates p : input.getPoints())
		{
			CartesianPositionCoordinates copy = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(p);
			points.add(copy);
		}
		result.getPoints().addAll(points);
		
		// Creates the point array that map the data as a grid.
		CartesianPositionCoordinates[][] array = createPointsArray(result.getPoints(), input.getXDimension(), input.getYDimension());					
		List<CartesianTriangle> triangles = new ArrayList<CartesianTriangle>();
					
			for(int ym = 0; ym < input.getYDimension() - 1; ym++)
			{
				for(int xn = 0; xn < input.getXDimension() - 1; xn++)
				{					
					CartesianPositionCoordinates pa = array[xn][ym];
					CartesianPositionCoordinates pb = array[xn + 1][ym];
					CartesianPositionCoordinates pc = array[xn + 1][ym + 1];
					CartesianPositionCoordinates pd = array[xn][ym + 1];
					
					CartesianTriangle t1 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianTriangle(pa, pb, pc);
					triangles.add(t1);
					
					CartesianTriangle t2 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianTriangle(pa, pc, pd);				
					triangles.add(t2);
				}			
		}
		result.getPolygons().addAll(triangles);
		
		return result;
	}

	
	private CartesianPositionCoordinates[][] createPointsArray(List<CartesianPositionCoordinates> points, int xDimension, int yDimension)
	{
		CartesianPositionCoordinates[][] array = new CartesianPositionCoordinates[xDimension][yDimension];
		
		for(int i = 0; i < xDimension; i++)
		{
			int startIndex = i * yDimension;		
			
			for(int j= 0; j < yDimension; j++)
			{				
				array[i][j] = points.get(startIndex + j);				
			}
		}

		return array;
	}
} //DigitalElevationMapMesherImpl
