package ca.gc.asc_csa.apogy.addons.ui;

import javax.vecmath.Color3f;

import ca.gc.asc_csa.apogy.common.topology.ui.SceneObject;

public interface Ruler3dToolSceneObject extends SceneObject 
{
	public void setRulerColor(Color3f color);
	
	public void setMinorTicksColor(Color3f color);
		
	public void setMajorTicksColor(Color3f color);
	
	public void setMinorTickSpacing(float minorTickSpacing);

	public void setMajorTickSpacing(float majorTickSpacing);
		
	public void setMinorTickLength(float minorTickLength);
	
	public void setMajorTickLength(float minorTickLength);
	
	public void setExtremitiesRadius(float newRadius);	
}
