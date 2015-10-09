package org.eclipse.symphony.common.topology.addons.primitives.ui.adapters;

import org.eclipse.symphony.common.topology.addons.primitives.SpherePrimitive;
import org.eclipse.symphony.common.topology.addons.primitives.ui.SpherePrimitivePresentation;
import org.eclipse.symphony.common.topology.addons.primitives.ui.TopologyUIPrimitivesFactory;

import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;

public class SpherePrimitivePresentationAdapter implements NodePresentationAdapter
{

	public SpherePrimitivePresentationAdapter()
	{
	}

	@Override
	public Class<?> getAdaptedClass()
	{		
		return SpherePrimitive.class;
	}

	@Override
	public NodePresentation getAdapter(Node obj, Object context)
	{		
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		SpherePrimitive sphere = (SpherePrimitive) obj;
		
		SpherePrimitivePresentation presentationNode = TopologyUIPrimitivesFactory.eINSTANCE.createSpherePrimitivePresentation();
		presentationNode.setNode(sphere);			
						
		return presentationNode;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof SpherePrimitive;
	}
}
