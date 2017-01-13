/**
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
package ca.gc.asc_csa.apogy.common.topology.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;
import ca.gc.asc_csa.apogy.common.topology.FilterChainType;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.NodeFilter;
import ca.gc.asc_csa.apogy.common.topology.NodeFilterChain;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Filter Chain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.impl.NodeFilterChainImpl#getFilterChainType <em>Filter Chain Type</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.impl.NodeFilterChainImpl#getFilters <em>Filters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeFilterChainImpl extends NodeFilterImpl implements NodeFilterChain {
	/**
	 * The default value of the '{@link #getFilterChainType() <em>Filter Chain Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterChainType()
	 * @generated
	 * @ordered
	 */
	protected static final FilterChainType FILTER_CHAIN_TYPE_EDEFAULT = FilterChainType.AND;
	/**
	 * The cached value of the '{@link #getFilterChainType() <em>Filter Chain Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterChainType()
	 * @generated
	 * @ordered
	 */
	protected FilterChainType filterChainType = FILTER_CHAIN_TYPE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getFilters() <em>Filters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeFilter> filters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeFilterChainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonTopologyPackage.Literals.NODE_FILTER_CHAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterChainType getFilterChainType() {
		return filterChainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterChainType(FilterChainType newFilterChainType) {
		FilterChainType oldFilterChainType = filterChainType;
		filterChainType = newFilterChainType == null ? FILTER_CHAIN_TYPE_EDEFAULT : newFilterChainType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyPackage.NODE_FILTER_CHAIN__FILTER_CHAIN_TYPE, oldFilterChainType, filterChainType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeFilter> getFilters() {
		if (filters == null) {
			filters = new EObjectContainmentEList<NodeFilter>(NodeFilter.class, this, ApogyCommonTopologyPackage.NODE_FILTER_CHAIN__FILTERS);
		}
		return filters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCommonTopologyPackage.NODE_FILTER_CHAIN__FILTERS:
				return ((InternalEList<?>)getFilters()).basicRemove(otherEnd, msgs);
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
			case ApogyCommonTopologyPackage.NODE_FILTER_CHAIN__FILTER_CHAIN_TYPE:
				return getFilterChainType();
			case ApogyCommonTopologyPackage.NODE_FILTER_CHAIN__FILTERS:
				return getFilters();
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
			case ApogyCommonTopologyPackage.NODE_FILTER_CHAIN__FILTER_CHAIN_TYPE:
				setFilterChainType((FilterChainType)newValue);
				return;
			case ApogyCommonTopologyPackage.NODE_FILTER_CHAIN__FILTERS:
				getFilters().clear();
				getFilters().addAll((Collection<? extends NodeFilter>)newValue);
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
			case ApogyCommonTopologyPackage.NODE_FILTER_CHAIN__FILTER_CHAIN_TYPE:
				setFilterChainType(FILTER_CHAIN_TYPE_EDEFAULT);
				return;
			case ApogyCommonTopologyPackage.NODE_FILTER_CHAIN__FILTERS:
				getFilters().clear();
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
			case ApogyCommonTopologyPackage.NODE_FILTER_CHAIN__FILTER_CHAIN_TYPE:
				return filterChainType != FILTER_CHAIN_TYPE_EDEFAULT;
			case ApogyCommonTopologyPackage.NODE_FILTER_CHAIN__FILTERS:
				return filters != null && !filters.isEmpty();
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
		result.append(" (filterChainType: ");
		result.append(filterChainType);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean matches(Node node) 
	{
		boolean matches = false;
		if(getFilters().size() == 0) return true;
		
		switch (getFilterChainType().getValue()) 
		{
			case FilterChainType.AND_VALUE:
			{
				Iterator<NodeFilter> it = getFilters().iterator();
				matches = true;
				while(it.hasNext() && matches)
				{
					matches = it.next().matches(node);
				}
			}
			break;
			
			case FilterChainType.OR_VALUE:
			{
				Iterator<NodeFilter> it = getFilters().iterator();
				matches = false;
				while(it.hasNext() && !matches)
				{
					matches = it.next().matches(node);
				}
			}
			break;

			default:
			break;
		}
		
		return matches;
	}
} //NodeFilterChainImpl
