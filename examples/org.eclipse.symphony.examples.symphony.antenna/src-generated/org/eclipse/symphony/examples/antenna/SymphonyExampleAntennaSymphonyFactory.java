/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.antenna;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.examples.antenna.SymphonyExampleAntennaSymphonyPackage
 * @generated
 */
public interface SymphonyExampleAntennaSymphonyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SymphonyExampleAntennaSymphonyFactory eINSTANCE = org.eclipse.symphony.examples.antenna.impl.SymphonyExampleAntennaSymphonyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>PTU Dish Antenna Symphony System Api Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PTU Dish Antenna Symphony System Api Adapter</em>'.
	 * @generated
	 */
	PTUDishAntennaSymphonySystemApiAdapter createPTUDishAntennaSymphonySystemApiAdapter();

	/**
	 * Returns a new object of class '<em>PTU Dish Antenna Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PTU Dish Antenna Data</em>'.
	 * @generated
	 */
	PTUDishAntennaData createPTUDishAntennaData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SymphonyExampleAntennaSymphonyPackage getSymphonyExampleAntennaSymphonyPackage();

} //SymphonyExampleAntennaSymphonyFactory
