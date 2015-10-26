/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Tools List Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.AbstractToolsListContainer#getToolsList <em>Tools List</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getAbstractToolsListContainer()
 * @model abstract="true"
 * @generated
 */
public interface AbstractToolsListContainer extends EObject
{

  /**
	 * Returns the value of the '<em><b>Tools List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.ToolsList#getToolsListContainers <em>Tools List Containers</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tools List</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Tools List</em>' container reference.
	 * @see #setToolsList(ToolsList)
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getAbstractToolsListContainer_ToolsList()
	 * @see org.eclipse.symphony.core.invocator.ToolsList#getToolsListContainers
	 * @model opposite="toolsListContainers" transient="false"
	 * @generated
	 */
  ToolsList getToolsList();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.AbstractToolsListContainer#getToolsList <em>Tools List</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tools List</em>' container reference.
	 * @see #getToolsList()
	 * @generated
	 */
  void setToolsList(ToolsList value);
} // AbstractToolsListContainer
