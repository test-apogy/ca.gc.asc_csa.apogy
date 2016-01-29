package ca.gc.asc_csa.apogy.core.environment.orbit;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator 
{
	// The shared instance
	private static Activator plugin;
	
	private static BundleContext context;
	
	public static BundleContext getContext() {
		return context;
	}

	public Activator() {
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
	
	@Override
	public void start(BundleContext context) throws Exception 
	{		
		Activator.context = context;
	}

	@Override
	public void stop(BundleContext context) throws Exception 
	{		
		Activator.context = null;
	}
}