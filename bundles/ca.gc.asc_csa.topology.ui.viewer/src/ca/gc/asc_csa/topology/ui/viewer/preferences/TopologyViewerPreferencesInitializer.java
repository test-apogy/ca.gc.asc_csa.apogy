package ca.gc.asc_csa.topology.ui.viewer.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import ca.gc.asc_csa.topology.ui.viewer.Activator;

public class TopologyViewerPreferencesInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() 
	{			
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		// Initialize default viewer verbose.
		store.setDefault(TopologyViewerPreferencesConstants.VIEWER_VERBOSE_ID, TopologyViewerPreferencesConstants.VIEWER_VERBOSE_DEFAULT);
				
		// Initialize default viewer anti-aliasing.
		store.setDefault(TopologyViewerPreferencesConstants.VIEWER_ANTI_ALIASING_ID, TopologyViewerPreferencesConstants.VIEWER_ANTI_ALIASING_DEFAULT);
		
		// Initialize default viewer frame rate, in Hz.
		store.setDefault(TopologyViewerPreferencesConstants.VIEWER_MAX_FRAME_RATE_ID, TopologyViewerPreferencesConstants.VIEWER_MAX_FRAME_RATE_DEFAULT);
		
		// Initialize default linear speed factors.
		store.setDefault(TopologyViewerPreferencesConstants.DEFAULT_LINEAR_LOW_SPEED_FACTOR_ID, TopologyViewerPreferencesConstants.DEFAULT_LINEAR_LOW_SPEED_FACTOR);
		store.setDefault(TopologyViewerPreferencesConstants.DEFAULT_LINEAR_HIGH_SPEED_FACTOR_ID, TopologyViewerPreferencesConstants.DEFAULT_LINEAR_HIGH_SPEED_FACTOR);
					
	}
}
