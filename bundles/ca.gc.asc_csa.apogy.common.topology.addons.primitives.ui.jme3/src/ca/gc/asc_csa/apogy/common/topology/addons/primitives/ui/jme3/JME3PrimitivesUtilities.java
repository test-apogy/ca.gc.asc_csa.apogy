package ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui.jme3;
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

import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Utilities;

import com.jme3.asset.AssetManager;
import com.jme3.material.Material;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.scene.shape.Sphere;
import com.jme3.util.BufferUtils;

public class JME3PrimitivesUtilities 
{
	/**
	 * Creates a Sphere Geometry containing a sphere. 
	 * @param radius The radius of the sphere.
	 * @return
	 */
	public static Geometry createSphere(float radius, AssetManager assetManager)
	{
		Sphere sphere = new Sphere(10, 36, radius);
		
		Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setBoolean("VertexColor", true);        
		Geometry geometry = new Geometry("Sphere", sphere);
		geometry.setMaterial(mat);
		
		return geometry;
	}
	
	/**
	 * Creates a spherical cap with the specified radius, minimum and maximum elevation angle.The cap is centered on the positive Z axis, with the origin of its radius 
	 * at the origin. The elevation angles are defined relative to the XY plane.
	 * @param radius The radius.
	 * @param minElevationAngle The minimum elevation angle, in radians.
	 * @param maxElevationAngle The maximum elevation angle, in radians.
	 */
	public static Mesh createSphericalCap(float radius, float minElevationAngle, float maxElevationAngle, int numberOfFaces)
	{
		Mesh mesh = null;	
		
		try
		{
			List<Vector3f> verticesList = new ArrayList<Vector3f>();
			List<Integer> indexesList = new ArrayList<Integer>();
			List<Vector3f> normalslList = new ArrayList<Vector3f>();	
			
			if((maxElevationAngle - minElevationAngle) > 0)
			{		
				int verticeIndex = 0;											
				double apexAngle = minElevationAngle;
				double elevationIncrement = (maxElevationAngle - minElevationAngle) / numberOfFaces;
				
				for(int j =0; j < numberOfFaces; j++)
				{				
					double radiusNear = radius * Math.cos(apexAngle);
					double radiusFar = radius * Math.cos(apexAngle + elevationIncrement);
					double zNear = radius * Math.sin(apexAngle);
					double zFar = radius* Math.sin(apexAngle + elevationIncrement);
					
					double angleIncrement = (Math.toRadians(360) / numberOfFaces);
					for(int i = 0; i < numberOfFaces; i++)
					{		
						double angle = i * angleIncrement;
						
						double x1Near = radiusNear * Math.cos(angle);
						double y1Near = radiusNear * Math.sin(angle);												
						double x1Far = radiusFar * Math.cos(angle);
						double y1Far = radiusFar * Math.sin(angle);		
						Vector3f point1Near = new Vector3f((float) x1Near, (float) y1Near, (float) zNear);
						Vector3f point1Far = new Vector3f((float) x1Far, (float) y1Far, (float) zFar);
						
						double x2Near = radiusNear * Math.cos(angle + angleIncrement);
						double y2Near = radiusNear * Math.sin(angle + angleIncrement);		
						double x2Far = radiusFar * Math.cos(angle + angleIncrement);
						double y2Far = radiusFar * Math.sin(angle + angleIncrement);					
						Vector3f point2Near = new Vector3f((float) x2Near,(float) y2Near,(float) zNear);
						Vector3f point2Far = new Vector3f((float) x2Far,(float) y2Far,(float) zFar);
						
						// Adds the first triangle.								
						verticesList.add(point1Near);					
						indexesList.add(new Integer(verticeIndex));
						verticeIndex++;
						
						verticesList.add(point1Far);
						indexesList.add(new Integer(verticeIndex));
						verticeIndex++;
						
						verticesList.add(point2Far);
						indexesList.add(new Integer(verticeIndex));
						verticeIndex++;
						
						// First Triangle normal
						// Compute normal						
						Vector3f normal1 = JME3Utilities.computeTriangleNormal(point1Near, point1Far, point2Far);
						normalslList.add(normal1);	
						normalslList.add(normal1);
						normalslList.add(normal1);
																		
						// Adds the second triangle.		
						verticesList.add(point1Near);
						indexesList.add(new Integer(verticeIndex));
						verticeIndex++;
						
						verticesList.add(point2Far);
						indexesList.add(new Integer(verticeIndex));
						verticeIndex++;

						verticesList.add(point2Near);
						indexesList.add(new Integer(verticeIndex));
						verticeIndex++;
											
						// Second Triangle normal
						// Compute normal
										
						Vector3f normal2 = JME3Utilities.computeTriangleNormal(point1Near, point2Far, point2Near); 
						normalslList.add(normal2);	
						normalslList.add(normal2);
						normalslList.add(normal2);					
					}
					
					// Increment angle.
					apexAngle += elevationIncrement;				
				}														
			}
			else
			{		
				// Nothing.
			}
			
			mesh = new Mesh();
			mesh.setBuffer( com.jme3.scene.VertexBuffer.Type.Position, 3, BufferUtils.createFloatBuffer(JME3Utilities.convertToFloatArray(verticesList)));
			mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Index, 3, BufferUtils.createIntBuffer(JME3Utilities.convertToIntArray(indexesList)));
			mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Normal, 3, BufferUtils.createFloatBuffer(JME3Utilities.convertToFloatArray(normalslList)));							
			mesh.updateBound();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return mesh;
	}
}
