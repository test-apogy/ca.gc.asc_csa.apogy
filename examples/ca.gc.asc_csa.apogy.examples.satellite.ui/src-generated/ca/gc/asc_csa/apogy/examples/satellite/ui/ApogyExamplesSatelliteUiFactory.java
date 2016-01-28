/**
 * Canadian Space Agency / Agence spatiale canadienne 2015-2016 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.examples.satellite.ui.Symphony__ExamplesSatelliteUiPackage
 * @generated
 */
public interface Symphony__ExamplesSatelliteUiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__ExamplesSatelliteUiFactory eINSTANCE = org.eclipse.symphony.examples.satellite.ui.impl.Symphony__ExamplesSatelliteUiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	Symphony__ExamplesSatelliteUiFacade createSymphony__ExamplesSatelliteUiFacade();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Symphony__ExamplesSatelliteUiPackage getSymphony__ExamplesSatelliteUiPackage();

} //Symphony__ExamplesSatelliteUiFactory
