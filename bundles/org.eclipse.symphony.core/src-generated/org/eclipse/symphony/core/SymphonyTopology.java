/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core;

import org.eclipse.emf.ecore.EObject;

import ca.gc.space.topology.GroupNode;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Symphony Topology</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.SymphonyTopology#getRootNode <em>Root Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.SymphonyCorePackage#getSymphonyTopology()
 * @model
 * @generated
 */
public interface SymphonyTopology extends EObject {
	/**
	 * Returns the value of the '<em><b>Root Node</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Node</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Root Node</em>' reference.
	 * @see #setRootNode(GroupNode)
	 * @see org.eclipse.symphony.core.SymphonyCorePackage#getSymphonyTopology_RootNode()
	 * @model transient="true" derived="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='Readonly'"
	 * @generated
	 */
	GroupNode getRootNode();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.symphony.core.SymphonyTopology#getRootNode
	 * <em>Root Node</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Root Node</em>' reference.
	 * @see #getRootNode()
	 * @generated
	 */
	void setRootNode(GroupNode value);

} // SymphonyTopology
