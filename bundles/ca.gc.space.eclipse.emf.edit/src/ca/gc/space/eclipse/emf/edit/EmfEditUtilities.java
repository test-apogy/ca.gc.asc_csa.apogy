package ca.gc.space.eclipse.emf.edit;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class EmfEditUtilities extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "ca.gc.space.eclipse.emf.edit";

	// The shared instance
	private static EmfEditUtilities plugin;

	/**
	 * The constructor
	 */
	public EmfEditUtilities() {
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static EmfEditUtilities getDefault() {
		return plugin;
	}
	
	/**
	 * Creates and returns a {@link #composedAdapterFactory}.  The factory is in this activator to provide
	 * editing domain capability.
	 * @return Reference to the factory.
	 */
	public ComposedAdapterFactory getComposedAdapterFactory() {
		return new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	}	
	
    /**
     * Returns the string representation of the object.
     * @param object Object reference.
     * @return String
     */
    public static String getText(Object object){
		ComposedAdapterFactory factory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
    	IItemLabelProvider provider = (IItemLabelProvider) factory.adapt(object, IItemLabelProvider.class);
    	factory.dispose();
    	return provider == null ? object.toString() : provider.getText(object);
    }    
}