/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data25d.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.common.geometry.data25d.ui.Data25DUIPackage
 * @generated
 */
public interface Data25DUIFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Data25DUIFactory eINSTANCE = org.eclipse.symphony.common.geometry.data25d.ui.impl.Data25DUIFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Volumetric Coordinates Set25 DPresentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Volumetric Coordinates Set25 DPresentation</em>'.
	 * @generated
	 */
	VolumetricCoordinatesSet25DPresentation createVolumetricCoordinatesSet25DPresentation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Data25DUIPackage getData25DUIPackage();

} //Data25DUIFactory
