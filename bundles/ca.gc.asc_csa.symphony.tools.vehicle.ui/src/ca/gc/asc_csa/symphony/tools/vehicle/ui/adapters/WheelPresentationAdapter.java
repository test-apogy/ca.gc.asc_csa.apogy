package ca.gc.asc_csa.symphony.tools.vehicle.ui.adapters;



import ca.gc.asc_csa.symphony.tools.vehicle.Wheel;
import ca.gc.asc_csa.symphony.tools.vehicle.ui.PhysicalWheelPresentation;
import ca.gc.asc_csa.symphony.tools.vehicle.ui.SymphonyToolsVehicleUIFactory;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;

public class WheelPresentationAdapter implements NodePresentationAdapter
{

	public WheelPresentationAdapter()
	{
	}

	@Override
	public Class<?> getAdaptedClass()
	{		
		return Wheel.class;
	}

	@Override
	public NodePresentation getAdapter(Node obj, Object context)
	{		
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		Wheel wheel = (Wheel) obj;
		
		PhysicalWheelPresentation presentationNode = SymphonyToolsVehicleUIFactory.eINSTANCE.createPhysicalWheelPresentation();
		presentationNode.setNode(wheel);			
						
		return presentationNode;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof Wheel;
	}
}
