/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.space.topology.ui.impl;

import java.lang.reflect.InvocationTargetException;

import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector3f;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.space.math.Tuple3d;
import ca.gc.space.topology.AbstractNodeVisitor;
import ca.gc.space.topology.INodeVisitor;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.Activator;
import ca.gc.space.topology.ui.GraphicsContext;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodeSelection;
import ca.gc.space.topology.ui.TopologyPresentationSet;
import ca.gc.space.topology.ui.TopologyUIFacade;
import ca.gc.space.topology.ui.TopologyUIFactory;
import ca.gc.space.topology.ui.TopologyUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TopologyUIFacadeImpl extends MinimalEObjectImpl.Container implements TopologyUIFacade 
{
	private static TopologyUIFacade instance = null;

	public static TopologyUIFacade getInstance() 
	{
		if (instance == null) 
		{
			instance = new TopologyUIFacadeImpl();
		}
		return instance;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopologyUIFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopologyUIPackage.Literals.TOPOLOGY_UI_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public GraphicsContext createGraphicsContext(Node topologyRoot) 
	{
		GraphicsContext graphicsContext = TopologyUIFactory.eINSTANCE.createGraphicsContext();
		graphicsContext.setTopology(topologyRoot);
		
		TopologyPresentationSet topologyPresentationSet = Activator.getTopologyPresentationRegistry().createTopologyPresentationSet(topologyRoot);
		graphicsContext.setTopologyPresentationSet(topologyPresentationSet);
			
		return graphicsContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void findExtent(final Node root, final TopologyPresentationSet topologyPresentationSet, final Tuple3d min, final Tuple3d max) 
	{
		min.setX(Double.POSITIVE_INFINITY);
		min.setY(Double.POSITIVE_INFINITY);
		min.setZ(Double.POSITIVE_INFINITY);
		
		max.setX(Double.NEGATIVE_INFINITY);
		max.setY(Double.NEGATIVE_INFINITY);
		max.setZ(Double.NEGATIVE_INFINITY);
		
		// Goes through the topology using a visitor.
		INodeVisitor visitor = new AbstractNodeVisitor() 
		{
			@Override
			public void visit(Node node) 
			{
				// Gets the presentation node associated with the Node
				NodePresentation nodePresentation = topologyPresentationSet.getPresentationNode(node);
				
				if(nodePresentation != null && nodePresentation.isVisible() && nodePresentation.isUseInBoundingCalculation())
				{
					// Gets the extent of the node.
					Tuple3d nodeMin = nodePresentation.getMin();
					Tuple3d nodeMax = nodePresentation.getMax();
					
					Matrix4d m = ca.gc.space.topology.TopologyFacade.INSTANCE.expressInFrame(node, root);
					
					if(nodeMin != null)
					{
						// Express the nodeMin in the root node transform
						Vector3d v = new Vector3d(nodeMin.asTuple3d());
						m.transform(v);
						
						// Updates min
						if(v.x < min.getX())
						{
							min.setX(v.x);
						}
						
						if(v.y < min.getY())
						{
							min.setY(v.y);
						}
						
						if(v.z < min.getZ())
						{
							min.setZ(v.z);
						}
					}
					
					if(nodeMax != null)
					{
						// Express the nodeMax in the root node transform
						Vector3d v = new Vector3d(nodeMax.asTuple3d());
						m.transform(v);
						
						// Updates max
						if(v.x > max.getX())
						{
							max.setX(v.x);
						}
						
						if(v.y > max.getY())
						{
							max.setY(v.y);
						}
						
						if(v.z > max.getZ())
						{
							max.setZ(v.z);
						}
					}
				}				
			}
		};
		root.accept(visitor);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public NodeSelection createNodeSelection(TopologyPresentationSet topologyPresentationSet, NodePresentation nodePresentation, Point3d relativePosition) 
	{
		NodeSelection nodeSelection = TopologyUIFactory.eINSTANCE.createNodeSelection();
		
		nodeSelection.setTopologyPresentationSet(topologyPresentationSet);
		nodeSelection.setSelectedNode(nodePresentation.getNode());
		nodeSelection.setNodePresentation(nodePresentation);
		nodeSelection.setRelativeIntersectionPoint(relativePosition);
		
		return nodeSelection;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public NodeSelection createNodeSelection(TopologyPresentationSet topologyPresentationSet, Node node, Point3d relativePosition, Vector3f relativeNormal) 
	{
		NodeSelection nodeSelection = TopologyUIFactory.eINSTANCE.createNodeSelection();
		
		nodeSelection.setTopologyPresentationSet(topologyPresentationSet);
		nodeSelection.setSelectedNode(node);
		nodeSelection.setRelativeIntersectionPoint(relativePosition);
		nodeSelection.setRelativeIntersectionNormal(relativeNormal);
		
		return nodeSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TopologyUIPackage.TOPOLOGY_UI_FACADE___CREATE_GRAPHICS_CONTEXT__NODE:
				return createGraphicsContext((Node)arguments.get(0));
			case TopologyUIPackage.TOPOLOGY_UI_FACADE___FIND_EXTENT__NODE_TOPOLOGYPRESENTATIONSET_TUPLE3D_TUPLE3D:
				findExtent((Node)arguments.get(0), (TopologyPresentationSet)arguments.get(1), (Tuple3d)arguments.get(2), (Tuple3d)arguments.get(3));
				return null;
			case TopologyUIPackage.TOPOLOGY_UI_FACADE___CREATE_NODE_SELECTION__TOPOLOGYPRESENTATIONSET_NODEPRESENTATION_POINT3D:
				return createNodeSelection((TopologyPresentationSet)arguments.get(0), (NodePresentation)arguments.get(1), (Point3d)arguments.get(2));
			case TopologyUIPackage.TOPOLOGY_UI_FACADE___CREATE_NODE_SELECTION__TOPOLOGYPRESENTATIONSET_NODE_POINT3D_VECTOR3F:
				return createNodeSelection((TopologyPresentationSet)arguments.get(0), (Node)arguments.get(1), (Point3d)arguments.get(2), (Vector3f)arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TopologyUIFacadeImpl
