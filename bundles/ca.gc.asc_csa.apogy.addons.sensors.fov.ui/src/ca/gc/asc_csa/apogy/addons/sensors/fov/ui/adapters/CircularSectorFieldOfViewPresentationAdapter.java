package ca.gc.asc_csa.apogy.addons.sensors.fov.ui.adapters;

import ca.gc.asc_csa.apogy.addons.sensors.fov.CircularSectorFieldOfView;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.CircularSectorFieldOfViewPresentation;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.ApogyAddonsSensorsFOVUIFactory;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

public class CircularSectorFieldOfViewPresentationAdapter implements NodePresentationAdapter
{

	public CircularSectorFieldOfViewPresentationAdapter()
	{
	}


	public Class<?> getAdaptedClass()
	{		
		return CircularSectorFieldOfView.class;
	}


	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof CircularSectorFieldOfView;
	}


	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		CircularSectorFieldOfView circularSectorFieldOfView = (CircularSectorFieldOfView) obj;
		
		CircularSectorFieldOfViewPresentation presentationNode = ApogyAddonsSensorsFOVUIFactory.eINSTANCE.createCircularSectorFieldOfViewPresentation();
		presentationNode.setNode(circularSectorFieldOfView);			
						
		return presentationNode;
	}

}
