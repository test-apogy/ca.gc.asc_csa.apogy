/**
 */
package org.eclipse.symphony.common.emf;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * Timed.
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.emf.Timed#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage#getTimed()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Timed extends EObject
{
  /**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(Date)
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage#getTimed_Time()
	 * @model unique="false"
	 * @generated
	 */
  Date getTime();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.common.emf.Timed#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
  void setTime(Date value);

} // Timed
