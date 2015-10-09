package org.eclipse.symphony.addons.sensors.range.ui.adapters;

import org.eclipse.symphony.addons.sensors.range.SimpleSonar;
import org.eclipse.symphony.addons.sensors.range.ui.RangeSensorsUIFactory;
import org.eclipse.symphony.addons.sensors.range.ui.SimpleSonarPresentation;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;

public class SimpleSonarPresentationAdapter implements NodePresentationAdapter
{


	public Class<?> getAdaptedClass()
	{		
		return SimpleSonar.class;
	}


	public boolean isAdapterFor(Node node)
	{		
		return (node instanceof SimpleSonar);
	}


	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}
		
		SimpleSonar simpleSonar = (SimpleSonar) obj;
		SimpleSonarPresentation presentationNode = RangeSensorsUIFactory.eINSTANCE.createSimpleSonarPresentation();
		presentationNode.setNode(simpleSonar);		
		return presentationNode;
	}

}
