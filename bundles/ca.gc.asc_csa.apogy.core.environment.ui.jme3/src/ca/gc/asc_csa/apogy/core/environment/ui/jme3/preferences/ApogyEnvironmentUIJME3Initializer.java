package ca.gc.asc_csa.apogy.core.environment.ui.jme3.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import ca.gc.asc_csa.apogy.core.environment.ui.jme3.Activator;

public class ApogyEnvironmentUIJME3Initializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() 
	{			
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		
		// Initialize Earth Sky Preferences.
		store.setDefault(ApogyEnvironmentUIJME3PreferencesConstants.DEFAULT_BLOOM_ENABLED_ID, ApogyEnvironmentUIJME3PreferencesConstants.DEFAULT_BLOOM_ENABLED_DEFAULT);				
		store.setDefault(ApogyEnvironmentUIJME3PreferencesConstants.DEFAULT_SHADOW_MAP_SIZE_ID, ApogyEnvironmentUIJME3PreferencesConstants.DEFAULT_SHADOW_MAP_SIZE_DEFAULT);				
		store.setDefault(ApogyEnvironmentUIJME3PreferencesConstants.DEFAULT_SUN_CAST_SHADOWS_ENABLED_ID, ApogyEnvironmentUIJME3PreferencesConstants.DEFAULT_SUN_CAST_SHADOWS_ENABLED_DEFAULT);
		store.setDefault(ApogyEnvironmentUIJME3PreferencesConstants.DEFAULT_MOON_CAST_SHADOWS_ENABLED_ID, ApogyEnvironmentUIJME3PreferencesConstants.DEFAULT_MOON_CAST_SHADOWS_ENABLED_DEFAULT);
	}
}
