/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015-2016
 */
package org.eclipse.symphony.examples.satellite.symphony;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.examples.satellite.symphony.Symphony__ExamplesSatelliteSymphonyPackage
 * @generated
 */
public interface Symphony__ExamplesSatelliteSymphonyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__ExamplesSatelliteSymphonyFactory eINSTANCE = org.eclipse.symphony.examples.satellite.symphony.impl.Symphony__ExamplesSatelliteSymphonyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Constellation System Api Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constellation System Api Adapter</em>'.
	 * @generated
	 */
	ConstellationSystemApiAdapter createConstellationSystemApiAdapter();

	/**
	 * Returns a new object of class '<em>Constellation Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constellation Data</em>'.
	 * @generated
	 */
	ConstellationData createConstellationData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Symphony__ExamplesSatelliteSymphonyPackage getSymphony__ExamplesSatelliteSymphonyPackage();

} //Symphony__ExamplesSatelliteSymphonyFactory
