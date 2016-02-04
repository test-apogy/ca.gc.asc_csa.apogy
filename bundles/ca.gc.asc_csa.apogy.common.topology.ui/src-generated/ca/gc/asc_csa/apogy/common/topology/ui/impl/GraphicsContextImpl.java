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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.Activator;
import ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;
import ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graphics Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.GraphicsContextImpl#getTopology <em>Topology</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.GraphicsContextImpl#getTopologyPresentationSet <em>Topology Presentation Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphicsContextImpl extends MinimalEObjectImpl.Container implements GraphicsContext {
	/**
	 * The cached value of the '{@link #getTopology() <em>Topology</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopology()
	 * @generated
	 * @ordered
	 */
	protected Node topology;

	/**
	 * The cached value of the '{@link #getTopologyPresentationSet() <em>Topology Presentation Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologyPresentationSet()
	 * @generated
	 * @ordered
	 */
	protected TopologyPresentationSet topologyPresentationSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicsContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonTopologyUIPackage.Literals.GRAPHICS_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getTopology() {
		if (topology != null && topology.eIsProxy()) {
			InternalEObject oldTopology = (InternalEObject)topology;
			topology = (Node)eResolveProxy(oldTopology);
			if (topology != oldTopology) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCommonTopologyUIPackage.GRAPHICS_CONTEXT__TOPOLOGY, oldTopology, topology));
			}
		}
		return topology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetTopology() {
		return topology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopology(Node newTopology) {
		Node oldTopology = topology;
		topology = newTopology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyUIPackage.GRAPHICS_CONTEXT__TOPOLOGY, oldTopology, topology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyPresentationSet getTopologyPresentationSet() {
		if (topologyPresentationSet != null && topologyPresentationSet.eIsProxy()) {
			InternalEObject oldTopologyPresentationSet = (InternalEObject)topologyPresentationSet;
			topologyPresentationSet = (TopologyPresentationSet)eResolveProxy(oldTopologyPresentationSet);
			if (topologyPresentationSet != oldTopologyPresentationSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCommonTopologyUIPackage.GRAPHICS_CONTEXT__TOPOLOGY_PRESENTATION_SET, oldTopologyPresentationSet, topologyPresentationSet));
			}
		}
		return topologyPresentationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyPresentationSet basicGetTopologyPresentationSet() {
		return topologyPresentationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopologyPresentationSet(TopologyPresentationSet newTopologyPresentationSet, NotificationChain msgs) {
		TopologyPresentationSet oldTopologyPresentationSet = topologyPresentationSet;
		topologyPresentationSet = newTopologyPresentationSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyUIPackage.GRAPHICS_CONTEXT__TOPOLOGY_PRESENTATION_SET, oldTopologyPresentationSet, newTopologyPresentationSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopologyPresentationSet(TopologyPresentationSet newTopologyPresentationSet) {
		if (newTopologyPresentationSet != topologyPresentationSet) {
			NotificationChain msgs = null;
			if (topologyPresentationSet != null)
				msgs = ((InternalEObject)topologyPresentationSet).eInverseRemove(this, ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__GRAPHICS_CONTEXT, TopologyPresentationSet.class, msgs);
			if (newTopologyPresentationSet != null)
				msgs = ((InternalEObject)newTopologyPresentationSet).eInverseAdd(this, ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__GRAPHICS_CONTEXT, TopologyPresentationSet.class, msgs);
			msgs = basicSetTopologyPresentationSet(newTopologyPresentationSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyUIPackage.GRAPHICS_CONTEXT__TOPOLOGY_PRESENTATION_SET, newTopologyPresentationSet, newTopologyPresentationSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void dispose() 
	{		
		// Release the topologyPresentationSet if required.
		if(getTopologyPresentationSet() != null)
		{
			Activator.getTopologyPresentationRegistry().release(getTopologyPresentationSet());
		}
		
		// Remove reference to the topologyPresentationSet.
		setTopologyPresentationSet(null);
		
		// Remove reference to topology root.
		setTopology(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCommonTopologyUIPackage.GRAPHICS_CONTEXT__TOPOLOGY_PRESENTATION_SET:
				if (topologyPresentationSet != null)
					msgs = ((InternalEObject)topologyPresentationSet).eInverseRemove(this, ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__GRAPHICS_CONTEXT, TopologyPresentationSet.class, msgs);
				return basicSetTopologyPresentationSet((TopologyPresentationSet)otherEnd, msgs);
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
			case ApogyCommonTopologyUIPackage.GRAPHICS_CONTEXT__TOPOLOGY_PRESENTATION_SET:
				return basicSetTopologyPresentationSet(null, msgs);
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
			case ApogyCommonTopologyUIPackage.GRAPHICS_CONTEXT__TOPOLOGY:
				if (resolve) return getTopology();
				return basicGetTopology();
			case ApogyCommonTopologyUIPackage.GRAPHICS_CONTEXT__TOPOLOGY_PRESENTATION_SET:
				if (resolve) return getTopologyPresentationSet();
				return basicGetTopologyPresentationSet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCommonTopologyUIPackage.GRAPHICS_CONTEXT__TOPOLOGY:
				setTopology((Node)newValue);
				return;
			case ApogyCommonTopologyUIPackage.GRAPHICS_CONTEXT__TOPOLOGY_PRESENTATION_SET:
				setTopologyPresentationSet((TopologyPresentationSet)newValue);
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
			case ApogyCommonTopologyUIPackage.GRAPHICS_CONTEXT__TOPOLOGY:
				setTopology((Node)null);
				return;
			case ApogyCommonTopologyUIPackage.GRAPHICS_CONTEXT__TOPOLOGY_PRESENTATION_SET:
				setTopologyPresentationSet((TopologyPresentationSet)null);
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
			case ApogyCommonTopologyUIPackage.GRAPHICS_CONTEXT__TOPOLOGY:
				return topology != null;
			case ApogyCommonTopologyUIPackage.GRAPHICS_CONTEXT__TOPOLOGY_PRESENTATION_SET:
				return topologyPresentationSet != null;
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
			case ApogyCommonTopologyUIPackage.GRAPHICS_CONTEXT___DISPOSE:
				dispose();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //GraphicsContextImpl
