/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.fov;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conical Field Of View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A conical field of view defined by its apex angle.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.fov.ConicalFieldOfView#getRange <em>Range</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.fov.ConicalFieldOfView#getFieldOfViewAngle <em>Field Of View Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.fov.ConicalFieldOfView#getVolume <em>Volume</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.sensors.fov.FovPackage#getConicalFieldOfView()
 * @model
 * @generated
 */
public interface ConicalFieldOfView extends FieldOfView {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(DistanceRange)
	 * @see org.eclipse.symphony.addons.sensors.fov.FovPackage#getConicalFieldOfView_Range()
	 * @model containment="true"
	 * @generated
	 */
	DistanceRange getRange();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.fov.ConicalFieldOfView#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(DistanceRange value);

	/**
	 * Returns the value of the '<em><b>Field Of View Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The apex angle, in radians, of the conical field of view.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Field Of View Angle</em>' attribute.
	 * @see #setFieldOfViewAngle(double)
	 * @see org.eclipse.symphony.addons.sensors.fov.FovPackage#getConicalFieldOfView_FieldOfViewAngle()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
	double getFieldOfViewAngle();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.fov.ConicalFieldOfView#getFieldOfViewAngle <em>Field Of View Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Of View Angle</em>' attribute.
	 * @see #getFieldOfViewAngle()
	 * @generated
	 */
	void setFieldOfViewAngle(double value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The volume of the contained within the field of view.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see org.eclipse.symphony.addons.sensors.fov.FovPackage#getConicalFieldOfView_Volume()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getVolume();

} // ConicalFieldOfView
