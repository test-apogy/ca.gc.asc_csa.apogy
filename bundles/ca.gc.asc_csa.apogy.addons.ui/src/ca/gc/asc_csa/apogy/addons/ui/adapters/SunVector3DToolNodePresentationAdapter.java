package ca.gc.asc_csa.apogy.addons.ui.adapters;

import ca.gc.asc_csa.apogy.addons.SunVector3DToolNode;
import ca.gc.asc_csa.apogy.addons.ui.SunVector3DToolNodePresentation;
import ca.gc.asc_csa.apogy.addons.ui.ApogyAddonsUIFactory;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

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
		
		SunVector3DToolNodePresentation presentationNode = ApogyAddonsUIFactory.eINSTANCE.createSunVector3DToolNodePresentation();
		presentationNode.setNode(ruler3dToolNode);			
						
		return presentationNode;
	}

}
