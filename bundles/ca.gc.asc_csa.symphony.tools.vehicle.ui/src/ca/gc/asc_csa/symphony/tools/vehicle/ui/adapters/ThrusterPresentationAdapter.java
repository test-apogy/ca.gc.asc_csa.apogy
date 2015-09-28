package ca.gc.asc_csa.symphony.tools.vehicle.ui.adapters;



import ca.gc.asc_csa.symphony.tools.vehicle.Thruster;
import ca.gc.asc_csa.symphony.tools.vehicle.ui.SymphonyToolsVehicleUIFactory;
import ca.gc.asc_csa.symphony.tools.vehicle.ui.ThrusterPresentation;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;

public class ThrusterPresentationAdapter implements NodePresentationAdapter
{

	public ThrusterPresentationAdapter()
	{
	}

	@Override
	public Class<?> getAdaptedClass()
	{		
		return Thruster.class;
	}

	@Override
	public NodePresentation getAdapter(Node obj, Object context)
	{		
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		Thruster thruster = (Thruster) obj;
		
		ThrusterPresentation presentationNode = SymphonyToolsVehicleUIFactory.eINSTANCE.createThrusterPresentation();
		presentationNode.setNode(thruster);			
						
		return presentationNode;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof Thruster;
	}
}
