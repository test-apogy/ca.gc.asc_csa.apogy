/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.rover.symphony;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.examples.rover.symphony.SymphonyExampleRoverPackage
 * @generated
 */
public interface SymphonyExampleRoverFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  SymphonyExampleRoverFactory eINSTANCE = org.eclipse.symphony.examples.rover.symphony.impl.SymphonyExampleRoverFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Rover Symphony System Api Adapter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rover Symphony System Api Adapter</em>'.
	 * @generated
	 */
  RoverSymphonySystemApiAdapter createRoverSymphonySystemApiAdapter();

  /**
	 * Returns a new object of class '<em>Rover Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rover Data</em>'.
	 * @generated
	 */
	RoverData createRoverData();

		/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  SymphonyExampleRoverPackage getSymphonyExampleRoverPackage();

} //SymphonyExampleRoverFactory