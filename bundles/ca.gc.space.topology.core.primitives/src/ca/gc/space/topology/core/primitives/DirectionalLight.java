/**
 * <copyright>
 * </copyright>
 *
 * $Id: DirectionalLight.java,v 1.2.2.2 2015/02/03 20:01:31 rlarcheveque Exp $
 */
package ca.gc.space.topology.core.primitives;

import ca.gc.space.math.Tuple3d;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directional Light</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.topology.core.primitives.DirectionalLight#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.topology.core.primitives.PrimitivesPackage#getDirectionalLight()
 * @model
 * @generated
 */
public interface DirectionalLight extends Light {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' containment reference.
	 * @see #setDirection(Tuple3d)
	 * @see ca.gc.space.topology.core.primitives.PrimitivesPackage#getDirectionalLight_Direction()
	 * @model containment="true"
	 * @generated
	 */
	Tuple3d getDirection();

	/**
	 * Sets the value of the '{@link ca.gc.space.topology.core.primitives.DirectionalLight#getDirection <em>Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' containment reference.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Tuple3d value);

} // DirectionalLight
