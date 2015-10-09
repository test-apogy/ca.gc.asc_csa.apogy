package ca.gc.space.mrt.sensors.imaging.ui;

import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;

import ca.gc.space.mrt.sensors.imaging.ImageSnapshot;

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
