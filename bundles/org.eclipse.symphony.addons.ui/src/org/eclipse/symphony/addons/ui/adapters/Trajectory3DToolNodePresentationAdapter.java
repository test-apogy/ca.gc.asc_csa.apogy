package org.eclipse.symphony.addons.ui.adapters;

import org.eclipse.symphony.addons.Trajectory3DToolNode;
import org.eclipse.symphony.addons.ui.SymphonyToolsUIFactory;
import org.eclipse.symphony.addons.ui.Trajectory3DToolNodePresentation;

import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;

public class Trajectory3DToolNodePresentationAdapter implements NodePresentationAdapter
{

	public Trajectory3DToolNodePresentationAdapter()
	{
	}

	public Class<?> getAdaptedClass()
	{		
		return Trajectory3DToolNode.class;
	}


	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof Trajectory3DToolNode;
	}


	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		Trajectory3DToolNode trajectory3DToolNode = (Trajectory3DToolNode) obj;		
		Trajectory3DToolNodePresentation presentationNode = SymphonyToolsUIFactory.eINSTANCE.createTrajectory3DToolNodePresentation();
		presentationNode.setNode(trajectory3DToolNode);			
						
		return presentationNode;
	}

}
