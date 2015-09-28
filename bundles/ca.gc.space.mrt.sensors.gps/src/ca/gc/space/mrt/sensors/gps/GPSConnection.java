/**
 * <copyright>
 * </copyright>
 *
 * $Id: GPSConnection.java,v 1.3.4.2 2015/05/21 15:49:51 pallard Exp $
 */
package ca.gc.space.mrt.sensors.gps;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GPS Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.GPSConnection#getInput <em>Input</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.GPSConnection#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.sensors.gps.GpsPackage#getGPSConnection()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GPSConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see ca.gc.space.mrt.sensors.gps.GpsPackage#getGPSConnection_Input()
	 * @model dataType="ca.gc.space.mrt.geometry.data3d.InputStream" required="true" changeable="false"
	 * @generated
	 */
	InputStream getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' attribute.
	 * @see ca.gc.space.mrt.sensors.gps.GpsPackage#getGPSConnection_Output()
	 * @model dataType="ca.gc.space.mrt.geometry.data3d.OutputStream" required="true" changeable="false"
	 * @generated
	 */
	OutputStream getOutput();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resets the connection: closesand opens the connection again.
	 * Once this method completes, new 'input' and 'output' objects are available.
	 * <!-- end-model-doc -->
	 * @model exceptions="ca.gc.space.mrt.geometry.data3d.IOException"
	 * @generated
	 */
	void reset() throws IOException;

} // GPSConnection
