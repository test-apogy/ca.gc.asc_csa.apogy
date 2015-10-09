package org.eclipse.symphony.common.topology.addons.primitives.ui.adapters;

import org.eclipse.symphony.common.topology.addons.primitives.Vector;
import org.eclipse.symphony.common.topology.addons.primitives.ui.TopologyUIPrimitivesFactory;
import org.eclipse.symphony.common.topology.addons.primitives.ui.VectorPresentation;

import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;

public class VectorPresentationAdapter implements NodePresentationAdapter
{

	public VectorPresentationAdapter()
	{
	}

	@Override
	public Class<?> getAdaptedClass()
	{		
		return Vector.class;
	}

	@Override
	public NodePresentation getAdapter(Node obj, Object context)
	{		
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		Vector vector = (Vector) obj;
		
		VectorPresentation presentationNode = TopologyUIPrimitivesFactory.eINSTANCE.createVectorPresentation();
		presentationNode.setNode(vector);			
						
		return presentationNode;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof Vector;
	}
}