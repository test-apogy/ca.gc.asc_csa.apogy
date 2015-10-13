package org.eclipse.symphony.addons.geometry.paths.ui.adapters;

import org.eclipse.symphony.addons.geometry.paths.WayPointPath;
import org.eclipse.symphony.addons.geometry.paths.ui.PathsUIFactory;
import org.eclipse.symphony.addons.geometry.paths.ui.WayPointPathPresentation;

import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;

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
