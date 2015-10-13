/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.topology.Node;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Topology Root</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Topology.
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.TopologyRoot#getOriginNode <em>Origin Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.SymphonyCorePackage#getTopologyRoot()
 * @model
 * @generated
 */
public interface TopologyRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Origin Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Node</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Node</em>' containment reference.
	 * @see #setOriginNode(Node)
	 * @see org.eclipse.symphony.core.SymphonyCorePackage#getTopologyRoot_OriginNode()
	 * @model containment="true"
	 * @generated
	 */
	Node getOriginNode();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.TopologyRoot#getOriginNode <em>Origin Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Node</em>' containment reference.
	 * @see #getOriginNode()
	 * @generated
	 */
	void setOriginNode(Node value);

} // TopologyRoot
