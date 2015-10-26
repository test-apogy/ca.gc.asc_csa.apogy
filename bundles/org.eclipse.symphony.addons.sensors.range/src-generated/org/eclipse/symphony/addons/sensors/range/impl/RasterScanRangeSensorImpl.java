/**
 * <copyright>
 * </copyright>
 *
 * $Id: RasterScanRangeSensorImpl.java,v 1.6.4.2 2015/05/21 15:50:22 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.range.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.addons.sensors.range.Symphony__AddonsSensorsRangeFactory;
import org.eclipse.symphony.addons.sensors.range.Symphony__AddonsSensorsRangePackage;
import org.eclipse.symphony.addons.sensors.range.RasterScanRangeSensor;
import org.eclipse.symphony.addons.sensors.range.RasterScanSettings;
import org.eclipse.symphony.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Raster Scan Range Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RasterScanRangeSensorImpl extends RangeScannerImpl<RasterScanSettings> implements RasterScanRangeSensor
{
	protected RasterScanSettings rasterScanSettings = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RasterScanRangeSensorImpl()
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
		return Symphony__AddonsSensorsRangePackage.Literals.RASTER_SCAN_RANGE_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setInput(RasterScanSettings newInput) {
		super.setInput(newInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public IProgressMonitor getProgressMonitor()
	{
		if(progressMonitor == null)
		{
			setProgressMonitor(new NullProgressMonitor());
		}
		return progressMonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public synchronized RasterScanSettings getScanSettings()
	{
		if(rasterScanSettings == null)
		{
			// Search the list of children of the RasterScanRangeSensor to find a RasterScanSettings.
			EList<Node> children = getChildren();
	    	for(Node node : children)
	    	{
	    		if(node instanceof RasterScanSettings)
	    		{
	    			rasterScanSettings = (RasterScanSettings) node;	
	    		}
	    	}
	    	
	    	// If no RasterScanSettings is found, creates one.
	    	if(rasterScanSettings == null)
	    	{
	    		rasterScanSettings = Symphony__AddonsSensorsRangeFactory.eINSTANCE.createRasterScanSettings();
	    		getChildren().add(rasterScanSettings);
	    	}
		}
		
		return rasterScanSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Symphony__AddonsSensorsRangePackage.RASTER_SCAN_RANGE_SENSOR___GET_SCAN_SETTINGS:
				return getScanSettings();
		}
		return super.eInvoke(operationID, arguments);
	}

} //RasterScanRangeSensorImpl
