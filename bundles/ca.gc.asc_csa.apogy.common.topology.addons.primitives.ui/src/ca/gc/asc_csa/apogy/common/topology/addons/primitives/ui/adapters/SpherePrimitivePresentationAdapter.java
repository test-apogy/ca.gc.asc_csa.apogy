package ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui.adapters;

import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.SpherePrimitive;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui.SpherePrimitivePresentation;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui.ApogyCommonTopologyAddonsPrimitivesUIFactory;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

public class SpherePrimitivePresentationAdapter implements NodePresentationAdapter
{

	public SpherePrimitivePresentationAdapter()
	{
	}

	@Override
	public Class<?> getAdaptedClass()
	{		
		return SpherePrimitive.class;
	}

	@Override
	public NodePresentation getAdapter(Node obj, Object context)
	{		
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		SpherePrimitive sphere = (SpherePrimitive) obj;
		
		SpherePrimitivePresentation presentationNode = ApogyCommonTopologyAddonsPrimitivesUIFactory.eINSTANCE.createSpherePrimitivePresentation();
		presentationNode.setNode(sphere);			
						
		return presentationNode;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof SpherePrimitive;
	}
}
