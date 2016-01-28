package ca.gc.asc_csa.apogy.addons.sensors.range.ui.adapters;

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
