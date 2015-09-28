package ca.gc.space.mrt.geometry.paths.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;

import ca.gc.space.mrt.geometry.paths.ui.Activator;

public class MRTPathsPreferencesInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() 
	{			
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		// Initialize default visibility.
		store.setDefault(MRTPathsPreferencesConstants.DEFAULT_WAYPOINTPATH_VISIBILITY_ID, MRTPathsPreferencesConstants.DEFAULT_WAYPOINTPATH_VISIBILITY);
		
		// Initialize default presentation mode.
		store.setDefault(MRTPathsPreferencesConstants.DEFAULT_WAYPOINTPATH_PRESENTATION_MODE_ID, MRTPathsPreferencesConstants.DEFAULT_WAYPOINTPATH_PRESENTATION_MODE.getValue());
		
		// Initialize default colors.
		PreferenceConverter.setDefault(store, MRTPathsPreferencesConstants.DEFAULT_WAYPOINTPATH_COLOR_ID, MRTPathsPreferencesConstants.DEFAULT_WAYPOINTPATH_COLOR);
		
		// Initialize Point size.
		store.setDefault(MRTPathsPreferencesConstants.DEFAULT_WAYPOINTPATH_POINT_SIZE_ID, MRTPathsPreferencesConstants.DEFAULT_WAYPOINTPATH_POINT_SIZE);

		// Iinitialize end point radius.
		store.setDefault(MRTPathsPreferencesConstants.DEFAULT_WAYPOINTPATH_END_POINT_RADIUS_ID, MRTPathsPreferencesConstants.DEFAULT_WAYPOINTPATH_END_POINT_RADIUS);

	}
}
