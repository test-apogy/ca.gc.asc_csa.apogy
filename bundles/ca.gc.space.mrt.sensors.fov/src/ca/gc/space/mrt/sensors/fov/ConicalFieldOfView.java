/**
 * Canadian Space Agency 2007.
 *
 * $Id: ConicalFieldOfView.java,v 1.2.4.2 2015/05/21 15:51:25 pallard Exp $
 */
package ca.gc.space.mrt.sensors.fov;


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
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.fov.ConicalFieldOfView#getFieldOfViewAngle <em>Field Of View Angle</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.fov.ConicalFieldOfView#getRange <em>Range</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.fov.ConicalFieldOfView#getVolume <em>Volume</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.sensors.fov.FovPackage#getConicalFieldOfView()
 * @model
 * @generated
 */
public interface ConicalFieldOfView extends FieldOfView {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

	/**
	 * Returns the value of the '<em><b>Field Of View Angle</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The apex angle of the conical field of view.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Field Of View Angle</em>' attribute.
	 * @see #setFieldOfViewAngle(double)
	 * @see ca.gc.space.mrt.sensors.fov.FovPackage#getConicalFieldOfView_FieldOfViewAngle()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	double getFieldOfViewAngle();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.fov.ConicalFieldOfView#getFieldOfViewAngle <em>Field Of View Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Of View Angle</em>' attribute.
	 * @see #getFieldOfViewAngle()
	 * @generated
	 */
	void setFieldOfViewAngle(double value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(DistanceRange)
	 * @see ca.gc.space.mrt.sensors.fov.FovPackage#getConicalFieldOfView_Range()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DistanceRange getRange();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.fov.ConicalFieldOfView#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(DistanceRange value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The volume of the contained within the field of view.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see ca.gc.space.mrt.sensors.fov.FovPackage#getConicalFieldOfView_Volume()
	 * @model default="0.0" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getVolume();

} // ConicalFieldOfView
