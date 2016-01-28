package ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui.adapters;

import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.Label;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui.LabelPresentation;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui.ApogyCommonTopologyAddonsPrimitivesUIFactory;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

public class LabelPresentationAdapter implements NodePresentationAdapter
{

	public LabelPresentationAdapter()
	{
	}

	@Override
	public Class<?> getAdaptedClass()
	{		
		return Label.class;
	}

	@Override
	public NodePresentation getAdapter(Node obj, Object context)
	{		
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		Label Label = (Label) obj;
		
		LabelPresentation presentationNode = ApogyCommonTopologyAddonsPrimitivesUIFactory.eINSTANCE.createLabelPresentation();
		presentationNode.setNode(Label);			
						
		return presentationNode;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof Label;
	}
}
