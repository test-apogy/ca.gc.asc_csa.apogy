/**
 * Canadian Space Agency 2007
 *
 * $Id: Recorder.java,v 1.2.4.2 2015/05/21 15:51:12 pallard Exp $
 */
package ca.gc.space.mrt.common.recorders;

import ca.gc.space.mrt.common.processors.Monitorable;

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
 * <ul>
 *   <li>{@link ca.gc.space.mrt.common.recorders.Recorder#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.common.recorders.RecordersPackage#getRecorder()
 * @model
 * @generated
 */
public interface Recorder extends Monitorable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007";

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.space.mrt.common.recorders.RecorderStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see ca.gc.space.mrt.common.recorders.RecorderStatus
	 * @see #setStatus(RecorderStatus)
	 * @see ca.gc.space.mrt.common.recorders.RecordersPackage#getRecorder_Status()
	 * @model required="true"
	 * @generated
	 */
	RecorderStatus getStatus();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.common.recorders.Recorder#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see ca.gc.space.mrt.common.recorders.RecorderStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(RecorderStatus value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns wether or not a new value for a specific track should be recorded or not. This method is intended to be overloaded by users that want to add restriction on what is considered a "new value". The default implementation always returns true.
	 * <!-- end-model-doc -->
	 * @model required="true" trackRequired="true"
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
