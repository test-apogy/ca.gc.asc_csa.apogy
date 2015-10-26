/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator;

import org.eclipse.symphony.common.emf.Named;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Variable Definition
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.Variable#getVariablesList <em>Variables List</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.Variable#getVariableType <em>Variable Type</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.Variable#getEnvironment <em>Environment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends Named
{
  /**
	 * Returns the value of the '<em><b>Variables List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.VariablesList#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables List</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables List</em>' container reference.
	 * @see #setVariablesList(VariablesList)
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getVariable_VariablesList()
	 * @see org.eclipse.symphony.core.invocator.VariablesList#getVariables
	 * @model opposite="variables" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  VariablesList getVariablesList();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.Variable#getVariablesList <em>Variables List</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variables List</em>' container reference.
	 * @see #getVariablesList()
	 * @generated
	 */
  void setVariablesList(VariablesList value);

  /**
	 * Returns the value of the '<em><b>Variable Type</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Type</em>' reference.
	 * @see #setVariableType(Type)
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getVariable_VariableType()
	 * @model required="true"
	 * @generated
	 */
  Type getVariableType();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.Variable#getVariableType <em>Variable Type</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Type</em>' reference.
	 * @see #getVariableType()
	 * @generated
	 */
  void setVariableType(Type value);

  /**
	 * Returns the value of the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Environment</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' reference.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getVariable_Environment()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='None' get='<%org.eclipse.symphony.core.invocator.VariablesList%> _variablesList = this.getVariablesList();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_variablesList, null);\nif (_equals)\n{\n\treturn null;\n}\nelse\n{\n\t<%org.eclipse.symphony.core.invocator.VariablesList%> _variablesList_1 = this.getVariablesList();\n\treturn _variablesList_1.getEnvironment();\n}'"
	 * @generated
	 */
  Environment getEnvironment();

} // Variable
