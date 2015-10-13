/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.EmfUiPropertyPackage
 * @generated
 */
public interface EmfUiPropertyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmfUiPropertyFactory eINSTANCE = org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.impl.EmfUiPropertyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Property Cell Editor Contributor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Cell Editor Contributor</em>'.
	 * @generated
	 */
	PropertyCellEditorContributor createPropertyCellEditorContributor();

	/**
	 * Returns a new object of class '<em>Property Cell Editor Contributors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Cell Editor Contributors</em>'.
	 * @generated
	 */
	PropertyCellEditorContributors createPropertyCellEditorContributors();

	/**
	 * Returns a new object of class '<em>Property Cell Viewer Content Contributor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Cell Viewer Content Contributor</em>'.
	 * @generated
	 */
	PropertyCellViewerContentContributor createPropertyCellViewerContentContributor();

	/**
	 * Returns a new object of class '<em>Property Cell Viewer Content Contributors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Cell Viewer Content Contributors</em>'.
	 * @generated
	 */
	PropertyCellViewerContentContributors createPropertyCellViewerContentContributors();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EmfUiPropertyPackage getEmfUiPropertyPackage();

} //EmfUiPropertyFactory
