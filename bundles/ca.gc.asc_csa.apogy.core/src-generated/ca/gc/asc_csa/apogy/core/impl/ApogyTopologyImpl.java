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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.ApogyTopology;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Apogy Topology</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.ApogyTopologyImpl#getRootNode <em>Root Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApogyTopologyImpl extends MinimalEObjectImpl.Container
		implements ApogyTopology {

	/**
	 * The cached value of the '{@link #getRootNode() <em>Root Node</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRootNode()
	 * @generated
	 * @ordered
	 */
	protected GroupNode rootNode;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyTopologyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCorePackage.Literals.APOGY_TOPOLOGY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GroupNode getRootNode() {
		if (rootNode != null && rootNode.eIsProxy()) {
			InternalEObject oldRootNode = (InternalEObject)rootNode;
			rootNode = (GroupNode)eResolveProxy(oldRootNode);
			if (rootNode != oldRootNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCorePackage.APOGY_TOPOLOGY__ROOT_NODE, oldRootNode, rootNode));
			}
		}
		return rootNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GroupNode basicGetRootNode() {
		return rootNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootNode(GroupNode newRootNode) {
		GroupNode oldRootNode = rootNode;
		rootNode = newRootNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCorePackage.APOGY_TOPOLOGY__ROOT_NODE, oldRootNode, rootNode));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCorePackage.APOGY_TOPOLOGY__ROOT_NODE:
				if (resolve) return getRootNode();
				return basicGetRootNode();
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
			case ApogyCorePackage.APOGY_TOPOLOGY__ROOT_NODE:
				setRootNode((GroupNode)newValue);
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
			case ApogyCorePackage.APOGY_TOPOLOGY__ROOT_NODE:
				setRootNode((GroupNode)null);
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
			case ApogyCorePackage.APOGY_TOPOLOGY__ROOT_NODE:
				return rootNode != null;
		}
		return super.eIsSet(featureID);
	}

} // ApogyTopologyImpl
