package org.eclipse.symphony.core.topology.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.symphony.core.topology.ui.Activator;

public class SymphonyTopologyUIPreferencesInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() 
	{			
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();		
		PreferenceConverter.setDefault(store, SymphonyTopologyUIPreferencesConstants.DEFAULT_SYMPHONY_SYSTEM_VIEW_BACKGROUND_COLOR_ID, SymphonyTopologyUIPreferencesConstants.DEFAULT_SYMPHONY_SYSTEM_VIEW_BACKGROUND_COLOR);
	}
}
