/**
 */
package org.eclipse.symphony.common.emf.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.common.emf.ui.Symphony__CommonEMFUIPackage
 * @generated
 */
public interface Symphony__CommonEMFUIFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  Symphony__CommonEMFUIFactory eINSTANCE = org.eclipse.symphony.common.emf.ui.impl.Symphony__CommonEMFUIFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>EMF Ecore UI Facade</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Ecore UI Facade</em>'.
	 * @generated
	 */
  EMFEcoreUIFacade createEMFEcoreUIFacade();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Symphony__CommonEMFUIPackage getSymphony__CommonEMFUIPackage();

} //Symphony__CommonEMFUIFactory
