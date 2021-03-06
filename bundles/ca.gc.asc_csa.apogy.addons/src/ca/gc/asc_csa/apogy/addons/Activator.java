package ca.gc.asc_csa.apogy.addons;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator
{
	//private IActiveViewerListener activeViewerListener = null;
	
	private static BundleContext context;
	
	public static final String ID = "ca.gc.asc_csa.apogy.addons";
	
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
		// ca.gc.asc_csa.apogy.core.topology.ui.Activator.unregisterActiveViewerListener(getActiveViewerListener() );
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

	// FIXME Should not be in addons.
	public static TopologyViewerListenerManager getTopologyViewerSelectionListenerManager() 
	{
		if(topologyViewerSelectionListenerManager == null)
		{
			topologyViewerSelectionListenerManager = new TopologyViewerListenerManager(ca.gc.asc_csa.apogy.common.topology.ui.viewer.Activator.getTopologyViewerRegistry());			
		}
		return topologyViewerSelectionListenerManager;
	}
}