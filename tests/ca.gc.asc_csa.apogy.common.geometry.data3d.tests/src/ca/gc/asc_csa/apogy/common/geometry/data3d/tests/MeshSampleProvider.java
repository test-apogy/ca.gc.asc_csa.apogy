package ca.gc.asc_csa.apogy.common.geometry.data3d.tests;
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

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangle;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Geometry3DUtilities;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;

public class MeshSampleProvider {

	protected static ApogyCommonGeometryData3DFacade data3dFacade = ApogyCommonGeometryData3DFacade.INSTANCE;
	
	public static CartesianTriangularMesh getSquare()
	{
		CartesianTriangularMesh mesh =  ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianTriangularMesh();
		
		CartesianPositionCoordinates v0 = data3dFacade.createCartesianPositionCoordinates(0,0,0);
		mesh.getPoints().add(v0);
		CartesianPositionCoordinates v1 = data3dFacade.createCartesianPositionCoordinates(1,0,0);
		mesh.getPoints().add(v1);
		CartesianPositionCoordinates v2 = data3dFacade.createCartesianPositionCoordinates(1,1,0);
		mesh.getPoints().add(v2);
		CartesianPositionCoordinates v3 = data3dFacade.createCartesianPositionCoordinates(0,1,0);
		mesh.getPoints().add(v3);
		CartesianPositionCoordinates v4 = data3dFacade.createCartesianPositionCoordinates(1,2,0);
		mesh.getPoints().add(v4);
		CartesianPositionCoordinates v5 = data3dFacade.createCartesianPositionCoordinates(0,2,0);
		mesh.getPoints().add(v5);
		
		CartesianTriangle p1 =  ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianTriangle();
		p1.getVertices().add(v0);
		p1.getVertices().add(v1);
		p1.getVertices().add(v2);
		mesh.getPolygons().add(p1);
		
		CartesianTriangle p2 =  ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianTriangle();
		p2.getVertices().add(v2);
		p2.getVertices().add(v3);
		p2.getVertices().add(v0);
		mesh.getPolygons().add(p2);
		
		CartesianTriangle p3 =  ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianTriangle();
		p3.getVertices().add(v2);
		p3.getVertices().add(v4);
		p3.getVertices().add(v3);
		mesh.getPolygons().add(p3);
		
		CartesianTriangle p4 =  ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianTriangle();
		p4.getVertices().add(v4);
		p4.getVertices().add(v5);
		p4.getVertices().add(v3);
		mesh.getPolygons().add(p4);
		
		return mesh;
	}
	
	public static CartesianCoordinatesMesh getSquareMeshWithDuplicate(int numberOfGridSquare, double sizeOfGridSquare)
	{
		CartesianCoordinatesMesh mesh = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesMesh();
		
		for(int i = 0; i < numberOfGridSquare; i++)
		{			
			for(int j = 0; j < numberOfGridSquare; j++)
			{
				double xc = i * sizeOfGridSquare;
				double yc = j * sizeOfGridSquare;
				
				double xcc = xc + sizeOfGridSquare;
				double ycc = yc + sizeOfGridSquare;
				
				// Creates the corner points.
				CartesianPositionCoordinates v0 = data3dFacade.createCartesianPositionCoordinates(xc,yc,0);
				mesh.getPoints().add(v0);
				CartesianPositionCoordinates v1 = data3dFacade.createCartesianPositionCoordinates(xc,ycc,0);
				mesh.getPoints().add(v1);
				CartesianPositionCoordinates v2 = data3dFacade.createCartesianPositionCoordinates(xcc,ycc,0);
				mesh.getPoints().add(v2);
				CartesianPositionCoordinates v3 = data3dFacade.createCartesianPositionCoordinates(xcc,yc,0);
				mesh.getPoints().add(v3);
			
				// Creates two triangles.
				CartesianPolygon p0 = data3dFacade.createCartesianPolygon(v0, v1, v2);
				mesh.getPolygons().add(p0);				
				CartesianPolygon p1 = data3dFacade.createCartesianPolygon(v2, v3, v0);
				mesh.getPolygons().add(p1);
			}
		}
		
		return mesh;
	}
	
	public static CartesianCoordinatesMesh getSquareMesh(int numberOfGridSquare, double sizeOfGridSquare)
	{
		CartesianCoordinatesMesh mesh = getSquareMeshWithDuplicate(numberOfGridSquare, sizeOfGridSquare);
		
		return Geometry3DUtilities.removeDuplicateVertex(mesh);
	}
	
	public static CartesianCoordinatesMesh getSquareWithBump(int numberOfGridSquare, double sizeOfGridSquare)
	{
		CartesianCoordinatesMesh mesh = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesMesh();
				
		double xcenter = (numberOfGridSquare * sizeOfGridSquare) / 2.0;	
		double ycenter = xcenter;		
				
		for(int i = 0; i < numberOfGridSquare; i++)
		{			
			for(int j = 0; j < numberOfGridSquare; j++)
			{
				double xc = i * sizeOfGridSquare;
				double yc = j * sizeOfGridSquare;							
				double xcc = xc + sizeOfGridSquare;
				double ycc = yc + sizeOfGridSquare;
								
				// Creates the corner points.
				CartesianPositionCoordinates v0 = data3dFacade.createCartesianPositionCoordinates(centralBump(xcenter, ycenter, xc, yc));
				mesh.getPoints().add(v0);
				CartesianPositionCoordinates v1 = data3dFacade.createCartesianPositionCoordinates(centralBump(xcenter, ycenter, xc, ycc));
				mesh.getPoints().add(v1);
				CartesianPositionCoordinates v2 = data3dFacade.createCartesianPositionCoordinates(centralBump(xcenter, ycenter, xcc, ycc));
				mesh.getPoints().add(v2);
				CartesianPositionCoordinates v3 = data3dFacade.createCartesianPositionCoordinates(centralBump(xcenter, ycenter, xcc, yc));
				mesh.getPoints().add(v3);
			
				// Creates two triangles.
				CartesianPolygon p0 = data3dFacade.createCartesianPolygon(v0, v1, v2);
				mesh.getPolygons().add(p0);				
				CartesianPolygon p1 = data3dFacade.createCartesianPolygon(v2, v3, v0);
				mesh.getPolygons().add(p1);
			}
		}
		
		return Geometry3DUtilities.removeDuplicateVertex(mesh);
	}
	
	private static CartesianPositionCoordinates centralBump(double xcenter, double ycenter, double x, double y)
	{

		double z = Math.sin(10 * x / xcenter) + 2 * Math.sin( 17 * y / ycenter);
		
		CartesianPositionCoordinates point = data3dFacade.createCartesianPositionCoordinates(x,y,z);
		
		return point;
	}
	
	/**
	 * Return a cube centered on 0,0,0 width side lenght.
	 * @param sideLenght Lenght of one side.
	 * @return
	 */
	public static CartesianCoordinatesMesh getCube(double sideLenght)
	{
		CartesianCoordinatesMesh mesh = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesMesh();
		
		double d = sideLenght/2.0;
		
		CartesianPositionCoordinates v0 = data3dFacade.createCartesianPositionCoordinates( d,-d,-d);
		CartesianPositionCoordinates v1 = data3dFacade.createCartesianPositionCoordinates( d, d,-d);
		CartesianPositionCoordinates v2 = data3dFacade.createCartesianPositionCoordinates(-d, d,-d);
		CartesianPositionCoordinates v3 = data3dFacade.createCartesianPositionCoordinates(-d,-d,-d);
		
		CartesianPositionCoordinates v4 = data3dFacade.createCartesianPositionCoordinates( d,-d,d);
		CartesianPositionCoordinates v5 = data3dFacade.createCartesianPositionCoordinates( d, d,d);
		CartesianPositionCoordinates v6 = data3dFacade.createCartesianPositionCoordinates(-d, d,d);
		CartesianPositionCoordinates v7 = data3dFacade.createCartesianPositionCoordinates(-d,-d,d);
		
		mesh.getPoints().add(v0);
		mesh.getPoints().add(v1);
		mesh.getPoints().add(v2);
		mesh.getPoints().add(v3);
		mesh.getPoints().add(v4);
		mesh.getPoints().add(v5);
		mesh.getPoints().add(v6);
		mesh.getPoints().add(v7);
		
		// Bottom
		mesh.getPolygons().add(data3dFacade.createCartesianPolygon(v0,v1,v2));
		mesh.getPolygons().add(data3dFacade.createCartesianPolygon(v2,v3,v0));
		
		// Top
		mesh.getPolygons().add(data3dFacade.createCartesianPolygon(v4,v5,v6));
		mesh.getPolygons().add(data3dFacade.createCartesianPolygon(v6,v7,v4));
		
		// Side -y
		mesh.getPolygons().add(data3dFacade.createCartesianPolygon(v0,v3,v7));
		mesh.getPolygons().add(data3dFacade.createCartesianPolygon(v7,v4,v0));
		
		// Side +y
		mesh.getPolygons().add(data3dFacade.createCartesianPolygon(v1,v2,v6));
		mesh.getPolygons().add(data3dFacade.createCartesianPolygon(v6,v5,v1));
		
		// Side -x
		mesh.getPolygons().add(data3dFacade.createCartesianPolygon(v2,v6,v7));
		mesh.getPolygons().add(data3dFacade.createCartesianPolygon(v7,v3,v2));
		
		// Side +x
		mesh.getPolygons().add(data3dFacade.createCartesianPolygon(v0,v1,v5));
		mesh.getPolygons().add(data3dFacade.createCartesianPolygon(v5,v4,v0));
		
		return mesh;
	}
}
