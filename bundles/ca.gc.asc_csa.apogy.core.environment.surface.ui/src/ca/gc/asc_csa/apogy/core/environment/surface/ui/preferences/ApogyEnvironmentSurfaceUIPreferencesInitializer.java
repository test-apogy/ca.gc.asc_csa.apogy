package ca.gc.asc_csa.apogy.core.environment.surface.ui.preferences;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import ca.gc.asc_csa.apogy.core.environment.surface.ui.Activator;

public class ApogyEnvironmentSurfaceUIPreferencesInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() 
	{			
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		// Initialize the Sky Preferences
		store.setDefault(ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_SKY_HORIZON_VISIBLE_ID, ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_SKY_HORIZON_VISIBLE);
		
		// Initialize Surface Worksite Preferences
		store.setDefault(ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_SURFACE_WORKSITE_AXIS_VISIBLE_ID, ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_SURFACE_WORKSITE_AXIS_VISIBLE);
		store.setDefault(ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_SURFACE_WORKSITE_AXIS_LENGTH_ID, ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_SURFACE_WORKSITE_AXIS_LENGTH);
		
		store.setDefault(ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_SURFACE_WORKSITE_AZIMUTH_VISIBLE_ID, ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_SURFACE_WORKSITE_AZIMUTH_VISIBLE);
		store.setDefault(ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_SURFACE_WORKSITE_AZIMUTH_LINES_VISIBLE_ID, ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_SURFACE_WORKSITE_AZIMUTH_LINES_VISIBLE);
		store.setDefault(ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_SURFACE_WORKSITE_ELEVATION_LINES_VISIBLE_ID, ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_SURFACE_WORKSITE_ELEVATION_LINES_VISIBLE);
		store.setDefault(ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_SURFACE_WORKSITE_PLANE_VISIBLE_ID, ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_SURFACE_WORKSITE_PLANE_VISIBLE);		
		store.setDefault(ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_SURFACE_WORKSITE_PLANE_GRID_SIZE_ID, ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_SURFACE_WORKSITE_PLANE_GRID_SIZE);		
		store.setDefault(ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_SURFACE_WORKSITE_PLANE_SIZE_ID, ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_SURFACE_WORKSITE_PLANE_SIZE);
			
		// Initialize default size for MapViewConfiguration.
		store.setDefault(ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_MAP_VIEW_CONFIGURATION_X_MIN_ID, ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_MAP_VIEW_CONFIGURATION_X_MIN);
		store.setDefault(ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_MAP_VIEW_CONFIGURATION_X_MAX_ID, ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_MAP_VIEW_CONFIGURATION_X_MAX);
		store.setDefault(ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_MAP_VIEW_CONFIGURATION_Y_MIN_ID, ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_MAP_VIEW_CONFIGURATION_Y_MIN);
		store.setDefault(ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_MAP_VIEW_CONFIGURATION_Y_MAX_ID, ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_MAP_VIEW_CONFIGURATION_Y_MAX);
		
		// Initialize default Map View Parameters
		store.setDefault(ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_MAP_VIEW_UPDATE_PERIOD_MILLISECONDS_ID, ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_MAP_VIEW_UPDATE_PERIOD_MILLISECONDS);
		store.setDefault(ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_MAP_VIEW_IMAGE_MAXIMUM_NUMBER_OF_PIXELS_ID, ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_MAP_VIEW_IMAGE_MAXIMUM_NUMBER_OF_PIXELS);
		
		// Initialize the star magnitude cutoff.
		store.setDefault(ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_STAR_MAGNITUDE_CUTOFF_ID, ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_STAR_MAGNITUDE_CUTOFF);

	}
}
