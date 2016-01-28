/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.antenna.symphony;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.examples.antenna.symphony.Symphony__ExamplesAntennaSymphonyPackage
 * @generated
 */
public interface Symphony__ExamplesAntennaSymphonyFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  Symphony__ExamplesAntennaSymphonyFactory eINSTANCE = org.eclipse.symphony.examples.antenna.symphony.impl.Symphony__ExamplesAntennaSymphonyFactoryImpl.init();

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
	Symphony__ExamplesAntennaSymphonyPackage getSymphony__ExamplesAntennaSymphonyPackage();

} //Symphony__ExamplesAntennaSymphonyFactory
