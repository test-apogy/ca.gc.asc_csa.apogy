package ca.gc.asc_csa.apogy.addons.ui.adapters;

import ca.gc.asc_csa.apogy.addons.Ruler3dToolNode;
import ca.gc.asc_csa.apogy.addons.ui.Ruler3dToolNodePresentation;
import ca.gc.asc_csa.apogy.addons.ui.ApogyAddonsUIFactory;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

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
		
		Ruler3dToolNodePresentation presentationNode = ApogyAddonsUIFactory.eINSTANCE.createRuler3dToolNodePresentation();
		presentationNode.setNode(ruler3dToolNode);			
						
		return presentationNode;
	}

}
