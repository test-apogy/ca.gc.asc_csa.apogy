package ca.gc.asc_csa.eclipse.emf.ecore.ui.converters;

import java.text.NumberFormat;

import javax.measure.unit.Unit;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.symphony.common.databinding.converters.AbstractNumberConverter;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;

import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcoreFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.ui.Activator;
import ca.gc.asc_csa.eclipse.emf.ecore.ui.EMFEcoreUIFacade;

public class AbstractNativeToDisplayConverter extends AbstractNumberConverter implements IPropertyChangeListener
{
	private EStructuralFeature eStructuralFeature;
	
	private Boolean unitsAreDefined = null;
	private Boolean unitsAreValid = null;
	
	private Unit<?> nativeUnit = null;
	private Unit<?> displayUnit = null;
	

	public AbstractNativeToDisplayConverter(EStructuralFeature eStructuralFeature, NumberFormat numberFormat) 
	{
		this.eStructuralFeature = eStructuralFeature;
		setNumberFormat(numberFormat);
				
		// Register for display unit changes.
		ca.gc.asc_csa.eclipse.emf.ecore.ui.Activator.getDefault().getPreferenceStore().addPropertyChangeListener(this);
	}
	
	public AbstractNativeToDisplayConverter(EStructuralFeature eStructuralFeature) 
	{	
		this(eStructuralFeature, null);
	}
	
	@Override
	public Object convert(Object fromObject) 
	{				
		if(fromObject instanceof Number)
		{						
			double nativeValue = ((Number) fromObject).doubleValue();				
			double displayedValue = nativeValue;
			
			// Converts is units are valid.
			if(areUnitsValid())
			{			
				displayedValue = getNativeUnit().getConverterTo(getDisplayUnit()).convert(nativeValue);
			}
			
			// Converts the displayedValue to String.
			if(getNumberFormat() != null)
			{				
				return getNumberFormat().format(displayedValue);
			}
			else
			{
				return Double.toString(displayedValue);
			}
		}
		return null;
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent event) 
	{
		// Reset display unit to force update next time display unit are get.
		displayUnit = null;
	}
	
	public Unit<?> getDisplayUnit()
	{
		if(displayUnit == null)
		{
			displayUnit = EMFEcoreUIFacade.INSTANCE.getDisplayUnits(eStructuralFeature);
		}
		return displayUnit;
	}
	
	public Unit<?> getNativeUnit()
	{				
		if(nativeUnit == null)
		{
			nativeUnit = EMFEcoreFacade.INSTANCE.getEngineeringUnits(eStructuralFeature);
		}
		return nativeUnit;
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
					String featureID = eStructuralFeature.getEContainingClass().getInstanceClassName() + "." + eStructuralFeature.getName();
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
	protected void finalize() throws Throwable 
	{
		// Unregister from Preference Store.
		ca.gc.asc_csa.eclipse.emf.ecore.ui.Activator.getDefault().getPreferenceStore().removePropertyChangeListener(this);
		super.finalize();
	}
	
}
