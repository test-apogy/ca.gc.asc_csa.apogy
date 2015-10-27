/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contexts List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * Contexts.
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.ContextsList#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.ContextsList#getContexts <em>Contexts</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getContextsList()
 * @model
 * @generated
 */
public interface ContextsList extends EObject
{
  /**
	 * Returns the value of the '<em><b>Environment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.Environment#getContextsList <em>Contexts List</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Environment</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' container reference.
	 * @see #setEnvironment(Environment)
	 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getContextsList_Environment()
	 * @see org.eclipse.symphony.core.invocator.Environment#getContextsList
	 * @model opposite="contextsList" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  Environment getEnvironment();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.ContextsList#getEnvironment <em>Environment</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' container reference.
	 * @see #getEnvironment()
	 * @generated
	 */
  void setEnvironment(Environment value);

  /**
	 * Returns the value of the '<em><b>Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.invocator.Context}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.Context#getContextsList <em>Contexts List</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contexts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts</em>' containment reference list.
	 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getContextsList_Contexts()
	 * @see org.eclipse.symphony.core.invocator.Context#getContextsList
	 * @model opposite="contextsList" containment="true"
	 * @generated
	 */
  EList<Context> getContexts();

} // ContextsList
