/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.TimeTrigger#getRefreshPeriod <em>Refresh Period</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.EMFEcoreControllersPackage#getTimeTrigger()
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
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.EMFEcoreControllersPackage#getTimeTrigger_RefreshPeriod()
	 * @model default="100" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' csa_units='ms'"
	 * @generated
	 */
  long getRefreshPeriod();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.TimeTrigger#getRefreshPeriod <em>Refresh Period</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Period</em>' attribute.
	 * @see #getRefreshPeriod()
	 * @generated
	 */
  void setRefreshPeriod(long value);

} // TimeTrigger
