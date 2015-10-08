package org.eclipse.symphony.addons.telecoms.ui.adapters;

import org.eclipse.symphony.addons.telecoms.AbstractAntennaRadiationPattern;
import org.eclipse.symphony.addons.telecoms.ui.AbstractAntennaRadiationPatternPresentation;
import org.eclipse.symphony.addons.telecoms.ui.SymphonyTelecomToolsUIFactory;

import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;

public class AbstractAntennaRadiationPatternAdapter implements NodePresentationAdapter
{
	public AbstractAntennaRadiationPatternAdapter()
	{		
	}

	@Override
	public Class<?> getAdaptedClass()
	{		
		return AbstractAntennaRadiationPattern.class;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		boolean isAdapter = obj instanceof AbstractAntennaRadiationPattern;	
		return isAdapter;
	}

	@Override
	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		AbstractAntennaRadiationPatternPresentation presentationNode = SymphonyTelecomToolsUIFactory.eINSTANCE.createAbstractAntennaRadiationPatternPresentation();
		presentationNode.setNode(obj);			
						
		return presentationNode;
	}
}