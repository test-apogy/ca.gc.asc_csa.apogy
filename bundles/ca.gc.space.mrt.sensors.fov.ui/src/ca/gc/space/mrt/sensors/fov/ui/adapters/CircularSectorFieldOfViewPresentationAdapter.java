package ca.gc.space.mrt.sensors.fov.ui.adapters;

import ca.gc.space.mrt.sensors.fov.CircularSectorFieldOfView;
import ca.gc.space.mrt.sensors.fov.ui.CircularSectorFieldOfViewPresentation;
import ca.gc.space.mrt.sensors.fov.ui.FovUIFactory;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;

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
