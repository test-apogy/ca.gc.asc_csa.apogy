package ca.gc.asc_csa.apogy.common.topology.ui.viewer;


public interface ITopologyViewerListener 
{
	public void busyChanged(boolean oldBusy, boolean newBusy);
	
	public void antiAliasingChanged(boolean oldAntiAliasing, boolean newAntiAliasing);		
}