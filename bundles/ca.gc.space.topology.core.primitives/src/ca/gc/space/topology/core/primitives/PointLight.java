/**
 * <copyright>
 * </copyright>
 *
 * $Id: PointLight.java,v 1.3.2.2 2015/02/03 20:01:32 rlarcheveque Exp $
 */
package ca.gc.space.topology.core.primitives;

import org.eclipse.symphony.common.math.Tuple3d;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Light</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The PointLight object specifies an attenuated light source at a fixed point in space that radiates light equally in all directions away from the light source. PointLight has the same attributes as a Light node, with the addition of location and attenuation parameters.
 * 
 * A point light contributes to diffuse and specular reflections, which in turn depend on the orientation and position of a surface. A point light does not contribute to ambient reflections.
 * 
 * A PointLight is attenuated by multiplying the contribution of the light by an attenuation factor. The attenuation factor causes the the PointLight's brightness to decrease as distance from the light source increases. A PointLight's attenuation factor contains three values:
 * <ul>
 * <li>Constant attenuation</li>
 * <li>Linear attenuation</li>
 * <li>Quadratic attenuation</li>
 * </ul>
 * A PointLight is attenuated by the reciprocal of the sum of:
 * <ul>
 * <li>The constant attenuation factor</li>
 * <li>The Linear attenuation factor times the distance between the light and the vertex being illuminated</li>
 * <li>The quadratic attenuation factor times the square of the distance between the light and the vertex </li>
 * </ul>
 * By default, the constant attenuation value is 1 and the other two values are 0, resulting in no attenuation. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.topology.core.primitives.PointLight#getPosition <em>Position</em>}</li>
 *   <li>{@link ca.gc.space.topology.core.primitives.PointLight#getAttenuation <em>Attenuation</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.topology.core.primitives.PrimitivesPackage#getPointLight()
 * @model
 * @generated
 */
public interface PointLight extends Light {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Tuple3d)
	 * @see ca.gc.space.topology.core.primitives.PrimitivesPackage#getPointLight_Position()
	 * @model containment="true"
	 * @generated
	 */
	Tuple3d getPosition();

	/**
	 * Sets the value of the '{@link ca.gc.space.topology.core.primitives.PointLight#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Tuple3d value);

	/**
	 * Returns the value of the '<em><b>Attenuation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attenuation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attenuation</em>' containment reference.
	 * @see #setAttenuation(Tuple3d)
	 * @see ca.gc.space.topology.core.primitives.PrimitivesPackage#getPointLight_Attenuation()
	 * @model containment="true"
	 * @generated
	 */
	Tuple3d getAttenuation();

	/**
	 * Sets the value of the '{@link ca.gc.space.topology.core.primitives.PointLight#getAttenuation <em>Attenuation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attenuation</em>' containment reference.
	 * @see #getAttenuation()
	 * @generated
	 */
	void setAttenuation(Tuple3d value);

} // PointLight
