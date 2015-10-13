package org.eclipse.symphony.addons.sensors.pose.ui.adapters;

import org.eclipse.symphony.addons.sensors.pose.OrientationSensor;
import org.eclipse.symphony.addons.sensors.pose.PoseSensor;
import org.eclipse.symphony.addons.sensors.pose.ui.OrientationSensorPresentation;
import org.eclipse.symphony.addons.sensors.pose.ui.SensorsPoseUIFactory;
import org.eclipse.symphony.common.topology.ui.NodePresentation;

import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;

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
