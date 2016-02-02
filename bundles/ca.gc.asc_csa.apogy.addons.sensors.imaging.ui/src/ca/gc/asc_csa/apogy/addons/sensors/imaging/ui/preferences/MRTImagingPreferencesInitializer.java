package ca.gc.asc_csa.apogy.addons.sensors.imaging.ui.preferences;
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
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ui.Activator;





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
