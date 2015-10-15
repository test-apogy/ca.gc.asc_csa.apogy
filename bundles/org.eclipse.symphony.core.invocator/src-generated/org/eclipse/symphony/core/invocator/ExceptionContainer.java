/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.ExceptionContainer#getException <em>Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getExceptionContainer()
 * @model
 * @generated
 */
public interface ExceptionContainer extends EObject
{
  /**
	 * Returns the value of the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exception</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' attribute.
	 * @see #setException(Throwable)
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getExceptionContainer_Exception()
	 * @model unique="false" dataType="org.eclipse.symphony.core.invocator.Throwable"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly'"
	 * @generated
	 */
  Throwable getException();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.ExceptionContainer#getException <em>Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception</em>' attribute.
	 * @see #getException()
	 * @generated
	 */
  void setException(Throwable value);

} // ExceptionContainer
