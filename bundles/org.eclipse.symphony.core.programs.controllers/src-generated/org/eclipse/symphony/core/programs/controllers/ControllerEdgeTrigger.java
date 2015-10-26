/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.programs.controllers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller Edge Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.ControllerEdgeTrigger#getEdgeType <em>Edge Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersPackage#getControllerEdgeTrigger()
 * @model
 * @generated
 */
public interface ControllerEdgeTrigger extends ControllerTrigger
{
  /**
	 * Returns the value of the '<em><b>Edge Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.symphony.core.programs.controllers.EdgeType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Edge Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Type</em>' attribute.
	 * @see org.eclipse.symphony.core.programs.controllers.EdgeType
	 * @see #setEdgeType(EdgeType)
	 * @see org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersPackage#getControllerEdgeTrigger_EdgeType()
	 * @model unique="false"
	 * @generated
	 */
  EdgeType getEdgeType();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.programs.controllers.ControllerEdgeTrigger#getEdgeType <em>Edge Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Type</em>' attribute.
	 * @see org.eclipse.symphony.core.programs.controllers.EdgeType
	 * @see #getEdgeType()
	 * @generated
	 */
  void setEdgeType(EdgeType value);

} // ControllerEdgeTrigger
