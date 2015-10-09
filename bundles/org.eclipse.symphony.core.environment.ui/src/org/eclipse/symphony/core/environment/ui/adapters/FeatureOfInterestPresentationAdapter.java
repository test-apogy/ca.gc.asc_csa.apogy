package org.eclipse.symphony.core.environment.ui.adapters;

import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;
import org.eclipse.symphony.core.FeatureOfInterestNode;
import org.eclipse.symphony.core.environment.ui.FeatureOfInterestNodePresentation;
import org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIFactory;

public class FeatureOfInterestPresentationAdapter implements NodePresentationAdapter
{
	public FeatureOfInterestPresentationAdapter()
	{		
	}

	@Override
	public Class<?> getAdaptedClass()
	{		
		return FeatureOfInterestNode.class;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		boolean isAdapter = obj instanceof FeatureOfInterestNode;	
		return isAdapter;
	}

	@Override
	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		FeatureOfInterestNodePresentation presentationNode = SymphonyEnvironmentUIFactory.eINSTANCE.createFeatureOfInterestNodePresentation();
		presentationNode.setNode(obj);			
						
		return presentationNode;
	}
}
