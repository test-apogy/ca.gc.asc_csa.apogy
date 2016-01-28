package org.eclipse.symphony.addons.mobility.pathplanners.ui.adapters;

import org.eclipse.symphony.addons.mobility.pathplanners.CircularExclusionZone;
import org.eclipse.symphony.addons.mobility.pathplanners.ui.CircularExclusionZonePresentation;
import org.eclipse.symphony.addons.mobility.pathplanners.ui.Symphony__AddonsMobilityPathplannersUIFactory;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;

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
		
		CircularExclusionZonePresentation presentationNode = Symphony__AddonsMobilityPathplannersUIFactory.eINSTANCE
				.createCircularExclusionZonePresentation();
		presentationNode.setNode(circularExclusionZone);			
						
		return presentationNode;
	}


	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof CircularExclusionZone;
	}
}
