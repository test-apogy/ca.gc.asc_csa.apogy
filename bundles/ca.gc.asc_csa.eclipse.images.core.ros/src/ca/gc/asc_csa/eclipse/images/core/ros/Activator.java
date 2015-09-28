package ca.gc.asc_csa.eclipse.images.core.ros;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator 
{
	public static final String ID = "ca.gc.asc_csa.eclipse.images.core.ros";
	
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