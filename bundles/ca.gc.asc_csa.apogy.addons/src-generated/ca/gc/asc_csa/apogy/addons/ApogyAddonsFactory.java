package ca.gc.asc_csa.apogy.addons;
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

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage
 * @generated
 */
public interface ApogyAddonsFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyAddonsFactory eINSTANCE = ca.gc.asc_csa.apogy.addons.impl.ApogyAddonsFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Simple Tool List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Tool List</em>'.
	 * @generated
	 */
	SimpleToolList createSimpleToolList();

		/**
	 * Returns a new object of class '<em>Ruler3 DTool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ruler3 DTool</em>'.
	 * @generated
	 */
	Ruler3DTool createRuler3DTool();

		/**
	 * Returns a new object of class '<em>Ruler3d Tool Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ruler3d Tool Node</em>'.
	 * @generated
	 */
	Ruler3dToolNode createRuler3dToolNode();

		/**
	 * Returns a new object of class '<em>Feature Of Interest Picking Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Of Interest Picking Tool</em>'.
	 * @generated
	 */
	FeatureOfInterestPickingTool createFeatureOfInterestPickingTool();

		/**
	 * Returns a new object of class '<em>Trajectory Picking Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trajectory Picking Tool</em>'.
	 * @generated
	 */
	TrajectoryPickingTool createTrajectoryPickingTool();

		/**
	 * Returns a new object of class '<em>Trajectory Picking Tool Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trajectory Picking Tool Node</em>'.
	 * @generated
	 */
	TrajectoryPickingToolNode createTrajectoryPickingToolNode();

		/**
	 * Returns a new object of class '<em>Trajectory3 DTool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trajectory3 DTool</em>'.
	 * @generated
	 */
	Trajectory3DTool createTrajectory3DTool();

		/**
	 * Returns a new object of class '<em>Trajectory3 DTool Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trajectory3 DTool Node</em>'.
	 * @generated
	 */
	Trajectory3DToolNode createTrajectory3DToolNode();

		/**
	 * Returns a new object of class '<em>URL Node Geometry Placement At Feature Of Interest Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>URL Node Geometry Placement At Feature Of Interest Tool</em>'.
	 * @generated
	 */
	URLNodeGeometryPlacementAtFeatureOfInterestTool createURLNodeGeometryPlacementAtFeatureOfInterestTool();

		/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyAddonsPackage getApogyAddonsPackage();

} //ApogyAddonsFactory
