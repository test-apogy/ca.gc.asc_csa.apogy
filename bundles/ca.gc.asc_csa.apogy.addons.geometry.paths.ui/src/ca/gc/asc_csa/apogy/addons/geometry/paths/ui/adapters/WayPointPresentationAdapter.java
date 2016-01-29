package ca.gc.asc_csa.apogy.addons.geometry.paths.ui.adapters;

import ca.gc.asc_csa.apogy.addons.geometry.paths.WayPoint;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ui.ApogyAddonsGeometryPathsUIFactory;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ui.WayPointPresentation;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

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
				
		WayPointPresentation presentationNode = ApogyAddonsGeometryPathsUIFactory.eINSTANCE.createWayPointPresentation();						
		presentationNode.setNode((WayPoint) obj);
		
		return presentationNode;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof WayPoint;
	}
}
