package org.eclipse.symphony.core.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.symphony.core.ui.Activator;

public class SymphonyCorePreferencesInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() 
	{			
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		// Initialize default Result Node flag visibility.
		store.setDefault(SymphonyCorePreferencesConstants.DEFAULT_RESULT_NODE_FLAG_VISIBILITY_ID, SymphonyCorePreferencesConstants.DEFAULT_RESULT_NODE_FLAG_VISIBILITY);
		
		// Initialize default Result Node flag pole height.
		store.setDefault(SymphonyCorePreferencesConstants.DEFAULT_RESULT_NODE_FLAG_POLE_HEIGHT_ID, SymphonyCorePreferencesConstants.DEFAULT_RESULT_NODE_FLAG_POLE_HEIGHT);			
	}
}
