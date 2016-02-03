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
