package ca.gc.asc_csa.apogy.addons.sensors.range;
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
import ca.gc.asc_csa.apogy.addons.sensors.range.impl.ApogyAddonsSensorsRangeFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensors Range Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangePackage#getApogyAddonsSensorsRangeFacade()
 * @model
 * @generated
 */
public interface ApogyAddonsSensorsRangeFacade extends EObject {
	
	/**
	 * Singleton of ApogyAddonsSensorsRangeFacade.
	 */
	public static final ApogyAddonsSensorsRangeFacade INSTANCE = ApogyAddonsSensorsRangeFacadeImpl.getInstance(); 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" minimumDistanceUnique="false" maximumDistanceUnique="false" horizontalFieldOfViewAngleUnique="false" verticalFieldOfViewAngleUnique="false" horizontalResolutionUnique="false" verticalResolutionUnique="false"
	 * @generated
	 */
	RasterScanSettings createRasterScanSettings(double minimumDistance, double maximumDistance, double horizontalFieldOfViewAngle, double verticalFieldOfViewAngle, int horizontalResolution, int verticalResolution);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" rasterScanSettingsUnique="false"
	 * @generated
	 */
	RasterScanSettings createRasterScanSettings(RasterScanSettings rasterScanSettings);

} // ApogyAddonsSensorsRangeFacade
