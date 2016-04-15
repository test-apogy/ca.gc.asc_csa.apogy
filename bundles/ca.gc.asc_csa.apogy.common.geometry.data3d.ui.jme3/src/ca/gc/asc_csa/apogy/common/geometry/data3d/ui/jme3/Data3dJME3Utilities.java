package ca.gc.asc_csa.apogy.common.geometry.data3d.ui.jme3;
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
import java.util.Map;
import java.util.WeakHashMap;

import org.eclipse.emf.common.util.EList;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianAxis;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangle;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ColoredCartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Geometry3DUtilities;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Utilities;

import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;
import com.jme3.scene.Mesh;
import com.jme3.scene.Mesh.Mode;
import com.jme3.util.BufferUtils;

public class Data3dJME3Utilities 
{
	public static boolean verbose = false;
		
	/**
	 * Creates a com.jme3.scene.Mesh from a CartesianTriangularMesh.
	 * @param cartesianTriangularMesh The CartesianTriangularMesh.
	 * @return The JME3 mesh, null if the CartesianTriangularMesh is null contains no triangles or points.
	 */
	public static Mesh createMesh(final CartesianTriangularMesh cartesianTriangularMesh)
	{
		return createMesh(cartesianTriangularMesh, true, null);
	}
	
	/**
	 * Creates a com.jme3.scene.Mesh from a CartesianTriangularMesh.
	 * @param cartesianTriangularMesh The CartesianTriangularMesh.
	 * @param defaultVertexColor The color to assign to non-colored vertex. Can be null.
	 * @return The JME3 mesh, null if the CartesianTriangularMesh is null contains no triangles or points.
	 */
	public static Mesh createMesh(final CartesianTriangularMesh cartesianTriangularMesh, boolean overrideColor, ColorRGBA defaultVertexColor)
	{
		Mesh mesh = new Mesh();
		mesh.setMode(Mode.Triangles);
		
		if(mesh != null && cartesianTriangularMesh.getPoints().size() > 0 && cartesianTriangularMesh.getPolygons().size() > 0)
		{
			if(verbose)
			{
				System.err.println("Mesh Points    : " + cartesianTriangularMesh.getPoints().size());
				System.err.println("Mesh Triangles : " + cartesianTriangularMesh.getPolygons().size());
			}
			
			Map<CartesianPositionCoordinates, Integer> pointToIndexMap =  new WeakHashMap<CartesianPositionCoordinates, Integer>();					
			Vector3f[] verticesArray = new Vector3f[cartesianTriangularMesh.getPoints().size()];
			List<Integer> indexesList = new ArrayList<Integer>();
			List<Vector3f> normalslList = new ArrayList<Vector3f>();			
			List<ColorRGBA> pointColorList = new ArrayList<ColorRGBA>();
			Vector2f[] textureCoordArray = new Vector2f[cartesianTriangularMesh.getPoints().size()];
			
			// Gets the X and Y Extent of the mesh				
			float minX = (float) Geometry3DUtilities.getMinimumPosition(CartesianAxis.X, cartesianTriangularMesh.getPoints()).getX();
			float maxX = (float) Geometry3DUtilities.getMaximumPosition(CartesianAxis.X, cartesianTriangularMesh.getPoints()).getX();
			float xExtent = maxX - minX;
			
			float minY = (float) Geometry3DUtilities.getMinimumPosition(CartesianAxis.Y, cartesianTriangularMesh.getPoints()).getY();
			float maxY = (float) Geometry3DUtilities.getMaximumPosition(CartesianAxis.Y, cartesianTriangularMesh.getPoints()).getY();				
			float yExtent = maxY - minY;
			
			// First, fills in the vertices and text coord.			
			
			int index = 0;
			for(CartesianPositionCoordinates point : cartesianTriangularMesh.getPoints())
			{								
				verticesArray[index] = (new Vector3f((float) point.getX(), (float) point.getY(), (float)point.getZ()));
				pointToIndexMap.put(point, new Integer(index));
				
				float textureX = ((float) point.getX() - minX) / xExtent;
				if(textureX < 0) textureX = 0;
				if(textureX > 1) textureX = 1;
				
				float textureY =  ((float) point.getY() - minY) / yExtent;
				if(textureY < 0) textureY = 0;
				if(textureY > 1) textureY = 1;						
							
				Vector2f textCoord = new Vector2f(textureX, textureY);				
				textureCoordArray[index] = textCoord;
					
				// Fills in the vertex color.
				ColorRGBA pointColor = null;
				
				
				if(overrideColor)
				{
					if(defaultVertexColor != null)
					{
						pointColor = new ColorRGBA(defaultVertexColor);
					}
					else
					{
						pointColor = new ColorRGBA(1.0f, 1.0f, 1.0f, 1.0f);
					}
				}
				else
				{
					// If the point as associated color to it, use that color.
					if(point instanceof ColoredCartesianPositionCoordinates)
					{
						ColoredCartesianPositionCoordinates coloredPoint = (ColoredCartesianPositionCoordinates) point;
						float r = ((float) coloredPoint.getRed()) / 255.0f;
						if(r < 0) r = 0;
						if(r > 1) r = 1;
						
						float g = ((float) coloredPoint.getGreen()) / 255.0f;
						if(g < 0) g = 0;
						if(g > 1) g = 1;
						
						float b = ((float) coloredPoint.getBlue()) / 255.0f;
						if(b < 0) b = 0;
						if(b > 1) b = 1;
							
						pointColor = new ColorRGBA(r,g,b,1.0f);					
					}
					else
					{
						if(defaultVertexColor != null)
						{
							pointColor = new ColorRGBA(defaultVertexColor);
						}
						else
						{
							pointColor = new ColorRGBA(1.0f, 1.0f, 1.0f, 1.0f);
						}
					}
				}
				
				pointColorList.add(pointColor);
				
				index++;
			}
			
			// Fills in the indexes
			for(CartesianTriangle triangle : cartesianTriangularMesh.getPolygons())
			{
				for(CartesianPositionCoordinates vertice : triangle.getVertices())
				{
					Integer verticeIndex =  pointToIndexMap.get(vertice);
					indexesList.add(verticeIndex);
				}
			}
			
			// Fills in the Normals.
			for(CartesianPositionCoordinates point : cartesianTriangularMesh.getPoints())
			{
				EList<CartesianTriangle> triangles = cartesianTriangularMesh.getPolygonsSharingPoint(point);
				
				// Computes the average normal.
				Vector3f normal = computeAverageNormal(triangles);
				
				normalslList.add(normal);									
			}				
			
			if(verbose)
			{
				System.err.println("Position : " + verticesArray.length);
				System.err.println("Index    : " + indexesList.size());
				System.err.println("Normal   : " + normalslList.size());
				System.err.println("Color    : " + pointColorList.size());
			}
			
			mesh.setMode(Mode.Triangles);			
			mesh.setBuffer( com.jme3.scene.VertexBuffer.Type.Position, 3, BufferUtils.createFloatBuffer(verticesArray));
			mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Index, 3, BufferUtils.createIntBuffer(JME3Utilities.convertToIntArray(indexesList)));
			mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Normal, 3, BufferUtils.createFloatBuffer(JME3Utilities.convertToFloatArray(normalslList)));
			mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.TexCoord, 2, BufferUtils.createFloatBuffer(textureCoordArray));	
			mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Color, 4, BufferUtils.createFloatBuffer(JME3Utilities.convertRGBAListToFloatArray(pointColorList)));
			
			mesh.updateBound();
			mesh.updateCounts();
		}
		return mesh;
	}
	
	public static Vector3f computeAverageNormal(EList<CartesianTriangle> triangles)
	{
		Vector3f normal = new Vector3f(0,0,0);
		
		for(CartesianTriangle triangle : triangles)
		{
			// Do an area weighted sum
			Vector3f triangleNormal = JME3Utilities.convertToVector3f(triangle.getNormal()); 
			triangleNormal = triangleNormal.normalize();
			triangleNormal.mult((float) triangle.getSurface());						
			normal = normal.add(triangleNormal);
		}		
		
		normal.normalize();
		
		return normal;
	}
	
}
