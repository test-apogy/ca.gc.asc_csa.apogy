/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.gps;

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
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.GPSConnection#getInput <em>Input</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.GPSConnection#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.sensors.gps.GpsPackage#getGPSConnection()
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
	 * @see org.eclipse.symphony.addons.sensors.gps.GpsPackage#getGPSConnection_Input()
	 * @model unique="false" dataType="org.eclipse.symphony.addons.sensors.gps.InputStream" required="true" changeable="false"
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
	 * @see org.eclipse.symphony.addons.sensors.gps.GpsPackage#getGPSConnection_Output()
	 * @model unique="false" dataType="org.eclipse.symphony.addons.sensors.gps.OutputStream" required="true" changeable="false"
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
	 * @model exceptions="org.eclipse.symphony.addons.sensors.gps.IOException"
	 * @generated
	 */
	void reset() throws IOException;

} // GPSConnection
