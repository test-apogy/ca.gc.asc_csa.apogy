package ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.jme3;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin 
{
	// The plug-in ID
	public static final String ID = "ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.jme3"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	private static BundleContext bundleContext;	
	
	public static BundleContext getContext() {
		return bundleContext;
	}
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		bundleContext = context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		bundleContext = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
}
