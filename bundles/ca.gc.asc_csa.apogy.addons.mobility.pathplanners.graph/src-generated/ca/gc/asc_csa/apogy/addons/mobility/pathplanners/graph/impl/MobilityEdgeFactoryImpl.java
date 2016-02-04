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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DisplacementCostFunction;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MobilityEdge;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MobilityEdgeFactory;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphFactory;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mobility Edge Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.MobilityEdgeFactoryImpl#getCostFunctions <em>Cost Functions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobilityEdgeFactoryImpl extends EdgeFactoryImpl<CartesianPolygon, MobilityEdge> implements MobilityEdgeFactory {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobilityEdgeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsMobilityPathplannersGraphPackage.Literals.MOBILITY_EDGE_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DisplacementCostFunction> getCostFunctions() {
		if (costFunctions == null) {
			costFunctions = new EObjectResolvingEList<DisplacementCostFunction>(DisplacementCostFunction.class, this, ApogyAddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE_FACTORY__COST_FUNCTIONS);
		}
		return costFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE_FACTORY__COST_FUNCTIONS:
				return getCostFunctions();
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
			case ApogyAddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE_FACTORY__COST_FUNCTIONS:
				getCostFunctions().clear();
				getCostFunctions().addAll((Collection<? extends DisplacementCostFunction>)newValue);
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
			case ApogyAddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE_FACTORY__COST_FUNCTIONS:
				getCostFunctions().clear();
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
			case ApogyAddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE_FACTORY__COST_FUNCTIONS:
				return costFunctions != null && !costFunctions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public MobilityEdge createEdge(CartesianPolygon source, CartesianPolygon destination) 
	{
		MobilityEdge edge = ApogyAddonsMobilityPathplannersGraphFactory.eINSTANCE.createMobilityEdge();
		
		edge.setFrom(source);
		edge.setTo(destination);
		edge.getCostFunctions().addAll(this.getCostFunctions());		
		
		return edge;
	}
} //MobilityEdgeFactoryImpl
