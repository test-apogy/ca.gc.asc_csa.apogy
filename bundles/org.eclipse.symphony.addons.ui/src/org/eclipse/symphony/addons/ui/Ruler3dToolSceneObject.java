package org.eclipse.symphony.addons.ui;

import javax.vecmath.Color3f;

import org.eclipse.symphony.common.topology.ui.SceneObject;

public interface Ruler3dToolSceneObject extends SceneObject 
{
	public void setRulerColor(Color3f color);
	
	public void setMinorTicksColor(Color3f color);
		
	public void setMajorTicksColor(Color3f color);
	
	public void setMinorTickSpacing(float minorTickSpacing);

	public void setMajorTickSpacing(float majorTickSpacing);
		
	public void setMinorTickLength(float minorTickLenght);
	
	public void setMajorTickLength(float minorTickLenght);
	
	public void setExtremitiesRadius(float newRadius);	
}
