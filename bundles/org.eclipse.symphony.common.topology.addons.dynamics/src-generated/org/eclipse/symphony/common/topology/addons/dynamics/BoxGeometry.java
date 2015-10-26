/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.addons.dynamics;

import org.eclipse.symphony.common.math.Tuple3d;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Box Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This geometry is a box defined by its dimension parameter (x, y and z size).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.BoxGeometry#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.topology.addons.dynamics.Symphony__CommonTopologyDynamicsPackage#getBoxGeometry()
 * @model
 * @generated
 */
public interface BoxGeometry extends Geometry {
	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' containment reference.
	 * @see #setDimension(Tuple3d)
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.Symphony__CommonTopologyDynamicsPackage#getBoxGeometry_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	Tuple3d getDimension();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.dynamics.BoxGeometry#getDimension <em>Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' containment reference.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(Tuple3d value);

} // BoxGeometry
