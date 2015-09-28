/**
 * Canadian Space Agency 2007.
 *
 * $Id: RecordingsExporter.java,v 1.2.4.2 2015/05/21 15:50:02 pallard Exp $
 */
package ca.gc.space.mrt.common.recorders;

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
 * <ul>
 *   <li>{@link ca.gc.space.mrt.common.recorders.RecordingsExporter#getRecordings <em>Recordings</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.common.recorders.RecordersPackage#getRecordingsExporter()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RecordingsExporter extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

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
	 * @see ca.gc.space.mrt.common.recorders.RecordersPackage#getRecordingsExporter_Recordings()
	 * @model
	 * @generated
	 */
	Recordings getRecordings();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.common.recorders.RecordingsExporter#getRecordings <em>Recordings</em>}' reference.
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
	 * @model pathRequired="true"
	 * @generated
	 */
	void export(String path);

} // RecordingsExporter
