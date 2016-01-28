package ca.gc.asc_csa.apogy.addons.sensors.pose.ui.adapters;

import ca.gc.asc_csa.apogy.addons.sensors.pose.PoseSensor;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ui.PoseSensorPresentation;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ui.ApogyAddonsSensorsPoseUIFactory;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;

import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

public class PoseSensorPresentationAdapter implements NodePresentationAdapter
{

	public PoseSensorPresentationAdapter()
	{
	}


	public Class<?> getAdaptedClass()
	{		
		return PoseSensor.class;
	}


	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof PoseSensor;
	}

	
	public NodePresentation getAdapter(Node obj, Object context) 
	{
		
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		PoseSensor poseSensor = (PoseSensor) obj;
		
		PoseSensorPresentation presentationNode = ApogyAddonsSensorsPoseUIFactory.eINSTANCE.createPoseSensorPresentation();
		presentationNode.setNode(poseSensor);			
						
		return presentationNode;
	}
}
