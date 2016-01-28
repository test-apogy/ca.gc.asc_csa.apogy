/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.topology.ui.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.topology.AbstractNodeVisitor;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.Activator;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;
import ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationRegistry;
import ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFactory;
import ca.gc.asc_csa.apogy.common.topology.ui.internal.MultiNodeListener;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topology Presentation Registry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.TopologyPresentationRegistryImpl#getTopologyPresentationSetList <em>Topology Presentation Set List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.TopologyPresentationRegistryImpl#getNodePresentationList <em>Node Presentation List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopologyPresentationRegistryImpl extends MinimalEObjectImpl.Container implements TopologyPresentationRegistry 
{
	private boolean verbose = false;
	private MultiNodeListener multiNodeListener = null;
	private Map<Node, NodePresentation> nodeToNodePresentationMap = new HashMap<Node, NodePresentation>(100);
	
	/**
	 * The cached value of the '{@link #getTopologyPresentationSetList() <em>Topology Presentation Set List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologyPresentationSetList()
	 * @generated
	 * @ordered
	 */
	protected EList<TopologyPresentationSet> topologyPresentationSetList;

	/**
	 * The cached value of the '{@link #getNodePresentationList() <em>Node Presentation List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodePresentationList()
	 * @generated
	 * @ordered
	 */
	protected EList<NodePresentation> nodePresentationList;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopologyPresentationRegistryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonTopologyUIPackage.Literals.TOPOLOGY_PRESENTATION_REGISTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TopologyPresentationSet> getTopologyPresentationSetList() {
		if (topologyPresentationSetList == null) {
			topologyPresentationSetList = new EObjectContainmentWithInverseEList<TopologyPresentationSet>(TopologyPresentationSet.class, this, ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_REGISTRY__TOPOLOGY_PRESENTATION_SET_LIST, ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__TOPOLOGY_PRESENTATION_REGISTRY);
		}
		return topologyPresentationSetList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodePresentation> getNodePresentationList() {
		if (nodePresentationList == null) {
			nodePresentationList = new EObjectContainmentEList<NodePresentation>(NodePresentation.class, this, ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_REGISTRY__NODE_PRESENTATION_LIST);
		}
		return nodePresentationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public TopologyPresentationSet createTopologyPresentationSet(Node topologyRoot) 
	{
		final TopologyPresentationSet topologyPresentationSet = ApogyCommonTopologyUIFactory.eINSTANCE.createTopologyPresentationSet();
		
		// Visit the topology spanned by the topologyRoot.
		AbstractNodeVisitor visitor = new AbstractNodeVisitor() 
		{			
			@Override
			public void visit(Node node) 
			{
				// Check to see if the registry already contains a NodePresentation associated with node.
				NodePresentation nodePresentation = getPresentationNode(node);										
				
				// If no NodePresentation has been found, attempts to create one.
				if(nodePresentation == null)
				{
					nodePresentation = createNodePresentation(node);
					
					// If a NodePresentation was successfully created, add it to the list
					if(nodePresentation != null)
					{
						addNodePresentation(nodePresentation);
					}					
				}	
				
				// If a NodePresentation was found or created.
				if(nodePresentation != null)
				{
					// Adds the NodePresenation to the TopologyPresentationSet.
					topologyPresentationSet.getNodePresentationList().add(nodePresentation);
					
					// Adds the TopologyPresentationSet to the nodePresentation.
					nodePresentation.getTopologyPresentationSet().add(topologyPresentationSet);
				}
			}
		};
		topologyRoot.accept(visitor);
		
		getTopologyPresentationSetList().add(topologyPresentationSet);
		
		return topologyPresentationSet;
	}
			
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void release(final TopologyPresentationSet topologyPresentationSet) 
	{
		if(topologyPresentationSet != null)
		{
			for(Node node : topologyPresentationSet.getNodes())
			{
				NodePresentation nodePresentation = getPresentationNode(node);
				
				if(nodePresentation != null)
				{
					nodePresentation.getTopologyPresentationSet().remove(topologyPresentationSet);
					
					// If the NodePresentation is no longer in use, release it.
					if(nodePresentation.getTopologyPresentationSet().isEmpty())
					{
						// Remove the nodePresentation
						removeNodePresentation(nodePresentation);
					}
				}
			}
			
			// Have the TopologyPresentationSet release all references to Node, Node Presentation and TopologyPresentationRegistry.		
			topologyPresentationSet.getNodePresentationList().clear();
			topologyPresentationSet.setTopologyPresentationRegistry(null);		
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public NodePresentation getPresentationNode(Node node) 
	{
		return nodeToNodePresentationMap.get(node);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_REGISTRY__TOPOLOGY_PRESENTATION_SET_LIST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTopologyPresentationSetList()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_REGISTRY__TOPOLOGY_PRESENTATION_SET_LIST:
				return ((InternalEList<?>)getTopologyPresentationSetList()).basicRemove(otherEnd, msgs);
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_REGISTRY__NODE_PRESENTATION_LIST:
				return ((InternalEList<?>)getNodePresentationList()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_REGISTRY__TOPOLOGY_PRESENTATION_SET_LIST:
				return getTopologyPresentationSetList();
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_REGISTRY__NODE_PRESENTATION_LIST:
				return getNodePresentationList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_REGISTRY__TOPOLOGY_PRESENTATION_SET_LIST:
				getTopologyPresentationSetList().clear();
				getTopologyPresentationSetList().addAll((Collection<? extends TopologyPresentationSet>)newValue);
				return;
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_REGISTRY__NODE_PRESENTATION_LIST:
				getNodePresentationList().clear();
				getNodePresentationList().addAll((Collection<? extends NodePresentation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_REGISTRY__TOPOLOGY_PRESENTATION_SET_LIST:
				getTopologyPresentationSetList().clear();
				return;
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_REGISTRY__NODE_PRESENTATION_LIST:
				getNodePresentationList().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_REGISTRY__TOPOLOGY_PRESENTATION_SET_LIST:
				return topologyPresentationSetList != null && !topologyPresentationSetList.isEmpty();
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_REGISTRY__NODE_PRESENTATION_LIST:
				return nodePresentationList != null && !nodePresentationList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_REGISTRY___CREATE_TOPOLOGY_PRESENTATION_SET__NODE:
				return createTopologyPresentationSet((Node)arguments.get(0));
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_REGISTRY___RELEASE__TOPOLOGYPRESENTATIONSET:
				release((TopologyPresentationSet)arguments.get(0));
				return null;
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_REGISTRY___GET_PRESENTATION_NODE__NODE:
				return getPresentationNode((Node)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	private NodePresentation createNodePresentation(Node node)
	{
		if(verbose) System.out.println("TopologyPresentationRegistryImpl.createNodePresentation(" + node +")");
		
		NodePresentation nodePresentation = null;
		
		// Gets the NodePresentation Adapter associated with the topology node.
		NodePresentationAdapter adapter = Activator.getDefault().getNodePresentationAdapterFactory().getAdapterFor(node);
		if(adapter != null)
		{
			// Attempts to create the NodePresentation associated with the node.
			nodePresentation = adapter.getAdapter(node, null);
		}
	
		return nodePresentation;
	}
	
	private synchronized void addNodePresentation(NodePresentation nodePresentation)
	{
		// Adds the NodePresentation to the list of NodePresentation.
		getNodePresentationList().add(nodePresentation);
		
		// Adds the Node and its NodePresentation to the map.
		nodeToNodePresentationMap.put(nodePresentation.getNode(), nodePresentation);
		
		// Registers a listener to the underlying Node.
		getMultiNodeListener().registerNode(nodePresentation.getNode());
		
		// Update the affected TopologyPresentationSet		
		if(nodePresentation.getNode().getParent() instanceof GroupNode)
		{
			// Here we need to check the parent node to figure out who is affected.
			GroupNode parent = (GroupNode) nodePresentation.getNode().getParent();
			List<TopologyPresentationSet> affectedTopologyPresentationSet = getAffectedTopologyPresentationSet(parent);
			
			// Update each TopologyPresentationSet affected.
			for(TopologyPresentationSet topologyPresentationSet : affectedTopologyPresentationSet)
			{
				try
				{								
					topologyPresentationSet.getNodePresentationList().add(nodePresentation);					
				}
				catch(Throwable t)
				{
					t.printStackTrace();
				}
			}
		}
	}
	
	private synchronized void removeNodePresentation(NodePresentation nodePresentation)
	{						
		// Un-Registers a listener from the underlying Node.
		getMultiNodeListener().unregisterNode(nodePresentation.getNode());
	
		// Here we need to check the node itself to figure out who is affected.
		List<TopologyPresentationSet> affectedTopologyPresentationSet = new ArrayList<TopologyPresentationSet>(nodePresentation.getTopologyPresentationSet());
			
		// Update each TopologyPresentationSet affected.
		for(TopologyPresentationSet topologyPresentationSet : affectedTopologyPresentationSet)
		{
			try
			{
				topologyPresentationSet.getNodePresentationList().remove(nodePresentation);
			}
			catch(Throwable t)
			{
				t.printStackTrace();
			}
		}	
		
		// Removes the Node and its NodePresentation from the map.
		nodeToNodePresentationMap.remove(nodePresentation.getNode());
				
		// Removes the NodePresentation from the list.
		getNodePresentationList().remove(nodePresentation);	
	}

	private synchronized void addNodeAndChildrens(Node topologyRoot)
	{
		if(verbose) System.out.println("TopologyPresentationRegistryImpl.addNodeAndChildrens(" + topologyRoot + ")");
		
		// Visit the topology spanned by the topologyRoot.
		AbstractNodeVisitor visitor = new AbstractNodeVisitor() 
		{			
			@Override
			public void visit(Node node) 
			{
				if(verbose)  System.out.println("/t CHILD " + node);
				
				NodePresentation nodePresentation = getPresentationNode(node);
				
				// NodePresentation not created yet, create one.
				if(nodePresentation == null)
				{
					nodePresentation = createNodePresentation(node);
					if(nodePresentation != null)
					{
						addNodePresentation(nodePresentation);
					}
					else
					{
						Logger.INSTANCE.log(Activator.ID, this, "No NodePresentation found for node <" + node + "> !", EventSeverity.WARNING);
					}
				}
			}
		};
		topologyRoot.accept(visitor);
	}
	
	private synchronized void removeNodeAndChildrens(Node topologyRoot)
	{
		// Visit the topology spanned by the topologyRoot.
		AbstractNodeVisitor visitor = new AbstractNodeVisitor() 
		{			
			@Override
			public void visit(Node node) 
			{
				NodePresentation nodePresentation = getPresentationNode(node);
				if(nodePresentation != null)
				{
					removeNodePresentation(nodePresentation);
				}
			}
		};
		topologyRoot.accept(visitor);
	}
	
	private MultiNodeListener getMultiNodeListener() 
	{
		if(multiNodeListener == null)
		{
			multiNodeListener = new MultiNodeListener()
			{
				@Override
				protected void nodeAdded(GroupNode parent, Node nodeAdded) 
				{
					addNodeAndChildrens(nodeAdded);
				}
				
				@Override
				protected void nodesAdded(GroupNode parent,List<Node> nodesAdded) 
				{
					for(Node node : nodesAdded)
					{
						addNodeAndChildrens(node);
					}					
				}
				
				@Override
				protected void nodeRemoved(GroupNode parent, Node nodeRemoved) 
				{										
					removeNodeAndChildrens(nodeRemoved);
				}
				
				@Override
				protected void nodesRemoved(GroupNode parent, List<Node> nodesRemoved) 
				{
					for(Node node : nodesRemoved)
					{
						removeNodeAndChildrens(node);
					}					
				}
			};
		}
		return multiNodeListener;
	}
		
	private List<TopologyPresentationSet> getAffectedTopologyPresentationSet(Node node)
	{
		List<TopologyPresentationSet> topologyPresentationSetList = new ArrayList<TopologyPresentationSet>();
		
		NodePresentation nodePresentation = getPresentationNode(node);
		if(nodePresentation != null)
		{
			topologyPresentationSetList.addAll(nodePresentation.getTopologyPresentationSet());
		}
		
		return topologyPresentationSetList;
	}
	
} //TopologyPresentationRegistryImpl
