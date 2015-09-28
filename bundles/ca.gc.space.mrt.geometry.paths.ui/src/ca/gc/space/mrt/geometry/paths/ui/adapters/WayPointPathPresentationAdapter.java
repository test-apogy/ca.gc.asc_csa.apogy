package ca.gc.space.mrt.geometry.paths.ui.adapters;

import ca.gc.space.mrt.geometry.paths.WayPointPath;
import ca.gc.space.mrt.geometry.paths.ui.PathsUIFactory;
import ca.gc.space.mrt.geometry.paths.ui.WayPointPathPresentation;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;

public class WayPointPathPresentationAdapter implements NodePresentationAdapter
{
	@Override
	public Class<?> getAdaptedClass()
	{		
		return WayPointPath.class;
	}

	@Override
	public NodePresentation getAdapter(Node obj, Object context)
	{
		if (!isAdapterFor(obj)) 
		{
			System.out.println("WayPointPathPresentationAdapter OBJ : " + obj);
			throw new IllegalArgumentException();
		}
				
		WayPointPathPresentation presentationNode = PathsUIFactory.eINSTANCE.createWayPointPathPresentation();						
		presentationNode.setNode((WayPointPath) obj);
		
		return presentationNode;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof WayPointPath;
	}
}
