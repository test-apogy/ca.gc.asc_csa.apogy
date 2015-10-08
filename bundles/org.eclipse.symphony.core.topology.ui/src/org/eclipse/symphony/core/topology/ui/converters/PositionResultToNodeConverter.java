package org.eclipse.symphony.core.topology.ui.converters;

import java.util.Iterator;
import java.util.List;

import org.eclipse.symphony.common.converters.IConverter;
import org.eclipse.symphony.core.PositionedResult;
import org.eclipse.symphony.core.ResultNode;
import org.eclipse.symphony.core.ResultsListNode;
import org.eclipse.symphony.core.SymphonyCorePackage;
import org.eclipse.symphony.core.SymphonyEnvironment;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.InvocatorSession;

import ca.gc.space.topology.GroupNode;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.TopologyFacade;

public class PositionResultToNodeConverter implements IConverter 
{

	@Override
	public Class<?> getOutputType() {		
		return Node.class;
	}

	@Override
	public Class<?> getInputType() 
	{
		return PositionedResult.class;
	}

	@Override
	public boolean canConvert(Object input) 
	{
		if(input instanceof PositionedResult)
		{
			return findNode((PositionedResult) input) != null; 			
		}
		return false;
	}	

	@Override
	public Object convert(Object input) throws Exception 
	{		
		ResultNode resultNode = findNode((PositionedResult) input);
		
		Node leaf = resultNode;
		while(leaf instanceof GroupNode)
		{
			GroupNode parent = (GroupNode) leaf;
			if(!parent.getChildren().isEmpty())
			{
				leaf = parent.getChildren().get(0);
			}
		}
		
		return leaf;
	}

	private ResultNode findNode(PositionedResult positionedResult)
	{
		ResultNode result = null;
		
		// Gets the Active Session
		InvocatorSession session = EMFEcoreInvocatorFacade.INSTANCE.getActiveInvocatorSession();
		
		if(session != null)
		{
			if(session.getEnvironment() instanceof SymphonyEnvironment)
			{
				SymphonyEnvironment symphonyEnvironment = (SymphonyEnvironment) session.getEnvironment();
				
				List<Node> nodes = TopologyFacade.INSTANCE.findNodesByType(SymphonyCorePackage.Literals.RESULTS_LIST_NODE, symphonyEnvironment.getSymphonyTopology().getRootNode());
				
				Iterator<Node> it = nodes.iterator();
				while(it.hasNext() && result == null)
				{
					Node node = it.next();
					if(node instanceof ResultsListNode)
					{
						ResultsListNode resultsListNode  = (ResultsListNode) node;
						for(Node child : resultsListNode.getChildren())
						{
							if(child instanceof ResultNode)
							{
								ResultNode resultNode = (ResultNode) child;
								if(resultNode.getResult() == positionedResult)
								{
									result = resultNode;
								}
							}
						}
					}
				}				
			}
		}
		
		return result;
	}
}
