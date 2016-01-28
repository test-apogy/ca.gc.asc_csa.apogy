package ca.gc.asc_csa.apogy.addons.actuators;

import org.eclipse.core.runtime.Plugin;

public class Activator extends Plugin
{
	// The plug-in ID
	public static final String ID = "ca.gc.asc_csa.apogy.addons.actuators";
	
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
}
