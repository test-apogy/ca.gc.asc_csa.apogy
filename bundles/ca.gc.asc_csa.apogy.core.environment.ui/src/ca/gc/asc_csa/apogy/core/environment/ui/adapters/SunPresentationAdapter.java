package ca.gc.asc_csa.apogy.core.environment.ui.adapters;

import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;
import ca.gc.asc_csa.apogy.core.environment.Sun;
import ca.gc.asc_csa.apogy.core.environment.ui.SunPresentation;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIFactory;

public class SunPresentationAdapter implements NodePresentationAdapter
{
	public SunPresentationAdapter()
	{				
	}

	@Override
	public Class<?> getAdaptedClass()
	{		
		return Sun.class;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		boolean isAdapter = obj instanceof Sun;
		return isAdapter;
	}

	@Override
	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		SunPresentation presentationNode = ApogyCoreEnvironmentUIFactory.eINSTANCE.createSunPresentation();
		presentationNode.setNode(obj);			
						
		return presentationNode;
	}
}
