package ca.gc.space.mrt.sensors.fov.ui.adapters;

import org.eclipse.symphony.common.topology.ui.NodePresentation;

import ca.gc.space.mrt.sensors.fov.ConicalFieldOfView;
import ca.gc.space.mrt.sensors.fov.ui.ConicalFieldOfViewPresentation;
import ca.gc.space.mrt.sensors.fov.ui.FovUIFactory;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentationAdapter;

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
		
		ConicalFieldOfViewPresentation presentationNode = FovUIFactory.eINSTANCE.createConicalFieldOfViewPresentation();
		presentationNode.setNode(conicalFieldOfView);			
						
		return presentationNode;
	}


	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof ConicalFieldOfView;
	}

}
