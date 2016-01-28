package org.eclipse.symphony.addons.vehicle.ui;

import org.eclipse.symphony.common.topology.ui.SceneObject;

public interface ThrusterSceneObject extends SceneObject 
{
	public void setPlumeEnvelopeVisible(boolean visible);
	
	public void setPlumeEnvelopeLength(double length);
}
