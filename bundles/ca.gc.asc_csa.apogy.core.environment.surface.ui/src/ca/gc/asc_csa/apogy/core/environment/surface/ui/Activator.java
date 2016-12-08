package ca.gc.asc_csa.apogy.core.environment.surface.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin implements BundleActivator 
{
	public static final String ID = "ca.gc.asc_csa.apogy.core.environment.surface.ui";

	private static BundleContext context;

	// The shared instance
	private static Activator plugin;	

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
	
	@Override
	public void start(BundleContext context) throws Exception {		
		Activator.context = context;
	}

	@Override
	public void stop(BundleContext context) throws Exception {		
		Activator.context = null;
	}

}
