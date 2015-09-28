/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers;

import ca.gc.asc_csa.jinput.EComponentQualifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ControllerTrigger#getComponentQualifier <em>Component Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.EMFEcoreControllersPackage#getControllerTrigger()
 * @model abstract="true"
 * @generated
 */
public interface ControllerTrigger extends Trigger
{
  /**
	 * Returns the value of the '<em><b>Component Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component Qualifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Qualifier</em>' containment reference.
	 * @see #setComponentQualifier(EComponentQualifier)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.EMFEcoreControllersPackage#getControllerTrigger_ComponentQualifier()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
  EComponentQualifier getComponentQualifier();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ControllerTrigger#getComponentQualifier <em>Component Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Qualifier</em>' containment reference.
	 * @see #getComponentQualifier()
	 * @generated
	 */
  void setComponentQualifier(EComponentQualifier value);

} // ControllerTrigger
