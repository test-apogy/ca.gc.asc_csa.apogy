/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.ros.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.symphony.addons.ros.*;

import org.ros.internal.message.Message;

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
 * @see org.eclipse.symphony.addons.ros.Symphony__AddonsROSPackage
 * @generated
 */
public class Symphony__AddonsROSSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Symphony__AddonsROSPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsROSSwitch() {
		if (modelPackage == null) {
			modelPackage = Symphony__AddonsROSPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
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
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Symphony__AddonsROSPackage.ROS_NODE: {
				ROSNode rosNode = (ROSNode)theEObject;
				T1 result = caseROSNode(rosNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__AddonsROSPackage.ROS_INTERFACE: {
				ROSInterface rosInterface = (ROSInterface)theEObject;
				T1 result = caseROSInterface(rosInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__AddonsROSPackage.ROS_PUBLISHER_MANAGER: {
				ROSPublisherManager rosPublisherManager = (ROSPublisherManager)theEObject;
				T1 result = caseROSPublisherManager(rosPublisherManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__AddonsROSPackage.ROS_PUBLISHER: {
				ROSPublisher<?> rosPublisher = (ROSPublisher<?>)theEObject;
				T1 result = caseROSPublisher(rosPublisher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__AddonsROSPackage.ROS_SERVICE_MANAGER: {
				ROSServiceManager rosServiceManager = (ROSServiceManager)theEObject;
				T1 result = caseROSServiceManager(rosServiceManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__AddonsROSPackage.ROS_SERVICE: {
				ROSService<?, ?> rosService = (ROSService<?, ?>)theEObject;
				T1 result = caseROSService(rosService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__AddonsROSPackage.ROS_TOPIC_LAUNCHER: {
				ROSTopicLauncher rosTopicLauncher = (ROSTopicLauncher)theEObject;
				T1 result = caseROSTopicLauncher(rosTopicLauncher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__AddonsROSPackage.ROS_LISTENER: {
				ROSListener<?> rosListener = (ROSListener<?>)theEObject;
				T1 result = caseROSListener(rosListener);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__AddonsROSPackage.SYMPHONY_ADDONS_ROS_FACADE: {
				Symphony__AddonsROSFacade symphony__AddonsROSFacade = (Symphony__AddonsROSFacade)theEObject;
				T1 result = caseSymphony__AddonsROSFacade(symphony__AddonsROSFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseROSNode(ROSNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseROSInterface(ROSInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Publisher Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Publisher Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseROSPublisherManager(ROSPublisherManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Publisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Message> T1 caseROSPublisher(ROSPublisher<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Service Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Service Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseROSServiceManager(ROSServiceManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <Request extends Message, Response extends Message> T1 caseROSService(ROSService<Request, Response> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Topic Launcher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Topic Launcher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseROSTopicLauncher(ROSTopicLauncher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Listener</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Listener</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Message> T1 caseROSListener(ROSListener<T> object) {
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
	public T1 caseSymphony__AddonsROSFacade(Symphony__AddonsROSFacade object) {
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
	public T1 defaultCase(EObject object) {
		return null;
	}

} //Symphony__AddonsROSSwitch
