package ca.gc.space.mrt.sensors.pose.ui.adapters;

import ca.gc.space.mrt.sensors.pose.PoseSensor;
import ca.gc.space.mrt.sensors.pose.ui.PoseSensorPresentation;
import ca.gc.space.mrt.sensors.pose.ui.SensorsPoseUIFactory;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;

public class PoseSensorPresentationAdapter implements NodePresentationAdapter
{

	public PoseSensorPresentationAdapter()
	{
		System.out.println("PoseSensorPresentationAdapter");
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
		
		PoseSensorPresentation presentationNode = SensorsPoseUIFactory.eINSTANCE.createPoseSensorPresentation();
		presentationNode.setNode(poseSensor);			
						
		return presentationNode;
	}
}
