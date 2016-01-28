package ca.gc.asc_csa.apogy.addons.sensors.fov.ui.adapters;

import ca.gc.asc_csa.apogy.addons.sensors.fov.ConicalFieldOfView;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.ConicalFieldOfViewPresentation;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.ApogyAddonsSensorsFOVUIFactory;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

public class ConicalFieldOfViewPresentationAdapter implements NodePresentationAdapter
{

	public ConicalFieldOfViewPresentationAdapter()
	{
	}


	public Class<?> getAdaptedClass()
	{		
		return ConicalFieldOfView.class;
	}


	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		ConicalFieldOfView conicalFieldOfView = (ConicalFieldOfView) obj;
		
		ConicalFieldOfViewPresentation presentationNode = ApogyAddonsSensorsFOVUIFactory.eINSTANCE.createConicalFieldOfViewPresentation();
		presentationNode.setNode(conicalFieldOfView);			
						
		return presentationNode;
	}


	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof ConicalFieldOfView;
	}

}
