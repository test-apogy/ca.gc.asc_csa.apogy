/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons;

import org.eclipse.symphony.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ruler3d Tool Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.Ruler3dToolNode#getRuler3DTool <em>Ruler3 DTool</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getRuler3dToolNode()
 * @model
 * @generated
 */
public interface Ruler3dToolNode extends Node {

	/**
	 * Returns the value of the '<em><b>Ruler3 DTool</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.addons.Ruler3DTool#getRuler3dToolNode <em>Ruler3d Tool Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruler3 DTool</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruler3 DTool</em>' reference.
	 * @see #setRuler3DTool(Ruler3DTool)
	 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getRuler3dToolNode_Ruler3DTool()
	 * @see org.eclipse.symphony.addons.Ruler3DTool#getRuler3dToolNode
	 * @model opposite="ruler3dToolNode" transient="true"
	 * @generated
	 */
	Ruler3DTool getRuler3DTool();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.Ruler3dToolNode#getRuler3DTool <em>Ruler3 DTool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruler3 DTool</em>' reference.
	 * @see #getRuler3DTool()
	 * @generated
	 */
	void setRuler3DTool(Ruler3DTool value);
} // Ruler3dToolNode
