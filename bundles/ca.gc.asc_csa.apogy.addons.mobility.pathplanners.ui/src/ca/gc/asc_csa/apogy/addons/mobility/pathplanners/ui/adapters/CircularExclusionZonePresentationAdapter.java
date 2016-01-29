package ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ui.adapters;

import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.CircularExclusionZone;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ui.CircularExclusionZonePresentation;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ui.ApogyAddonsMobilityPathplannersUIFactory;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

public class CircularExclusionZonePresentationAdapter implements NodePresentationAdapter
{

	public Class<?> getAdaptedClass()
	{
		return CircularExclusionZone.class;
	}


	public NodePresentation getAdapter(Node obj, Object context)
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		CircularExclusionZone circularExclusionZone = (CircularExclusionZone) obj;
		
		CircularExclusionZonePresentation presentationNode = ApogyAddonsMobilityPathplannersUIFactory.eINSTANCE
				.createCircularExclusionZonePresentation();
		presentationNode.setNode(circularExclusionZone);			
						
		return presentationNode;
	}


	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof CircularExclusionZone;
	}
}
