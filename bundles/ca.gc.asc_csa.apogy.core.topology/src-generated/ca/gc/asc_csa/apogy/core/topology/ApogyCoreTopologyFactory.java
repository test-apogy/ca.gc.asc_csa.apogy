/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.topology;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyPackage
 * @generated
 */
public interface ApogyCoreTopologyFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyCoreTopologyFactory eINSTANCE = ca.gc.asc_csa.apogy.core.topology.impl.ApogyCoreTopologyFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Systems Topology Adapter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Systems Topology Adapter</em>'.
	 * @generated
	 */
  SystemsTopologyAdapter createSystemsTopologyAdapter();

  /**
	 * Returns a new object of class '<em>Apogy Environment Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apogy Environment Node</em>'.
	 * @generated
	 */
  ApogyEnvironmentNode createApogyEnvironmentNode();

  /**
	 * Returns a new object of class '<em>Apogy System AP Is Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apogy System AP Is Node</em>'.
	 * @generated
	 */
  ApogySystemAPIsNode createApogySystemAPIsNode();

  /**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	ApogyCoreTopologyFacade createApogyCoreTopologyFacade();

		/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyCoreTopologyPackage getApogyCoreTopologyPackage();

} //ApogyCoreTopologyFactory
