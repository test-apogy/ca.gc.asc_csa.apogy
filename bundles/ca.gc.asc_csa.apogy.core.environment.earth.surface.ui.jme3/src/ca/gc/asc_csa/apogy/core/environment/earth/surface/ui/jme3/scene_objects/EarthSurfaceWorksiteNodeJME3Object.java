package ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.jme3.scene_objects;
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

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

import javax.media.j3d.LineAttributes;
import javax.media.j3d.Transform3D;
import javax.vecmath.Matrix4d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

import com.jme3.asset.AssetManager;
import com.jme3.font.BitmapFont;
import com.jme3.font.BitmapText;
import com.jme3.font.Rectangle;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.renderer.queue.RenderQueue;
import com.jme3.renderer.queue.RenderQueue.ShadowMode;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.scene.Node;
import com.jme3.util.BufferUtils;

import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Utilities;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.scene_objects.DefaultJME3SceneObject;
import ca.gc.asc_csa.apogy.core.environment.Worksite;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSurfaceWorksite;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSurfaceWorksiteNode;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.jme3.EnvironmentUIJME3Utilities;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.scene_objects.EarthSurfaceWorksiteSceneObject;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.Activator;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.jme3.SurfaceEnvironmentJMEConstants;


public class EarthSurfaceWorksiteNodeJME3Object extends DefaultJME3SceneObject<EarthSurfaceWorksiteNode> implements EarthSurfaceWorksiteSceneObject
{					
	public static final String DEGREE_STRING = 	"\u00b0";
	
	public static final ColorRGBA DEFAULT_GRID_COLOR = new ColorRGBA(0.2f, 0.2f, 0.2f, 1.0f);
	public static final ColorRGBA DEFAULT_AZIMUTH_LINES_COLOR = new ColorRGBA(0.0f, 1.0f, 0.0f, 1.0f);
	
	/** Azimuth display properties. */
	public static final float AZIMUTH_DISPLAY_RADIUS  = (float) (SurfaceEnvironmentJMEConstants.CELESTIAL_SPHERE_RADIUS * 0.75);	
	public static final float AZIMUTH_MAJOR_TICKS_HEIGHT = (float) (AZIMUTH_DISPLAY_RADIUS * Math.tan(Math.toRadians(2)));
	public static final float AZIMUTH_MIDDLE_TICKS_HEIGHT = AZIMUTH_MAJOR_TICKS_HEIGHT * 0.5f;
	public static final float AZIMUTH_MINOR_TICKS_HEIGHT = AZIMUTH_MAJOR_TICKS_HEIGHT * 0.25f;
	
	public static final int MAJOR_TICKS_FONT_SIZE = Math.round((float)(20 * (AZIMUTH_DISPLAY_RADIUS / 1000.0)));	
	public static final int MIDDLE_TICKS_FONT_SIZE = Math.round((float)(15 * (AZIMUTH_DISPLAY_RADIUS / 1000.0)));
	public static final int MINOR_TICKS_FONT_SIZE = Math.round((float)(15 * (AZIMUTH_DISPLAY_RADIUS / 1000.0)));
	
	public static final float AZIMUTH_MAJOR_TICK_ANGLE_INTERVAL_IN_DEG = 90.0f;
	public static final float AZIMUTH_MID_TICK_ANGLE_INTERVAL_IN_DEG = 45.0f;
	public static final float AZIMUTH_MINOR_TICK_ANGLE_INTERVAL_IN_DEG = 5.0f;
			
	/** Elevation circles display properties. */
	public static final float ELEVATION_DISPLAY_RADIUS  = (float) (SurfaceEnvironmentJMEConstants.CELESTIAL_SPHERE_RADIUS * 0.75f);
	public static final float ELEVATION_LINES_ANGLE_INTERVAL_IN_DEG = 5.0f;
	public static final float ELEVATION_AZIMUTH_INTERVAL_IN_DEG = 5.0f;
	public static final float ELEVATION_LABEL_AZIMUTH_INTERVAL_IN_DEG = 45.0f;
	
	/** Azimuth circles display properties. */	
	public static final float AZIMUTH_LINES_ANGLE_INTERVAL_IN_DEG = 10f;
	public static final float AZIMUTH_LABEL_AZIMUTH_INTERVAL_IN_DEG = 45.0f;
	public static final float AZIMUTH_ELEVATION_INTERVAL_IN_DEG = 5.0f;
	public static final float AZIMUTH_MIN_ELEVATION_ANGLE_IN_DEG = 1.5f;
	public static final float AZIMUTH_MAX_ELEVATION_ANGLE_IN_DEG = 90 - ELEVATION_AZIMUTH_INTERVAL_IN_DEG;
			
	private DecimalFormat decimalFormat = new DecimalFormat("0.0");
	
	private Adapter adapter;
	
	private boolean axisVisible = true;
	private float axisLength = 1.0f;
	
	private boolean planeVisible = true;
	private float gridSize = 1;
	private float planeSize = 1;	
	
	private boolean azimuthVisible = true;
	private boolean azimuthLinesVisible = true;
	private boolean elevationLinesVisible = true;

	
	private Map<Double, String> labelMap;	
		
	private AssetManager assetManager;	
	
	private Geometry gridGeometry = null;
	//private Geometry planeGeometry = null;
	private Geometry axisGeometry = null;	
	
	private Node skyNode = null;
	private Node azimuthDisplayNode = null;
	private Node azimuthDisplayCirclesNode = null;
	private Node elevationDisplayCirclesNode = null;
		
	public EarthSurfaceWorksiteNodeJME3Object(EarthSurfaceWorksiteNode node, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(node, jme3RenderEngineDelegate);
				
		this.assetManager = jme3Application.getAssetManager();		
		
		// Creates geometry.
		createGeometry();			
				
		// Listens for changes on the Worksite.
		node.eAdapters().add(getAdapter());
		if(node.getWorksite() instanceof EarthSurfaceWorksite)
		{
			EarthSurfaceWorksite earthSurfaceWorksite = (EarthSurfaceWorksite) node.getWorksite();
			earthSurfaceWorksite.eAdapters().add(getAdapter());			
			updateSkyTransform(earthSurfaceWorksite.getXAxisAzimuth());
		}					
	}
		
	@Override
	public List<Geometry> getGeometries() 
	{		
		List<Geometry> geometries = new ArrayList<Geometry>();
		geometries.add(gridGeometry);		
		geometries.add(axisGeometry);
		return geometries;
	}
	
	
	@Override
	public void setPlaneVisible(boolean newPlaneVisible)
	{
		this.planeVisible = newPlaneVisible;
		
		Logger.INSTANCE.log(Activator.ID, this, "Setting Plane visibility to <" + newPlaneVisible + ">", EventSeverity.INFO);
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{	
				if(gridGeometry != null) 
				{
					if(planeVisible)
					{
						getAttachmentNode().attachChild(gridGeometry);
					}
					else
					{
						getAttachmentNode().detachChild(gridGeometry);
					}	
				}
				
				return null;
			}
		});		
	}
	
	@Override
	public void setPlaneParameters(double newGridSize, double newPlaneSize)
	{
		Logger.INSTANCE.log(Activator.ID, this, "Setting Plane grid size to <" + newGridSize + "> and grid size to <" + newPlaneSize + ">", EventSeverity.INFO);
		this.gridSize = (float) newGridSize;
		this.planeSize = (float) newPlaneSize;		
		
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{									
				// Detach previous geometry.
				if(gridGeometry != null)
				{
					getAttachmentNode().detachChild(gridGeometry);
				}
				
				gridGeometry = createGridGeometry();
				
				if(planeVisible)
				{
					getAttachmentNode().attachChild(gridGeometry);
				}
				else
				{
					getAttachmentNode().detachChild(gridGeometry);
				}			
				
				return null;
			}
		});	
	}

	@Override
	public void setAxisVisible(boolean newAxisVisible)
	{
		this.axisVisible = newAxisVisible;
		
		Logger.INSTANCE.log(Activator.ID, this, "Setting Axis visibility to <" + newAxisVisible + ">", EventSeverity.INFO);
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{	
				if(axisGeometry != null) 
				{
					if(axisVisible)
					{
						getAttachmentNode().attachChild(axisGeometry);
					}
					else
					{
						getAttachmentNode().detachChild(axisGeometry);
					}	
				}	
				else
				{
					Logger.INSTANCE.log(Activator.ID, this, "Failed to set Axis visibility to <" + newAxisVisible + ">", EventSeverity.ERROR);
				}
				
				return null;
			}
		});		
	}
	
	@Override
	public void setAxisLength(double newLength)
	{				
		this.axisLength = (float) newLength;
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{	
				Logger.INSTANCE.log(Activator.ID, this, "Setting Axis Length to <" + newLength + ">", EventSeverity.INFO);
				try
				{					
					if(axisGeometry != null)
					{
						getAttachmentNode().detachChild(axisGeometry);
					}
					
					// Updates axis geometry
					axisGeometry = JME3Utilities.createAxis3D(axisLength, assetManager);
					
					// If axis geometry is visible, attach the new geometry.
					if(axisVisible)
					{
						getAttachmentNode().attachChild(axisGeometry);
					}
				}
				catch(Throwable t)
				{
					Logger.INSTANCE.log(Activator.ID, this, "Failed to setAxisLength(" + newLength + ")!", EventSeverity.ERROR, t);
				}	
				
				return null;
			}
		});								
	}
	
	@Override
	public void setAzimuthVisible(boolean newAzimuthVisible) 	
	{
		this.azimuthVisible = newAzimuthVisible;
		Logger.INSTANCE.log(Activator.ID, this, "Setting Azimuth visibility to <" + newAzimuthVisible + ">", EventSeverity.INFO);
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{		
				if(skyNode != null) 
				{
					if(azimuthVisible)
					{
						skyNode.attachChild(azimuthDisplayNode);
					}
					else
					{
						skyNode.detachChild(azimuthDisplayNode);
					}
				}
				else
				{
					Logger.INSTANCE.log(Activator.ID, this, "Failed to set Azimuth visibility to <" + newAzimuthVisible + ">", EventSeverity.ERROR);
				}
				
				return null;
			}	
		});	
	}

	@Override
	public void setElevationLinesVisible(boolean newElevationLinesVisible) 
	{
		this.elevationLinesVisible = newElevationLinesVisible;
		Logger.INSTANCE.log(Activator.ID, this, "Setting Elevation Lines visibility to <" + newElevationLinesVisible + ">", EventSeverity.INFO);
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{		
				if(skyNode != null) 
				{
					if(elevationLinesVisible)
					{
						skyNode.attachChild(elevationDisplayCirclesNode);
					}
					else
					{
						skyNode.detachChild(elevationDisplayCirclesNode);
					}
				}
				else
				{
					Logger.INSTANCE.log(Activator.ID, this, "Failed to set Elevation Lines visibility to <" + newElevationLinesVisible + ">", EventSeverity.ERROR);
				}
				return null;
			}	
		});	
	}

	@Override
	public void setAzimuthLinesVisible(final boolean newAzimuthLinesVisible) 
	{
		this.azimuthLinesVisible = newAzimuthLinesVisible;
		
		Logger.INSTANCE.log(Activator.ID, this, "Setting Azimuth Lines visibility to <" + newAzimuthLinesVisible + ">", EventSeverity.INFO);
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{		
				if(skyNode != null) 
				{
					if(azimuthLinesVisible)
					{
						skyNode.attachChild(azimuthDisplayCirclesNode);
					}
					else
					{
						skyNode.detachChild(azimuthDisplayCirclesNode);
					}
				}
				else
				{
					Logger.INSTANCE.log(Activator.ID, this, "Failed to set Azimuth Lines visibility to <" + newAzimuthLinesVisible + ">", EventSeverity.ERROR);
				}
				return null;
			}	
		});		
	}
	
	private void createGeometry()
	{
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{
				if(gridGeometry != null) getAttachmentNode().detachChild(gridGeometry);				
				if(axisGeometry != null) getAttachmentNode().detachChild(axisGeometry);								
				if(skyNode != null)  getAttachmentNode().detachChild(skyNode);

				// Adds the axis
				axisGeometry = JME3Utilities.createAxis3D(axisLength, assetManager);				
				getAttachmentNode().attachChild(axisGeometry);
				
				// Adds the grid				
				gridGeometry = createGridGeometry();
				getAttachmentNode().attachChild(gridGeometry);
																	
				skyNode = createSkyNode();
				getAttachmentNode().attachChild(skyNode);
				
				return null;
			}	
		});		
	}
	
	private Node createSkyNode()
	{
		Node node =  new Node("Worksite Sky");			
									
		azimuthDisplayNode = createAzimuthDisplay();
		node.attachChild(azimuthDisplayNode);
		
		// Azimuth Circle displays
		azimuthDisplayCirclesNode = createAzimuthCirclesDisplay();
		node.attachChild(azimuthDisplayCirclesNode);
		
		// Elevation circle display
		elevationDisplayCirclesNode = createElevationCirclesDisplay();
		node.attachChild(elevationDisplayCirclesNode);		
		
		Matrix4d m = new Matrix4d();
		m.setIdentity();

		if(getTopologyNode().getWorksite() instanceof EarthSurfaceWorksite)
		{
			EarthSurfaceWorksite earthSurfaceWorksite = (EarthSurfaceWorksite) getTopologyNode().getWorksite();					
			m.rotZ(-earthSurfaceWorksite.getXAxisAzimuth());			
		}
										
		node.setLocalTransform(JME3Utilities.createTransform(m));
		
		return node;
	}
	
	private void updateSkyTransform(double newXAxisAzimuthDegrees)
	{
		if(skyNode != null)
		{
			Matrix4d m = new Matrix4d();
			m.setIdentity();
			m.rotZ(-newXAxisAzimuthDegrees);	
			
			skyNode.setLocalTransform(JME3Utilities.createTransform(m));
		}
	}
	
	private Geometry createGridGeometry()
	{
		Mesh gridMesh = EnvironmentUIJME3Utilities.createGrid(gridSize, planeSize);
		
		Geometry geometry = new Geometry("Grid", gridMesh);
		
		Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", DEFAULT_GRID_COLOR.clone());
        geometry.setMaterial(mat);
		
		return geometry;
	}	
	
	private Node createAzimuthDisplay()
	{					
		Node node = new Node("Worksite Azimuth Display.");
		
		List<Vector3f> verticesList = new ArrayList<Vector3f>();
		List<Integer> indexesList = new ArrayList<Integer>();
		
		// Create the major ticks.		
		float angle = 0.0f;
		while(angle < 360)
		{			
			float x = (float) (AZIMUTH_DISPLAY_RADIUS * Math.cos(Math.toRadians(angle)));
			float y = (float) (AZIMUTH_DISPLAY_RADIUS * Math.sin(Math.toRadians(angle)));
			float z0 = 0;
			float z1 = AZIMUTH_MAJOR_TICKS_HEIGHT;
			
			Vector3f p0 = new Vector3f(x, y, z0);
			Vector3f p1 = new Vector3f(x, y, z1);
			
			// Adds line
			verticesList.add(p0);
			verticesList.add(p1);
			
			indexesList.add(verticesList.indexOf(p0));
			indexesList.add(verticesList.indexOf(p1));
			
			// Adds text.
			node.attachChild(createLabel(getAzimuthLabelText(360 - angle), x, y, z1 * 1.1f, Math.toRadians(angle), 0, MAJOR_TICKS_FONT_SIZE));
						
			angle += AZIMUTH_MAJOR_TICK_ANGLE_INTERVAL_IN_DEG;
		}				
		
		// Create the mid ticks.
		angle = 45;
		while(angle < 360)
		{	
			if(Math.IEEEremainder(angle, AZIMUTH_MAJOR_TICK_ANGLE_INTERVAL_IN_DEG) != 0)
			{
				float x = (float) (AZIMUTH_DISPLAY_RADIUS * Math.cos(Math.toRadians(angle)));
				float y = (float) (AZIMUTH_DISPLAY_RADIUS * Math.sin(Math.toRadians(angle)));
				float z0 = 0;
				float z1 = AZIMUTH_MIDDLE_TICKS_HEIGHT;
				
				Vector3f p0 = new Vector3f(x, y, z0);
				Vector3f p1 = new Vector3f(x, y, z1);
				
				// Adds line
				verticesList.add(p0);
				verticesList.add(p1);
				
				indexesList.add(verticesList.indexOf(p0));
				indexesList.add(verticesList.indexOf(p1));
				
				// Adds text.
				node.attachChild(createLabel(getAzimuthLabelText(360 - angle), x, y, z1 * 3f, Math.toRadians(angle), 0, MIDDLE_TICKS_FONT_SIZE));
			}			
			angle += AZIMUTH_MAJOR_TICK_ANGLE_INTERVAL_IN_DEG;
		}
		
		// Create the minor ticks.				
		angle = 0;
		while(angle < 360)
		{		
			if((Math.IEEEremainder(angle, AZIMUTH_MAJOR_TICK_ANGLE_INTERVAL_IN_DEG) != 0) &&
			   (Math.IEEEremainder(angle, AZIMUTH_MID_TICK_ANGLE_INTERVAL_IN_DEG) != 0))
			{
				float x = (float) (AZIMUTH_DISPLAY_RADIUS * Math.cos(Math.toRadians(angle)));
				float y = (float) (AZIMUTH_DISPLAY_RADIUS * Math.sin(Math.toRadians(angle)));
				float z0 = 0;
				float z1 = (float) (AZIMUTH_MINOR_TICKS_HEIGHT);
				
				Vector3f p0 = new Vector3f(x, y, z0);
				Vector3f p1 = new Vector3f(x, y, z1);
				
				// Adds line
				verticesList.add(p0);
				verticesList.add(p1);
				
				indexesList.add(verticesList.indexOf(p0));
				indexesList.add(verticesList.indexOf(p1));	
				
				// Adds text.
				node.attachChild(createLabel(getAzimuthLabelText(360 - angle), x, y, z1 * 3f, Math.toRadians(angle), 0, MINOR_TICKS_FONT_SIZE));
			}
			angle += AZIMUTH_MINOR_TICK_ANGLE_INTERVAL_IN_DEG;
		}
		
		Mesh mesh = new Mesh();
		mesh.setMode(Mesh.Mode.Lines);		
		mesh.setBuffer( com.jme3.scene.VertexBuffer.Type.Position, 3, BufferUtils.createFloatBuffer(JME3Utilities.convertToFloatArray(verticesList)));
		mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Index, 2, BufferUtils.createIntBuffer(JME3Utilities.convertToIntArray(indexesList)));								
		mesh.updateBound();
		mesh.updateCounts();
		
		Geometry azimuthGeometry = new Geometry("Azimuth lines", mesh);
		
		Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", DEFAULT_AZIMUTH_LINES_COLOR.clone());
        azimuthGeometry.setMaterial(mat);
        azimuthGeometry.setShadowMode(ShadowMode.Off);
        
        node.attachChild(azimuthGeometry);
        
        
		return node;
	}	
	
	/**
	 * Creates the elevation circles display.
	 * @return The transformGroup containing the geometries.
	 */
	private Node createElevationCirclesDisplay()
	{
		Node node = new Node("Elevation Circles Display.");
		
		// Adds the cross at the zenith
		Node zenithCross = createZenithCross(1.0f);
		node.attachChild(zenithCross);
													
		// Creates the elevation lines.		
		double elevationAngleInDeg = ELEVATION_LINES_ANGLE_INTERVAL_IN_DEG;
		while(elevationAngleInDeg < 90)
		{
			Node elevationCircle = createElevationCircle(
													elevationAngleInDeg, 
													ELEVATION_AZIMUTH_INTERVAL_IN_DEG,
													ELEVATION_LABEL_AZIMUTH_INTERVAL_IN_DEG,
													0.5f, 
													LineAttributes.PATTERN_DASH);
			elevationAngleInDeg += ELEVATION_LINES_ANGLE_INTERVAL_IN_DEG;
			node.attachChild(elevationCircle);
		}		
		return node;
	}	
	
	/**
	 * Generate a line approximating a circle for a specified elevation angle.
	 * @param elevationAngleInDeg The elevation angle (above horizon), in degrees.
	 * @param azimuthAngleIncrementInDeg The azimuth increment to be used to sweep a circle, in degrees.
	 * @param labelAzimuthIntervalInDeg The azimuth interval of the elevation labels.
	 * @param lineWidth The line width.
	 * @param linePattern The line pattern to use. See LineAttributes.
	 * @return The line.
	 */
	private Node createElevationCircle(final double elevationAngleInDeg, 
												 final double azimuthAngleIncrementInDeg,
												 final double labelAzimuthIntervalInDeg,
												 final float lineWidth,
												 int linePattern)
	{
		Node node = new Node("Elevation Circle");
		
		List<Vector3f> verticesList = new ArrayList<Vector3f>();
		List<Integer> indexesList = new ArrayList<Integer>();		
		
		// Increment the azimuth angle an generate points along the swept circle.
		
		double azimuthAngleInDeg = 0.0;
		while(azimuthAngleInDeg < 360)
		{						
			float d = (float) (ELEVATION_DISPLAY_RADIUS * Math.cos(Math.toRadians(elevationAngleInDeg)));
			
			float x0 = (float) (d * Math.cos(Math.toRadians(azimuthAngleInDeg)));
			float x1 = (float) (d * Math.cos(Math.toRadians(azimuthAngleInDeg + ELEVATION_AZIMUTH_INTERVAL_IN_DEG)));
			float y0 = (float) (d * Math.sin(Math.toRadians(azimuthAngleInDeg)));
			float y1 = (float) (d * Math.sin(Math.toRadians(azimuthAngleInDeg + ELEVATION_AZIMUTH_INTERVAL_IN_DEG)));			
			float z = (float) (ELEVATION_DISPLAY_RADIUS * Math.sin(Math.toRadians(elevationAngleInDeg)));				
			
			// Generate a line between the two points.
			Vector3f p0 = new Vector3f(x0, y0, z);
			Vector3f p1 = new Vector3f(x1, y1, z);
			
			verticesList.add(p0);
			verticesList.add(p1);
			indexesList.add(verticesList.indexOf(p0));
			indexesList.add(verticesList.indexOf(p1));	
			
													
			azimuthAngleInDeg += azimuthAngleIncrementInDeg;
		}
					
		// Adds the elevation labels offseted in azimuth relative to azimuth circles.		
		float labelAzimuthAngleInDeg = (float) (AZIMUTH_LINES_ANGLE_INTERVAL_IN_DEG / 2.0f);
		String labelText = getElevationLabelText(elevationAngleInDeg);
		while(labelAzimuthAngleInDeg < 360)
		{
			float d = (float) (ELEVATION_DISPLAY_RADIUS * Math.cos(Math.toRadians(elevationAngleInDeg)));			
			float x = (float) (d * Math.cos(Math.toRadians(labelAzimuthAngleInDeg )));
			float y = (float) (d * Math.sin(Math.toRadians(labelAzimuthAngleInDeg)));						
			float z = (float) (ELEVATION_DISPLAY_RADIUS * Math.sin(Math.toRadians(elevationAngleInDeg)));										
			
			// Add Text
			node.attachChild(createLabel(labelText, x, y, z, Math.toRadians(labelAzimuthAngleInDeg), Math.toRadians(elevationAngleInDeg), MINOR_TICKS_FONT_SIZE));
			
			labelAzimuthAngleInDeg += labelAzimuthIntervalInDeg;
		}
				
		Mesh mesh = new Mesh();
		mesh.setMode(Mesh.Mode.Lines);		
		mesh.setBuffer( com.jme3.scene.VertexBuffer.Type.Position, 3, BufferUtils.createFloatBuffer(JME3Utilities.convertToFloatArray(verticesList)));
		mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Index, 2, BufferUtils.createIntBuffer(JME3Utilities.convertToIntArray(indexesList)));								
		mesh.updateBound();
		mesh.updateCounts();
		
		Geometry azimuthGeometry = new Geometry("Elevation Circle", mesh);
		
		Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", DEFAULT_AZIMUTH_LINES_COLOR.clone());
        azimuthGeometry.setMaterial(mat);
		
        node.attachChild(azimuthGeometry);
        
		return node;
			
	}
	
	private Node createAzimuthCirclesDisplay()
	{
		Node node = new Node("Azimuth Display Circles");
		
		// Adds the cross at the zenith
		Node zenithCross = createZenithCross(1.0f);
		node.attachChild(zenithCross);
												
		// Creates the elevation lines.		
		double azimuthAngleInDeg = AZIMUTH_LINES_ANGLE_INTERVAL_IN_DEG;
		while(azimuthAngleInDeg <= 360)
		{
			Node azimuthCircle = createAzimuthCircle(azimuthAngleInDeg, 
													AZIMUTH_ELEVATION_INTERVAL_IN_DEG,
													AZIMUTH_MIN_ELEVATION_ANGLE_IN_DEG,
													AZIMUTH_MAX_ELEVATION_ANGLE_IN_DEG,
													AZIMUTH_LABEL_AZIMUTH_INTERVAL_IN_DEG,
													0.5f, 
													LineAttributes.PATTERN_DASH);
			azimuthAngleInDeg += AZIMUTH_LINES_ANGLE_INTERVAL_IN_DEG;
			node.attachChild(azimuthCircle);
		}
		
		return node;
	}	
	
	
	private Node createAzimuthCircle(final double azimuthAngleInDeg, 
			 								   final double elevationAngleIncrementInDeg,
			 								   final double minimumElevationAngleInDeg,
			 								   final double maximumElevationAngleInDeg,
			 								   final double labelElevationIntervalInDeg,
			 								   final float lineWidth,
			 								   int linePattern)
	{
		Node node = new Node("Azimuth Circle");
		
		List<Vector3f> verticesList = new ArrayList<Vector3f>();
		List<Integer> indexesList = new ArrayList<Integer>();		

		
		// Increment the elevation angle an generate points along the swept circle.		
		double elevationAngleInDeg = minimumElevationAngleInDeg;
		while(elevationAngleInDeg < maximumElevationAngleInDeg )
		{						
			double elevationAngleInDegHigh = elevationAngleInDeg + elevationAngleIncrementInDeg;
			if(elevationAngleInDegHigh > maximumElevationAngleInDeg)
			{
				elevationAngleInDegHigh = maximumElevationAngleInDeg;
			}
			
			float d0 = (float) (ELEVATION_DISPLAY_RADIUS * Math.cos(Math.toRadians(elevationAngleInDeg)));
			float d1 = (float) (ELEVATION_DISPLAY_RADIUS * Math.cos(Math.toRadians(elevationAngleInDegHigh)));
			
			float x0 = (float) (d0 * Math.cos(Math.toRadians(azimuthAngleInDeg)));
			float x1 = (float) (d1 * Math.cos(Math.toRadians(azimuthAngleInDeg)));
			float y0 = (float) (d0 * Math.sin(Math.toRadians(azimuthAngleInDeg)));
			float y1 = (float) (d1 * Math.sin(Math.toRadians(azimuthAngleInDeg)));			
			float z0 = (float) (ELEVATION_DISPLAY_RADIUS * Math.sin(Math.toRadians(elevationAngleInDeg)));				
			float z1 = (float) (ELEVATION_DISPLAY_RADIUS * Math.sin(Math.toRadians(elevationAngleInDegHigh)));
			
			// Generate a line between the two points.
			Vector3f p0 = new Vector3f(x0, y0, z0);
			Vector3f p1 = new Vector3f(x1, y1, z1);
						
			verticesList.add(p0);
			verticesList.add(p1);		
			indexesList.add(verticesList.indexOf(p0));
			indexesList.add(verticesList.indexOf(p1));	
			
			elevationAngleInDeg += elevationAngleIncrementInDeg;
		}					
				
		Mesh mesh = new Mesh();
		mesh.setMode(Mesh.Mode.Lines);		
		mesh.setBuffer( com.jme3.scene.VertexBuffer.Type.Position, 3, BufferUtils.createFloatBuffer(JME3Utilities.convertToFloatArray(verticesList)));
		mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Index, 2, BufferUtils.createIntBuffer(JME3Utilities.convertToIntArray(indexesList)));								
		mesh.updateBound();
		mesh.updateCounts();
		
		Geometry azimuthGeometry = new Geometry("Azimuth lines", mesh);
		
		Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", DEFAULT_AZIMUTH_LINES_COLOR.clone());
        azimuthGeometry.setMaterial(mat);
        azimuthGeometry.setShadowMode(ShadowMode.Off);
		
        node.attachChild(azimuthGeometry);
        
		return node;
	}
	
	/**
	 * Creates a cross at the zenith.
	 * @param crossAngularSpanInDeg The angular span of the cross members, in degrees.
	 * @return The line array representing the cross.
	 */
	private Node createZenithCross(float crossAngularSpanInDeg)
	{
		Node node = new Node("Zenith Cross.");
		
		List<Vector3f> verticesList = new ArrayList<Vector3f>();
		List<Integer> indexesList = new ArrayList<Integer>();
	
		float elevation = (float) (Math.toRadians(90 - (crossAngularSpanInDeg / 2.0f)));
		float delta = (float) (ELEVATION_DISPLAY_RADIUS * Math.cos(elevation));						
		float z = (float) (ELEVATION_DISPLAY_RADIUS * Math.sin(elevation));
						
		Vector3f p0 = new Vector3f(delta, 0, z);
		Vector3f p1 = new Vector3f(-delta, 0, z);
		verticesList.add(p0);
		verticesList.add(p1);
		indexesList.add(verticesList.indexOf(p0));
		indexesList.add(verticesList.indexOf(p1));	

				
		Vector3f p2 = new Vector3f(0, delta, z);
		Vector3f p3 = new Vector3f(0, -delta, z);
					
		verticesList.add(p2);
		verticesList.add(p3);	
		indexesList.add(verticesList.indexOf(p2));
		indexesList.add(verticesList.indexOf(p3));	

					
		Mesh mesh = new Mesh();
		mesh.setMode(Mesh.Mode.Lines);		
		mesh.setBuffer( com.jme3.scene.VertexBuffer.Type.Position, 3, BufferUtils.createFloatBuffer(JME3Utilities.convertToFloatArray(verticesList)));
		mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Index, 2, BufferUtils.createIntBuffer(JME3Utilities.convertToIntArray(indexesList)));								
		mesh.updateBound();
		mesh.updateCounts();
		
		Geometry zenithCrossGeometry = new Geometry("Zenith Cross", mesh);
		
		Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", DEFAULT_AZIMUTH_LINES_COLOR.clone());
        zenithCrossGeometry.setMaterial(mat);
        zenithCrossGeometry.setShadowMode(ShadowMode.Off);
		
        node.attachChild(zenithCrossGeometry);
		
		return node;
	}
	
	private String getAzimuthLabelText(double angle)
	{
		String label = getLabelMap().get(new Double(angle));
		if(label == null) 
		{			
			label = new String(decimalFormat.format(angle) + DEGREE_STRING);								
		}
		return label;		
	}
	
	private String getElevationLabelText(double angle)
	{
		return new String(decimalFormat.format(angle) + DEGREE_STRING);	
	}
	
	private Map<Double, String> getLabelMap()
	{
		if(labelMap == null)
		{
			labelMap = new HashMap<Double, String>();
			labelMap.put(new Double(0), "N");
			labelMap.put(new Double(360), "N");			
			labelMap.put(new Double(45), "NE");	
			labelMap.put(new Double(90), "E");	
			labelMap.put(new Double(135), "SE");
			labelMap.put(new Double(180), "S");
			labelMap.put(new Double(225), "SW");
			labelMap.put(new Double(270), "W");
			labelMap.put(new Double(315), "NW");
		}
		
		return labelMap;
	}
	
	private Node createLabel(String text, double x, double y, double z, double azimuthAngle, double elevationAngle, int fontSize)
	{
		Node root = new Node();
		
		float textWidth = text.length() * fontSize * 0.45f;
		
		// Adds the text.
		BitmapFont bitmapFont = assetManager.loadFont("Interface/Fonts/Default.fnt");		
		
		BitmapText bitmapText = bitmapFont.createLabel(text);
		bitmapText.setSize(fontSize);		
		bitmapText.setText(text); // crosshairs		
		bitmapText.setColor(DEFAULT_AZIMUTH_LINES_COLOR.clone());		
		bitmapText.setBox(new Rectangle(-textWidth / 2.0f, 0, textWidth, 100));
		bitmapText.setQueueBucket(RenderQueue.Bucket.Transparent);
		
		// TODO : Make text background transparent.
		//bitmapText.setMaterial(arg0);		
		
		// Translate the text to the required position
		Transform3D translation = new Transform3D();
		translation.setTranslation(new Vector3d(x, y, z));
				
		// Rotates the text to make it vertical.
		Transform3D t1 = new Transform3D();
		t1.rotX(Math.toRadians(90));
		
		// Rotate the text in azimuth.
		Transform3D t2 = new Transform3D();
		t2.rotY(azimuthAngle - Math.toRadians(90));
	
		// Rotate the text in elevation.
		Transform3D t3 = new Transform3D();
		t3.rotX(elevationAngle);
		
		// Stacks the transforms
		Transform3D t = new Transform3D();
		t.mul(translation, t1);
		t.mul(t2);
		t.mul(t3);
		
		Matrix4d transformMatrix = new Matrix4d();
		t.get(transformMatrix);
		root.setLocalTransform(JME3Utilities.createTransform(transformMatrix));				
		
		root.attachChild(bitmapText);
		
		return root;
	}
	
	private Adapter getAdapter()
	{
		if(adapter == null)
		{
			adapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof EarthSurfaceWorksiteNode)
					{
						// Worksite has changed.
						if(msg.getFeatureID(EarthSurfaceWorksiteNode.class) == ApogyEarthSurfaceEnvironmentPackage.EARTH_SURFACE_WORKSITE_NODE__WORKSITE)
						{
							// Unregister from old Worksite.
							if(msg.getOldValue() instanceof Worksite)
							{
								Worksite oldWorksite = (Worksite) msg.getOldValue();
								oldWorksite.eAdapters().remove(getAdapter());
							}
																					
							if(msg.getNewValue() instanceof Worksite)
							{
								Worksite newWorksite = (Worksite) msg.getNewValue();
								newWorksite.eAdapters().add(getAdapter());
								
								if(newWorksite instanceof EarthSurfaceWorksite)
								{
									EarthSurfaceWorksite earthSurfaceWorksite = (EarthSurfaceWorksite) newWorksite;
									updateSkyTransform(earthSurfaceWorksite.getXAxisAzimuth());
								}
							}							
						}												
					}
					else if(msg.getNotifier() instanceof EarthSurfaceWorksite)
					{
						if(msg.getFeatureID(EarthSurfaceWorksite.class) == ApogyEarthSurfaceEnvironmentPackage.EARTH_SURFACE_WORKSITE__XAXIS_AZIMUTH)
						{
							double newXAxisAzimuthDegrees = msg.getNewDoubleValue();
							updateSkyTransform(newXAxisAzimuthDegrees);
						}
					}
				}
			};
		}
		
		return adapter;
	}
}
