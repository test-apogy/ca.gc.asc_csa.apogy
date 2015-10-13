/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.recorders;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recordings Exporter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represent a object that is used to save to file the data acquired by a Recorder.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.recorders.RecordingsExporter#getRecordings <em>Recordings</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.recorders.RecordersPackage#getRecordingsExporter()
 * @model
 * @generated
 */
public interface RecordingsExporter extends EObject {
	/**
	 * Returns the value of the '<em><b>Recordings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recordings</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recordings</em>' reference.
	 * @see #setRecordings(Recordings)
	 * @see org.eclipse.symphony.common.recorders.RecordersPackage#getRecordingsExporter_Recordings()
	 * @model
	 * @generated
	 */
	Recordings getRecordings();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.recorders.RecordingsExporter#getRecordings <em>Recordings</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recordings</em>' reference.
	 * @see #getRecordings()
	 * @generated
	 */
	void setRecordings(Recordings value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model pathUnique="false"
	 * @generated
	 */
	void export(String path);

} // RecordingsExporter
