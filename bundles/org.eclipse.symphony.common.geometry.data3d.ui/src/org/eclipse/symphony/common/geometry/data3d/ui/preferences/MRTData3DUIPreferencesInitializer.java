package org.eclipse.symphony.common.geometry.data3d.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.symphony.common.geometry.data3d.ui.Activator;

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
