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

import org.eclipse.jface.viewers.IInputSelectionProvider;

public interface ITopologyViewer extends IInputSelectionProvider 
{	
	/**
	 * Returns whether or not the viewer is currently busy.
	 * @return True if the viewer is busy, false otherwise.
	 */
	public boolean isBusy();
	
	/**
	 * Sets the input of the viewer. This should cause the viewer to update it graphics output to show the scene in 3D.
	 * @param input The input.
	 */
	public void setInput(Object input);
	
	/**
	 * Enables or disables verbose mode of the viewer.
	 * @param enable True enables verbose, false disabled it.
	 */
	public void setVerbose(boolean verbose);

	/**
	 * Returns whether or not the viewer verbose mode is enabled.
	 * @return True if the viewer verbose mode is enabled, false otherwise.
	 */
	public boolean isVerbose();
	
	/**
	 * Cause the viewer to change the viewing location to display the entire scene.
	 */
	public void zoomToFit();
	
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
	 * Returns whether or not the high speed enabled.
	 * @return highSpeedEnabled True if high speed is enabled, false otherwise.
	 */
	public boolean isHighSpeedMotionEnabled();
	
	/**
	 * Set the picking mode enabled.
	 * @param pickingModeEnabled True enables picking, false disables it.
	 */
	public void setPickingModeEnabled(boolean pickingModeEnabled);
	
	/**
	 * Returns whether or not Picking is enabled.
	 * @return True if picking is enabled, false otherwise.
	 */
	public boolean isPickingModeEnabled();
	
	/**
	 * Set whether or not the viewer statistics should be displayed.
	 * @param enable True enables showing statistics, false disabled it.
	 */
	public void setShowStatisticsEnabled(boolean enable);

	/**
	 * Returns whether or not the viewer statistics are displayed.
	 * @return True if statistics are displayed, false otherwise.
	 */
	public boolean isShowStatisticsEnabled();
	
	/**
	 * Takes an image snapshot of the topology viewer.
	 * @return The image snapshot.
	 */
	public BufferedImage takeScreenshot();

	/**
	 * Sets whether or not anti-aliasing should be used for rendering.
	 * @param True to enable anti-aliasing, false to disable anti-aliasing.
	 */
	public void setAntiAliasing(boolean enable);

	/**
	 * Return whether or not anti-aliasing is used for rendering.
	 * @return True if anti-aliasing is used, false otherwise.
	 */
	public boolean isAntiAliasingEnabled();
	
	/**
	 * Sets the maximum frame rate to be used by the viewer.
	 * @param maximumFrameRate The maximum frame rate, in frames per second.
	 */
	public void setMaximumFrameRate(int maximumFrameRate);
	
	/**
	 * Gets the maximum frame rate to be used by the viewer.
	 * @return The maximum frame rate, in frames per second.
	 */
	public int getMaximumFrameRate();
	
	/**
	 * Adds a ITopologyViewerListener to the viewer.
	 * @param topologyViewerListener The listener to add.
	 */
	public void addITopologyViewerListener(ITopologyViewerListener topologyViewerListener);
	
	/**
	 * Removes a ITopologyViewerListener from the viewer.
	 * @param topologyViewerListener The listener to remove.
	 */
	public void removeITopologyViewerListener(ITopologyViewerListener topologyViewerListener);
	
	/**
	 * Dispose of this ITopologyViewer.
	 */
	public void dispose();
}