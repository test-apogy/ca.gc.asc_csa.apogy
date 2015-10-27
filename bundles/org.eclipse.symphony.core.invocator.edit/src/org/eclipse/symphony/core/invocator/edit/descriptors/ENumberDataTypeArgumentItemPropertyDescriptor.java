package org.eclipse.symphony.core.invocator.edit.descriptors;

import javax.measure.unit.Unit;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade;
import org.eclipse.symphony.common.emf.ui.Symphony__CommonEMFUIFacade;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.core.invocator.EDataTypeArgument;
import org.eclipse.symphony.core.invocator.provider.Symphony__CoreInvocatorEditPlugin;

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
				Logger.INSTANCE.log(Symphony__CoreInvocatorEditPlugin.ID, 
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
				Logger.INSTANCE.log(Symphony__CoreInvocatorEditPlugin.ID, 
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
		return Symphony__CommonEMFUIFacade.INSTANCE.getDisplayUnits(argument
				.getEParameter());
	}

	protected Unit<?> getNativeUnit(EDataTypeArgument argument) {
		return Symphony__CommonEMFFacade.INSTANCE.getEngineeringUnits(argument
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

				Logger.INSTANCE.log(Symphony__CoreInvocatorEditPlugin.ID, featureID
						+ message, EventSeverity.ERROR, e);
			}
		}

		return result;
	}
}