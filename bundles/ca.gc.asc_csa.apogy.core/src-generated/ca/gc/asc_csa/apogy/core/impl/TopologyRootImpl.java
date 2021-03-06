package ca.gc.asc_csa.apogy.core.impl;
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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.TopologyRoot;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Topology Root</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.TopologyRootImpl#getOriginNode <em>Origin Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopologyRootImpl extends MinimalEObjectImpl.Container implements
		TopologyRoot {
	/**
	 * The cached value of the '{@link #getOriginNode() <em>Origin Node</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOriginNode()
	 * @generated
	 * @ordered
	 */
	protected Node originNode;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TopologyRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCorePackage.Literals.TOPOLOGY_ROOT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Node getOriginNode() {
		return originNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginNode(Node newOriginNode,
			NotificationChain msgs) {
		Node oldOriginNode = originNode;
		originNode = newOriginNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCorePackage.TOPOLOGY_ROOT__ORIGIN_NODE, oldOriginNode, newOriginNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginNode(Node newOriginNode) {
		if (newOriginNode != originNode) {
			NotificationChain msgs = null;
			if (originNode != null)
				msgs = ((InternalEObject)originNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCorePackage.TOPOLOGY_ROOT__ORIGIN_NODE, null, msgs);
			if (newOriginNode != null)
				msgs = ((InternalEObject)newOriginNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCorePackage.TOPOLOGY_ROOT__ORIGIN_NODE, null, msgs);
			msgs = basicSetOriginNode(newOriginNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCorePackage.TOPOLOGY_ROOT__ORIGIN_NODE, newOriginNode, newOriginNode));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCorePackage.TOPOLOGY_ROOT__ORIGIN_NODE:
				return basicSetOriginNode(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCorePackage.TOPOLOGY_ROOT__ORIGIN_NODE:
				return getOriginNode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCorePackage.TOPOLOGY_ROOT__ORIGIN_NODE:
				setOriginNode((Node)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyCorePackage.TOPOLOGY_ROOT__ORIGIN_NODE:
				setOriginNode((Node)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyCorePackage.TOPOLOGY_ROOT__ORIGIN_NODE:
				return originNode != null;
		}
		return super.eIsSet(featureID);
	}

} // TopologyRootImpl
