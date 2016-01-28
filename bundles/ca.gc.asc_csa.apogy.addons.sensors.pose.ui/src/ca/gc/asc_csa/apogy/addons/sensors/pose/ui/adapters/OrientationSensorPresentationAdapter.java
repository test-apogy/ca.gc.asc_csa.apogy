package ca.gc.asc_csa.apogy.addons.sensors.pose.ui.adapters;

import ca.gc.asc_csa.apogy.addons.sensors.pose.OrientationSensor;
import ca.gc.asc_csa.apogy.addons.sensors.pose.PoseSensor;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ui.OrientationSensorPresentation;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ui.ApogyAddonsSensorsPoseUIFactory;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;

import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

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
		
		OrientationSensorPresentation presentationNode = ApogyAddonsSensorsPoseUIFactory.eINSTANCE.createOrientationSensorPresentation();
		presentationNode.setNode(orientationSensor);			
						
		return presentationNode;
	}
}
