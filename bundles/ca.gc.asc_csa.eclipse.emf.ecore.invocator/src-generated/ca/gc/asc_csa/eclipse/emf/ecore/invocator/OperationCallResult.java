/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Call Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The result associated with the invocation of an OperationCall.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallResult#getOperationCall <em>Operation Call</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallResult#getExceptionContainer <em>Exception Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getOperationCallResult()
 * @model
 * @generated
 */
public interface OperationCallResult extends AbstractResult, OperationCallContainer
{
  /**
	 * Returns the value of the '<em><b>Operation Call</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation Call</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * In this case, operationCall refers to the OperationCall stored in the OperationCallContainer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Call</em>' reference.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getOperationCallResult_OperationCall()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None' children='false' notify='true' get='<%org.eclipse.emf.common.util.EList%><<%ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCall%>> _operationCalls = this.getOperationCalls();\nint _size = _operationCalls.size();\nboolean _equals = (_size == 0);\nif (_equals)\n{\n\treturn null;\n}\nelse\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCall%>> _operationCalls_1 = this.getOperationCalls();\n\treturn _operationCalls_1.get(0);\n}'"
	 * @generated
	 */
  OperationCall getOperationCall();

  /**
	 * Returns the value of the '<em><b>Exception Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exception Container</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Container</em>' containment reference.
	 * @see #setExceptionContainer(ExceptionContainer)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getOperationCallResult_ExceptionContainer()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' createChild='false' property='Readonly'"
	 * @generated
	 */
  ExceptionContainer getExceptionContainer();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallResult#getExceptionContainer <em>Exception Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Container</em>' containment reference.
	 * @see #getExceptionContainer()
	 * @generated
	 */
  void setExceptionContainer(ExceptionContainer value);

} // OperationCallResult
