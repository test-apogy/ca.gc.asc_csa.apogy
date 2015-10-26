package org.eclipse.symphony.core.invocator.tests;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator 
{
	public final static String ID = "org.eclipse.symphony.core.invocator.tests";
	private static BundleContext context;
	
	static BundleContext getContext() {
		return context;
	}
	

	public void start(BundleContext context) throws Exception {
		Activator.context = context;
	}


	public void stop(BundleContext context) throws Exception {
		Activator.context = null;
	}	
}