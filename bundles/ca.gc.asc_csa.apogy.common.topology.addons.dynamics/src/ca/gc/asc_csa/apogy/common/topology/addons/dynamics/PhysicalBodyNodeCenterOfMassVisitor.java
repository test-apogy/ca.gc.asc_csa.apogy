/**
 * <copyright>
 * </copyright>
 *
 * $Id: PhysicalBodyNodeCenterOfMassVisitor.java,v 1.3.2.3 2015/02/03 20:01:37 rlarcheveque Exp $
 */
package ca.gc.asc_csa.apogy.common.topology.addons.dynamics;

import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;

public class PhysicalBodyNodeCenterOfMassVisitor extends PhysicalBodyNodeMassVisitor 
{
	protected javax.vecmath.Point3d temporaryCenterOfMassPosition = new javax.vecmath.Point3d();
	protected Node root;

	public PhysicalBodyNodeCenterOfMassVisitor()
	{
		super();
	}
	
	public PhysicalBodyNodeCenterOfMassVisitor(Node root)
	{
		super();
		setRoot(root);
	}
	
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	public Tuple3d getCenterOfMassPosition() 
	{			
		Vector3d temp = new Vector3d(temporaryCenterOfMassPosition);
		temp.scale(1.0 / getTotalMass());					
		return ApogyCommonMathFacade.INSTANCE.createTuple3d(temp);
	}
	
	@Override
	public void visit(Node node) 
	{				
		if(node instanceof PhysicalBody)
		{
			PhysicalBody physicalBodyNode = (PhysicalBody) node;
			if(physicalBodyNode.getPhysicalProperties() != null)				
			{				
				PhysicalProperties physicalProperties = physicalBodyNode.getPhysicalProperties();
				
				// If the physical node has mass.
				if(physicalProperties.getMass() != 0.0)
				{
					// Gets the transform of the node with respect to the root.
					Matrix4d m = ApogyCommonTopologyFacade.INSTANCE.expressInFrame(physicalBodyNode, getRoot());
					
					// Gets the position of the center of mass in the root node frame.
					Point3d v = new Point3d();					
					if(physicalProperties.getCenterOfMassLocation() != null)
					{				
						v = new Point3d(physicalProperties.getCenterOfMassLocation().asTuple3d());
					}								
					m.transform(v);
					
					// Multiply by the mass.
					v.scale(physicalProperties.getMass());
					
					// Adds the vector.
					temporaryCenterOfMassPosition.add(v);															
				}
			}
		}
		
		super.visit(node);
	}	
} // PhysicalBodyNodeCenterOfMassVisitor
