package org.eclipse.symphony.addons.geometry.paths.ui.adapters;

import org.eclipse.symphony.addons.geometry.paths.WayPoint;
import org.eclipse.symphony.addons.geometry.paths.ui.Symphony__AddonsGeometryPathsUIFactory;
import org.eclipse.symphony.addons.geometry.paths.ui.WayPointPresentation;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;

public class WayPointPresentationAdapter implements NodePresentationAdapter
{
	@Override
	public Class<?> getAdaptedClass()
	{		
		return WayPoint.class;
	}

	@Override
	public NodePresentation getAdapter(Node obj, Object context)
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}
				
		WayPointPresentation presentationNode = Symphony__AddonsGeometryPathsUIFactory.eINSTANCE.createWayPointPresentation();						
		presentationNode.setNode((WayPoint) obj);
		
		return presentationNode;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof WayPoint;
	}
}
