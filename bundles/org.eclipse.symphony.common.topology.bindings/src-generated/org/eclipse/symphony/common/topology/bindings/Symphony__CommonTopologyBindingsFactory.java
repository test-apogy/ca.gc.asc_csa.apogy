/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.bindings;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.common.topology.bindings.Symphony__CommonTopologyBindingsPackage
 * @generated
 */
public interface Symphony__CommonTopologyBindingsFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  Symphony__CommonTopologyBindingsFactory eINSTANCE = org.eclipse.symphony.common.topology.bindings.impl.Symphony__CommonTopologyBindingsFactoryImpl.init();

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
	Symphony__CommonTopologyBindingsFacade createSymphony__CommonTopologyBindingsFacade();

		/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Symphony__CommonTopologyBindingsPackage getSymphony__CommonTopologyBindingsPackage();

} //Symphony__CommonTopologyBindingsFactory