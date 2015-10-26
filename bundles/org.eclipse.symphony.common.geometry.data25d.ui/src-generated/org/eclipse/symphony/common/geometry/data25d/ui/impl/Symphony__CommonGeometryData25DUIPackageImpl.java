/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data25d.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.common.geometry.data25d.Symphony__CommonGeometryData25DPackage;
import org.eclipse.symphony.common.geometry.data25d.ui.Symphony__CommonGeometryData25DUIFactory;
import org.eclipse.symphony.common.geometry.data25d.ui.Symphony__CommonGeometryData25DUIPackage;
import org.eclipse.symphony.common.geometry.data25d.ui.VolumetricCoordinatesSet25DPresentation;
import org.eclipse.symphony.common.topology.ui.TopologyUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonGeometryData25DUIPackageImpl extends EPackageImpl implements Symphony__CommonGeometryData25DUIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumetricCoordinatesSet25DPresentationEClass = null;

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
	 * @see org.eclipse.symphony.common.geometry.data25d.ui.Symphony__CommonGeometryData25DUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Symphony__CommonGeometryData25DUIPackageImpl() {
		super(eNS_URI, Symphony__CommonGeometryData25DUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Symphony__CommonGeometryData25DUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Symphony__CommonGeometryData25DUIPackage init() {
		if (isInited) return (Symphony__CommonGeometryData25DUIPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonGeometryData25DUIPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__CommonGeometryData25DUIPackageImpl theSymphony__CommonGeometryData25DUIPackage = (Symphony__CommonGeometryData25DUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__CommonGeometryData25DUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__CommonGeometryData25DUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TopologyUIPackage.eINSTANCE.eClass();
		Symphony__CommonGeometryData25DPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__CommonGeometryData25DUIPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__CommonGeometryData25DUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__CommonGeometryData25DUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__CommonGeometryData25DUIPackage.eNS_URI, theSymphony__CommonGeometryData25DUIPackage);
		return theSymphony__CommonGeometryData25DUIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVolumetricCoordinatesSet25DPresentation() {
		return volumetricCoordinatesSet25DPresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVolumetricCoordinatesSet25DPresentation_PointsCloud() {
		return (EReference)volumetricCoordinatesSet25DPresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonGeometryData25DUIFactory getSymphony__CommonGeometryData25DUIFactory() {
		return (Symphony__CommonGeometryData25DUIFactory)getEFactoryInstance();
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
		volumetricCoordinatesSet25DPresentationEClass = createEClass(VOLUMETRIC_COORDINATES_SET25_DPRESENTATION);
		createEReference(volumetricCoordinatesSet25DPresentationEClass, VOLUMETRIC_COORDINATES_SET25_DPRESENTATION__POINTS_CLOUD);
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
		TopologyUIPackage theTopologyUIPackage = (TopologyUIPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyUIPackage.eNS_URI);
		Symphony__CommonGeometryData25DPackage theSymphony__CommonGeometryData25DPackage = (Symphony__CommonGeometryData25DPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonGeometryData25DPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		volumetricCoordinatesSet25DPresentationEClass.getESuperTypes().add(theTopologyUIPackage.getNodePresentation());

		// Initialize classes, features, and operations; add parameters
		initEClass(volumetricCoordinatesSet25DPresentationEClass, VolumetricCoordinatesSet25DPresentation.class, "VolumetricCoordinatesSet25DPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVolumetricCoordinatesSet25DPresentation_PointsCloud(), theSymphony__CommonGeometryData25DPackage.getVolumetricCoordinatesSet25D(), null, "pointsCloud", null, 0, 1, VolumetricCoordinatesSet25DPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Symphony__CommonGeometryData25DUIPackageImpl
