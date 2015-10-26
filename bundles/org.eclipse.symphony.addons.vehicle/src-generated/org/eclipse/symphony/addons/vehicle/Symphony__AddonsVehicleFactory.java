/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.vehicle.Symphony__AddonsVehiclePackage
 * @generated
 */
public interface Symphony__AddonsVehicleFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  Symphony__AddonsVehicleFactory eINSTANCE = org.eclipse.symphony.addons.vehicle.impl.Symphony__AddonsVehicleFactoryImpl.init();

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
	 * Returns a new object of class '<em>Vehicle Tools Facade</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehicle Tools Facade</em>'.
	 * @generated
	 */
  VehicleToolsFacade createVehicleToolsFacade();

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
	Symphony__AddonsVehiclePackage getSymphony__AddonsVehiclePackage();

} //Symphony__AddonsVehicleFactory
