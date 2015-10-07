package org.eclipse.symphony.core.topology;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	public static final String ID = "org.eclipse.symphony.core.topology";
	
	private static BundleContext context;
	
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