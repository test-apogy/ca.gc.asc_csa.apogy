package ca.gc.asc_csa.eclipse.emf.ecore.ui.descriptors;

import javax.measure.unit.Unit;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;

import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcoreFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.ui.Activator;
import ca.gc.asc_csa.eclipse.emf.ecore.ui.EMFEcoreUIFacade;

public class AbstractUnitItemPropertyDescriptor extends ItemPropertyDescriptor 
{
	private IPropertyChangeListener preferencesListener = null;
	
	private Unit<?> nativeUnit = null;
	private Unit<?> displayUnit = null;
	
	private Boolean unitsAreDefined = null;
	private Boolean unitsAreValid = null;
	
	public AbstractUnitItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator, String displayName, String description, EStructuralFeature feature, boolean isSettable, boolean multiLine, boolean sortChoices, Object staticImage, String category, String[] filterFlags)
	{
		super(adapterFactory, resourceLocator, displayName, description, feature, isSettable, multiLine, sortChoices, staticImage, category, filterFlags);
		
		// Register a listener on the Preferences to respond to changes in display units.
		Activator.getDefault().getPreferenceStore().addPropertyChangeListener(getPreferencesListener());
	}
	
	@Override
	public void setPropertyValue(Object object, Object value) 
	{		
		Object nativeValue = value;
		
		// If native and display units are defined.
		if(areUnitsValid())
		{
			if(value instanceof Number)
			{
				try
				{
					double displayValue = ((Number) value).doubleValue();
					
					double tempNativeValue = getDisplayUnit().getConverterTo(getNativeUnit()).convert(displayValue);	
									
					if(nativeValue instanceof Byte)
					{
						nativeValue = ((Number) tempNativeValue).byteValue();
					}
					else if(nativeValue instanceof Short)
					{
						nativeValue = ((Number) tempNativeValue).shortValue();
					}
					else if(nativeValue instanceof Integer)
					{
						nativeValue = ((Number) tempNativeValue).intValue();
					}
					else if(nativeValue instanceof Long)
					{
						nativeValue = ((Number) tempNativeValue).longValue();
					}
					else if(nativeValue instanceof Float)
					{
						nativeValue = ((Number) tempNativeValue).floatValue();
					}
					else if(nativeValue instanceof Double)
					{
						nativeValue = ((Number) tempNativeValue).doubleValue();
					}
				}
				catch(Throwable t)
				{
					String featureID = feature.getEContainingClass().getInstanceClassName() + "." + feature.getName();
					Logger.INSTANCE.log(Activator.ID, this, featureID + " : Failed to convert from display units to native units !", EventSeverity.ERROR, t);
				}
			}
		}
		
		super.setPropertyValue(object, nativeValue);
	}
	
	@Override
	public String getDisplayName(Object object) 
	{
		String displayName = super.getDisplayName(object);
		
		if(areUnitsValid())
		{
			displayName = displayName + " (" + getDisplayUnit().toString() + ")";
		}
		
		return displayName;
	}
	
	public boolean areUnitsDefined()
	{
		if(unitsAreDefined == null)
		{
			unitsAreDefined = new Boolean(getNativeUnit() != null && getDisplayUnit() != null);			
		}
		
		return unitsAreDefined.booleanValue();
	}
	
	public boolean areUnitsValid()
	{
		if(unitsAreValid == null)
		{
			unitsAreValid = new Boolean(false);
			
			if(areUnitsDefined())
			{
				try
				{
					getNativeUnit().getConverterTo(getDisplayUnit());
					unitsAreValid = true;
				}
				catch(Throwable e)
				{			
					String featureID = feature.getEContainingClass().getInstanceClassName() + "." + feature.getName();
					String message = "Invalid Units for feature <" + featureID + "> : Display Unit <" + 
									  getDisplayUnit().toString() + "> is not compatible with Native Unit <" + 
									  getNativeUnit().toString() + "> !";
					
					Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR, e);
				}
			}	
		}
		
		return unitsAreValid.booleanValue();
	}
	
	@Override
	protected Object getValue(EObject object, EStructuralFeature feature) 
	{		
		// If native and display units are defined.
		if(areUnitsValid())
		{
			try
			{
				// Return the value converted to the display unit.
				Object value = super.getValue(object, feature);
				if(value instanceof Number)
				{						
					double nativeValue = ((Number) value).doubleValue();
					double displayValue = getNativeUnit().getConverterTo(getDisplayUnit()).convert(nativeValue);
					return Double.toString(displayValue);
				}
			}
			catch(Throwable t)
			{
				String featureID = feature.getEContainingClass().getInstanceClassName() + "." + feature.getName();
				Logger.INSTANCE.log(Activator.ID, this, featureID + " : Failed to convert from native units to display units !", EventSeverity.ERROR, t);
			}
		}
		
		return super.getValue(object, feature);
	}
	
	protected Unit<?> getDisplayUnit()
	{
		if(displayUnit == null)
		{
			displayUnit = EMFEcoreUIFacade.INSTANCE.getDisplayUnits(feature);
		}
		return displayUnit;
	}
	
	protected Unit<?> getNativeUnit()
	{				
		if(nativeUnit == null)
		{
			nativeUnit = EMFEcoreFacade.INSTANCE.getEngineeringUnits(feature);
		}
		return nativeUnit;
	}
	
	private IPropertyChangeListener getPreferencesListener()
	{
		if(preferencesListener == null)
		{
			preferencesListener = new IPropertyChangeListener() 
			{
				public void propertyChange(PropertyChangeEvent event) 
				{				
					// Reset attributes to trigger resolving of display units.
					displayUnit = null;					
					unitsAreDefined = null;
					unitsAreValid = null;
				}	
			};
		}
		
		return preferencesListener;
	}
}
