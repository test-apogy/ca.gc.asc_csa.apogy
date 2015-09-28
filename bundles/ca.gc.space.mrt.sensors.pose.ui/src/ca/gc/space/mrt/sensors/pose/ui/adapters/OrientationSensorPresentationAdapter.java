package ca.gc.space.mrt.sensors.pose.ui.adapters;

import ca.gc.space.mrt.sensors.pose.OrientationSensor;
import ca.gc.space.mrt.sensors.pose.PoseSensor;
import ca.gc.space.mrt.sensors.pose.ui.OrientationSensorPresentation;
import ca.gc.space.mrt.sensors.pose.ui.SensorsPoseUIFactory;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;

public class OrientationSensorPresentationAdapter implements NodePresentationAdapter
{

	public OrientationSensorPresentationAdapter()
	{
	}


	public Class<?> getAdaptedClass()
	{		
		return OrientationSensor.class;
	}


	public boolean isAdapterFor(Node obj)
	{
		return (obj instanceof OrientationSensor) && !(obj instanceof PoseSensor);
	}


	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		OrientationSensor orientationSensor = (OrientationSensor) obj;
		
		OrientationSensorPresentation presentationNode = SensorsPoseUIFactory.eINSTANCE.createOrientationSensorPresentation();
		presentationNode.setNode(orientationSensor);			
						
		return presentationNode;
	}
}
