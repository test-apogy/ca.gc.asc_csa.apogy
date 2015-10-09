/**
 * Canadian Space Agency 2007.
 *
 * $Id: PoseDataLogger.java,v 1.3.4.2 2015/05/21 15:51:31 pallard Exp $
 */
package ca.gc.space.mrt.sensors.pose;

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
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.pose.PoseDataLogger#getOutputFile <em>Output File</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.sensors.pose.PosePackage#getPoseDataLogger()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface PoseDataLogger extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

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
	 * @see ca.gc.space.mrt.sensors.pose.PosePackage#getPoseDataLogger_OutputFile()
	 * @model
	 * @generated
	 */
	String getOutputFile();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.pose.PoseDataLogger#getOutputFile <em>Output File</em>}' attribute.
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
	 * @model exceptions="org.eclipse.symphony.common.geometry.data3d.IOException"
	 * @generated
	 */
	void logPose(Pose pose) throws IOException;

} // PoseDataLogger
