package ca.gc.space.topology.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import ca.gc.space.topology.ui.Activator;

public class TopologyUIPreferencesInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() 
	{			
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		// Initialize Position Node Presentation preferences.
		store.setDefault(PreferencesConstants.DEFAULT_POSITION_NODE_AXIS_VISIBILITY_ID, PreferencesConstants.DEFAULT_POSITION_NODE_AXIS_VISIBILITY);
		store.setDefault(PreferencesConstants.DEFAULT_POSITION_NODE_AXIS_LENGHT_ID, PreferencesConstants.DEFAULT_POSITION_NODE_AXIS_LENGHT);
		
		// Initialize Rotation Node Presentation preferences.
		store.setDefault(PreferencesConstants.DEFAULT_ROTATION_NODE_AXIS_VISIBILITY_ID, PreferencesConstants.DEFAULT_ROTATION_NODE_AXIS_VISIBILITY);
		store.setDefault(PreferencesConstants.DEFAULT_ROTATION_NODE_AXIS_LENGHT_ID, PreferencesConstants.DEFAULT_ROTATION_NODE_AXIS_LENGHT);
		
		// Initialize Transform Node Presentation preferences.
		store.setDefault(PreferencesConstants.DEFAULT_TRANSFORM_NODE_AXIS_VISIBILITY_ID, PreferencesConstants.DEFAULT_TRANSFORM_NODE_AXIS_VISIBILITY);
		store.setDefault(PreferencesConstants.DEFAULT_TRANSFORM_NODE_AXIS_LENGHT_ID, PreferencesConstants.DEFAULT_TRANSFORM_NODE_AXIS_LENGHT);
		
		// Initialize URL Node Presentation preferences.
		store.setDefault(PreferencesConstants.DEFAULT_URL_NODE_AXIS_VISIBILITY_ID, PreferencesConstants.DEFAULT_URL_NODE_AXIS_VISIBILITY);
		store.setDefault(PreferencesConstants.DEFAULT_URL_NODE_AXIS_LENGHT_ID, PreferencesConstants.DEFAULT_URL_NODE_AXIS_LENGHT);
		
		store.setDefault(PreferencesConstants.DEFAULT_CAD_NODE_VISIBILITY_ID, PreferencesConstants.DEFAULT_CAD_NODE_VISIBILITY);
	}
}
