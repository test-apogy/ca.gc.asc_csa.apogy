/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator;

import org.eclipse.emf.ecore.EOperation;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * Operation Call.
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCall#getEOperation <em>EOperation</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCall#getArgumentsList <em>Arguments List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCall#getOperationCallContainer <em>Operation Call Container</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCall#getInvocatorSession <em>Invocator Session</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCall#getEnvironment <em>Environment</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getOperationCall()
 * @model
 * @generated
 */
public interface OperationCall extends VariableFeatureReference, Named, Described
{
  /**
	 * Returns the value of the '<em><b>EOperation</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EOperation</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>EOperation</em>' reference.
	 * @see #setEOperation(EOperation)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getOperationCall_EOperation()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
  EOperation getEOperation();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCall#getEOperation <em>EOperation</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EOperation</em>' reference.
	 * @see #getEOperation()
	 * @generated
	 */
  void setEOperation(EOperation value);

  /**
	 * Returns the value of the '<em><b>Arguments List</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.ArgumentsList#getOperationCall <em>Operation Call</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments List</em>' containment reference.
	 * @see #setArgumentsList(ArgumentsList)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getOperationCall_ArgumentsList()
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.ArgumentsList#getOperationCall
	 * @model opposite="operationCall" containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel createChild='false'"
	 * @generated
	 */
  ArgumentsList getArgumentsList();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCall#getArgumentsList <em>Arguments List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arguments List</em>' containment reference.
	 * @see #getArgumentsList()
	 * @generated
	 */
  void setArgumentsList(ArgumentsList value);

  /**
	 * Returns the value of the '<em><b>Operation Call Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallContainer#getOperationCalls <em>Operation Calls</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation Call Container</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Call Container</em>' container reference.
	 * @see #setOperationCallContainer(OperationCallContainer)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getOperationCall_OperationCallContainer()
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallContainer#getOperationCalls
	 * @model opposite="operationCalls" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  OperationCallContainer getOperationCallContainer();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCall#getOperationCallContainer <em>Operation Call Container</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Call Container</em>' container reference.
	 * @see #getOperationCallContainer()
	 * @generated
	 */
  void setOperationCallContainer(OperationCallContainer value);

  /**
	 * Returns the value of the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Invocator Session</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocator Session</em>' reference.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getOperationCall_InvocatorSession()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None' get='<%ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallContainer%> _operationCallContainer = this.getOperationCallContainer();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_operationCallContainer, null);\nif (_equals)\n{\n\treturn null;\n}\nelse\n{\n\t<%ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallContainer%> _operationCallContainer_1 = this.getOperationCallContainer();\n\treturn _operationCallContainer_1.getInvocatorSession();\n}'"
	 * @generated
	 */
  InvocatorSession getInvocatorSession();

  /**
	 * Returns the value of the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Environment</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' reference.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getOperationCall_Environment()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None' get='<%ca.gc.asc_csa.eclipse.emf.ecore.invocator.InvocatorSession%> _invocatorSession = this.getInvocatorSession();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_invocatorSession, null);\nif (_equals)\n{\n\treturn null;\n}\nelse\n{\n\t<%ca.gc.asc_csa.eclipse.emf.ecore.invocator.InvocatorSession%> _invocatorSession_1 = this.getInvocatorSession();\n\treturn _invocatorSession_1.getEnvironment();\n}'"
	 * @generated
	 */
  Environment getEnvironment();

} // OperationCall
