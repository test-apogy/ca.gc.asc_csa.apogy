/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.topology;

import ca.gc.asc_csa.apogy.common.topology.ReferencedGroupNode;
import ca.gc.asc_csa.apogy.core.ApogyEnvironment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apogy System AP Is Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.topology.ApogySystemAPIsNode#getApogyEnvironment <em>Apogy Environment</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyPackage#getApogySystemAPIsNode()
 * @model
 * @generated
 */
public interface ApogySystemAPIsNode extends ReferencedGroupNode
{
  /**
	 * Returns the value of the '<em><b>Apogy Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Apogy Environment</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Apogy Environment</em>' reference.
	 * @see #setApogyEnvironment(ApogyEnvironment)
	 * @see ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyPackage#getApogySystemAPIsNode_ApogyEnvironment()
	 * @model transient="true"
	 * @generated
	 */
  ApogyEnvironment getApogyEnvironment();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.topology.ApogySystemAPIsNode#getApogyEnvironment <em>Apogy Environment</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apogy Environment</em>' reference.
	 * @see #getApogyEnvironment()
	 * @generated
	 */
  void setApogyEnvironment(ApogyEnvironment value);

} // ApogySystemAPIsNode
