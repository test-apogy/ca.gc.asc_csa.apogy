package ca.gc.space.mrt.sensors.range.ui.adapters;

import ca.gc.space.mrt.sensors.range.SimpleSonar;
import ca.gc.space.mrt.sensors.range.ui.RangeSensorsUIFactory;
import ca.gc.space.mrt.sensors.range.ui.SimpleSonarPresentation;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;

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
