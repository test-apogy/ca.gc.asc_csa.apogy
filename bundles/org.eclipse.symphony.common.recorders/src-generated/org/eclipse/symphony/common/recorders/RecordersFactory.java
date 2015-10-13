/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.recorders;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.common.recorders.RecordersPackage
 * @generated
 */
public interface RecordersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RecordersFactory eINSTANCE = org.eclipse.symphony.common.recorders.impl.RecordersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Recordings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recordings</em>'.
	 * @generated
	 */
	Recordings createRecordings();

	/**
	 * Returns a new object of class '<em>Recorder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recorder</em>'.
	 * @generated
	 */
	Recorder createRecorder();

	/**
	 * Returns a new object of class '<em>Recordings Exporter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recordings Exporter</em>'.
	 * @generated
	 */
	RecordingsExporter createRecordingsExporter();

	/**
	 * Returns a new object of class '<em>Csv Exporter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Csv Exporter</em>'.
	 * @generated
	 */
	CsvExporter createCsvExporter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RecordersPackage getRecordersPackage();

} //RecordersFactory