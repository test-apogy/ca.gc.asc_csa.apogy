package ca.gc.asc_csa.symphony.environment.ui.adapters;

import ca.gc.asc_csa.symphony.core.FeatureOfInterestNode;
import ca.gc.asc_csa.symphony.environment.ui.FeatureOfInterestNodePresentation;
import ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIFactory;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;

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
