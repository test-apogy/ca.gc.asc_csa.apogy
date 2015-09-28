/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Argument#getArgumentsList <em>Arguments List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Argument#getOperationCall <em>Operation Call</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getArgument()
 * @model abstract="true"
 * @generated
 */
public interface Argument extends EObject
{
  /**
	 * Returns the value of the '<em><b>Arguments List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.ArgumentsList#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments List</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments List</em>' container reference.
	 * @see #setArgumentsList(ArgumentsList)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getArgument_ArgumentsList()
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.ArgumentsList#getArguments
	 * @model opposite="arguments" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  ArgumentsList getArgumentsList();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Argument#getArgumentsList <em>Arguments List</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arguments List</em>' container reference.
	 * @see #getArgumentsList()
	 * @generated
	 */
  void setArgumentsList(ArgumentsList value);

  /**
	 * Returns the value of the '<em><b>Operation Call</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation Call</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Call</em>' reference.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getArgument_OperationCall()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None' get='<%ca.gc.asc_csa.eclipse.emf.ecore.invocator.ArgumentsList%> _argumentsList = this.getArgumentsList();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_argumentsList, null);\nif (_equals)\n{\n\treturn null;\n}\nelse\n{\n\t<%ca.gc.asc_csa.eclipse.emf.ecore.invocator.ArgumentsList%> _argumentsList_1 = this.getArgumentsList();\n\treturn _argumentsList_1.getOperationCall();\n}'"
	 * @generated
	 */
  OperationCall getOperationCall();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
  EParameter getEParameter();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
  Object getParameterValue();

} // Argument
