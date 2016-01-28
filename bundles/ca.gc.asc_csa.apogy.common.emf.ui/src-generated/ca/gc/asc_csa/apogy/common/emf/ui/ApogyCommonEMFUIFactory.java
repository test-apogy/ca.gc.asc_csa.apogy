/**
 */
package ca.gc.asc_csa.apogy.common.emf.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIPackage
 * @generated
 */
public interface ApogyCommonEMFUIFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyCommonEMFUIFactory eINSTANCE = ca.gc.asc_csa.apogy.common.emf.ui.impl.ApogyCommonEMFUIFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	ApogyCommonEMFUIFacade createApogyCommonEMFUIFacade();

		/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyCommonEMFUIPackage getApogyCommonEMFUIPackage();

} //ApogyCommonEMFUIFactory
