/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.obsolete.mrt;

import org.eclipse.core.runtime.jobs.Job;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.obsolete.mrt.Server#getServerJob <em>Server Job</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.common.obsolete.mrt.CommonPackage#getServer()
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
	 * @see org.eclipse.symphony.common.obsolete.mrt.CommonPackage#getServer_ServerJob()
	 * @model unique="false" dataType="org.eclipse.symphony.common.obsolete.mrt.Job" transient="true" changeable="false"
	 * @generated
	 */
	Job getServerJob();

} // Server
