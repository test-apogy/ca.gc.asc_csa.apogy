/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.apogy.examples.rover.apogy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.examples.rover.apogy.ApogyExamplesRoverApogyPackage
 * @generated
 */
public interface ApogyExamplesRoverApogyFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyExamplesRoverApogyFactory eINSTANCE = ca.gc.asc_csa.apogy.examples.rover.apogy.impl.ApogyExamplesRoverApogyFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Rover Apogy System Api Adapter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rover Apogy System Api Adapter</em>'.
	 * @generated
	 */
  RoverApogySystemApiAdapter createRoverApogySystemApiAdapter();

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
	ApogyExamplesRoverApogyPackage getApogyExamplesRoverApogyPackage();

} //ApogyExamplesRoverApogyFactory
