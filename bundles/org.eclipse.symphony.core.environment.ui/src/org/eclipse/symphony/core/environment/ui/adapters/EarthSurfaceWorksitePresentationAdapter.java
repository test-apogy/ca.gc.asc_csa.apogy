package org.eclipse.symphony.core.environment.ui.adapters;

import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;
import org.eclipse.symphony.core.environment.EarthSurfaceWorksiteNode;
import org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation;
import org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIFactory;

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
