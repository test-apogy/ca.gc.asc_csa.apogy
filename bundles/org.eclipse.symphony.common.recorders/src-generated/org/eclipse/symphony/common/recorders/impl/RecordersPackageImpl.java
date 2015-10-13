/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.recorders.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.common.file.csv.CsvPackage;
import org.eclipse.symphony.common.processors.ProcessorsPackage;
import org.eclipse.symphony.common.recorders.CsvExporter;
import org.eclipse.symphony.common.recorders.Recorder;
import org.eclipse.symphony.common.recorders.RecorderStatus;
import org.eclipse.symphony.common.recorders.RecordersFactory;
import org.eclipse.symphony.common.recorders.RecordersPackage;
import org.eclipse.symphony.common.recorders.Recordings;
import org.eclipse.symphony.common.recorders.RecordingsExporter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecordersPackageImpl extends EPackageImpl implements RecordersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recorderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordingsExporterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csvExporterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum recorderStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateListMapEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.symphony.common.recorders.RecordersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RecordersPackageImpl() {
		super(eNS_URI, RecordersFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RecordersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RecordersPackage init() {
		if (isInited) return (RecordersPackage)EPackage.Registry.INSTANCE.getEPackage(RecordersPackage.eNS_URI);

		// Obtain or create and register package
		RecordersPackageImpl theRecordersPackage = (RecordersPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RecordersPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RecordersPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CsvPackage.eINSTANCE.eClass();
		ProcessorsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRecordersPackage.createPackageContents();

		// Initialize created meta-data
		theRecordersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRecordersPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RecordersPackage.eNS_URI, theRecordersPackage);
		return theRecordersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecordings() {
		return recordingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecordings_Source() {
		return (EReference)recordingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecordings_Records() {
		return (EAttribute)recordingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecordings_Tracks() {
		return (EAttribute)recordingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecorder() {
		return recorderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecorder_Status() {
		return (EAttribute)recorderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRecorder__IsToBeRecorded__Object_String() {
		return recorderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRecorder__Terminate() {
		return recorderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRecorder__Resume() {
		return recorderEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRecorder__Pause() {
		return recorderEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRecorder__Start() {
		return recorderEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecordingsExporter() {
		return recordingsExporterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecordingsExporter_Recordings() {
		return (EReference)recordingsExporterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRecordingsExporter__Export__String() {
		return recordingsExporterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCsvExporter() {
		return csvExporterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCsvExporter_IncludeColumnDescription() {
		return (EAttribute)csvExporterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCsvExporter_IncludeColumnName() {
		return (EAttribute)csvExporterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCsvExporter_ColumnSet() {
		return (EReference)csvExporterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCsvExporter__ExportToCSVFile__String() {
		return csvExporterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRecorderStatus() {
		return recorderStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDateListMap() {
		return dateListMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordersFactory getRecordersFactory() {
		return (RecordersFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		recordingsEClass = createEClass(RECORDINGS);
		createEReference(recordingsEClass, RECORDINGS__SOURCE);
		createEAttribute(recordingsEClass, RECORDINGS__RECORDS);
		createEAttribute(recordingsEClass, RECORDINGS__TRACKS);

		recorderEClass = createEClass(RECORDER);
		createEAttribute(recorderEClass, RECORDER__STATUS);
		createEOperation(recorderEClass, RECORDER___IS_TO_BE_RECORDED__OBJECT_STRING);
		createEOperation(recorderEClass, RECORDER___TERMINATE);
		createEOperation(recorderEClass, RECORDER___RESUME);
		createEOperation(recorderEClass, RECORDER___PAUSE);
		createEOperation(recorderEClass, RECORDER___START);

		recordingsExporterEClass = createEClass(RECORDINGS_EXPORTER);
		createEReference(recordingsExporterEClass, RECORDINGS_EXPORTER__RECORDINGS);
		createEOperation(recordingsExporterEClass, RECORDINGS_EXPORTER___EXPORT__STRING);

		csvExporterEClass = createEClass(CSV_EXPORTER);
		createEAttribute(csvExporterEClass, CSV_EXPORTER__INCLUDE_COLUMN_DESCRIPTION);
		createEAttribute(csvExporterEClass, CSV_EXPORTER__INCLUDE_COLUMN_NAME);
		createEReference(csvExporterEClass, CSV_EXPORTER__COLUMN_SET);
		createEOperation(csvExporterEClass, CSV_EXPORTER___EXPORT_TO_CSV_FILE__STRING);

		// Create enums
		recorderStatusEEnum = createEEnum(RECORDER_STATUS);

		// Create data types
		dateListMapEDataType = createEDataType(DATE_LIST_MAP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ProcessorsPackage theProcessorsPackage = (ProcessorsPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessorsPackage.eNS_URI);
		CsvPackage theCsvPackage = (CsvPackage)EPackage.Registry.INSTANCE.getEPackage(CsvPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		recorderEClass.getESuperTypes().add(theProcessorsPackage.getMonitorable());

		// Initialize classes, features, and operations; add parameters
		initEClass(recordingsEClass, Recordings.class, "Recordings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecordings_Source(), theEcorePackage.getEObject(), null, "source", null, 0, 1, Recordings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecordings_Records(), this.getDateListMap(), "records", null, 0, 1, Recordings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecordings_Tracks(), theEcorePackage.getEString(), "tracks", null, 0, -1, Recordings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recorderEClass, Recorder.class, "Recorder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecorder_Status(), this.getRecorderStatus(), "status", null, 0, 1, Recorder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getRecorder__IsToBeRecorded__Object_String(), theEcorePackage.getEBoolean(), "isToBeRecorded", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "newValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "track", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getRecorder__Terminate(), null, "terminate", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getRecorder__Resume(), null, "resume", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getRecorder__Pause(), null, "pause", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getRecorder__Start(), null, "start", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(recordingsExporterEClass, RecordingsExporter.class, "RecordingsExporter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecordingsExporter_Recordings(), this.getRecordings(), null, "recordings", null, 0, 1, RecordingsExporter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRecordingsExporter__Export__String(), null, "export", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "path", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(csvExporterEClass, CsvExporter.class, "CsvExporter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCsvExporter_IncludeColumnDescription(), theEcorePackage.getEBoolean(), "includeColumnDescription", null, 0, 1, CsvExporter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCsvExporter_IncludeColumnName(), theEcorePackage.getEBoolean(), "includeColumnName", null, 0, 1, CsvExporter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCsvExporter_ColumnSet(), theCsvPackage.getCsvColumnsSet(), null, "columnSet", null, 0, 1, CsvExporter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCsvExporter__ExportToCSVFile__String(), null, "exportToCSVFile", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "exportPath", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(recorderStatusEEnum, RecorderStatus.class, "RecorderStatus");
		addEEnumLiteral(recorderStatusEEnum, RecorderStatus.INITIALIZING);
		addEEnumLiteral(recorderStatusEEnum, RecorderStatus.RECORDING);
		addEEnumLiteral(recorderStatusEEnum, RecorderStatus.PAUSED);
		addEEnumLiteral(recorderStatusEEnum, RecorderStatus.TERMINATED);

		// Initialize data types
		initEDataType(dateListMapEDataType, Map.class, "DateListMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.Map<java.util.Date, org.eclipse.emf.common.util.EList<java.lang.Object>>");

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "prefix", "Recorders",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)",
			 "modelName", "Recorders",
			 "operationReflection", "true",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/org.eclipse.symphony.common.recorders/src-generated",
			 "editDirectory", "/org.eclipse.symphony.common.recorders.edit/src-generated",
			 "basePackage", "ca.gc.space.mrt.common"
		   });	
		addAnnotation
		  (recordingsEClass, 
		   source, 
		   new String[] {
			 "documentation", "Represent a object that is used to stored data generated by a Recorder. This includes the source object (source), the names of the source object\'s features being recorded (tracks), and the actual time tag features values themselves (records)."
		   });	
		addAnnotation
		  (recorderEClass, 
		   source, 
		   new String[] {
			 "documentation", "Represent a object that can monitor an object and record its changes through time."
		   });	
		addAnnotation
		  (getRecorder__IsToBeRecorded__Object_String(), 
		   source, 
		   new String[] {
			 "documentation", "Returns whether or not a new value for a specific track should be recorded or not. This method is intended to be overloaded by users that want to add restriction on what is considered a \"new value\". The default implementation always returns true."
		   });	
		addAnnotation
		  (recordingsExporterEClass, 
		   source, 
		   new String[] {
			 "documentation", "Represent a object that is used to save to file the data acquired by a Recorder."
		   });
	}

} //RecordersPackageImpl
