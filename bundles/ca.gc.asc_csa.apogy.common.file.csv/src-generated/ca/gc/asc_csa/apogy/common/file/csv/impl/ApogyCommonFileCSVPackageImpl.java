/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.file.csv.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.common.file.csv.CsvColumn;
import org.eclipse.symphony.common.file.csv.CsvColumnsSet;
import org.eclipse.symphony.common.file.csv.Symphony__CommonFileCSVFactory;
import org.eclipse.symphony.common.file.csv.Symphony__CommonFileCSVPackage;
import org.eclipse.symphony.common.file.csv.CsvValueProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonFileCSVPackageImpl extends EPackageImpl implements Symphony__CommonFileCSVPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csvColumnValuesMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csvColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csvColumnsSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csvValueProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType csvColumnMapEDataType = null;

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
	 * @see org.eclipse.symphony.common.file.csv.Symphony__CommonFileCSVPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Symphony__CommonFileCSVPackageImpl() {
		super(eNS_URI, Symphony__CommonFileCSVFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Symphony__CommonFileCSVPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Symphony__CommonFileCSVPackage init() {
		if (isInited) return (Symphony__CommonFileCSVPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonFileCSVPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__CommonFileCSVPackageImpl theMRTCsvPackage = (Symphony__CommonFileCSVPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__CommonFileCSVPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__CommonFileCSVPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMRTCsvPackage.createPackageContents();

		// Initialize created meta-data
		theMRTCsvPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMRTCsvPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__CommonFileCSVPackage.eNS_URI, theMRTCsvPackage);
		return theMRTCsvPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCsvColumnValuesMap() {
		return csvColumnValuesMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCsvColumnValuesMap_Value() {
		return (EAttribute)csvColumnValuesMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCsvColumnValuesMap_Key() {
		return (EAttribute)csvColumnValuesMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCsvColumn() {
		return csvColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCsvColumn_Values() {
		return (EReference)csvColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCsvColumn_Name() {
		return (EAttribute)csvColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCsvColumn_Description() {
		return (EAttribute)csvColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCsvColumnsSet() {
		return csvColumnsSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCsvColumnsSet_Columns() {
		return (EAttribute)csvColumnsSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCsvColumnsSet_Name() {
		return (EAttribute)csvColumnsSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCsvValueProvider() {
		return csvValueProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCsvValueProvider__GetStringValue__Object() {
		return csvValueProviderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCsvColumnMap() {
		return csvColumnMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonFileCSVFactory getSymphony__CommonFileCSVFactory() {
		return (Symphony__CommonFileCSVFactory)getEFactoryInstance();
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
		csvColumnValuesMapEClass = createEClass(CSV_COLUMN_VALUES_MAP);
		createEAttribute(csvColumnValuesMapEClass, CSV_COLUMN_VALUES_MAP__KEY);
		createEAttribute(csvColumnValuesMapEClass, CSV_COLUMN_VALUES_MAP__VALUE);

		csvColumnEClass = createEClass(CSV_COLUMN);
		createEReference(csvColumnEClass, CSV_COLUMN__VALUES);
		createEAttribute(csvColumnEClass, CSV_COLUMN__NAME);
		createEAttribute(csvColumnEClass, CSV_COLUMN__DESCRIPTION);

		csvColumnsSetEClass = createEClass(CSV_COLUMNS_SET);
		createEAttribute(csvColumnsSetEClass, CSV_COLUMNS_SET__COLUMNS);
		createEAttribute(csvColumnsSetEClass, CSV_COLUMNS_SET__NAME);

		csvValueProviderEClass = createEClass(CSV_VALUE_PROVIDER);
		createEOperation(csvValueProviderEClass, CSV_VALUE_PROVIDER___GET_STRING_VALUE__OBJECT);

		// Create data types
		csvColumnMapEDataType = createEDataType(CSV_COLUMN_MAP);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(csvColumnValuesMapEClass, Map.Entry.class, "CsvColumnValuesMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCsvColumnValuesMap_Key(), theEcorePackage.getEInt(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCsvColumnValuesMap_Value(), theEcorePackage.getEJavaObject(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csvColumnEClass, CsvColumn.class, "CsvColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCsvColumn_Values(), this.getCsvColumnValuesMap(), null, "values", null, 0, 1, CsvColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCsvColumn_Name(), theEcorePackage.getEString(), "name", null, 0, 1, CsvColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCsvColumn_Description(), theEcorePackage.getEString(), "description", null, 0, 1, CsvColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csvColumnsSetEClass, CsvColumnsSet.class, "CsvColumnsSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCsvColumnsSet_Columns(), this.getCsvColumnMap(), "columns", null, 0, 1, CsvColumnsSet.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCsvColumnsSet_Name(), theEcorePackage.getEString(), "name", null, 0, 1, CsvColumnsSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csvValueProviderEClass, CsvValueProvider.class, "CsvValueProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getCsvValueProvider__GetStringValue__Object(), theEcorePackage.getEString(), "getStringValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "obj", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(csvColumnMapEDataType, Map.class, "CsvColumnMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.Map<java.lang.String, org.eclipse.symphony.common.file.csv.CsvColumn>");

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
			 "prefix", "MRTCsv",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)",
			 "modelName", "MRTCsv",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/org.eclipse.symphony.common.file.csv/src-generated",
			 "editDirectory", "/org.eclipse.symphony.common.file.csv.edit/src-generated",
			 "basePackage", "ca.gc.space.mrt.common"
		   });
	}

} //Symphony__CommonFileCSVPackageImpl
