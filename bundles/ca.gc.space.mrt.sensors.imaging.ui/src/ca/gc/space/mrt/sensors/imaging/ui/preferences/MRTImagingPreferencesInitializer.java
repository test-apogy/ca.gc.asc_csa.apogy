package ca.gc.space.mrt.sensors.imaging.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;

import ca.gc.space.mrt.sensors.imaging.ui.Activator;





public class MRTImagingPreferencesInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() 
	{			
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		// Initialize default visibility.
		store.setDefault(MRTImagingPreferencesConstants.DEFAULT_IMAGE_SNAPSHOT_VISIBILITY_ID, MRTImagingPreferencesConstants.DEFAULT_IMAGE_SNAPSHOT_VISIBILITY);

		// Initialize default image projection.
		store.setDefault(MRTImagingPreferencesConstants.DEFAULT_IMAGE_SNAPSHOT_SHOW_PROJECTION_ID, MRTImagingPreferencesConstants.DEFAULT_IMAGE_SNAPSHOT_SHOW_PROJECTION);

		// Initialize default image projection on FOV.
		store.setDefault(MRTImagingPreferencesConstants.DEFAULT_IMAGE_SNAPSHOT_SHOW_PROJECTION_ON_FOV_ID, MRTImagingPreferencesConstants.DEFAULT_IMAGE_SNAPSHOT_SHOW_PROJECTION_ON_FOV);
		
		// Initialize default presentation mode.
		store.setDefault(MRTImagingPreferencesConstants.DEFAULT_IMAGE_SNAPSHOT_FOV_PRESENTATION_MODE_ID, MRTImagingPreferencesConstants.DEFAULT_IMAGE_SNAPSHOT_FOV_PRESENTATION_MODE.getValue());
		
		// Initialize default color.
		PreferenceConverter.setDefault(store, MRTImagingPreferencesConstants.DEFAULT_IMAGE_SNAPSHOT_FOV_COLOR_ID, MRTImagingPreferencesConstants.DEFAULT_IMAGE_SNAPSHOT_FOV_COLOR);
	}
}
