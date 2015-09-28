/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator;

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
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.ToolsList#getInvocatorSession <em>Invocator Session</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.ToolsList#getToolsListContainers <em>Tools List Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getToolsList()
 * @model
 * @generated
 */
public interface ToolsList extends Named, Described
{
  /**
	 * Returns the value of the '<em><b>Invocator Session</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.InvocatorSession#getToolsList <em>Tools List</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Invocator Session</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocator Session</em>' container reference.
	 * @see #setInvocatorSession(InvocatorSession)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getToolsList_InvocatorSession()
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.InvocatorSession#getToolsList
	 * @model opposite="toolsList" transient="false"
	 * @generated
	 */
  InvocatorSession getInvocatorSession();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.ToolsList#getInvocatorSession <em>Invocator Session</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invocator Session</em>' container reference.
	 * @see #getInvocatorSession()
	 * @generated
	 */
  void setInvocatorSession(InvocatorSession value);

  /**
	 * Returns the value of the '<em><b>Tools List Containers</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractToolsListContainer}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractToolsListContainer#getToolsList <em>Tools List</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tools List Containers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Tools List Containers</em>' containment reference list.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getToolsList_ToolsListContainers()
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractToolsListContainer#getToolsList
	 * @model opposite="toolsList" containment="true"
	 * @generated
	 */
  EList<AbstractToolsListContainer> getToolsListContainers();

} // ToolsList
