package ca.gc.asc_csa.apogy.addons.sensors.range.ui.adapters;

import ca.gc.asc_csa.apogy.addons.sensors.range.SimpleSonar;
import ca.gc.asc_csa.apogy.addons.sensors.range.ui.ApogyAddonsSensorsRangeUIFactory;
import ca.gc.asc_csa.apogy.addons.sensors.range.ui.SimpleSonarPresentation;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

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
		SimpleSonarPresentation presentationNode = ApogyAddonsSensorsRangeUIFactory.eINSTANCE.createSimpleSonarPresentation();
		presentationNode.setNode(simpleSonar);		
		return presentationNode;
	}

}
