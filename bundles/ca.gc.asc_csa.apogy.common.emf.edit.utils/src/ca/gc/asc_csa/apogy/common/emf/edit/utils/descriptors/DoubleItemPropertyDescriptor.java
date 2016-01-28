package org.eclipse.symphony.common.emf.edit.utils.descriptors;

import java.text.NumberFormat;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

public class DoubleItemPropertyDescriptor extends ItemPropertyDescriptor
{

	public DoubleItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator, String displayName, String description, EStructuralFeature feature, boolean isSettable, boolean multiLine, boolean sortChoices, Object staticImage, String category, String[] filterFlags)
	{
		super(adapterFactory, resourceLocator, displayName, description, feature, isSettable, multiLine, sortChoices, staticImage, category, filterFlags);
	}

	@Override
	protected Object getValue(EObject object, EStructuralFeature feature)
	{

		if (object != null)
		{
			NumberFormat formatter = NumberFormat.getInstance();
			Double value = (Double) super.getValue(object, feature);
			
			if (value != null)
			{
				return formatter.format(value);
			} else
			{
				return value;
			}
		} else
		{
			return super.getValue(object, feature);
		}
	}

}