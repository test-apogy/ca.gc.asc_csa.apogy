/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.apogy.examples.camera.apogy;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PTU Camera Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is the data required in order to initialize (or
 * reinitialized) the basic camera implementations.  This will
 * be used by the relevant API adapter, which in this case
 * is {@link PTUCameraApogySystenApiAdapter}.
 * @see #PTUCameraApogySystemApiAdapter
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.camera.apogy.PTUCameraData#getPanAngle <em>Pan Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.camera.apogy.PTUCameraData#getTiltAngle <em>Tilt Angle</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.camera.apogy.ApogyExamplesCameraApogyPackage#getPTUCameraData()
 * @model
 * @generated
 */
public interface PTUCameraData extends CameraData
{
  /**
	 * Returns the value of the '<em><b>Pan Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the current pan angle of the Pan-Tilt Unit (PTU)
	 * that the camera is mounted on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pan Angle</em>' attribute.
	 * @see #setPanAngle(double)
	 * @see ca.gc.asc_csa.apogy.examples.camera.apogy.ApogyExamplesCameraApogyPackage#getPTUCameraData_PanAngle()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='deg' notify='true' property='Editable' propertyCategory='PTU Angles'"
	 * @generated
	 */
	double getPanAngle();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.camera.apogy.PTUCameraData#getPanAngle <em>Pan Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pan Angle</em>' attribute.
	 * @see #getPanAngle()
	 * @generated
	 */
	void setPanAngle(double value);

	/**
	 * Returns the value of the '<em><b>Tilt Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the current tilt angle of the Pan-Tilt Unit (PTU)
	 * that the camera is mounted on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tilt Angle</em>' attribute.
	 * @see #setTiltAngle(double)
	 * @see ca.gc.asc_csa.apogy.examples.camera.apogy.ApogyExamplesCameraApogyPackage#getPTUCameraData_TiltAngle()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='deg' notify='true' property='Editable' propertyCategory='PTU Angles'"
	 * @generated
	 */
	double getTiltAngle();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.camera.apogy.PTUCameraData#getTiltAngle <em>Tilt Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tilt Angle</em>' attribute.
	 * @see #getTiltAngle()
	 * @generated
	 */
	void setTiltAngle(double value);

} // PTUCameraData