package ca.gc.space.mrt.mobility.pathplanners.ui.adapters;

import org.eclipse.symphony.common.topology.ui.NodePresentation;

import ca.gc.space.mrt.mobility.pathplanners.CircularExclusionZone;
import ca.gc.space.mrt.mobility.pathplanners.ui.CircularExclusionZonePresentation;
import ca.gc.space.mrt.mobility.pathplanners.ui.PathPlannersUIFactory;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentationAdapter;

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
		
		CircularExclusionZonePresentation presentationNode = PathPlannersUIFactory.eINSTANCE
				.createCircularExclusionZonePresentation();
		presentationNode.setNode(circularExclusionZone);			
						
		return presentationNode;
	}


	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof CircularExclusionZone;
	}
}
