/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package ca.gc.asc_csa.apogy.examples.lander;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.examples.lander.ApogyExamplesLanderPackage
 * @generated
 */
public interface ApogyExamplesLanderFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyExamplesLanderFactory eINSTANCE = ca.gc.asc_csa.apogy.examples.lander.impl.ApogyExamplesLanderFactoryImpl.init();

	/**
	 * Returns a new Lander object, which has the same type as
	 * the given lander.
	 * 
	 * @param lander The lander with a particular implementation. 
	 * @return The new lander, which has the same type as the other one
	 * @generated_NOT
	 */
	Lander makeLanderSameType(Lander lander);
	
	/**
	 * Returns a new object of class '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position</em>'.
	 * @generated
	 */
	Position createPosition();

	/**
	 * Returns a new object of class '<em>Lander Stub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lander Stub</em>'.
	 * @generated
	 */
	LanderStub createLanderStub();

	/**
	 * Returns a new object of class '<em>Lander Simulated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lander Simulated</em>'.
	 * @generated
	 */
	LanderSimulated createLanderSimulated();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyExamplesLanderPackage getApogyExamplesLanderPackage();

} //ApogyExamplesLanderFactory
