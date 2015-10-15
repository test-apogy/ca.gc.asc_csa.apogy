/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.ui.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.GraphicsContext;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.TopologyPresentationRegistry;
import org.eclipse.symphony.common.topology.ui.TopologyPresentationSet;
import org.eclipse.symphony.common.topology.ui.TopologyUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topology Presentation Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.impl.TopologyPresentationSetImpl#getTopologyPresentationRegistry <em>Topology Presentation Registry</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.impl.TopologyPresentationSetImpl#getGraphicsContext <em>Graphics Context</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.impl.TopologyPresentationSetImpl#getNodePresentationList <em>Node Presentation List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TopologyPresentationSetImpl extends MinimalEObjectImpl.Container implements TopologyPresentationSet 
{		
	/**
	 * The cached value of the '{@link #getGraphicsContext() <em>Graphics Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicsContext()
	 * @generated
	 * @ordered
	 */
	protected GraphicsContext graphicsContext;

	/**
	 * The cached value of the '{@link #getNodePresentationList() <em>Node Presentation List</em>}' reference list.
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
	protected TopologyPresentationSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopologyUIPackage.Literals.TOPOLOGY_PRESENTATION_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyPresentationRegistry getTopologyPresentationRegistry() {
		if (eContainerFeatureID() != TopologyUIPackage.TOPOLOGY_PRESENTATION_SET__TOPOLOGY_PRESENTATION_REGISTRY) return null;
		return (TopologyPresentationRegistry)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyPresentationRegistry basicGetTopologyPresentationRegistry() {
		if (eContainerFeatureID() != TopologyUIPackage.TOPOLOGY_PRESENTATION_SET__TOPOLOGY_PRESENTATION_REGISTRY) return null;
		return (TopologyPresentationRegistry)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopologyPresentationRegistry(TopologyPresentationRegistry newTopologyPresentationRegistry, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTopologyPresentationRegistry, TopologyUIPackage.TOPOLOGY_PRESENTATION_SET__TOPOLOGY_PRESENTATION_REGISTRY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopologyPresentationRegistry(TopologyPresentationRegistry newTopologyPresentationRegistry) {
		if (newTopologyPresentationRegistry != eInternalContainer() || (eContainerFeatureID() != TopologyUIPackage.TOPOLOGY_PRESENTATION_SET__TOPOLOGY_PRESENTATION_REGISTRY && newTopologyPresentationRegistry != null)) {
			if (EcoreUtil.isAncestor(this, newTopologyPresentationRegistry))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTopologyPresentationRegistry != null)
				msgs = ((InternalEObject)newTopologyPresentationRegistry).eInverseAdd(this, TopologyUIPackage.TOPOLOGY_PRESENTATION_REGISTRY__TOPOLOGY_PRESENTATION_SET_LIST, TopologyPresentationRegistry.class, msgs);
			msgs = basicSetTopologyPresentationRegistry(newTopologyPresentationRegistry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyUIPackage.TOPOLOGY_PRESENTATION_SET__TOPOLOGY_PRESENTATION_REGISTRY, newTopologyPresentationRegistry, newTopologyPresentationRegistry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicsContext getGraphicsContext() {
		if (graphicsContext != null && graphicsContext.eIsProxy()) {
			InternalEObject oldGraphicsContext = (InternalEObject)graphicsContext;
			graphicsContext = (GraphicsContext)eResolveProxy(oldGraphicsContext);
			if (graphicsContext != oldGraphicsContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TopologyUIPackage.TOPOLOGY_PRESENTATION_SET__GRAPHICS_CONTEXT, oldGraphicsContext, graphicsContext));
			}
		}
		return graphicsContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicsContext basicGetGraphicsContext() {
		return graphicsContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphicsContext(GraphicsContext newGraphicsContext, NotificationChain msgs) {
		GraphicsContext oldGraphicsContext = graphicsContext;
		graphicsContext = newGraphicsContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyUIPackage.TOPOLOGY_PRESENTATION_SET__GRAPHICS_CONTEXT, oldGraphicsContext, newGraphicsContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphicsContext(GraphicsContext newGraphicsContext) {
		if (newGraphicsContext != graphicsContext) {
			NotificationChain msgs = null;
			if (graphicsContext != null)
				msgs = ((InternalEObject)graphicsContext).eInverseRemove(this, TopologyUIPackage.GRAPHICS_CONTEXT__TOPOLOGY_PRESENTATION_SET, GraphicsContext.class, msgs);
			if (newGraphicsContext != null)
				msgs = ((InternalEObject)newGraphicsContext).eInverseAdd(this, TopologyUIPackage.GRAPHICS_CONTEXT__TOPOLOGY_PRESENTATION_SET, GraphicsContext.class, msgs);
			msgs = basicSetGraphicsContext(newGraphicsContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyUIPackage.TOPOLOGY_PRESENTATION_SET__GRAPHICS_CONTEXT, newGraphicsContext, newGraphicsContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodePresentation> getNodePresentationList() {
		if (nodePresentationList == null) {
			nodePresentationList = new EObjectWithInverseResolvingEList.ManyInverse<NodePresentation>(NodePresentation.class, this, TopologyUIPackage.TOPOLOGY_PRESENTATION_SET__NODE_PRESENTATION_LIST, TopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET);
		}
		return nodePresentationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public NodePresentation getPresentationNode(Node node) 
	{
		return getTopologyPresentationRegistry().getPresentationNode(node);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public List<Node> getNodes() 
	{
		List<Node> nodes = new ArrayList<Node>();
		
		for(NodePresentation nodePresentation : getNodePresentationList())
		{
			nodes.add(nodePresentation.getNode());
		}
		
		return nodes;
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
			case TopologyUIPackage.TOPOLOGY_PRESENTATION_SET__TOPOLOGY_PRESENTATION_REGISTRY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTopologyPresentationRegistry((TopologyPresentationRegistry)otherEnd, msgs);
			case TopologyUIPackage.TOPOLOGY_PRESENTATION_SET__GRAPHICS_CONTEXT:
				if (graphicsContext != null)
					msgs = ((InternalEObject)graphicsContext).eInverseRemove(this, TopologyUIPackage.GRAPHICS_CONTEXT__TOPOLOGY_PRESENTATION_SET, GraphicsContext.class, msgs);
				return basicSetGraphicsContext((GraphicsContext)otherEnd, msgs);
			case TopologyUIPackage.TOPOLOGY_PRESENTATION_SET__NODE_PRESENTATION_LIST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodePresentationList()).basicAdd(otherEnd, msgs);
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
			case TopologyUIPackage.TOPOLOGY_PRESENTATION_SET__TOPOLOGY_PRESENTATION_REGISTRY:
				return basicSetTopologyPresentationRegistry(null, msgs);
			case TopologyUIPackage.TOPOLOGY_PRESENTATION_SET__GRAPHICS_CONTEXT:
				return basicSetGraphicsContext(null, msgs);
			case TopologyUIPackage.TOPOLOGY_PRESENTATION_SET__NODE_PRESENTATION_LIST:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TopologyUIPackage.TOPOLOGY_PRESENTATION_SET__TOPOLOGY_PRESENTATION_REGISTRY:
				return eInternalContainer().eInverseRemove(this, TopologyUIPackage.TOPOLOGY_PRESENTATION_REGISTRY__TOPOLOGY_PRESENTATION_SET_LIST, TopologyPresentationRegistry.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TopologyUIPackage.TOPOLOGY_PRESENTATION_SET__TOPOLOGY_PRESENTATION_REGISTRY:
				if (resolve) return getTopologyPresentationRegistry();
				return basicGetTopologyPresentationRegistry();
			case TopologyUIPackage.TOPOLOGY_PRESENTATION_SET__GRAPHICS_CONTEXT:
				if (resolve) return getGraphicsContext();
				return basicGetGraphicsContext();
			case TopologyUIPackage.TOPOLOGY_PRESENTATION_SET__NODE_PRESENTATION_LIST:
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
			case TopologyUIPackage.TOPOLOGY_PRESENTATION_SET__TOPOLOGY_PRESENTATION_REGISTRY:
				setTopologyPresentationRegistry((TopologyPresentationRegistry)newValue);
				return;
			case TopologyUIPackage.TOPOLOGY_PRESENTATION_SET__GRAPHICS_CONTEXT:
				setGraphicsContext((GraphicsContext)newValue);
				return;
			case TopologyUIPackage.TOPOLOGY_PRESENTATION_SET__NODE_PRESENTATION_LIST:
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
			case TopologyUIPackage.TOPOLOGY_PRESENTATION_SET__TOPOLOGY_PRESENTATION_REGISTRY:
				setTopologyPresentationRegistry((TopologyPresentationRegistry)null);
				return;
			case TopologyUIPackage.TOPOLOGY_PRESENTATION_SET__GRAPHICS_CONTEXT:
				setGraphicsContext((GraphicsContext)null);
				return;
			case TopologyUIPackage.TOPOLOGY_PRESENTATION_SET__NODE_PRESENTATION_LIST:
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
			case TopologyUIPackage.TOPOLOGY_PRESENTATION_SET__TOPOLOGY_PRESENTATION_REGISTRY:
				return basicGetTopologyPresentationRegistry() != null;
			case TopologyUIPackage.TOPOLOGY_PRESENTATION_SET__GRAPHICS_CONTEXT:
				return graphicsContext != null;
			case TopologyUIPackage.TOPOLOGY_PRESENTATION_SET__NODE_PRESENTATION_LIST:
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
			case TopologyUIPackage.TOPOLOGY_PRESENTATION_SET___GET_PRESENTATION_NODE__NODE:
				return getPresentationNode((Node)arguments.get(0));
			case TopologyUIPackage.TOPOLOGY_PRESENTATION_SET___GET_NODES:
				return getNodes();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TopologyPresentationSetImpl
