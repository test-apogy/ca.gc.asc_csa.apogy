package ca.gc.asc_csa.apogy.addons.sensors.range.ui.adapters;
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

import ca.gc.asc_csa.apogy.addons.sensors.range.RasterScanData;
import ca.gc.asc_csa.apogy.addons.sensors.range.ui.ApogyAddonsSensorsRangeUIFactory;
import ca.gc.asc_csa.apogy.addons.sensors.range.ui.RasterScanDataPresentation;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

public class RasterScanDataPresentationAdapter implements NodePresentationAdapter
{


	public Class<?> getAdaptedClass()
	{		
		return RasterScanData.class;
	}


	public boolean isAdapterFor(Node node)
	{		
		return (node instanceof RasterScanData);
	}


	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}
		
		RasterScanData rasterScanData = (RasterScanData) obj;
		RasterScanDataPresentation presentationNode = ApogyAddonsSensorsRangeUIFactory.eINSTANCE.createRasterScanDataPresentation();
		presentationNode.setNode(rasterScanData);
		return presentationNode;
	}

}
