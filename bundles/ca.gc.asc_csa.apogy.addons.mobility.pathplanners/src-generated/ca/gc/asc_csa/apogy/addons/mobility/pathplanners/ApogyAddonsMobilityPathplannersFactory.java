package ca.gc.asc_csa.apogy.addons.mobility.pathplanners;
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

import org.eclipse.emf.ecore.EFactory;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ApogyAddonsMobilityPathplannersPackage
 * @generated
 */
public interface ApogyAddonsMobilityPathplannersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyAddonsMobilityPathplannersFactory eINSTANCE = ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl.ApogyAddonsMobilityPathplannersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Way Point Path Planner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Way Point Path Planner</em>'.
	 * @generated
	 */
	WayPointPathPlanner createWayPointPathPlanner();

	/**
	 * Returns a new object of class '<em>Mesh Way Point Path Planner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mesh Way Point Path Planner</em>'.
	 * @generated
	 */
	<T extends CartesianPolygon> MeshWayPointPathPlanner<T> createMeshWayPointPathPlanner();

	/**
	 * Returns a new object of class '<em>Circular Exclusion Zone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Circular Exclusion Zone</em>'.
	 * @generated
	 */
	CircularExclusionZone createCircularExclusionZone();

	/**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	ApogyAddonsMobilityPathplannersFacade createApogyAddonsMobilityPathplannersFacade();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyAddonsMobilityPathplannersPackage getApogyAddonsMobilityPathplannersPackage();

} //ApogyAddonsMobilityPathplannersFactory
