package ca.gc.asc_csa.apogy.addons.sensors.gps;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

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
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSDataInterpreter#getGps <em>Gps</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.ApogyAddonsSensorsGPSPackage#getGPSDataInterpreter()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GPSDataInterpreter extends EObject {
	/**
	 * Returns the value of the '<em><b>Gps</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPS#getDataInterpreter <em>Data Interpreter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gps</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gps</em>' container reference.
	 * @see #setGps(GPS)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.ApogyAddonsSensorsGPSPackage#getGPSDataInterpreter_Gps()
	 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.GPS#getDataInterpreter
	 * @model opposite="dataInterpreter" transient="false"
	 * @generated
	 */
	GPS getGps();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.gps.GPSDataInterpreter#getGps <em>Gps</em>}' container reference.
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
	 * @model exceptions="ca.gc.asc_csa.apogy.addons.sensors.gps.IOException"
	 * @generated
	 */
	void updateGPS() throws IOException;

} // GPSDataInterpreter
