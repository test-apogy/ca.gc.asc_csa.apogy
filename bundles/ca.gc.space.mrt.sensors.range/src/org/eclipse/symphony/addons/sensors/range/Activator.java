package org.eclipse.symphony.addons.sensors.range;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	public static final String ID = "org.eclipse.symphony.addons.sensors.range";
	
	private static BundleContext context;

	public static BundleContext getContext() {
		return context;
	}
	
	public void start(BundleContext _context) throws Exception {
		context = _context;
	}

	public void stop(BundleContext context) throws Exception {
	}
}