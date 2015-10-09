/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.fov.bindings;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.sensors.fov.bindings.MRTFOVBindingsPackage
 * @generated
 */
public interface MRTFOVBindingsFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  MRTFOVBindingsFactory eINSTANCE = org.eclipse.symphony.addons.sensors.fov.bindings.impl.MRTFOVBindingsFactoryImpl.init();

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
  MRTFOVBindingsPackage getMRTFOVBindingsPackage();

} //MRTFOVBindingsFactory
