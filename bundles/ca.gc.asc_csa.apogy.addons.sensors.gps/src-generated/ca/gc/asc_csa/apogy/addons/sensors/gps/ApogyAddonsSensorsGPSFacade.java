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

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.addons.sensors.gps.impl.ApogyAddonsSensorsGPSFacadeImpl;
import ca.gc.asc_csa.apogy.common.geometry.data3d.PositionMarker;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GPS Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.gps.ApogyAddonsSensorsGPSPackage#getApogyAddonsSensorsGPSFacade()
 * @model
 * @generated
 */
public interface ApogyAddonsSensorsGPSFacade extends EObject {

	public static final ApogyAddonsSensorsGPSFacade INSTANCE = ApogyAddonsSensorsGPSFacadeImpl.getInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" originLatitudeUnique="false" originLongitudeUnique="false"
	 * @generated
	 */
	GPSPoseSensor createGPSPoseSensor(double originLatitude, double originLongitude);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" markerUnique="false"
	 * @generated
	 */
	MarkedGPS createMarkedGPS(PositionMarker marker);

} // ApogyAddonsSensorsGPSFacade
