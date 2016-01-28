package ca.gc.asc_csa.apogy.addons.sensors.fov.ui.jme3.utils;

import org.eclipse.swt.graphics.RGB;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Application;

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
