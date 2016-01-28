package org.eclipse.symphony.addons.sensors.fov.ui.jme3.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfView;
import org.eclipse.symphony.common.topology.ui.jme3.JME3Utilities;

import com.jme3.math.Vector3f;
import com.jme3.scene.Mesh;
import com.jme3.util.BufferUtils;

public class JME3FovUtilities 
{		
	/**
	 * Creates a circular sector lying in the ZY plane, with its main axis along Z. Angles are defined around X.
	 * @param minAngle Minimum angle, in radians.
	 * @param maxAngle Maximum angle, in radians.
	 * @param minRadius Minimum radius, in meters.
	 * @param maxRadius Maximum radius, in meters.
	 * @param numberOfDivisions Number of divisions along the arc.
	 * @return The mesh
	 */
	public static Mesh createCircularSector(double minAngle, double maxAngle, double minRadius, double maxRadius, int numberOfDivisions, boolean generateNormals)
	{		
		Mesh mesh = null;
		
		try
		{									
			List<Vector3f> verticesList = new ArrayList<Vector3f>();
			List<Integer> indexesList = new ArrayList<Integer>();
			List<Vector3f> normalslList = new ArrayList<Vector3f>();

			double angleIncrement =  (maxAngle - minAngle) / numberOfDivisions;
			if(((maxRadius - minRadius) > 0) && (angleIncrement > 0))
			{			
				int verticeIndex = 0;						
				
				double angle = minAngle;
				int verticesCount = 0;
				
				for(int side = 0; side < 2; side ++)
				{
					angle = minAngle;
					verticesCount = 0;
					
					for(int i = 0; i < numberOfDivisions; i++)	
					{	
						double y1Near = minRadius * Math.sin(angle);
						double z1Near = minRadius * Math.cos(angle);
						
						double y1Far = maxRadius * Math.sin(angle);
						double z1Far = maxRadius * Math.cos(angle);
						
										
						Vector3f point1Near = new Vector3f(0f, (float) y1Near,(float) z1Near);
						Vector3f point1Far = new Vector3f(0f, (float) y1Far, (float) z1Far);												
						
						double nextAngle = angle + angleIncrement;
						double y2Near = minRadius * Math.sin(nextAngle);
						double z2Near = minRadius * Math.cos(nextAngle);
						
						double y2Far = maxRadius * Math.sin(nextAngle);
						double z2Far = maxRadius * Math.cos(nextAngle);
						
						
						Vector3f point2Near = new Vector3f(0f,(float) y2Near,(float) z2Near);
						Vector3f point2Far = new Vector3f(0f,(float) y2Far,(float) z2Far);
						
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
												
						// Increment vertices count.
						verticesCount += 6;
						angle += angleIncrement;								
					}		
									
					for(int i = 0; i < verticesCount; i++)
					{
						// First side, normals along +x.
						if(side == 0) normalslList.add(new Vector3f(1f, 0f, 0f));
						
						// Second side, normals along -x.
						else normalslList.add(new Vector3f(-1f, 0f, 0f));								
					}													
				}
			}
			else 
			{			
				// Fills in the vertices				
				verticesList.add(new Vector3f(0f, 0f, (float) minRadius));
				verticesList.add(new Vector3f(0f, 0f, (float) maxRadius));

				// Fills in the index
				indexesList.add(new Integer(0));
				indexesList.add(new Integer(1));
				indexesList.add(new Integer(0));
				
				// Fills in the normals
				normalslList.add(new Vector3f(1f, 0f, 0f));							
			}

			mesh = new Mesh();
			mesh.setBuffer( com.jme3.scene.VertexBuffer.Type.Position, 3, BufferUtils.createFloatBuffer(JME3Utilities.convertToFloatArray(verticesList)));
			mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Index, 3, BufferUtils.createIntBuffer(JME3Utilities.convertToIntArray(indexesList)));
			if(generateNormals) mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Normal, 3, BufferUtils.createFloatBuffer(JME3Utilities.convertToFloatArray(normalslList)));							
			mesh.updateBound();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return mesh;
	}	
	
	/**
	 * Creates a truncated cone using the default number of division around 
	 * the base of the cone used to generate the geometry. The cone apex is at the origin, and the cone's height is along 
	 * the positive Z axis. If the apex angle is equal or smaller than zero, the truncated cone is represented as a 
	 * line along the positive Z axis, going from the minimum radius to the maximum radius.
	 * @param apexAngle The apex angle, in radians.
	 * @param minRadius The minimum radius, from the apex.
	 * @param maxRadius The maximum radius, from the apex.
	 */
	public static Mesh createTruncatedCone(float apexAngle, float minRadius, float maxRadius, int numberOfFaces)
	{
		Mesh mesh = null;		

		try
		{
			List<Vector3f> verticesList = new ArrayList<Vector3f>();
			List<Integer> indexesList = new ArrayList<Integer>();
			List<Vector3f> normalslList = new ArrayList<Vector3f>();	
			
			if(apexAngle > 0)
			{
				// If the apex angle is larger than one, creates the geometry to represents the truncated cone.				
				int verticeIndex = 0;	
				
				// Generate the sides.			
				double currentApexAngle = apexAngle;	
				
				double radiusNear = minRadius * Math.sin(currentApexAngle / 2.0);
				double radiusFar = maxRadius * Math.sin(currentApexAngle / 2.0);
				double zNear = minRadius * Math.cos(currentApexAngle / 2.0);
				double zFar = maxRadius * Math.cos(currentApexAngle / 2.0);
				
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
					
					// First Triangle.
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
			}
			else
			{			
				// Fills in the vertices				
				verticesList.add(new Vector3f((float) minRadius, 0f, 0f));
				verticesList.add(new Vector3f((float) maxRadius, 0f, 0f));

				// Fills in the index
				indexesList.add(new Integer(0));
				indexesList.add(new Integer(1));
				indexesList.add(new Integer(0));
				
				// Fills in the normals
				normalslList.add(new Vector3f(0f, 0f, 1f));		
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
	

	
	/**
	 * Creates a Mesh to represent a RectangularFrustrumFieldOfView volume.
	 * @param fov The RectangularFrustrumFieldOfView.
	 * @param numberHorizontalIncrement The number of increment along the horizontal.
	 * @param numberVerticalIncrement The number of increment along the vertical.
	 * @return The mesh.
	 */
	public static Mesh createRectangularFrustum(RectangularFrustrumFieldOfView fov,  int numberHorizontalIncrement, int numberVerticalIncrement)
	{
		float minRadius = (float) fov.getRange().getMinimumDistance();
		float maxRadius = (float) fov.getRange().getMaximumDistance();
		
		float minHorizontalAngle = (float) (fov.getHorizontalFieldOfViewAngle() / -2.0);
		float maxHorizontalAngle = (float) (fov.getHorizontalFieldOfViewAngle() / 2.0);
		float minVerticalAngle = (float) (fov.getVerticalFieldOfViewAngle() / -2.0);
		float maxVerticalAngle = (float) (fov.getVerticalFieldOfViewAngle() / 2.0);
		
		return createRectangularFrustum(minRadius, maxRadius, minHorizontalAngle, maxHorizontalAngle, minVerticalAngle, maxVerticalAngle, numberHorizontalIncrement, numberVerticalIncrement);
	}
	
	/**
	 * Creates a Mesh to represent a RectangularFrustrumFieldOfView volume.
	 * @param minRadius The minimum radius of the FOV.
	 * @param maxRadius The maximum radius of the FOV.
	 * @param minHorizontalAngle The minimum horizontal angle of the FOV, in radians.
	 * @param maxHorizontalAngle The maximum horizontal angle of the FOV, in radians.
	 * @param minVerticalAngle The minimum vertical angle of the FOV, in radians.
	 * @param maxVerticalAngle The maximum vertical angle of the FOV, in radians.
	 * @param numberHorizontalIncrement The number of increment along the horizontal.
	 * @param numberVerticalIncrement The number of increment along the vertical.
	 * @return
	 */
	public static Mesh createRectangularFrustum(float minRadius, float maxRadius, float minHorizontalAngle, float maxHorizontalAngle,
												float minVerticalAngle, float maxVerticalAngle, int numberHorizontalIncrement, int numberVerticalIncrement)
	{
		Mesh mesh = null;	
		
		try
		{
			List<Vector3f> verticesList = new ArrayList<Vector3f>();
			List<Integer> indexesList = new ArrayList<Integer>();
			List<Vector3f> normalslList = new ArrayList<Vector3f>();
			
			// Sides
			generateHorizontalFace(verticesList, indexesList, normalslList, minRadius, maxRadius, minVerticalAngle, minHorizontalAngle, maxHorizontalAngle, numberHorizontalIncrement);
			generateHorizontalFace(verticesList, indexesList, normalslList, minRadius, maxRadius, maxVerticalAngle, minHorizontalAngle, maxHorizontalAngle, numberHorizontalIncrement);
			
			// Top + Bottom
			generateVerticalFace(verticesList, indexesList, normalslList, minRadius, maxRadius, minHorizontalAngle, minVerticalAngle, maxVerticalAngle, numberVerticalIncrement);
			generateVerticalFace(verticesList, indexesList, normalslList, minRadius, maxRadius, maxHorizontalAngle, minVerticalAngle, maxVerticalAngle, numberVerticalIncrement);
			
			// Front + Back
			generateEndFace(verticesList, indexesList, normalslList, minRadius, minHorizontalAngle, maxHorizontalAngle, minVerticalAngle, maxVerticalAngle, numberHorizontalIncrement, numberVerticalIncrement, false);
			generateEndFace(verticesList, indexesList, normalslList, maxRadius, minHorizontalAngle, maxHorizontalAngle, minVerticalAngle, maxVerticalAngle, numberHorizontalIncrement, numberVerticalIncrement, true);
			
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
	
	/**
	 * Generates horizontal face of Rectangular Frustum representation.
	 * @param verticesList List of vertices were to add the points.
	 * @param indexesList  List of vertices indices were to add the index.
	 * @param normalslList List of normals were to add the normals.
	 * @param minRadius Minimum radius.
	 * @param maxRadius Maximum radius.
	 * @param elevationAngle Elevation angle of the face.
	 * @param minHorizontalAngle Minimum horizontal angle, in radians.
	 * @param maxHorizontalAngle Maximum horizontal angle, in radians.
	 * @param numberHorizontalIncrement Number of increment along horizontal direction.
	 */
	public static void generateHorizontalFace(List<Vector3f> verticesList,List<Integer> indexesList, List<Vector3f> normalslList, float minRadius, float maxRadius, float elevationAngle, float minHorizontalAngle, float maxHorizontalAngle, int numberHorizontalIncrement)
	{
		// Creates top
		List<Vector3f> near = generateHorizontalProfile(minRadius, elevationAngle, minHorizontalAngle, maxHorizontalAngle, numberHorizontalIncrement);
		List<Vector3f> far = generateHorizontalProfile(maxRadius, elevationAngle, minHorizontalAngle, maxHorizontalAngle, numberHorizontalIncrement);
		
		int verticeIndex = indexesList.size() - 1;
		for(int i = 0; i < near.size() - 1 ; i++)
		{
			// First triangle.
			verticesList.add(near.get(i));
			verticeIndex++;
			indexesList.add(new Integer(verticeIndex));
			
			verticesList.add(near.get(i+1));
			verticeIndex++;
			indexesList.add(new Integer(verticeIndex));
			
			verticesList.add(far.get(i+1));
			verticeIndex++;
			indexesList.add(new Integer(verticeIndex));
			
			// Normal
			Vector3f normal1 = JME3Utilities.computeTriangleNormal(near.get(i), near.get(i+1), far.get(i+1));
			normalslList.add(normal1);	
			normalslList.add(normal1);
			normalslList.add(normal1);
			
			// Second triangle.
			verticesList.add(near.get(i));
			verticeIndex++;
			indexesList.add(new Integer(verticeIndex));

			verticesList.add(far.get(i+1));
			verticeIndex++;
			indexesList.add(new Integer(verticeIndex));
			
			verticesList.add(far.get(i));
			verticeIndex++;
			indexesList.add(new Integer(verticeIndex));
			
			Vector3f normal2 = JME3Utilities.computeTriangleNormal(near.get(i), far.get(i+1), far.get(i));
			normalslList.add(normal2);	
			normalslList.add(normal2);
			normalslList.add(normal2);
		}
	}
			
	/**
	 * Generates vertical face of Rectangular Frustum representation.
	 * @param verticesList List of vertices were to add the points.
	 * @param indexesList  List of vertices indices were to add the index.
	 * @param normalslList List of normals were to add the normals.
	 * @param minRadius Minimum radius.
	 * @param maxRadius Maximum radius.
	 * @param azimuthAngle Azimuth angle of the face.
	 * @param minVerticalAngle Minimum vertical angle, in radians.
	 * @param maxVerticalAngle Maximum vertical angle, in radians.
	 * @param numberVerticalIncrement Number of increment along vertical direction.
	 */
	public static void generateVerticalFace(List<Vector3f> verticesList,List<Integer> indexesList, List<Vector3f> normalslList, float minRadius, float maxRadius, float azimuthAngle, float minVerticalAngle, float maxVerticalAngle, int numberVerticalIncrement)
	{
		// Creates top
		List<Vector3f> near = generateVerticalProfile(minRadius, azimuthAngle, minVerticalAngle, maxVerticalAngle, numberVerticalIncrement);
		List<Vector3f> far = generateVerticalProfile(maxRadius, azimuthAngle, minVerticalAngle, maxVerticalAngle, numberVerticalIncrement);
		
		int verticeIndex = indexesList.size() - 1;
		for(int i = 0; i < near.size() - 1 ; i++)
		{
			// First triangle.
			verticesList.add(near.get(i));
			verticeIndex++;
			indexesList.add(new Integer(verticeIndex));
			
			verticesList.add(near.get(i+1));
			verticeIndex++;
			indexesList.add(new Integer(verticeIndex));
			
			verticesList.add(far.get(i+1));
			verticeIndex++;
			indexesList.add(new Integer(verticeIndex));
			
			// Normal
			Vector3f normal1 = JME3Utilities.computeTriangleNormal(near.get(i), near.get(i+1), far.get(i+1));
			normalslList.add(normal1);	
			normalslList.add(normal1);
			normalslList.add(normal1);
			
			// Second triangle.
			verticesList.add(near.get(i));
			verticeIndex++;
			indexesList.add(new Integer(verticeIndex));

			verticesList.add(far.get(i+1));
			verticeIndex++;
			indexesList.add(new Integer(verticeIndex));
			
			verticesList.add(far.get(i));
			verticeIndex++;
			indexesList.add(new Integer(verticeIndex));
			
			Vector3f normal2 = JME3Utilities.computeTriangleNormal(near.get(i), far.get(i+1), far.get(i));
			normalslList.add(normal2);	
			normalslList.add(normal2);
			normalslList.add(normal2);
		}
	}
	
	
	private static List<Vector3f> generateHorizontalProfile(float radius, float elevationAngle, float minHorizontalAngle, float maxHorizontalAngle, int numberHorizontalIncrement)
	{
		List<Vector3f> vertices = new ArrayList<Vector3f>();
		
		double azimuthAngleIncrement = (maxHorizontalAngle - minHorizontalAngle) / (numberHorizontalIncrement - 1);
		double azimuthAngle = minHorizontalAngle;
		float l = (float) (radius * Math.cos(elevationAngle));
		
		for (int azimuth = 0; azimuth < numberHorizontalIncrement; azimuth++) 
		{									
			float x = (float) (radius * Math.sin(elevationAngle));
			float y = (float) (l * Math.sin(azimuthAngle));
			float z = (float) (l * Math.cos(azimuthAngle));
						
			vertices.add(new Vector3f(x, y, z));
			
			azimuthAngle += azimuthAngleIncrement;
		}
		
		return vertices;
	}
	
	private static List<Vector3f> generateVerticalProfile(float radius, float azimuthAngle, float minVerticalAngle, float maxVerticalAngle, int numberVerticalIncrement)
	{
		List<Vector3f> vertices = new ArrayList<Vector3f>();
		
		double elevationAngleIncrement = (maxVerticalAngle - minVerticalAngle) / (numberVerticalIncrement - 1);
		double elevationAngle = minVerticalAngle;				
		for (int elevation = 0; elevation < numberVerticalIncrement; elevation++) 
		{
			float l = (float) (radius * Math.cos(elevationAngle));
			
			float x = (float) (radius * Math.sin(elevationAngle));
			float y = (float) (l * Math.sin(azimuthAngle));			
			float z = (float) (l * Math.cos(azimuthAngle));
						
			vertices.add(new Vector3f(x, y, z));
			
			elevationAngle += elevationAngleIncrement;
		}
		
		return vertices;
	}
	
	public static void generateEndFace(List<Vector3f> verticesList,List<Integer> indexesList, List<Vector3f> normalslList, float radius, float minHorizontalAngle, float maxHorizontalAngle, float minVerticalAngle, float maxVerticalAngle, int numberHorizontalIncrement, int numberVerticalIncrement, boolean invertNormals)
	{
		int verticeIndex = indexesList.size() - 1;
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
				
				verticesArray[elevation][azimuth] = new Vector3f(x, y, z);
				
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
				
				verticesList.add(p0);
				verticeIndex++;
				indexesList.add(new Integer(verticeIndex));
				
				verticesList.add(p1);
				verticeIndex++;
				indexesList.add(new Integer(verticeIndex));
				
				verticesList.add(p2);
				verticeIndex++;
				indexesList.add(new Integer(verticeIndex));
								
				Vector3f normal1 = null;
				if(invertNormals) normal1 = JME3Utilities.computeTriangleNormal(p2, p1, p0);
				else normal1 = JME3Utilities.computeTriangleNormal(p0, p1, p2);
									
				normalslList.add(normal1);	
				normalslList.add(normal1);
				normalslList.add(normal1);
				
				// Second Triangle				
				p0 = verticesArray[elevation][azimuth];
				p1 = verticesArray[elevation + 1][azimuth + 1];
				p2 = verticesArray[elevation + 1][azimuth];
				
				verticesList.add(p0);
				verticeIndex++;
				indexesList.add(new Integer(verticeIndex));
				
				verticesList.add(p1);
				verticeIndex++;
				indexesList.add(new Integer(verticeIndex));
				
				verticesList.add(p2);
				verticeIndex++;
				indexesList.add(new Integer(verticeIndex));
				
				Vector3f normal2 = null;						
				if(invertNormals) normal2 = JME3Utilities.computeTriangleNormal(p2, p1, p0);
				else normal2 = JME3Utilities.computeTriangleNormal(p0, p1, p2);
				
				normalslList.add(normal2);	
				normalslList.add(normal2);
				normalslList.add(normal2);
			}					
		}								
	}
}
