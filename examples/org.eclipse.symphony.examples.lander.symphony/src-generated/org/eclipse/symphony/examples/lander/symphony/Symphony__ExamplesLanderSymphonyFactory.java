/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.lander.symphony;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.examples.lander.symphony.Symphony__ExamplesLanderSymphonyPackage
 * @generated
 */
public interface Symphony__ExamplesLanderSymphonyFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  Symphony__ExamplesLanderSymphonyFactory eINSTANCE = org.eclipse.symphony.examples.lander.symphony.impl.Symphony__ExamplesLanderSymphonyFactoryImpl.init();

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
	Symphony__ExamplesLanderSymphonyPackage getSymphony__ExamplesLanderSymphonyPackage();

} //Symphony__ExamplesLanderSymphonyFactory
