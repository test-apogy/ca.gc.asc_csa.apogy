/**
 */
package ca.gc.asc_csa.eclipse.emf.ecore.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.eclipse.emf.ecore.ui.EMFEcoreUIPackage
 * @generated
 */
public interface EMFEcoreUIFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  EMFEcoreUIFactory eINSTANCE = ca.gc.asc_csa.eclipse.emf.ecore.ui.impl.EMFEcoreUIFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
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
  EMFEcoreUIPackage getEMFEcoreUIPackage();

} //EMFEcoreUIFactory
