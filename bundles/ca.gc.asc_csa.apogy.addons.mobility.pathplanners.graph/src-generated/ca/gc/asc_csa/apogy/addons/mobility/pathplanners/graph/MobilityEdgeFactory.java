package ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph;
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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;

import org.jgrapht.EdgeFactory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mobility Edge Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MobilityEdgeFactory#getCostFunctions <em>Cost Functions</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage#getMobilityEdgeFactory()
 * @model superTypes="ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.EdgeFactory<ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon, ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MobilityEdge>"
 * @generated
 */
public interface MobilityEdgeFactory extends EObject, EdgeFactory<CartesianPolygon, MobilityEdge> {
	/**
	 * Returns the value of the '<em><b>Cost Functions</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DisplacementCostFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Functions</em>' reference list.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage#getMobilityEdgeFactory_CostFunctions()
	 * @model
	 * @generated
	 */
	EList<DisplacementCostFunction> getCostFunctions();

} // MobilityEdgeFactory
