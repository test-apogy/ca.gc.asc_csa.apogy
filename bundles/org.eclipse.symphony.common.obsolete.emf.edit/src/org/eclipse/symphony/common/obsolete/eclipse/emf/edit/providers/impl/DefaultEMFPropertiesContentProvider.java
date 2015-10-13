package org.eclipse.symphony.common.obsolete.eclipse.emf.edit.providers.impl;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.symphony.common.obsolete.eclipse.emf.edit.providers.EMFPropertiesContentProvider;

/**
 * Default implementation of {@link EMFPropertiesContentProvider}.
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
public class DefaultEMFPropertiesContentProvider implements
		EMFPropertiesContentProvider {

	private AdapterFactory factory;
	
	/**
	 * Creates a default EMF properties content provider.
	 * @param factory Reference to the factory that provides 
     * EMF adapters. 
	 */
	public DefaultEMFPropertiesContentProvider(AdapterFactory factory) {
		this.factory = factory;
	}
	
	/* (non-Javadoc)
	 * @see csa.eclipse.emf.edit.EMFPropertiesProvider#getFactory()
	 */
	public AdapterFactory getFactory() {
		return factory;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 */
	public Object[] getElements(Object inputElement) {
		if (!(inputElement instanceof EObject))
			throw new IllegalArgumentException("The element <" + inputElement + "> is not an instance of " + EObject.class.getName());		
		IItemPropertySource source = (IItemPropertySource) getFactory().adapt(inputElement, IItemPropertySource.class);		
		int property_descriptor_count = source.getPropertyDescriptors(inputElement).size();		
		Object [] result = null;
		if (property_descriptor_count > 0){
			result = new Object[property_descriptor_count];
			for (int i = 0; i < property_descriptor_count; i++){
				result[i] = new PropertyItem((EObject)inputElement, (IItemPropertyDescriptor)source.getPropertyDescriptors(inputElement).get(i));
			}
		}
		if (result == null){
			result = new Object[1];
			result[0] = PropertyItem.NULL;
		}		
		return result;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	public void dispose() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}
}