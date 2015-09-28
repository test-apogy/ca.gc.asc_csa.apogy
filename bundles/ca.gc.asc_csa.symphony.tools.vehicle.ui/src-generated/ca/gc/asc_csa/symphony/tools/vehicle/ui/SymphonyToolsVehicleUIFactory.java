/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.vehicle.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.symphony.tools.vehicle.ui.SymphonyToolsVehicleUIPackage
 * @generated
 */
public interface SymphonyToolsVehicleUIFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  SymphonyToolsVehicleUIFactory eINSTANCE = ca.gc.asc_csa.symphony.tools.vehicle.ui.impl.SymphonyToolsVehicleUIFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Physical Wheel Presentation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Wheel Presentation</em>'.
	 * @generated
	 */
  PhysicalWheelPresentation createPhysicalWheelPresentation();

  /**
	 * Returns a new object of class '<em>Lander Spherical Foot Presentation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lander Spherical Foot Presentation</em>'.
	 * @generated
	 */
  LanderSphericalFootPresentation createLanderSphericalFootPresentation();

  /**
	 * Returns a new object of class '<em>Thruster Presentation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thruster Presentation</em>'.
	 * @generated
	 */
  ThrusterPresentation createThrusterPresentation();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  SymphonyToolsVehicleUIPackage getSymphonyToolsVehicleUIPackage();

} //SymphonyToolsVehicleUIFactory
