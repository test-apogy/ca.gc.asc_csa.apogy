package ca.gc.asc_csa.apogy.common.geometry.data3d.ui.jme3.scene_objects;
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
import java.util.concurrent.Callable;

import javax.vecmath.Point3d;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.graphics.RGB;

import com.jme3.asset.AssetManager;
import com.jme3.material.Material;
import com.jme3.material.RenderState.FaceCullMode;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.scene.Mesh.Mode;
import com.jme3.util.BufferUtils;

import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ColoredCartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ColoredCartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.jme3.Activator;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.preferences.MRTData3DUIPreferencesConstants;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.scene_objects.ColoredCartesianCoordinatesSetSceneObject;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.topology.ContentNode;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Utilities;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.scene_objects.DefaultJME3SceneObject;

public class ColoredCartesianCoordinateSetJME3SceneObject<T extends ColoredCartesianCoordinatesSet> extends DefaultJME3SceneObject<ContentNode<T>> implements
ColoredCartesianCoordinatesSetSceneObject 
		{
		
	private boolean overrideColor = false;
	
	private ColorRGBA pointsColor = getDefaultPointColor();
	private RGB rgb = getDefaultRGBPointColor();
	
	private int pointSize = 1;
	
	private ColoredCartesianCoordinatesSet points;
	private Point3d centroid = null;

	private AssetManager assetManager;
	private Geometry meshGeometry = null;
	private com.jme3.scene.Mesh jme3mMesh = null;
	
	private Adapter modelListener;


	public ColoredCartesianCoordinateSetJME3SceneObject(ContentNode<T> node, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(node, jme3RenderEngineDelegate);
		
		if (node == null || jme3RenderEngineDelegate == null) 
		{
			throw new IllegalArgumentException();
		}
		
		this.assetManager = jme3Application.getAssetManager();
		this.points = node.getContent();
		
		
		Job job = new Job("CartesianCoordinatesSetJME3Object : Creating geometry")
		{
			@Override
			protected IStatus run(IProgressMonitor monitor) 
			{
				jme3Application.enqueue(new Callable<Object>() 
				{
					@Override
					public Object call() throws Exception 
					{		
						updateGeometryInternal(points);
						points.eAdapters().add(getPointsListener());

						return null;
					}
				});		
												
				return Status.OK_STATUS;
			}
		};
		job.schedule();				
	}

	@Override
	public Point3d getCentroid() 
	{
		if (centroid == null) 
		{
			centroid = new Point3d(0.0, 0.0, 0.0);

			if (points.getPoints().size() > 0) 
			{
				for (CartesianPositionCoordinates point : points.getPoints()) 
				{
					centroid.x += point.getX();
					centroid.y += point.getY();
					centroid.z += point.getZ();
				}

				centroid.scale(1.0 / (double) points.getPoints().size());
			}
		}
		return centroid;
	}

	public void setPointSize(int pointSize) 
	{
		Logger.INSTANCE.log(Activator.ID, this, "Setting point size to <" + pointSize + ">...", EventSeverity.INFO);
		this.pointSize = pointSize;
		if(jme3mMesh != null)
		{
			jme3Application.enqueue(new Callable<Object>() 
			{
				@Override
				public Object call() throws Exception 
				{	
					if(jme3mMesh != null)
					{
						jme3mMesh.setPointSize(pointSize);
					}
					
					return null;
				}
			});			
		}
	}
	
	public int getPointSize() 
	{
		return pointSize;
	}
			
	@Override
	public void setColor(RGB rgb) 
	{		
		Logger.INSTANCE.log(Activator.ID, this, "Setting color to <" + rgb + ">...", EventSeverity.INFO);
		this.rgb = rgb;
		pointsColor = JME3Utilities.convertToColorRGBA(rgb);
		
		// Change the material in the Renderer thread.
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{		
				if(points != null)
				{
					updateGeometryInternal(points);
				}
				return null;
			}
		});				
	}
	
	@Override
	public RGB getColor() 
	{
		return rgb;
	}
	

	@Override
	public void setOverrideColor(boolean overrideColor) 
	{		
		Logger.INSTANCE.log(Activator.ID, this, "Setting Override Color flag to " + overrideColor, EventSeverity.INFO);
		this.overrideColor = overrideColor;
		
		// Update geometry in renderer thread.
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{		
				if(points != null)
				{
					updateGeometryInternal(points);
				}
				return null;
			}
		});			
	}
	
	@Override
	public void dispose() 
	{
		// Unregister listener from points.
		if(points != null)
		{
			points.eAdapters().remove(getPointsListener());
		}
		
		super.dispose();
	}
	
	@Override
	public List<Geometry> getGeometries() 
	{		
		List<Geometry> geometries = new ArrayList<Geometry>();
		geometries.add(meshGeometry);
		return geometries;
	}
	
	private void updateGeometry(final ColoredCartesianCoordinatesSet points)
	{
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{	
				updateGeometryInternal(points);
				return null;
			}
		});
	}
	private void updateGeometryInternal(ColoredCartesianCoordinatesSet points)
	{			
		try
		{
			// Busy starts.
			busy = true;
	
			// First, create a local list to avoid concurrent modifications.
			List<CartesianPositionCoordinates> pointsInternal = new ArrayList<CartesianPositionCoordinates>();
			pointsInternal.addAll(points.getPoints());
	
			
			if(meshGeometry != null)
			{
				getAttachmentNode().detachChild(meshGeometry);
			}				
			
			List<Vector3f> verticesList = new ArrayList<Vector3f>();
			List<Integer> indexesList = new ArrayList<Integer>();
			List<ColorRGBA> pointColorList = new ArrayList<ColorRGBA>();
			
			int index = 0;
			for(CartesianPositionCoordinates point : pointsInternal)
			{
				verticesList.add(new Vector3f((float) point.getX(), (float) point.getY(), (float) point.getZ()));
				indexesList.add(new Integer(index));
				
				ColorRGBA pointColor = null;	
				
				if(overrideColor)
				{
					pointColor = new ColorRGBA(pointsColor);	
				}
				else
				{
					if(point instanceof ColoredCartesianPositionCoordinates)
					{
						ColoredCartesianPositionCoordinates coloredPoint = (ColoredCartesianPositionCoordinates) point;
						float r = ((float)coloredPoint.getRed()) / 255.0f;
						float g = ((float)coloredPoint.getGreen()) / 255.0f;
						float b = ((float)coloredPoint.getBlue()) / 255.0f;
							
						pointColor = new ColorRGBA(r,g,b,1.0f);
					}
					else
					{
						pointColor = new ColorRGBA(pointsColor);					
					}
				}
				pointColorList.add(pointColor);
							
				index++;
			}
										
			jme3mMesh = new Mesh();
			jme3mMesh.setMode(Mode.Points);
			jme3mMesh.setPointSize(getPointSize());		
			jme3mMesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Position, 3, BufferUtils.createFloatBuffer(JME3Utilities.convertToFloatArray(verticesList)));
			jme3mMesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Index, 1, BufferUtils.createIntBuffer(JME3Utilities.convertToIntArray(indexesList)));
			jme3mMesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Color, 4, BufferUtils.createFloatBuffer(JME3Utilities.convertRGBAListToFloatArray(pointColorList)));
					
			jme3mMesh.updateBound();
			jme3mMesh.updateCounts();
			
			
			if(getTopologyNode().getNodeId() != null)
			{
				meshGeometry = new Geometry(getTopologyNode().getNodeId(), jme3mMesh);
			}
			else
			{
				meshGeometry = new Geometry("CartesianCoordinatesSet", jme3mMesh);
			}
			meshGeometry.setMaterial(createMaterial());				
			
			getAttachmentNode().attachChild(meshGeometry);
				
			// Not busy anymore.
			busy = false;
		}
		catch(Throwable t)
		{
			busy = false;
		}
	}
	
	private static RGB getDefaultRGBPointColor()
	{				
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		RGB rgb = PreferenceConverter.getColor(store, MRTData3DUIPreferencesConstants.DEFAULT_CARTESIAN_COORD_SET_COLOR_ID);
				
		return rgb;
	}
	
	private static ColorRGBA getDefaultPointColor()
	{		
		RGB rgb = getDefaultRGBPointColor();
		if(rgb != null)
		{			
			return JME3Utilities.convertToColorRGBA(rgb).clone();
		}
		else
		{
			return ColorRGBA.White.clone();
		}
	}
	
	private Material createMaterial()
	{
		Material mat = new Material(assetManager,  "Common/MatDefs/Misc/Unshaded.j3md");
		mat.getAdditionalRenderState().setFaceCullMode(FaceCullMode.Off);  				
		mat.setBoolean("VertexColor", true);
		
		return mat;
	}
	
	/**
	 * Returns the listener used to monitor the associated CartesianCoordinatesSet to respond to changes.
	 * @return The Adapter.
	 */
	private Adapter getPointsListener() 
	{
		if (modelListener == null) 
		{
			modelListener = new AdapterImpl() 
			{
				@Override
				public void notifyChanged(Notification notification) 
				{
					int featureId = notification.getFeatureID(ColoredCartesianCoordinatesSet.class);

					switch (featureId) 
					{
						case ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_COORDINATES_SET__POINTS:
							int eventType = notification.getEventType() ;
							switch(eventType)
							{
								case Notification.ADD:
								case Notification.ADD_MANY:
								case Notification.REMOVE:
								case Notification.REMOVE_MANY:
									if(!busy)
									{
										busy = true;
										Job job = new Job("CartesianCoordinatesSetJME3Object : Updating geometry")
										{
											@Override
											protected IStatus run(IProgressMonitor monitor) 
											{
												updateGeometry(points);												
												return Status.OK_STATUS;
											}
										};
										job.schedule();
									}
								break;
								default:
								break;								
							}
						default:
						break;
					}
				}
			};
		}
		return modelListener;
	}

}
