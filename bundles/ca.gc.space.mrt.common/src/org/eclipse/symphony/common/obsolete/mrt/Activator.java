package org.eclipse.symphony.common.obsolete.mrt;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class Activator extends Plugin {

	// The shared instance
	private static Activator plugin;

	public static final String ID = "org.eclipse.symphony.common.obsolete.mrt";

	public Activator() {
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
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
