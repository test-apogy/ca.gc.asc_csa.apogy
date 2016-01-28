/**
 */
package ca.gc.asc_csa.apogy.common.emf.edit.utils;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.common.emf.edit.utils.ApogyCommonEMFEditUtilsPackage
 * @generated
 */
public interface ApogyCommonEMFEditUtilsFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyCommonEMFEditUtilsFactory eINSTANCE = ca.gc.asc_csa.apogy.common.emf.edit.utils.impl.ApogyCommonEMFEditUtilsFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	ApogyCommonEMFEditUtilsFacade createApogyCommonEMFEditUtilsFacade();

		/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyCommonEMFEditUtilsPackage getApogyCommonEMFEditUtilsPackage();

} //ApogyCommonEMFEditUtilsFactory
