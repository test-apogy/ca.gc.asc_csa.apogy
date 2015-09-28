/**
 * Canadian Space Agency 2007.
 *
 * $Id: Monitorable.java,v 1.4.4.2 2015/05/21 15:49:38 pallard Exp $
 */
package ca.gc.space.mrt.common.processors;

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
 * <ul>
 *   <li>{@link ca.gc.space.mrt.common.processors.Monitorable#getProgressMonitor <em>Progress Monitor</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.common.processors.ProcessorsPackage#getMonitorable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Monitorable extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

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
	 * @see ca.gc.space.mrt.common.processors.ProcessorsPackage#getMonitorable_ProgressMonitor()
	 * @model unique="false" dataType="ca.gc.space.mrt.common.processors.IProgressMonitor" transient="true"
	 * @generated
	 */
	IProgressMonitor getProgressMonitor();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.common.processors.Monitorable#getProgressMonitor <em>Progress Monitor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Progress Monitor</em>' attribute.
	 * @see #getProgressMonitor()
	 * @generated
	 */
	void setProgressMonitor(IProgressMonitor value);

} // Monitorable
