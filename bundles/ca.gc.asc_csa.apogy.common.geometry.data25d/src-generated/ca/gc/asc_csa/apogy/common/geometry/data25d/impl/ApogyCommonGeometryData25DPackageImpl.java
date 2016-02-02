package ca.gc.asc_csa.apogy.common.geometry.data25d.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.common.geometry.data.ApogyCommonGeometryDataPackage;
import ca.gc.asc_csa.apogy.common.geometry.data25d.Coordinates25D;
import ca.gc.asc_csa.apogy.common.geometry.data25d.CoordinatesSet25D;
import ca.gc.asc_csa.apogy.common.geometry.data25d.CoordinatesSet25DFilter;
import ca.gc.asc_csa.apogy.common.geometry.data25d.Data25DIO;
import ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DFactory;
import ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DPackage;
import ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data25d.Mesh25D;
import ca.gc.asc_csa.apogy.common.geometry.data25d.Polygon25D;
import ca.gc.asc_csa.apogy.common.geometry.data25d.VolumetricCoordinatesSet25D;
import ca.gc.asc_csa.apogy.common.geometry.data25d.VolumetricMesh25D;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;
import ca.gc.asc_csa.apogy.common.processors.ApogyCommonProcessorsPackage;
import java.io.IOException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonGeometryData25DPackageImpl extends EPackageImpl implements ApogyCommonGeometryData25DPackage {
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
	private EClass coordinatesSet25DFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyCommonGeometryData25DFacadeEClass = null;

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
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyCommonGeometryData25DPackageImpl() {
		super(eNS_URI, ApogyCommonGeometryData25DFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyCommonGeometryData25DPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyCommonGeometryData25DPackage init() {
		if (isInited) return (ApogyCommonGeometryData25DPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonGeometryData25DPackage.eNS_URI);

		// Obtain or create and register package
		ApogyCommonGeometryData25DPackageImpl theApogyCommonGeometryData25DPackage = (ApogyCommonGeometryData25DPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCommonGeometryData25DPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCommonGeometryData25DPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCommonGeometryData3DPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyCommonGeometryData25DPackage.createPackageContents();

		// Initialize created meta-data
		theApogyCommonGeometryData25DPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCommonGeometryData25DPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCommonGeometryData25DPackage.eNS_URI, theApogyCommonGeometryData25DPackage);
		return theApogyCommonGeometryData25DPackage;
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
	public EClass getApogyCommonGeometryData25DFacade() {
		return apogyCommonGeometryData25DFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonGeometryData25DFacade__CreateCoordinates25D__Coordinates25D() {
		return apogyCommonGeometryData25DFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonGeometryData25DFacade__CreateCoordinates25D__double_double_double() {
		return apogyCommonGeometryData25DFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonGeometryData25DFacade__CreateCartesianCoordinatesSet__VolumetricCoordinatesSet25D() {
		return apogyCommonGeometryData25DFacadeEClass.getEOperations().get(2);
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
	public ApogyCommonGeometryData25DFactory getApogyCommonGeometryData25DFactory() {
		return (ApogyCommonGeometryData25DFactory)getEFactoryInstance();
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

		apogyCommonGeometryData25DFacadeEClass = createEClass(APOGY_COMMON_GEOMETRY_DATA25_DFACADE);
		createEOperation(apogyCommonGeometryData25DFacadeEClass, APOGY_COMMON_GEOMETRY_DATA25_DFACADE___CREATE_COORDINATES25_D__COORDINATES25D);
		createEOperation(apogyCommonGeometryData25DFacadeEClass, APOGY_COMMON_GEOMETRY_DATA25_DFACADE___CREATE_COORDINATES25_D__DOUBLE_DOUBLE_DOUBLE);
		createEOperation(apogyCommonGeometryData25DFacadeEClass, APOGY_COMMON_GEOMETRY_DATA25_DFACADE___CREATE_CARTESIAN_COORDINATES_SET__VOLUMETRICCOORDINATESSET25D);

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
		ApogyCommonGeometryDataPackage theApogyCommonGeometryDataPackage = (ApogyCommonGeometryDataPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonGeometryDataPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ApogyCommonGeometryData3DPackage theApogyCommonGeometryData3DPackage = (ApogyCommonGeometryData3DPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonGeometryData3DPackage.eNS_URI);
		ApogyCommonProcessorsPackage theApogyCommonProcessorsPackage = (ApogyCommonProcessorsPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonProcessorsPackage.eNS_URI);

		// Create type parameters
		ETypeParameter coordinatesSet25DFilterEClass_T = addETypeParameter(coordinatesSet25DFilterEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getCoordinatesSet25D());
		coordinatesSet25DFilterEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		coordinates25DEClass.getESuperTypes().add(theApogyCommonGeometryDataPackage.getCoordinates());
		g1 = createEGenericType(theApogyCommonGeometryDataPackage.getCoordinatesSet());
		EGenericType g2 = createEGenericType(this.getCoordinates25D());
		g1.getETypeArguments().add(g2);
		coordinatesSet25DEClass.getEGenericSuperTypes().add(g1);
		volumetricCoordinatesSet25DEClass.getESuperTypes().add(this.getCoordinatesSet25D());
		g1 = createEGenericType(theApogyCommonGeometryDataPackage.getPolygon());
		g2 = createEGenericType(this.getCoordinates25D());
		g1.getETypeArguments().add(g2);
		polygon25DEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theApogyCommonGeometryDataPackage.getMesh());
		g2 = createEGenericType(this.getCoordinates25D());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getPolygon25D());
		g1.getETypeArguments().add(g2);
		mesh25DEClass.getEGenericSuperTypes().add(g1);
		volumetricMesh25DEClass.getESuperTypes().add(this.getMesh25D());
		g1 = createEGenericType(theApogyCommonProcessorsPackage.getProcessor());
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

		EOperation op = initEOperation(getVolumetricCoordinatesSet25D__GetCartesianPositionCoordinates__Coordinates25D(), theApogyCommonGeometryData3DPackage.getCartesianPositionCoordinates(), "getCartesianPositionCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCoordinates25D(), "coordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(polygon25DEClass, Polygon25D.class, "Polygon25D", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mesh25DEClass, Mesh25D.class, "Mesh25D", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(volumetricMesh25DEClass, VolumetricMesh25D.class, "VolumetricMesh25D", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coordinatesSet25DFilterEClass, CoordinatesSet25DFilter.class, "CoordinatesSet25DFilter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getCoordinatesSet25DFilter__CreateCoordinatesSet25D(), null, "createCoordinatesSet25D", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(coordinatesSet25DFilterEClass_T);
		initEOperation(op, g1);

		initEClass(apogyCommonGeometryData25DFacadeEClass, ApogyCommonGeometryData25DFacade.class, "ApogyCommonGeometryData25DFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getApogyCommonGeometryData25DFacade__CreateCoordinates25D__Coordinates25D(), this.getCoordinates25D(), "createCoordinates25D", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCoordinates25D(), "coordinates25D", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonGeometryData25DFacade__CreateCoordinates25D__double_double_double(), this.getCoordinates25D(), "createCoordinates25D", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "u", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "v", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "w", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonGeometryData25DFacade__CreateCartesianCoordinatesSet__VolumetricCoordinatesSet25D(), theApogyCommonGeometryData3DPackage.getCartesianCoordinatesSet(), "createCartesianCoordinatesSet", 0, 1, !IS_UNIQUE, IS_ORDERED);
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
			 "documentation", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca),\n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "prefix", "ApogyCommonGeometryData25D",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)",
			 "modelName", "ApogyCommonGeometryData25D",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.common.geometry.data25d/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.common.geometry.data25d.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.common.geometry"
		   });	
		addAnnotation
		  (getCoordinatesSet25D_EnforceUniqueness(), 
		   source, 
		   new String[] {
			 "documentation", "When this parameter is set to true, this parameter ensures\nthat all points added are unique.  The drawback is that\nperformance is significantly decreased.  This feature can\nbe bypassed by setting this attribute to false.\nDefault is true."
		   });
	}

} //ApogyCommonGeometryData25DPackageImpl
