package org.eclipse.symphony.addons.sensors.fov.ui.adapters;

import org.eclipse.symphony.addons.sensors.fov.CircularSectorFieldOfView;
import org.eclipse.symphony.addons.sensors.fov.ui.CircularSectorFieldOfViewPresentation;
import org.eclipse.symphony.addons.sensors.fov.ui.FovUIFactory;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;

public class CircularSectorFieldOfViewPresentationAdapter implements NodePresentationAdapter
{

	public CircularSectorFieldOfViewPresentationAdapter()
	{
	}


	public Class<?> getAdaptedClass()
	{		
		return CircularSectorFieldOfView.class;
	}


	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof CircularSectorFieldOfView;
	}


	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		CircularSectorFieldOfView circularSectorFieldOfView = (CircularSectorFieldOfView) obj;
		
		CircularSectorFieldOfViewPresentation presentationNode = FovUIFactory.eINSTANCE.createCircularSectorFieldOfViewPresentation();
		presentationNode.setNode(circularSectorFieldOfView);			
						
		return presentationNode;
	}

}
