package ca.gc.space.mrt.sensors.range.ui.adapters;

import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;

import ca.gc.space.mrt.sensors.range.SimpleSonar;
import ca.gc.space.mrt.sensors.range.ui.RangeSensorsUIFactory;
import ca.gc.space.mrt.sensors.range.ui.SimpleSonarPresentation;

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
