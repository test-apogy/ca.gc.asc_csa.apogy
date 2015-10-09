/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.pose.ui;

import org.eclipse.symphony.common.topology.ui.NodePresentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position Sensor Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.pose.ui.PositionSensorPresentation#isFrameVisible <em>Frame Visible</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.sensors.pose.ui.SensorsPoseUIPackage#getPositionSensorPresentation()
 * @model
 * @generated
 */
public interface PositionSensorPresentation extends NodePresentation {
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
	 * @see org.eclipse.symphony.addons.sensors.pose.ui.SensorsPoseUIPackage#getPositionSensorPresentation_FrameVisible()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isFrameVisible();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.pose.ui.PositionSensorPresentation#isFrameVisible <em>Frame Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Visible</em>' attribute.
	 * @see #isFrameVisible()
	 * @generated
	 */
	void setFrameVisible(boolean value);

} // PositionSensorPresentation