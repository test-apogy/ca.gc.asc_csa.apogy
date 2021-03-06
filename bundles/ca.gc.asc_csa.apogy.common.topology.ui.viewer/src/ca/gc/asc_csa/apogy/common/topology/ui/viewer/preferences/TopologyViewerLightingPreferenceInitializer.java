package ca.gc.asc_csa.apogy.common.topology.ui.viewer.preferences;
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

import ca.gc.asc_csa.apogy.common.topology.ui.viewer.Activator;



public class TopologyViewerLightingPreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#
	 * initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() 
	{
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
				
		store.setDefault(TopologyViewerLightingPreferenceConstants.AMBIENT_LIGHT_ENABLED_ID, TopologyViewerLightingPreferenceConstants.AMBIENT_LIGHT_ENABLED_DEFAULT);
		PreferenceConverter.setDefault(store, TopologyViewerLightingPreferenceConstants.AMBIENT_LIGHT_COLOR_ID, TopologyViewerLightingPreferenceConstants.AMBIENT_LIGHT_COLOR_DEFAULT);		
	}

}
