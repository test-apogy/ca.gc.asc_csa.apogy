package ca.gc.asc_csa.apogy.addons.sensors.imaging.ui;

import ca.gc.asc_csa.apogy.addons.sensors.imaging.ImageSnapshot;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

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
		ImageSnapshotPresentation presentationNode = ApogyAddonsSensorsImagingUIFactory.eINSTANCE.createImageSnapshotPresentation();
		presentationNode.setNode(imageSnapshot);
		return presentationNode;
	}

}
