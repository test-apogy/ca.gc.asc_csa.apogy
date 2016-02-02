package ca.gc.asc_csa.apogy.addons.ui.adapters;
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

import ca.gc.asc_csa.apogy.addons.Ruler3dToolNode;
import ca.gc.asc_csa.apogy.addons.ui.Ruler3dToolNodePresentation;
import ca.gc.asc_csa.apogy.addons.ui.ApogyAddonsUIFactory;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

public class Ruler3dToolNodePresentationAdapter implements NodePresentationAdapter
{

	public Ruler3dToolNodePresentationAdapter()
	{
	}


	public Class<?> getAdaptedClass()
	{		
		return Ruler3dToolNode.class;
	}


	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof Ruler3dToolNode;
	}


	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		Ruler3dToolNode ruler3dToolNode = (Ruler3dToolNode) obj;
		
		Ruler3dToolNodePresentation presentationNode = ApogyAddonsUIFactory.eINSTANCE.createRuler3dToolNodePresentation();
		presentationNode.setNode(ruler3dToolNode);			
						
		return presentationNode;
	}

}
