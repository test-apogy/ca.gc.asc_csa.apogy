/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.pose;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.symphony.common.geometry.data3d.Pose;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Logger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.pose.PoseDataLogger#getOutputFile <em>Output File</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.sensors.pose.PosePackage#getPoseDataLogger()
 * @model abstract="true"
 * @generated
 */
public interface PoseDataLogger extends EObject {
	/**
	 * Returns the value of the '<em><b>Output File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output File</em>' attribute.
	 * @see #setOutputFile(String)
	 * @see org.eclipse.symphony.addons.sensors.pose.PosePackage#getPoseDataLogger_OutputFile()
	 * @model unique="false"
	 * @generated
	 */
	String getOutputFile();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.pose.PoseDataLogger#getOutputFile <em>Output File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output File</em>' attribute.
	 * @see #getOutputFile()
	 * @generated
	 */
	void setOutputFile(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.symphony.addons.sensors.pose.IOException" poseUnique="false"
	 * @generated
	 */
	void logPose(Pose pose) throws IOException;

} // PoseDataLogger
