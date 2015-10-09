package ca.gc.space.mrt.geometry.data25d.ui.adapters;

import org.eclipse.symphony.common.geometry.data25d.VolumetricCoordinatesSet25D;
import org.eclipse.symphony.common.geometry.data25d.ui.Data25DUIFactory;
import org.eclipse.symphony.common.geometry.data25d.ui.VolumetricCoordinatesSet25DPresentation;

import ca.gc.space.topology.ContentNode;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;

public class VolumetricCoordinatesSet25DPresentationAdapter implements NodePresentationAdapter
{
	public VolumetricCoordinatesSet25DPresentationAdapter()
	{
	}

	@Override
	public boolean isAdapterFor(Node node)
	{
		boolean suitable = false;
		if (node instanceof ContentNode)
		{
			ContentNode<?> cNode = (ContentNode<?>) node;

			suitable = cNode.getContent() instanceof VolumetricCoordinatesSet25D;
		}
		return suitable;
	}

	@Override
	public Class<?> getAdaptedClass()
	{
		return VolumetricCoordinatesSet25D.class;
	}

	@SuppressWarnings("unchecked")
	@Override
	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj))
		{
			throw new IllegalArgumentException();
		}

		ContentNode<VolumetricCoordinatesSet25D> cNode = (ContentNode<VolumetricCoordinatesSet25D>) obj;

		VolumetricCoordinatesSet25DPresentation presentationNode = Data25DUIFactory.eINSTANCE.createVolumetricCoordinatesSet25DPresentation();
		presentationNode.setNode(cNode);
		
		presentationNode.setPointsCloud(cNode.getContent());

		return presentationNode;
	}
}
