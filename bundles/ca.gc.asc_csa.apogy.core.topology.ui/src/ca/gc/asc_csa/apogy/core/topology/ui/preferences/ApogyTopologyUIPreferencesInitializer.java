package ca.gc.asc_csa.apogy.core.topology.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import ca.gc.asc_csa.apogy.core.topology.ui.Activator;

public class ApogyTopologyUIPreferencesInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() 
	{			
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();		
		PreferenceConverter.setDefault(store, ApogyTopologyUIPreferencesConstants.DEFAULT_APOGY_SYSTEM_VIEW_BACKGROUND_COLOR_ID, ApogyTopologyUIPreferencesConstants.DEFAULT_APOGY_SYSTEM_VIEW_BACKGROUND_COLOR);
	}
}
