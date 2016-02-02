package ca.gc.asc_csa.apogy.core.environment.ui.jme3.preferences;
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
import ca.gc.asc_csa.apogy.core.environment.ui.jme3.Activator;

public class ApogyEnvironmentUIJME3Initializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() 
	{			
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		
		// Initialize Earth Sky Preferences.
		store.setDefault(ApogyEnvironmentUIJME3PreferencesConstants.DEFAULT_BLOOM_ENABLED_ID, ApogyEnvironmentUIJME3PreferencesConstants.DEFAULT_BLOOM_ENABLED_DEFAULT);				
		store.setDefault(ApogyEnvironmentUIJME3PreferencesConstants.DEFAULT_SHADOW_MAP_SIZE_ID, ApogyEnvironmentUIJME3PreferencesConstants.DEFAULT_SHADOW_MAP_SIZE_DEFAULT);				
		store.setDefault(ApogyEnvironmentUIJME3PreferencesConstants.DEFAULT_SUN_CAST_SHADOWS_ENABLED_ID, ApogyEnvironmentUIJME3PreferencesConstants.DEFAULT_SUN_CAST_SHADOWS_ENABLED_DEFAULT);
		store.setDefault(ApogyEnvironmentUIJME3PreferencesConstants.DEFAULT_MOON_CAST_SHADOWS_ENABLED_ID, ApogyEnvironmentUIJME3PreferencesConstants.DEFAULT_MOON_CAST_SHADOWS_ENABLED_DEFAULT);
	}
}
