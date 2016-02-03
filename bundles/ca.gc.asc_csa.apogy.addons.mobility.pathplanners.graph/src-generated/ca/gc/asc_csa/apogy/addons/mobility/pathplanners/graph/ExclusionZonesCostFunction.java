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

import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ExclusionZone;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exclusion Zones Cost Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ExclusionZonesCostFunction#getExclusionZones <em>Exclusion Zones</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage#getExclusionZonesCostFunction()
 * @model
 * @generated
 */
public interface ExclusionZonesCostFunction extends DisplacementCostFunction {
	/**
	 * Returns the value of the '<em><b>Exclusion Zones</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ExclusionZone}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclusion Zones</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusion Zones</em>' reference list.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage#getExclusionZonesCostFunction_ExclusionZones()
	 * @model
	 * @generated
	 */
	EList<ExclusionZone> getExclusionZones();

} // ExclusionZonesCostFunction
