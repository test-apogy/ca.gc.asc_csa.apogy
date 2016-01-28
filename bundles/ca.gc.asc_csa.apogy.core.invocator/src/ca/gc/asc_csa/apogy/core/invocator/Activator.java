package ca.gc.asc_csa.apogy.core.invocator;

import java.util.List;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator 
{
	public static final String ID = "ca.gc.asc_csa.apogy.core.invocator";
	
	private static SessionContributorsRegistry sessionContributorsRegistry = new SessionContributorsRegistry(false);
	private static BundleContext context;
	
	static BundleContext getContext() {
		return context;
	}
	

	public void start(BundleContext context) throws Exception {
		Activator.context = context;
		
		// DEBUG Force SessionProviders to be loaded.
		getRegisteredSessionProviders();
	}


	public void stop(BundleContext context) throws Exception {
		Activator.context = null;
	}

	/**
	 * Returns the list of registered Session Contributors.
	 * @return The list of registered Session Contributors, never null.
	 */
	public static synchronized List<SessionContributor> getRegisteredSessionProviders()
	{
		return sessionContributorsRegistry.getRegisteredSessionProviders();
	}
}
