package ca.gc.asc_csa.apogy.addons.sensors.range.impl;
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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.addons.sensors.fov.DistanceRange;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVFacade;
import ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangeFactory;
import ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangePackage;
import ca.gc.asc_csa.apogy.addons.sensors.range.RasterScanSettings;
import ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangeFacade;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensors Range Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyAddonsSensorsRangeFacadeImpl extends MinimalEObjectImpl.Container implements ApogyAddonsSensorsRangeFacade
{
	private static ApogyAddonsSensorsRangeFacade instance = null;
	
	public static ApogyAddonsSensorsRangeFacade getInstance()
	{
		if (instance == null)
		{
			instance = new ApogyAddonsSensorsRangeFacadeImpl();
		}
		
		return instance;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyAddonsSensorsRangeFacadeImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ApogyAddonsSensorsRangePackage.Literals.APOGY_ADDONS_SENSORS_RANGE_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public RasterScanSettings createRasterScanSettings(double minimumDistance, double maximumDistance, double horizontalFieldOfViewAngle, double verticalFieldOfViewAngle, int horizontalResolution, int verticalResolution)
	{
		RasterScanSettings rasterScanSettings = ApogyAddonsSensorsRangeFactory.eINSTANCE.createRasterScanSettings();
		
		DistanceRange distanceRange = ApogyAddonsSensorsFOVFacade.INSTANCE.createDistanceRange(minimumDistance, maximumDistance);
		rasterScanSettings.setRange(distanceRange);
		
		rasterScanSettings.setHorizontalFieldOfViewAngle(horizontalFieldOfViewAngle);
		rasterScanSettings.setVerticalFieldOfViewAngle(verticalFieldOfViewAngle);
		
		rasterScanSettings.setHorizontalResolution(horizontalResolution);
		rasterScanSettings.setVerticalResolution(verticalResolution);
		
		return rasterScanSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public RasterScanSettings createRasterScanSettings(RasterScanSettings rasterScanSettings)
	{
		RasterScanSettings results = ApogyAddonsSensorsRangeFactory.eINSTANCE.createRasterScanSettings();
		
		if(rasterScanSettings.getRange() != null)
		{
			DistanceRange distanceRange = ApogyAddonsSensorsFOVFacade.INSTANCE.createDistanceRange(rasterScanSettings.getRange());
			results.setRange(distanceRange);
		}
		
		results.setHorizontalFieldOfViewAngle(rasterScanSettings.getHorizontalFieldOfViewAngle());
		results.setVerticalFieldOfViewAngle(rasterScanSettings.getVerticalFieldOfViewAngle());
		
		results.setHorizontalResolution(rasterScanSettings.getHorizontalResolution());
		results.setVerticalResolution(rasterScanSettings.getVerticalResolution());				
		
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyAddonsSensorsRangePackage.APOGY_ADDONS_SENSORS_RANGE_FACADE___CREATE_RASTER_SCAN_SETTINGS__DOUBLE_DOUBLE_DOUBLE_DOUBLE_INT_INT:
				return createRasterScanSettings((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2), (Double)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
			case ApogyAddonsSensorsRangePackage.APOGY_ADDONS_SENSORS_RANGE_FACADE___CREATE_RASTER_SCAN_SETTINGS__RASTERSCANSETTINGS:
				return createRasterScanSettings((RasterScanSettings)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ApogyAddonsSensorsRangeFacadeImpl
