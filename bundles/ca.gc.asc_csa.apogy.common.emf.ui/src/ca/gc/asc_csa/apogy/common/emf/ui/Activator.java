package ca.gc.asc_csa.apogy.common.emf.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.measure.unit.Unit;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.RGB;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.Ranges;
import ca.gc.asc_csa.apogy.common.emf.TimeSource;
import ca.gc.asc_csa.apogy.common.emf.ui.preferences.PreferencesConstants;
import ca.gc.asc_csa.apogy.common.emf.ui.utils.TimeSourceCompositeProviderFactory;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin 
{
	private Map<Ranges, RGB> rangesToRGBColorMap;
	
	private Map<String, String> nativeToDisplayUnitsMap;
	
	private IPropertyChangeListener preferencesListener = null;
	
	// The plug-in ID
	public static final String ID = "ca.gc.asc_csa.apogy.common.emf.ui"; //$NON-NLS-1$

	private static final String TIME_SOURCE_COMPOSITE_PROVIDER_POINT_ID = "ca.gc.asc_csa.apogy.common.emf.ui.timeSourceCompositeProvider";
	private static final String TIME_SOURCE_COMPOSITE_PROVIDER_POINT_ID_CLASS = "Class";
	
	// The Bundle Context
	private static BundleContext bundleContext;
	
	// The shared instance
	private static Activator instance;
		
	
	private TimeSourceCompositeProviderFactory timeSourceCompositeProviderFactory = null;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault()
	{
		return instance;
	}

	public static BundleContext getBundleContext() {
		return bundleContext;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception 
	{
		super.start(context);
		bundleContext = context;
		instance = this;
		
		// Registers a listener to the properties used to keep up to date the Ranges color Map.
		getPreferenceStore().addPropertyChangeListener(getPreferencesListener());
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception 
	{
		// Unregisters a listener to the properties used to keep up to date the Ranges color Map.
		getPreferenceStore().removePropertyChangeListener(getPreferencesListener());
		
		instance = null;
		bundleContext = null;
		super.stop(context);
	}
		
	/**
	 * Return the color associated with the given Range
	 * @param range The Range.
	 * @return The color associated to the range as defined in the Preferences, can be null.
	 */
	public Color getRangeColor(final Ranges range, final Device device)
	{
		RGB rgb = getRangeToRBGMap().get(range);
		
		if(rgb != null)
		{
			return new Color(device, rgb.red, rgb.green, rgb.blue);
		}
		else
		{
			return null;
		}
	}
	
	public Unit<?> getDisplayUnit(ETypedElement eTypedElement)
	{
		Unit<?> displayUnits = getETypedElementSpecificUnit(eTypedElement);
		
		// If no ETypedElement specific unit have been define, use the defaults. 
		if(displayUnits == null)
		{
			Unit<?> nativeUnits = ApogyCommonEMFFacade.INSTANCE.getEngineeringUnits(eTypedElement);
			displayUnits = getDefaultDisplayUnits(nativeUnits);
		}
	
		return displayUnits;
	}
	
	public Unit<?> getDefaultDisplayUnits(Unit<?> nativeUnit)
	{
		Unit<?> displayUnits = null;
	
		String displayUnitAsString = getNativeToDisplayUnitsMap().get(nativeUnit.toString());
		
		try
		{
			displayUnits = Unit.valueOf(displayUnitAsString);
		}
		catch(Throwable t)
		{			
		}
		
		return displayUnits;
	}
	
	public Unit<?> getETypedElementSpecificUnit(ETypedElement eTypedElement)
	{
		// TODO
		return null;
	}
	
	private  Map<Ranges, RGB> getRangeToRBGMap()
	{
		if(rangesToRGBColorMap == null)
		{
			rangesToRGBColorMap = new HashMap<Ranges, RGB>();
			initializeRangeToRBGMap(rangesToRGBColorMap);
		}
		
		return rangesToRGBColorMap;
	}
	
	private void initializeRangeToRBGMap(Map<Ranges, RGB> map)
	{
		map.clear();
		
		// Fills the table.
		for(Ranges range : Ranges.VALUES)
		{
			RGB rgb = getRGBFromPreference(range);
			if(rgb != null) map.put(range, rgb);			
		}
	}
	
	/**
	 * Return the color associated with the Ranges. This implementation support null colors.
	 * @param range The range.
	 * @return The RGB color associated with the range, can be null.
	 */
	private RGB getRGBFromPreference(Ranges range)	
	{		
		String value = getPreferenceStore().getString(range.getName());

		if (IPreferenceStore.STRING_DEFAULT_DEFAULT.equals(value)) 
		{
			return null;
		}
		else
		{
			return StringConverter.asRGB(value, null);
		}        
	}
	
	public Map<String, String> getNativeToDisplayUnitsMap() 
	{
		if(nativeToDisplayUnitsMap == null)
		{
			nativeToDisplayUnitsMap = new HashMap<String, String>();
			initializeNativeToDisplayUnitsMap(nativeToDisplayUnitsMap);			
		}
		return nativeToDisplayUnitsMap;
	}
	
	/**
	 * Returns the list of TimeSourceCompositeProvider that have registered to the extension point.
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public List<TimeSourceCompositeProvider> getRegisteredTimeSourceCompositeProvider() 
	{
		List<TimeSourceCompositeProvider> adapters = new ArrayList<TimeSourceCompositeProvider>();

		IExtensionPoint extensionPoint = Platform.getExtensionRegistry().getExtensionPoint(TIME_SOURCE_COMPOSITE_PROVIDER_POINT_ID);

		IConfigurationElement[] contributors = extensionPoint.getConfigurationElements();

		for (int i = 0; i < contributors.length; i++) 
		{
			IConfigurationElement contributor = contributors[i];

			try 
			{
				TimeSourceCompositeProvider adapter = (TimeSourceCompositeProvider) contributor.createExecutableExtension(TIME_SOURCE_COMPOSITE_PROVIDER_POINT_ID_CLASS);
				adapters.add(adapter);
			} 
			catch (CoreException e) 
			{
				e.printStackTrace();
			}
		}

		Logger.INSTANCE.log(ID, this, "Found <" + adapters.size() + "> registered TimeSourceCompositeProvider.", EventSeverity.INFO);
		
		return adapters;
	}
	
	@SuppressWarnings("rawtypes")
	public TimeSourceCompositeProvider getTimeSourceCompositeProvider(TimeSource timeSource)
	{
		return getTimeSourceCompositeProviderFactory().getAdapterFor(timeSource);
	}
			
	private TimeSourceCompositeProviderFactory getTimeSourceCompositeProviderFactory() 
	{
		if(timeSourceCompositeProviderFactory == null)
		{
			timeSourceCompositeProviderFactory = new TimeSourceCompositeProviderFactory(getRegisteredTimeSourceCompositeProvider());
		}
		return timeSourceCompositeProviderFactory;
	}

	private void initializeNativeToDisplayUnitsMap(Map<String, String> map)
	{
		nativeToDisplayUnitsMap.clear();
		
		String mapAsString = getPreferenceStore().getString(PreferencesConstants.NATIVE_TO_DISPLAY_UNITS_ID);
		mapAsString = mapAsString.replace("{", "");
		mapAsString = mapAsString.replace("}", "");
		
		String[] entries = mapAsString.split(",");
		for(int i = 0; i < entries.length; i++)
		{
			try
			{
				String entry = entries[i];
				entry.trim();
				
				String[] keyValue =  entry.split("=");
				String key = keyValue[0].trim();
				String value = keyValue[1].trim();
				map.put(key, value);
			}
			catch(Exception e)
			{
				Logger.INSTANCE.log(ID, this, "Failed to parse string <" + entries[i] + "> as a Native To Display Units entry!", EventSeverity.WARNING);				
			}
		}
		Logger.INSTANCE.log(ID, this, "Succesfully loaded <" + map.size() + "> Native To Display Units entries.", EventSeverity.INFO);		
	}

	private IPropertyChangeListener getPreferencesListener()
	{
		if(preferencesListener == null)
		{
			preferencesListener = new IPropertyChangeListener() 
			{
				public void propertyChange(PropertyChangeEvent event) 
				{			
					// Update the ColorMap
					getRangeToRBGMap().clear();
					
					// Fills the table.
					initializeRangeToRBGMap(getRangeToRBGMap());
					
					// Initialize the Unit map.
					getNativeToDisplayUnitsMap().clear();
					initializeNativeToDisplayUnitsMap(getNativeToDisplayUnitsMap());
				}	
			};
		}
		
		return preferencesListener;
	}

}
