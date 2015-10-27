/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.rover;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.examples.rover.Symphony__ExamplesRoverPackage
 * @generated
 */
public interface Symphony__ExamplesRoverFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__ExamplesRoverFactory eINSTANCE = org.eclipse.symphony.examples.rover.impl.Symphony__ExamplesRoverFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Battery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Battery</em>'.
	 * @generated
	 */
	Battery createBattery();

	/**
	 * Returns a new object of class '<em>Power System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power System</em>'.
	 * @generated
	 */
	PowerSystem createPowerSystem();

	/**
	 * Returns a new Rover object, which has the same type as
	 * the given rover arm.
	 * 
	 * @param rover The rover with a particular implementation. 
	 * @return The new rover, which has the same type as the old one
	 * @generated_NOT
	 */
	Rover makeRoverSameType(Rover rover);

	/**
	 * Returns a new object of class '<em>Rover Stub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rover Stub</em>'.
	 * @generated
	 */
	RoverStub createRoverStub();

	/**
	 * Returns a new object of class '<em>Rover Simulated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rover Simulated</em>'.
	 * @generated
	 */
	RoverSimulated createRoverSimulated();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Symphony__ExamplesRoverPackage getSymphony__ExamplesRoverPackage();

} //Symphony__ExamplesRoverFactory
