package ca.gc.asc_csa.apogy.common.topology.ui.jme3.internal;
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

import com.jme3.math.Quaternion;
import com.jme3.math.Vector3f;
import com.jme3.scene.control.Control;

public interface ICameraControl extends Control 
{
	/**
     * Enables or disables the ICameraControl
     * @param enabled true to enable, false to disable.
     */
	public void setEnabled(boolean enabled); 
    
    /**
     * Return the enabled/disabled state of the ICameraControl.
     * @return true if the ICameraControl is enabled, false otherwise.
     */
	public boolean isEnabled();
	
	public Vector3f getCurrentLocation();
	
	public void setCurrentLocation(Vector3f newLocation);
	
	public Quaternion getCurrentOrientation();
	
	public void setCurrentOrientation(Quaternion newRotation);
	
	public void levelPose();
	
	public void setHighSpeedMotionEnabled(boolean highSpeedMotionEnabled);
	
	public void dispose();
}
