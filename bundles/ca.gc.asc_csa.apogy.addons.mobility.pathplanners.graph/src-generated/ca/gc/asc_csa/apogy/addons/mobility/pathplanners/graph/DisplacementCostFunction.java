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

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Displacement Cost Function</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage#getDisplacementCostFunction()
 * @model abstract="true"
 * @generated
 */
public interface DisplacementCostFunction extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" fromUnique="false" toUnique="false"
	 * @generated
	 */
	double getCost(CartesianPolygon from, CartesianPolygon to);

} // DisplacementCostFunction
