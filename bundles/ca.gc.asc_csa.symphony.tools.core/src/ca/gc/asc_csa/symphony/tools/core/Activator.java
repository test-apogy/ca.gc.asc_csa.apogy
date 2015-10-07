package ca.gc.asc_csa.symphony.tools.core;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator
{
	//private IActiveViewerListener activeViewerListener = null;
	
	private static BundleContext context;
	
	public static final String ID = "ca.gc.asc_csa.symphony.tools.core";
	
	// The shared instance
	private static Activator plugin;	
		
	
	private static TopologyViewerListenerManager topologyViewerSelectionListenerManager = null;
	

	public Activator()
	{
		plugin = this;
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
	
	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception 
	{
		Activator.context = bundleContext;		
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception 
	{
		// org.eclipse.symphony.core.topology.ui.Activator.unregisterActiveViewerListener(getActiveViewerListener() );
		Activator.context = null;
	}
	public static void registerSimple3DTool(Simple3DTool tool)
	{
		getTopologyViewerSelectionListenerManager().registerSimple3DTool(tool);
	}
	
	public static void unregisterSimple3DTool(Simple3DTool tool)
	{
		getTopologyViewerSelectionListenerManager().unRegisterSimple3DTool(null);
	}

	public static TopologyViewerListenerManager getTopologyViewerSelectionListenerManager() 
	{
		if(topologyViewerSelectionListenerManager == null)
		{
			topologyViewerSelectionListenerManager = new TopologyViewerListenerManager(ca.gc.asc_csa.topology.ui.viewer.Activator.getTopologyViewerRegistry());			
		}
		return topologyViewerSelectionListenerManager;
	}
}