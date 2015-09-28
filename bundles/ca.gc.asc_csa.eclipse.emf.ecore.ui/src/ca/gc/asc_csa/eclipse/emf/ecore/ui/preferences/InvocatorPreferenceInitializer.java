package ca.gc.asc_csa.eclipse.emf.ecore.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.graphics.RGB;

import ca.gc.asc_csa.eclipse.emf.ecore.Ranges;
import ca.gc.asc_csa.eclipse.emf.ecore.ui.Activator;


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
