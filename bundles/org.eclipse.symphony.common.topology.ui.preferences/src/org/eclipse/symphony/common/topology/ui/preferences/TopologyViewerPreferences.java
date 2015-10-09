package org.eclipse.symphony.common.topology.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;

public class TopologyViewerPreferences extends AbstractPreferenceInitializer {

	public TopologyViewerPreferences() {
		Activator.getDefault().getPreferenceStore().setDefault(
				PreferenceConstants.P_ANTI_ALIASING, false);
		
		Activator.getDefault().getPreferenceStore().setDefault(
				PreferenceConstants.P_SHOW_3D_AXIS, false);
	}

	@Override
	public void initializeDefaultPreferences() {

	}

}
