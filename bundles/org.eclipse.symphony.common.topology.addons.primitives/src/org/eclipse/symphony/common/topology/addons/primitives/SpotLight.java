/**
 * <copyright>
 * </copyright>
 *
 * $Id: SpotLight.java,v 1.2.2.2 2015/02/03 20:01:31 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.topology.addons.primitives;

import org.eclipse.symphony.common.math.Tuple3d;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spot Light</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The SpotLight object specifies an attenuated light source at a fixed point in space that radiates light in a specified direction from the light source. A SpotLight has the same attributes as a PointLight node, with the addition of the following:
 * <ul>
 * <li>Direction - The axis of the cone of light. The default direction is (0.0, 0.0, -1.0). The spot light direction is significant only when the spread angle is not PI radians (which it is by default).</li>
 * <li>Spread angle - The angle in radians between the direction axis and a ray along the edge of the cone. Note that the angle of the cone at the apex is then twice this value. The range of values is [0.0,PI/2] radians, with a special value of PI radians. Values lower than 0 are clamped to 0 and values over PI/2 are clamped to PI. The default spread angle is PI radians.</li>
 * <li>Concentration - Specifies how quickly the light intensity attenuates as a function of the angle of radiation as measured from the direction of radiation. The light's intensity is highest at the center of the cone and is attenuated toward the edges of the cone by the cosine of the angle between the direction of the light and the direction from the light to the object being lit, raised to the power of the spot concentration exponent. The higher the concentration value, the more focused the light source. The range of values is [0.0,128.0]. The default concentration is 0.0, which provides uniform light distribution.</li>
 * </ul>
 * A spot light contributes to diffuse and specular reflections, which depend on the orientation and position of an object's surface. A spot light does not contribute to ambient reflections. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.primitives.SpotLight#getConcentration <em>Concentration</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.primitives.SpotLight#getSpreadAngle <em>Spread Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.primitives.SpotLight#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.common.topology.addons.primitives.PrimitivesPackage#getSpotLight()
 * @model
 * @generated
 */
public interface SpotLight extends PointLight {
	/**
	 * Returns the value of the '<em><b>Concentration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The light concentration.  The range of values is [0.0,128.0]. The default concentration is 0.0, which provides uniform light distribution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concentration</em>' attribute.
	 * @see #setConcentration(float)
	 * @see org.eclipse.symphony.common.topology.addons.primitives.PrimitivesPackage#getSpotLight_Concentration()
	 * @model
	 * @generated
	 */
	float getConcentration();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.primitives.SpotLight#getConcentration <em>Concentration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concentration</em>' attribute.
	 * @see #getConcentration()
	 * @generated
	 */
	void setConcentration(float value);

	/**
	 * Returns the value of the '<em><b>Spread Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The spread angle, in radians.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spread Angle</em>' attribute.
	 * @see #setSpreadAngle(float)
	 * @see org.eclipse.symphony.common.topology.addons.primitives.PrimitivesPackage#getSpotLight_SpreadAngle()
	 * @model
	 * @generated
	 */
	float getSpreadAngle();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.primitives.SpotLight#getSpreadAngle <em>Spread Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spread Angle</em>' attribute.
	 * @see #getSpreadAngle()
	 * @generated
	 */
	void setSpreadAngle(float value);

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
	 * @see org.eclipse.symphony.common.topology.addons.primitives.PrimitivesPackage#getSpotLight_Direction()
	 * @model containment="true"
	 * @generated
	 */
	Tuple3d getDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.primitives.SpotLight#getDirection <em>Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' containment reference.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Tuple3d value);

} // SpotLight