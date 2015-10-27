/**
 * <copyright>
 * </copyright>
 *
 * $Id: Symphony__AddonsSensorsRangeFacadeImpl.java,v 1.4.4.2 2015/05/21 15:50:22 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.range.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.addons.sensors.fov.DistanceRange;
import org.eclipse.symphony.addons.sensors.fov.Symphony__AddonsSensorsFOVFacade;
import org.eclipse.symphony.addons.sensors.range.Symphony__AddonsSensorsRangeFactory;
import org.eclipse.symphony.addons.sensors.range.Symphony__AddonsSensorsRangePackage;
import org.eclipse.symphony.addons.sensors.range.RasterScanSettings;
import org.eclipse.symphony.addons.sensors.range.Symphony__AddonsSensorsRangeFacade;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensors Range Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Symphony__AddonsSensorsRangeFacadeImpl extends MinimalEObjectImpl.Container implements Symphony__AddonsSensorsRangeFacade
{
	private static Symphony__AddonsSensorsRangeFacade instance = null;
	
	public static Symphony__AddonsSensorsRangeFacade getInstance()
	{
		if (instance == null)
		{
			instance = new Symphony__AddonsSensorsRangeFacadeImpl();
		}
		
		return instance;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Symphony__AddonsSensorsRangeFacadeImpl()
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
		return Symphony__AddonsSensorsRangePackage.Literals.SYMPHONY_ADDONS_SENSORS_RANGE_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public RasterScanSettings createRasterScanSettings(double minimumDistance, double maximumDistance, double horizontalFieldOfViewAngle, double verticalFieldOfViewAngle, int horizontalResolution, int verticalResolution)
	{
		RasterScanSettings rasterScanSettings = Symphony__AddonsSensorsRangeFactory.eINSTANCE.createRasterScanSettings();
		
		DistanceRange distanceRange = Symphony__AddonsSensorsFOVFacade.INSTANCE.createDistanceRange(minimumDistance, maximumDistance);
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
		RasterScanSettings results = Symphony__AddonsSensorsRangeFactory.eINSTANCE.createRasterScanSettings();
		
		if(rasterScanSettings.getRange() != null)
		{
			DistanceRange distanceRange = Symphony__AddonsSensorsFOVFacade.INSTANCE.createDistanceRange(rasterScanSettings.getRange());
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
			case Symphony__AddonsSensorsRangePackage.SYMPHONY_ADDONS_SENSORS_RANGE_FACADE___CREATE_RASTER_SCAN_SETTINGS__DOUBLE_DOUBLE_DOUBLE_DOUBLE_INT_INT:
				return createRasterScanSettings((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2), (Double)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
			case Symphony__AddonsSensorsRangePackage.SYMPHONY_ADDONS_SENSORS_RANGE_FACADE___CREATE_RASTER_SCAN_SETTINGS__RASTERSCANSETTINGS:
				return createRasterScanSettings((RasterScanSettings)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //Symphony__AddonsSensorsRangeFacadeImpl
