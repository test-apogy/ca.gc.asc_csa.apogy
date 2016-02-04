package ca.gc.asc_csa.apogy.core.environment.impl;
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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.core.environment.AbstractMapLayerNode;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.TopologyTreeMapLayer;
import ca.gc.asc_csa.apogy.core.environment.TopologyTreeMapLayerNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topology Tree Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.TopologyTreeMapLayerImpl#getTopologyTreeRoot <em>Topology Tree Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopologyTreeMapLayerImpl extends AbstractMapLayerImpl implements TopologyTreeMapLayer 
{
	/**
	 * The cached value of the '{@link #getTopologyTreeRoot() <em>Topology Tree Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologyTreeRoot()
	 * @generated
	 * @ordered
	 */
	protected TopologyTreeMapLayerNode topologyTreeRoot;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopologyTreeMapLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentPackage.Literals.TOPOLOGY_TREE_MAP_LAYER;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyTreeMapLayerNode getTopologyTreeRoot() {
		return topologyTreeRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopologyTreeRoot(TopologyTreeMapLayerNode newTopologyTreeRoot, NotificationChain msgs) 
	{
		TopologyTreeMapLayerNode oldTopologyTreeRoot = topologyTreeRoot;
		topologyTreeRoot = newTopologyTreeRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER__TOPOLOGY_TREE_ROOT, oldTopologyTreeRoot, newTopologyTreeRoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopologyTreeRoot(TopologyTreeMapLayerNode newTopologyTreeRoot) 
	{
		if (newTopologyTreeRoot != topologyTreeRoot) {
			NotificationChain msgs = null;
			if (topologyTreeRoot != null)
				msgs = ((InternalEObject)topologyTreeRoot).eInverseRemove(this, ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER_NODE__TOPOLOGY_TREE_MAP_LAYER, TopologyTreeMapLayerNode.class, msgs);
			if (newTopologyTreeRoot != null)
				msgs = ((InternalEObject)newTopologyTreeRoot).eInverseAdd(this, ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER_NODE__TOPOLOGY_TREE_MAP_LAYER, TopologyTreeMapLayerNode.class, msgs);
			msgs = basicSetTopologyTreeRoot(newTopologyTreeRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER__TOPOLOGY_TREE_ROOT, newTopologyTreeRoot, newTopologyTreeRoot));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER__TOPOLOGY_TREE_ROOT:
				if (topologyTreeRoot != null)
					msgs = ((InternalEObject)topologyTreeRoot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER__TOPOLOGY_TREE_ROOT, null, msgs);
				return basicSetTopologyTreeRoot((TopologyTreeMapLayerNode)otherEnd, msgs);
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
			case ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER__TOPOLOGY_TREE_ROOT:
				return basicSetTopologyTreeRoot(null, msgs);
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
			case ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER__TOPOLOGY_TREE_ROOT:
				return getTopologyTreeRoot();
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
			case ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER__TOPOLOGY_TREE_ROOT:
				setTopologyTreeRoot((TopologyTreeMapLayerNode)newValue);
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
			case ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER__TOPOLOGY_TREE_ROOT:
				setTopologyTreeRoot((TopologyTreeMapLayerNode)null);
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
			case ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER__TOPOLOGY_TREE_ROOT:
				return topologyTreeRoot != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public AbstractMapLayerNode getAbstractMapLayerNode() 
	{		
		if(getAbstractMapLayerNodeGen() == null)
		{
			  abstractMapLayerNode = ApogyCoreEnvironmentFactory.eINSTANCE.createAbstractMapLayerNode();	
			  
//			  ReferencedGroupNode referencedGroupNode = ApogyCommonTopologyFactory.eINSTANCE.createReferencedGroupNode();			  
//			  referencedGroupNode.setNodeId(getName());			  
//			  
//			  
//			  if(getTopologyTreeRoot() != null)
//			  {
//				  referencedGroupNode.getReferencedChildren().add(getTopologyTreeRoot());
//			  }
//			  			 
//			  abstractMapLayerNode.getChildren().add(referencedGroupNode);			  
			  abstractMapLayerNode.setAbstractMapLayer(this);			  
		}
		  
		return getAbstractMapLayerNodeGen();
	}			
	
} //TopologyTreeMapLayerImpl
