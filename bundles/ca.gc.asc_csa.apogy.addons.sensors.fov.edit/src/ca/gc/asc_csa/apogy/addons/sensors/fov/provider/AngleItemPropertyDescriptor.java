package ca.gc.asc_csa.apogy.addons.sensors.fov.provider;

import java.text.NumberFormat;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

/**
 * ItemPropertyDescriptor used to provide UI with display and parsing of angles in degrees.
 * @author pallard
 *
 */
public class AngleItemPropertyDescriptor extends ItemPropertyDescriptor {

	public AngleItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator, String displayName, String description, EStructuralFeature feature, boolean isSettable, boolean multiLine, boolean sortChoices, Object staticImage, String category, String[] filterFlags)
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
				return formatter.format(Math.toDegrees(value));
			} 
			else
			{
				return value;
			}
		} 
		else
		{
			return super.getValue(object, feature);
		}
	}

	@Override
	public void setPropertyValue(Object object, Object value) 
	{
		if(value instanceof Double)
		{			
			Double valueInRadians = new Double(Math.toRadians(((Double) value).doubleValue()));
			super.setPropertyValue(object, valueInRadians);
		}
		else
		{				
			super.setPropertyValue(object, value);
		}
	}
}
