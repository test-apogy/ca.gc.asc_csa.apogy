/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.space.mrt.common.recorders;

import ca.gc.space.mrt.common.processors.ProcessorsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ca.gc.space.mrt.common.recorders.RecordersFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='MRTRecorders' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)' modelName='MRTRecorders' operationReflection='true' suppressGenModelAnnotations='false' modelDirectory='/ca.gc.space.mrt.common.recorders/src-generated' editDirectory='/ca.gc.space.mrt.common.recorders.edit/src-generated' basePackage='ca.gc.space.mrt.common'"
 * @generated
 */
public interface RecordersPackage extends EPackage {
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
	String eNS_URI = "ca.gc.space.mrt.common.recorders";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "recorders";

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
	 * The number of operations of the '<em>Recordings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDINGS_OPERATION_COUNT = 0;

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
	 * The operation id for the '<em>Is To Be Recorded</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDER___IS_TO_BE_RECORDED__OBJECT_STRING = ProcessorsPackage.MONITORABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDER___TERMINATE = ProcessorsPackage.MONITORABLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Resume</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDER___RESUME = ProcessorsPackage.MONITORABLE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Pause</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDER___PAUSE = ProcessorsPackage.MONITORABLE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDER___START = ProcessorsPackage.MONITORABLE_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Recorder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDER_OPERATION_COUNT = ProcessorsPackage.MONITORABLE_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.common.recorders.impl.RecordingsExporterImpl <em>Recordings Exporter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.common.recorders.impl.RecordingsExporterImpl
	 * @see ca.gc.space.mrt.common.recorders.impl.RecordersPackageImpl#getRecordingsExporter()
	 * @generated
	 */
	int RECORDINGS_EXPORTER = 2;

	/**
	 * The feature id for the '<em><b>Recordings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDINGS_EXPORTER__RECORDINGS = 0;

	/**
	 * The number of structural features of the '<em>Recordings Exporter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDINGS_EXPORTER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Export</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDINGS_EXPORTER___EXPORT__STRING = 0;

	/**
	 * The number of operations of the '<em>Recordings Exporter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDINGS_EXPORTER_OPERATION_COUNT = 1;

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
	 * The operation id for the '<em>Export To CSV File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_EXPORTER___EXPORT_TO_CSV_FILE__STRING = 0;

	/**
	 * The number of operations of the '<em>Csv Exporter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_EXPORTER_OPERATION_COUNT = 1;

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
	 * The meta object id for the '<em>Date List Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see ca.gc.space.mrt.common.recorders.impl.RecordersPackageImpl#getDateListMap()
	 * @generated
	 */
	int DATE_LIST_MAP = 5;


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
	 * Returns the meta object for the '{@link ca.gc.space.mrt.common.recorders.Recorder#isToBeRecorded(java.lang.Object, java.lang.String) <em>Is To Be Recorded</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is To Be Recorded</em>' operation.
	 * @see ca.gc.space.mrt.common.recorders.Recorder#isToBeRecorded(java.lang.Object, java.lang.String)
	 * @generated
	 */
	EOperation getRecorder__IsToBeRecorded__Object_String();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.mrt.common.recorders.Recorder#terminate() <em>Terminate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Terminate</em>' operation.
	 * @see ca.gc.space.mrt.common.recorders.Recorder#terminate()
	 * @generated
	 */
	EOperation getRecorder__Terminate();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.mrt.common.recorders.Recorder#resume() <em>Resume</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resume</em>' operation.
	 * @see ca.gc.space.mrt.common.recorders.Recorder#resume()
	 * @generated
	 */
	EOperation getRecorder__Resume();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.mrt.common.recorders.Recorder#pause() <em>Pause</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pause</em>' operation.
	 * @see ca.gc.space.mrt.common.recorders.Recorder#pause()
	 * @generated
	 */
	EOperation getRecorder__Pause();

	/**
	 * Returns the meta object for the '{@link ca.gc.space.mrt.common.recorders.Recorder#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see ca.gc.space.mrt.common.recorders.Recorder#start()
	 * @generated
	 */
	EOperation getRecorder__Start();

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
	 * Returns the meta object for the '{@link ca.gc.space.mrt.common.recorders.RecordingsExporter#export(java.lang.String) <em>Export</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Export</em>' operation.
	 * @see ca.gc.space.mrt.common.recorders.RecordingsExporter#export(java.lang.String)
	 * @generated
	 */
	EOperation getRecordingsExporter__Export__String();

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
	 * Returns the meta object for the '{@link ca.gc.space.mrt.common.recorders.CsvExporter#exportToCSVFile(java.lang.String) <em>Export To CSV File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Export To CSV File</em>' operation.
	 * @see ca.gc.space.mrt.common.recorders.CsvExporter#exportToCSVFile(java.lang.String)
	 * @generated
	 */
	EOperation getCsvExporter__ExportToCSVFile__String();

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
	 * Returns the meta object for data type '{@link java.util.Map <em>Date List Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date List Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map<java.util.Date, org.eclipse.emf.common.util.EList<java.lang.Object>>"
	 * @generated
	 */
	EDataType getDateListMap();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RecordersFactory getMRTRecordersFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
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
		 * The meta object literal for the '<em><b>Is To Be Recorded</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECORDER___IS_TO_BE_RECORDED__OBJECT_STRING = eINSTANCE.getRecorder__IsToBeRecorded__Object_String();

		/**
		 * The meta object literal for the '<em><b>Terminate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECORDER___TERMINATE = eINSTANCE.getRecorder__Terminate();

		/**
		 * The meta object literal for the '<em><b>Resume</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECORDER___RESUME = eINSTANCE.getRecorder__Resume();

		/**
		 * The meta object literal for the '<em><b>Pause</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECORDER___PAUSE = eINSTANCE.getRecorder__Pause();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECORDER___START = eINSTANCE.getRecorder__Start();

		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.common.recorders.impl.RecordingsExporterImpl <em>Recordings Exporter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.common.recorders.impl.RecordingsExporterImpl
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
		 * The meta object literal for the '<em><b>Export</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECORDINGS_EXPORTER___EXPORT__STRING = eINSTANCE.getRecordingsExporter__Export__String();

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
		 * The meta object literal for the '<em><b>Export To CSV File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CSV_EXPORTER___EXPORT_TO_CSV_FILE__STRING = eINSTANCE.getCsvExporter__ExportToCSVFile__String();

		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.common.recorders.RecorderStatus <em>Recorder Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.common.recorders.RecorderStatus
		 * @see ca.gc.space.mrt.common.recorders.impl.RecordersPackageImpl#getRecorderStatus()
		 * @generated
		 */
		EEnum RECORDER_STATUS = eINSTANCE.getRecorderStatus();

		/**
		 * The meta object literal for the '<em>Date List Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see ca.gc.space.mrt.common.recorders.impl.RecordersPackageImpl#getDateListMap()
		 * @generated
		 */
		EDataType DATE_LIST_MAP = eINSTANCE.getDateListMap();

	}

} //RecordersPackage
