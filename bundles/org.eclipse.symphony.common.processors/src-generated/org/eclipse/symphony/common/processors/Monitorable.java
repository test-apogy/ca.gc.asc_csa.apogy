/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.processors;

import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitorable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represent a object for which operation progress can be reported.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.processors.Monitorable#getProgressMonitor <em>Progress Monitor</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.processors.ProcessorsPackage#getMonitorable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Monitorable extends EObject {
	/**
	 * Returns the value of the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Progress Monitor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Progress Monitor</em>' attribute.
	 * @see #setProgressMonitor(IProgressMonitor)
	 * @see org.eclipse.symphony.common.processors.ProcessorsPackage#getMonitorable_ProgressMonitor()
	 * @model unique="false" dataType="org.eclipse.symphony.common.processors.IProgressMonitor" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
	IProgressMonitor getProgressMonitor();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.processors.Monitorable#getProgressMonitor <em>Progress Monitor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Progress Monitor</em>' attribute.
	 * @see #getProgressMonitor()
	 * @generated
	 */
	void setProgressMonitor(IProgressMonitor value);

} // Monitorable
