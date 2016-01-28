/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons;

import javax.vecmath.Color3f;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sun Vector3 DTool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A 3D tool used to show the direction and intensity of the Sun.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.SunVector3DTool#getVectorColor <em>Vector Color</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.SunVector3DTool#getVectorLength <em>Vector Length</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.SunVector3DTool#getEndPointRadius <em>End Point Radius</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.SunVector3DTool#getSunIntensity <em>Sun Intensity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.SunVector3DTool#getCurrentDayMaximumSunIntensity <em>Current Day Maximum Sun Intensity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.SunVector3DTool#getCurrentSunIntensityPercentage <em>Current Sun Intensity Percentage</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.SunVector3DTool#getSunVector3DToolNode <em>Sun Vector3 DTool Node</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getSunVector3DTool()
 * @model
 * @generated
 */
public interface SunVector3DTool extends AbstractTwoPoints3DTool {
	/**
	 * Returns the value of the '<em><b>Vector Color</b></em>' attribute.
	 * The default value is <code>"1.0,1.0,0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The vector color.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vector Color</em>' attribute.
	 * @see #setVectorColor(Color3f)
	 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getSunVector3DTool_VectorColor()
	 * @model default="1.0,1.0,0.0" unique="false" dataType="org.eclipse.symphony.addons.Color3f"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='SUN_VECTOR_PROPERTIES'"
	 * @generated
	 */
	Color3f getVectorColor();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.SunVector3DTool#getVectorColor <em>Vector Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector Color</em>' attribute.
	 * @see #getVectorColor()
	 * @generated
	 */
	void setVectorColor(Color3f value);

	/**
	 * Returns the value of the '<em><b>Vector Length</b></em>' attribute.
	 * The default value is <code>"10.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Length of the vector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vector Length</em>' attribute.
	 * @see #setVectorLength(double)
	 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getSunVector3DTool_VectorLength()
	 * @model default="10.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' symphony_units='m' propertyCategory='SUN_VECTOR_PROPERTIES'"
	 * @generated
	 */
	double getVectorLength();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.SunVector3DTool#getVectorLength <em>Vector Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector Length</em>' attribute.
	 * @see #getVectorLength()
	 * @generated
	 */
	void setVectorLength(double value);

	/**
	 * Returns the value of the '<em><b>End Point Radius</b></em>' attribute.
	 * The default value is <code>"0.01"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Radius of sphere used as end point to vector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Point Radius</em>' attribute.
	 * @see #setEndPointRadius(double)
	 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getSunVector3DTool_EndPointRadius()
	 * @model default="0.01" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' symphony_units='m' propertyCategory='SUN_VECTOR_PROPERTIES'"
	 * @generated
	 */
	double getEndPointRadius();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.SunVector3DTool#getEndPointRadius <em>End Point Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Point Radius</em>' attribute.
	 * @see #getEndPointRadius()
	 * @generated
	 */
	void setEndPointRadius(double value);

	/**
	 * Returns the value of the '<em><b>Sun Intensity</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sun Intensity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The current sun intensity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sun Intensity</em>' attribute.
	 * @see #setSunIntensity(double)
	 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getSunVector3DTool_SunIntensity()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' symphony_units='W/m*m' property='Readonly' propertyCategory='SUN_VECTOR_LIGHT_PROPERTIES'"
	 * @generated
	 */
	double getSunIntensity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.SunVector3DTool#getSunIntensity <em>Sun Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sun Intensity</em>' attribute.
	 * @see #getSunIntensity()
	 * @generated
	 */
	void setSunIntensity(double value);

	/**
	 * Returns the value of the '<em><b>Current Day Maximum Sun Intensity</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The current day maximum sun intensity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Day Maximum Sun Intensity</em>' attribute.
	 * @see #setCurrentDayMaximumSunIntensity(double)
	 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getSunVector3DTool_CurrentDayMaximumSunIntensity()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' symphony_units='W/m*m' property='Readonly' propertyCategory='SUN_VECTOR_LIGHT_PROPERTIES'"
	 * @generated
	 */
	double getCurrentDayMaximumSunIntensity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.SunVector3DTool#getCurrentDayMaximumSunIntensity <em>Current Day Maximum Sun Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Day Maximum Sun Intensity</em>' attribute.
	 * @see #getCurrentDayMaximumSunIntensity()
	 * @generated
	 */
	void setCurrentDayMaximumSunIntensity(double value);

	/**
	 * Returns the value of the '<em><b>Current Sun Intensity Percentage</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The current sun intensity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Sun Intensity Percentage</em>' attribute.
	 * @see #setCurrentSunIntensityPercentage(double)
	 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getSunVector3DTool_CurrentSunIntensityPercentage()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' symphony_units='%' property='Readonly' propertyCategory='SUN_VECTOR_LIGHT_PROPERTIES'"
	 * @generated
	 */
	double getCurrentSunIntensityPercentage();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.SunVector3DTool#getCurrentSunIntensityPercentage <em>Current Sun Intensity Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Sun Intensity Percentage</em>' attribute.
	 * @see #getCurrentSunIntensityPercentage()
	 * @generated
	 */
	void setCurrentSunIntensityPercentage(double value);

	/**
	 * Returns the value of the '<em><b>Sun Vector3 DTool Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.addons.SunVector3DToolNode#getSunVector3DTool <em>Sun Vector3 DTool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Topology Node associated with the tool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sun Vector3 DTool Node</em>' reference.
	 * @see #setSunVector3DToolNode(SunVector3DToolNode)
	 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getSunVector3DTool_SunVector3DToolNode()
	 * @see org.eclipse.symphony.addons.SunVector3DToolNode#getSunVector3DTool
	 * @model opposite="sunVector3DTool" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='true' property='Readonly' propertyCategory='SUN_VECTOR_PROPERTIES'"
	 * @generated
	 */
	SunVector3DToolNode getSunVector3DToolNode();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.SunVector3DTool#getSunVector3DToolNode <em>Sun Vector3 DTool Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sun Vector3 DTool Node</em>' reference.
	 * @see #getSunVector3DToolNode()
	 * @generated
	 */
	void setSunVector3DToolNode(SunVector3DToolNode value);

} // SunVector3DTool
