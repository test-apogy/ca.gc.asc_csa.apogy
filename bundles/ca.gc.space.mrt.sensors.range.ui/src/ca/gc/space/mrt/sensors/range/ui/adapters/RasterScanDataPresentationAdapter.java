package ca.gc.space.mrt.sensors.range.ui.adapters;

import ca.gc.space.mrt.sensors.range.RasterScanData;
import ca.gc.space.mrt.sensors.range.ui.RangeSensorsUIFactory;
import ca.gc.space.mrt.sensors.range.ui.RasterScanDataPresentation;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;

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
		RasterScanDataPresentation presentationNode = RangeSensorsUIFactory.eINSTANCE.createRasterScanDataPresentation();
		presentationNode.setNode(rasterScanData);
		return presentationNode;
	}

}
