package ca.gc.asc_csa.symphony.environment.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import ca.gc.asc_csa.symphony.environment.ui.Activator;

public class SymphonyEnvironmentUIPreferencesInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() 
	{			
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		// Initialize Earth Surface Worksite
		store.setDefault(SymphonyEnvironmentUIPreferencesConstants.DEFAULT_EARTH_SURFACE_WORKSITE_AXIS_VISIBLE_ID, SymphonyEnvironmentUIPreferencesConstants.DEFAULT_EARTH_SURFACE_WORKSITE_AXIS_VISIBLE);
		store.setDefault(SymphonyEnvironmentUIPreferencesConstants.DEFAULT_EARTH_SURFACE_WORKSITE_AXIS_LENGHT_ID, SymphonyEnvironmentUIPreferencesConstants.DEFAULT_EARTH_SURFACE_WORKSITE_AXIS_LENGHT);
		
		store.setDefault(SymphonyEnvironmentUIPreferencesConstants.DEFAULT_EARTH_SURFACE_WORKSITE_AZIMUTH_VISIBLE_ID, SymphonyEnvironmentUIPreferencesConstants.DEFAULT_EARTH_SURFACE_WORKSITE_AZIMUTH_VISIBLE);
		store.setDefault(SymphonyEnvironmentUIPreferencesConstants.DEFAULT_EARTH_SURFACE_WORKSITE_AZIMUTH_LINES_VISIBLE_ID, SymphonyEnvironmentUIPreferencesConstants.DEFAULT_EARTH_SURFACE_WORKSITE_AZIMUTH_LINES_VISIBLE);
		store.setDefault(SymphonyEnvironmentUIPreferencesConstants.DEFAULT_EARTH_SURFACE_WORKSITE_ELEVATION_LINES_VISIBLE_ID, SymphonyEnvironmentUIPreferencesConstants.DEFAULT_EARTH_SURFACE_WORKSITE_ELEVATION_LINES_VISIBLE);
		store.setDefault(SymphonyEnvironmentUIPreferencesConstants.DEFAULT_EARTH_SURFACE_WORKSITE_PLANE_VISIBLE_ID, SymphonyEnvironmentUIPreferencesConstants.DEFAULT_EARTH_SURFACE_WORKSITE_PLANE_VISIBLE);		
		store.setDefault(SymphonyEnvironmentUIPreferencesConstants.DEFAULT_EARTH_SURFACE_WORKSITE_PLANE_GRID_SIZE_ID, SymphonyEnvironmentUIPreferencesConstants.DEFAULT_EARTH_SURFACE_WORKSITE_PLANE_GRID_SIZE);		
		store.setDefault(SymphonyEnvironmentUIPreferencesConstants.DEFAULT_EARTH_SURFACE_WORKSITE_PLANE_SIZE_ID, SymphonyEnvironmentUIPreferencesConstants.DEFAULT_EARTH_SURFACE_WORKSITE_PLANE_SIZE);
			
		// Initialize default size for MapViewConfiguration.
		store.setDefault(SymphonyEnvironmentUIPreferencesConstants.DEFAULT_MAP_VIEW_CONFIGURATION_X_MIN_ID, SymphonyEnvironmentUIPreferencesConstants.DEFAULT_MAP_VIEW_CONFIGURATION_X_MIN);
		store.setDefault(SymphonyEnvironmentUIPreferencesConstants.DEFAULT_MAP_VIEW_CONFIGURATION_X_MAX_ID, SymphonyEnvironmentUIPreferencesConstants.DEFAULT_MAP_VIEW_CONFIGURATION_X_MAX);
		store.setDefault(SymphonyEnvironmentUIPreferencesConstants.DEFAULT_MAP_VIEW_CONFIGURATION_Y_MIN_ID, SymphonyEnvironmentUIPreferencesConstants.DEFAULT_MAP_VIEW_CONFIGURATION_Y_MIN);
		store.setDefault(SymphonyEnvironmentUIPreferencesConstants.DEFAULT_MAP_VIEW_CONFIGURATION_Y_MAX_ID, SymphonyEnvironmentUIPreferencesConstants.DEFAULT_MAP_VIEW_CONFIGURATION_Y_MAX);
		
		// Initialize default Map View Parameters
		store.setDefault(SymphonyEnvironmentUIPreferencesConstants.DEFAULT_MAP_VIEW_UPDATE_PERIOD_MILLISECONDS_ID, SymphonyEnvironmentUIPreferencesConstants.DEFAULT_MAP_VIEW_UPDATE_PERIOD_MILLISECONDS);
		store.setDefault(SymphonyEnvironmentUIPreferencesConstants.DEFAULT_MAP_VIEW_IMAGE_MAXIMUM_NUMBER_OF_PIXELS_ID, SymphonyEnvironmentUIPreferencesConstants.DEFAULT_MAP_VIEW_IMAGE_MAXIMUM_NUMBER_OF_PIXELS);
		
		// Initialize the star magnitude cutoff.
		store.setDefault(SymphonyEnvironmentUIPreferencesConstants.DEFAULT_STAR_MAGNITUDE_CUTOFF_ID, SymphonyEnvironmentUIPreferencesConstants.DEFAULT_STAR_MAGNITUDE_CUTOFF);

	}
}
