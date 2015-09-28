package ca.gc.asc_csa.symphony.tools.ui.adapters;

import ca.gc.asc_csa.symphony.tools.core.SunVector3DToolNode;
import ca.gc.asc_csa.symphony.tools.ui.SunVector3DToolNodePresentation;
import ca.gc.asc_csa.symphony.tools.ui.SymphonyToolsUIFactory;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;

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
