/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.programs.controllers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.TimeTrigger#getRefreshPeriod <em>Refresh Period</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersPackage#getTimeTrigger()
 * @model
 * @generated
 */
public interface TimeTrigger extends Trigger
{
  /**
	 * Returns the value of the '<em><b>Refresh Period</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refresh Period</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Period</em>' attribute.
	 * @see #setRefreshPeriod(long)
	 * @see org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersPackage#getTimeTrigger_RefreshPeriod()
	 * @model default="100" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' csa_units='ms'"
	 * @generated
	 */
  long getRefreshPeriod();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.programs.controllers.TimeTrigger#getRefreshPeriod <em>Refresh Period</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Period</em>' attribute.
	 * @see #getRefreshPeriod()
	 * @generated
	 */
  void setRefreshPeriod(long value);

} // TimeTrigger
