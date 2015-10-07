package org.eclipse.symphony.core.environment.ui.adapters;

import org.eclipse.symphony.core.environment.Sun;
import org.eclipse.symphony.core.environment.ui.SunPresentation;
import org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIFactory;

import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;

public class SunPresentationAdapter implements NodePresentationAdapter
{
	public SunPresentationAdapter()
	{				
	}

	@Override
	public Class<?> getAdaptedClass()
	{		
		return Sun.class;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		boolean isAdapter = obj instanceof Sun;
		return isAdapter;
	}

	@Override
	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		SunPresentation presentationNode = SymphonyEnvironmentUIFactory.eINSTANCE.createSunPresentation();
		presentationNode.setNode(obj);			
						
		return presentationNode;
	}
}
