package ca.gc.asc_csa.apogy.common.emf.databinding;

import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;

/**
 * Update strategy for EMF References that uses the IItemLabelProvider of the feature being update to create a 
 * text representation of the value.
 * @author pallard
 *
 */
public class EMFReferenceUpdateStrategy extends UpdateValueStrategy  
{
	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);	
	
	@Override
	public Object convert(Object value) 
	{			
		IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory.adapt(value, IItemLabelProvider.class);
		
		if(labelProvider != null)
		{
			return labelProvider.getText(value);
		}	
		else
		{
			return "";
		}								
	}

}
