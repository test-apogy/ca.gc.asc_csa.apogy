package ca.gc.asc_csa.apogy.addons.vehicle.ui.adapters;



import ca.gc.asc_csa.apogy.addons.vehicle.Thruster;
import ca.gc.asc_csa.apogy.addons.vehicle.ui.ApogyAddonsVehicleUIFactory;
import ca.gc.asc_csa.apogy.addons.vehicle.ui.ThrusterPresentation;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

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
		
		ThrusterPresentation presentationNode = ApogyAddonsVehicleUIFactory.eINSTANCE.createThrusterPresentation();
		presentationNode.setNode(thruster);			
						
		return presentationNode;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof Thruster;
	}
}
