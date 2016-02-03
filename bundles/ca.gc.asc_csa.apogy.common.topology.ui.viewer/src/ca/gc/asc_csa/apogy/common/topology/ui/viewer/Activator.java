package ca.gc.asc_csa.apogy.common.topology.ui.viewer;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.ApogyCommonTopologyUIViewerFactory;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.TopologyViewerRegistry;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.preferences.TopologyViewerPreferencesConstants;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * This is the central singleton for the TopologyUi editor plugin. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public final class Activator extends AbstractUIPlugin implements BundleActivator, IPropertyChangeListener 
{
	public static final String ID = "ca.gc.asc_csa.apogy.common.topology.ui.viewer";

	private static BundleContext context;

	private static TopologyViewerRegistry topologyViewerRegistry = null;
	
	private boolean antialiasing = true;
	private int maximumFrameRate = 15;
	
	private double navigationLinearLowSpeedFactor = 1.0;
	private double navigationLinearHighSpeedFactor = 10.0;
	
	// The shared instance
	private static Activator plugin;

	public Activator() {
		plugin = this;
		getPreferenceStore().addPropertyChangeListener(this);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	@Override
	public void start(BundleContext context) throws Exception {
		Activator.context = context;

		// Get the values from the store
		antialiasing = getPreferenceStore().getBoolean(TopologyViewerPreferencesConstants.VIEWER_ANTI_ALIASING_ID);
		
		maximumFrameRate = getPreferenceStore().getInt(TopologyViewerPreferencesConstants.VIEWER_MAX_FRAME_RATE_ID);
		
		navigationLinearLowSpeedFactor = getPreferenceStore().getDouble(TopologyViewerPreferencesConstants.DEFAULT_LINEAR_LOW_SPEED_FACTOR_ID);
		navigationLinearHighSpeedFactor = getPreferenceStore().getDouble(TopologyViewerPreferencesConstants.DEFAULT_LINEAR_HIGH_SPEED_FACTOR_ID);
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		getPreferenceStore().removePropertyChangeListener(this);
		context = null;
	}

	public static BundleContext getBundleContext() {
		return context;
	}	

	public static TopologyViewerRegistry getTopologyViewerRegistry() 
	{
		if(topologyViewerRegistry == null)
		{
			topologyViewerRegistry = ApogyCommonTopologyUIViewerFactory.eINSTANCE.createTopologyViewerRegistry();
			topologyViewerRegistry.setVerbose(true);
		}
		return topologyViewerRegistry;
	}		
	
	public double getNavigationLinearLowSpeedFactor()
	{
		return navigationLinearLowSpeedFactor;
	}

	public double getNavigationLinearHighSpeedFactor() {
		return navigationLinearHighSpeedFactor;
	}
	
	public int getMaximumFrameRate()
	{
		return maximumFrameRate;
	}
	
	public boolean isAntialiasing() {
		return antialiasing;
	}

	@Override
	public void propertyChange(org.eclipse.jface.util.PropertyChangeEvent event) 
	{
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		String propertyID = event.getProperty();

		try 
		{			
			if(propertyID.equals(TopologyViewerPreferencesConstants.VIEWER_ANTI_ALIASING_ID))
			{
				antialiasing = store.getBoolean(TopologyViewerPreferencesConstants.VIEWER_ANTI_ALIASING_ID);
				Logger.INSTANCE.log(Activator.ID, this, "Antialiasing changed to  <"+ antialiasing + ">.", EventSeverity.INFO);
			}
			else if(propertyID.equals(TopologyViewerPreferencesConstants.VIEWER_MAX_FRAME_RATE_ID))
			{
				maximumFrameRate = store.getInt(TopologyViewerPreferencesConstants.VIEWER_MAX_FRAME_RATE_ID);
				Logger.INSTANCE.log(Activator.ID, this, "Maximum Frame Rate set to <"	+ maximumFrameRate + "> fps.", EventSeverity.INFO);
			}				
			else if (propertyID.equals(TopologyViewerPreferencesConstants.DEFAULT_LINEAR_HIGH_SPEED_FACTOR_ID)) 
			{
				navigationLinearHighSpeedFactor = store.getDouble(TopologyViewerPreferencesConstants.DEFAULT_LINEAR_HIGH_SPEED_FACTOR_ID);
				Logger.INSTANCE.log(Activator.ID, this, "Updated Linear High Speed to   <"+ navigationLinearHighSpeedFactor + ">.", EventSeverity.INFO);				
			}
			else if (propertyID.equals(TopologyViewerPreferencesConstants.DEFAULT_LINEAR_LOW_SPEED_FACTOR_ID)) 
			{
				navigationLinearLowSpeedFactor = store.getDouble(TopologyViewerPreferencesConstants.DEFAULT_LINEAR_LOW_SPEED_FACTOR_ID);
				Logger.INSTANCE.log(Activator.ID, this, "Updated Linear Low Speed to   <"+ navigationLinearLowSpeedFactor + ">.", EventSeverity.INFO);
			}
		} 
		catch (Throwable t) 
		{
			t.printStackTrace();
		}
	}

}
