/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.core.ui.Symphony__CoreUIPackage
 * @generated
 */
public interface Symphony__CoreUIFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  Symphony__CoreUIFactory eINSTANCE = org.eclipse.symphony.core.ui.impl.Symphony__CoreUIFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Symphony Core Ui Facade</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symphony Core Ui Facade</em>'.
	 * @generated
	 */
  SymphonyCoreUiFacade createSymphonyCoreUiFacade();

  /**
	 * Returns a new object of class '<em>Symphony Resource Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symphony Resource Settings</em>'.
	 * @generated
	 */
	SymphonyResourceSettings createSymphonyResourceSettings();

		/**
	 * Returns a new object of class '<em>New Symphony Project Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Symphony Project Settings</em>'.
	 * @generated
	 */
	NewSymphonyProjectSettings createNewSymphonyProjectSettings();

		/**
	 * Returns a new object of class '<em>New Symphony Session Settings</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Symphony Session Settings</em>'.
	 * @generated
	 */
  NewSymphonySessionSettings createNewSymphonySessionSettings();

  /**
	 * Returns a new object of class '<em>New Symphony System Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Symphony System Settings</em>'.
	 * @generated
	 */
	NewSymphonySystemSettings createNewSymphonySystemSettings();

		/**
	 * Returns a new object of class '<em>Result Node Presentation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Node Presentation</em>'.
	 * @generated
	 */
  ResultNodePresentation createResultNodePresentation();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Symphony__CoreUIPackage getSymphony__CoreUIPackage();

} //Symphony__CoreUIFactory
