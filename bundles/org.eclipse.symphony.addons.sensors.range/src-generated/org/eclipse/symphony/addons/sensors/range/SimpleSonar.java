/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.range;

import org.eclipse.symphony.addons.sensors.fov.ConicalFieldOfView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Sonar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.SimpleSonar#isEchoDetected <em>Echo Detected</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.sensors.range.Symphony__AddonsSensorsRangePackage#getSimpleSonar()
 * @model
 * @generated
 */
public interface SimpleSonar extends SimpleRangeSensor {
	/**
	 * Returns the value of the '<em><b>Echo Detected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A field of view that is defined by one angle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Echo Detected</em>' attribute.
	 * @see #setEchoDetected(boolean)
	 * @see org.eclipse.symphony.addons.sensors.range.Symphony__AddonsSensorsRangePackage#getSimpleSonar_EchoDetected()
	 * @model unique="false"
	 * @generated
	 */
	boolean isEchoDetected();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.range.SimpleSonar#isEchoDetected <em>Echo Detected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Echo Detected</em>' attribute.
	 * @see #isEchoDetected()
	 * @generated
	 */
	void setEchoDetected(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	ConicalFieldOfView getFieldOfView();

} // SimpleSonar
