package ca.gc.asc_csa.apogy.core.invocator.edit.descriptors;
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

import javax.measure.unit.Unit;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIFacade;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.core.invocator.EDataTypeArgument;
import ca.gc.asc_csa.apogy.core.invocator.provider.ApogyCoreInvocatorEditPlugin;

public class ENumberDataTypeArgumentItemPropertyDescriptor extends
		ItemPropertyDescriptor {

	public ENumberDataTypeArgumentItemPropertyDescriptor(
			AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, boolean multiLine, boolean sortChoices,
			Object staticImage, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
	}

	@Override
	public void setPropertyValue(Object object, Object value) {
		
		
		/** 
		 * Get the display value. 
		 */
		double displayValue = 0; 
		
		try {
			displayValue = Double.parseDouble((String) value);	
		} catch (Exception e) {
			return;
		}
		double nativeValue = displayValue;

		/**
		 * Check if we need to convert the value. 
		 */
		EDataTypeArgument argument = (EDataTypeArgument) object;
		if (areUnitsValid(argument)) {
			try {
				nativeValue = getDisplayUnit(argument).getConverterTo(
						getNativeUnit(argument)).convert(displayValue);

			} catch (Throwable t) {
				String featureID = feature.getEContainingClass()
						.getInstanceClassName() + "." + feature.getName();
				Logger.INSTANCE.log(ApogyCoreInvocatorEditPlugin.ID, 
								this,
								featureID
										+ " : Failed to convert from display units to native units !",
								EventSeverity.ERROR, t);
			}
		} 
		
		Class<?> clazz = argument.getEParameter().getEGenericType()
				.getEClassifier().getInstanceClass();
		
		String str_value = "";
		if (clazz.isAssignableFrom(byte.class)) {
			str_value = Byte.toString(((Number) nativeValue).byteValue());
		} else if (clazz.isAssignableFrom(short.class)) {
			str_value = Short.toString(((Number) nativeValue).shortValue());
		} else if (clazz.isAssignableFrom(int.class)) {
			str_value = Integer.toString(((Number) nativeValue).intValue());
		} else if (clazz.isAssignableFrom(long.class)) {
			str_value = Long.toString(((Number) nativeValue).longValue());
		} else if (clazz.isAssignableFrom(float.class)) {
			str_value = Float.toString(((Number) nativeValue).floatValue());
		} else if (clazz.isAssignableFrom(double.class)) {
			str_value = Double.toString(((Number) nativeValue).doubleValue());
		}
		super.setPropertyValue(object, str_value);		
	}

	@Override
	protected Object getValue(EObject object, EStructuralFeature feature) {
		// If native and display units are defined.
		if (areUnitsValid((EDataTypeArgument) object)) {
			EDataTypeArgument argument = (EDataTypeArgument) object;
			try {
				// Return the value converted to the display unit.
				String str_value = (String) super.getValue(object, feature);
				double nativeValue = Double.parseDouble(str_value);
				double displayValue = getNativeUnit(argument).getConverterTo(
						getDisplayUnit(argument)).convert(nativeValue);
				return Double.toString(displayValue);
			} catch (Throwable t) {
				String featureID = feature.getEContainingClass()
						.getInstanceClassName() + "." + feature.getName();
				Logger.INSTANCE.log(ApogyCoreInvocatorEditPlugin.ID, 
								this,
								featureID
										+ " : Failed to convert from native units to display units !",
								EventSeverity.ERROR, t);
			}
		}

		return super.getValue(object, feature);
	}

	@Override
	public String getDisplayName(Object object) {
		EDataTypeArgument argument = (EDataTypeArgument) object;

		String displayName = argument.getEParameter().getName();

		if (areUnitsValid(argument)) {
			displayName = displayName + " ("
					+ getDisplayUnit(argument).toString() + ")";
		}

		return displayName;
	}

	protected Unit<?> getDisplayUnit(EDataTypeArgument argument) {
		return ApogyCommonEMFUIFacade.INSTANCE.getDisplayUnits(argument
				.getEParameter());
	}

	protected Unit<?> getNativeUnit(EDataTypeArgument argument) {
		return ApogyCommonEMFFacade.INSTANCE.getEngineeringUnits(argument
				.getEParameter());
	}

	public boolean areUnitsDefined(EDataTypeArgument argument) {
		return (getNativeUnit(argument) != null && getDisplayUnit(argument) != null);
	}

	public boolean areUnitsValid(EDataTypeArgument argument) {
		boolean result = false;
		if (areUnitsDefined(argument)) {
			try {
				getNativeUnit(argument)
						.getConverterTo(getDisplayUnit(argument));
				result = true;
			} catch (Throwable e) {
				String featureID = feature.getEContainingClass()
						.getInstanceClassName() + "." + feature.getName();
				String message = "Invalid Units for feature <" + featureID
						+ "> : Display Unit <"
						+ getDisplayUnit(argument).toString()
						+ "> is not compatible with Native Unit <"
						+ getNativeUnit(argument).toString() + "> !";

				Logger.INSTANCE.log(ApogyCoreInvocatorEditPlugin.ID, featureID
						+ message, EventSeverity.ERROR, e);
			}
		}

		return result;
	}
}