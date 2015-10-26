package org.eclipse.symphony.addons.sensors.pose.ui.adapters;

import org.eclipse.symphony.addons.sensors.pose.PoseSensor;
import org.eclipse.symphony.addons.sensors.pose.PositionSensor;
import org.eclipse.symphony.addons.sensors.pose.ui.PositionSensorPresentation;
import org.eclipse.symphony.addons.sensors.pose.ui.Symphony__AddonsSensorsPoseUIFactory;
import org.eclipse.symphony.common.topology.ui.NodePresentation;

import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;

public class PositionSensorPresentationAdapter implements NodePresentationAdapter
{

	public PositionSensorPresentationAdapter()
	{
	}


	public Class<?> getAdaptedClass()
	{		
		return PositionSensor.class;
	}
	

	public boolean isAdapterFor(Node obj)
	{
		return (obj instanceof PositionSensor) && !(obj instanceof PoseSensor);
	}


	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		PositionSensor vector = (PositionSensor) obj;
		
		PositionSensorPresentation presentationNode = Symphony__AddonsSensorsPoseUIFactory.eINSTANCE.createPositionSensorPresentation();
		presentationNode.setNode(vector);			
						
		return presentationNode;
	}
}
