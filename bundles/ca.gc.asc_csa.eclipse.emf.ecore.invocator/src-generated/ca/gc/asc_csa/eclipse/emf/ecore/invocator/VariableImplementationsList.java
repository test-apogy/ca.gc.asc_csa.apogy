/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator;

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
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.VariableImplementationsList#getVariableImplementations <em>Variable Implementations</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getVariableImplementationsList()
 * @model
 * @generated
 */
public interface VariableImplementationsList extends EObject
{

  /**
	 * Returns the value of the '<em><b>Variable Implementations</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.VariableImplementation}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.VariableImplementation#getVariableImplementationsList <em>Variable Implementations List</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Implementations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Implementations</em>' containment reference list.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getVariableImplementationsList_VariableImplementations()
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.VariableImplementation#getVariableImplementationsList
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
