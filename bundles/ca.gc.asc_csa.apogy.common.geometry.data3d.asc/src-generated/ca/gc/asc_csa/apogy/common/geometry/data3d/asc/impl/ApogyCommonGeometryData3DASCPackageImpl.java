/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.asc.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage;
import org.eclipse.symphony.common.geometry.data3d.asc.ASCHeaderData;
import org.eclipse.symphony.common.geometry.data3d.asc.AltitudeMode;
import org.eclipse.symphony.common.geometry.data3d.asc.Coordinates2D;
import org.eclipse.symphony.common.geometry.data3d.asc.Symphony__CommonGeometryData3DASCFactory;
import org.eclipse.symphony.common.geometry.data3d.asc.Symphony__CommonGeometryData3DASCPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonGeometryData3DASCPackageImpl extends EPackageImpl implements Symphony__CommonGeometryData3DASCPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asc3DIOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ascHeaderDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinates2DEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum altitudeModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exceptionEDataType = null;

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
	 * @see org.eclipse.symphony.common.geometry.data3d.asc.Symphony__CommonGeometryData3DASCPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Symphony__CommonGeometryData3DASCPackageImpl() {
		super(eNS_URI, Symphony__CommonGeometryData3DASCFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Symphony__CommonGeometryData3DASCPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Symphony__CommonGeometryData3DASCPackage init() {
		if (isInited) return (Symphony__CommonGeometryData3DASCPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonGeometryData3DASCPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__CommonGeometryData3DASCPackageImpl theSymphony__CommonGeometryData3DASCPackage = (Symphony__CommonGeometryData3DASCPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__CommonGeometryData3DASCPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__CommonGeometryData3DASCPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Symphony__CommonGeometryData3DPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__CommonGeometryData3DASCPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__CommonGeometryData3DASCPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__CommonGeometryData3DASCPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__CommonGeometryData3DASCPackage.eNS_URI, theSymphony__CommonGeometryData3DASCPackage);
		return theSymphony__CommonGeometryData3DASCPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getASC3DIO() {
		return asc3DIOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getASC3DIO__LoadDigitalElevationMap__String_AltitudeMode() {
		return asc3DIOEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getASC3DIO__LoadDigitalElevationMap__String_AltitudeMode_double() {
		return asc3DIOEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getASC3DIO__LoadDigitalElevationMap__String_AltitudeMode_Coordinates2D_Coordinates2D() {
		return asc3DIOEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getASC3DIO__LoadDigitalElevationMap__String_AltitudeMode_Coordinates2D_Coordinates2D_double() {
		return asc3DIOEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getASC3DIO__LoadTriangularMesh__String_AltitudeMode() {
		return asc3DIOEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getASC3DIO__LoadTriangularMesh__String_AltitudeMode_double() {
		return asc3DIOEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getASC3DIO__LoadTriangularMesh__String_AltitudeMode_Coordinates2D_Coordinates2D() {
		return asc3DIOEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getASC3DIO__LoadTriangularMesh__String_AltitudeMode_Coordinates2D_Coordinates2D_double() {
		return asc3DIOEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getASCHeaderData() {
		return ascHeaderDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getASCHeaderData_NumberOfRow() {
		return (EAttribute)ascHeaderDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getASCHeaderData_NumberOfColumns() {
		return (EAttribute)ascHeaderDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getASCHeaderData_XllCenter() {
		return (EAttribute)ascHeaderDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getASCHeaderData_YllCenter() {
		return (EAttribute)ascHeaderDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getASCHeaderData_CellSize() {
		return (EAttribute)ascHeaderDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getASCHeaderData_NoDataValue() {
		return (EAttribute)ascHeaderDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinates2D() {
		return coordinates2DEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinates2D_X() {
		return (EAttribute)coordinates2DEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinates2D_Y() {
		return (EAttribute)coordinates2DEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAltitudeMode() {
		return altitudeModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getException() {
		return exceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonGeometryData3DASCFactory getSymphony__CommonGeometryData3DASCFactory() {
		return (Symphony__CommonGeometryData3DASCFactory)getEFactoryInstance();
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
		asc3DIOEClass = createEClass(ASC3DIO);
		createEOperation(asc3DIOEClass, ASC3DIO___LOAD_DIGITAL_ELEVATION_MAP__STRING_ALTITUDEMODE);
		createEOperation(asc3DIOEClass, ASC3DIO___LOAD_DIGITAL_ELEVATION_MAP__STRING_ALTITUDEMODE_DOUBLE);
		createEOperation(asc3DIOEClass, ASC3DIO___LOAD_DIGITAL_ELEVATION_MAP__STRING_ALTITUDEMODE_COORDINATES2D_COORDINATES2D);
		createEOperation(asc3DIOEClass, ASC3DIO___LOAD_DIGITAL_ELEVATION_MAP__STRING_ALTITUDEMODE_COORDINATES2D_COORDINATES2D_DOUBLE);
		createEOperation(asc3DIOEClass, ASC3DIO___LOAD_TRIANGULAR_MESH__STRING_ALTITUDEMODE);
		createEOperation(asc3DIOEClass, ASC3DIO___LOAD_TRIANGULAR_MESH__STRING_ALTITUDEMODE_DOUBLE);
		createEOperation(asc3DIOEClass, ASC3DIO___LOAD_TRIANGULAR_MESH__STRING_ALTITUDEMODE_COORDINATES2D_COORDINATES2D);
		createEOperation(asc3DIOEClass, ASC3DIO___LOAD_TRIANGULAR_MESH__STRING_ALTITUDEMODE_COORDINATES2D_COORDINATES2D_DOUBLE);

		ascHeaderDataEClass = createEClass(ASC_HEADER_DATA);
		createEAttribute(ascHeaderDataEClass, ASC_HEADER_DATA__NUMBER_OF_ROW);
		createEAttribute(ascHeaderDataEClass, ASC_HEADER_DATA__NUMBER_OF_COLUMNS);
		createEAttribute(ascHeaderDataEClass, ASC_HEADER_DATA__XLL_CENTER);
		createEAttribute(ascHeaderDataEClass, ASC_HEADER_DATA__YLL_CENTER);
		createEAttribute(ascHeaderDataEClass, ASC_HEADER_DATA__CELL_SIZE);
		createEAttribute(ascHeaderDataEClass, ASC_HEADER_DATA__NO_DATA_VALUE);

		coordinates2DEClass = createEClass(COORDINATES2_D);
		createEAttribute(coordinates2DEClass, COORDINATES2_D__X);
		createEAttribute(coordinates2DEClass, COORDINATES2_D__Y);

		// Create enums
		altitudeModeEEnum = createEEnum(ALTITUDE_MODE);

		// Create data types
		exceptionEDataType = createEDataType(EXCEPTION);
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
		Symphony__CommonGeometryData3DPackage theSymphony__CommonGeometryData3DPackage = (Symphony__CommonGeometryData3DPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonGeometryData3DPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(asc3DIOEClass, org.eclipse.symphony.common.geometry.data3d.asc.ASC3DIO.class, "ASC3DIO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getASC3DIO__LoadDigitalElevationMap__String_AltitudeMode(), theSymphony__CommonGeometryData3DPackage.getDigitalElevationMap(), "loadDigitalElevationMap", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "file", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAltitudeMode(), "altitudeMode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getASC3DIO__LoadDigitalElevationMap__String_AltitudeMode_double(), theSymphony__CommonGeometryData3DPackage.getDigitalElevationMap(), "loadDigitalElevationMap", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "file", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAltitudeMode(), "altitudeMode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "targetResolution", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getASC3DIO__LoadDigitalElevationMap__String_AltitudeMode_Coordinates2D_Coordinates2D(), theSymphony__CommonGeometryData3DPackage.getDigitalElevationMap(), "loadDigitalElevationMap", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "file", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAltitudeMode(), "altitudeMode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCoordinates2D(), "southWestCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCoordinates2D(), "northEastCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getASC3DIO__LoadDigitalElevationMap__String_AltitudeMode_Coordinates2D_Coordinates2D_double(), theSymphony__CommonGeometryData3DPackage.getDigitalElevationMap(), "loadDigitalElevationMap", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "file", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAltitudeMode(), "altitudeMode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCoordinates2D(), "southWestCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCoordinates2D(), "northEastCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "targetResolution", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getASC3DIO__LoadTriangularMesh__String_AltitudeMode(), theSymphony__CommonGeometryData3DPackage.getCartesianTriangularMesh(), "loadTriangularMesh", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "file", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAltitudeMode(), "altitudeMode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getASC3DIO__LoadTriangularMesh__String_AltitudeMode_double(), theSymphony__CommonGeometryData3DPackage.getCartesianTriangularMesh(), "loadTriangularMesh", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "file", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAltitudeMode(), "altitudeMode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "targetResolution", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getASC3DIO__LoadTriangularMesh__String_AltitudeMode_Coordinates2D_Coordinates2D(), theSymphony__CommonGeometryData3DPackage.getCartesianTriangularMesh(), "loadTriangularMesh", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "file", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAltitudeMode(), "altitudeMode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCoordinates2D(), "southWestCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCoordinates2D(), "northEastCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getASC3DIO__LoadTriangularMesh__String_AltitudeMode_Coordinates2D_Coordinates2D_double(), theSymphony__CommonGeometryData3DPackage.getCartesianTriangularMesh(), "loadTriangularMesh", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "file", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAltitudeMode(), "altitudeMode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCoordinates2D(), "southWestCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCoordinates2D(), "northEastCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "targetResolution", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		initEClass(ascHeaderDataEClass, ASCHeaderData.class, "ASCHeaderData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getASCHeaderData_NumberOfRow(), theEcorePackage.getEInt(), "numberOfRow", "0", 0, 1, ASCHeaderData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getASCHeaderData_NumberOfColumns(), theEcorePackage.getEInt(), "numberOfColumns", "0", 0, 1, ASCHeaderData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getASCHeaderData_XllCenter(), theEcorePackage.getEDouble(), "xllCenter", "0.0", 0, 1, ASCHeaderData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getASCHeaderData_YllCenter(), theEcorePackage.getEDouble(), "yllCenter", "0.0", 0, 1, ASCHeaderData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getASCHeaderData_CellSize(), theEcorePackage.getEDouble(), "cellSize", "0.0", 0, 1, ASCHeaderData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getASCHeaderData_NoDataValue(), theEcorePackage.getEDouble(), "noDataValue", "-9999", 0, 1, ASCHeaderData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinates2DEClass, Coordinates2D.class, "Coordinates2D", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoordinates2D_X(), theEcorePackage.getEDouble(), "x", null, 0, 1, Coordinates2D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoordinates2D_Y(), theEcorePackage.getEDouble(), "y", null, 0, 1, Coordinates2D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(altitudeModeEEnum, AltitudeMode.class, "AltitudeMode");
		addEEnumLiteral(altitudeModeEEnum, AltitudeMode.ABSOLUTE);
		addEEnumLiteral(altitudeModeEEnum, AltitudeMode.RELATIVE_TO_AVERAGE);
		addEEnumLiteral(altitudeModeEEnum, AltitudeMode.RELATIVE_TO_CENTER);
		addEEnumLiteral(altitudeModeEEnum, AltitudeMode.RELATIVE_TO_SOUTH_WEST_CORNER);
		addEEnumLiteral(altitudeModeEEnum, AltitudeMode.RELATIVE_TO_NORTH_EAST_CORNER);

		// Initialize data types
		initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
			 "prefix", "Symphony__CommonGeometryData3DASC",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)",
			 "modelName", "Symphony__CommonGeometryData3DASC",
			 "complianceLevel", "6.0",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/org.eclipse.symphony.common.geometry.data3d.asc/src-generated",
			 "editDirectory", "/org.eclipse.symphony.common.geometry.data3d.asc.edit/src-generated",
			 "testsDirectory", "/org.eclipse.symphony.common.geometry.data3d.asc.tests/src-generated",
			 "basePackage", "org.eclipse.symphony.common.geometry.data3d"
		   });	
		addAnnotation
		  (asc3DIOEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nThis class is used to load DEM from .asc files found on the Utah DEM Repository. Each file covers a large area (20 km X 20 km)\nand the name of the file is a U.S. National Grid (USNG) identifier. The location of the south-west corner of the tile can be\nfound from  the identifier (see USGN to Geodetic). The data in the file is define however from the north-west corner. Each\nrow in the file is order west to east, and the row are ordered north to south.\n@see Utah DEM Repository http://mapserv.utah.gov/raster/?cat=5%20Meter%20{DEM}\n@see USGN to Geodetic http://www.ngs.noaa.gov/cgi-bin/usng_getgp.prl"
		   });	
		addAnnotation
		  (getASC3DIO__LoadDigitalElevationMap__String_AltitudeMode(), 
		   source, 
		   new String[] {
			 "documentation", "Method that loads the entire DigitalElevationMap from a .asc file.\n@param file The file path.\n@param altitudeMode The Altitude mode to use to offset the altitude values.\n@return The DigitalElevationMap. The x axis is along the west-east direction, positive toward the west. The y axis\nis along the north-south axis, positive toward north."
		   });	
		addAnnotation
		  (getASC3DIO__LoadDigitalElevationMap__String_AltitudeMode_double(), 
		   source, 
		   new String[] {
			 "documentation", "Method that loads the entire DigitalElevationMap from a .asc file.\n@param file The file path.\n@param altitudeMode The Altitude mode to use to offset the altitude values.\n@param targetResolution The grid output resolution required (in meters)\n@return The DigitalElevationMap. The x axis is along the west-east direction, positive toward the west. The y axis\nis along the north-south axis, positive toward north."
		   });	
		addAnnotation
		  (getASC3DIO__LoadDigitalElevationMap__String_AltitudeMode_Coordinates2D_Coordinates2D(), 
		   source, 
		   new String[] {
			 "documentation", "Loads a sub-area DigitalElevationMap from a .asc file.\n@param file The file path.\n@param altitudeMode The Altitude mode to use to offset the altitude values.\n@param southWestCorner The coordinates of the south-west corner of the sub-area relative to the south-west corner of the tile.\n@param northEastCorner The coordinates of the north-east corner of the sub-area relative to the south-west corner of the tile.\n@return The DigitalElevationMap. The x axis is along the west-east direction, positive toward the west. The y axis\nis along the north-south axis, positive toward north."
		   });	
		addAnnotation
		  (getASC3DIO__LoadDigitalElevationMap__String_AltitudeMode_Coordinates2D_Coordinates2D_double(), 
		   source, 
		   new String[] {
			 "documentation", "Loads a sub-area DigitalElevationMap from a .asc file.\n@param file The file path.\n@param altitudeMode The Altitude mode to use to offset the altitude values.\n@param southWestCorner The coordinates of the south-west corner of the sub-area relative to the south-west corner of the tile.\n@param northEastCorner The coordinates of the north-east corner of the sub-area relative to the south-west corner of the tile.\n@param targetResolution The grid output resolution required (in meters)\n@return The DigitalElevationMap. The x axis is along the west-east direction, positive toward the west. The y axis\nis along the north-south axis, positive toward north."
		   });	
		addAnnotation
		  (getASC3DIO__LoadTriangularMesh__String_AltitudeMode(), 
		   source, 
		   new String[] {
			 "documentation", "Method that loads the entire .asc file and meshes is.\n@param file The file path.\n@param altitudeMode The Altitude mode to use to offset the altitude values.\n@return The CartesianTriangularMesh. The x axis is along the west-east direction, positive toward the west. The y axis\nis along the north-south axis, positive toward north."
		   });	
		addAnnotation
		  (getASC3DIO__LoadTriangularMesh__String_AltitudeMode_double(), 
		   source, 
		   new String[] {
			 "documentation", "Method that loads the entire .asc file and meshes is.\n@param file The file path.\n@param altitudeMode The Altitude mode to use to offset the altitude values.\n@param targetResolution The grid output resolution required (in meters)\n@return The CartesianTriangularMesh. The x axis is along the west-east direction, positive toward the west. The y axis\nis along the north-south axis, positive toward north."
		   });	
		addAnnotation
		  (getASC3DIO__LoadTriangularMesh__String_AltitudeMode_Coordinates2D_Coordinates2D(), 
		   source, 
		   new String[] {
			 "documentation", "Method that loads a sub-area from an .asc file and meshes is.\n@param file The file path.\n@param altitudeMode The Altitude mode to use to offset the altitude values.\n@param southWestCorner The coordinates of the south-west corner of the sub-area relative to the south-west corner of the tile.\n@param northEastCorner The coordinates of the north-east corner of the sub-area relative to the south-west corner of the tile.\n@return The CartesianTriangularMesh. The x axis is along the west-east direction, positive toward the west. The y axis\nis along the north-south axis, positive toward north."
		   });	
		addAnnotation
		  (getASC3DIO__LoadTriangularMesh__String_AltitudeMode_Coordinates2D_Coordinates2D_double(), 
		   source, 
		   new String[] {
			 "documentation", "Method that loads a sub-area from an .asc file and meshes is.\n@param file The file path.\n@param altitudeMode The Altitude mode to use to offset the altitude values.\n@param southWestCorner The coordinates of the south-west corner of the sub-area relative to the south-west corner of the tile.\n@param northEastCorner The coordinates of the north-east corner of the sub-area relative to the south-west corner of the tile.\n@return The CartesianTriangularMesh. The x axis is along the west-east direction, positive toward the west. The y axis\nis along the north-south axis, positive toward north."
		   });	
		addAnnotation
		  (ascHeaderDataEClass, 
		   source, 
		   new String[] {
			 "documentation", "Class representing a ASC file header."
		   });	
		addAnnotation
		  (getASCHeaderData_CellSize(), 
		   source, 
		   new String[] {
			 "symphony_units", "m"
		   });	
		addAnnotation
		  (altitudeModeEEnum, 
		   source, 
		   new String[] {
			 "documentation", "Represents the various mode that can be used to generate the elevation in the DigitalElevationMap from the .asc file."
		   });	
		addAnnotation
		  (altitudeModeEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "documentation", " Use the absolute altitude as is."
		   });	
		addAnnotation
		  (altitudeModeEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "documentation", " Refers the altitude to the map average altitude."
		   });	
		addAnnotation
		  (altitudeModeEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "documentation", " Refers the altitude relative to the altitude of the center of the map."
		   });	
		addAnnotation
		  (altitudeModeEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "documentation", " Refers the altitude relative to the altitude of the South-West corner of the map."
		   });	
		addAnnotation
		  (altitudeModeEEnum.getELiterals().get(4), 
		   source, 
		   new String[] {
			 "documentation", " Refers the altitude relative to the altitude of the North-East corner of the map."
		   });	
		addAnnotation
		  (coordinates2DEClass, 
		   source, 
		   new String[] {
			 "documentation", "Class representing a 2D location."
		   });	
		addAnnotation
		  (getCoordinates2D_X(), 
		   source, 
		   new String[] {
			 "symphony_units", "m"
		   });	
		addAnnotation
		  (getCoordinates2D_Y(), 
		   source, 
		   new String[] {
			 "symphony_units", "m"
		   });
	}

} //Symphony__CommonGeometryData3DASCPackageImpl
