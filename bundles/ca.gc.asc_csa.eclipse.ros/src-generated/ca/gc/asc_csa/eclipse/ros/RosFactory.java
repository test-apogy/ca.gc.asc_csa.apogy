/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.ros;

import org.eclipse.emf.ecore.EFactory;
import org.ros.internal.message.Message;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.eclipse.ros.RosPackage
 * @generated
 */
public interface RosFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  RosFactory eINSTANCE = ca.gc.asc_csa.eclipse.ros.impl.RosFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Publisher</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Publisher</em>'.
	 * @generated
	 */
  <T extends Message> RosPublisher<T> createRosPublisher();
  
  /**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
  <Request extends Message, Response extends Message> RosService<Request, Response> createRosService();

  /**
	 * Returns a new object of class '<em>Listener</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Listener</em>'.
	 * @generated
	 */
  <T extends Message> RosListener<T> createRosListener();

  /**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	RosFacade createRosFacade();

		/**
	 * Returns a new object of class '<em>Publisher Manager</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Publisher Manager</em>'.
	 * @generated
	 */
  RosPublisherManager createRosPublisherManager();

  /**
	 * Returns a new object of class '<em>Service Manager</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Manager</em>'.
	 * @generated
	 */
  RosServiceManager createRosServiceManager();

  /**
	 * Returns a new object of class '<em>Topic Launcher</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topic Launcher</em>'.
	 * @generated
	 */
  RosTopicLauncher createRosTopicLauncher();

  /**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
  RosNode createRosNode();
  
  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  RosPackage getRosPackage();

} //RosFactory
