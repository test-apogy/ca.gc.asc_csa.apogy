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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ExclusionZone;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ExclusionZonesCostFunction;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exclusion Zones Cost Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.ExclusionZonesCostFunctionImpl#getExclusionZones <em>Exclusion Zones</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExclusionZonesCostFunctionImpl extends DisplacementCostFunctionImpl implements ExclusionZonesCostFunction {
	/**
	 * The cached value of the '{@link #getExclusionZones() <em>Exclusion Zones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusionZones()
	 * @generated
	 * @ordered
	 */
	protected EList<ExclusionZone> exclusionZones;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExclusionZonesCostFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsMobilityPathplannersGraphPackage.Literals.EXCLUSION_ZONES_COST_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExclusionZone> getExclusionZones() {
		if (exclusionZones == null) {
			exclusionZones = new EObjectResolvingEList<ExclusionZone>(ExclusionZone.class, this, ApogyAddonsMobilityPathplannersGraphPackage.EXCLUSION_ZONES_COST_FUNCTION__EXCLUSION_ZONES);
		}
		return exclusionZones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsMobilityPathplannersGraphPackage.EXCLUSION_ZONES_COST_FUNCTION__EXCLUSION_ZONES:
				return getExclusionZones();
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
			case ApogyAddonsMobilityPathplannersGraphPackage.EXCLUSION_ZONES_COST_FUNCTION__EXCLUSION_ZONES:
				getExclusionZones().clear();
				getExclusionZones().addAll((Collection<? extends ExclusionZone>)newValue);
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
			case ApogyAddonsMobilityPathplannersGraphPackage.EXCLUSION_ZONES_COST_FUNCTION__EXCLUSION_ZONES:
				getExclusionZones().clear();
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
			case ApogyAddonsMobilityPathplannersGraphPackage.EXCLUSION_ZONES_COST_FUNCTION__EXCLUSION_ZONES:
				return exclusionZones != null && !exclusionZones.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public double getCost(CartesianPolygon from, CartesianPolygon to) 
	{
		double cost = 0.0;
		
		CartesianPositionCoordinates fromCenter = from.getCentroid();
		CartesianPositionCoordinates toCenter = to.getCentroid();
		
		// Goes through the list of ExclusionZone and check for crossing of
		// the line connecting the centroid of the from polygon to the centroid
		// of the to polygon.
		Iterator <ExclusionZone> zones = getExclusionZones().iterator();
		while(zones.hasNext() && (cost != Double.POSITIVE_INFINITY))
		{
			ExclusionZone zone = zones.next();
			
			if(zone.intersects(fromCenter, toCenter))
			{
				cost = Double.POSITIVE_INFINITY;
			}
		}
		
		return cost;
	}
} //ExclusionZonesCostFunctionImpl
