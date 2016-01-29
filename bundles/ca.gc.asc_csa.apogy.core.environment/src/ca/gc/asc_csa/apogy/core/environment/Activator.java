package ca.gc.asc_csa.apogy.core.environment;

import java.net.URL;

import ca.gc.asc_csa.apogy.common.EclipseUtils;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	public static String ID = "ca.gc.asc_csa.apogy.core.environment";
	
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
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}
		
	/**
	 * Returns the absolute path where the stars catalog files are located.
	 * @return The absolute path where the stars catalog files resides.
	 */
	public URL getStarsCatalogURL(String starFileName)
	{
		URL url;
		try 
		{
			String urlString = "platform:plugin/"+ ID+ "/data/stars/" + starFileName;		
			url = EclipseUtils.resolveURL(getContext().getBundle(), urlString);			
			return url;
		} 
		catch (Exception e) 
		{			
			Logger.INSTANCE.log(ID, this, "Failed to locate Stars Catalog <" + starFileName + ">!", EventSeverity.ERROR);
			e.printStackTrace();
		}		
		return null;
	}
}