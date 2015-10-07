/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invocator Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Run Environment.
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.InvocatorSession#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.InvocatorSession#getProgramsList <em>Programs List</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.InvocatorSession#getDataProductsListContainer <em>Data Products List Container</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.InvocatorSession#getToolsList <em>Tools List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getInvocatorSession()
 * @model
 * @generated
 */
public interface InvocatorSession extends Named, Described
{
  /**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.Environment#getInvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Environment</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference.
	 * @see #setEnvironment(Environment)
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getInvocatorSession_Environment()
	 * @see org.eclipse.symphony.core.invocator.Environment#getInvocatorSession
	 * @model opposite="invocatorSession" containment="true"
	 * @generated
	 */
  Environment getEnvironment();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.InvocatorSession#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
  void setEnvironment(Environment value);

  /**
	 * Returns the value of the '<em><b>Programs List</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.ProgramsList#getInvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Programs List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs List</em>' containment reference.
	 * @see #setProgramsList(ProgramsList)
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getInvocatorSession_ProgramsList()
	 * @see org.eclipse.symphony.core.invocator.ProgramsList#getInvocatorSession
	 * @model opposite="invocatorSession" containment="true"
	 * @generated
	 */
  ProgramsList getProgramsList();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.InvocatorSession#getProgramsList <em>Programs List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programs List</em>' containment reference.
	 * @see #getProgramsList()
	 * @generated
	 */
  void setProgramsList(ProgramsList value);

  /**
	 * Returns the value of the '<em><b>Data Products List Container</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.DataProductsListsContainer#getInvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Products List Container</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Products List Container</em>' containment reference.
	 * @see #setDataProductsListContainer(DataProductsListsContainer)
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getInvocatorSession_DataProductsListContainer()
	 * @see org.eclipse.symphony.core.invocator.DataProductsListsContainer#getInvocatorSession
	 * @model opposite="invocatorSession" containment="true"
	 * @generated
	 */
  DataProductsListsContainer getDataProductsListContainer();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.InvocatorSession#getDataProductsListContainer <em>Data Products List Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Products List Container</em>' containment reference.
	 * @see #getDataProductsListContainer()
	 * @generated
	 */
  void setDataProductsListContainer(DataProductsListsContainer value);

  /**
	 * Returns the value of the '<em><b>Tools List</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.ToolsList#getInvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tools List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Tools List</em>' containment reference.
	 * @see #setToolsList(ToolsList)
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getInvocatorSession_ToolsList()
	 * @see org.eclipse.symphony.core.invocator.ToolsList#getInvocatorSession
	 * @model opposite="invocatorSession" containment="true"
	 * @generated
	 */
  ToolsList getToolsList();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.InvocatorSession#getToolsList <em>Tools List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tools List</em>' containment reference.
	 * @see #getToolsList()
	 * @generated
	 */
  void setToolsList(ToolsList value);

} // InvocatorSession
