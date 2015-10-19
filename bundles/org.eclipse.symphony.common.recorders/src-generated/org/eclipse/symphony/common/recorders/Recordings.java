/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.recorders;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recordings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represent a object that is used to stored data generated by a Recorder. This includes the source object (source), the names of the source object's features being recorded (tracks), and the actual time tag features values themselves (records).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.recorders.Recordings#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.recorders.Recordings#getRecords <em>Records</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.recorders.Recordings#getTracks <em>Tracks</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.recorders.RecordersPackage#getRecordings()
 * @model
 * @generated
 */
public interface Recordings extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EObject)
	 * @see org.eclipse.symphony.common.recorders.RecordersPackage#getRecordings_Source()
	 * @model
	 * @generated
	 */
	EObject getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.recorders.Recordings#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EObject value);

	/**
	 * Returns the value of the '<em><b>Records</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Records</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Records</em>' attribute.
	 * @see #setRecords(Map)
	 * @see org.eclipse.symphony.common.recorders.RecordersPackage#getRecordings_Records()
	 * @model unique="false" dataType="org.eclipse.symphony.common.recorders.DateListMap"
	 * @generated
	 */
	Map<Date, EList<Object>> getRecords();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.recorders.Recordings#getRecords <em>Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Records</em>' attribute.
	 * @see #getRecords()
	 * @generated
	 */
	void setRecords(Map<Date, EList<Object>> value);

	/**
	 * Returns the value of the '<em><b>Tracks</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracks</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracks</em>' attribute list.
	 * @see org.eclipse.symphony.common.recorders.RecordersPackage#getRecordings_Tracks()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getTracks();

} // Recordings
