/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallContainer;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Program;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controllers Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * ControllersConfiguration
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ControllersConfiguration#isActive <em>Active</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.EMFEcoreControllersPackage#getControllersConfiguration()
 * @model
 * @generated
 */
public interface ControllersConfiguration extends Program, OperationCallContainer
{
  /**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Active</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.EMFEcoreControllersPackage#getControllersConfiguration_Active()
	 * @model default="false" unique="false" transient="true"
	 * @generated
	 */
  boolean isActive();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ControllersConfiguration#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
  void setActive(boolean value);

} // ControllersConfiguration
