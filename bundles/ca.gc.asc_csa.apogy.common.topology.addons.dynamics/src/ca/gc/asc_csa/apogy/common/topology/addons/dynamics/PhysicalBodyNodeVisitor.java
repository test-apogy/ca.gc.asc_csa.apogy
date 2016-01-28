/**
 * <copyright>
 * </copyright>
 *
 * $Id: PhysicalBodyNodeVisitor.java,v 1.2.2.2 2015/02/03 20:01:37 rlarcheveque Exp $
 */
package ca.gc.asc_csa.apogy.common.topology.addons.dynamics;

import java.util.HashSet;
import java.util.Set;

import ca.gc.asc_csa.apogy.common.topology.AbstractNodeVisitor;
import ca.gc.asc_csa.apogy.common.topology.Node;


/**
 * 
 */
public class PhysicalBodyNodeVisitor extends AbstractNodeVisitor 
{
	protected Set<PhysicalBody> physicalBodies;


	public PhysicalBodyNodeVisitor()
	{
		setType(PhysicalBody.class);
	}

	@Override
	public void visit(Node node) 
	{
		if(node instanceof PhysicalBody)
		{
			PhysicalBody physicalBodyNode = (PhysicalBody) node;
			getPhysicalBodies().add(physicalBodyNode);
		}		
	}
	
	public Set<PhysicalBody> getPhysicalBodies() 
	{
		if(physicalBodies == null)
		{
			physicalBodies = new HashSet<PhysicalBody>();
		}
		return physicalBodies;
	}
} // PhysicalBodyNodeMassVisitor
