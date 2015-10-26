/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons;

import org.eclipse.symphony.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sun Vector3 DTool Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.SunVector3DToolNode#getSunVector3DTool <em>Sun Vector3 DTool</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getSunVector3DToolNode()
 * @model
 * @generated
 */
public interface SunVector3DToolNode extends Node {
	/**
	 * Returns the value of the '<em><b>Sun Vector3 DTool</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.addons.SunVector3DTool#getSunVector3DToolNode <em>Sun Vector3 DTool Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sun Vector3 DTool</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sun Vector3 DTool</em>' reference.
	 * @see #setSunVector3DTool(SunVector3DTool)
	 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getSunVector3DToolNode_SunVector3DTool()
	 * @see org.eclipse.symphony.addons.SunVector3DTool#getSunVector3DToolNode
	 * @model opposite="sunVector3DToolNode" transient="true"
	 * @generated
	 */
	SunVector3DTool getSunVector3DTool();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.SunVector3DToolNode#getSunVector3DTool <em>Sun Vector3 DTool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sun Vector3 DTool</em>' reference.
	 * @see #getSunVector3DTool()
	 * @generated
	 */
	void setSunVector3DTool(SunVector3DTool value);

} // SunVector3DToolNode
