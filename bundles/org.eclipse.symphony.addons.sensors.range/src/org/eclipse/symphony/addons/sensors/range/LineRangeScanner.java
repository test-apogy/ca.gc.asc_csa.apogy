/**
 * <copyright>
 * </copyright>
 *
 * $Id: LineRangeScanner.java,v 1.2.4.2 2015/05/21 15:50:22 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.range;

import ca.gc.space.mrt.sensors.fov.CircularSectorFieldOfView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Range Scanner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.LineRangeScanner#getAngularResolution <em>Angular Resolution</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getLineRangeScanner()
 * @model
 * @generated
 */
public interface LineRangeScanner extends RangeSensor
{
	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Of View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	CircularSectorFieldOfView getFieldOfView();

	/**
	 * Returns the value of the '<em><b>Angular Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angular Resolution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angular Resolution</em>' attribute.
	 * @see #setAngularResolution(int)
	 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getLineRangeScanner_AngularResolution()
	 * @model required="true"
	 * @generated
	 */
	int getAngularResolution();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.range.LineRangeScanner#getAngularResolution <em>Angular Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angular Resolution</em>' attribute.
	 * @see #getAngularResolution()
	 * @generated
	 */
	void setAngularResolution(int value);

} // LineRangeScanner
