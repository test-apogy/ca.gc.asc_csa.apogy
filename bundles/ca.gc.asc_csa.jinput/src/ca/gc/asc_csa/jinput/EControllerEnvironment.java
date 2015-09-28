/**
 * Copyrights Canadian Space Agency 2012. All rights reserved.
 */
package ca.gc.asc_csa.jinput;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EController Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.jinput.EControllerEnvironment#isSupported <em>Supported</em>}</li>
 *   <li>{@link ca.gc.asc_csa.jinput.EControllerEnvironment#getControllers <em>Controllers</em>}</li>
 *   <li>{@link ca.gc.asc_csa.jinput.EControllerEnvironment#isRefreshRequested <em>Refresh Requested</em>}</li>
 *   <li>{@link ca.gc.asc_csa.jinput.EControllerEnvironment#getPollingCount <em>Polling Count</em>}</li>
 *   <li>{@link ca.gc.asc_csa.jinput.EControllerEnvironment#getPollingJob <em>Polling Job</em>}</li>
 *   <li>{@link ca.gc.asc_csa.jinput.EControllerEnvironment#isPollingProblem <em>Polling Problem</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.jinput.JInputPackage#getEControllerEnvironment()
 * @model
 * @generated
 */
public interface EControllerEnvironment extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyrights Canadian Space Agency 2012. All rights reserved.";

	/**
	 * Returns the value of the '<em><b>Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported</em>' attribute.
	 * @see ca.gc.asc_csa.jinput.JInputPackage#getEControllerEnvironment_Supported()
	 * @model changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isSupported();

	/**
	 * Returns the value of the '<em><b>Controllers</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.jinput.EController}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controllers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controllers</em>' containment reference list.
	 * @see ca.gc.asc_csa.jinput.JInputPackage#getEControllerEnvironment_Controllers()
	 * @model containment="true" transient="true" changeable="false"
	 * @generated
	 */
	EList<EController> getControllers();

	/**
	 * Returns the value of the '<em><b>Refresh Requested</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refresh Requested</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Requested</em>' attribute.
	 * @see #setRefreshRequested(boolean)
	 * @see ca.gc.asc_csa.jinput.JInputPackage#getEControllerEnvironment_RefreshRequested()
	 * @model default="true"
	 * @generated
	 */
	boolean isRefreshRequested();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.jinput.EControllerEnvironment#isRefreshRequested <em>Refresh Requested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Requested</em>' attribute.
	 * @see #isRefreshRequested()
	 * @generated
	 */
	void setRefreshRequested(boolean value);

	/**
	 * Returns the value of the '<em><b>Polling Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polling Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polling Count</em>' attribute.
	 * @see #setPollingCount(long)
	 * @see ca.gc.asc_csa.jinput.JInputPackage#getEControllerEnvironment_PollingCount()
	 * @model
	 * @generated
	 */
	long getPollingCount();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.jinput.EControllerEnvironment#getPollingCount <em>Polling Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polling Count</em>' attribute.
	 * @see #getPollingCount()
	 * @generated
	 */
	void setPollingCount(long value);

	/**
	 * Returns the value of the '<em><b>Polling Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polling Job</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polling Job</em>' attribute.
	 * @see ca.gc.asc_csa.jinput.JInputPackage#getEControllerEnvironment_PollingJob()
	 * @model dataType="ca.gc.asc_csa.jinput.Job" changeable="false"
	 * @generated
	 */
	Job getPollingJob();

	/**
	 * Returns the value of the '<em><b>Polling Problem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polling Problem</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polling Problem</em>' attribute.
	 * @see #setPollingProblem(boolean)
	 * @see ca.gc.asc_csa.jinput.JInputPackage#getEControllerEnvironment_PollingProblem()
	 * @model
	 * @generated
	 */
	boolean isPollingProblem();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.jinput.EControllerEnvironment#isPollingProblem <em>Polling Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polling Problem</em>' attribute.
	 * @see #isPollingProblem()
	 * @generated
	 */
	void setPollingProblem(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refresh();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void startPolling();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void stopPolling();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EController resolveController(String controllerName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EComponent resolveEComponent(String componentName, EController eController);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EComponent resolveEComponent(EComponentQualifier eComponentQualifier);

} // EControllerEnvironment
