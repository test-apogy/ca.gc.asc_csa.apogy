package ca.gc.asc_csa.apogy.core.environment.ui.adapters;

import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;
import ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksiteNode;
import ca.gc.asc_csa.apogy.core.environment.ui.EarthSurfaceWorksitePresentation;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIFactory;

public class EarthSurfaceWorksitePresentationAdapter implements NodePresentationAdapter
{
	public EarthSurfaceWorksitePresentationAdapter()
	{		
	}

	@Override
	public Class<?> getAdaptedClass()
	{		
		return EarthSurfaceWorksiteNode.class;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		boolean isAdapter = obj instanceof EarthSurfaceWorksiteNode;	
		return isAdapter;
	}

	@Override
	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		EarthSurfaceWorksitePresentation presentationNode = ApogyCoreEnvironmentUIFactory.eINSTANCE.createEarthSurfaceWorksitePresentation();
		presentationNode.setNode(obj);			
						
		return presentationNode;
	}
}
