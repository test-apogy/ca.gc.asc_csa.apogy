/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.ros.util;

import ca.gc.asc_csa.eclipse.ros.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.ros.internal.message.Message;
import ca.gc.asc_csa.eclipse.ros.RosInterface;
import ca.gc.asc_csa.eclipse.ros.RosListener;
import ca.gc.asc_csa.eclipse.ros.RosNode;
import ca.gc.asc_csa.eclipse.ros.RosPackage;
import ca.gc.asc_csa.eclipse.ros.RosPublisher;
import ca.gc.asc_csa.eclipse.ros.RosPublisherManager;
import ca.gc.asc_csa.eclipse.ros.RosService;
import ca.gc.asc_csa.eclipse.ros.RosServiceManager;
import ca.gc.asc_csa.eclipse.ros.RosTopicLauncher;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.eclipse.ros.RosPackage
 * @generated
 */
public class RosSwitch<T1> extends Switch<T1>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static RosPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RosSwitch()
  {
		if (modelPackage == null) {
			modelPackage = RosPackage.eINSTANCE;
		}
	}

  /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
		return ePackage == modelPackage;
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  @Override
  protected T1 doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case RosPackage.ROS_NODE: {
				RosNode rosNode = (RosNode)theEObject;
				T1 result = caseRosNode(rosNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RosPackage.ROS_INTERFACE: {
				RosInterface rosInterface = (RosInterface)theEObject;
				T1 result = caseRosInterface(rosInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RosPackage.ROS_PUBLISHER_MANAGER: {
				RosPublisherManager rosPublisherManager = (RosPublisherManager)theEObject;
				T1 result = caseRosPublisherManager(rosPublisherManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RosPackage.ROS_PUBLISHER: {
				RosPublisher<?> rosPublisher = (RosPublisher<?>)theEObject;
				T1 result = caseRosPublisher(rosPublisher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RosPackage.ROS_SERVICE_MANAGER: {
				RosServiceManager rosServiceManager = (RosServiceManager)theEObject;
				T1 result = caseRosServiceManager(rosServiceManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RosPackage.ROS_SERVICE: {
				RosService<?, ?> rosService = (RosService<?, ?>)theEObject;
				T1 result = caseRosService(rosService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RosPackage.ROS_TOPIC_LAUNCHER: {
				RosTopicLauncher rosTopicLauncher = (RosTopicLauncher)theEObject;
				T1 result = caseRosTopicLauncher(rosTopicLauncher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RosPackage.ROS_LISTENER: {
				RosListener<?> rosListener = (RosListener<?>)theEObject;
				T1 result = caseRosListener(rosListener);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RosPackage.ROS_FACADE: {
				RosFacade rosFacade = (RosFacade)theEObject;
				T1 result = caseRosFacade(rosFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T1 caseRosInterface(RosInterface object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Publisher</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public <T extends Message> T1 caseRosPublisher(RosPublisher<T> object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public <Request extends Message, Response extends Message> T1 caseRosService(RosService<Request, Response> object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Listener</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Listener</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public <T extends Message> T1 caseRosListener(RosListener<T> object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRosFacade(RosFacade object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Publisher Manager</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publisher Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T1 caseRosPublisherManager(RosPublisherManager object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Service Manager</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T1 caseRosServiceManager(RosServiceManager object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Topic Launcher</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topic Launcher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T1 caseRosTopicLauncher(RosTopicLauncher object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T1 caseRosNode(RosNode object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
  @Override
  public T1 defaultCase(EObject object)
  {
		return null;
	}

} //RosSwitch
