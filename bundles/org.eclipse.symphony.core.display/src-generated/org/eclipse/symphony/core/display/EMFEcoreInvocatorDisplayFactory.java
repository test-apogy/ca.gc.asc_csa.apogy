/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.display;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.core.display.EMFEcoreInvocatorDisplayPackage
 * @generated
 */
public interface EMFEcoreInvocatorDisplayFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  EMFEcoreInvocatorDisplayFactory eINSTANCE = org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Text Display</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Display</em>'.
	 * @generated
	 */
  TextDisplay createTextDisplay();

  /**
	 * Returns a new object of class '<em>Boolean Display</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Display</em>'.
	 * @generated
	 */
  BooleanDisplay createBooleanDisplay();

  /**
	 * Returns a new object of class '<em>Number Versus Time History Data</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Versus Time History Data</em>'.
	 * @generated
	 */
  NumberVersusTimeHistoryData createNumberVersusTimeHistoryData();

  /**
	 * Returns a new object of class '<em>Number Vs Time Plot Display</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Vs Time Plot Display</em>'.
	 * @generated
	 */
  NumberVsTimePlotDisplay createNumberVsTimePlotDisplay();

  /**
	 * Returns a new object of class '<em>Display Facade</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Display Facade</em>'.
	 * @generated
	 */
  DisplayFacade createDisplayFacade();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  EMFEcoreInvocatorDisplayPackage getEMFEcoreInvocatorDisplayPackage();

} //EMFEcoreInvocatorDisplayFactory
