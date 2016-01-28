/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Implementations List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * Variables & Type Implementations.
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.VariableImplementationsList#getVariableImplementations <em>Variable Implementations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getVariableImplementationsList()
 * @model
 * @generated
 */
public interface VariableImplementationsList extends EObject
{

  /**
	 * Returns the value of the '<em><b>Variable Implementations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.invocator.VariableImplementation}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.VariableImplementation#getVariableImplementationsList <em>Variable Implementations List</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Implementations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Implementations</em>' containment reference list.
	 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getVariableImplementationsList_VariableImplementations()
	 * @see org.eclipse.symphony.core.invocator.VariableImplementation#getVariableImplementationsList
	 * @model opposite="variableImplementationsList" containment="true"
	 * @generated
	 */
  EList<VariableImplementation> getVariableImplementations();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" variableUnique="false"
	 * @generated
	 */
  VariableImplementation getVariableImplementation(Variable variable);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Searches a {@link VariableImplementation} based on the variable name.
	 * @param name Search criteria.
	 * @return Reference to the {@link VariableImplementation} or null if not found.
	 * <!-- end-model-doc -->
	 * @model unique="false" nameUnique="false"
	 * @generated
	 */
  VariableImplementation getVariableImplementation(String name);
} // VariableImplementationsList
