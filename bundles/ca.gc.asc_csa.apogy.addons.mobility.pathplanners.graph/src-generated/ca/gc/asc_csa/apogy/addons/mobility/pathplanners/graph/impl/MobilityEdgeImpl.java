package ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl;
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

import java.util.Collection;
import java.util.Iterator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DisplacementCostFunction;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MobilityEdge;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphFactory;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mobility Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.MobilityEdgeImpl#getCostFunctions <em>Cost Functions</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.MobilityEdgeImpl#getFrom <em>From</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.MobilityEdgeImpl#getTo <em>To</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.MobilityEdgeImpl#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobilityEdgeImpl extends MinimalEObjectImpl.Container implements MobilityEdge {
	/**
	 * The cached value of the '{@link #getCostFunctions() <em>Cost Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<DisplacementCostFunction> costFunctions;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected CartesianPolygon from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected CartesianPolygon to;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double WEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected double weight = WEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobilityEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsMobilityPathplannersGraphPackage.Literals.MOBILITY_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DisplacementCostFunction> getCostFunctions() {
		if (costFunctions == null) {
			costFunctions = new EObjectResolvingEList<DisplacementCostFunction>(DisplacementCostFunction.class, this, ApogyAddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE__COST_FUNCTIONS);
		}
		return costFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPolygon getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (CartesianPolygon)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPolygon basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(CartesianPolygon newFrom) {
		CartesianPolygon oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPolygon getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (CartesianPolygon)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPolygon basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(CartesianPolygon newTo) {
		CartesianPolygon oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE__COST_FUNCTIONS:
				return getCostFunctions();
			case ApogyAddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case ApogyAddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case ApogyAddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE__WEIGHT:
				return getWeight();
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
			case ApogyAddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE__COST_FUNCTIONS:
				getCostFunctions().clear();
				getCostFunctions().addAll((Collection<? extends DisplacementCostFunction>)newValue);
				return;
			case ApogyAddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE__FROM:
				setFrom((CartesianPolygon)newValue);
				return;
			case ApogyAddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE__TO:
				setTo((CartesianPolygon)newValue);
				return;
			case ApogyAddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE__WEIGHT:
				setWeight((Double)newValue);
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
			case ApogyAddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE__COST_FUNCTIONS:
				getCostFunctions().clear();
				return;
			case ApogyAddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE__FROM:
				setFrom((CartesianPolygon)null);
				return;
			case ApogyAddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE__TO:
				setTo((CartesianPolygon)null);
				return;
			case ApogyAddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
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
			case ApogyAddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE__COST_FUNCTIONS:
				return costFunctions != null && !costFunctions.isEmpty();
			case ApogyAddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE__FROM:
				return from != null;
			case ApogyAddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE__TO:
				return to != null;
			case ApogyAddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
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
		result.append(" (weight: ");
		result.append(weight);
		result.append(')');
		return result.toString();
	}

	public Object getSource() {
		return getFrom();
	}
	
	public Object getTarget() {
		return getTo();
	}
	
	public Object oppositeVertex(Object v) {
		if(v == getFrom())
		{
			return getTo();
		}
		else if(v == getTo())
		{
			return getFrom();
		}
		else
		{
			return null;
		}
			
	}
	
	public boolean containsVertex(Object v) {
	
		return (v == getFrom() || (v == getTo()));
	}
	
	public double getWeight() 
	{
		Iterator<DisplacementCostFunction> it = getCostFunctions().iterator();
		double cost = 0.0;
		while( it.hasNext() && !Double.isInfinite(cost))
		{
			DisplacementCostFunction displacementCostFunction = it.next();			
			cost += displacementCostFunction.getCost(getFrom(), getTo());
		}
		return cost;
	}
	
	public Object clone() 
	{		
		MobilityEdge edge = ApogyAddonsMobilityPathplannersGraphFactory.eINSTANCE.createMobilityEdge();
		
		edge.getCostFunctions().addAll(getCostFunctions());
		edge.setFrom(getFrom());
		edge.setTo(getTo());
		
		return edge;
	}

	public void setWeight(double weight) {				
	}
} //MobilityEdgeImpl
