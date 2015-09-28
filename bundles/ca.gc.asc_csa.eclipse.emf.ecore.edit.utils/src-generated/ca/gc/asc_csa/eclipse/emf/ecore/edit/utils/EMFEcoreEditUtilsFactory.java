/**
 */
package ca.gc.asc_csa.eclipse.emf.ecore.edit.utils;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.eclipse.emf.ecore.edit.utils.EMFEcoreEditUtilsPackage
 * @generated
 */
public interface EMFEcoreEditUtilsFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  EMFEcoreEditUtilsFactory eINSTANCE = ca.gc.asc_csa.eclipse.emf.ecore.edit.utils.impl.EMFEcoreEditUtilsFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
  EMFEcoreEditUtilsFacade createEMFEcoreEditUtilsFacade();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  EMFEcoreEditUtilsPackage getEMFEcoreEditUtilsPackage();

} //EMFEcoreEditUtilsFactory
