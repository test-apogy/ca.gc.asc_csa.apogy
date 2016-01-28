package org.eclipse.symphony.core.environment.ui.adapters;

import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;
import org.eclipse.symphony.core.environment.StarField;
import org.eclipse.symphony.core.environment.ui.StarFieldPresentation;
import org.eclipse.symphony.core.environment.ui.Symphony__CoreEnvironmentUIFactory;

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
		
		StarFieldPresentation presentationNode = Symphony__CoreEnvironmentUIFactory.eINSTANCE.createStarFieldPresentation();
		presentationNode.setNode(starField);			
						
		return presentationNode;
	}
}
