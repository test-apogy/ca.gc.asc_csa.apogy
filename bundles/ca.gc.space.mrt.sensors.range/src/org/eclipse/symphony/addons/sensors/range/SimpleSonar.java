/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleSonar.java,v 1.2.4.2 2015/05/21 15:50:22 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.range;

import ca.gc.space.mrt.sensors.fov.ConicalFieldOfView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Sonar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.SimpleSonar#isEchoDetected <em>Echo Detected</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getSimpleSonar()
 * @model
 * @generated
 */
public interface SimpleSonar extends SimpleRangeSensor
{
	/**
	 * Returns the value of the '<em><b>Echo Detected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A field of view that is defined by one angle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Echo Detected</em>' attribute.
	 * @see #setEchoDetected(boolean)
	 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getSimpleSonar_EchoDetected()
	 * @model required="true"
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
	 * @model kind="operation"
	 * @generated
	 */
	ConicalFieldOfView getFieldOfView();

} // SimpleSonar
