package org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property;

import org.eclipse.emf.ecore.EObject;

/**
 * Cell Editor Contributor for {@link ExtendablePropertySheetPage}. 
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
public interface PropertyCellEditorContributor extends EObject {
	/**
	 * Reference to the class that uses the editor.
	 * @return Reference to the reference.
	 * @model
	 */
	Class<?> getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.PropertyCellEditorContributor#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Class<?> value);

	/**
	 * Reference the editor.
	 * @return Cell editor.
	 * @model
	 */	
	PropertyCellEditorProvider getCellEditorProvider();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.PropertyCellEditorContributor#getCellEditorProvider <em>Cell Editor Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Editor Provider</em>' attribute.
	 * @see #getCellEditorProvider()
	 * @generated
	 */
	void setCellEditorProvider(PropertyCellEditorProvider value);
}