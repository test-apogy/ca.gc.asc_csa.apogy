/**
 * <copyright>
 * </copyright>
 *
 * $Id: PhysicalBodyNodeMassVisitor.java,v 1.6.2.2 2015/02/03 20:01:37 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.topology.addons.dynamics;

import ca.gc.space.topology.AbstractNodeVisitor;
import ca.gc.space.topology.Node;

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
