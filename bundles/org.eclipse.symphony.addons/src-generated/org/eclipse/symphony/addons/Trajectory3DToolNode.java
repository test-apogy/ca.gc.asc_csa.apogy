/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons;

import ca.gc.space.topology.AggregateGroupNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trajectory3 DTool Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Node representing the Trajectory3DTool in the topology.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.Trajectory3DToolNode#getTrajectory3DTool <em>Trajectory3 DTool</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.SymphonyToolsCorePackage#getTrajectory3DToolNode()
 * @model
 * @generated
 */
public interface Trajectory3DToolNode extends AggregateGroupNode {
	/**
	 * Returns the value of the '<em><b>Trajectory3 DTool</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.addons.Trajectory3DTool#getTrajectory3DToolNode <em>Trajectory3 DTool Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trajectory3 DTool</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trajectory3 DTool</em>' reference.
	 * @see #setTrajectory3DTool(Trajectory3DTool)
	 * @see org.eclipse.symphony.addons.SymphonyToolsCorePackage#getTrajectory3DToolNode_Trajectory3DTool()
	 * @see org.eclipse.symphony.addons.Trajectory3DTool#getTrajectory3DToolNode
	 * @model opposite="trajectory3DToolNode" transient="true"
	 * @generated
	 */
	Trajectory3DTool getTrajectory3DTool();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.Trajectory3DToolNode#getTrajectory3DTool <em>Trajectory3 DTool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trajectory3 DTool</em>' reference.
	 * @see #getTrajectory3DTool()
	 * @generated
	 */
	void setTrajectory3DTool(Trajectory3DTool value);

} // Trajectory3DToolNode
