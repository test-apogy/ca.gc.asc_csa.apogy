package ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.adapters;
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

import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.ApogyCoreEnvironmentSurfaceEarthUIFactory;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.SunVector3DToolNode;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.SunVector3DToolNodePresentation;

public class SunVector3DToolNodePresentationAdapter implements NodePresentationAdapter
{

	public SunVector3DToolNodePresentationAdapter()
	{
	}


	public Class<?> getAdaptedClass()
	{		
		return SunVector3DToolNode.class;
	}


	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof SunVector3DToolNode;
	}


	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		SunVector3DToolNode ruler3dToolNode = (SunVector3DToolNode) obj;
		
		SunVector3DToolNodePresentation presentationNode = ApogyCoreEnvironmentSurfaceEarthUIFactory.eINSTANCE.createSunVector3DToolNodePresentation();
		presentationNode.setNode(ruler3dToolNode);			
						
		return presentationNode;
	}

}