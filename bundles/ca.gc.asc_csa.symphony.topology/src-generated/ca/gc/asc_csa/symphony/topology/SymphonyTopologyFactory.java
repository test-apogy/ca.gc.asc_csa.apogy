/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.topology;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.symphony.topology.SymphonyTopologyPackage
 * @generated
 */
public interface SymphonyTopologyFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  SymphonyTopologyFactory eINSTANCE = ca.gc.asc_csa.symphony.topology.impl.SymphonyTopologyFactoryImpl.init();

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
  SymphonyTopologyFacade createSymphonyTopologyFacade();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  SymphonyTopologyPackage getSymphonyTopologyPackage();

} //SymphonyTopologyFactory
