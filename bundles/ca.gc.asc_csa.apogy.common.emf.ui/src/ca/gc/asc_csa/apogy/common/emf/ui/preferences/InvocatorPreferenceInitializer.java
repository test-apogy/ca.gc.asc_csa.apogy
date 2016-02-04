package ca.gc.asc_csa.apogy.common.emf.ui.preferences;
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
import org.eclipse.swt.graphics.RGB;
import ca.gc.asc_csa.apogy.common.emf.Ranges;
import ca.gc.asc_csa.apogy.common.emf.ui.Activator;


public class InvocatorPreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() 
	{			
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		// Initialize range color.
		for(Ranges range : Ranges.VALUES)
		{
			switch(range.getValue())
			{
				case Ranges.UNKNOWN_VALUE:					
					PreferenceConverter.setDefault(store, Ranges.UNKNOWN.getName(), PreferencesConstants.DEFAULT_UNKNOWN_COLOR);
				break;			
				case Ranges.NOMINAL_VALUE:
					if(PreferencesConstants.DEFAULT_NOMINAL_COLOR != null) 
					{
						PreferenceConverter.setDefault(store, Ranges.NOMINAL.getName(), PreferencesConstants.DEFAULT_NOMINAL_COLOR);
					}
					else
					{
						store.putValue(Ranges.NOMINAL.getName(), "");
					}
				break;			
				case Ranges.WARNING_VALUE:
					if(PreferencesConstants.DEFAULT_WARNING_COLOR != null) 
					{
						PreferenceConverter.setDefault(store, Ranges.WARNING.getName(), PreferencesConstants.DEFAULT_WARNING_COLOR);
					}
					else
					{
						store.putValue(Ranges.WARNING.getName(), "");
					}
				break;			
				case Ranges.ALARM_VALUE:
					if(PreferencesConstants.DEFAULT_ALARM_COLOR != null)
					{
						PreferenceConverter.setDefault(store, Ranges.ALARM.getName(), PreferencesConstants.DEFAULT_ALARM_COLOR);
					}
					else
					{
						store.putValue(Ranges.ALARM.getName(), "");
					}
				break;
				case Ranges.OUT_OF_RANGE_VALUE:
					if(PreferencesConstants.DEFAULT_OUT_OF_RANGE_COLOR != null)
					{
						PreferenceConverter.setDefault(store, Ranges.OUT_OF_RANGE.getName(), PreferencesConstants.DEFAULT_OUT_OF_RANGE_COLOR);
					}
					else
					{
						store.putValue(Ranges.OUT_OF_RANGE.getName(), "");
					}
				break;
				default:
					PreferenceConverter.setDefault(store, range.getName(), new RGB(255,255,255));
				break;
			}												
		}
		
		// Initiliaze Native to Display Unit map.
		store.setDefault(PreferencesConstants.NATIVE_TO_DISPLAY_UNITS_ID, PreferencesConstants.DEFAULT_NATIVE_TO_DISPLAY_UNITS);
	}
}
