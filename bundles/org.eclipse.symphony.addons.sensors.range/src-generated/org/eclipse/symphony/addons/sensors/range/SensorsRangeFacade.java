/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.range;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.addons.sensors.range.impl.SensorsRangeFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensors Range Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getSensorsRangeFacade()
 * @model
 * @generated
 */
public interface SensorsRangeFacade extends EObject {
	
	/**
	 * Singleton of SensorsRangeFacade.
	 */
	public static final SensorsRangeFacade INSTANCE = SensorsRangeFacadeImpl.getInstance(); 
	
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

} // SensorsRangeFacade