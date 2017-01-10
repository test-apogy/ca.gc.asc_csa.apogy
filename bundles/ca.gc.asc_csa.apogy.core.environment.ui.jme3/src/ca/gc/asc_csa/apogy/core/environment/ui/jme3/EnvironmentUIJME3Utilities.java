package ca.gc.asc_csa.apogy.core.environment.ui.jme3;
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

import com.jme3.math.Vector3f;
import com.jme3.scene.Mesh;
import com.jme3.util.BufferUtils;

import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Utilities;

public class EnvironmentUIJME3Utilities 
{	
	/**
	 * Creates a Mesh representing a grid in the XY plane.
	 * @param gridSize The size of the grid squares.
	 * @param planeSize The overall size of the grid.
	 * @return The Mesh.
	 */
	public static Mesh createGrid(float gridSize, float planeSize)
	{
		float planeHalfSize = planeSize / 2.0f;
		
		List<Vector3f> verticesList = new ArrayList<Vector3f>();
		List<Integer> indexesList = new ArrayList<Integer>();
		
		// Lines in the Y direction
		float x = 0;		
		while(x <= planeHalfSize)
		{
			Vector3f p1 = new Vector3f(x, -planeHalfSize, 0);
			Vector3f p2 = new Vector3f(x, planeHalfSize, 0);
			
			verticesList.add(p1);
			verticesList.add(p2);
			
			indexesList.add(verticesList.indexOf(p1));
			indexesList.add(verticesList.indexOf(p2));
			
			x+= gridSize;
		}
		
		x = 0.0f;
		while(x >= -planeHalfSize)
		{
			Vector3f p1 = new Vector3f(x, -planeHalfSize, 0);
			Vector3f p2 = new Vector3f(x, planeHalfSize, 0);	
			
			verticesList.add(p1);
			verticesList.add(p2);
			
			indexesList.add(verticesList.indexOf(p1));
			indexesList.add(verticesList.indexOf(p2));
			
			x-= gridSize;
		}
		
		// Lines in the X direction
		float y = 0;		
		while(y <= planeHalfSize)
		{
			Vector3f p1 = new Vector3f(-planeHalfSize,y, 0);
			Vector3f p2 = new Vector3f(planeHalfSize,y, 0);		
			
			verticesList.add(p1);
			verticesList.add(p2);
			
			indexesList.add(verticesList.indexOf(p1));
			indexesList.add(verticesList.indexOf(p2));
			
			y+= gridSize;
		}
		
		y = 0;
		while(y >= -planeHalfSize)
		{
			Vector3f p1 = new Vector3f(-planeHalfSize, y, 0);
			Vector3f p2 = new Vector3f(planeHalfSize,y, 0);	
			
			verticesList.add(p1);
			verticesList.add(p2);
			
			indexesList.add(verticesList.indexOf(p1));
			indexesList.add(verticesList.indexOf(p2));
			
			y-= gridSize;
		}
		
		Mesh mesh = new Mesh();
		mesh.setMode(Mesh.Mode.Lines);		
		mesh.setBuffer( com.jme3.scene.VertexBuffer.Type.Position, 3, BufferUtils.createFloatBuffer(JME3Utilities.convertToFloatArray(verticesList)));
		mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Index, 2, BufferUtils.createIntBuffer(JME3Utilities.convertToIntArray(indexesList)));								
		mesh.updateBound();
		mesh.updateCounts();
		
		return mesh;
	}
	
	/**
	 * Creates a square plane in the XY plane centered at the origin.
	 * @param planeSize  The overall size of the plane.
	 * @return The plane mesh.
	 */
	public static Mesh createPlane(float planeSize)
	{
		float planeHalfSize = planeSize / 2.0f;
		
		List<Vector3f> verticesList = new ArrayList<Vector3f>();
		List<Integer> indexesList = new ArrayList<Integer>();

		Vector3f p0 = new Vector3f(-planeHalfSize, -planeHalfSize, 0);
		Vector3f p1 = new Vector3f(planeHalfSize, -planeHalfSize, 0);
		Vector3f p2 = new Vector3f(planeHalfSize, planeHalfSize, 0);
		Vector3f p3 = new Vector3f(-planeHalfSize, planeHalfSize, 0);
		
		verticesList.add(p0);
		verticesList.add(p1);
		verticesList.add(p2);
		verticesList.add(p3);
		
		indexesList.add(new Integer(0));
		indexesList.add(new Integer(1));
		indexesList.add(new Integer(2));
		
		indexesList.add(new Integer(0));
		indexesList.add(new Integer(2));
		indexesList.add(new Integer(3));
				
		Mesh mesh = new Mesh();		
		mesh.setBuffer( com.jme3.scene.VertexBuffer.Type.Position, 3, BufferUtils.createFloatBuffer(JME3Utilities.convertToFloatArray(verticesList)));
		mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Index, 2, BufferUtils.createIntBuffer(JME3Utilities.convertToIntArray(indexesList)));								
		mesh.updateBound();
		mesh.updateCounts();
		
		return mesh;
	}
}
