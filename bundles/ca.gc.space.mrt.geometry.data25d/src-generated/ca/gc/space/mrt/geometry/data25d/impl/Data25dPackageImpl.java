/**
 * Canadian Space Agency 2007.
 *
 * $Id: Data25dPackageImpl.java,v 1.8.4.2 2015/05/21 15:51:20 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data25d.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.space.mrt.common.processors.ProcessorsPackage;
import ca.gc.space.mrt.geometry.data.DataPackage;
import ca.gc.space.mrt.geometry.data25d.Coordinates25D;
import ca.gc.space.mrt.geometry.data25d.CoordinatesSet25D;
import ca.gc.space.mrt.geometry.data25d.CoordinatesSet25DFilter;
import ca.gc.space.mrt.geometry.data25d.Data25DIO;
import ca.gc.space.mrt.geometry.data25d.Data25dFactory;
import ca.gc.space.mrt.geometry.data25d.Data25dPackage;
import ca.gc.space.mrt.geometry.data25d.DataFacade;
import ca.gc.space.mrt.geometry.data25d.Mesh25D;
import ca.gc.space.mrt.geometry.data25d.Polygon25D;
import ca.gc.space.mrt.geometry.data25d.VolumetricCoordinatesSet25D;
import ca.gc.space.mrt.geometry.data25d.VolumetricMesh25D;
import ca.gc.space.mrt.geometry.data3d.Data3dPackage;
import java.io.IOException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Data25dPackageImpl extends EPackageImpl implements Data25dPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinates25DEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinatesSet25DEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygon25DEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mesh25DEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumetricCoordinatesSet25DEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumetricMesh25DEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinatesSet25DFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass data25DIOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ioExceptionEDataType = null;

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
	 * @see ca.gc.space.mrt.geometry.data25d.Data25dPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Data25dPackageImpl() {
		super(eNS_URI, Data25dFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Data25dPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Data25dPackage init() {
		if (isInited) return (Data25dPackage)EPackage.Registry.INSTANCE.getEPackage(Data25dPackage.eNS_URI);

		// Obtain or create and register package
		Data25dPackageImpl theData25dPackage = (Data25dPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Data25dPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Data25dPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Data3dPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theData25dPackage.createPackageContents();

		// Initialize created meta-data
		theData25dPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theData25dPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Data25dPackage.eNS_URI, theData25dPackage);
		return theData25dPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinates25D() {
		return coordinates25DEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinates25D_U() {
		return (EAttribute)coordinates25DEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinates25D_V() {
		return (EAttribute)coordinates25DEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinates25D_W() {
		return (EAttribute)coordinates25DEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinatesSet25D() {
		return coordinatesSet25DEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinatesSet25D_EnforceUniqueness() {
		return (EAttribute)coordinatesSet25DEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolygon25D() {
		return polygon25DEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMesh25D() {
		return mesh25DEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVolumetricCoordinatesSet25D()
	{
		return volumetricCoordinatesSet25DEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVolumetricCoordinatesSet25D__GetCartesianPositionCoordinates__Coordinates25D() {
		return volumetricCoordinatesSet25DEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVolumetricMesh25D()
	{
		return volumetricMesh25DEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFacade()
	{
		return dataFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataFacade__CreateCoordinates25D__Coordinates25D() {
		return dataFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataFacade__CreateCoordinates25D__double_double_double() {
		return dataFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataFacade__CreateCartesianCoordinatesSet__VolumetricCoordinatesSet25D() {
		return dataFacadeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinatesSet25DFilter()
	{
		return coordinatesSet25DFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCoordinatesSet25DFilter__CreateCoordinatesSet25D() {
		return coordinatesSet25DFilterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData25DIO() {
		return data25DIOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData25DIO__SaveXYZ__VolumetricCoordinatesSet25D_String() {
		return data25DIOEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData25DIO__LoadXYZ__String() {
		return data25DIOEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIOException() {
		return ioExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data25dFactory getData25dFactory() {
		return (Data25dFactory)getEFactoryInstance();
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
		coordinates25DEClass = createEClass(COORDINATES25_D);
		createEAttribute(coordinates25DEClass, COORDINATES25_D__U);
		createEAttribute(coordinates25DEClass, COORDINATES25_D__V);
		createEAttribute(coordinates25DEClass, COORDINATES25_D__W);

		coordinatesSet25DEClass = createEClass(COORDINATES_SET25_D);
		createEAttribute(coordinatesSet25DEClass, COORDINATES_SET25_D__ENFORCE_UNIQUENESS);

		volumetricCoordinatesSet25DEClass = createEClass(VOLUMETRIC_COORDINATES_SET25_D);
		createEOperation(volumetricCoordinatesSet25DEClass, VOLUMETRIC_COORDINATES_SET25_D___GET_CARTESIAN_POSITION_COORDINATES__COORDINATES25D);

		polygon25DEClass = createEClass(POLYGON25_D);

		mesh25DEClass = createEClass(MESH25_D);

		volumetricMesh25DEClass = createEClass(VOLUMETRIC_MESH25_D);

		coordinatesSet25DFilterEClass = createEClass(COORDINATES_SET25_DFILTER);
		createEOperation(coordinatesSet25DFilterEClass, COORDINATES_SET25_DFILTER___CREATE_COORDINATES_SET25_D);

		dataFacadeEClass = createEClass(DATA_FACADE);
		createEOperation(dataFacadeEClass, DATA_FACADE___CREATE_COORDINATES25_D__COORDINATES25D);
		createEOperation(dataFacadeEClass, DATA_FACADE___CREATE_COORDINATES25_D__DOUBLE_DOUBLE_DOUBLE);
		createEOperation(dataFacadeEClass, DATA_FACADE___CREATE_CARTESIAN_COORDINATES_SET__VOLUMETRICCOORDINATESSET25D);

		data25DIOEClass = createEClass(DATA25_DIO);
		createEOperation(data25DIOEClass, DATA25_DIO___SAVE_XYZ__VOLUMETRICCOORDINATESSET25D_STRING);
		createEOperation(data25DIOEClass, DATA25_DIO___LOAD_XYZ__STRING);

		// Create data types
		ioExceptionEDataType = createEDataType(IO_EXCEPTION);
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
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		Data3dPackage theData3dPackage = (Data3dPackage)EPackage.Registry.INSTANCE.getEPackage(Data3dPackage.eNS_URI);
		ProcessorsPackage theProcessorsPackage = (ProcessorsPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessorsPackage.eNS_URI);

		// Create type parameters
		ETypeParameter coordinatesSet25DFilterEClass_T = addETypeParameter(coordinatesSet25DFilterEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getCoordinatesSet25D());
		coordinatesSet25DFilterEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		coordinates25DEClass.getESuperTypes().add(theDataPackage.getCoordinates());
		g1 = createEGenericType(theDataPackage.getCoordinatesSet());
		EGenericType g2 = createEGenericType(this.getCoordinates25D());
		g1.getETypeArguments().add(g2);
		coordinatesSet25DEClass.getEGenericSuperTypes().add(g1);
		volumetricCoordinatesSet25DEClass.getESuperTypes().add(this.getCoordinatesSet25D());
		g1 = createEGenericType(theDataPackage.getPolygon());
		g2 = createEGenericType(this.getCoordinates25D());
		g1.getETypeArguments().add(g2);
		polygon25DEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theDataPackage.getMesh());
		g2 = createEGenericType(this.getCoordinates25D());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getPolygon25D());
		g1.getETypeArguments().add(g2);
		mesh25DEClass.getEGenericSuperTypes().add(g1);
		volumetricMesh25DEClass.getESuperTypes().add(this.getMesh25D());
		g1 = createEGenericType(theProcessorsPackage.getProcessor());
		g2 = createEGenericType(coordinatesSet25DFilterEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(coordinatesSet25DFilterEClass_T);
		g1.getETypeArguments().add(g2);
		coordinatesSet25DFilterEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(coordinates25DEClass, Coordinates25D.class, "Coordinates25D", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoordinates25D_U(), theEcorePackage.getEDouble(), "u", null, 0, 1, Coordinates25D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoordinates25D_V(), theEcorePackage.getEDouble(), "v", null, 0, 1, Coordinates25D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoordinates25D_W(), theEcorePackage.getEDouble(), "w", null, 0, 1, Coordinates25D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinatesSet25DEClass, CoordinatesSet25D.class, "CoordinatesSet25D", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoordinatesSet25D_EnforceUniqueness(), theEcorePackage.getEBoolean(), "enforceUniqueness", "true", 0, 1, CoordinatesSet25D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(volumetricCoordinatesSet25DEClass, VolumetricCoordinatesSet25D.class, "VolumetricCoordinatesSet25D", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getVolumetricCoordinatesSet25D__GetCartesianPositionCoordinates__Coordinates25D(), theData3dPackage.getCartesianPositionCoordinates(), "getCartesianPositionCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCoordinates25D(), "coordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(polygon25DEClass, Polygon25D.class, "Polygon25D", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mesh25DEClass, Mesh25D.class, "Mesh25D", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(volumetricMesh25DEClass, VolumetricMesh25D.class, "VolumetricMesh25D", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coordinatesSet25DFilterEClass, CoordinatesSet25DFilter.class, "CoordinatesSet25DFilter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getCoordinatesSet25DFilter__CreateCoordinatesSet25D(), null, "createCoordinatesSet25D", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(coordinatesSet25DFilterEClass_T);
		initEOperation(op, g1);

		initEClass(dataFacadeEClass, DataFacade.class, "DataFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getDataFacade__CreateCoordinates25D__Coordinates25D(), this.getCoordinates25D(), "createCoordinates25D", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCoordinates25D(), "coordinates25D", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataFacade__CreateCoordinates25D__double_double_double(), this.getCoordinates25D(), "createCoordinates25D", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "u", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "v", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "w", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataFacade__CreateCartesianCoordinatesSet__VolumetricCoordinatesSet25D(), theData3dPackage.getCartesianCoordinatesSet(), "createCartesianCoordinatesSet", 0, 1, !IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getVolumetricCoordinatesSet25D());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "volumetricCoordinatesSet25D", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(data25DIOEClass, Data25DIO.class, "Data25DIO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getData25DIO__SaveXYZ__VolumetricCoordinatesSet25D_String(), null, "saveXYZ", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVolumetricCoordinatesSet25D(), "points", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "fileName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		op = initEOperation(getData25DIO__LoadXYZ__String(), this.getVolumetricCoordinatesSet25D(), "loadXYZ", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "fileName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		// Initialize data types
		initEDataType(ioExceptionEDataType, IOException.class, "IOException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
			 "prefix", "Data25d",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)",
			 "modelName", "Data25d",
			 "operationReflection", "true",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/ca.gc.space.mrt.geometry.data25d/src-generated",
			 "editDirectory", "/ca.gc.space.mrt.geometry.data25d.edit/src-generated",
			 "basePackage", "ca.gc.space.mrt.geometry"
		   });	
		addAnnotation
		  (coordinates25DEClass, 
		   source, 
		   new String[] {
			 "documentation", "Represent \"2.5 D\" geometry where u and v are the independent variables and w the dependent variable."
		   });	
		addAnnotation
		  (getCoordinatesSet25D_EnforceUniqueness(), 
		   source, 
		   new String[] {
			 "documentation", "When this parameter is set to true, this parameter ensures that all points added are unique.  The drawback is that performance is significantly decreased.  This feature can be bypassed by setting this attribute to false.  Default is true."
		   });
	}

} //Data25dPackageImpl
