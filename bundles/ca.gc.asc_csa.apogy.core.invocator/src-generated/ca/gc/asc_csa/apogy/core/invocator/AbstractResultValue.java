/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Result Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A value stored in an AbstractResult.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.AbstractResultValue#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getAbstractResultValue()
 * @model abstract="true"
 * @generated
 */
public interface AbstractResultValue extends EObject
{
  /**
	 * Returns the value of the '<em><b>Result</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.AbstractResult#getResultValue <em>Result Value</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' container reference.
	 * @see #setResult(AbstractResult)
	 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getAbstractResultValue_Result()
	 * @see org.eclipse.symphony.core.invocator.AbstractResult#getResultValue
	 * @model opposite="resultValue" transient="false"
	 * @generated
	 */
  AbstractResult getResult();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.AbstractResultValue#getResult <em>Result</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' container reference.
	 * @see #getResult()
	 * @generated
	 */
  void setResult(AbstractResult value);

} // AbstractResultValue
