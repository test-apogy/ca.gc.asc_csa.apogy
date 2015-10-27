package org.eclipse.symphony.core.environment.ui.adapters;

import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;
import org.eclipse.symphony.core.environment.Sun;
import org.eclipse.symphony.core.environment.ui.SunPresentation;
import org.eclipse.symphony.core.environment.ui.Symphony__CoreEnvironmentUIFactory;

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

		SunPresentation presentationNode = Symphony__CoreEnvironmentUIFactory.eINSTANCE.createSunPresentation();
		presentationNode.setNode(obj);			
						
		return presentationNode;
	}
}
