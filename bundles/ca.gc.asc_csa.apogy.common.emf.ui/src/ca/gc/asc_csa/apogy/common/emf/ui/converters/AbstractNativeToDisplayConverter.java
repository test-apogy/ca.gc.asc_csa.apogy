package ca.gc.asc_csa.apogy.common.emf.ui.converters;
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

import java.text.NumberFormat;

import javax.measure.unit.Unit;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import ca.gc.asc_csa.apogy.common.databinding.converters.AbstractNumberConverter;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.Activator;
import ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIFacade;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;

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
		ca.gc.asc_csa.apogy.common.emf.ui.Activator.getDefault().getPreferenceStore().addPropertyChangeListener(this);
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
			displayUnit = ApogyCommonEMFUIFacade.INSTANCE.getDisplayUnits(eStructuralFeature);
		}
		return displayUnit;
	}
	
	public Unit<?> getNativeUnit()
	{				
		if(nativeUnit == null)
		{
			nativeUnit = ApogyCommonEMFFacade.INSTANCE.getEngineeringUnits(eStructuralFeature);
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
		ca.gc.asc_csa.apogy.common.emf.ui.Activator.getDefault().getPreferenceStore().removePropertyChangeListener(this);
		super.finalize();
	}
	
}
