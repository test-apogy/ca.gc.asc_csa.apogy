package ca.gc.asc_csa.eclipse.emf.ecore.invocator.display;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {

	public static final String PLUGIN_ID = "ca.gc.asc_csa.eclipse.emf.ecore.invocator.display";

	private static Activator instance;
	private static BundleContext bundleContext;
		

	public static Activator getDefault()
	{
		return instance;
	}

	public static BundleContext getBundleContext() {
		return bundleContext;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		bundleContext = context;
		instance = this;		
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception 
	{
		instance = null;
		bundleContext = null;
		super.stop(context);
	}
	
	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public ImageDescriptor getImageDescriptor(String path) 
	{		
		URL url = FileLocator.find(getBundleContext().getBundle(), new Path(path), null);				
        return ImageDescriptor.createFromURL(url);
	}

}
