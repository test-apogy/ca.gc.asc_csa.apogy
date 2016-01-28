package ca.gc.asc_csa.apogy.addons.vehicle.ui.adapters;



import ca.gc.asc_csa.apogy.addons.vehicle.LanderSphericalFoot;
import ca.gc.asc_csa.apogy.addons.vehicle.ui.LanderSphericalFootPresentation;
import ca.gc.asc_csa.apogy.addons.vehicle.ui.ApogyAddonsVehicleUIFactory;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

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
		
		LanderSphericalFootPresentation presentationNode = ApogyAddonsVehicleUIFactory.eINSTANCE.createLanderSphericalFootPresentation();
		presentationNode.setNode(foot);			
						
		return presentationNode;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof LanderSphericalFoot;
	}
}
