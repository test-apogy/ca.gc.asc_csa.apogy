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

import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceOnlyCostFunction;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Geometry3DUtilities;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distance Only Cost Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DistanceOnlyCostFunctionImpl extends MeshDisplacementCostFunctionImpl implements DistanceOnlyCostFunction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistanceOnlyCostFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsMobilityPathplannersGraphPackage.Literals.DISTANCE_ONLY_COST_FUNCTION;
	}

	@Override
	public double getCost(CartesianPolygon from, CartesianPolygon to) {
		return Geometry3DUtilities.getDistance(from.getCentroid(), to.getCentroid());	
	}
} //DistanceOnlyCostFunctionImpl
