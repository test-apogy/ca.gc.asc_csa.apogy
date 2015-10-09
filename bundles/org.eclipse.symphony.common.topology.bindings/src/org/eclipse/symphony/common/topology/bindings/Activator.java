package org.eclipse.symphony.common.topology.bindings;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String ID = "org.eclipse.symphony.common.topology.bindings"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	private static BundleContext context;
	
	private static List<AbstractTopologyBinding> bindedBindings = null;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext _context) throws Exception 
	{		
		context = _context;
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;		
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	public static BundleContext getContext()
	{
		return context;
	}
	
	public static List<AbstractTopologyBinding> getBindedBindings() 
	{
		if(bindedBindings == null)
		{
			bindedBindings = new ArrayList<AbstractTopologyBinding>();
		}
		return bindedBindings;
	}	
}
