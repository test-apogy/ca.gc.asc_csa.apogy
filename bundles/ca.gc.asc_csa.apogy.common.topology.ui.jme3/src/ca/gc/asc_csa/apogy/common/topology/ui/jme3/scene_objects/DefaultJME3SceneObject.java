package ca.gc.asc_csa.apogy.common.topology.ui.jme3.scene_objects;
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
import javax.vecmath.Tuple3d;

import org.eclipse.swt.graphics.RGB;

import com.jme3.app.Application;
import com.jme3.asset.plugins.FileLocator;
import com.jme3.bounding.BoundingBox;
import com.jme3.bounding.BoundingSphere;
import com.jme3.bounding.BoundingVolume;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;

import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.ShadowMode;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.Activator;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Application;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3SceneObject;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Utilities;

public abstract class DefaultJME3SceneObject<T extends Node> implements JME3SceneObject 
{
	private T topologyNode;
	private com.jme3.scene.Node root;
	private com.jme3.scene.Node attachmentNode;
	
	protected boolean busy = false;
		
	protected ShadowMode shadowMode = ShadowMode.INHERIT;	
	protected JME3RenderEngineDelegate jme3RenderEngineDelegate;
	protected JME3Application jme3Application = null;
	
	public DefaultJME3SceneObject(T topologyNode, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		try
		{
			if (topologyNode == null || jme3RenderEngineDelegate == null) 
			{
				throw new IllegalArgumentException();
			}
	
			this.jme3Application = jme3RenderEngineDelegate.getJME3Application();
			this.topologyNode = topologyNode;				
			this.jme3Application.getAssetManager().registerLocator("/", FileLocator.class);
			this.jme3RenderEngineDelegate = jme3RenderEngineDelegate;
			
			setVisible(true);
		}
		catch(Throwable t)
		{
			System.out.println("this.jme3Application : " + this.jme3Application);
			System.out.println("this.jme3Application.getAssetManager() : " + this.jme3Application.getAssetManager());
			t.printStackTrace();
		}
	}

	@Override
	public T getTopologyNode() {
		return topologyNode;
	}

	@Override
	public boolean isVisible() 
	{
		return getRoot().hasChild(getAttachmentNode());
	}

	@Override
	public void setVisible(boolean visible) 
	{
		// Call this on viewer thread.
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{
				if (!visible && isVisible()) 
				{
					getRoot().detachChild(getAttachmentNode());
				} 
				else if (visible && !isVisible()) 
				{
					getRoot().attachChild(getAttachmentNode());
				}
				
				return null;
			}
		});		
	}

	@Override
	public void setShadowMode(ShadowMode shadowMode) 
	{			
		Logger.INSTANCE.log(Activator.ID, this, "Setting Shadow Mode to <" + shadowMode + ">...", EventSeverity.INFO);
		this.shadowMode = shadowMode;
		
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{
				if(getRoot() != null)
				{
					getRoot().setShadowMode(JME3Utilities.convertToJMEShadowMode(shadowMode));
				}
				return null;
			}
		});
	}
	
	@Override
	public ShadowMode getShadowMode() 
	{	
		return shadowMode;
	}
	
	@Override
	public Tuple3d getMin() {
		Tuple3d min = null;
		BoundingVolume bounds = getBounds();

		if (bounds instanceof BoundingSphere) {
			BoundingSphere boundingSphere = (BoundingSphere) bounds;
			Vector3f center = boundingSphere.getCenter();

			double[] minValues = new double[3];
			for (int i = 0; i < minValues.length; i++) {
				minValues[i] = center.get(i) - boundingSphere.getRadius();
			}

			min = new Point3d(minValues);
		} else if (bounds instanceof BoundingBox) {
			BoundingBox boundingBox = (BoundingBox) bounds;
			Vector3f vMin = new Vector3f();

			boundingBox.getMin(vMin);
			min = new Point3d(vMin.x, vMin.y, vMin.z);
		}

		return min;
	}

	@Override
	public Tuple3d getMax() {
		Tuple3d max = null;
		BoundingVolume bounds = getBounds();

		if (bounds instanceof BoundingSphere) {
			BoundingSphere boundingSphere = (BoundingSphere) bounds;
			Vector3f center = boundingSphere.getCenter();

			double[] minValues = new double[3];
			for (int i = 0; i < minValues.length; i++) {
				minValues[i] = center.get(i) + boundingSphere.getRadius();
			}

			max = new Point3d(minValues);
		} else if (bounds instanceof BoundingBox) {
			BoundingBox boundingBox = (BoundingBox) bounds;
			Vector3f vMax = new Vector3f();

			boundingBox.getMax(vMax);
			max = new Point3d(vMax.x, vMax.y, vMax.z);
		}

		return max;
	}

	@Override
	public Point3d getCentroid() {
		Vector3f center = getBounds().getCenter();
		return new Point3d(center.x, center.y, center.z);
	}

	@Override
	public com.jme3.scene.Node getRoot() 
	{
		if (root == null) 
		{
			String name = null;			
			if(getTopologyNode() != null && getTopologyNode().getNodeId() != null)
			{
				name = getTopologyNode().getNodeId();
			}
			else
			{
				name = getClass().getSimpleName();
			}			
			name += "_root";
			root = new com.jme3.scene.Node(name);
		}
		return root;
	}

	@Override
	public com.jme3.scene.Node getAttachmentNode() {
		if (attachmentNode == null) 
		{
			String name = null;
			if(getTopologyNode()!=null && getTopologyNode().getNodeId() != null)
			{
				name = getTopologyNode().getNodeId();
			}
			else
			{
				name = getClass().getSimpleName();
			}		
			name += "_attachement";
			
			attachmentNode = new com.jme3.scene.Node(name);					
		}
		return attachmentNode;
	}

	@Override
	public List<Geometry> getGeometries() {
		return new ArrayList<Geometry>();
	}

	@Override
	public BoundingVolume getBounds() {

		BoundingVolume bounds = null;

		for (Geometry geometry : getGeometries()) 
		{
			if(geometry != null)
			{
				if (bounds == null) 
				{
					bounds = geometry.getModelBound();
				} 
				else 
				{
					if(geometry.getModelBound() != null)
					{
						bounds.merge(geometry.getModelBound());
					}
				}
			}
		}

		return bounds;
	}

	@Override
	public Application getApplication() 
	{
		return jme3Application;
	}
	
	@Override
	public void dispose() 
	{		
		Logger.INSTANCE.log(Activator.ID, this, "Being disposed of.", EventSeverity.INFO);				
		if(root != null)
		{
			if(root.getParent() != null)
			{
				root.getParent().detachChild(root);
			}
			else
			{
				root.detachAllChildren();
			}			
		}
		// if(attachmentNode != null) attachmentNode.detachAllChildren();
		
		topologyNode = null;
		root = null;
		attachmentNode = null;
	}
	
	@Override
	public RGB getColor() {
		return null;
	}

	@Override
	public void setColor(RGB rgb) {
	}

	@Override
	public void objectSelected() {
	}

	@Override
	public void setTransparency(float transparency) {
	}
}
