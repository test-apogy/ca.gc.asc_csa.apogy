package ca.gc.asc_csa.symphony.core.ui;

import ca.gc.asc_csa.symphony.core.ResultNode;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;

public class ResultNodePresentationAdapter implements NodePresentationAdapter
{
	public ResultNodePresentationAdapter()
	{		
		System.err.println("DataProductPresentationAdapter()");
	}

	@Override
	public Class<?> getAdaptedClass()
	{		
		return ResultNode.class;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		boolean isAdapter = obj instanceof ResultNode;	
		return isAdapter;
	}

	@Override
	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		ResultNodePresentation presentationNode = SymphonyCoreUiFactory.eINSTANCE.createResultNodePresentation();
		presentationNode.setNode(obj);			
						
		return presentationNode;
	}
}
