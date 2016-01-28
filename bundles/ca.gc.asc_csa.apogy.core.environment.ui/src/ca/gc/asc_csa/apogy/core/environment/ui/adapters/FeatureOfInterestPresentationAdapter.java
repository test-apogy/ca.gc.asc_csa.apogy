package ca.gc.asc_csa.apogy.core.environment.ui.adapters;

import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;
import ca.gc.asc_csa.apogy.core.FeatureOfInterestNode;
import ca.gc.asc_csa.apogy.core.environment.ui.FeatureOfInterestNodePresentation;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIFactory;

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

		FeatureOfInterestNodePresentation presentationNode = ApogyCoreEnvironmentUIFactory.eINSTANCE.createFeatureOfInterestNodePresentation();
		presentationNode.setNode(obj);			
						
		return presentationNode;
	}
}
