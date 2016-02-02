package ca.gc.asc_csa.apogy.addons.vehicle;
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
 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage
 * @generated
 */
public interface ApogyAddonsVehicleFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyAddonsVehicleFactory eINSTANCE = ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehicleFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Vehicle Pose Corrector</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehicle Pose Corrector</em>'.
	 * @generated
	 */
  VehiclePoseCorrector createVehiclePoseCorrector();

  /**
	 * Returns a new object of class '<em>Mesh Node Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mesh Node Entry</em>'.
	 * @generated
	 */
	MeshNodeEntry createMeshNodeEntry();

		/**
	 * Returns a new object of class '<em>Wheel</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wheel</em>'.
	 * @generated
	 */
  Wheel createWheel();

  /**
	 * Returns a new object of class '<em>Thruster</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thruster</em>'.
	 * @generated
	 */
  Thruster createThruster();

  /**
	 * Returns a new object of class '<em>Thruster Binding</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thruster Binding</em>'.
	 * @generated
	 */
  ThrusterBinding createThrusterBinding();

  /**
	 * Returns a new object of class '<em>Wheel Contact Provider</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wheel Contact Provider</em>'.
	 * @generated
	 */
  WheelContactProvider createWheelContactProvider();

  /**
	 * Returns a new object of class '<em>Lander Spherical Foot</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lander Spherical Foot</em>'.
	 * @generated
	 */
  LanderSphericalFoot createLanderSphericalFoot();

  /**
	 * Returns a new object of class '<em>Lander Spherical Foot Contact Provider</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lander Spherical Foot Contact Provider</em>'.
	 * @generated
	 */
  LanderSphericalFootContactProvider createLanderSphericalFootContactProvider();

  /**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	ApogyAddonsVehicleFacade createApogyAddonsVehicleFacade();

		/**
	 * Returns a new object of class '<em>Wheel Vehicle Utilities</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wheel Vehicle Utilities</em>'.
	 * @generated
	 */
  WheelVehicleUtilities createWheelVehicleUtilities();

  /**
	 * Returns a new object of class '<em>Mesh Extent2 D</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mesh Extent2 D</em>'.
	 * @generated
	 */
  MeshExtent2D createMeshExtent2D();

  /**
	 * Returns a new object of class '<em>Path Planner Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Planner Tool</em>'.
	 * @generated
	 */
	PathPlannerTool createPathPlannerTool();

		/**
	 * Returns a new object of class '<em>Path Planner Tool Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Planner Tool Node</em>'.
	 * @generated
	 */
	PathPlannerToolNode createPathPlannerToolNode();

		/**
	 * Returns a new object of class '<em>Vehicle Path Planner Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehicle Path Planner Tool</em>'.
	 * @generated
	 */
	VehiclePathPlannerTool createVehiclePathPlannerTool();

		/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyAddonsVehiclePackage getApogyAddonsVehiclePackage();

} //ApogyAddonsVehicleFactory
