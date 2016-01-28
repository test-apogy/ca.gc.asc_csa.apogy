package ca.gc.asc_csa.apogy.addons.telecoms.ui.adapters;

import ca.gc.asc_csa.apogy.addons.telecoms.AbstractAntennaRadiationPattern;
import ca.gc.asc_csa.apogy.addons.telecoms.ui.AbstractAntennaRadiationPatternPresentation;
import ca.gc.asc_csa.apogy.addons.telecoms.ui.ApogyAddonsTelecomsUIFactory;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

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

		AbstractAntennaRadiationPatternPresentation presentationNode = ApogyAddonsTelecomsUIFactory.eINSTANCE.createAbstractAntennaRadiationPatternPresentation();
		presentationNode.setNode(obj);			
						
		return presentationNode;
	}
}
