/**
 */
package ca.gc.asc_csa.apogy.common.emf;

import org.eclipse.core.runtime.jobs.Job;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.Server#getServerJob <em>Server Job</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getServer()
 * @model
 * @generated
 */
public interface Server extends Startable {
	/**
	 * Returns the value of the '<em><b>Server Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Job</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Job</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getServer_ServerJob()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.common.emf.Job" transient="true" changeable="false"
	 * @generated
	 */
	Job getServerJob();

} // Server
