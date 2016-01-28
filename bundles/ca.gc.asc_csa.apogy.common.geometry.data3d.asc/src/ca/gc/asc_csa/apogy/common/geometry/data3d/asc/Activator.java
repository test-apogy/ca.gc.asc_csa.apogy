package org.eclipse.symphony.common.geometry.data3d.asc;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator 
{

	public static final String ID = "org.eclipse.symphony.common.geometry.data3d.asc";
	
	// The shared instance
	private static Activator plugin;
	
	private static BundleContext context;

	/**
	 * The constructor
	 */
	public Activator() {
		plugin = this;		
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext _context) throws Exception 
	{
		context = _context;		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		context = null;		
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
}