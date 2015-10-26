package org.eclipse.symphony.addons.vehicle.ui.adapters;



import org.eclipse.symphony.addons.vehicle.Wheel;
import org.eclipse.symphony.addons.vehicle.ui.PhysicalWheelPresentation;
import org.eclipse.symphony.addons.vehicle.ui.Symphony__AddonsVehicleUIFactory;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;

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
		
		PhysicalWheelPresentation presentationNode = Symphony__AddonsVehicleUIFactory.eINSTANCE.createPhysicalWheelPresentation();
		presentationNode.setNode(wheel);			
						
		return presentationNode;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof Wheel;
	}
}
