package ca.gc.asc_csa.apogy.core.ui.preferences;
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
import ca.gc.asc_csa.apogy.core.ui.Activator;

public class ApogyCorePreferencesInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() 
	{			
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		// Initialize default Result Node flag visibility.
		store.setDefault(ApogyCorePreferencesConstants.DEFAULT_RESULT_NODE_FLAG_VISIBILITY_ID, ApogyCorePreferencesConstants.DEFAULT_RESULT_NODE_FLAG_VISIBILITY);
		
		// Initialize default Result Node flag pole height.
		store.setDefault(ApogyCorePreferencesConstants.DEFAULT_RESULT_NODE_FLAG_POLE_HEIGHT_ID, ApogyCorePreferencesConstants.DEFAULT_RESULT_NODE_FLAG_POLE_HEIGHT);			
	}
}
