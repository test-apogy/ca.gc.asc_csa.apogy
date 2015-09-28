/**
 * Canadian Space Agency 2007.
 *
 * $Id: RecordersFactory.java,v 1.2.4.2 2015/05/21 15:50:02 pallard Exp $
 */
package ca.gc.space.mrt.common.recorders;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.space.mrt.common.recorders.RecordersPackage
 * @generated
 */
public interface RecordersFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RecordersFactory eINSTANCE = ca.gc.space.mrt.common.recorders.impl.RecordersFactoryImpl.init();

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
