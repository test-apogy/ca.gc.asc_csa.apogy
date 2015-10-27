/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.topology;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.core.topology.Symphony__CoreTopologyPackage
 * @generated
 */
public interface Symphony__CoreTopologyFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  Symphony__CoreTopologyFactory eINSTANCE = org.eclipse.symphony.core.topology.impl.Symphony__CoreTopologyFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Systems Topology Adapter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Systems Topology Adapter</em>'.
	 * @generated
	 */
  SystemsTopologyAdapter createSystemsTopologyAdapter();

  /**
	 * Returns a new object of class '<em>Symphony Environment Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symphony Environment Node</em>'.
	 * @generated
	 */
  SymphonyEnvironmentNode createSymphonyEnvironmentNode();

  /**
	 * Returns a new object of class '<em>Symphony System AP Is Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symphony System AP Is Node</em>'.
	 * @generated
	 */
  SymphonySystemAPIsNode createSymphonySystemAPIsNode();

  /**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	Symphony__CoreTopologyFacade createSymphony__CoreTopologyFacade();

		/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Symphony__CoreTopologyPackage getSymphony__CoreTopologyPackage();

} //Symphony__CoreTopologyFactory
