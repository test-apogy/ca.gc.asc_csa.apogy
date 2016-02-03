package ca.gc.asc_csa.apogy.addons.geometry.paths.ui.adapters;
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

import ca.gc.asc_csa.apogy.addons.geometry.paths.WayPoint;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ui.ApogyAddonsGeometryPathsUIFactory;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ui.WayPointPresentation;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

public class WayPointPresentationAdapter implements NodePresentationAdapter
{
	@Override
	public Class<?> getAdaptedClass()
	{		
		return WayPoint.class;
	}

	@Override
	public NodePresentation getAdapter(Node obj, Object context)
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}
				
		WayPointPresentation presentationNode = ApogyAddonsGeometryPathsUIFactory.eINSTANCE.createWayPointPresentation();						
		presentationNode.setNode((WayPoint) obj);
		
		return presentationNode;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof WayPoint;
	}
}
