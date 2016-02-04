package ca.gc.asc_csa.apogy.common.geometry.data3d.ui.preferences;
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
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.Activator;

public class MRTData3DUIPreferencesInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() 
	{			
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		// Initialize default visibility.
		store.setDefault(MRTData3DUIPreferencesConstants.DEFAULT_TRIANGULAR_MESH_VISIBILITY_ID, MRTData3DUIPreferencesConstants.DEFAULT_TRIANGULAR_MESH_VISIBILITY);
		store.setDefault(MRTData3DUIPreferencesConstants.DEFAULT_CARTESIAN_COORD_SET_VISIBILITY_ID, MRTData3DUIPreferencesConstants.DEFAULT_CARTESIAN_COORD_SET_VISIBILITY);
		
		// Initialize Point size.
		store.setDefault(MRTData3DUIPreferencesConstants.DEFAULT_TRIANGULAR_MESH_POINT_SIZE_ID, MRTData3DUIPreferencesConstants.DEFAULT_TRIANGULAR_MESH_POINT_SIZE);
		store.setDefault(MRTData3DUIPreferencesConstants.DEFAULT_CARTESIAN_COORD_SET_POINT_SIZE_ID, MRTData3DUIPreferencesConstants.DEFAULT_CARTESIAN_COORD_SET_POINT_SIZE);
		
		
		// Initialize default colors.
		PreferenceConverter.setDefault(store, MRTData3DUIPreferencesConstants.DEFAULT_TRIANGULAR_MESH_COLOR_ID, MRTData3DUIPreferencesConstants.DEFAULT_TRIANGULAR_MESH_COLOR);
		PreferenceConverter.setDefault(store, MRTData3DUIPreferencesConstants.DEFAULT_CARTESIAN_COORD_SET_COLOR_ID, MRTData3DUIPreferencesConstants.DEFAULT_CARTESIAN_COORD_SET_COLOR);
		
		// Initialize default presentation mode.
		store.setDefault(MRTData3DUIPreferencesConstants.DEFAULT_TRIANGULAR_MESH_PRESENTATION_MODE_ID, MRTData3DUIPreferencesConstants.DEFAULT_TRIANGULAR_MESH_PRESENTATION_MODE.getValue());
		
		// Initialize default use shading.
		store.setDefault(MRTData3DUIPreferencesConstants.DEFAULT_TRIANGULAR_MESH_USE_SHADING_ID, MRTData3DUIPreferencesConstants.DEFAULT_TRIANGULAR_MESH_USE_SHADING);
	}
}
