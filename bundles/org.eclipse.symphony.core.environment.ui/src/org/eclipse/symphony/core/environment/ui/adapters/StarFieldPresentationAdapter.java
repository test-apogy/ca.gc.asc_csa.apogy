package org.eclipse.symphony.core.environment.ui.adapters;

import org.eclipse.symphony.core.environment.StarField;
import org.eclipse.symphony.core.environment.ui.StarFieldPresentation;
import org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIFactory;

import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;

public class StarFieldPresentationAdapter implements NodePresentationAdapter
{

	public StarFieldPresentationAdapter()
	{
	}

	@Override
	public Class<?> getAdaptedClass()
	{		
		return StarField.class;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof StarField;
	}

	@Override
	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		StarField starField = (StarField) obj;
		
		StarFieldPresentation presentationNode = SymphonyEnvironmentUIFactory.eINSTANCE.createStarFieldPresentation();
		presentationNode.setNode(starField);			
						
		return presentationNode;
	}
}
