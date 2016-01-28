/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.TriangularMeshPresentation;
import ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesPackage;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonGeometryData3DUIPackageImpl extends EPackageImpl implements ApogyCommonGeometryData3DUIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianCoordinatesSetPresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triangularMeshPresentationEClass = null;

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
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyCommonGeometryData3DUIPackageImpl() {
		super(eNS_URI, ApogyCommonGeometryData3DUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyCommonGeometryData3DUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyCommonGeometryData3DUIPackage init() {
		if (isInited) return (ApogyCommonGeometryData3DUIPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonGeometryData3DUIPackage.eNS_URI);

		// Obtain or create and register package
		ApogyCommonGeometryData3DUIPackageImpl theApogyCommonGeometryData3DUIPackage = (ApogyCommonGeometryData3DUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCommonGeometryData3DUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCommonGeometryData3DUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCommonTopologyUIPackage.eINSTANCE.eClass();
		ApogyCommonGeometryData3DPackage.eINSTANCE.eClass();
		ApogyCommonImagesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyCommonGeometryData3DUIPackage.createPackageContents();

		// Initialize created meta-data
		theApogyCommonGeometryData3DUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCommonGeometryData3DUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCommonGeometryData3DUIPackage.eNS_URI, theApogyCommonGeometryData3DUIPackage);
		return theApogyCommonGeometryData3DUIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianCoordinatesSetPresentation() {
		return cartesianCoordinatesSetPresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCartesianCoordinatesSetPresentation_PointCloud() {
		return (EReference)cartesianCoordinatesSetPresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCoordinatesSetPresentation_PointSize() {
		return (EAttribute)cartesianCoordinatesSetPresentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCoordinatesSetPresentation_NumberOfPoints() {
		return (EAttribute)cartesianCoordinatesSetPresentationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriangularMeshPresentation() {
		return triangularMeshPresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriangularMeshPresentation_Mesh() {
		return (EReference)triangularMeshPresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriangularMeshPresentation_PointSize() {
		return (EAttribute)triangularMeshPresentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriangularMeshPresentation_NumberOfPoints() {
		return (EAttribute)triangularMeshPresentationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriangularMeshPresentation_NumberOfPolygons() {
		return (EAttribute)triangularMeshPresentationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriangularMeshPresentation_PresentationMode() {
		return (EAttribute)triangularMeshPresentationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriangularMeshPresentation_Transparency() {
		return (EAttribute)triangularMeshPresentationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriangularMeshPresentation_UseShading() {
		return (EAttribute)triangularMeshPresentationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriangularMeshPresentation_TextureImage() {
		return (EReference)triangularMeshPresentationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonGeometryData3DUIFactory getApogyCommonGeometryData3DUIFactory() {
		return (ApogyCommonGeometryData3DUIFactory)getEFactoryInstance();
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
		cartesianCoordinatesSetPresentationEClass = createEClass(CARTESIAN_COORDINATES_SET_PRESENTATION);
		createEReference(cartesianCoordinatesSetPresentationEClass, CARTESIAN_COORDINATES_SET_PRESENTATION__POINT_CLOUD);
		createEAttribute(cartesianCoordinatesSetPresentationEClass, CARTESIAN_COORDINATES_SET_PRESENTATION__POINT_SIZE);
		createEAttribute(cartesianCoordinatesSetPresentationEClass, CARTESIAN_COORDINATES_SET_PRESENTATION__NUMBER_OF_POINTS);

		triangularMeshPresentationEClass = createEClass(TRIANGULAR_MESH_PRESENTATION);
		createEReference(triangularMeshPresentationEClass, TRIANGULAR_MESH_PRESENTATION__MESH);
		createEAttribute(triangularMeshPresentationEClass, TRIANGULAR_MESH_PRESENTATION__POINT_SIZE);
		createEAttribute(triangularMeshPresentationEClass, TRIANGULAR_MESH_PRESENTATION__NUMBER_OF_POINTS);
		createEAttribute(triangularMeshPresentationEClass, TRIANGULAR_MESH_PRESENTATION__NUMBER_OF_POLYGONS);
		createEAttribute(triangularMeshPresentationEClass, TRIANGULAR_MESH_PRESENTATION__PRESENTATION_MODE);
		createEAttribute(triangularMeshPresentationEClass, TRIANGULAR_MESH_PRESENTATION__TRANSPARENCY);
		createEAttribute(triangularMeshPresentationEClass, TRIANGULAR_MESH_PRESENTATION__USE_SHADING);
		createEReference(triangularMeshPresentationEClass, TRIANGULAR_MESH_PRESENTATION__TEXTURE_IMAGE);
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
		ApogyCommonTopologyUIPackage theApogyCommonTopologyUIPackage = (ApogyCommonTopologyUIPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonTopologyUIPackage.eNS_URI);
		ApogyCommonGeometryData3DPackage theApogyCommonGeometryData3DPackage = (ApogyCommonGeometryData3DPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonGeometryData3DPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ApogyCommonImagesPackage theApogyCommonImagesPackage = (ApogyCommonImagesPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonImagesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cartesianCoordinatesSetPresentationEClass.getESuperTypes().add(theApogyCommonTopologyUIPackage.getNodePresentation());
		triangularMeshPresentationEClass.getESuperTypes().add(theApogyCommonTopologyUIPackage.getNodePresentation());

		// Initialize classes, features, and operations; add parameters
		initEClass(cartesianCoordinatesSetPresentationEClass, CartesianCoordinatesSetPresentation.class, "CartesianCoordinatesSetPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCartesianCoordinatesSetPresentation_PointCloud(), theApogyCommonGeometryData3DPackage.getCartesianCoordinatesSet(), null, "pointCloud", null, 0, 1, CartesianCoordinatesSetPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianCoordinatesSetPresentation_PointSize(), theEcorePackage.getEInt(), "pointSize", "1", 0, 1, CartesianCoordinatesSetPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianCoordinatesSetPresentation_NumberOfPoints(), theEcorePackage.getEInt(), "numberOfPoints", null, 0, 1, CartesianCoordinatesSetPresentation.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(triangularMeshPresentationEClass, TriangularMeshPresentation.class, "TriangularMeshPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTriangularMeshPresentation_Mesh(), theApogyCommonGeometryData3DPackage.getCartesianTriangularMesh(), null, "mesh", null, 0, 1, TriangularMeshPresentation.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriangularMeshPresentation_PointSize(), theEcorePackage.getEInt(), "pointSize", "1", 0, 1, TriangularMeshPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriangularMeshPresentation_NumberOfPoints(), theEcorePackage.getEInt(), "numberOfPoints", null, 0, 1, TriangularMeshPresentation.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriangularMeshPresentation_NumberOfPolygons(), theEcorePackage.getEInt(), "numberOfPolygons", null, 0, 1, TriangularMeshPresentation.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriangularMeshPresentation_PresentationMode(), theApogyCommonTopologyUIPackage.getMeshPresentationMode(), "presentationMode", "SURFACE", 0, 1, TriangularMeshPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriangularMeshPresentation_Transparency(), theEcorePackage.getEFloat(), "transparency", null, 0, 1, TriangularMeshPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriangularMeshPresentation_UseShading(), theEcorePackage.getEBoolean(), "useShading", "true", 0, 1, TriangularMeshPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriangularMeshPresentation_TextureImage(), theApogyCommonImagesPackage.getAbstractEImage(), null, "textureImage", null, 0, 1, TriangularMeshPresentation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyCommonGeometryData3DUIPackageImpl
