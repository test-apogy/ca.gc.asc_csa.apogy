package ca.gc.space.topology.ui.converters;

import org.eclipse.symphony.common.converters.IConverter;

import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.Activator;
import ca.gc.space.topology.ui.NodePresentation;

/**
 * Converter that converts from a Node to its NodePresentation.
 * @author pallard
 */
public class NodeToNodePresentationConverter implements IConverter 
{

	@Override
	public boolean canConvert(Object arg0) 
	{
		if(arg0 instanceof Node)
		{
			Node node = (Node) arg0;
			return Activator.getTopologyPresentationRegistry().getPresentationNode(node) != null;
		}
		return false;
	}

	@Override
	public Object convert(Object arg0) throws Exception 
	{	
		Node node = (Node) arg0;
		return Activator.getTopologyPresentationRegistry().getPresentationNode(node);
	}

	@Override
	public Class<?> getInputType() 
	{		
		return Node.class;
	}

	@Override
	public Class<?> getOutputType() 
	{		
		return NodePresentation.class;
	}

}
