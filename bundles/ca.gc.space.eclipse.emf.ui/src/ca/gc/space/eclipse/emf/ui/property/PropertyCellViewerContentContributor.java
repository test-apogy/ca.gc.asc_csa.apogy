package ca.gc.space.eclipse.emf.ui.property;

import org.eclipse.emf.ecore.EObject;

/**
 * Cell Viewer Content Contributor for {@link ExtendablePropertySheetPage}. 
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
public interface PropertyCellViewerContentContributor extends EObject {
	/**
	 * Reference to the class that uses the composite.
	 * @return Reference to the class.
	 * @model
	 * @generated
	 */
	Class<?> getTarget();

	/**
	 * Sets the value of the '{@link ca.gc.space.eclipse.emf.ui.property.PropertyCellViewerContentContributor#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Class<?> value);

	/**
	 * Reference the provider.
	 * @return Composite provider.
	 * @model
	 */	
	PropertyCellViewerContentProvider getCellViewerContentProvider();

	/**
	 * Sets the value of the '{@link ca.gc.space.eclipse.emf.ui.property.PropertyCellViewerContentContributor#getCellViewerContentProvider <em>Cell Viewer Content Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Viewer Content Provider</em>' attribute.
	 * @see #getCellViewerContentProvider()
	 * @generated
	 */
	void setCellViewerContentProvider(PropertyCellViewerContentProvider value);

}