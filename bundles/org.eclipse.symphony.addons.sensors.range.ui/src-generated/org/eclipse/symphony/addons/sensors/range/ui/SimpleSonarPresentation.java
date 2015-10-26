/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.range.ui;

import org.eclipse.symphony.common.topology.ui.NodePresentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Sonar Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.ui.SimpleSonarPresentation#isDetectedRangeVisible <em>Detected Range Visible</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.sensors.range.ui.Symphony__AddonsSensorsRangeUIPackage#getSimpleSonarPresentation()
 * @model
 * @generated
 */
public interface SimpleSonarPresentation extends NodePresentation {
	/**
	 * Returns the value of the '<em><b>Detected Range Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detected Range Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detected Range Visible</em>' attribute.
	 * @see #setDetectedRangeVisible(boolean)
	 * @see org.eclipse.symphony.addons.sensors.range.ui.Symphony__AddonsSensorsRangeUIPackage#getSimpleSonarPresentation_DetectedRangeVisible()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isDetectedRangeVisible();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.range.ui.SimpleSonarPresentation#isDetectedRangeVisible <em>Detected Range Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detected Range Visible</em>' attribute.
	 * @see #isDetectedRangeVisible()
	 * @generated
	 */
	void setDetectedRangeVisible(boolean value);

} // SimpleSonarPresentation
