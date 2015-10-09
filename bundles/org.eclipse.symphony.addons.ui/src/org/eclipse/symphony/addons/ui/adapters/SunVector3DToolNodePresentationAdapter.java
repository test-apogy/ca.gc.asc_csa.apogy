package org.eclipse.symphony.addons.ui.adapters;

import org.eclipse.symphony.addons.SunVector3DToolNode;
import org.eclipse.symphony.addons.ui.SunVector3DToolNodePresentation;
import org.eclipse.symphony.addons.ui.SymphonyToolsUIFactory;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;

public class SunVector3DToolNodePresentationAdapter implements NodePresentationAdapter
{

	public SunVector3DToolNodePresentationAdapter()
	{
	}


	public Class<?> getAdaptedClass()
	{		
		return SunVector3DToolNode.class;
	}


	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof SunVector3DToolNode;
	}


	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		SunVector3DToolNode ruler3dToolNode = (SunVector3DToolNode) obj;
		
		SunVector3DToolNodePresentation presentationNode = SymphonyToolsUIFactory.eINSTANCE.createSunVector3DToolNodePresentation();
		presentationNode.setNode(ruler3dToolNode);			
						
		return presentationNode;
	}

}
