package org.eclipse.symphony.core.ui;

import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;
import org.eclipse.symphony.core.ResultNode;

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

		ResultNodePresentation presentationNode = Symphony__CoreUIFactory.eINSTANCE.createResultNodePresentation();
		presentationNode.setNode(obj);			
						
		return presentationNode;
	}
}
