package org.eclipse.symphony.core.environment.ui.adapters;

import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;
import org.eclipse.symphony.core.environment.EarthSky;
import org.eclipse.symphony.core.environment.ui.EarthSkyPresentation;
import org.eclipse.symphony.core.environment.ui.Symphony__CoreEnvironmentUIFactory;

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

		EarthSkyPresentation presentationNode = Symphony__CoreEnvironmentUIFactory.eINSTANCE.createEarthSkyPresentation();
		presentationNode.setNode(obj);			
						
		return presentationNode;
	}
}
