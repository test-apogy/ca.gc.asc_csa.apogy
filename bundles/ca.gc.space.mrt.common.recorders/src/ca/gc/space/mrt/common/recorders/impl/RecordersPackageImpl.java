/**
 * Canadian Space Agency 2007.
 *
 * $Id: RecordersPackageImpl.java,v 1.3.4.2 2015/05/21 15:50:02 pallard Exp $
 */
package ca.gc.space.mrt.common.recorders.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import ca.gc.space.mrt.common.csv.CsvPackage;
import ca.gc.space.mrt.common.processors.ProcessorsPackage;
import ca.gc.space.mrt.common.recorders.CsvExporter;
import ca.gc.space.mrt.common.recorders.Recorder;
import ca.gc.space.mrt.common.recorders.RecorderStatus;
import ca.gc.space.mrt.common.recorders.RecordersFactory;
import ca.gc.space.mrt.common.recorders.RecordersPackage;
import ca.gc.space.mrt.common.recorders.Recordings;
import ca.gc.space.mrt.common.recorders.RecordingsExporter;

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
	public static final String copyright = "Canadian Space Agency 2007.";

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
	 * @see ca.gc.space.mrt.common.recorders.RecordersPackage#eNS_URI
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
		initEReference(getRecordings_Source(), ecorePackage.getEObject(), null, "source", null, 0, 1, Recordings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEDate());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEEList());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(ecorePackage.getEJavaObject());
		g2.getETypeArguments().add(g3);
		initEAttribute(getRecordings_Records(), g1, "records", null, 1, 1, Recordings.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecordings_Tracks(), theEcorePackage.getEString(), "tracks", null, 0, -1, Recordings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recorderEClass, Recorder.class, "Recorder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecorder_Status(), this.getRecorderStatus(), "status", null, 1, 1, Recorder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getRecorder__IsToBeRecorded__Object_String(), theEcorePackage.getEBoolean(), "isToBeRecorded", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "newValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "track", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRecorder__Terminate(), null, "terminate", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRecorder__Resume(), null, "resume", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRecorder__Pause(), null, "pause", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRecorder__Start(), null, "start", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(recordingsExporterEClass, RecordingsExporter.class, "RecordingsExporter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecordingsExporter_Recordings(), this.getRecordings(), null, "recordings", null, 0, 1, RecordingsExporter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRecordingsExporter__Export__String(), null, "export", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "path", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(csvExporterEClass, CsvExporter.class, "CsvExporter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCsvExporter_IncludeColumnDescription(), theEcorePackage.getEBoolean(), "includeColumnDescription", null, 1, 1, CsvExporter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCsvExporter_IncludeColumnName(), ecorePackage.getEBoolean(), "includeColumnName", null, 1, 1, CsvExporter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCsvExporter_ColumnSet(), theCsvPackage.getCsvColumsSet(), null, "columnSet", null, 1, 1, CsvExporter.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCsvExporter__ExportToCSVFile__String(), null, "exportToCSVFile", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "exportPath", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(recorderStatusEEnum, RecorderStatus.class, "RecorderStatus");
		addEEnumLiteral(recorderStatusEEnum, RecorderStatus.INITIALIZING);
		addEEnumLiteral(recorderStatusEEnum, RecorderStatus.RECORDING);
		addEEnumLiteral(recorderStatusEEnum, RecorderStatus.PAUSED);
		addEEnumLiteral(recorderStatusEEnum, RecorderStatus.TEMINATED);

		// Create resource
		createResource(eNS_URI);
	}

} //RecordersPackageImpl
