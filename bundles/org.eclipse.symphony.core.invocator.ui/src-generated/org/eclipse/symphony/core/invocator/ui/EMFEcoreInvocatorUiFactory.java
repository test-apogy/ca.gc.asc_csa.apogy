/**
 */
package org.eclipse.symphony.core.invocator.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.core.invocator.ui.EMFEcoreInvocatorUiPackage
 * @generated
 */
public interface EMFEcoreInvocatorUiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EMFEcoreInvocatorUiFactory eINSTANCE = org.eclipse.symphony.core.invocator.ui.impl.EMFEcoreInvocatorUiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	EMFEcoreInvocatorUiFacade createEMFEcoreInvocatorUiFacade();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EMFEcoreInvocatorUiPackage getEMFEcoreInvocatorUiPackage();

} //EMFEcoreInvocatorUiFactory
