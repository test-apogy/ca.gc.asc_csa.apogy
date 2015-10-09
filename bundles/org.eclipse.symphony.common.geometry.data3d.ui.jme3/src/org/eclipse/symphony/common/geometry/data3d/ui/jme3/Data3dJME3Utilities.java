package org.eclipse.symphony.common.geometry.data3d.ui.jme3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.symphony.common.geometry.data3d.CartesianAxis;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangle;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh;
import org.eclipse.symphony.common.geometry.data3d.Geometry3dUtilities;

import ca.gc.asc_csa.topology.ui.jme3.JME3Utilities;

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
			Vector2f[] textureCoordArray = new Vector2f[cartesianTriangularMesh.getPoints().size()];
			
			// Gets the X and Y Extent of the mesh				
			float minX = (float) Geometry3dUtilities.getMinimumPosition(CartesianAxis.X, cartesianTriangularMesh.getPoints()).getX();
			float maxX = (float) Geometry3dUtilities.getMaximumPosition(CartesianAxis.X, cartesianTriangularMesh.getPoints()).getX();
			float xExtent = maxX - minX;
			
			float minY = (float) Geometry3dUtilities.getMinimumPosition(CartesianAxis.Y, cartesianTriangularMesh.getPoints()).getY();
			float maxY = (float) Geometry3dUtilities.getMaximumPosition(CartesianAxis.Y, cartesianTriangularMesh.getPoints()).getY();				
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
				System.err.println("Position " + verticesArray.length);
				System.err.println("Index " + indexesList.size());
				System.err.println("Normal " + normalslList.size());
			}
			
			mesh.setMode(Mode.Triangles);			
			mesh.setBuffer( com.jme3.scene.VertexBuffer.Type.Position, 3, BufferUtils.createFloatBuffer(verticesArray));
			mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Index, 3, BufferUtils.createIntBuffer(JME3Utilities.convertToIntArray(indexesList)));
			mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Normal, 3, BufferUtils.createFloatBuffer(JME3Utilities.convertToFloatArray(normalslList)));
			mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.TexCoord, 2, BufferUtils.createFloatBuffer(textureCoordArray));			
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