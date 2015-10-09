package org.eclipse.symphony.addons.ui.adapters;

import org.eclipse.symphony.addons.Ruler3dToolNode;
import org.eclipse.symphony.addons.ui.Ruler3dToolNodePresentation;
import org.eclipse.symphony.addons.ui.SymphonyToolsUIFactory;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;

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
