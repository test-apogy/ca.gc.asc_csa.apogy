package org.eclipse.symphony.core.environment.ui.adapters;

import org.eclipse.symphony.core.environment.EarthSurfaceWorksiteNode;
import org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation;
import org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIFactory;

import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;

public class EarthSurfaceWorksitePresentationAdapter implements NodePresentationAdapter
{
	public EarthSurfaceWorksitePresentationAdapter()
	{		
	}

	@Override
	public Class<?> getAdaptedClass()
	{		
		return EarthSurfaceWorksiteNode.class;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		boolean isAdapter = obj instanceof EarthSurfaceWorksiteNode;	
		return isAdapter;
	}

	@Override
	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		EarthSurfaceWorksitePresentation presentationNode = SymphonyEnvironmentUIFactory.eINSTANCE.createEarthSurfaceWorksitePresentation();
		presentationNode.setNode(obj);			
						
		return presentationNode;
	}
}
