/**
 */
package org.eclipse.symphony.core.invocator.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.core.invocator.ui.Symphony__CoreInvocatorUIPackage
 * @generated
 */
public interface Symphony__CoreInvocatorUIFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__CoreInvocatorUIFactory eINSTANCE = org.eclipse.symphony.core.invocator.ui.impl.Symphony__CoreInvocatorUIFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	Symphony__CoreInvocatorUIFacade createSymphony__CoreInvocatorUIFacade();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Symphony__CoreInvocatorUIPackage getSymphony__CoreInvocatorUIPackage();

} //Symphony__CoreInvocatorUIFactory
