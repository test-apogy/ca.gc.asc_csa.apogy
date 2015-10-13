package org.eclipse.symphony.common.topology.addons.primitives.ui.adapters;



import org.eclipse.symphony.common.topology.addons.primitives.Label;
import org.eclipse.symphony.common.topology.addons.primitives.ui.LabelPresentation;
import org.eclipse.symphony.common.topology.addons.primitives.ui.TopologyUIPrimitivesFactory;

import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;

public class LabelPresentationAdapter implements NodePresentationAdapter
{

	public LabelPresentationAdapter()
	{
	}

	@Override
	public Class<?> getAdaptedClass()
	{		
		return Label.class;
	}

	@Override
	public NodePresentation getAdapter(Node obj, Object context)
	{		
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		Label Label = (Label) obj;
		
		LabelPresentation presentationNode = TopologyUIPrimitivesFactory.eINSTANCE.createLabelPresentation();
		presentationNode.setNode(Label);			
						
		return presentationNode;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof Label;
	}
}
