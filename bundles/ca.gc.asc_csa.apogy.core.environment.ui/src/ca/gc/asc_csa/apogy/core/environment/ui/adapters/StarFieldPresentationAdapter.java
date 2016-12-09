package ca.gc.asc_csa.apogy.core.environment.ui.adapters;
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
import ca.gc.asc_csa.apogy.core.environment.StarField;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIFactory;
import ca.gc.asc_csa.apogy.core.environment.ui.StarFieldPresentation;

public class StarFieldPresentationAdapter implements NodePresentationAdapter
{

	public StarFieldPresentationAdapter()
	{
	}

	@Override
	public Class<?> getAdaptedClass()
	{		
		return StarField.class;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof StarField;
	}

	@Override
	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		StarField starField = (StarField) obj;
		
		StarFieldPresentation presentationNode = ApogyCoreEnvironmentUIFactory.eINSTANCE.createStarFieldPresentation();
		presentationNode.setNode(starField);			
						
		return presentationNode;
	}
}
