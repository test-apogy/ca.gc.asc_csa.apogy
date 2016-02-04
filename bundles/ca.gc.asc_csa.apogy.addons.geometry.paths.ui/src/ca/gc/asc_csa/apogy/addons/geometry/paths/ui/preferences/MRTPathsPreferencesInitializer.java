package ca.gc.asc_csa.apogy.addons.geometry.paths.ui.preferences;
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
import ca.gc.asc_csa.apogy.addons.geometry.paths.ui.Activator;

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
