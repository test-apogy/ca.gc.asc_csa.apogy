/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core;

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Apogy Topology</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ApogyTopology#getRootNode <em>Root Node</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getApogyTopology()
 * @model
 * @generated
 */
public interface ApogyTopology extends EObject {
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
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getApogyTopology_RootNode()
	 * @model transient="true" derived="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='Readonly'"
	 * @generated
	 */
	GroupNode getRootNode();

	/**
	 * Sets the value of the '
	 * {@link ca.gc.asc_csa.apogy.core.ApogyTopology#getRootNode
	 * <em>Root Node</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Root Node</em>' reference.
	 * @see #getRootNode()
	 * @generated
	 */
	void setRootNode(GroupNode value);

} // ApogyTopology
