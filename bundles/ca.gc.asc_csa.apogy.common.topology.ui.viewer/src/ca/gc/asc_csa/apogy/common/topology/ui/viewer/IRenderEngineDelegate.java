package ca.gc.asc_csa.apogy.common.topology.ui.viewer;
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

import java.awt.image.BufferedImage;
import java.util.List;

import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet;

public interface IRenderEngineDelegate 
{						
	/**
	 * Create the parentComposite into which the rendering will be done and attach it to the specified parent.
	 * @param topologyViewer The ITopologyViewer associated with this IRenderEngineDelegate.
	 * @param parent The parent parentComposite.
	 * @return The parentComposite created.
	 */
	public Composite createRenderComposite(ITopologyViewer topologyViewer, Composite parent);
		
	/**
	 * Adds a NodePresentation. This should have the effect of adding the associated SceneObject in the displayed scene.
	 * @param nodePresentation The NodePresentation to add.	
	 */
	public void add(NodePresentation nodePresentation);

	/**
	 * Adds a list of NodePresentation. This should have the effect of adding the associated SceneObjects in the displayed scene.
	 * @param nodePresentationList The List of NodePresentation to add.	
	 */
	public void add(List<NodePresentation> nodePresentationList);
	
	/**
	 * Removes a NodePresentation. This should have the effect of removing the associated SceneObject from the displayed scene.
	 * @param nodePresentation The NodePresentation to remove.	
	 */
	public void remove(NodePresentation nodePresentation);
	
	/**
	 * Removes a list of NodePresentation. This should have the effect of removing the associated SceneObjects from the displayed scene.
	 * @param nodePresentationList The List of NodePresentation to remove.	
	 */
	public void remove(List<NodePresentation> nodePresentationList);
		
	/**
	 * Enables or disables verbose mode of the viewer.
	 * @param enable True enables verbose, false disabled it.
	 */
	public void setVerbose(boolean verbose);
	
	/**
	 * Sets the maximum frame rate to be used by the viewer.
	 * @param maximumFrameRate The maximum frame rate, in frames per second.
	 */
	public void setMaximumFrameRate(int maximumFrameRate);
	
	/**
	 * Sets whether or not ambient lighting is enabled.
	 * @param enable True to enable ambient lighting, false to disable ambient lighting.
	 */ 
	public void setAmbientLightEnabled(boolean enable);
	
	/**
	 * Sets the color of the ambient light.
	 * @param red
	 * @param green
	 * @param blue
	 */
	public void setAmbientLightColor(int red, int green, int blue);
	
	/**
	 * Sets whether or not anti-aliasing should be used for rendering.
	 * @param True to enable anti-aliasing, false to disable anti-aliasing.
	 */
	public void setAntiAliasing(boolean enable);	
	
	/**
	 * Set whether or not the viewer statistics should be displayed.
	 * @param enable True enables showing statistics, false disabled it.
	 */
	public void setShowStatisticsEnabled(boolean enable);

	/**
	 * Cause the viewer to change the viewing location and orientation to display the entire scene.
	 */
	public void zoomToFit(TopologyPresentationSet topologyPresentationSet);
	
	/**
	 * Cause the viewpoint orientation to be updated such that the view has the +Z in the up direction.
	 */
	public void levelViewPoint();
	
	/**
	 * Set the high speed enabled.
	 * @param highSpeedEnabled True enables highSpeed motion, false disables it.
	 */
	public void setHighSpeedMotionEnabled(boolean highSpeedMotionEnabled);
	
	/**
	 * Set the picking mode enabled.
	 * @param pickingModeEnabled True enables picking, false disables it.
	 */
	public void setPickingModeEnabled(boolean pickingModeEnabled);
	
	/**
	 * Takes an image snapshot of the topology viewer.
	 * @return The image snapshot.
	 */
	public BufferedImage takeScreenshot();
	
	/**
	 * Return the Node associated with an object of the scene graph.
	 * @param sceneGraphObject The object from the scene graph.
	 * @return The associated Node, null if none is found.
	 */
	public Node getTopologyNode(Object sceneGraphObject);
	
	/**
	 * Dispose of this IRenderEngineDelegate. This method is called by the TopologyViewer when it is itself disposed of.
	 */
	public void dispose();
}
