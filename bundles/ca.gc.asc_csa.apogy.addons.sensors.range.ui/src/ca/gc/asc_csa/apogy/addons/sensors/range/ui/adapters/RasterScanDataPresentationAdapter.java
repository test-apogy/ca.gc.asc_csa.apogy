package org.eclipse.symphony.addons.sensors.range.ui.adapters;

import org.eclipse.symphony.addons.sensors.range.RasterScanData;
import org.eclipse.symphony.addons.sensors.range.ui.Symphony__AddonsSensorsRangeUIFactory;
import org.eclipse.symphony.addons.sensors.range.ui.RasterScanDataPresentation;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;

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
		RasterScanDataPresentation presentationNode = Symphony__AddonsSensorsRangeUIFactory.eINSTANCE.createRasterScanDataPresentation();
		presentationNode.setNode(rasterScanData);
		return presentationNode;
	}

}
