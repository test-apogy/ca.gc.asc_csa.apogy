package org.eclipse.symphony.addons.telecoms.ui.adapters;

import org.eclipse.symphony.addons.telecoms.AbstractAntennaRadiationPattern;
import org.eclipse.symphony.addons.telecoms.ui.AbstractAntennaRadiationPatternPresentation;
import org.eclipse.symphony.addons.telecoms.ui.Symphony__AddonsTelecomsUIFactory;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;

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

		AbstractAntennaRadiationPatternPresentation presentationNode = Symphony__AddonsTelecomsUIFactory.eINSTANCE.createAbstractAntennaRadiationPatternPresentation();
		presentationNode.setNode(obj);			
						
		return presentationNode;
	}
}
