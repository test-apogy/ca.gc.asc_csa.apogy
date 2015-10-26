package org.eclipse.symphony.addons.vehicle.ui.adapters;



import org.eclipse.symphony.addons.vehicle.Thruster;
import org.eclipse.symphony.addons.vehicle.ui.Symphony__AddonsVehicleUIFactory;
import org.eclipse.symphony.addons.vehicle.ui.ThrusterPresentation;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;

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
		
		ThrusterPresentation presentationNode = Symphony__AddonsVehicleUIFactory.eINSTANCE.createThrusterPresentation();
		presentationNode.setNode(thruster);			
						
		return presentationNode;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof Thruster;
	}
}
