/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.recorders;

import org.eclipse.symphony.common.processors.Monitorable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recorder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represent a object that can monitor an object and record its changes through time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.recorders.Recorder#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.recorders.RecordersPackage#getRecorder()
 * @model
 * @generated
 */
public interface Recorder extends Monitorable {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.symphony.common.recorders.RecorderStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.eclipse.symphony.common.recorders.RecorderStatus
	 * @see #setStatus(RecorderStatus)
	 * @see org.eclipse.symphony.common.recorders.RecordersPackage#getRecorder_Status()
	 * @model unique="false"
	 * @generated
	 */
	RecorderStatus getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.recorders.Recorder#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.eclipse.symphony.common.recorders.RecorderStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(RecorderStatus value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns whether or not a new value for a specific track should be recorded or not. This method is intended to be overloaded by users that want to add restriction on what is considered a "new value". The default implementation always returns true.
	 * <!-- end-model-doc -->
	 * @model unique="false" newValueUnique="false" trackUnique="false"
	 * @generated
	 */
	boolean isToBeRecorded(Object newValue, String track);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void terminate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void resume();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void pause();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void start();

} // Recorder
