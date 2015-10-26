/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleRasterScanRangeScannerImpl.java,v 1.3.4.2 2015/05/21 15:50:21 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.range.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.addons.sensors.range.RangePackage;
import org.eclipse.symphony.addons.sensors.range.RasterScanSettings;
import org.eclipse.symphony.addons.sensors.range.SensorsRangeFacade;
import org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScanner;
import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.TopologyFacade;
import org.eclipse.symphony.common.topology.TransformNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Raster Scan Range Scanner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SimpleRasterScanRangeScannerImpl extends RasterScanRangeSensorImpl implements SimpleRasterScanRangeScanner
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleRasterScanRangeScannerImpl()
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
		return RangePackage.Literals.SIMPLE_RASTER_SCAN_RANGE_SCANNER;
	}

	@Override
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
	    		else if(node instanceof GroupNode)
	    		{
	    			GroupNode groupNode = (GroupNode) node;
	    			EList<Node> groupChildren = groupNode.getChildren();
	    			for(Node n : groupChildren)
	    			{
	    				if(n instanceof RasterScanSettings)
	    	    		{
	    	    			rasterScanSettings = (RasterScanSettings) node;	
	    	    		}
	    			}
	    		}
	    			
	    	}
	    	
	    	// If no RasterScanSettings is found, creates one.
	    	if(rasterScanSettings == null)
	    	{
	    		// Creates a transform node to position and orient the fov.
	    		TransformNode transformNode = TopologyFacade.INSTANCE.createTransformNodeXYZ(0, 0, 0, 0, Math.toRadians(90), 0);
	    		transformNode.setDescription("Field Of View Transform");
	    		getChildren().add(transformNode);
	    		
	    		// Adds the rasterscan to the transform.
	    		rasterScanSettings = SensorsRangeFacade.INSTANCE.createRasterScanSettings(0, 100.0, Math.toRadians(90), Math.toRadians(90), 100, 100);
	    		transformNode.getChildren().add(rasterScanSettings);
	    	}
		}
		
		return rasterScanSettings;
	}
	
	@Override
	public void setInput(RasterScanSettings newInput) 
	{
		RasterScanSettings currentScanSettings = getScanSettings();
		currentScanSettings.setDescription(newInput.getDescription());
		currentScanSettings.setHorizontalFieldOfViewAngle(newInput.getHorizontalFieldOfViewAngle());
		currentScanSettings.setHorizontalResolution(newInput.getHorizontalResolution());
		currentScanSettings.setRange(newInput.getRange());
		currentScanSettings.setVerticalFieldOfViewAngle(newInput.getVerticalFieldOfViewAngle());
		currentScanSettings.setVerticalResolution(newInput.getVerticalResolution());		
		super.setInput(newInput);
	}
} //SimpleRasterScanRangeScannerImpl
