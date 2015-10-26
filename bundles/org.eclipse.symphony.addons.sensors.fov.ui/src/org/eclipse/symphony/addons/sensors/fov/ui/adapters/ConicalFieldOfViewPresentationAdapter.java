package org.eclipse.symphony.addons.sensors.fov.ui.adapters;

import org.eclipse.symphony.addons.sensors.fov.ConicalFieldOfView;
import org.eclipse.symphony.addons.sensors.fov.ui.ConicalFieldOfViewPresentation;
import org.eclipse.symphony.addons.sensors.fov.ui.Symphony__AddonsSensorsFOVUIFactory;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;

public class ConicalFieldOfViewPresentationAdapter implements NodePresentationAdapter
{

	public ConicalFieldOfViewPresentationAdapter()
	{
	}


	public Class<?> getAdaptedClass()
	{		
		return ConicalFieldOfView.class;
	}


	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		ConicalFieldOfView conicalFieldOfView = (ConicalFieldOfView) obj;
		
		ConicalFieldOfViewPresentation presentationNode = Symphony__AddonsSensorsFOVUIFactory.eINSTANCE.createConicalFieldOfViewPresentation();
		presentationNode.setNode(conicalFieldOfView);			
						
		return presentationNode;
	}


	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof ConicalFieldOfView;
	}

}
