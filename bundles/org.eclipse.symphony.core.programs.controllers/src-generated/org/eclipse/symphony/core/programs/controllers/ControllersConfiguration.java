/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.programs.controllers;

import org.eclipse.symphony.core.invocator.OperationCallContainer;
import org.eclipse.symphony.core.invocator.Program;

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
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.ControllersConfiguration#isActive <em>Active</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersPackage#getControllersConfiguration()
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
	 * @see org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersPackage#getControllersConfiguration_Active()
	 * @model default="false" unique="false" transient="true"
	 * @generated
	 */
  boolean isActive();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.programs.controllers.ControllersConfiguration#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
  void setActive(boolean value);

} // ControllersConfiguration
