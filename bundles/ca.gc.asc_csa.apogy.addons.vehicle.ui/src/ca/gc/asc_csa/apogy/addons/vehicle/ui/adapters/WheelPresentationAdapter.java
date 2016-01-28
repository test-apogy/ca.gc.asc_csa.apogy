package ca.gc.asc_csa.apogy.addons.vehicle.ui.adapters;



import ca.gc.asc_csa.apogy.addons.vehicle.Wheel;
import ca.gc.asc_csa.apogy.addons.vehicle.ui.PhysicalWheelPresentation;
import ca.gc.asc_csa.apogy.addons.vehicle.ui.ApogyAddonsVehicleUIFactory;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

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
		
		PhysicalWheelPresentation presentationNode = ApogyAddonsVehicleUIFactory.eINSTANCE.createPhysicalWheelPresentation();
		presentationNode.setNode(wheel);			
						
		return presentationNode;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof Wheel;
	}
}
