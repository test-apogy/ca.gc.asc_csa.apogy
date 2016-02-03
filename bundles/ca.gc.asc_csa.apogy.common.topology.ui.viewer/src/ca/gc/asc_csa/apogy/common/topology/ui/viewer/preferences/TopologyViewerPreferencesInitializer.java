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
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.Activator;

public class TopologyViewerPreferencesInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() 
	{			
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		// Initialize default viewer verbose.
		store.setDefault(TopologyViewerPreferencesConstants.VIEWER_VERBOSE_ID, TopologyViewerPreferencesConstants.VIEWER_VERBOSE_DEFAULT);
				
		// Initialize default viewer anti-aliasing.
		store.setDefault(TopologyViewerPreferencesConstants.VIEWER_ANTI_ALIASING_ID, TopologyViewerPreferencesConstants.VIEWER_ANTI_ALIASING_DEFAULT);
		
		// Initialize default viewer frame rate, in Hz.
		store.setDefault(TopologyViewerPreferencesConstants.VIEWER_MAX_FRAME_RATE_ID, TopologyViewerPreferencesConstants.VIEWER_MAX_FRAME_RATE_DEFAULT);
		
		// Initialize default linear speed factors.
		store.setDefault(TopologyViewerPreferencesConstants.DEFAULT_LINEAR_LOW_SPEED_FACTOR_ID, TopologyViewerPreferencesConstants.DEFAULT_LINEAR_LOW_SPEED_FACTOR);
		store.setDefault(TopologyViewerPreferencesConstants.DEFAULT_LINEAR_HIGH_SPEED_FACTOR_ID, TopologyViewerPreferencesConstants.DEFAULT_LINEAR_HIGH_SPEED_FACTOR);
					
	}
}
