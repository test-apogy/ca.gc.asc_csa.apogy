package ca.gc.asc_csa.symphony.environment.ui.adapters;

import ca.gc.asc_csa.symphony.environment.Moon;
import ca.gc.asc_csa.symphony.environment.ui.MoonPresentation;
import ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIFactory;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;

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
