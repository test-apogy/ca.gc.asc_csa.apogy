/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.symphony.examples.lander;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.symphony.examples.lander.SymphonyExampleLanderPackage
 * @generated
 */
public interface SymphonyExampleLanderFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  SymphonyExampleLanderFactory eINSTANCE = ca.gc.asc_csa.symphony.examples.lander.impl.SymphonyExampleLanderFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Lander Symphony System Api Adapter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lander Symphony System Api Adapter</em>'.
	 * @generated
	 */
  LanderSymphonySystemApiAdapter createLanderSymphonySystemApiAdapter();

  /**
	 * Returns a new object of class '<em>Lander Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lander Data</em>'.
	 * @generated
	 */
	LanderData createLanderData();

		/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  SymphonyExampleLanderPackage getSymphonyExampleLanderPackage();

} //SymphonyExampleLanderFactory
