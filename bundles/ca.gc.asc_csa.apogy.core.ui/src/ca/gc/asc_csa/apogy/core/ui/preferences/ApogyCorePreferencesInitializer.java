package ca.gc.asc_csa.apogy.core.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import ca.gc.asc_csa.apogy.core.ui.Activator;

public class ApogyCorePreferencesInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() 
	{			
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		// Initialize default Result Node flag visibility.
		store.setDefault(ApogyCorePreferencesConstants.DEFAULT_RESULT_NODE_FLAG_VISIBILITY_ID, ApogyCorePreferencesConstants.DEFAULT_RESULT_NODE_FLAG_VISIBILITY);
		
		// Initialize default Result Node flag pole height.
		store.setDefault(ApogyCorePreferencesConstants.DEFAULT_RESULT_NODE_FLAG_POLE_HEIGHT_ID, ApogyCorePreferencesConstants.DEFAULT_RESULT_NODE_FLAG_POLE_HEIGHT);			
	}
}
