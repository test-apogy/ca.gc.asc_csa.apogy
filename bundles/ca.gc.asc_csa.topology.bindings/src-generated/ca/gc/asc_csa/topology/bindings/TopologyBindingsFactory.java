/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.topology.bindings;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.topology.bindings.TopologyBindingsPackage
 * @generated
 */
public interface TopologyBindingsFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  TopologyBindingsFactory eINSTANCE = ca.gc.asc_csa.topology.bindings.impl.TopologyBindingsFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Rotation Binding</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rotation Binding</em>'.
	 * @generated
	 */
  RotationBinding createRotationBinding();

  /**
	 * Returns a new object of class '<em>Translation Binding</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Translation Binding</em>'.
	 * @generated
	 */
  TranslationBinding createTranslationBinding();

  /**
	 * Returns a new object of class '<em>Transform Matrix Binding</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transform Matrix Binding</em>'.
	 * @generated
	 */
  TransformMatrixBinding createTransformMatrixBinding();

  /**
	 * Returns a new object of class '<em>Enumeration Switch Binding</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Switch Binding</em>'.
	 * @generated
	 */
  EnumerationSwitchBinding createEnumerationSwitchBinding();

  /**
	 * Returns a new object of class '<em>Enumeration Case</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Case</em>'.
	 * @generated
	 */
  EnumerationCase createEnumerationCase();

  /**
	 * Returns a new object of class '<em>Bindings List</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bindings List</em>'.
	 * @generated
	 */
  BindingsList createBindingsList();

  /**
	 * Returns a new object of class '<em>Feature Roots List</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Roots List</em>'.
	 * @generated
	 */
  FeatureRootsList createFeatureRootsList();

  /**
	 * Returns a new object of class '<em>Bindings Set</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bindings Set</em>'.
	 * @generated
	 */
  BindingsSet createBindingsSet();

  /**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
  TopologyBindingsFacade createTopologyBindingsFacade();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  TopologyBindingsPackage getTopologyBindingsPackage();

} //TopologyBindingsFactory
