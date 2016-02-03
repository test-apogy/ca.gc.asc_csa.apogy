package ca.gc.asc_csa.apogy.common.topology.ui.adapters;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

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
