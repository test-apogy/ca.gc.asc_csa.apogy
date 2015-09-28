package ca.gc.space.eclipse.emf.edit.providers.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * Property Item Container.
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
public class PropertyItem {
	private IItemPropertyDescriptor itemPropertyDescriptor;
	private EObject item;

	/** Null Property Item. */
	public static PropertyItem NULL = new PropertyItem(null, null);
	
	/**
	 * Creates a property item.
	 * @param item Item that contains the property values (owner).
	 * @param property_descriptor Property descriptor.
	 */
	public PropertyItem(EObject item, IItemPropertyDescriptor property_descriptor) {
		this.item = item;
		itemPropertyDescriptor = property_descriptor;
	}
	
	/** 
	 * Returns the property descriptor. 
	 * @return property descriptor.
	 */
	IItemPropertyDescriptor getItemPropertyDescriptor(){
		return itemPropertyDescriptor;
	}
	
	/**
	 * Returns the item that contains the property values (owner). 
	 * @return Reference to the item.
	 */
	EObject getItem(){
		return item;
	}
}