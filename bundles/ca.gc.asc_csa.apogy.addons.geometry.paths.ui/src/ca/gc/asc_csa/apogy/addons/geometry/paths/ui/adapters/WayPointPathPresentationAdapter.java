package ca.gc.asc_csa.apogy.addons.geometry.paths.ui.adapters;

import ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPath;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ui.ApogyAddonsGeometryPathsUIFactory;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ui.WayPointPathPresentation;

import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

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
				
		WayPointPathPresentation presentationNode = ApogyAddonsGeometryPathsUIFactory.eINSTANCE.createWayPointPathPresentation();						
		presentationNode.setNode((WayPointPath) obj);
		
		return presentationNode;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof WayPointPath;
	}
}
