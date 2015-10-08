package org.eclipse.symphony.addons.vehicle.ui.adapters;



import org.eclipse.symphony.addons.vehicle.LanderSphericalFoot;
import org.eclipse.symphony.addons.vehicle.ui.LanderSphericalFootPresentation;
import org.eclipse.symphony.addons.vehicle.ui.SymphonyToolsVehicleUIFactory;

import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;

public class LanderSphericalFootPresentationAdapter implements NodePresentationAdapter
{

	public LanderSphericalFootPresentationAdapter()
	{
	}

	@Override
	public Class<?> getAdaptedClass()
	{		
		return LanderSphericalFoot.class;
	}

	@Override
	public NodePresentation getAdapter(Node obj, Object context)
	{		
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		LanderSphericalFoot foot = (LanderSphericalFoot) obj;
		
		LanderSphericalFootPresentation presentationNode = SymphonyToolsVehicleUIFactory.eINSTANCE.createLanderSphericalFootPresentation();
		presentationNode.setNode(foot);			
						
		return presentationNode;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof LanderSphericalFoot;
	}
}