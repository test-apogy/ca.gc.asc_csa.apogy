package org.eclipse.symphony.addons.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin implements BundleActivator 
{
	public static final String ID = "org.eclipse.symphony.addons.ui";
	
	// The shared instance
	private static Activator plugin;	
	
	private static BundleContext context;
	
	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
	
	public static BundleContext getContext() {
		return context;
	}
	
	public Activator()
	{
		plugin = this;
	}
	
	@Override
	public void start(BundleContext context) throws Exception 
	{		
		Activator.context = context;
	}

	@Override
	public void stop(BundleContext context) throws Exception {		
		Activator.context = null;
	}
}