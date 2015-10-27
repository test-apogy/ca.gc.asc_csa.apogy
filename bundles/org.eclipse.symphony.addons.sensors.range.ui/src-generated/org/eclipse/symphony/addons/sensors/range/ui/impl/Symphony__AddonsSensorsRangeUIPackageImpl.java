/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.range.ui.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.addons.sensors.range.ui.Symphony__AddonsSensorsRangeUIFactory;
import org.eclipse.symphony.addons.sensors.range.ui.Symphony__AddonsSensorsRangeUIPackage;
import org.eclipse.symphony.common.topology.ui.Symphony__CommonTopologyUIPackage;
import org.eclipse.symphony.addons.sensors.range.ui.RasterScanDataPresentation;
import org.eclipse.symphony.addons.sensors.range.ui.SimpleSonarPresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsSensorsRangeUIPackageImpl extends EPackageImpl implements Symphony__AddonsSensorsRangeUIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rasterScanDataPresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleSonarPresentationEClass = null;

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
	 * @see org.eclipse.symphony.addons.sensors.range.ui.Symphony__AddonsSensorsRangeUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Symphony__AddonsSensorsRangeUIPackageImpl() {
		super(eNS_URI, Symphony__AddonsSensorsRangeUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Symphony__AddonsSensorsRangeUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Symphony__AddonsSensorsRangeUIPackage init() {
		if (isInited) return (Symphony__AddonsSensorsRangeUIPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__AddonsSensorsRangeUIPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__AddonsSensorsRangeUIPackageImpl theSymphony__AddonsSensorsRangeUIPackage = (Symphony__AddonsSensorsRangeUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__AddonsSensorsRangeUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__AddonsSensorsRangeUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Symphony__CommonTopologyUIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__AddonsSensorsRangeUIPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__AddonsSensorsRangeUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__AddonsSensorsRangeUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__AddonsSensorsRangeUIPackage.eNS_URI, theSymphony__AddonsSensorsRangeUIPackage);
		return theSymphony__AddonsSensorsRangeUIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRasterScanDataPresentation() {
		return rasterScanDataPresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRasterScanDataPresentation_FovPresentationMode() {
		return (EAttribute)rasterScanDataPresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRasterScanDataPresentation_FovVisible() {
		return (EAttribute)rasterScanDataPresentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRasterScanDataPresentation_DataVisible() {
		return (EAttribute)rasterScanDataPresentationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleSonarPresentation() {
		return simpleSonarPresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleSonarPresentation_DetectedRangeVisible() {
		return (EAttribute)simpleSonarPresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsSensorsRangeUIFactory getSymphony__AddonsSensorsRangeUIFactory() {
		return (Symphony__AddonsSensorsRangeUIFactory)getEFactoryInstance();
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
		rasterScanDataPresentationEClass = createEClass(RASTER_SCAN_DATA_PRESENTATION);
		createEAttribute(rasterScanDataPresentationEClass, RASTER_SCAN_DATA_PRESENTATION__FOV_PRESENTATION_MODE);
		createEAttribute(rasterScanDataPresentationEClass, RASTER_SCAN_DATA_PRESENTATION__FOV_VISIBLE);
		createEAttribute(rasterScanDataPresentationEClass, RASTER_SCAN_DATA_PRESENTATION__DATA_VISIBLE);

		simpleSonarPresentationEClass = createEClass(SIMPLE_SONAR_PRESENTATION);
		createEAttribute(simpleSonarPresentationEClass, SIMPLE_SONAR_PRESENTATION__DETECTED_RANGE_VISIBLE);
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
		Symphony__CommonTopologyUIPackage theSymphony__CommonTopologyUIPackage = (Symphony__CommonTopologyUIPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonTopologyUIPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rasterScanDataPresentationEClass.getESuperTypes().add(theSymphony__CommonTopologyUIPackage.getNodePresentation());
		simpleSonarPresentationEClass.getESuperTypes().add(theSymphony__CommonTopologyUIPackage.getNodePresentation());

		// Initialize classes, features, and operations; add parameters
		initEClass(rasterScanDataPresentationEClass, RasterScanDataPresentation.class, "RasterScanDataPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRasterScanDataPresentation_FovPresentationMode(), theSymphony__CommonTopologyUIPackage.getMeshPresentationMode(), "fovPresentationMode", "WIREFRAME", 0, 1, RasterScanDataPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRasterScanDataPresentation_FovVisible(), theEcorePackage.getEBoolean(), "fovVisible", "true", 0, 1, RasterScanDataPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRasterScanDataPresentation_DataVisible(), theEcorePackage.getEBoolean(), "dataVisible", "true", 0, 1, RasterScanDataPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleSonarPresentationEClass, SimpleSonarPresentation.class, "SimpleSonarPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleSonarPresentation_DetectedRangeVisible(), theEcorePackage.getEBoolean(), "detectedRangeVisible", "true", 0, 1, SimpleSonarPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Symphony__AddonsSensorsRangeUIPackageImpl
