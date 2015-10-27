/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variables List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * Variables.
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.VariablesList#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.VariablesList#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getVariablesList()
 * @model
 * @generated
 */
public interface VariablesList extends EObject
{
  /**
	 * Returns the value of the '<em><b>Environment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.Environment#getVariablesList <em>Variables List</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Environment</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' container reference.
	 * @see #setEnvironment(Environment)
	 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getVariablesList_Environment()
	 * @see org.eclipse.symphony.core.invocator.Environment#getVariablesList
	 * @model opposite="variablesList" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  Environment getEnvironment();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.VariablesList#getEnvironment <em>Environment</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' container reference.
	 * @see #getEnvironment()
	 * @generated
	 */
  void setEnvironment(Environment value);

  /**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.invocator.Variable}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.Variable#getVariablesList <em>Variables List</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getVariablesList_Variables()
	 * @see org.eclipse.symphony.core.invocator.Variable#getVariablesList
	 * @model opposite="variablesList" containment="true"
	 * @generated
	 */
  EList<Variable> getVariables();

} // VariablesList
