package org.eclipse.symphony.addons.sensors.fov.ui.jme3.utils;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.symphony.common.topology.ui.jme3.JME3Application;

public abstract class AbstractFieldOfViewImageProjectorControl <T extends Node> extends ImageProjectorControl<T> 
{	
	protected RGB projectionColor = new RGB(0, 255, 0);
	
	public AbstractFieldOfViewImageProjectorControl(JME3Application jme3Application, T node)
	{
		super(jme3Application, node);
	}
	
	public void setProjectionColor(RGB rgb)
	{
		this.projectionColor = rgb;				
		updateProjectorFOVSettings();
	}
	
	public RGB getProjectionColor()
	{
		return projectionColor;
	}
}
