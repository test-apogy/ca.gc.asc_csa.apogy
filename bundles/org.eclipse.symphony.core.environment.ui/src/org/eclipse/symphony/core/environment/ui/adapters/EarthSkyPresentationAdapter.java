package org.eclipse.symphony.core.environment.ui.adapters;

import org.eclipse.symphony.core.environment.EarthSky;
import org.eclipse.symphony.core.environment.ui.EarthSkyPresentation;
import org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIFactory;

import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;

public class EarthSkyPresentationAdapter implements NodePresentationAdapter
{
	public EarthSkyPresentationAdapter()
	{		
	}

	@Override
	public Class<?> getAdaptedClass()
	{		
		return EarthSky.class;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		boolean isAdapter = obj instanceof EarthSky;	
		return isAdapter;
	}

	@Override
	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		EarthSkyPresentation presentationNode = SymphonyEnvironmentUIFactory.eINSTANCE.createEarthSkyPresentation();
		presentationNode.setNode(obj);			
						
		return presentationNode;
	}
}
