/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.programs.controllers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller Edge Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.ControllerEdgeTrigger#getEdgeType <em>Edge Type</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getControllerEdgeTrigger()
 * @model
 * @generated
 */
public interface ControllerEdgeTrigger extends ControllerTrigger
{
  /**
	 * Returns the value of the '<em><b>Edge Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.core.programs.controllers.EdgeType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Edge Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Type</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.EdgeType
	 * @see #setEdgeType(EdgeType)
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getControllerEdgeTrigger_EdgeType()
	 * @model unique="false"
	 * @generated
	 */
  EdgeType getEdgeType();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.programs.controllers.ControllerEdgeTrigger#getEdgeType <em>Edge Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Type</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.EdgeType
	 * @see #getEdgeType()
	 * @generated
	 */
  void setEdgeType(EdgeType value);

} // ControllerEdgeTrigger
