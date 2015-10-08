/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator;

import org.eclipse.emf.common.util.EList;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tools List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * ToolsList.
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.ToolsList#getInvocatorSession <em>Invocator Session</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.ToolsList#getToolsListContainers <em>Tools List Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getToolsList()
 * @model
 * @generated
 */
public interface ToolsList extends Named, Described
{
  /**
	 * Returns the value of the '<em><b>Invocator Session</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.InvocatorSession#getToolsList <em>Tools List</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Invocator Session</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocator Session</em>' container reference.
	 * @see #setInvocatorSession(InvocatorSession)
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getToolsList_InvocatorSession()
	 * @see org.eclipse.symphony.core.invocator.InvocatorSession#getToolsList
	 * @model opposite="toolsList" transient="false"
	 * @generated
	 */
  InvocatorSession getInvocatorSession();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.ToolsList#getInvocatorSession <em>Invocator Session</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invocator Session</em>' container reference.
	 * @see #getInvocatorSession()
	 * @generated
	 */
  void setInvocatorSession(InvocatorSession value);

  /**
	 * Returns the value of the '<em><b>Tools List Containers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.invocator.AbstractToolsListContainer}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.AbstractToolsListContainer#getToolsList <em>Tools List</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tools List Containers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Tools List Containers</em>' containment reference list.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getToolsList_ToolsListContainers()
	 * @see org.eclipse.symphony.core.invocator.AbstractToolsListContainer#getToolsList
	 * @model opposite="toolsList" containment="true"
	 * @generated
	 */
  EList<AbstractToolsListContainer> getToolsListContainers();

} // ToolsList
