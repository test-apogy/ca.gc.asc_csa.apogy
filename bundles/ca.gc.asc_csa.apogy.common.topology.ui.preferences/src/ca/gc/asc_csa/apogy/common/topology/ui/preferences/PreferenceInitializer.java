package ca.gc.asc_csa.apogy.common.topology.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.osgi.service.prefs.BackingStoreException;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#
	 * initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {

		// We populate the default scope.
		IEclipsePreferences prefs = DefaultScope.INSTANCE
				.getNode(Activator.PLUGIN_ID);

		// Back light
		prefs.putFloat(PreferenceConstants.P_BACK_LIGHT_AZIMUTH,
				PreferenceConstants.P_BACK_LIGHT_AZIMUTH_DEFAULT);

		prefs.putFloat(PreferenceConstants.P_BACK_LIGHT_ELEVATION,
				PreferenceConstants.P_BACK_LIGHT_ELEVATION_DEFAULT);

		prefs.putFloat(PreferenceConstants.P_BACK_LIGHT_WARMTH,
				PreferenceConstants.P_BACK_LIGHT_WARMTH_DEFAULT);

		// Fill light
		prefs.putFloat(PreferenceConstants.P_FILL_LIGHT_AZIMUTH,
				PreferenceConstants.P_FILL_LIGHT_AZIMUTH_DEFAULT);

		prefs.putFloat(PreferenceConstants.P_FILL_LIGHT_ELEVATION,
				PreferenceConstants.P_FILL_LIGHT_ELEVATION_DEFAULT);

		prefs.putFloat(PreferenceConstants.P_FILL_LIGHT_WARMTH,
				PreferenceConstants.P_FILL_LIGHT_WARMTH_DEFAULT);

		// Head light
		prefs.putFloat(PreferenceConstants.P_HEAD_LIGHT_WARMTH,
				PreferenceConstants.P_HEAD_LIGHT_WARMTH_DEFAULT);

		// Key light
		prefs.putFloat(PreferenceConstants.P_KEY_LIGHT_AZIMUTH,
				PreferenceConstants.P_KEY_LIGHT_AZIMUTH_DEFAULT);

		prefs.putFloat(PreferenceConstants.P_KEY_LIGHT_ELEVATION,
				PreferenceConstants.P_KEY_LIGHT_ELEVATION_DEFAULT);

		prefs.putFloat(PreferenceConstants.P_KEY_LIGHT_WARMTH,
				PreferenceConstants.P_KEY_LIGHT_WARMTH_DEFAULT);

		prefs.putFloat(PreferenceConstants.P_KEY_LIGHT_INTENSITY,
				PreferenceConstants.P_KEY_LIGHT_INTENSITY_DEFAULT);

		// Key to ratios
		prefs.putFloat(PreferenceConstants.P_KEY_TO_BACK_RATIO,
				PreferenceConstants.P_KEY_TO_BACK_RATIO_DEFAULT);

		prefs.putFloat(PreferenceConstants.P_KEY_TO_FILL_RATIO,
				PreferenceConstants.P_KEY_TO_FILL_RATIO_DEFAULT);

		prefs.putFloat(PreferenceConstants.P_KEY_TO_HEAD_RATIO,
				PreferenceConstants.P_KEY_TO_HEAD_RATIO_DEFAULT);

		IPreferenceStore defaultStore = new ScopedPreferenceStore(
				DefaultScope.INSTANCE, Activator.PLUGIN_ID);

		// Colors
		PreferenceConverter.setValue(defaultStore,
				PreferenceConstants.P_FILL_LIGHT_COLOR,
				PreferenceConstants.P_FILL_LIGHT_COLOR_DEFAULT);

		PreferenceConverter.setValue(defaultStore,
				PreferenceConstants.P_KEY_LIGHT_COLOR,
				PreferenceConstants.P_KEY_LIGHT_COLOR_DEFAULT);

		PreferenceConverter.setValue(defaultStore,
				PreferenceConstants.P_BACK_LIGHT_COLOR,
				PreferenceConstants.P_BACK_LIGHT_COLOR_DEFAULT);

		PreferenceConverter.setValue(defaultStore,
				PreferenceConstants.P_HEAD_LIGHT_COLOR,
				PreferenceConstants.P_HEAD_LIGHT_COLOR_DEFAULT);

		// Enabled / disable
		prefs.putBoolean(PreferenceConstants.P_KEY_LIGHT_ENABLED,
				PreferenceConstants.P_KEY_LIGHT_ENABLED_DEFAULT);

		prefs.putBoolean(PreferenceConstants.P_FILL_LIGHT_ENABLED,
				PreferenceConstants.P_KEY_LIGHT_ENABLED_DEFAULT);

		prefs.putBoolean(PreferenceConstants.P_BACK_LIGHT_ENABLED,
				PreferenceConstants.P_BACK_LIGHT_ENABLED_DEFAULT);

		prefs.putBoolean(PreferenceConstants.P_HEAD_LIGHT_ENABLED,
				PreferenceConstants.P_HEAD_LIGHT_ENABLED_DEFAULT);

		try {
			prefs.flush();
		} catch (BackingStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
