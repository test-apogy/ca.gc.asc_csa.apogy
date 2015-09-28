package ca.gc.space.eclipse.emf.ui.property;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * List of {@link PropertyCellViewerContentContributor}.
 * 
 * <PRE>
 * 
 * CSA Eclipse EMF UI Utilities. 
 * Canadian Space Agency / Agence spatiale canadienne
 * 6767 route de l'Aeroport
 * St-Hubert, Quebec, Canada
 * J3Y 8Y9
 * www.space.gc.ca
 * Copyrights (c)
 * </PRE> 
 * @model
 */
public interface PropertyCellViewerContentContributors extends EObject {
	/**
	 * Returns the list of contributors.
	 * @return List of contributors.
	 * @model type="PropertyCellViewerContentContributor"
	 */
	EList<PropertyCellViewerContentContributor> getList();
	
	/**
	 * Returns the contributor that adapts the specified type.
	 * @param type Reference to the class.
	 * @return Reference to the contributor or null if there is
	 * no contributor adapting the class type.
	 */
	PropertyCellViewerContentContributor adapt(Class<?> type);
}