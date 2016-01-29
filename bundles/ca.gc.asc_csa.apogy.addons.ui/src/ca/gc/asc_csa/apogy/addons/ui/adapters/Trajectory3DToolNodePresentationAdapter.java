package ca.gc.asc_csa.apogy.addons.ui.adapters;

import ca.gc.asc_csa.apogy.addons.Trajectory3DToolNode;
import ca.gc.asc_csa.apogy.addons.ui.ApogyAddonsUIFactory;
import ca.gc.asc_csa.apogy.addons.ui.Trajectory3DToolNodePresentation;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

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
		Trajectory3DToolNodePresentation presentationNode = ApogyAddonsUIFactory.eINSTANCE.createTrajectory3DToolNodePresentation();
		presentationNode.setNode(trajectory3DToolNode);			
						
		return presentationNode;
	}

}
