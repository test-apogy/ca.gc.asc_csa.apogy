/**
 * Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
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
package ca.gc.asc_csa.apogy.common.topology.bindings.impl;

import ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage;
import ca.gc.asc_csa.apogy.common.topology.bindings.BooleanCase;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.BooleanCaseImpl#isCaseValue <em>Case Value</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.BooleanCaseImpl#getTopologyRoot <em>Topology Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanCaseImpl extends MinimalEObjectImpl.Container implements BooleanCase {
	/**
	 * The default value of the '{@link #isCaseValue() <em>Case Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCaseValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CASE_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCaseValue() <em>Case Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCaseValue()
	 * @generated
	 * @ordered
	 */
	protected boolean caseValue = CASE_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTopologyRoot() <em>Topology Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologyRoot()
	 * @generated
	 * @ordered
	 */
	protected AggregateGroupNode topologyRoot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonTopologyBindingsPackage.Literals.BOOLEAN_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCaseValue() {
		return caseValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaseValue(boolean newCaseValue) {
		boolean oldCaseValue = caseValue;
		caseValue = newCaseValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyBindingsPackage.BOOLEAN_CASE__CASE_VALUE, oldCaseValue, caseValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateGroupNode getTopologyRoot() {
		return topologyRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopologyRoot(AggregateGroupNode newTopologyRoot, NotificationChain msgs) {
		AggregateGroupNode oldTopologyRoot = topologyRoot;
		topologyRoot = newTopologyRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyBindingsPackage.BOOLEAN_CASE__TOPOLOGY_ROOT, oldTopologyRoot, newTopologyRoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopologyRoot(AggregateGroupNode newTopologyRoot) {
		if (newTopologyRoot != topologyRoot) {
			NotificationChain msgs = null;
			if (topologyRoot != null)
				msgs = ((InternalEObject)topologyRoot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyBindingsPackage.BOOLEAN_CASE__TOPOLOGY_ROOT, null, msgs);
			if (newTopologyRoot != null)
				msgs = ((InternalEObject)newTopologyRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyBindingsPackage.BOOLEAN_CASE__TOPOLOGY_ROOT, null, msgs);
			msgs = basicSetTopologyRoot(newTopologyRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyBindingsPackage.BOOLEAN_CASE__TOPOLOGY_ROOT, newTopologyRoot, newTopologyRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCommonTopologyBindingsPackage.BOOLEAN_CASE__TOPOLOGY_ROOT:
				return basicSetTopologyRoot(null, msgs);
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
			case ApogyCommonTopologyBindingsPackage.BOOLEAN_CASE__CASE_VALUE:
				return isCaseValue();
			case ApogyCommonTopologyBindingsPackage.BOOLEAN_CASE__TOPOLOGY_ROOT:
				return getTopologyRoot();
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
			case ApogyCommonTopologyBindingsPackage.BOOLEAN_CASE__CASE_VALUE:
				setCaseValue((Boolean)newValue);
				return;
			case ApogyCommonTopologyBindingsPackage.BOOLEAN_CASE__TOPOLOGY_ROOT:
				setTopologyRoot((AggregateGroupNode)newValue);
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
			case ApogyCommonTopologyBindingsPackage.BOOLEAN_CASE__CASE_VALUE:
				setCaseValue(CASE_VALUE_EDEFAULT);
				return;
			case ApogyCommonTopologyBindingsPackage.BOOLEAN_CASE__TOPOLOGY_ROOT:
				setTopologyRoot((AggregateGroupNode)null);
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
			case ApogyCommonTopologyBindingsPackage.BOOLEAN_CASE__CASE_VALUE:
				return caseValue != CASE_VALUE_EDEFAULT;
			case ApogyCommonTopologyBindingsPackage.BOOLEAN_CASE__TOPOLOGY_ROOT:
				return topologyRoot != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (caseValue: ");
		result.append(caseValue);
		result.append(')');
		return result.toString();
	}

} //BooleanCaseImpl
