package ca.gc.asc_csa.topology.ui.jme3.internal;

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
