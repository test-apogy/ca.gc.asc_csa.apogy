/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package ca.gc.asc_csa.apogy.examples.antenna;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.examples.antenna.ApogyExamplesAntennaPackage
 * @generated
 */
public interface ApogyExamplesAntennaFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyExamplesAntennaFactory eINSTANCE = ca.gc.asc_csa.apogy.examples.antenna.impl.ApogyExamplesAntennaFactoryImpl.init();

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
	ApogyExamplesAntennaPackage getApogyExamplesAntennaPackage();

} //ApogyExamplesAntennaFactory
