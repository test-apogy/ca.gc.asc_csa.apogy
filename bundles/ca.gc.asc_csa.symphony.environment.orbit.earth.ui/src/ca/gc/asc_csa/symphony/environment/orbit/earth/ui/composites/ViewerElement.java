package ca.gc.asc_csa.symphony.environment.orbit.earth.ui.composites;

import ca.gc.asc_csa.symphony.environment.orbit.earth.GroundStation;
import ca.gc.asc_csa.symphony.environment.orbit.earth.VisibilityPass;

public class ViewerElement 
{
	public ViewerElement(GroundStation groundStation, VisibilityPass pass)
	{
		this.groundStation = groundStation;
		this.pass = pass;
	}
	
	public GroundStation groundStation;
	public VisibilityPass pass;
}
