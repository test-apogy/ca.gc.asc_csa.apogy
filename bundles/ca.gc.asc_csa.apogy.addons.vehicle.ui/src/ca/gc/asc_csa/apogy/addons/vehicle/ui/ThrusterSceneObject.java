package ca.gc.asc_csa.apogy.addons.vehicle.ui;

import ca.gc.asc_csa.apogy.common.topology.ui.SceneObject;

public interface ThrusterSceneObject extends SceneObject 
{
	public void setPlumeEnvelopeVisible(boolean visible);
	
	public void setPlumeEnvelopeLength(double length);
}
