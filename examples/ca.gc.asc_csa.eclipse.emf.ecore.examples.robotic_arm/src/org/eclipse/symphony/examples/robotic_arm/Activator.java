package org.eclipse.symphony.examples.robotic_arm;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * This is the activator for the Robotic Arm
 * Sample.  It is used when performing the required
 * OSGi operations as well as when logging.
 */
public class Activator implements BundleActivator
{
	public static final String ID = "org.eclipse.symphony.examples.robotic_arm";
	
	/**
	 * This is a single activator instance which is shared
	 * by all parts of the OSGi framework.
	 */
	private static Activator plugin;
	
	/**
	 * This is the context in which the plugin (i.e. bundle)
	 * operates and contains useful information.
	 */
	private static BundleContext context;
	
	/**
	 * This is the constructor for the Activator class; concretely,
	 * an instance of this type is created for the lifetime of the
	 * loaded plugin.
	 */
	public Activator()
	{
		plugin = this;
	}
	
	/**
	 * This is used to get the shared Activator instance 
	 * @return The shared instance
	 */
	public static Activator getDefault()
	{
		return plugin;
	}
	
	/**
	 * Get the context associated with this plugin (i.e. bundle)
	 * @return This plugin's context
	 */
	public static BundleContext getContext()
	{
		return context;
	}
	
	/**
	 * This hook method is called whenever the plugin is started
	 * @param context The plugin's operating context 
	 * @throws Exception Any exception encountered while starting the plugin
	 */
	@Override
	public void start(BundleContext context) throws Exception 
	{ 
		Activator.context = context;
	}

	/**
	 * This hook method is called whenever the plugin is stopped
	 * @param context The plugin's operating context
	 * @throws Exception Any exception encountered while stopping the plugin
	 */
	@Override
	public void stop(BundleContext context) throws Exception 
	{		
		Activator.context = null;
	}
}