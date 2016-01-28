/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.range;

import ca.gc.asc_csa.apogy.addons.sensors.fov.CircularSectorFieldOfView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Range Scanner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.range.LineRangeScanner#getAngularResolution <em>Angular Resolution</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangePackage#getLineRangeScanner()
 * @model
 * @generated
 */
public interface LineRangeScanner extends RangeSensor {
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
	 * @see ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangePackage#getLineRangeScanner_AngularResolution()
	 * @model unique="false"
	 * @generated
	 */
	int getAngularResolution();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.range.LineRangeScanner#getAngularResolution <em>Angular Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angular Resolution</em>' attribute.
	 * @see #getAngularResolution()
	 * @generated
	 */
	void setAngularResolution(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	CircularSectorFieldOfView getFieldOfView();

} // LineRangeScanner
