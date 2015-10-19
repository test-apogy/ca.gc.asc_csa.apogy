/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.programs.controllers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller State Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.ControllerStateTrigger#isEnablingValue <em>Enabling Value</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.ControllerStateTrigger#getRepeatPeriod <em>Repeat Period</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersPackage#getControllerStateTrigger()
 * @model
 * @generated
 */
public interface ControllerStateTrigger extends ControllerTrigger
{
  /**
	 * Returns the value of the '<em><b>Enabling Value</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enabling Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabling Value</em>' attribute.
	 * @see #setEnablingValue(boolean)
	 * @see org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersPackage#getControllerStateTrigger_EnablingValue()
	 * @model default="true" unique="false"
	 * @generated
	 */
  boolean isEnablingValue();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.programs.controllers.ControllerStateTrigger#isEnablingValue <em>Enabling Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabling Value</em>' attribute.
	 * @see #isEnablingValue()
	 * @generated
	 */
  void setEnablingValue(boolean value);

  /**
	 * Returns the value of the '<em><b>Repeat Period</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repeat Period</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat Period</em>' attribute.
	 * @see #setRepeatPeriod(long)
	 * @see org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersPackage#getControllerStateTrigger_RepeatPeriod()
	 * @model default="100" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' csa_units='ms'"
	 * @generated
	 */
  long getRepeatPeriod();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.programs.controllers.ControllerStateTrigger#getRepeatPeriod <em>Repeat Period</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Period</em>' attribute.
	 * @see #getRepeatPeriod()
	 * @generated
	 */
  void setRepeatPeriod(long value);

} // ControllerStateTrigger
