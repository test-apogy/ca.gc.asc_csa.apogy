package ca.gc.asc_csa.apogy.addons.sensors.fov.ui.preferences;
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
import org.eclipse.jface.preference.PreferenceConverter;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.Activator;

public class MRTFOVPreferencesInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() 
	{			
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		// Initialize default visibility for the various Field of view Types.
		store.setDefault(MRTFOVPreferencesConstants.DEFAULT_CIRCULAR_SECTOR_FOV_VISIBILITY_ID, MRTFOVPreferencesConstants.DEFAULT_CIRCULAR_SECTOR_FOV_VISIBILITY);
		store.setDefault(MRTFOVPreferencesConstants.DEFAULT_CONICAL_FOV_VISIBILITY_ID, MRTFOVPreferencesConstants.DEFAULT_CONICAL_FOV_VISIBILITY);
		store.setDefault(MRTFOVPreferencesConstants.DEFAULT_RECTANGULAR_FRUSTUM_FOV_VISIBILITY_ID, MRTFOVPreferencesConstants.DEFAULT_RECTANGULAR_FRUSTUM_FOV_VISIBILITY);
		
		// Initialize default presentation mode for the various Field of view Types.
		store.setDefault(MRTFOVPreferencesConstants.DEFAULT_CIRCULAR_SECTOR_FOV_PRESENTATION_MODE_ID, MRTFOVPreferencesConstants.DEFAULT_CIRCULAR_SECTOR_FOV_PRESENTATION_MODE.getValue());
		store.setDefault(MRTFOVPreferencesConstants.DEFAULT_CONICAL_FOV_PRESENTATION_MODE_ID, MRTFOVPreferencesConstants.DEFAULT_CONICAL_FOV_PRESENTATION_MODE.getValue());
		store.setDefault(MRTFOVPreferencesConstants.DEFAULT_RECTANGULAR_FRUSTUM_FOV_PRESENTATION_MODE_ID, MRTFOVPreferencesConstants.DEFAULT_RECTANGULAR_FRUSTUM_FOV_PRESENTATION_MODE.getValue());
		
		// Initialize default colors for the various Field of view Types.
		PreferenceConverter.setDefault(store, MRTFOVPreferencesConstants.DEFAULT_CIRCULAR_SECTOR_FOV_COLOR_ID, MRTFOVPreferencesConstants.DEFAULT_CIRCULAR_SECTOR_FOV_COLOR);
		PreferenceConverter.setDefault(store, MRTFOVPreferencesConstants.DEFAULT_CONICAL_FOV_COLOR_ID, MRTFOVPreferencesConstants.DEFAULT_CONICAL_FOV_COLOR);
		PreferenceConverter.setDefault(store, MRTFOVPreferencesConstants.DEFAULT_RECTANGULAR_FRUSTUM_FOV_COLOR_ID, MRTFOVPreferencesConstants.DEFAULT_RECTANGULAR_FRUSTUM_FOV_COLOR);
		
		// Initialize outline only flag for the various Field of view Types.
		store.setDefault(MRTFOVPreferencesConstants.DEFAULT_CIRCULAR_SECTOR_FOV_SHOW_OUTLINE_ONLY_ID, MRTFOVPreferencesConstants.DEFAULT_CIRCULAR_SECTOR_FOV_SHOW_OUTLINE_ONLY);
		store.setDefault(MRTFOVPreferencesConstants.DEFAULT_CONICAL_FOV_SHOW_OUTLINE_ONLY_ID, MRTFOVPreferencesConstants.DEFAULT_CONICAL_FOV_SHOW_OUTLINE_ONLY);
		store.setDefault(MRTFOVPreferencesConstants.DEFAULT_RECTANGULAR_FRUSTUM_FOV_SHOW_OUTLINE_ONLY_ID, MRTFOVPreferencesConstants.DEFAULT_RECTANGULAR_FRUSTUM_FOV_SHOW_OUTLINE_ONLY);
		
		// Initialize default projection enablement for the various Field of view Types.
		store.setDefault(MRTFOVPreferencesConstants.DEFAULT_CIRCULAR_SECTOR_FOV_SHOW_PROJECTION_ID, MRTFOVPreferencesConstants.DEFAULT_CIRCULAR_SECTOR_FOV_SHOW_PROJECTION);
		store.setDefault(MRTFOVPreferencesConstants.DEFAULT_CONICAL_FOV_SHOW_PROJECTION_ID, MRTFOVPreferencesConstants.DEFAULT_CONICAL_FOV_SHOW_PROJECTION);
		store.setDefault(MRTFOVPreferencesConstants.DEFAULT_RECTANGULAR_FRUSTUM_FOV_SHOW_PROJECTION_ID, MRTFOVPreferencesConstants.DEFAULT_RECTANGULAR_FRUSTUM_FOV_SHOW_PROJECTION);

		// Initialize default projection color for the various Field of view Types.
		PreferenceConverter.setDefault(store, MRTFOVPreferencesConstants.DEFAULT_CIRCULAR_SECTOR_FOV_PROJECTION_COLOR_ID, MRTFOVPreferencesConstants.DEFAULT_CIRCULAR_SECTOR_FOV_PROJECTION_COLOR);
		PreferenceConverter.setDefault(store, MRTFOVPreferencesConstants.DEFAULT_CONICAL_FOV_PROJECTION_COLOR_ID, MRTFOVPreferencesConstants.DEFAULT_CONICAL_FOV_PROJECTION_COLOR);
		PreferenceConverter.setDefault(store, MRTFOVPreferencesConstants.DEFAULT_RECTANGULAR_FRUSTUM_FOV_PROJECTION_COLOR_ID, MRTFOVPreferencesConstants.DEFAULT_RECTANGULAR_FRUSTUM_FOV_PROJECTION_COLOR);
	}
}
