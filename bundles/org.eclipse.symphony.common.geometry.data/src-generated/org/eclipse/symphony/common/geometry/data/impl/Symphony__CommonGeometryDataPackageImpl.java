/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data.impl;

import java.util.List;

import javax.vecmath.Vector3d;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.common.geometry.data.Coordinates;
import org.eclipse.symphony.common.geometry.data.CoordinatesSamplingShape;
import org.eclipse.symphony.common.geometry.data.CoordinatesSet;
import org.eclipse.symphony.common.geometry.data.CoordinatesSetShapesSampler;
import org.eclipse.symphony.common.geometry.data.Symphony__CommonGeometryDataFactory;
import org.eclipse.symphony.common.geometry.data.Symphony__CommonGeometryDataPackage;
import org.eclipse.symphony.common.geometry.data.Mesh;
import org.eclipse.symphony.common.geometry.data.MeshCoordinatesShapesSampler;
import org.eclipse.symphony.common.geometry.data.MeshPolygonShapesSampler;
import org.eclipse.symphony.common.geometry.data.Polygon;
import org.eclipse.symphony.common.geometry.data.PolygonSamplingMode;
import org.eclipse.symphony.common.geometry.data.PolygonSamplingShape;
import org.eclipse.symphony.common.geometry.data.SamplingShape;
import org.eclipse.symphony.common.geometry.data.ShapeSamplingMode;
import org.eclipse.symphony.common.processors.Symphony__CommonProcessorsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonGeometryDataPackageImpl extends EPackageImpl implements Symphony__CommonGeometryDataPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinatesSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meshEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass samplingShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinatesSamplingShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonSamplingShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinatesSetShapesSamplerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meshCoordinatesShapesSamplerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meshPolygonShapesSamplerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum shapeSamplingModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum polygonSamplingModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vector3dEDataType = null;

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
	 * @see org.eclipse.symphony.common.geometry.data.Symphony__CommonGeometryDataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Symphony__CommonGeometryDataPackageImpl() {
		super(eNS_URI, Symphony__CommonGeometryDataFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Symphony__CommonGeometryDataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Symphony__CommonGeometryDataPackage init() {
		if (isInited) return (Symphony__CommonGeometryDataPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonGeometryDataPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__CommonGeometryDataPackageImpl theSymphony__CommonGeometryDataPackage = (Symphony__CommonGeometryDataPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__CommonGeometryDataPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__CommonGeometryDataPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Symphony__CommonProcessorsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__CommonGeometryDataPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__CommonGeometryDataPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__CommonGeometryDataPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__CommonGeometryDataPackage.eNS_URI, theSymphony__CommonGeometryDataPackage);
		return theSymphony__CommonGeometryDataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinates() {
		return coordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinatesSet() {
		return coordinatesSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinatesSet_Points() {
		return (EReference)coordinatesSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinatesSet_Normals() {
		return (EAttribute)coordinatesSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolygon() {
		return polygonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolygon_Vertices() {
		return (EReference)polygonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMesh() {
		return meshEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMesh_Polygons() {
		return (EReference)meshEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMesh__GetPolygonNeighbours__Polygon() {
		return meshEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMesh__GetPointNeighbours__Coordinates() {
		return meshEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMesh__GetPolygonsSharingPoint__Coordinates() {
		return meshEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSamplingShape() {
		return samplingShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinatesSamplingShape() {
		return coordinatesSamplingShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCoordinatesSamplingShape__IsInside__Coordinates() {
		return coordinatesSamplingShapeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolygonSamplingShape() {
		return polygonSamplingShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolygonSamplingShape__IsPolygonInside__Polygon() {
		return polygonSamplingShapeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinatesSetShapesSampler() {
		return coordinatesSetShapesSamplerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinatesSetShapesSampler_CoordinatesSamplingShapes() {
		return (EReference)coordinatesSetShapesSamplerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinatesSetShapesSampler_ShapeSamplingMode() {
		return (EAttribute)coordinatesSetShapesSamplerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeshCoordinatesShapesSampler() {
		return meshCoordinatesShapesSamplerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeshCoordinatesShapesSampler_CoordinatesSamplingShapes() {
		return (EReference)meshCoordinatesShapesSamplerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeshCoordinatesShapesSampler_ShapeSamplingMode() {
		return (EAttribute)meshCoordinatesShapesSamplerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeshCoordinatesShapesSampler_PolygonSamplingMode() {
		return (EAttribute)meshCoordinatesShapesSamplerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeshPolygonShapesSampler() {
		return meshPolygonShapesSamplerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeshPolygonShapesSampler_PolygonSamplingShapes() {
		return (EReference)meshPolygonShapesSamplerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeshPolygonShapesSampler_ShapeSamplingMode() {
		return (EAttribute)meshPolygonShapesSamplerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getShapeSamplingMode() {
		return shapeSamplingModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPolygonSamplingMode() {
		return polygonSamplingModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getList() {
		return listEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVector3d() {
		return vector3dEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonGeometryDataFactory getSymphony__CommonGeometryDataFactory() {
		return (Symphony__CommonGeometryDataFactory)getEFactoryInstance();
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
		coordinatesEClass = createEClass(COORDINATES);

		coordinatesSetEClass = createEClass(COORDINATES_SET);
		createEReference(coordinatesSetEClass, COORDINATES_SET__POINTS);
		createEAttribute(coordinatesSetEClass, COORDINATES_SET__NORMALS);

		polygonEClass = createEClass(POLYGON);
		createEReference(polygonEClass, POLYGON__VERTICES);

		meshEClass = createEClass(MESH);
		createEReference(meshEClass, MESH__POLYGONS);
		createEOperation(meshEClass, MESH___GET_POLYGON_NEIGHBOURS__POLYGON);
		createEOperation(meshEClass, MESH___GET_POINT_NEIGHBOURS__COORDINATES);
		createEOperation(meshEClass, MESH___GET_POLYGONS_SHARING_POINT__COORDINATES);

		samplingShapeEClass = createEClass(SAMPLING_SHAPE);

		coordinatesSamplingShapeEClass = createEClass(COORDINATES_SAMPLING_SHAPE);
		createEOperation(coordinatesSamplingShapeEClass, COORDINATES_SAMPLING_SHAPE___IS_INSIDE__COORDINATES);

		polygonSamplingShapeEClass = createEClass(POLYGON_SAMPLING_SHAPE);
		createEOperation(polygonSamplingShapeEClass, POLYGON_SAMPLING_SHAPE___IS_POLYGON_INSIDE__POLYGON);

		coordinatesSetShapesSamplerEClass = createEClass(COORDINATES_SET_SHAPES_SAMPLER);
		createEReference(coordinatesSetShapesSamplerEClass, COORDINATES_SET_SHAPES_SAMPLER__COORDINATES_SAMPLING_SHAPES);
		createEAttribute(coordinatesSetShapesSamplerEClass, COORDINATES_SET_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE);

		meshCoordinatesShapesSamplerEClass = createEClass(MESH_COORDINATES_SHAPES_SAMPLER);
		createEReference(meshCoordinatesShapesSamplerEClass, MESH_COORDINATES_SHAPES_SAMPLER__COORDINATES_SAMPLING_SHAPES);
		createEAttribute(meshCoordinatesShapesSamplerEClass, MESH_COORDINATES_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE);
		createEAttribute(meshCoordinatesShapesSamplerEClass, MESH_COORDINATES_SHAPES_SAMPLER__POLYGON_SAMPLING_MODE);

		meshPolygonShapesSamplerEClass = createEClass(MESH_POLYGON_SHAPES_SAMPLER);
		createEReference(meshPolygonShapesSamplerEClass, MESH_POLYGON_SHAPES_SAMPLER__POLYGON_SAMPLING_SHAPES);
		createEAttribute(meshPolygonShapesSamplerEClass, MESH_POLYGON_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE);

		// Create enums
		shapeSamplingModeEEnum = createEEnum(SHAPE_SAMPLING_MODE);
		polygonSamplingModeEEnum = createEEnum(POLYGON_SAMPLING_MODE);

		// Create data types
		listEDataType = createEDataType(LIST);
		vector3dEDataType = createEDataType(VECTOR3D);
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
		Symphony__CommonProcessorsPackage theSymphony__CommonProcessorsPackage = (Symphony__CommonProcessorsPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonProcessorsPackage.eNS_URI);

		// Create type parameters
		ETypeParameter coordinatesSetEClass_T = addETypeParameter(coordinatesSetEClass, "T");
		ETypeParameter polygonEClass_T = addETypeParameter(polygonEClass, "T");
		ETypeParameter meshEClass_CoordinatesType = addETypeParameter(meshEClass, "CoordinatesType");
		ETypeParameter meshEClass_PolygonType = addETypeParameter(meshEClass, "PolygonType");
		ETypeParameter coordinatesSamplingShapeEClass_T = addETypeParameter(coordinatesSamplingShapeEClass, "T");
		ETypeParameter polygonSamplingShapeEClass_CoordinatesType = addETypeParameter(polygonSamplingShapeEClass, "CoordinatesType");
		ETypeParameter polygonSamplingShapeEClass_PolygonType = addETypeParameter(polygonSamplingShapeEClass, "PolygonType");
		ETypeParameter coordinatesSetShapesSamplerEClass_T = addETypeParameter(coordinatesSetShapesSamplerEClass, "T");
		ETypeParameter meshCoordinatesShapesSamplerEClass_CoordinatesType = addETypeParameter(meshCoordinatesShapesSamplerEClass, "CoordinatesType");
		ETypeParameter meshCoordinatesShapesSamplerEClass_PolygonType = addETypeParameter(meshCoordinatesShapesSamplerEClass, "PolygonType");
		ETypeParameter meshPolygonShapesSamplerEClass_CoordinatesType = addETypeParameter(meshPolygonShapesSamplerEClass, "CoordinatesType");
		ETypeParameter meshPolygonShapesSamplerEClass_PolygonType = addETypeParameter(meshPolygonShapesSamplerEClass, "PolygonType");
		addETypeParameter(listEDataType, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getCoordinates());
		coordinatesSetEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getCoordinates());
		polygonEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getCoordinates());
		meshEClass_CoordinatesType.getEBounds().add(g1);
		g1 = createEGenericType(this.getPolygon());
		EGenericType g2 = createEGenericType(meshEClass_CoordinatesType);
		g1.getETypeArguments().add(g2);
		meshEClass_PolygonType.getEBounds().add(g1);
		g1 = createEGenericType(this.getCoordinates());
		coordinatesSamplingShapeEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getCoordinates());
		polygonSamplingShapeEClass_CoordinatesType.getEBounds().add(g1);
		g1 = createEGenericType(this.getPolygon());
		g2 = createEGenericType(polygonSamplingShapeEClass_CoordinatesType);
		g1.getETypeArguments().add(g2);
		polygonSamplingShapeEClass_PolygonType.getEBounds().add(g1);
		g1 = createEGenericType(this.getCoordinates());
		coordinatesSetShapesSamplerEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getCoordinates());
		meshCoordinatesShapesSamplerEClass_CoordinatesType.getEBounds().add(g1);
		g1 = createEGenericType(this.getPolygon());
		g2 = createEGenericType(meshCoordinatesShapesSamplerEClass_CoordinatesType);
		g1.getETypeArguments().add(g2);
		meshCoordinatesShapesSamplerEClass_PolygonType.getEBounds().add(g1);
		g1 = createEGenericType(this.getCoordinates());
		meshPolygonShapesSamplerEClass_CoordinatesType.getEBounds().add(g1);
		g1 = createEGenericType(this.getPolygon());
		g2 = createEGenericType(meshPolygonShapesSamplerEClass_CoordinatesType);
		g1.getETypeArguments().add(g2);
		meshPolygonShapesSamplerEClass_PolygonType.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(this.getCoordinatesSet());
		g2 = createEGenericType(meshEClass_CoordinatesType);
		g1.getETypeArguments().add(g2);
		meshEClass.getEGenericSuperTypes().add(g1);
		coordinatesSamplingShapeEClass.getESuperTypes().add(this.getSamplingShape());
		polygonSamplingShapeEClass.getESuperTypes().add(this.getSamplingShape());
		g1 = createEGenericType(theSymphony__CommonProcessorsPackage.getProcessor());
		g2 = createEGenericType(this.getCoordinatesSet());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(coordinatesSetShapesSamplerEClass_T);
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(this.getCoordinatesSet());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(coordinatesSetShapesSamplerEClass_T);
		g2.getETypeArguments().add(g3);
		coordinatesSetShapesSamplerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theSymphony__CommonProcessorsPackage.getProcessor());
		g2 = createEGenericType(this.getMesh());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(meshCoordinatesShapesSamplerEClass_CoordinatesType);
		g2.getETypeArguments().add(g3);
		g3 = createEGenericType(meshCoordinatesShapesSamplerEClass_PolygonType);
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(this.getMesh());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(meshCoordinatesShapesSamplerEClass_CoordinatesType);
		g2.getETypeArguments().add(g3);
		g3 = createEGenericType(meshCoordinatesShapesSamplerEClass_PolygonType);
		g2.getETypeArguments().add(g3);
		meshCoordinatesShapesSamplerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theSymphony__CommonProcessorsPackage.getProcessor());
		g2 = createEGenericType(this.getMesh());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(meshPolygonShapesSamplerEClass_CoordinatesType);
		g2.getETypeArguments().add(g3);
		g3 = createEGenericType(meshPolygonShapesSamplerEClass_PolygonType);
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(this.getMesh());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(meshPolygonShapesSamplerEClass_CoordinatesType);
		g2.getETypeArguments().add(g3);
		g3 = createEGenericType(meshPolygonShapesSamplerEClass_PolygonType);
		g2.getETypeArguments().add(g3);
		meshPolygonShapesSamplerEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(coordinatesEClass, Coordinates.class, "Coordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coordinatesSetEClass, CoordinatesSet.class, "CoordinatesSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(coordinatesSetEClass_T);
		initEReference(getCoordinatesSet_Points(), g1, null, "points", null, 0, -1, CoordinatesSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getVector3d());
		g1.getETypeArguments().add(g2);
		initEAttribute(getCoordinatesSet_Normals(), g1, "normals", null, 0, 1, CoordinatesSet.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(polygonEClass, Polygon.class, "Polygon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(polygonEClass_T);
		initEReference(getPolygon_Vertices(), g1, null, "vertices", null, 0, -1, Polygon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(meshEClass, Mesh.class, "Mesh", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(meshEClass_PolygonType);
		initEReference(getMesh_Polygons(), g1, null, "polygons", null, 0, -1, Mesh.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getMesh__GetPolygonNeighbours__Polygon(), null, "getPolygonNeighbours", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(meshEClass_PolygonType);
		addEParameter(op, g1, "polygon", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(meshEClass_PolygonType);
		initEOperation(op, g1);

		op = initEOperation(getMesh__GetPointNeighbours__Coordinates(), null, "getPointNeighbours", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(meshEClass_CoordinatesType);
		addEParameter(op, g1, "point", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(meshEClass_CoordinatesType);
		initEOperation(op, g1);

		op = initEOperation(getMesh__GetPolygonsSharingPoint__Coordinates(), null, "getPolygonsSharingPoint", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(meshEClass_CoordinatesType);
		addEParameter(op, g1, "point", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(meshEClass_PolygonType);
		initEOperation(op, g1);

		initEClass(samplingShapeEClass, SamplingShape.class, "SamplingShape", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coordinatesSamplingShapeEClass, CoordinatesSamplingShape.class, "CoordinatesSamplingShape", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getCoordinatesSamplingShape__IsInside__Coordinates(), theEcorePackage.getEBoolean(), "isInside", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(coordinatesSamplingShapeEClass_T);
		addEParameter(op, g1, "point", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(polygonSamplingShapeEClass, PolygonSamplingShape.class, "PolygonSamplingShape", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getPolygonSamplingShape__IsPolygonInside__Polygon(), theEcorePackage.getEBoolean(), "isPolygonInside", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(polygonSamplingShapeEClass_PolygonType);
		addEParameter(op, g1, "polygon", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(coordinatesSetShapesSamplerEClass, CoordinatesSetShapesSampler.class, "CoordinatesSetShapesSampler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getCoordinatesSamplingShape());
		g2 = createEGenericType(coordinatesSetShapesSamplerEClass_T);
		g1.getETypeArguments().add(g2);
		initEReference(getCoordinatesSetShapesSampler_CoordinatesSamplingShapes(), g1, null, "coordinatesSamplingShapes", null, 0, -1, CoordinatesSetShapesSampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoordinatesSetShapesSampler_ShapeSamplingMode(), this.getShapeSamplingMode(), "shapeSamplingMode", "UNION", 1, 1, CoordinatesSetShapesSampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(meshCoordinatesShapesSamplerEClass, MeshCoordinatesShapesSampler.class, "MeshCoordinatesShapesSampler", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getCoordinatesSamplingShape());
		g2 = createEGenericType(meshCoordinatesShapesSamplerEClass_CoordinatesType);
		g1.getETypeArguments().add(g2);
		initEReference(getMeshCoordinatesShapesSampler_CoordinatesSamplingShapes(), g1, null, "coordinatesSamplingShapes", null, 0, -1, MeshCoordinatesShapesSampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeshCoordinatesShapesSampler_ShapeSamplingMode(), this.getShapeSamplingMode(), "shapeSamplingMode", "UNION", 1, 1, MeshCoordinatesShapesSampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeshCoordinatesShapesSampler_PolygonSamplingMode(), this.getPolygonSamplingMode(), "polygonSamplingMode", "AT_LEAST_ONE_VERTEX", 1, 1, MeshCoordinatesShapesSampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(meshPolygonShapesSamplerEClass, MeshPolygonShapesSampler.class, "MeshPolygonShapesSampler", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getPolygonSamplingShape());
		g2 = createEGenericType(meshPolygonShapesSamplerEClass_CoordinatesType);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(meshPolygonShapesSamplerEClass_PolygonType);
		g1.getETypeArguments().add(g2);
		initEReference(getMeshPolygonShapesSampler_PolygonSamplingShapes(), g1, null, "polygonSamplingShapes", null, 0, -1, MeshPolygonShapesSampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeshPolygonShapesSampler_ShapeSamplingMode(), this.getShapeSamplingMode(), "shapeSamplingMode", "UNION", 1, 1, MeshPolygonShapesSampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(shapeSamplingModeEEnum, ShapeSamplingMode.class, "ShapeSamplingMode");
		addEEnumLiteral(shapeSamplingModeEEnum, ShapeSamplingMode.UNION);
		addEEnumLiteral(shapeSamplingModeEEnum, ShapeSamplingMode.INTERSECTION);

		initEEnum(polygonSamplingModeEEnum, PolygonSamplingMode.class, "PolygonSamplingMode");
		addEEnumLiteral(polygonSamplingModeEEnum, PolygonSamplingMode.ALL_VERTEX);
		addEEnumLiteral(polygonSamplingModeEEnum, PolygonSamplingMode.AT_LEAST_ONE_VERTEX);

		// Initialize data types
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(vector3dEDataType, Vector3d.class, "Vector3d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
			 "prefix", "Symphony__CommonGeometryData",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)",
			 "modelName", "Symphony__CommonGeometryData",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/org.eclipse.symphony.common.geometry.data/src-generated",
			 "editDirectory", "/org.eclipse.symphony.common.geometry.data.edit/src-generated",
			 "basePackage", "org.eclipse.symphony.common.geometry"
		   });
	}

} //Symphony__CommonGeometryDataPackageImpl
