package ca.gc.space.eclipse.emf.edit.providers.impl;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import ca.gc.space.eclipse.emf.edit.providers.EMFPropertiesLabelProvider;

/**
 * Default Implementation of {@link EMFPropertiesLabelProvider}.
 * 
 * <PRE>
 * 
 * Eclipse EMF Utilities.
 * Canadian Space Agency / Agence spatiale canadienne
 * 6767 route de l'Aeroport
 * St-Hubert, Quebec, Canada
 * J3Y 8Y9
 * www.space.gc.ca
 * Copyrights (c)
 * </PRE> 
 */
public class DefaultEMFPropertiesLabelProvider implements
		EMFPropertiesLabelProvider {

	private AdapterFactory factory;

	/**
	 * Creates an EMF Properties Label Provider.
	 * @param factory Reference to the EMF factory.
	 */
	public DefaultEMFPropertiesLabelProvider(AdapterFactory factory) {
		this.factory = factory;
	}
	
	/* (non-Javadoc)
	 * @see csa.eclipse.emf.edit.EMFPropertiesProvider#getFactory()
	 */
	public AdapterFactory getFactory() {
		return factory;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnImage(java.lang.Object, int)
	 */
	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnText(java.lang.Object, int)
	 */
	public String getColumnText(Object element, int columnIndex) {		
		String result = "error";
		
		PropertyItem property_item = (PropertyItem) element;
		
		if (property_item == PropertyItem.NULL){
			switch (columnIndex){
			case 0:
				result = "No Property Included";
				break;
			case 1:
				result = "No Property Included";
				break;
			}
		}else{
		
			IItemPropertyDescriptor descriptor = property_item.getItemPropertyDescriptor();
			EObject item = property_item.getItem(); 
				
			switch (columnIndex){
			case 0:
				result = descriptor.getDisplayName(property_item.getItem());
				break;
			case 1:
				Object value = descriptor.getPropertyValue(item);			
				result = ((IItemLabelProvider)getFactory().adapt(value, IItemLabelProvider.class)).getText(value);
				break;
			}
		}
		
		return result;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#addListener(org.eclipse.jface.viewers.ILabelProviderListener)
	 */
	public void addListener(ILabelProviderListener listener) {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#dispose()
	 */
	public void dispose() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#isLabelProperty(java.lang.Object, java.lang.String)
	 */
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#removeListener(org.eclipse.jface.viewers.ILabelProviderListener)
	 */
	public void removeListener(ILabelProviderListener listener) {
	}
}