/**
 * Canadian Space Agency 2007
 *
 * $Id: RecordersPackage.java,v 1.3.4.2 2015/05/21 15:51:12 pallard Exp $
 */
package ca.gc.space.mrt.common.recorders;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import ca.gc.space.mrt.common.processors.ProcessorsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ca.gc.space.mrt.common.recorders.RecordersFactory
 * @model kind="package"
 * @generated
 */
public interface RecordersPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "recorders";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///ca/gc/space/mrt/common/model/recorders.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ca.gc.space.mrt.common";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RecordersPackage eINSTANCE = ca.gc.space.mrt.common.recorders.impl.RecordersPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.common.recorders.impl.RecordingsImpl <em>Recordings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.common.recorders.impl.RecordingsImpl
	 * @see ca.gc.space.mrt.common.recorders.impl.RecordersPackageImpl#getRecordings()
	 * @generated
	 */
	int RECORDINGS = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDINGS__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Records</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDINGS__RECORDS = 1;

	/**
	 * The feature id for the '<em><b>Tracks</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDINGS__TRACKS = 2;

	/**
	 * The number of structural features of the '<em>Recordings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDINGS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.common.recorders.impl.RecorderImpl <em>Recorder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.common.recorders.impl.RecorderImpl
	 * @see ca.gc.space.mrt.common.recorders.impl.RecordersPackageImpl#getRecorder()
	 * @generated
	 */
	int RECORDER = 1;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDER__PROGRESS_MONITOR = ProcessorsPackage.MONITORABLE__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDER__STATUS = ProcessorsPackage.MONITORABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Recorder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDER_FEATURE_COUNT = ProcessorsPackage.MONITORABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.common.recorders.RecordingsExporter <em>Recordings Exporter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.common.recorders.RecordingsExporter
	 * @see ca.gc.space.mrt.common.recorders.impl.RecordersPackageImpl#getRecordingsExporter()
	 * @generated
	 */
	int RECORDINGS_EXPORTER = 2;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDINGS_EXPORTER__PROGRESS_MONITOR = ProcessorsPackage.MONITORABLE__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Recordings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDINGS_EXPORTER__RECORDINGS = ProcessorsPackage.MONITORABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Recordings Exporter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDINGS_EXPORTER_FEATURE_COUNT = ProcessorsPackage.MONITORABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.common.recorders.impl.CsvExporterImpl <em>Csv Exporter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.common.recorders.impl.CsvExporterImpl
	 * @see ca.gc.space.mrt.common.recorders.impl.RecordersPackageImpl#getCsvExporter()
	 * @generated
	 */
	int CSV_EXPORTER = 3;

	/**
	 * The feature id for the '<em><b>Include Column Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_EXPORTER__INCLUDE_COLUMN_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Include Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_EXPORTER__INCLUDE_COLUMN_NAME = 1;

	/**
	 * The feature id for the '<em><b>Column Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_EXPORTER__COLUMN_SET = 2;

	/**
	 * The number of structural features of the '<em>Csv Exporter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_EXPORTER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.common.recorders.RecorderStatus <em>Recorder Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.common.recorders.RecorderStatus
	 * @see ca.gc.space.mrt.common.recorders.impl.RecordersPackageImpl#getRecorderStatus()
	 * @generated
	 */
	int RECORDER_STATUS = 4;


	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.common.recorders.Recordings <em>Recordings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recordings</em>'.
	 * @see ca.gc.space.mrt.common.recorders.Recordings
	 * @generated
	 */
	EClass getRecordings();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.space.mrt.common.recorders.Recordings#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ca.gc.space.mrt.common.recorders.Recordings#getSource()
	 * @see #getRecordings()
	 * @generated
	 */
	EReference getRecordings_Source();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.common.recorders.Recordings#getRecords <em>Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Records</em>'.
	 * @see ca.gc.space.mrt.common.recorders.Recordings#getRecords()
	 * @see #getRecordings()
	 * @generated
	 */
	EAttribute getRecordings_Records();

	/**
	 * Returns the meta object for the attribute list '{@link ca.gc.space.mrt.common.recorders.Recordings#getTracks <em>Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tracks</em>'.
	 * @see ca.gc.space.mrt.common.recorders.Recordings#getTracks()
	 * @see #getRecordings()
	 * @generated
	 */
	EAttribute getRecordings_Tracks();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.common.recorders.Recorder <em>Recorder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recorder</em>'.
	 * @see ca.gc.space.mrt.common.recorders.Recorder
	 * @generated
	 */
	EClass getRecorder();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.common.recorders.Recorder#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see ca.gc.space.mrt.common.recorders.Recorder#getStatus()
	 * @see #getRecorder()
	 * @generated
	 */
	EAttribute getRecorder_Status();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.common.recorders.RecordingsExporter <em>Recordings Exporter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recordings Exporter</em>'.
	 * @see ca.gc.space.mrt.common.recorders.RecordingsExporter
	 * @generated
	 */
	EClass getRecordingsExporter();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.space.mrt.common.recorders.RecordingsExporter#getRecordings <em>Recordings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recordings</em>'.
	 * @see ca.gc.space.mrt.common.recorders.RecordingsExporter#getRecordings()
	 * @see #getRecordingsExporter()
	 * @generated
	 */
	EReference getRecordingsExporter_Recordings();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.common.recorders.CsvExporter <em>Csv Exporter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Csv Exporter</em>'.
	 * @see ca.gc.space.mrt.common.recorders.CsvExporter
	 * @generated
	 */
	EClass getCsvExporter();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.common.recorders.CsvExporter#isIncludeColumnDescription <em>Include Column Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Column Description</em>'.
	 * @see ca.gc.space.mrt.common.recorders.CsvExporter#isIncludeColumnDescription()
	 * @see #getCsvExporter()
	 * @generated
	 */
	EAttribute getCsvExporter_IncludeColumnDescription();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.common.recorders.CsvExporter#isIncludeColumnName <em>Include Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Column Name</em>'.
	 * @see ca.gc.space.mrt.common.recorders.CsvExporter#isIncludeColumnName()
	 * @see #getCsvExporter()
	 * @generated
	 */
	EAttribute getCsvExporter_IncludeColumnName();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.space.mrt.common.recorders.CsvExporter#getColumnSet <em>Column Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column Set</em>'.
	 * @see ca.gc.space.mrt.common.recorders.CsvExporter#getColumnSet()
	 * @see #getCsvExporter()
	 * @generated
	 */
	EReference getCsvExporter_ColumnSet();

	/**
	 * Returns the meta object for enum '{@link ca.gc.space.mrt.common.recorders.RecorderStatus <em>Recorder Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Recorder Status</em>'.
	 * @see ca.gc.space.mrt.common.recorders.RecorderStatus
	 * @generated
	 */
	EEnum getRecorderStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RecordersFactory getRecordersFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.common.recorders.impl.RecordingsImpl <em>Recordings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.common.recorders.impl.RecordingsImpl
		 * @see ca.gc.space.mrt.common.recorders.impl.RecordersPackageImpl#getRecordings()
		 * @generated
		 */
		EClass RECORDINGS = eINSTANCE.getRecordings();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORDINGS__SOURCE = eINSTANCE.getRecordings_Source();

		/**
		 * The meta object literal for the '<em><b>Records</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORDINGS__RECORDS = eINSTANCE.getRecordings_Records();

		/**
		 * The meta object literal for the '<em><b>Tracks</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORDINGS__TRACKS = eINSTANCE.getRecordings_Tracks();

		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.common.recorders.impl.RecorderImpl <em>Recorder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.common.recorders.impl.RecorderImpl
		 * @see ca.gc.space.mrt.common.recorders.impl.RecordersPackageImpl#getRecorder()
		 * @generated
		 */
		EClass RECORDER = eINSTANCE.getRecorder();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORDER__STATUS = eINSTANCE.getRecorder_Status();

		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.common.recorders.RecordingsExporter <em>Recordings Exporter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.common.recorders.RecordingsExporter
		 * @see ca.gc.space.mrt.common.recorders.impl.RecordersPackageImpl#getRecordingsExporter()
		 * @generated
		 */
		EClass RECORDINGS_EXPORTER = eINSTANCE.getRecordingsExporter();

		/**
		 * The meta object literal for the '<em><b>Recordings</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORDINGS_EXPORTER__RECORDINGS = eINSTANCE.getRecordingsExporter_Recordings();

		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.common.recorders.impl.CsvExporterImpl <em>Csv Exporter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.common.recorders.impl.CsvExporterImpl
		 * @see ca.gc.space.mrt.common.recorders.impl.RecordersPackageImpl#getCsvExporter()
		 * @generated
		 */
		EClass CSV_EXPORTER = eINSTANCE.getCsvExporter();

		/**
		 * The meta object literal for the '<em><b>Include Column Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_EXPORTER__INCLUDE_COLUMN_DESCRIPTION = eINSTANCE.getCsvExporter_IncludeColumnDescription();

		/**
		 * The meta object literal for the '<em><b>Include Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_EXPORTER__INCLUDE_COLUMN_NAME = eINSTANCE.getCsvExporter_IncludeColumnName();

		/**
		 * The meta object literal for the '<em><b>Column Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSV_EXPORTER__COLUMN_SET = eINSTANCE.getCsvExporter_ColumnSet();

		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.common.recorders.RecorderStatus <em>Recorder Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.common.recorders.RecorderStatus
		 * @see ca.gc.space.mrt.common.recorders.impl.RecordersPackageImpl#getRecorderStatus()
		 * @generated
		 */
		EEnum RECORDER_STATUS = eINSTANCE.getRecorderStatus();

	}

} //RecordersPackage
