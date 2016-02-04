package ca.gc.asc_csa.apogy.common.topology.ui.converters;
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

import ca.gc.asc_csa.apogy.common.converters.IConverter;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.Activator;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;

public class NodeToNodePresentationConverter implements IConverter 
{

	@Override
	public boolean canConvert(Object arg0) 
	{
		if(arg0 instanceof Node)
		{
			Node node = (Node) arg0;
			return Activator.getTopologyPresentationRegistry().getPresentationNode(node) != null;
		}
		return false;
	}

	@Override
	public Object convert(Object arg0) throws Exception 
	{	
		Node node = (Node) arg0;
		return Activator.getTopologyPresentationRegistry().getPresentationNode(node);
	}

	@Override
	public Class<?> getInputType() 
	{		
		return Node.class;
	}

	@Override
	public Class<?> getOutputType() 
	{		
		return NodePresentation.class;
	}

}
