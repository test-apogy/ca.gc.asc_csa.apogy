/**
 * <copyright>
 * </copyright>
 *
 * $Id: SensorsRangeFacade.java,v 1.2.4.2 2015/05/21 15:50:22 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.range;

import org.eclipse.emf.ecore.EObject;

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
public interface SensorsRangeFacade extends EObject
{
	/**
	 * Singleton of SensorsRangeFacade.
	 */
	public static final SensorsRangeFacade INSTANCE = RangeFactory.eINSTANCE.createSensorsRangeFacade(); 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	RasterScanSettings createRasterScanSettings(double minimumDistance, double maximumDistance, double horizontalFieldOfViewAngle, double verticalFieldOfViewAngle, int horizontalResolution, int verticalResolution);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	RasterScanSettings createRasterScanSettings(RasterScanSettings rasterScanSettings);

} // SensorsRangeFacade
