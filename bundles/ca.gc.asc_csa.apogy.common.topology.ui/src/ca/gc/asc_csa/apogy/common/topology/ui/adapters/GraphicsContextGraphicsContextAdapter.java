package ca.gc.asc_csa.apogy.common.topology.ui.adapters;

import ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext;
import ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContextAdapter;

public class GraphicsContextGraphicsContextAdapter implements
		GraphicsContextAdapter {

	public GraphicsContextGraphicsContextAdapter() {
	}

	@Override
	public boolean isAdapterFor(Object obj) 
	{
		boolean isAdapter = false;
		if(obj instanceof GraphicsContext)
		{
			GraphicsContext gc = (GraphicsContext) obj;
			
			if(gc.getTopology() != null)
			{
				isAdapter = true;
			}
		}		
		return isAdapter;
	}

	@Override
	public GraphicsContext getAdapter(Object obj, Object context) 
	{
		GraphicsContext graphicsContext = null;
		if(isAdapterFor(obj))
		{
			graphicsContext = (GraphicsContext) obj;
		}		
		return graphicsContext;
	}

	@Override
	public Class<?> getAdaptedClass() {
		return GraphicsContext.class;
	}
}
