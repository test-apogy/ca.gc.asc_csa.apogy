/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.fov.bindings;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.ApogyAddonsSensorsFOVBindingsPackage
 * @generated
 */
public interface ApogyAddonsSensorsFOVBindingsFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyAddonsSensorsFOVBindingsFactory eINSTANCE = ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.impl.ApogyAddonsSensorsFOVBindingsFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Circular Sector Field Of View Binding</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Circular Sector Field Of View Binding</em>'.
	 * @generated
	 */
  CircularSectorFieldOfViewBinding createCircularSectorFieldOfViewBinding();

  /**
	 * Returns a new object of class '<em>Conical Field Of View Binding</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conical Field Of View Binding</em>'.
	 * @generated
	 */
  ConicalFieldOfViewBinding createConicalFieldOfViewBinding();

  /**
	 * Returns a new object of class '<em>Rectangular Frustrum Field Of View Binding</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rectangular Frustrum Field Of View Binding</em>'.
	 * @generated
	 */
  RectangularFrustrumFieldOfViewBinding createRectangularFrustrumFieldOfViewBinding();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyAddonsSensorsFOVBindingsPackage getApogyAddonsSensorsFOVBindingsPackage();

} //ApogyAddonsSensorsFOVBindingsFactory
