package ca.gc.asc_csa.apogy.common.topology.ui.impl;
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
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;
import ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationRegistry;
import ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topology Presentation Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.TopologyPresentationSetImpl#getTopologyPresentationRegistry <em>Topology Presentation Registry</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.TopologyPresentationSetImpl#getGraphicsContext <em>Graphics Context</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.TopologyPresentationSetImpl#getNodePresentationList <em>Node Presentation List</em>}</li>
 * </ul>
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
		return ApogyCommonTopologyUIPackage.Literals.TOPOLOGY_PRESENTATION_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyPresentationRegistry getTopologyPresentationRegistry() {
		if (eContainerFeatureID() != ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__TOPOLOGY_PRESENTATION_REGISTRY) return null;
		return (TopologyPresentationRegistry)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyPresentationRegistry basicGetTopologyPresentationRegistry() {
		if (eContainerFeatureID() != ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__TOPOLOGY_PRESENTATION_REGISTRY) return null;
		return (TopologyPresentationRegistry)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopologyPresentationRegistry(TopologyPresentationRegistry newTopologyPresentationRegistry, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTopologyPresentationRegistry, ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__TOPOLOGY_PRESENTATION_REGISTRY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopologyPresentationRegistry(TopologyPresentationRegistry newTopologyPresentationRegistry) {
		if (newTopologyPresentationRegistry != eInternalContainer() || (eContainerFeatureID() != ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__TOPOLOGY_PRESENTATION_REGISTRY && newTopologyPresentationRegistry != null)) {
			if (EcoreUtil.isAncestor(this, newTopologyPresentationRegistry))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTopologyPresentationRegistry != null)
				msgs = ((InternalEObject)newTopologyPresentationRegistry).eInverseAdd(this, ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_REGISTRY__TOPOLOGY_PRESENTATION_SET_LIST, TopologyPresentationRegistry.class, msgs);
			msgs = basicSetTopologyPresentationRegistry(newTopologyPresentationRegistry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__TOPOLOGY_PRESENTATION_REGISTRY, newTopologyPresentationRegistry, newTopologyPresentationRegistry));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__GRAPHICS_CONTEXT, oldGraphicsContext, graphicsContext));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__GRAPHICS_CONTEXT, oldGraphicsContext, newGraphicsContext);
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
				msgs = ((InternalEObject)graphicsContext).eInverseRemove(this, ApogyCommonTopologyUIPackage.GRAPHICS_CONTEXT__TOPOLOGY_PRESENTATION_SET, GraphicsContext.class, msgs);
			if (newGraphicsContext != null)
				msgs = ((InternalEObject)newGraphicsContext).eInverseAdd(this, ApogyCommonTopologyUIPackage.GRAPHICS_CONTEXT__TOPOLOGY_PRESENTATION_SET, GraphicsContext.class, msgs);
			msgs = basicSetGraphicsContext(newGraphicsContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__GRAPHICS_CONTEXT, newGraphicsContext, newGraphicsContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodePresentation> getNodePresentationList() {
		if (nodePresentationList == null) {
			nodePresentationList = new EObjectWithInverseResolvingEList.ManyInverse<NodePresentation>(NodePresentation.class, this, ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__NODE_PRESENTATION_LIST, ApogyCommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET);
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
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__TOPOLOGY_PRESENTATION_REGISTRY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTopologyPresentationRegistry((TopologyPresentationRegistry)otherEnd, msgs);
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__GRAPHICS_CONTEXT:
				if (graphicsContext != null)
					msgs = ((InternalEObject)graphicsContext).eInverseRemove(this, ApogyCommonTopologyUIPackage.GRAPHICS_CONTEXT__TOPOLOGY_PRESENTATION_SET, GraphicsContext.class, msgs);
				return basicSetGraphicsContext((GraphicsContext)otherEnd, msgs);
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__NODE_PRESENTATION_LIST:
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
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__TOPOLOGY_PRESENTATION_REGISTRY:
				return basicSetTopologyPresentationRegistry(null, msgs);
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__GRAPHICS_CONTEXT:
				return basicSetGraphicsContext(null, msgs);
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__NODE_PRESENTATION_LIST:
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
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__TOPOLOGY_PRESENTATION_REGISTRY:
				return eInternalContainer().eInverseRemove(this, ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_REGISTRY__TOPOLOGY_PRESENTATION_SET_LIST, TopologyPresentationRegistry.class, msgs);
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
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__TOPOLOGY_PRESENTATION_REGISTRY:
				if (resolve) return getTopologyPresentationRegistry();
				return basicGetTopologyPresentationRegistry();
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__GRAPHICS_CONTEXT:
				if (resolve) return getGraphicsContext();
				return basicGetGraphicsContext();
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__NODE_PRESENTATION_LIST:
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
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__TOPOLOGY_PRESENTATION_REGISTRY:
				setTopologyPresentationRegistry((TopologyPresentationRegistry)newValue);
				return;
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__GRAPHICS_CONTEXT:
				setGraphicsContext((GraphicsContext)newValue);
				return;
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__NODE_PRESENTATION_LIST:
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
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__TOPOLOGY_PRESENTATION_REGISTRY:
				setTopologyPresentationRegistry((TopologyPresentationRegistry)null);
				return;
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__GRAPHICS_CONTEXT:
				setGraphicsContext((GraphicsContext)null);
				return;
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__NODE_PRESENTATION_LIST:
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
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__TOPOLOGY_PRESENTATION_REGISTRY:
				return basicGetTopologyPresentationRegistry() != null;
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__GRAPHICS_CONTEXT:
				return graphicsContext != null;
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__NODE_PRESENTATION_LIST:
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
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET___GET_PRESENTATION_NODE__NODE:
				return getPresentationNode((Node)arguments.get(0));
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET___GET_NODES:
				return getNodes();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TopologyPresentationSetImpl
