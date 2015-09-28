package ca.gc.space.eclipse.emf.edit.providers;

import org.eclipse.emf.common.notify.AdapterFactory;

/**
 * Super interface that wraps-up {@link AdapterFactory}. 
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
public interface EMFPropertiesProvider {
	/**
	 * Returns the factory that provides adapter to the 
	 * current provider.
	 * @return Factory.
	 */
	AdapterFactory getFactory();
}