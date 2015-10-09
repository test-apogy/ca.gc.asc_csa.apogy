/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.space.mrt.sensors.pose.ui;

import org.eclipse.symphony.common.topology.ui.NodePresentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pose Sensor Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.pose.ui.PoseSensorPresentation#isFrameVisible <em>Frame Visible</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.sensors.pose.ui.SensorsPoseUIPackage#getPoseSensorPresentation()
 * @model
 * @generated
 */
public interface PoseSensorPresentation extends NodePresentation {
	/**
	 * Returns the value of the '<em><b>Frame Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame Visible</em>' attribute.
	 * @see #setFrameVisible(boolean)
	 * @see ca.gc.space.mrt.sensors.pose.ui.SensorsPoseUIPackage#getPoseSensorPresentation_FrameVisible()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isFrameVisible();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.pose.ui.PoseSensorPresentation#isFrameVisible <em>Frame Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Visible</em>' attribute.
	 * @see #isFrameVisible()
	 * @generated
	 */
	void setFrameVisible(boolean value);

} // PoseSensorPresentation
