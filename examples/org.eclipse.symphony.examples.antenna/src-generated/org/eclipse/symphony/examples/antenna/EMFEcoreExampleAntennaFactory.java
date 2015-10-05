/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.antenna;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.examples.antenna.EMFEcoreExampleAntennaPackage
 * @generated
 */
public interface EMFEcoreExampleAntennaFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EMFEcoreExampleAntennaFactory eINSTANCE = org.eclipse.symphony.examples.antenna.impl.EMFEcoreExampleAntennaFactoryImpl.init();

	/**
	 * Returns a new PTUDishAntenna object, which has the same type as
	 * the given PTU dish antenna.
	 * 
	 * @param ptuDishAntenna The PTU dish antenna with a particular implementation. 
	 * @return The new power system, which has the same type as the old one
	 * @generated_NOT
	 */
	PTUDishAntenna makePTUDishAntennaSameType(PTUDishAntenna ptuDishAntenna);
	
	/**
	 * Returns a new object of class '<em>PTU Dish Antenna Stub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PTU Dish Antenna Stub</em>'.
	 * @generated
	 */
	PTUDishAntennaStub createPTUDishAntennaStub();

	/**
	 * Returns a new object of class '<em>PTU Dish Antenna Simulated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PTU Dish Antenna Simulated</em>'.
	 * @generated
	 */
	PTUDishAntennaSimulated createPTUDishAntennaSimulated();
	
	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EMFEcoreExampleAntennaPackage getEMFEcoreExampleAntennaPackage();

} //EMFEcoreExampleAntennaFactory
