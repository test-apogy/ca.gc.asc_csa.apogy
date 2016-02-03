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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangePackage;
import ca.gc.asc_csa.apogy.addons.sensors.range.RasterScanSettings;
import ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangeFacade;
import ca.gc.asc_csa.apogy.addons.sensors.range.SimpleRasterScanRangeScanner;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.common.topology.TransformNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Raster Scan Range Scanner</b></em>'.
 * <!-- end-user-doc -->
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
		return ApogyAddonsSensorsRangePackage.Literals.SIMPLE_RASTER_SCAN_RANGE_SCANNER;
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
	    		TransformNode transformNode = ApogyCommonTopologyFacade.INSTANCE.createTransformNodeXYZ(0, 0, 0, 0, Math.toRadians(90), 0);
	    		transformNode.setDescription("Field Of View Transform");
	    		getChildren().add(transformNode);
	    		
	    		// Adds the rasterscan to the transform.
	    		rasterScanSettings = ApogyAddonsSensorsRangeFacade.INSTANCE.createRasterScanSettings(0, 100.0, Math.toRadians(90), Math.toRadians(90), 100, 100);
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
