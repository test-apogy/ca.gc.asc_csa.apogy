package ca.gc.space.mrt.sensors.range.ui.adapters;

import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;

import ca.gc.space.mrt.sensors.range.RasterScanData;
import ca.gc.space.mrt.sensors.range.ui.RangeSensorsUIFactory;
import ca.gc.space.mrt.sensors.range.ui.RasterScanDataPresentation;

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
