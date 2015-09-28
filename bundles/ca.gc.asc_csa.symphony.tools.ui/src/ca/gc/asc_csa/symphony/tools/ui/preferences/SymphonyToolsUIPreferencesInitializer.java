package ca.gc.asc_csa.symphony.tools.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;

import ca.gc.asc_csa.symphony.tools.ui.Activator;

public class SymphonyToolsUIPreferencesInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() 
	{			
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		// Initialize default Result Node flag visibility.
		PreferenceConverter.setDefault(store, SymphonyToolsUIPreferencesConstants.DEFAULT_SUN_VECTOR_COLOR_ID, SymphonyToolsUIPreferencesConstants.DEFAULT_SUN_VECTOR_COLOR);
						
	}
}
