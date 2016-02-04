package ca.gc.asc_csa.apogy.common.topology.addons.dynamics;
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

import ca.gc.asc_csa.apogy.common.topology.AbstractNodeVisitor;
import ca.gc.asc_csa.apogy.common.topology.Node;

public class PhysicalBodyNodeMassVisitor extends AbstractNodeVisitor 
{

	protected double totalMass = 0.0;
	
	public PhysicalBodyNodeMassVisitor()
	{
		setType(PhysicalBody.class);
	}

	@Override
	public void visit(Node node) 
	{
		if(node instanceof PhysicalBody)
		{
			PhysicalBody physicalBodyNode = (PhysicalBody) node;
			if(physicalBodyNode.getPhysicalProperties() != null)
			{				
				totalMass += physicalBodyNode.getPhysicalProperties().getMass();
			}
		}
		
	}
	
	public double getTotalMass()
	{
		return totalMass;
	}
} // PhysicalBodyNodeMassVisitor
