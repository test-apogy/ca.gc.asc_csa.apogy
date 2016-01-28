package ca.gc.asc_csa.apogy.core.ui;

import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;
import ca.gc.asc_csa.apogy.core.ResultNode;

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

		ResultNodePresentation presentationNode = ApogyCoreUIFactory.eINSTANCE.createResultNodePresentation();
		presentationNode.setNode(obj);			
						
		return presentationNode;
	}
}
