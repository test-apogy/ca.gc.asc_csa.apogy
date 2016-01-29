package ca.gc.asc_csa.apogy.core.topology.ui;

import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.graphics.RGB;
import ca.gc.asc_csa.apogy.core.topology.ui.preferences.ApogyTopologyUIPreferencesConstants;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;



/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin 
{		
	// The plug-in ID
	public static final String ID = "ca.gc.asc_csa.apogy.core.topology.ui"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	private static BundleContext context;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		Activator.context = context;
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		Activator.context = null;
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
	
	static BundleContext getContext() {
		return context;
	}
	
	public static RGB getApogySystem3DViewBackgroundColor()
	{
		return PreferenceConverter.getColor(getDefault().getPreferenceStore(), ApogyTopologyUIPreferencesConstants.DEFAULT_APOGY_SYSTEM_VIEW_BACKGROUND_COLOR_ID);		
	}
}