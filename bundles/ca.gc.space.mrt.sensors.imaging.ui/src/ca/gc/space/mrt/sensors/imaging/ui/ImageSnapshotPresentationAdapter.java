package ca.gc.space.mrt.sensors.imaging.ui;

import ca.gc.space.mrt.sensors.imaging.ImageSnapshot;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;

public class ImageSnapshotPresentationAdapter implements NodePresentationAdapter
{


	public Class<?> getAdaptedClass()
	{		
		return ImageSnapshot.class;
	}


	public boolean isAdapterFor(Node node)
	{		
		return (node instanceof ImageSnapshot);
	}

	
	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}
		
		ImageSnapshot imageSnapshot = (ImageSnapshot) obj;
		ImageSnapshotPresentation presentationNode = MRTSensorsImagingUIFactory.eINSTANCE.createImageSnapshotPresentation();
		presentationNode.setNode(imageSnapshot);
		return presentationNode;
	}

}
