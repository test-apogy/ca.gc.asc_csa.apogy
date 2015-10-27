/**
 */
package org.eclipse.symphony.common.emf.edit.utils;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.common.emf.edit.utils.Symphony__CommonEMFEditUtilsPackage
 * @generated
 */
public interface Symphony__CommonEMFEditUtilsFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  Symphony__CommonEMFEditUtilsFactory eINSTANCE = org.eclipse.symphony.common.emf.edit.utils.impl.Symphony__CommonEMFEditUtilsFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	Symphony__CommonEMFEditUtilsFacade createSymphony__CommonEMFEditUtilsFacade();

		/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Symphony__CommonEMFEditUtilsPackage getSymphony__CommonEMFEditUtilsPackage();

} //Symphony__CommonEMFEditUtilsFactory
