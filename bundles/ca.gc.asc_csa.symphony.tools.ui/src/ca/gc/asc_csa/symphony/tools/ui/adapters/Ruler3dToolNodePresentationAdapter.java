package ca.gc.asc_csa.symphony.tools.ui.adapters;

import ca.gc.asc_csa.symphony.tools.core.Ruler3dToolNode;
import ca.gc.asc_csa.symphony.tools.ui.Ruler3dToolNodePresentation;
import ca.gc.asc_csa.symphony.tools.ui.SymphonyToolsUIFactory;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;

public class Ruler3dToolNodePresentationAdapter implements NodePresentationAdapter
{

	public Ruler3dToolNodePresentationAdapter()
	{
	}


	public Class<?> getAdaptedClass()
	{		
		return Ruler3dToolNode.class;
	}


	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof Ruler3dToolNode;
	}


	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		Ruler3dToolNode ruler3dToolNode = (Ruler3dToolNode) obj;
		
		Ruler3dToolNodePresentation presentationNode = SymphonyToolsUIFactory.eINSTANCE.createRuler3dToolNodePresentation();
		presentationNode.setNode(ruler3dToolNode);			
						
		return presentationNode;
	}

}
