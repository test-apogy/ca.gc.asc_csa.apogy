package ca.gc.asc_csa.apogy.addons.sensors.pose.ui.adapters;

import ca.gc.asc_csa.apogy.addons.sensors.pose.PoseSensor;
import ca.gc.asc_csa.apogy.addons.sensors.pose.PositionSensor;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ui.PositionSensorPresentation;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ui.ApogyAddonsSensorsPoseUIFactory;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;

import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

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
		
		PositionSensorPresentation presentationNode = ApogyAddonsSensorsPoseUIFactory.eINSTANCE.createPositionSensorPresentation();
		presentationNode.setNode(vector);			
						
		return presentationNode;
	}
}
