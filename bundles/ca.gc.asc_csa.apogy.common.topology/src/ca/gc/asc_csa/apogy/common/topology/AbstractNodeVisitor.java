package ca.gc.asc_csa.apogy.common.topology;
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

import ca.gc.asc_csa.apogy.common.topology.INodeVisitor;
import ca.gc.asc_csa.apogy.common.topology.Node;

public abstract class AbstractNodeVisitor implements INodeVisitor
{
	private Class<? extends Node> type;

	public AbstractNodeVisitor()
	{
		setType(Node.class);
	}

	@Override
	public Class<? extends Node> getType()
	{
		return type;
	}

	@Override
	public void setType(Class<? extends Node> value)
	{
		type = value;
	}

}
