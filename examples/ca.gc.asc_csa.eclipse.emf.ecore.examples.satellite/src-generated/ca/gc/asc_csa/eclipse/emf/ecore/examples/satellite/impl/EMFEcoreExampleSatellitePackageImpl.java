/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.impl;

import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.EMFEcoreExampleSatelliteFactory;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.EMFEcoreExampleSatellitePackage;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.ImageOrder;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.OrbitalImage;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.Satellite;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.SatelliteCommand;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.SatelliteCommandAcquireImage;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.SatelliteCommandList;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.SatelliteCommandRoll;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.SatelliteConstellation;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.SatelliteConstellationInitializationData;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.SatelliteConstellationTypeApiAdapter;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.SatelliteImager;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.SatelliteInitializationData;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.SatelliteSimulated;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.SatelliteStub;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.SatelliteUtils;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage;
import ca.gc.asc_csa.eclipse.images.core.ImagesCorePackage;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage;
import ca.gc.asc_csa.symphony.environment.orbit.SymphonyOrbitEnvironmentPackage;
import ca.gc.asc_csa.symphony.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage;
import ca.gc.space.mrt.sensors.imaging.MRTSensorsImagingPackage;
import java.util.List;
import java.util.SortedSet;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFEcoreExampleSatellitePackageImpl extends EPackageImpl implements EMFEcoreExampleSatellitePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satelliteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satelliteSimulatedEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satelliteStubEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satelliteCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satelliteCommandListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satelliteCommandRollEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satelliteCommandAcquireImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satelliteImagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orbitalImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satelliteConstellationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satelliteConstellationInitializationDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satelliteConstellationTypeApiAdapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satelliteInitializationDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satelliteUtilsEClass = null;

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
	private EDataType sortedSetEDataType = null;

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
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.EMFEcoreExampleSatellitePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EMFEcoreExampleSatellitePackageImpl() {
		super(eNS_URI, EMFEcoreExampleSatelliteFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EMFEcoreExampleSatellitePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EMFEcoreExampleSatellitePackage init() {
		if (isInited) return (EMFEcoreExampleSatellitePackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcoreExampleSatellitePackage.eNS_URI);

		// Obtain or create and register package
		EMFEcoreExampleSatellitePackageImpl theEMFEcoreExampleSatellitePackage = (EMFEcoreExampleSatellitePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EMFEcoreExampleSatellitePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EMFEcoreExampleSatellitePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SymphonyEarthOrbitEnvironmentPackage.eINSTANCE.eClass();
		MRTSensorsImagingPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEMFEcoreExampleSatellitePackage.createPackageContents();

		// Initialize created meta-data
		theEMFEcoreExampleSatellitePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEMFEcoreExampleSatellitePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EMFEcoreExampleSatellitePackage.eNS_URI, theEMFEcoreExampleSatellitePackage);
		return theEMFEcoreExampleSatellitePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSatellite() {
		return satelliteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSatellite_MaximumRollRate() {
		return (EAttribute)satelliteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSatellite_MaximumRoll() {
		return (EAttribute)satelliteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSatellite_OrbitModel() {
		return (EReference)satelliteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSatellite_Imager() {
		return (EReference)satelliteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSatellite__Roll__double() {
		return satelliteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSatellite__AcquireImage__double() {
		return satelliteEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSatellite__DownloadImages__int() {
		return satelliteEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSatellite__EnqueueSatelliteCommand__SatelliteCommand() {
		return satelliteEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSatelliteSimulated() {
		return satelliteSimulatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSatelliteStub() {
		return satelliteStubEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSatelliteCommand() {
		return satelliteCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSatelliteCommand_Satellite() {
		return (EReference)satelliteCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSatelliteCommand_CommandStartTime() {
		return (EAttribute)satelliteCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSatelliteCommandList() {
		return satelliteCommandListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSatelliteCommandList_Commands() {
		return (EReference)satelliteCommandListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSatelliteCommandRoll() {
		return satelliteCommandRollEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSatelliteCommandRoll_TargetRollAngle() {
		return (EAttribute)satelliteCommandRollEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSatelliteCommandAcquireImage() {
		return satelliteCommandAcquireImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSatelliteCommandAcquireImage_ImageOrder() {
		return (EReference)satelliteCommandAcquireImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageOrder() {
		return imageOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageOrder_OrderId() {
		return (EAttribute)imageOrderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageOrder_Priority() {
		return (EAttribute)imageOrderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageOrder_ImageCenter() {
		return (EReference)imageOrderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageOrder_CommandedZoom() {
		return (EAttribute)imageOrderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSatelliteImager() {
		return satelliteImagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSatelliteImager_Satellite() {
		return (EReference)satelliteImagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSatelliteImager_ImagesAcquired() {
		return (EReference)satelliteImagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSatelliteImager__DownloadImages__int() {
		return satelliteImagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrbitalImage() {
		return orbitalImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrbitalImage_OrderId() {
		return (EAttribute)orbitalImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrbitalImage_ImageCenter() {
		return (EReference)orbitalImageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrbitalImage_DownloadSize() {
		return (EAttribute)orbitalImageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSatelliteConstellation() {
		return satelliteConstellationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSatelliteConstellation_Satellites() {
		return (EReference)satelliteConstellationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSatelliteConstellation_GroundStations() {
		return (EReference)satelliteConstellationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSatelliteConstellation_PendingImageOrders() {
		return (EReference)satelliteConstellationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSatelliteConstellation_StartDate() {
		return (EAttribute)satelliteConstellationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSatelliteConstellation_EndDate() {
		return (EAttribute)satelliteConstellationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSatelliteConstellation__GetSatellite__OrbitModel() {
		return satelliteConstellationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSatelliteConstellation__GetTargetPasses__ImageOrder_Date_Date_ElevationMask() {
		return satelliteConstellationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSatelliteConstellation__GetGroundStationPasses__Satellite_Date_Date_ElevationMask() {
		return satelliteConstellationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSatelliteConstellation__Plan__List_Date_Date() {
		return satelliteConstellationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSatelliteConstellation__Plan__Date_Date() {
		return satelliteConstellationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSatelliteConstellation__Plan() {
		return satelliteConstellationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSatelliteConstellationInitializationData() {
		return satelliteConstellationInitializationDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSatelliteConstellationInitializationData_SatelliteData() {
		return (EReference)satelliteConstellationInitializationDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSatelliteConstellationInitializationData_GroundStations() {
		return (EReference)satelliteConstellationInitializationDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSatelliteConstellationInitializationData_PendingImageOrders() {
		return (EReference)satelliteConstellationInitializationDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSatelliteConstellationTypeApiAdapter() {
		return satelliteConstellationTypeApiAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSatelliteInitializationData() {
		return satelliteInitializationDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSatelliteInitializationData_Satellite() {
		return (EReference)satelliteInitializationDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSatelliteInitializationData_OrbitModel() {
		return (EReference)satelliteInitializationDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSatelliteUtils() {
		return satelliteUtilsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSatelliteUtils__CreateSatelliteCommandRoll__Satellite_Date_double() {
		return satelliteUtilsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSatelliteUtils__CreateSatelliteCommandAcquireImage__Satellite_Date_ImageOrder() {
		return satelliteUtilsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSatelliteUtils__SortImageOrderByPriority__List() {
		return satelliteUtilsEClass.getEOperations().get(2);
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
	public EDataType getSortedSet() {
		return sortedSetEDataType;
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
	public EMFEcoreExampleSatelliteFactory getEMFEcoreExampleSatelliteFactory() {
		return (EMFEcoreExampleSatelliteFactory)getEFactoryInstance();
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
		satelliteEClass = createEClass(SATELLITE);
		createEAttribute(satelliteEClass, SATELLITE__MAXIMUM_ROLL_RATE);
		createEAttribute(satelliteEClass, SATELLITE__MAXIMUM_ROLL);
		createEReference(satelliteEClass, SATELLITE__ORBIT_MODEL);
		createEReference(satelliteEClass, SATELLITE__IMAGER);
		createEOperation(satelliteEClass, SATELLITE___ROLL__DOUBLE);
		createEOperation(satelliteEClass, SATELLITE___ACQUIRE_IMAGE__DOUBLE);
		createEOperation(satelliteEClass, SATELLITE___DOWNLOAD_IMAGES__INT);
		createEOperation(satelliteEClass, SATELLITE___ENQUEUE_SATELLITE_COMMAND__SATELLITECOMMAND);

		satelliteSimulatedEClass = createEClass(SATELLITE_SIMULATED);

		satelliteStubEClass = createEClass(SATELLITE_STUB);

		satelliteCommandEClass = createEClass(SATELLITE_COMMAND);
		createEReference(satelliteCommandEClass, SATELLITE_COMMAND__SATELLITE);
		createEAttribute(satelliteCommandEClass, SATELLITE_COMMAND__COMMAND_START_TIME);

		satelliteCommandListEClass = createEClass(SATELLITE_COMMAND_LIST);
		createEReference(satelliteCommandListEClass, SATELLITE_COMMAND_LIST__COMMANDS);

		satelliteCommandRollEClass = createEClass(SATELLITE_COMMAND_ROLL);
		createEAttribute(satelliteCommandRollEClass, SATELLITE_COMMAND_ROLL__TARGET_ROLL_ANGLE);

		satelliteCommandAcquireImageEClass = createEClass(SATELLITE_COMMAND_ACQUIRE_IMAGE);
		createEReference(satelliteCommandAcquireImageEClass, SATELLITE_COMMAND_ACQUIRE_IMAGE__IMAGE_ORDER);

		imageOrderEClass = createEClass(IMAGE_ORDER);
		createEAttribute(imageOrderEClass, IMAGE_ORDER__ORDER_ID);
		createEAttribute(imageOrderEClass, IMAGE_ORDER__PRIORITY);
		createEReference(imageOrderEClass, IMAGE_ORDER__IMAGE_CENTER);
		createEAttribute(imageOrderEClass, IMAGE_ORDER__COMMANDED_ZOOM);

		satelliteImagerEClass = createEClass(SATELLITE_IMAGER);
		createEReference(satelliteImagerEClass, SATELLITE_IMAGER__SATELLITE);
		createEReference(satelliteImagerEClass, SATELLITE_IMAGER__IMAGES_ACQUIRED);
		createEOperation(satelliteImagerEClass, SATELLITE_IMAGER___DOWNLOAD_IMAGES__INT);

		orbitalImageEClass = createEClass(ORBITAL_IMAGE);
		createEAttribute(orbitalImageEClass, ORBITAL_IMAGE__ORDER_ID);
		createEReference(orbitalImageEClass, ORBITAL_IMAGE__IMAGE_CENTER);
		createEAttribute(orbitalImageEClass, ORBITAL_IMAGE__DOWNLOAD_SIZE);

		satelliteConstellationEClass = createEClass(SATELLITE_CONSTELLATION);
		createEReference(satelliteConstellationEClass, SATELLITE_CONSTELLATION__SATELLITES);
		createEReference(satelliteConstellationEClass, SATELLITE_CONSTELLATION__GROUND_STATIONS);
		createEReference(satelliteConstellationEClass, SATELLITE_CONSTELLATION__PENDING_IMAGE_ORDERS);
		createEAttribute(satelliteConstellationEClass, SATELLITE_CONSTELLATION__START_DATE);
		createEAttribute(satelliteConstellationEClass, SATELLITE_CONSTELLATION__END_DATE);
		createEOperation(satelliteConstellationEClass, SATELLITE_CONSTELLATION___GET_SATELLITE__ORBITMODEL);
		createEOperation(satelliteConstellationEClass, SATELLITE_CONSTELLATION___GET_TARGET_PASSES__IMAGEORDER_DATE_DATE_ELEVATIONMASK);
		createEOperation(satelliteConstellationEClass, SATELLITE_CONSTELLATION___GET_GROUND_STATION_PASSES__SATELLITE_DATE_DATE_ELEVATIONMASK);
		createEOperation(satelliteConstellationEClass, SATELLITE_CONSTELLATION___PLAN__LIST_DATE_DATE);
		createEOperation(satelliteConstellationEClass, SATELLITE_CONSTELLATION___PLAN__DATE_DATE);
		createEOperation(satelliteConstellationEClass, SATELLITE_CONSTELLATION___PLAN);

		satelliteUtilsEClass = createEClass(SATELLITE_UTILS);
		createEOperation(satelliteUtilsEClass, SATELLITE_UTILS___CREATE_SATELLITE_COMMAND_ROLL__SATELLITE_DATE_DOUBLE);
		createEOperation(satelliteUtilsEClass, SATELLITE_UTILS___CREATE_SATELLITE_COMMAND_ACQUIRE_IMAGE__SATELLITE_DATE_IMAGEORDER);
		createEOperation(satelliteUtilsEClass, SATELLITE_UTILS___SORT_IMAGE_ORDER_BY_PRIORITY__LIST);

		satelliteConstellationTypeApiAdapterEClass = createEClass(SATELLITE_CONSTELLATION_TYPE_API_ADAPTER);

		satelliteConstellationInitializationDataEClass = createEClass(SATELLITE_CONSTELLATION_INITIALIZATION_DATA);
		createEReference(satelliteConstellationInitializationDataEClass, SATELLITE_CONSTELLATION_INITIALIZATION_DATA__SATELLITE_DATA);
		createEReference(satelliteConstellationInitializationDataEClass, SATELLITE_CONSTELLATION_INITIALIZATION_DATA__GROUND_STATIONS);
		createEReference(satelliteConstellationInitializationDataEClass, SATELLITE_CONSTELLATION_INITIALIZATION_DATA__PENDING_IMAGE_ORDERS);

		satelliteInitializationDataEClass = createEClass(SATELLITE_INITIALIZATION_DATA);
		createEReference(satelliteInitializationDataEClass, SATELLITE_INITIALIZATION_DATA__SATELLITE);
		createEReference(satelliteInitializationDataEClass, SATELLITE_INITIALIZATION_DATA__ORBIT_MODEL);

		// Create data types
		listEDataType = createEDataType(LIST);
		sortedSetEDataType = createEDataType(SORTED_SET);
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
		EMFEcorePackage theEMFEcorePackage = (EMFEcorePackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		SymphonyOrbitEnvironmentPackage theSymphonyOrbitEnvironmentPackage = (SymphonyOrbitEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyOrbitEnvironmentPackage.eNS_URI);
		SymphonyEnvironmentPackage theSymphonyEnvironmentPackage = (SymphonyEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyEnvironmentPackage.eNS_URI);
		MRTSensorsImagingPackage theMRTSensorsImagingPackage = (MRTSensorsImagingPackage)EPackage.Registry.INSTANCE.getEPackage(MRTSensorsImagingPackage.eNS_URI);
		ImagesCorePackage theImagesCorePackage = (ImagesCorePackage)EPackage.Registry.INSTANCE.getEPackage(ImagesCorePackage.eNS_URI);
		SymphonyEarthOrbitEnvironmentPackage theSymphonyEarthOrbitEnvironmentPackage = (SymphonyEarthOrbitEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyEarthOrbitEnvironmentPackage.eNS_URI);
		EMFEcoreInvocatorPackage theEMFEcoreInvocatorPackage = (EMFEcoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcoreInvocatorPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(listEDataType, "T");
		addETypeParameter(sortedSetEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		satelliteEClass.getESuperTypes().add(theEMFEcorePackage.getNamed());
		satelliteSimulatedEClass.getESuperTypes().add(this.getSatellite());
		satelliteStubEClass.getESuperTypes().add(this.getSatellite());
		satelliteCommandRollEClass.getESuperTypes().add(this.getSatelliteCommand());
		satelliteCommandAcquireImageEClass.getESuperTypes().add(this.getSatelliteCommand());
		satelliteImagerEClass.getESuperTypes().add(theMRTSensorsImagingPackage.getAbstractCamera());
		satelliteImagerEClass.getESuperTypes().add(theMRTSensorsImagingPackage.getZoomable());
		orbitalImageEClass.getESuperTypes().add(theImagesCorePackage.getAbstractEImage());
		satelliteConstellationTypeApiAdapterEClass.getESuperTypes().add(theEMFEcoreInvocatorPackage.getTypeApiAdapter());
		satelliteConstellationInitializationDataEClass.getESuperTypes().add(theEMFEcoreInvocatorPackage.getAbstractInitializationData());
		satelliteInitializationDataEClass.getESuperTypes().add(theEMFEcoreInvocatorPackage.getAbstractInitializationData());

		// Initialize classes, features, and operations; add parameters
		initEClass(satelliteEClass, Satellite.class, "Satellite", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSatellite_MaximumRollRate(), theEcorePackage.getEDouble(), "maximumRollRate", "0.017452778", 0, 1, Satellite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSatellite_MaximumRoll(), theEcorePackage.getEDouble(), "maximumRoll", "0.087", 0, 1, Satellite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSatellite_OrbitModel(), theSymphonyOrbitEnvironmentPackage.getOrbitModel(), null, "orbitModel", null, 0, 1, Satellite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSatellite_Imager(), this.getSatelliteImager(), this.getSatelliteImager_Satellite(), "imager", null, 0, 1, Satellite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getSatellite__Roll__double(), theEcorePackage.getEBoolean(), "roll", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "targetRollAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSatellite__AcquireImage__double(), this.getOrbitalImage(), "acquireImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "zoom", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSatellite__DownloadImages__int(), null, "downloadImages", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "maximumNumberOfImages", 0, 1, !IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(this.getList());
		EGenericType g2 = createEGenericType(this.getOrbitalImage());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getSatellite__EnqueueSatelliteCommand__SatelliteCommand(), theEcorePackage.getEBoolean(), "enqueueSatelliteCommand", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSatelliteCommand(), "command", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(satelliteSimulatedEClass, SatelliteSimulated.class, "SatelliteSimulated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(satelliteStubEClass, SatelliteStub.class, "SatelliteStub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(satelliteCommandEClass, SatelliteCommand.class, "SatelliteCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSatelliteCommand_Satellite(), this.getSatellite(), null, "satellite", null, 0, 1, SatelliteCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSatelliteCommand_CommandStartTime(), theEcorePackage.getEDate(), "commandStartTime", null, 0, 1, SatelliteCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(satelliteCommandListEClass, SatelliteCommandList.class, "SatelliteCommandList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSatelliteCommandList_Commands(), this.getSatelliteCommand(), null, "commands", null, 0, -1, SatelliteCommandList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(satelliteCommandRollEClass, SatelliteCommandRoll.class, "SatelliteCommandRoll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSatelliteCommandRoll_TargetRollAngle(), theEcorePackage.getEDouble(), "targetRollAngle", "0", 0, 1, SatelliteCommandRoll.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(satelliteCommandAcquireImageEClass, SatelliteCommandAcquireImage.class, "SatelliteCommandAcquireImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSatelliteCommandAcquireImage_ImageOrder(), this.getImageOrder(), null, "imageOrder", null, 0, 1, SatelliteCommandAcquireImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageOrderEClass, ImageOrder.class, "ImageOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageOrder_OrderId(), theEcorePackage.getEInt(), "orderId", "-1", 0, 1, ImageOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageOrder_Priority(), theEcorePackage.getEInt(), "priority", "1", 0, 1, ImageOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImageOrder_ImageCenter(), theSymphonyEnvironmentPackage.getGeographicCoordinates(), null, "imageCenter", null, 0, 1, ImageOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageOrder_CommandedZoom(), theEcorePackage.getEDouble(), "commandedZoom", "1.0", 0, 1, ImageOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(satelliteImagerEClass, SatelliteImager.class, "SatelliteImager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSatelliteImager_Satellite(), this.getSatellite(), this.getSatellite_Imager(), "satellite", null, 0, 1, SatelliteImager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSatelliteImager_ImagesAcquired(), this.getOrbitalImage(), null, "imagesAcquired", null, 0, 10, SatelliteImager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSatelliteImager__DownloadImages__int(), null, "downloadImages", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "maximumNumberOfImages", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getOrbitalImage());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(orbitalImageEClass, OrbitalImage.class, "OrbitalImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrbitalImage_OrderId(), theEcorePackage.getEInt(), "orderId", "-1", 0, 1, OrbitalImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrbitalImage_ImageCenter(), theSymphonyEnvironmentPackage.getGeographicCoordinates(), null, "imageCenter", null, 0, 1, OrbitalImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrbitalImage_DownloadSize(), theEcorePackage.getEInt(), "downloadSize", "0", 0, 1, OrbitalImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(satelliteConstellationEClass, SatelliteConstellation.class, "SatelliteConstellation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSatelliteConstellation_Satellites(), this.getSatellite(), null, "satellites", null, 1, -1, SatelliteConstellation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSatelliteConstellation_GroundStations(), theSymphonyEarthOrbitEnvironmentPackage.getGroundStation(), null, "groundStations", null, 1, -1, SatelliteConstellation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSatelliteConstellation_PendingImageOrders(), this.getImageOrder(), null, "pendingImageOrders", null, 0, -1, SatelliteConstellation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSatelliteConstellation_StartDate(), theEcorePackage.getEDate(), "startDate", null, 0, 1, SatelliteConstellation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSatelliteConstellation_EndDate(), theEcorePackage.getEDate(), "endDate", null, 0, 1, SatelliteConstellation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSatelliteConstellation__GetSatellite__OrbitModel(), this.getSatellite(), "getSatellite", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphonyOrbitEnvironmentPackage.getOrbitModel(), "orbitModel", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSatelliteConstellation__GetTargetPasses__ImageOrder_Date_Date_ElevationMask(), null, "getTargetPasses", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getImageOrder(), "imageOrder", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "startDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "endDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphonyEarthOrbitEnvironmentPackage.getElevationMask(), "elevationMask", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(theSymphonyEarthOrbitEnvironmentPackage.getVisibilityPass());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getSatelliteConstellation__GetGroundStationPasses__Satellite_Date_Date_ElevationMask(), null, "getGroundStationPasses", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSatellite(), "satellite", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "startDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "endDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphonyEarthOrbitEnvironmentPackage.getElevationMask(), "elevationMask", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(theSymphonyEarthOrbitEnvironmentPackage.getVisibilityPass());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getSatelliteConstellation__Plan__List_Date_Date(), this.getSatelliteCommandList(), "plan", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getImageOrder());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "imageOrders", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "startDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "endDate", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSatelliteConstellation__Plan__Date_Date(), this.getSatelliteCommandList(), "plan", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "startDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "endDate", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getSatelliteConstellation__Plan(), this.getSatelliteCommandList(), "plan", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(satelliteUtilsEClass, SatelliteUtils.class, "SatelliteUtils", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getSatelliteUtils__CreateSatelliteCommandRoll__Satellite_Date_double(), this.getSatelliteCommandRoll(), "createSatelliteCommandRoll", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSatellite(), "satellite", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "startTime", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "rollAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSatelliteUtils__CreateSatelliteCommandAcquireImage__Satellite_Date_ImageOrder(), this.getSatelliteCommandAcquireImage(), "createSatelliteCommandAcquireImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSatellite(), "satellite", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "imageTime", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getImageOrder(), "imageOrder", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSatelliteUtils__SortImageOrderByPriority__List(), null, "sortImageOrderByPriority", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getImageOrder());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "imageOrders", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(this.getImageOrder());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(satelliteConstellationTypeApiAdapterEClass, SatelliteConstellationTypeApiAdapter.class, "SatelliteConstellationTypeApiAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(satelliteConstellationInitializationDataEClass, SatelliteConstellationInitializationData.class, "SatelliteConstellationInitializationData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSatelliteConstellationInitializationData_SatelliteData(), this.getSatelliteInitializationData(), null, "satelliteData", null, 1, -1, SatelliteConstellationInitializationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSatelliteConstellationInitializationData_GroundStations(), theSymphonyEarthOrbitEnvironmentPackage.getGroundStation(), null, "groundStations", null, 1, -1, SatelliteConstellationInitializationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSatelliteConstellationInitializationData_PendingImageOrders(), this.getImageOrder(), null, "pendingImageOrders", null, 0, -1, SatelliteConstellationInitializationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(satelliteInitializationDataEClass, SatelliteInitializationData.class, "SatelliteInitializationData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSatelliteInitializationData_Satellite(), this.getSatellite(), null, "satellite", null, 0, 1, SatelliteInitializationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSatelliteInitializationData_OrbitModel(), theSymphonyOrbitEnvironmentPackage.getOrbitModel(), null, "orbitModel", null, 0, 1, SatelliteInitializationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sortedSetEDataType, SortedSet.class, "SortedSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
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
			 "prefix", "EMFEcoreExampleSatellite",
			 "copyrightText", "Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)",
			 "modelName", "EMFEcoreExampleSatellite",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.eclipse.emf.ecore.examples"
		   });	
		addAnnotation
		  (satelliteEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nAn example satellite. The satellite is nadir looking, and can roll back and forth (+- 5.0 deg) along its trajectory.\nAn imager is mounted on its nadir axis and can take images of the Earth below."
		   });	
		addAnnotation
		  (getSatellite__Roll__double(), 
		   source, 
		   new String[] {
			 "documentation", "*\nCommands the spacecraft to roll to the specified roll angle, in radians."
		   });	
		addAnnotation
		  (getSatellite__AcquireImage__double(), 
		   source, 
		   new String[] {
			 "documentation", "*\nCommands the spacecraft to acquire an image with a given zoom."
		   });	
		addAnnotation
		  (getSatellite__DownloadImages__int(), 
		   source, 
		   new String[] {
			 "documentation", "*\nCommands the spacecraft to download a number of OrbitalImage."
		   });	
		addAnnotation
		  (getSatellite__EnqueueSatelliteCommand__SatelliteCommand(), 
		   source, 
		   new String[] {
			 "documentation", "*\nEnqueues a command for future execution."
		   });	
		addAnnotation
		  (getSatellite_MaximumRollRate(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe satellite maximum roll rate.",
			 "csa_units", "rad/s"
		   });	
		addAnnotation
		  (getSatellite_MaximumRoll(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe satellite maximum roll.",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getSatellite_OrbitModel(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe Orbit Model defining this satellite orbit around the Earth."
		   });	
		addAnnotation
		  (getSatellite_Imager(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe imager on-board the satellite."
		   });	
		addAnnotation
		  (getSatelliteCommandRoll_TargetRollAngle(), 
		   source, 
		   new String[] {
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (satelliteImagerEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nA specialization of AbstractCamera that is a camera mounted on a satellite."
		   });	
		addAnnotation
		  (getSatelliteImager__DownloadImages__int(), 
		   source, 
		   new String[] {
			 "documentation", "*\nCommand that downloads a specified number of images.\n@param maximumNumberOfImages The maximum number of images to download."
		   });	
		addAnnotation
		  (getSatelliteImager_ImagesAcquired(), 
		   source, 
		   new String[] {
			 "documentation", "*\nList of images stored on-board the imager. Note that when the maximum number of image has been acquired,\nfurther takeImageSnapshot command will be rejected."
		   });	
		addAnnotation
		  (orbitalImageEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nA specialization of AbstractEImage that includes the geographical coordinates of the center of the image."
		   });	
		addAnnotation
		  (getOrbitalImage_ImageCenter(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe GeographicCoordinates of the center of the image."
		   });	
		addAnnotation
		  (getOrbitalImage_DownloadSize(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe image download size, in bytes."
		   });	
		addAnnotation
		  (satelliteConstellationEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nA class representing a constellation of Satellites. It provides basic queries used to schedule\nimage acquisition and upload/downloads from the satellites."
		   });	
		addAnnotation
		  (getSatelliteConstellation__GetSatellite__OrbitModel(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the satellite associated with the specified OrbitModel.\n@param orbitModel The specified OrbitModel.\n@return The Satellite associated with the specified OrbitModel, null if none is found."
		   });	
		addAnnotation
		  (getSatelliteConstellation__GetTargetPasses__ImageOrder_Date_Date_ElevationMask(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the visibility passes for a given ImageOrder.\n@param imageOrder The ImageOrder that needs imaging.\n@param startDate The start date of the period to be queried.\n@param endDate The end date of the period to be queried.\n@param elevationMask The ElevationMask to be used to determine the visibility of satellites by the surface location.\n@return The list of Visibility passes, ordered by start time."
		   });	
		addAnnotation
		  (getSatelliteConstellation__GetGroundStationPasses__Satellite_Date_Date_ElevationMask(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the Ground Station(s) visibility passes for a given Satellite.\n@param satellite The Satellite.\n@param startDate The start date of the period to be queried.\n@param endDate The end date of the period to be queried.\n@param elevationMask The ElevationMask to be used to determine the visibility of satellites by the surface location.\n@return The list of Visibility passes, ordered by start time."
		   });	
		addAnnotation
		  (getSatelliteConstellation__Plan__List_Date_Date(), 
		   source, 
		   new String[] {
			 "documentation", "*\nUsing the pending orders and the current satellite(s) state, creates the list of commands that needs to be uploaded to the satellite(s)."
		   });	
		addAnnotation
		  (getSatelliteConstellation__Plan__Date_Date(), 
		   source, 
		   new String[] {
			 "documentation", "*\nUsing the pending orders and the current satellite(s) state, creates the list of commands that needs to be uploaded to the satellite(s)."
		   });	
		addAnnotation
		  (getSatelliteConstellation__Plan(), 
		   source, 
		   new String[] {
			 "documentation", "*\nUsing the pending orders and the current satellite(s) state, creates the list of commands that needs to be uploaded to the satellite(s)."
		   });	
		addAnnotation
		  (getSatelliteConstellation_Satellites(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe list of satellite(s) available.",
			 "notify", "true",
			 "children", "true",
			 "createChild", "true"
		   });	
		addAnnotation
		  (getSatelliteConstellation_GroundStations(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe list of GroundStation used to communicate with the satellite(s).",
			 "notify", "true",
			 "child", "true",
			 "createChild", "true"
		   });	
		addAnnotation
		  (getSatelliteConstellation_PendingImageOrders(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "child", "true",
			 "createChild", "true"
		   });	
		addAnnotation
		  (satelliteUtilsEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nUtilities class for the Satellite example."
		   });	
		addAnnotation
		  (satelliteConstellationTypeApiAdapterEClass, 
		   source, 
		   new String[] {
			 "documentation", " ----------------------------------------------------------------------\nInvocator support.\n----------------------------------------------------------------------"
		   });	
		addAnnotation
		  (satelliteConstellationInitializationDataEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nInitialization Data representing the state of of a SatelliteConstellation."
		   });	
		addAnnotation
		  (getSatelliteConstellationInitializationData_SatelliteData(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "child", "true",
			 "createChild", "true"
		   });	
		addAnnotation
		  (getSatelliteConstellationInitializationData_GroundStations(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "child", "true",
			 "createChild", "true"
		   });	
		addAnnotation
		  (getSatelliteConstellationInitializationData_PendingImageOrders(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "child", "true",
			 "createChild", "true"
		   });	
		addAnnotation
		  (satelliteInitializationDataEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nInitialization Data representing the state of a Satellite."
		   });
	}

} //EMFEcoreExampleSatellitePackageImpl
