/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.programs.controllers;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Trigger : Defines a trigger that invokes a OperationControllerBinding
 * update.
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.Trigger#getOperationCallControllerBinding <em>Operation Call Controller Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersPackage#getTrigger()
 * @model abstract="true"
 * @generated
 */
public interface Trigger extends Named, Described
{
  /**
	 * Returns the value of the '<em><b>Operation Call Controller Binding</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.programs.controllers.OperationCallControllerBinding#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation Call Controller Binding</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Call Controller Binding</em>' container reference.
	 * @see #setOperationCallControllerBinding(OperationCallControllerBinding)
	 * @see org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersPackage#getTrigger_OperationCallControllerBinding()
	 * @see org.eclipse.symphony.core.programs.controllers.OperationCallControllerBinding#getTrigger
	 * @model opposite="trigger" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  OperationCallControllerBinding getOperationCallControllerBinding();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.programs.controllers.Trigger#getOperationCallControllerBinding <em>Operation Call Controller Binding</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Call Controller Binding</em>' container reference.
	 * @see #getOperationCallControllerBinding()
	 * @generated
	 */
  void setOperationCallControllerBinding(OperationCallControllerBinding value);

} // Trigger
