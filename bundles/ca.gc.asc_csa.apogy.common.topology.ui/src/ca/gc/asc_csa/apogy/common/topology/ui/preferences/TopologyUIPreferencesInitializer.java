package ca.gc.asc_csa.apogy.common.topology.ui.preferences;
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
import ca.gc.asc_csa.apogy.common.topology.ui.Activator;

public class TopologyUIPreferencesInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() 
	{			
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		// Initialize Position Node Presentation preferences.
		store.setDefault(PreferencesConstants.DEFAULT_POSITION_NODE_AXIS_VISIBILITY_ID, PreferencesConstants.DEFAULT_POSITION_NODE_AXIS_VISIBILITY);
		store.setDefault(PreferencesConstants.DEFAULT_POSITION_NODE_AXIS_LENGTH_ID, PreferencesConstants.DEFAULT_POSITION_NODE_AXIS_LENGTH);
		
		// Initialize Rotation Node Presentation preferences.
		store.setDefault(PreferencesConstants.DEFAULT_ROTATION_NODE_AXIS_VISIBILITY_ID, PreferencesConstants.DEFAULT_ROTATION_NODE_AXIS_VISIBILITY);
		store.setDefault(PreferencesConstants.DEFAULT_ROTATION_NODE_AXIS_LENGTH_ID, PreferencesConstants.DEFAULT_ROTATION_NODE_AXIS_LENGTH);
		
		// Initialize Transform Node Presentation preferences.
		store.setDefault(PreferencesConstants.DEFAULT_TRANSFORM_NODE_AXIS_VISIBILITY_ID, PreferencesConstants.DEFAULT_TRANSFORM_NODE_AXIS_VISIBILITY);
		store.setDefault(PreferencesConstants.DEFAULT_TRANSFORM_NODE_AXIS_LENGTH_ID, PreferencesConstants.DEFAULT_TRANSFORM_NODE_AXIS_LENGTH);
		
		// Initialize URL Node Presentation preferences.
		store.setDefault(PreferencesConstants.DEFAULT_URL_NODE_AXIS_VISIBILITY_ID, PreferencesConstants.DEFAULT_URL_NODE_AXIS_VISIBILITY);
		store.setDefault(PreferencesConstants.DEFAULT_URL_NODE_AXIS_LENGTH_ID, PreferencesConstants.DEFAULT_URL_NODE_AXIS_LENGTH);
		
		store.setDefault(PreferencesConstants.DEFAULT_CAD_NODE_VISIBILITY_ID, PreferencesConstants.DEFAULT_CAD_NODE_VISIBILITY);
	}
}
