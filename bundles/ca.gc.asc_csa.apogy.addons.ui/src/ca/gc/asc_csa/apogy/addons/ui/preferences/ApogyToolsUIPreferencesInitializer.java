package ca.gc.asc_csa.apogy.addons.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import ca.gc.asc_csa.apogy.addons.ui.Activator;

public class ApogyToolsUIPreferencesInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() 
	{			
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		// Initialize default Result Node flag visibility.
		PreferenceConverter.setDefault(store, ApogyToolsUIPreferencesConstants.DEFAULT_SUN_VECTOR_COLOR_ID, ApogyToolsUIPreferencesConstants.DEFAULT_SUN_VECTOR_COLOR);
						
	}
}
