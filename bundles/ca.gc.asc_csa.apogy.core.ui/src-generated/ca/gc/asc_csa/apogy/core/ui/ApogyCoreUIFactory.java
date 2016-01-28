/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage
 * @generated
 */
public interface ApogyCoreUIFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyCoreUIFactory eINSTANCE = ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	ApogyCoreUIFacade createApogyCoreUIFacade();

		/**
	 * Returns a new object of class '<em>Apogy Resource Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apogy Resource Settings</em>'.
	 * @generated
	 */
	ApogyResourceSettings createApogyResourceSettings();

		/**
	 * Returns a new object of class '<em>New Apogy Project Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Apogy Project Settings</em>'.
	 * @generated
	 */
	NewApogyProjectSettings createNewApogyProjectSettings();

		/**
	 * Returns a new object of class '<em>New Apogy Session Settings</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Apogy Session Settings</em>'.
	 * @generated
	 */
  NewApogySessionSettings createNewApogySessionSettings();

  /**
	 * Returns a new object of class '<em>New Apogy System Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Apogy System Settings</em>'.
	 * @generated
	 */
	NewApogySystemSettings createNewApogySystemSettings();

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
	ApogyCoreUIPackage getApogyCoreUIPackage();

} //ApogyCoreUIFactory
