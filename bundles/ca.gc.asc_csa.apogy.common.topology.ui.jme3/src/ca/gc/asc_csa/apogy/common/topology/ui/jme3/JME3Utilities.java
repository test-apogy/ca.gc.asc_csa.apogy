package ca.gc.asc_csa.apogy.common.topology.ui.jme3;
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

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.vecmath.Matrix3d;
import javax.vecmath.Vector3d;

import org.eclipse.swt.graphics.RGB;

import com.jme3.asset.AssetManager;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Matrix3f;
import com.jme3.math.Quaternion;
import com.jme3.math.Transform;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.scene.Node;
import com.jme3.scene.Spatial;
import com.jme3.scene.VertexBuffer;
import com.jme3.texture.Texture2D;
import com.jme3.texture.plugins.AWTLoader;
import com.jme3.util.BufferUtils;

import ca.gc.asc_csa.apogy.common.topology.ui.ShadowMode;

public class JME3Utilities 
{	
	private static OS os = OS.UNINITIALIZED; 
	
	public enum OS 
	{
	    UNINITIALIZED, LINUX, WINDOWS, MACOS
	}
	
	public static ColorRGBA convertToColorRGBA(RGB rgb)
	{		
		return new ColorRGBA((float) rgb.red / 255.0f, (float) rgb.green / 255.0f, (float) rgb.blue / 255.0f, 1.0f);
	}
	
	public static RGB convertToColorRGB(ColorRGBA colorRGBA)
	{
		int red = Math.round(colorRGBA.r * 255.0f);
		int green = Math.round(colorRGBA.g * 255.0f);
		int blue = Math.round(colorRGBA.b * 255.0f);
		return new RGB(red, green, blue);
	}
	
	public static ColorRGBA convertToColorRGBA(javax.vecmath.Color3f color3f)
	{
		return new ColorRGBA(color3f.x, color3f.y, color3f.z, 1.0f);
	}
	
	public static java.awt.Color convertToAWTColor(ColorRGBA colorRGBA)
	{
		return new Color(colorRGBA.getRed(), colorRGBA.getGreen(), colorRGBA.getBlue(), colorRGBA.getAlpha());
	}
	
	public static int[] convertToColorIntRGBA(ColorRGBA colorRGBA)
	{
		int red = (int) Math.floor(colorRGBA.getRed() * 255.0);
		int green = (int) Math.floor(colorRGBA.getGreen() * 255.0);
		int blue = (int) Math.floor(colorRGBA.getBlue() * 255.0);
		int alpha = (int) Math.floor(colorRGBA.getAlpha() * 255.0);	
		return new int[]{red, green, blue, alpha};
	}
	
	/**
	 * Creates a Geometry containing a reference frame 
	 * @param axisLength
	 * @return
	 */
	public static Geometry createAxis3D(float axisLength, AssetManager assetManager)
	{		
		// Vertices
		Vector3f[] vertices = new Vector3f[6];
		vertices[0] = new Vector3f(0,0,0);
		vertices[1] = new Vector3f(axisLength,0,0);
		
		vertices[2] = new Vector3f(0,0,0);
		vertices[3] = new Vector3f(0,axisLength,0);
		
		vertices[4] = new Vector3f(0,0,0);
		vertices[5] = new Vector3f(0,0,axisLength);
		
		// Lines Index
		int [] indexes = new int[]{0,1,2,3,4,5};
					
		// Colors
		float[] colorArray = new float[]{1,0,0,1, 1,0,0,1, 
									     0,1,0,1, 0,1,0,1,
									     0,0,1,1, 0,0,1,1};
		
		// Creates a mesh shown as lines.
		Mesh m = new Mesh();
		m.setMode(Mesh.Mode.Lines);
		
		m.setBuffer(VertexBuffer.Type.Position, 3, BufferUtils.createFloatBuffer(vertices));
		m.setBuffer(VertexBuffer.Type.Index, 2, BufferUtils.createIntBuffer(indexes));
		m.setBuffer(com.jme3.scene.VertexBuffer.Type.Color, 4, colorArray);			
		m.updateBound();
				
		Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setBoolean("VertexColor", true);        
		Geometry geometry = new Geometry("Axis3D", m);
		geometry.setMaterial(mat);
		
		return geometry;
	}
	
	public static List<Geometry> getAllChildrenGeometry(Node node)
	{
		List<Geometry> geometries = new ArrayList<Geometry>();
		
		for(Spatial child : node.getChildren())
		{
			if(child instanceof Geometry)
			{
				Geometry geometry = (Geometry) child;
				geometries.add(geometry);
			}
			else if(child instanceof Node)
			{
				Node childNode = (Node) child;				
				geometries.addAll(getAllChildrenGeometry(childNode));
			}
		}
		
		return geometries;
	}
	
	
	public static Matrix3f convertToJME3Matrix3f(javax.vecmath.Matrix3d matrix3d)
	{
		return new Matrix3f((float) matrix3d.m00, (float) matrix3d.m01, (float) matrix3d.m02, (float) matrix3d.m10, (float) matrix3d.m11, (float) matrix3d.m12, (float) matrix3d.m20, (float) matrix3d.m21, (float) matrix3d.m22);
	}
		
	public static Quaternion createQuaternion(javax.vecmath.Matrix3d matrix3d)
	{
		Matrix3f m = convertToJME3Matrix3f(matrix3d);				
		Quaternion quaternion = new Quaternion();
		quaternion.fromRotationMatrix(m);
		
		return quaternion;
	}
	
	/**
	 * Creates a Transform based on a Matrix4d
	 * @param matrix4d The matrix4d.
	 * @return The resulting Transform.
	 */
	public static Transform createTransform(javax.vecmath.Matrix4d matrix4d)
	{		
		// Translation.		
		Vector3d position = new Vector3d();
		matrix4d.get(position);		
		Vector3f translation = new Vector3f((float) position.x, (float) position.y, (float) position.z);
		
		// Rotation.
		javax.vecmath.Matrix3d matrix3d = new Matrix3d();
		matrix3d.setIdentity();		
		matrix4d.get(matrix3d);		
		Quaternion rotation = JME3Utilities.createQuaternion(matrix3d);
	
		// Creates transform.
		return new Transform(translation, rotation);
	}
	
	/**
	 * Compute the normal associated with a triangle defined by three vertices in counter-clockwise direction.
	 * @param p0 The first vertex.
	 * @param p1 The second vertex.
	 * @param p2 The third vertex.
	 * @return The normal.
	 */
	public static Vector3f computeTriangleNormal(Vector3f p0, Vector3f p1, Vector3f p2)
	{
		Vector3f v1 = new Vector3f(p1);
		v1 = v1.subtract(p0);
		
		Vector3f v2 = new Vector3f(p2);
		v2 = v2.subtract(p1);
		Vector3f normal = v1.cross(v2);
		
		normal.normalize();
		return normal;
	}
	
	public static float[] convertToFloatArray(Vector2f[][] input)
	{
		int rows = input.length;
		int columns = input[0].length; 
		
		float[] array = new float[rows * columns * 2];
		int i = 0;
		
		for(int x =0; x < rows; x++)
		{		
			for(int y =0; y < columns; y++)
			{
				Vector2f v = input[x][y];
				array[2*i] = v.x;
				array[2*i + 1] = v.y;				
				i++;
			}
		}
		
		return array;
	}
	
	/**
	 * Converts a List of Vector3f to an array of float.
	 * @param list The list.
	 * @return The array of float.
	 */
	public static float[] convertListOfVector2fToFloatArray(List<Vector2f> list)
	{	
		float[] array = new float[list.size() * 2];
		
		int i = 0;		
		for(Vector2f v : list)
		{			
			array[2*i] = v.x;
			array[2*i + 1] = v.y;
			i++;
		}
		
		return array;
	}
	
	/**
	 * Converts a List of Vector3f to an array of float.
	 * @param list The list.
	 * @return The array of float.
	 */
	public static float[] convertToFloatArray(List<Vector3f> list)
	{		
		float[] array = new float[list.size() * 3];
		
		int i = 0;		
		for(Vector3f v : list)
		{			
			array[3*i] = v.x;
			array[3*i + 1] = v.y;
			array[3*i + 2] = v.z;
			i++;
		}
		
		return array;
	}	
				
	/**
	 * Converts a List of Vector3f to an array of float.
	 * @param list The list.
	 * @return The array of float.
	 */
	public static float[] convertVector2fListToFloatArray(List<Vector2f> list)
	{		
		float[] array = new float[list.size() * 2];
		
		int i = 0;		
		for(Vector2f v : list)
		{			
			array[2*i] = v.x;
			array[2*i + 1] = v.y;		
			i++;
		}
		
		return array;
	}	
	
	/**
	 * Converts a List of Integer to an array of int.
	 * @param list The list.
	 * @return The array of int.
	 */
	public static int[] convertToIntArray(List<Integer> list)
	{		
		int[] array = new int[list.size()];
		int i = 0;
		for(Integer value : list)
		{
			array[i] = value.intValue();
			i++;
		}
		return array;		
	}
	
	public static float[] convertRGBAListToFloatArray(List<ColorRGBA> list)
	{
		float[] array = new float[list.size() * 4];
		
		int i = 0;		
		for(ColorRGBA color : list)
		{			
			int indexBase = 4 * i;
			array[indexBase]     = color.r;
			array[indexBase + 1] = color.g;
			array[indexBase + 2] = color.b;
			array[indexBase + 3] = color.a;					
			i++;
		}
		
		return array;
	}
	
	public static Vector3f convertToVector3f(javax.vecmath.Tuple3d tuple3d)
	{
		return new Vector3f((float) tuple3d.x, (float) tuple3d.y, (float) tuple3d.z);
	}
	
	public static javax.vecmath.Vector3f convertToJavaxVector3f(Vector3f vector3f)
	{
		return new javax.vecmath.Vector3f(vector3f.x, vector3f.y, vector3f.z);
	}
	
	public static Texture2D createTexture2D(BufferedImage bufferedImage, AssetManager assetManager)
	{
		AWTLoader awtLoader = new AWTLoader();
		com.jme3.texture.Image img = awtLoader.load(bufferedImage, true);						
		Texture2D texture = new Texture2D(img);
		
		return texture;
	}
	
	public static Material createMaterial(BufferedImage bufferedImage, AssetManager assetManager)
	{					
		Texture2D texture = createTexture2D(bufferedImage, assetManager);
		
		Material material = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");			
		material.setTexture("ColorMap", texture);
		
		return material;
	}
	
	public static com.jme3.renderer.queue.RenderQueue.ShadowMode convertToJMEShadowMode(ShadowMode shadowMode)
	{
		com.jme3.renderer.queue.RenderQueue.ShadowMode mode = com.jme3.renderer.queue.RenderQueue.ShadowMode.Inherit;
		
		switch (shadowMode.getValue()) 
		{
			case ShadowMode.OFF_VALUE:
				mode =  com.jme3.renderer.queue.RenderQueue.ShadowMode.Off;
			break;
			
			case ShadowMode.INHERIT_VALUE:
				mode =  com.jme3.renderer.queue.RenderQueue.ShadowMode.Inherit;
			break;
			
			case ShadowMode.CAST_VALUE:
				mode =  com.jme3.renderer.queue.RenderQueue.ShadowMode.Cast;
			break;
			
			case ShadowMode.RECEIVE_VALUE:
				mode =  com.jme3.renderer.queue.RenderQueue.ShadowMode.Receive;
			break;
			
			case ShadowMode.CAST_AND_RECEIVE_VALUE:
				mode =  com.jme3.renderer.queue.RenderQueue.ShadowMode.CastAndReceive;
			break;
			
			default:					
			break;
		}
		
		return mode;
	}
	

	public static String sceneTopologyAsHTML(Spatial root)
	{		
		return expandSpatialAsHTML(root);
	}
	
	
	public static OS getOS()
	{		
		if(os == OS.UNINITIALIZED)
		{
			String osName = System.getProperty("os.name");
			if(osName.startsWith("Windows"))
			{
				os = OS.WINDOWS;
			}
			else if(osName.startsWith("Linux"))
			{
				os = OS.LINUX;
			}
			else if(osName.startsWith("Mac"))
			{
				os = OS.MACOS;
			}			
		}
			
		return os;
	}
	
	
	private static String expandSpatialAsHTML(com.jme3.scene.Spatial spatial) 
	{				
		String s = new String("<!DOCTYPE html>\n");		
		s+= "\t<html>\n";
		s+= "\t\t<head>\n";		
		s+= "\t\t\t<script type='text/javascript' src='https://www.google.com/jsapi'></script>\n";
		s+= "\t\t\t<script type='text/javascript'>\n";
		s+= "\t\t\t google.load('visualization', '1', {packages:['orgchart']});\n";
		s+= "\t\t\t google.setOnLoadCallback(drawChart);\n";
		s+= "\t\t\t function drawChart() {\n";
		s+= "\t\t\t\t var data = new google.visualization.DataTable();\n";
		s+= "\t\t\t\t data.addColumn('string', 'Node');\n";
		s+= "\t\t\t\t data.addColumn('string', 'Parent')\n;";
		s+= "\t\t\t\t data.addRows([";
		
		Map <com.jme3.scene.Spatial, String> spatialToNameMap = new HashMap<com.jme3.scene.Spatial, String>();
		List<String[]> nodeParentList = new ArrayList<String[]>();
							
		expandSpatialAsHTMLRecursive(spatialToNameMap, nodeParentList, spatial);
		
		Iterator<String[]> it = nodeParentList.iterator();
		while(it.hasNext())
		{
			String[] parentNode = it.next();
			s += "\t\t\t\t\t['" + parentNode[0] + "' , '" + parentNode[1] + "']";
			
			if(it.hasNext())
			{
				s+= ",\n";
			}
			else
			{
				s+= "\n";
			}			
		}
				
		s+= "\t\t\t\t ]);\n";
		s+= "\t\t\t\t var chart = new google.visualization.OrgChart(document.getElementById('chart_div'));\n";
		s+= "\t\t\t\t chart.draw(data);\n";
		s+= "\t\t\t}\n";
		s+= "\t\t\t</script>\n";
		s+= "\t\t</head>\n";
		s+= "\t<body>\n";
		s+= "\t\t<div id='chart_div'></div>\n";
		s+= "\t</body>\n";
		s+= "</html>\n";
		
		return s;
	}
	
	private static void expandSpatialAsHTMLRecursive(Map <com.jme3.scene.Spatial, String> spatialToNameMap, List<String[]> nodeParentList, com.jme3.scene.Spatial spatial)
	{
		// Adds the spatial to the map.
		String nodeName = getNameForSpatial(spatial);
		spatialToNameMap.put(spatial, nodeName);
		
		// Adds the spatial and its parent to the nodeParentList.
		String parentName = spatialToNameMap.get(spatial.getParent());
		if(parentName == null) parentName = "";
		String[] nodeParent = new String[]{nodeName, parentName};
		nodeParentList.add(nodeParent);
		
		if(spatial instanceof Node)
		{
			com.jme3.scene.Node parent = (com.jme3.scene.Node) spatial;
								
			for(Spatial child : parent.getChildren())
			{				
				expandSpatialAsHTMLRecursive(spatialToNameMap, nodeParentList, child);
			}
		}
	}
	
	private static String getNameForSpatial(com.jme3.scene.Spatial spatial)
	{
		String s = new String();
		
		if(spatial.getName() != null)
		{
			s += spatial.getName().replaceAll(" ", "_") + "(" + Integer.toString(spatial.hashCode()) + ")";
		}
		else
		{		
			s += Integer.toString(spatial.hashCode());
		}
		
		return s;
	}
}
