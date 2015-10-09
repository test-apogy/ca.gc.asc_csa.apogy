package org.eclipse.symphony.core.environment.ui.adapters;

import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;
import org.eclipse.symphony.core.environment.Moon;
import org.eclipse.symphony.core.environment.ui.MoonPresentation;
import org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIFactory;

public class MoonPresentationAdapter implements NodePresentationAdapter
{
	public MoonPresentationAdapter()
	{		
	}

	@Override
	public Class<?> getAdaptedClass()
	{		
		return Moon.class;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		boolean isAdapter = obj instanceof Moon;
		return isAdapter;
	}

	@Override
	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		MoonPresentation presentationNode = SymphonyEnvironmentUIFactory.eINSTANCE.createMoonPresentation();
		presentationNode.setNode(obj);			
						
		return presentationNode;
	}
}
