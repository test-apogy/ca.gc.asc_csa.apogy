/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.gps;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GPS Data Interpreter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.GPSDataInterpreter#getGps <em>Gps</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.sensors.gps.GpsPackage#getGPSDataInterpreter()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GPSDataInterpreter extends EObject {
	/**
	 * Returns the value of the '<em><b>Gps</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.addons.sensors.gps.GPS#getDataInterpreter <em>Data Interpreter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gps</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gps</em>' container reference.
	 * @see #setGps(GPS)
	 * @see org.eclipse.symphony.addons.sensors.gps.GpsPackage#getGPSDataInterpreter_Gps()
	 * @see org.eclipse.symphony.addons.sensors.gps.GPS#getDataInterpreter
	 * @model opposite="dataInterpreter" transient="false"
	 * @generated
	 */
	GPS getGps();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.gps.GPSDataInterpreter#getGps <em>Gps</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gps</em>' container reference.
	 * @see #getGps()
	 * @generated
	 */
	void setGps(GPS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Updates the GPS's value according to interpreted values.
	 * <ul>
	 * <li>Reads data from the GPS connexion</li>
	 * <li>Interprete the data</li>
	 * <li>Update the GPS's internal values accordingly</li>
	 * </ul>
	 * <!-- end-model-doc -->
	 * @model exceptions="org.eclipse.symphony.addons.sensors.gps.IOException"
	 * @generated
	 */
	void updateGPS() throws IOException;

} // GPSDataInterpreter
