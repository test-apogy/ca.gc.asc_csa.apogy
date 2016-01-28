/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.invocator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.VariableImplementation#getVariableImplementationsList <em>Variable Implementations List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.VariableImplementation#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getVariableImplementation()
 * @model
 * @generated
 */
public interface VariableImplementation extends AbstractTypeImplementation
{

  /**
	 * Returns the value of the '<em><b>Variable Implementations List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.invocator.VariableImplementationsList#getVariableImplementations <em>Variable Implementations</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Implementations List</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Implementations List</em>' container reference.
	 * @see #setVariableImplementationsList(VariableImplementationsList)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getVariableImplementation_VariableImplementationsList()
	 * @see ca.gc.asc_csa.apogy.core.invocator.VariableImplementationsList#getVariableImplementations
	 * @model opposite="variableImplementations" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  VariableImplementationsList getVariableImplementationsList();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.VariableImplementation#getVariableImplementationsList <em>Variable Implementations List</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Implementations List</em>' container reference.
	 * @see #getVariableImplementationsList()
	 * @generated
	 */
  void setVariableImplementationsList(VariableImplementationsList value);

  /**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getVariableImplementation_Variable()
	 * @model required="true"
	 * @generated
	 */
  Variable getVariable();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.VariableImplementation#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
  void setVariable(Variable value);
} // VariableImplementation
