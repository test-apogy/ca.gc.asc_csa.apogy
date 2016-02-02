package ca.gc.asc_csa.apogy.addons.vehicle.ui.preferences;
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
import ca.gc.asc_csa.apogy.addons.vehicle.ui.Activator;

public class VehicleUIPreferencesInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() 
	{			
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		// Initialize default visibilities.
		store.setDefault(VehicleUIPreferencesConstants.DEFAULT_PHYSICAL_WHEEL_VISIBILITY_ID, VehicleUIPreferencesConstants.DEFAULT_PHYSICAL_WHEEL_VISIBILITY);		
		store.setDefault(VehicleUIPreferencesConstants.DEFAULT_LANDER_SPHERICAL_FOOT_VISIBILITY_ID, VehicleUIPreferencesConstants.DEFAULT_LANDER_SPHERICAL_FOOT_VISIBILITY);
		store.setDefault(VehicleUIPreferencesConstants.DEFAULT_THRUSTER_PLUME_ENVELOPE_VISIBILITY_ID, VehicleUIPreferencesConstants.DEFAULT_THRUSTER_PLUME_ENVELOPE_VISIBILITY);
						
		// Initialize default colors.
		PreferenceConverter.setDefault(store, VehicleUIPreferencesConstants.DEFAULT_PHYSICAL_WHEEL_COLOR_ID, VehicleUIPreferencesConstants.DEFAULT_PHYSICAL_WHEEL_COLOR);
		PreferenceConverter.setDefault(store, VehicleUIPreferencesConstants.DEFAULT_LANDER_SPHERICAL_FOOT_COLOR_ID, VehicleUIPreferencesConstants.DEFAULT_LANDER_SPHERICAL_FOOT_COLOR);
		PreferenceConverter.setDefault(store, VehicleUIPreferencesConstants.DEFAULT_THRUSTER_PLUME_ENVELOPE_COLOR_ID, VehicleUIPreferencesConstants.DEFAULT_THRUSTER_PLUME_ENVELOPE_COLOR);
		
		// Initialize others
		store.setDefault(VehicleUIPreferencesConstants.DEFAULT_THRUSTER_PLUME_ENVELOPE_LENGTH_ID, VehicleUIPreferencesConstants.DEFAULT_THRUSTER_PLUME_ENVELOPE_LENGTH);
		
	}
}
