/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.topology;

import org.eclipse.symphony.core.SymphonyEnvironment;

import ca.gc.space.topology.ReferencedGroupNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symphony System AP Is Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.topology.SymphonySystemAPIsNode#getSymphonyEnvironment <em>Symphony Environment</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.topology.SymphonyTopologyPackage#getSymphonySystemAPIsNode()
 * @model
 * @generated
 */
public interface SymphonySystemAPIsNode extends ReferencedGroupNode
{
  /**
	 * Returns the value of the '<em><b>Symphony Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symphony Environment</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Symphony Environment</em>' reference.
	 * @see #setSymphonyEnvironment(SymphonyEnvironment)
	 * @see ca.gc.asc_csa.symphony.topology.SymphonyTopologyPackage#getSymphonySystemAPIsNode_SymphonyEnvironment()
	 * @model transient="true"
	 * @generated
	 */
  SymphonyEnvironment getSymphonyEnvironment();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.topology.SymphonySystemAPIsNode#getSymphonyEnvironment <em>Symphony Environment</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symphony Environment</em>' reference.
	 * @see #getSymphonyEnvironment()
	 * @generated
	 */
  void setSymphonyEnvironment(SymphonyEnvironment value);

} // SymphonySystemAPIsNode
