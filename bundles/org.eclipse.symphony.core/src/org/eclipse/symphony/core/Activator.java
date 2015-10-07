package org.eclipse.symphony.core;

import java.util.List;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	private static WorksiteContributorsRegistry worksiteContributorsRegistry = new WorksiteContributorsRegistry(false);
	
	public static String ID = "org.eclipse.symphony.core";

	// The shared instance
	private static Activator plugin;

	private static BundleContext context;

	public static BundleContext getContext() {
		return context;
	}

	public Activator() {
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}
	
	/**
	 * Returns the list of registered Worksite Contributors.
	 * @return The list of registered Worksite Contributors, never null.
	 */
	public static synchronized List<WorksiteContributor> getRegisteredWorksiteProviders()
	{
		return worksiteContributorsRegistry.getRegisteredWorksiteProviders();
	}	
}
