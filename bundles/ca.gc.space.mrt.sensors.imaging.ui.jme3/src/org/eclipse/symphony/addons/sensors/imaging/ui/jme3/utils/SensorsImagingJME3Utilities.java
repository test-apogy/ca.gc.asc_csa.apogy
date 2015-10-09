package org.eclipse.symphony.addons.sensors.imaging.ui.jme3.utils;

import java.util.ArrayList;
import java.util.List;

import ca.gc.asc_csa.topology.ui.jme3.JME3Utilities;
import ca.gc.space.mrt.sensors.fov.RectangularFrustrumFieldOfView;
import ca.gc.space.mrt.sensors.fov.ui.jme3.utils.JME3FovUtilities;
import ca.gc.space.mrt.sensors.imaging.ImageSnapshot;

import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;
import com.jme3.scene.Mesh;
import com.jme3.util.BufferUtils;

public class SensorsImagingJME3Utilities 
{
	public static Mesh createImageSnapshotSidesAndBack(ImageSnapshot imageSnapshot, int numberHorizontalIncrement, int numberVerticalIncrement)
	{	
		Mesh mesh = null;	
				
		RectangularFrustrumFieldOfView fov = imageSnapshot.getFieldOfView();
		
		
		float minRadius = (float) fov.getRange().getMinimumDistance();
		float maxRadius = (float) fov.getRange().getMaximumDistance();
		
		float minHorizontalAngle = (float) (fov.getHorizontalFieldOfViewAngle() / -2.0);
		float maxHorizontalAngle = (float) (fov.getHorizontalFieldOfViewAngle() / 2.0);
		float minVerticalAngle = (float) (fov.getVerticalFieldOfViewAngle() / -2.0);
		float maxVerticalAngle = (float) (fov.getVerticalFieldOfViewAngle() / 2.0);
		
		try
		{
			List<Vector3f> verticesList = new ArrayList<Vector3f>();
			List<Integer> indexesList = new ArrayList<Integer>();
			List<Vector3f> normalslList = new ArrayList<Vector3f>();
			
			// Sides
			JME3FovUtilities.generateHorizontalFace(verticesList, indexesList, normalslList, minRadius, maxRadius, minVerticalAngle, minHorizontalAngle, maxHorizontalAngle, numberHorizontalIncrement);
			JME3FovUtilities.generateHorizontalFace(verticesList, indexesList, normalslList, minRadius, maxRadius, maxVerticalAngle, minHorizontalAngle, maxHorizontalAngle, numberHorizontalIncrement);
			
			// Top + Bottom
			JME3FovUtilities.generateVerticalFace(verticesList, indexesList, normalslList, minRadius, maxRadius, minHorizontalAngle, minVerticalAngle, maxVerticalAngle, numberVerticalIncrement);
			JME3FovUtilities.generateVerticalFace(verticesList, indexesList, normalslList, minRadius, maxRadius, maxHorizontalAngle, minVerticalAngle, maxVerticalAngle, numberVerticalIncrement);
			
			// Front + Back
			JME3FovUtilities.generateEndFace(verticesList, indexesList, normalslList, minRadius, minHorizontalAngle, maxHorizontalAngle, minVerticalAngle, maxVerticalAngle, numberHorizontalIncrement, numberVerticalIncrement, false);			
			
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
	
	public static Mesh createImageSnapshotFrontMesh(ImageSnapshot imageSnapshot, int numberHorizontalIncrement, int numberVerticalIncrement)
	{
		RectangularFrustrumFieldOfView fov = imageSnapshot.getFieldOfView();
		
		float radius = (float) fov.getRange().getMaximumDistance();
		float minHorizontalAngle = (float) (fov.getHorizontalFieldOfViewAngle() / -2.0);
		float maxHorizontalAngle = (float) (fov.getHorizontalFieldOfViewAngle() / 2.0);
		float minVerticalAngle = (float) (fov.getVerticalFieldOfViewAngle() / -2.0);
		float maxVerticalAngle = (float) (fov.getVerticalFieldOfViewAngle() / 2.0);
			
		List<Vector3f> verticesList = new ArrayList<Vector3f>();
		List<Integer> indexesList = new ArrayList<Integer>();		
		List<Vector2f> textureCoordinatesList = new ArrayList<Vector2f>();
								
		double elevationAngleIncrement = (maxVerticalAngle - minVerticalAngle) / (numberVerticalIncrement - 1);
		double azimuthAngleIncrement = (maxHorizontalAngle - minHorizontalAngle) / (numberHorizontalIncrement - 1);
		
		Vector3f[][] verticesArray = new Vector3f[numberVerticalIncrement][numberHorizontalIncrement];
		
		double elevationAngle = minVerticalAngle;	
		for (int elevation = 0; elevation < numberVerticalIncrement; elevation++) 
		{
			double azimuthAngle = minHorizontalAngle;
			for (int azimuth = 0; azimuth < numberHorizontalIncrement; azimuth++) 
			{			
				float l = (float) (radius * Math.cos(elevationAngle));						
												
				float x = (float) (radius * Math.sin(elevationAngle));
				float y = (float) (l * Math.sin(azimuthAngle));			
				float z = (float) (l * Math.cos(azimuthAngle));
							
				// Adds the vertex.
				Vector3f vertex = new Vector3f(x, y, z);
				verticesArray[elevation][azimuth] = vertex;
				verticesList.add(vertex);
												
				// Texture coordinates				
				float textureX = (float )((azimuthAngle - minHorizontalAngle) / fov.getHorizontalFieldOfViewAngle());
				float textureY = (float )((elevationAngle - minVerticalAngle) / fov.getVerticalFieldOfViewAngle());				
				Vector2f textCoord = new Vector2f(textureX, textureY);
				textureCoordinatesList.add(textCoord);
								
				// Increment azimuth.
				azimuthAngle += azimuthAngleIncrement;				
			}
			
			// Increment elevation.
			elevationAngle += elevationAngleIncrement;
		}			
		
		// Creates the triangles.
		for (int elevation = 0; elevation < numberVerticalIncrement -1 ; elevation++) 
		{			
			for (int azimuth = 0; azimuth < numberHorizontalIncrement -1 ; azimuth++) 
			{			
				// First Triangle
				Vector3f p0 = verticesArray[elevation][azimuth];					
				Vector3f p1 = verticesArray[elevation][azimuth +1];				
				Vector3f p2 = verticesArray[elevation + 1][azimuth + 1];
															
				int index0 = verticesList.indexOf(p2);									
				indexesList.add(new Integer(index0));
								
				int index1 = verticesList.indexOf(p1);
				indexesList.add(new Integer(index1));
									
				int index2 = verticesList.indexOf(p0);		
				indexesList.add(new Integer(index2));																
							
				// Second Triangle				
				p0 = verticesArray[elevation][azimuth];				
				p1 = verticesArray[elevation + 1][azimuth + 1];				
				p2 = verticesArray[elevation + 1][azimuth];
								
				index0 = verticesList.indexOf(p2);									
				indexesList.add(new Integer(index0));
								
				index1 = verticesList.indexOf(p1);
				indexesList.add(new Integer(index1));
									
				index2 = verticesList.indexOf(p0);		
				indexesList.add(new Integer(index2));																							
			}					
		}
		
		Mesh mesh = new Mesh();
		
		mesh.setBuffer( com.jme3.scene.VertexBuffer.Type.Position, 3, BufferUtils.createFloatBuffer(JME3Utilities.convertToFloatArray(verticesList)));
		mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Index, 3, BufferUtils.createIntBuffer(JME3Utilities.convertToIntArray(indexesList)));		
		mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.TexCoord, 2, BufferUtils.createFloatBuffer(JME3Utilities.convertListOfVector2fToFloatArray(textureCoordinatesList)));
		mesh.updateCounts();
		mesh.updateBound();
				
		return mesh;
	}
}
