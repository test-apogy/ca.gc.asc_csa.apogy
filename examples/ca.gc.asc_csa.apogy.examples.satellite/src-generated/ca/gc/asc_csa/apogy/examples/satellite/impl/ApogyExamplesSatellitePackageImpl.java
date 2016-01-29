/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.examples.satellite.impl;

import java.util.List;
import java.util.SortedSet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;

import ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesPackage;

import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;

import ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage;

import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationDownlinkItem;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractSatelliteCommand;
import ca.gc.asc_csa.apogy.examples.satellite.AcquireImageSatelliteCommand;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlan;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlanItem;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlink;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlinksList;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestPriority;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestStatus;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationUtilities;
import ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellation;
import ca.gc.asc_csa.apogy.examples.satellite.ImageConstellationRequest;
import ca.gc.asc_csa.apogy.examples.satellite.OrbitalImage;
import ca.gc.asc_csa.apogy.examples.satellite.OrbitalImageConstellationDownlinkItem;
import ca.gc.asc_csa.apogy.examples.satellite.Satellite;
import ca.gc.asc_csa.apogy.examples.satellite.SatellitesList;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatelliteFactory;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyExamplesSatellitePackageImpl extends EPackageImpl implements ApogyExamplesSatellitePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractConstellationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constellationCommandPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constellationCommandPlanItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultConstellationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constellationRequestsListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractConstellationRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageConstellationRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satellitesListEClass = null;

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
	private EClass abstractSatelliteCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acquireImageSatelliteCommandEClass = null;

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
	private EClass constellationDownlinksListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constellationDownlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractConstellationDownlinkItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orbitalImageConstellationDownlinkItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constellationUtilitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constellationRequestPriorityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constellationRequestStatusEEnum = null;

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
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyExamplesSatellitePackageImpl() {
		super(eNS_URI, ApogyExamplesSatelliteFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyExamplesSatellitePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyExamplesSatellitePackage init() {
		if (isInited) return (ApogyExamplesSatellitePackage)EPackage.Registry.INSTANCE.getEPackage(ApogyExamplesSatellitePackage.eNS_URI);

		// Obtain or create and register package
		ApogyExamplesSatellitePackageImpl theApogyExamplesSatellitePackage = (ApogyExamplesSatellitePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyExamplesSatellitePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyExamplesSatellitePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCoreEnvironmentOrbitEarthPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyExamplesSatellitePackage.createPackageContents();

		// Initialize created meta-data
		theApogyExamplesSatellitePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyExamplesSatellitePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyExamplesSatellitePackage.eNS_URI, theApogyExamplesSatellitePackage);
		return theApogyExamplesSatellitePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractConstellation() {
		return abstractConstellationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConstellation_SatellitesList() {
		return (EReference)abstractConstellationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConstellation_GroundStationsReferencesList() {
		return (EReference)abstractConstellationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConstellation_DownlinksLists() {
		return (EReference)abstractConstellationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConstellation_ConstellationRequestsList() {
		return (EReference)abstractConstellationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractConstellation__Plan__Date_Date() {
		return abstractConstellationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractConstellation__Plan__List_Date_Date() {
		return abstractConstellationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractConstellation__Commit__List() {
		return abstractConstellationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractConstellation__Apply__ConstellationDownlink() {
		return abstractConstellationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractConstellation__Add__AbstractConstellationRequest() {
		return abstractConstellationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractConstellation__AddAll__List() {
		return abstractConstellationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractConstellation__Remove__AbstractConstellationRequest() {
		return abstractConstellationEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractConstellation__RemoveAll__List() {
		return abstractConstellationEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstellationCommandPlan() {
		return constellationCommandPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstellationCommandPlan_ConstellationCommandPlanItems() {
		return (EReference)constellationCommandPlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstellationCommandPlanItem() {
		return constellationCommandPlanItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstellationCommandPlanItem_Request() {
		return (EReference)constellationCommandPlanItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstellationCommandPlanItem_SatelliteCommand() {
		return (EReference)constellationCommandPlanItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultConstellation() {
		return defaultConstellationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstellationRequestsList() {
		return constellationRequestsListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstellationRequestsList_ConstellationRequests() {
		return (EReference)constellationRequestsListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractConstellationRequest() {
		return abstractConstellationRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractConstellationRequest_Uid() {
		return (EAttribute)abstractConstellationRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractConstellationRequest_OrderPriority() {
		return (EAttribute)abstractConstellationRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractConstellationRequest_OrderStatus() {
		return (EAttribute)abstractConstellationRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConstellationRequest_SatelliteCommand() {
		return (EReference)abstractConstellationRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageConstellationRequest() {
		return imageConstellationRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageConstellationRequest_Image() {
		return (EReference)imageConstellationRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSatellitesList() {
		return satellitesListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSatellitesList_Satellites() {
		return (EReference)satellitesListEClass.getEStructuralFeatures().get(0);
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
	public EReference getSatellite_OrbitModel() {
		return (EReference)satelliteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSatellite_MaximumRollRate() {
		return (EAttribute)satelliteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSatellite_MaximumRoll() {
		return (EAttribute)satelliteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSatelliteCommand() {
		return abstractSatelliteCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractSatelliteCommand_Satellite() {
		return (EReference)abstractSatelliteCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractSatelliteCommand_ConstellationRequest() {
		return (EReference)abstractSatelliteCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcquireImageSatelliteCommand() {
		return acquireImageSatelliteCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcquireImageSatelliteCommand_RollAngle() {
		return (EAttribute)acquireImageSatelliteCommandEClass.getEStructuralFeatures().get(0);
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
	public EReference getOrbitalImage_Coordinates() {
		return (EReference)orbitalImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrbitalImage_RollAngle() {
		return (EAttribute)orbitalImageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstellationDownlinksList() {
		return constellationDownlinksListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstellationDownlinksList_Downlinks() {
		return (EReference)constellationDownlinksListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstellationDownlink() {
		return constellationDownlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstellationDownlink_DownlinkItems() {
		return (EReference)constellationDownlinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractConstellationDownlinkItem() {
		return abstractConstellationDownlinkItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractConstellationDownlinkItem_RequestUID() {
		return (EAttribute)abstractConstellationDownlinkItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrbitalImageConstellationDownlinkItem() {
		return orbitalImageConstellationDownlinkItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrbitalImageConstellationDownlinkItem_Image() {
		return (EReference)orbitalImageConstellationDownlinkItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstellationUtilities() {
		return constellationUtilitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstellationUtilities__SortByPriority__List() {
		return constellationUtilitiesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConstellationRequestPriority() {
		return constellationRequestPriorityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConstellationRequestStatus() {
		return constellationRequestStatusEEnum;
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
	public ApogyExamplesSatelliteFactory getApogyExamplesSatelliteFactory() {
		return (ApogyExamplesSatelliteFactory)getEFactoryInstance();
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
		abstractConstellationEClass = createEClass(ABSTRACT_CONSTELLATION);
		createEReference(abstractConstellationEClass, ABSTRACT_CONSTELLATION__SATELLITES_LIST);
		createEReference(abstractConstellationEClass, ABSTRACT_CONSTELLATION__GROUND_STATIONS_REFERENCES_LIST);
		createEReference(abstractConstellationEClass, ABSTRACT_CONSTELLATION__DOWNLINKS_LISTS);
		createEReference(abstractConstellationEClass, ABSTRACT_CONSTELLATION__CONSTELLATION_REQUESTS_LIST);
		createEOperation(abstractConstellationEClass, ABSTRACT_CONSTELLATION___PLAN__DATE_DATE);
		createEOperation(abstractConstellationEClass, ABSTRACT_CONSTELLATION___PLAN__LIST_DATE_DATE);
		createEOperation(abstractConstellationEClass, ABSTRACT_CONSTELLATION___COMMIT__LIST);
		createEOperation(abstractConstellationEClass, ABSTRACT_CONSTELLATION___APPLY__CONSTELLATIONDOWNLINK);
		createEOperation(abstractConstellationEClass, ABSTRACT_CONSTELLATION___ADD__ABSTRACTCONSTELLATIONREQUEST);
		createEOperation(abstractConstellationEClass, ABSTRACT_CONSTELLATION___ADD_ALL__LIST);
		createEOperation(abstractConstellationEClass, ABSTRACT_CONSTELLATION___REMOVE__ABSTRACTCONSTELLATIONREQUEST);
		createEOperation(abstractConstellationEClass, ABSTRACT_CONSTELLATION___REMOVE_ALL__LIST);

		constellationCommandPlanEClass = createEClass(CONSTELLATION_COMMAND_PLAN);
		createEReference(constellationCommandPlanEClass, CONSTELLATION_COMMAND_PLAN__CONSTELLATION_COMMAND_PLAN_ITEMS);

		constellationCommandPlanItemEClass = createEClass(CONSTELLATION_COMMAND_PLAN_ITEM);
		createEReference(constellationCommandPlanItemEClass, CONSTELLATION_COMMAND_PLAN_ITEM__REQUEST);
		createEReference(constellationCommandPlanItemEClass, CONSTELLATION_COMMAND_PLAN_ITEM__SATELLITE_COMMAND);

		defaultConstellationEClass = createEClass(DEFAULT_CONSTELLATION);

		constellationRequestsListEClass = createEClass(CONSTELLATION_REQUESTS_LIST);
		createEReference(constellationRequestsListEClass, CONSTELLATION_REQUESTS_LIST__CONSTELLATION_REQUESTS);

		abstractConstellationRequestEClass = createEClass(ABSTRACT_CONSTELLATION_REQUEST);
		createEAttribute(abstractConstellationRequestEClass, ABSTRACT_CONSTELLATION_REQUEST__UID);
		createEAttribute(abstractConstellationRequestEClass, ABSTRACT_CONSTELLATION_REQUEST__ORDER_PRIORITY);
		createEAttribute(abstractConstellationRequestEClass, ABSTRACT_CONSTELLATION_REQUEST__ORDER_STATUS);
		createEReference(abstractConstellationRequestEClass, ABSTRACT_CONSTELLATION_REQUEST__SATELLITE_COMMAND);

		imageConstellationRequestEClass = createEClass(IMAGE_CONSTELLATION_REQUEST);
		createEReference(imageConstellationRequestEClass, IMAGE_CONSTELLATION_REQUEST__IMAGE);

		satellitesListEClass = createEClass(SATELLITES_LIST);
		createEReference(satellitesListEClass, SATELLITES_LIST__SATELLITES);

		satelliteEClass = createEClass(SATELLITE);
		createEReference(satelliteEClass, SATELLITE__ORBIT_MODEL);
		createEAttribute(satelliteEClass, SATELLITE__MAXIMUM_ROLL_RATE);
		createEAttribute(satelliteEClass, SATELLITE__MAXIMUM_ROLL);

		abstractSatelliteCommandEClass = createEClass(ABSTRACT_SATELLITE_COMMAND);
		createEReference(abstractSatelliteCommandEClass, ABSTRACT_SATELLITE_COMMAND__SATELLITE);
		createEReference(abstractSatelliteCommandEClass, ABSTRACT_SATELLITE_COMMAND__CONSTELLATION_REQUEST);

		acquireImageSatelliteCommandEClass = createEClass(ACQUIRE_IMAGE_SATELLITE_COMMAND);
		createEAttribute(acquireImageSatelliteCommandEClass, ACQUIRE_IMAGE_SATELLITE_COMMAND__ROLL_ANGLE);

		orbitalImageEClass = createEClass(ORBITAL_IMAGE);
		createEReference(orbitalImageEClass, ORBITAL_IMAGE__COORDINATES);
		createEAttribute(orbitalImageEClass, ORBITAL_IMAGE__ROLL_ANGLE);

		constellationDownlinksListEClass = createEClass(CONSTELLATION_DOWNLINKS_LIST);
		createEReference(constellationDownlinksListEClass, CONSTELLATION_DOWNLINKS_LIST__DOWNLINKS);

		constellationDownlinkEClass = createEClass(CONSTELLATION_DOWNLINK);
		createEReference(constellationDownlinkEClass, CONSTELLATION_DOWNLINK__DOWNLINK_ITEMS);

		abstractConstellationDownlinkItemEClass = createEClass(ABSTRACT_CONSTELLATION_DOWNLINK_ITEM);
		createEAttribute(abstractConstellationDownlinkItemEClass, ABSTRACT_CONSTELLATION_DOWNLINK_ITEM__REQUEST_UID);

		orbitalImageConstellationDownlinkItemEClass = createEClass(ORBITAL_IMAGE_CONSTELLATION_DOWNLINK_ITEM);
		createEReference(orbitalImageConstellationDownlinkItemEClass, ORBITAL_IMAGE_CONSTELLATION_DOWNLINK_ITEM__IMAGE);

		constellationUtilitiesEClass = createEClass(CONSTELLATION_UTILITIES);
		createEOperation(constellationUtilitiesEClass, CONSTELLATION_UTILITIES___SORT_BY_PRIORITY__LIST);

		// Create enums
		constellationRequestPriorityEEnum = createEEnum(CONSTELLATION_REQUEST_PRIORITY);
		constellationRequestStatusEEnum = createEEnum(CONSTELLATION_REQUEST_STATUS);

		// Create data types
		listEDataType = createEDataType(LIST);
		sortedSetEDataType = createEDataType(SORTED_SET);
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
		ApogyCoreEnvironmentOrbitEarthPackage theApogyCoreEnvironmentOrbitEarthPackage = (ApogyCoreEnvironmentOrbitEarthPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreEnvironmentOrbitEarthPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ApogyCoreEnvironmentPackage theApogyCoreEnvironmentPackage = (ApogyCoreEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreEnvironmentPackage.eNS_URI);
		ApogyCommonEMFPackage theApogyCommonEMFPackage = (ApogyCommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonEMFPackage.eNS_URI);
		ApogyCoreEnvironmentOrbitPackage theApogyCoreEnvironmentOrbitPackage = (ApogyCoreEnvironmentOrbitPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreEnvironmentOrbitPackage.eNS_URI);
		ApogyCommonImagesPackage theApogyCommonImagesPackage = (ApogyCommonImagesPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonImagesPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(listEDataType, "T");
		addETypeParameter(sortedSetEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		defaultConstellationEClass.getESuperTypes().add(this.getAbstractConstellation());
		imageConstellationRequestEClass.getESuperTypes().add(this.getAbstractConstellationRequest());
		imageConstellationRequestEClass.getESuperTypes().add(theApogyCoreEnvironmentPackage.getGeographicCoordinates());
		satelliteEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		abstractSatelliteCommandEClass.getESuperTypes().add(theApogyCoreEnvironmentPackage.getGeographicCoordinates());
		abstractSatelliteCommandEClass.getESuperTypes().add(theApogyCommonEMFPackage.getTimed());
		acquireImageSatelliteCommandEClass.getESuperTypes().add(this.getAbstractSatelliteCommand());
		orbitalImageEClass.getESuperTypes().add(theApogyCommonImagesPackage.getEImage());
		constellationDownlinksListEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		constellationDownlinksListEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		orbitalImageConstellationDownlinkItemEClass.getESuperTypes().add(this.getAbstractConstellationDownlinkItem());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractConstellationEClass, AbstractConstellation.class, "AbstractConstellation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractConstellation_SatellitesList(), this.getSatellitesList(), null, "satellitesList", null, 0, 1, AbstractConstellation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractConstellation_GroundStationsReferencesList(), theApogyCoreEnvironmentOrbitEarthPackage.getGroundStationReferencesList(), null, "groundStationsReferencesList", null, 0, 1, AbstractConstellation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractConstellation_DownlinksLists(), this.getConstellationDownlinksList(), null, "downlinksLists", null, 0, 1, AbstractConstellation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractConstellation_ConstellationRequestsList(), this.getConstellationRequestsList(), null, "constellationRequestsList", null, 0, 1, AbstractConstellation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getAbstractConstellation__Plan__Date_Date(), this.getConstellationCommandPlan(), "plan", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "startDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "endDate", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractConstellation__Plan__List_Date_Date(), this.getConstellationCommandPlan(), "plan", 0, 1, !IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(this.getList());
		EGenericType g2 = createEGenericType(this.getAbstractConstellationRequest());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "requests", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "startDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "endDate", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractConstellation__Commit__List(), null, "commit", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getAbstractSatelliteCommand());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "satelliteCommands", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractConstellation__Apply__ConstellationDownlink(), null, "apply", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConstellationDownlink(), "downlink", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractConstellation__Add__AbstractConstellationRequest(), null, "add", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractConstellationRequest(), "request", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractConstellation__AddAll__List(), null, "addAll", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getAbstractConstellationRequest());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "requests", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractConstellation__Remove__AbstractConstellationRequest(), null, "remove", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractConstellationRequest(), "request", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractConstellation__RemoveAll__List(), null, "removeAll", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getAbstractConstellationRequest());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "requests", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(constellationCommandPlanEClass, ConstellationCommandPlan.class, "ConstellationCommandPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstellationCommandPlan_ConstellationCommandPlanItems(), this.getConstellationCommandPlanItem(), null, "constellationCommandPlanItems", null, 0, -1, ConstellationCommandPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constellationCommandPlanItemEClass, ConstellationCommandPlanItem.class, "ConstellationCommandPlanItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstellationCommandPlanItem_Request(), this.getAbstractConstellationRequest(), null, "request", null, 1, 1, ConstellationCommandPlanItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstellationCommandPlanItem_SatelliteCommand(), this.getAbstractSatelliteCommand(), null, "satelliteCommand", null, 0, 1, ConstellationCommandPlanItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultConstellationEClass, DefaultConstellation.class, "DefaultConstellation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constellationRequestsListEClass, ConstellationRequestsList.class, "ConstellationRequestsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstellationRequestsList_ConstellationRequests(), this.getAbstractConstellationRequest(), null, "constellationRequests", null, 0, -1, ConstellationRequestsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractConstellationRequestEClass, AbstractConstellationRequest.class, "AbstractConstellationRequest", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractConstellationRequest_Uid(), theEcorePackage.getELong(), "uid", "0", 0, 1, AbstractConstellationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractConstellationRequest_OrderPriority(), this.getConstellationRequestPriority(), "orderPriority", "NORMAL", 0, 1, AbstractConstellationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractConstellationRequest_OrderStatus(), this.getConstellationRequestStatus(), "orderStatus", "NEW", 0, 1, AbstractConstellationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractConstellationRequest_SatelliteCommand(), this.getAbstractSatelliteCommand(), this.getAbstractSatelliteCommand_ConstellationRequest(), "satelliteCommand", null, 0, 1, AbstractConstellationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageConstellationRequestEClass, ImageConstellationRequest.class, "ImageConstellationRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImageConstellationRequest_Image(), this.getOrbitalImage(), null, "image", null, 0, 1, ImageConstellationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(satellitesListEClass, SatellitesList.class, "SatellitesList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSatellitesList_Satellites(), this.getSatellite(), null, "satellites", null, 0, -1, SatellitesList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(satelliteEClass, Satellite.class, "Satellite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSatellite_OrbitModel(), theApogyCoreEnvironmentOrbitPackage.getOrbitModel(), null, "orbitModel", null, 0, 1, Satellite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSatellite_MaximumRollRate(), theEcorePackage.getEDouble(), "maximumRollRate", "0.017452778", 0, 1, Satellite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSatellite_MaximumRoll(), theEcorePackage.getEDouble(), "maximumRoll", "0.087", 0, 1, Satellite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractSatelliteCommandEClass, AbstractSatelliteCommand.class, "AbstractSatelliteCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractSatelliteCommand_Satellite(), this.getSatellite(), null, "satellite", null, 0, 1, AbstractSatelliteCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractSatelliteCommand_ConstellationRequest(), this.getAbstractConstellationRequest(), this.getAbstractConstellationRequest_SatelliteCommand(), "constellationRequest", null, 0, 1, AbstractSatelliteCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(acquireImageSatelliteCommandEClass, AcquireImageSatelliteCommand.class, "AcquireImageSatelliteCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcquireImageSatelliteCommand_RollAngle(), theEcorePackage.getEDouble(), "rollAngle", "0.0", 0, 1, AcquireImageSatelliteCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orbitalImageEClass, OrbitalImage.class, "OrbitalImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrbitalImage_Coordinates(), theApogyCoreEnvironmentPackage.getGeographicCoordinates(), null, "coordinates", null, 1, 1, OrbitalImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrbitalImage_RollAngle(), theEcorePackage.getEDouble(), "rollAngle", "0.0", 0, 1, OrbitalImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constellationDownlinksListEClass, ConstellationDownlinksList.class, "ConstellationDownlinksList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstellationDownlinksList_Downlinks(), this.getConstellationDownlink(), null, "downlinks", null, 0, -1, ConstellationDownlinksList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constellationDownlinkEClass, ConstellationDownlink.class, "ConstellationDownlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstellationDownlink_DownlinkItems(), this.getAbstractConstellationDownlinkItem(), null, "downlinkItems", null, 0, -1, ConstellationDownlink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractConstellationDownlinkItemEClass, AbstractConstellationDownlinkItem.class, "AbstractConstellationDownlinkItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractConstellationDownlinkItem_RequestUID(), theEcorePackage.getELong(), "requestUID", "0", 0, 1, AbstractConstellationDownlinkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orbitalImageConstellationDownlinkItemEClass, OrbitalImageConstellationDownlinkItem.class, "OrbitalImageConstellationDownlinkItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrbitalImageConstellationDownlinkItem_Image(), this.getOrbitalImage(), null, "image", null, 0, 1, OrbitalImageConstellationDownlinkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constellationUtilitiesEClass, ConstellationUtilities.class, "ConstellationUtilities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getConstellationUtilities__SortByPriority__List(), null, "sortByPriority", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getAbstractConstellationRequest());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "requests", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(this.getAbstractConstellationRequest());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		// Initialize enums and add enum literals
		initEEnum(constellationRequestPriorityEEnum, ConstellationRequestPriority.class, "ConstellationRequestPriority");
		addEEnumLiteral(constellationRequestPriorityEEnum, ConstellationRequestPriority.LOW);
		addEEnumLiteral(constellationRequestPriorityEEnum, ConstellationRequestPriority.NORMAL);
		addEEnumLiteral(constellationRequestPriorityEEnum, ConstellationRequestPriority.HIGH);

		initEEnum(constellationRequestStatusEEnum, ConstellationRequestStatus.class, "ConstellationRequestStatus");
		addEEnumLiteral(constellationRequestStatusEEnum, ConstellationRequestStatus.NEW);
		addEEnumLiteral(constellationRequestStatusEEnum, ConstellationRequestStatus.COMMITTED);
		addEEnumLiteral(constellationRequestStatusEEnum, ConstellationRequestStatus.COMPLETED);
		addEEnumLiteral(constellationRequestStatusEEnum, ConstellationRequestStatus.FAILED);

		// Initialize data types
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sortedSetEDataType, SortedSet.class, "SortedSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
			 "prefix", "ApogyExamplesSatellite",
			 "copyrightText", "Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)",
			 "modelName", "ApogyExamplesSatellite",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.examples.satellite/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.examples.satellite.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.examples"
		   });	
		addAnnotation
		  (listEDataType, 
		   source, 
		   new String[] {
			 "documentation", "Basic Types."
		   });	
		addAnnotation
		  (abstractConstellationEClass, 
		   source, 
		   new String[] {
			 "documentation", "Represents a constellation of Satellites. It provides basic queries used to schedule\nimage acquisition and upload requests and downloads data from the satellites."
		   });	
		addAnnotation
		  (getAbstractConstellation__Plan__Date_Date(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the list of {@link AbstractSatelliteCommand} required to process the constellation {@link AbstractConstellationRequest}\nbased on the available constellation satellites.\n@param startDate The start date of the period to be queried.\n@param endDate The end date of the period to be queried.\n@return Reference to the {@link SatelliteCommandPlan}."
		   });	
		addAnnotation
		  (getAbstractConstellation__Plan__List_Date_Date(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the list of {@link AbstractSatelliteCommand} required to process a specific list of {@link AbstractConstellationRequest}\nbased on the available constellation satellites.\n@param requests Refers to the list of {@link AbstractConstellationRequest} to process.\n@param startDate The start date of the period to be queried.\n@param endDate The end date of the period to be queried.\n@return Reference to the {@link SatelliteCommandPlan}."
		   });	
		addAnnotation
		  (getAbstractConstellation__Commit__List(), 
		   source, 
		   new String[] {
			 "documentation", "Packages and commits the list of {@link AbstractSatelliteCommand}.\n@param satelliteCommands Reference to the list of {@link AbstractSatelliteCommand}."
		   });	
		addAnnotation
		  (getAbstractConstellation__Apply__ConstellationDownlink(), 
		   source, 
		   new String[] {
			 "documentation", "Updates the {@link AbstractConstellationRequest} state based on the {@link ConstallationDownlink}.\n@param downlink Reference to the {@link ConstellationDownlink}."
		   });	
		addAnnotation
		  (getAbstractConstellation__Add__AbstractConstellationRequest(), 
		   source, 
		   new String[] {
			 "documentation", "Adds the specified {@link AbstractConstellationRequest} to the constellation.\n@param request Specifies the request to add to the {@link AbstractConstellation}."
		   });	
		addAnnotation
		  (getAbstractConstellation__AddAll__List(), 
		   source, 
		   new String[] {
			 "documentation", "Adds all the {@link AbstractConstellationRequest} specified in the list to the constellation.\n@param requests Specifies the requests to add to the {@link AbstractConstellation}."
		   });	
		addAnnotation
		  (getAbstractConstellation__Remove__AbstractConstellationRequest(), 
		   source, 
		   new String[] {
			 "documentation", "Removes the specified {@link AbstractConstellationRequest} from the constellation.\n@param request Specifies the request to remove from the {@link AbstractConstellation}."
		   });	
		addAnnotation
		  (getAbstractConstellation__RemoveAll__List(), 
		   source, 
		   new String[] {
			 "documentation", "Removes all the {@link AbstractConstellationRequest} specified in the list from the constellation.\n@param request Specifies the requests to remove from the {@link AbstractConstellation}."
		   });	
		addAnnotation
		  (getAbstractConstellation_SatellitesList(), 
		   source, 
		   new String[] {
			 "documentation", "List of the constellation {@link Satellite}."
		   });	
		addAnnotation
		  (getAbstractConstellation_GroundStationsReferencesList(), 
		   source, 
		   new String[] {
			 "documentation", "List of the {@link GroundStation}."
		   });	
		addAnnotation
		  (getAbstractConstellation_DownlinksLists(), 
		   source, 
		   new String[] {
			 "documentation", "List of {@link ConstellationDownlinkList} used to store {@link ConstellationDownlink}."
		   });	
		addAnnotation
		  (getAbstractConstellation_ConstellationRequestsList(), 
		   source, 
		   new String[] {
			 "documentation", "List of {@link AbstractConstellationRequest}."
		   });	
		addAnnotation
		  (constellationCommandPlanEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class contains a list of {@link SatelliteCommandPlanItem}.\nThe {@link AbstractConstellation#plan} produces {@link SatelliteCommandPlan}."
		   });	
		addAnnotation
		  (getConstellationCommandPlan_ConstellationCommandPlanItems(), 
		   source, 
		   new String[] {
			 "documentation", "List of {@link SatelliteCommandPlanItem}."
		   });	
		addAnnotation
		  (constellationCommandPlanItemEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class specifies the link between an {@link AbstractConstellationRequest} and a {@link AbstractSatelliteCommand}."
		   });	
		addAnnotation
		  (getConstellationCommandPlanItem_Request(), 
		   source, 
		   new String[] {
			 "documentation", "Reference to the {@link AbstractConstellationRequest}."
		   });	
		addAnnotation
		  (getConstellationCommandPlanItem_SatelliteCommand(), 
		   source, 
		   new String[] {
			 "documentation", "Reference to the {@link AbstractSatelliteCommand} used/required to service the {@link AbstractConstellationRequest}."
		   });	
		addAnnotation
		  (defaultConstellationEClass, 
		   source, 
		   new String[] {
			 "documentation", "Constellation Default Implementation Class."
		   });	
		addAnnotation
		  (constellationRequestsListEClass, 
		   source, 
		   new String[] {
			 "documentation", "List that contains {@link AbstractConstellationRequest}."
		   });	
		addAnnotation
		  (getConstellationRequestsList_ConstellationRequests(), 
		   source, 
		   new String[] {
			 "documentation", "{@link AbstractConstellationRequest} container."
		   });	
		addAnnotation
		  (abstractConstellationRequestEClass, 
		   source, 
		   new String[] {
			 "documentation", "This abstract class is used to model Constellation Request such as {@link ImageConstellationRequest}."
		   });	
		addAnnotation
		  (getAbstractConstellationRequest_Uid(), 
		   source, 
		   new String[] {
			 "documentation", "Request Unique Identifier."
		   });	
		addAnnotation
		  (getAbstractConstellationRequest_OrderPriority(), 
		   source, 
		   new String[] {
			 "documentation", "Request Priority."
		   });	
		addAnnotation
		  (getAbstractConstellationRequest_OrderStatus(), 
		   source, 
		   new String[] {
			 "documentation", "Order Status."
		   });	
		addAnnotation
		  (getAbstractConstellationRequest_SatelliteCommand(), 
		   source, 
		   new String[] {
			 "documentation", "Reference to the {@link AbstractSatelliteCommand} associated to the {@link AbstractConstellationRequest}."
		   });	
		addAnnotation
		  (imageConstellationRequestEClass, 
		   source, 
		   new String[] {
			 "documentation", "Class that documents a request to take an orbital image at a specific location.\nIt also serves to store the status and the image obtained if any."
		   });	
		addAnnotation
		  (getImageConstellationRequest_Image(), 
		   source, 
		   new String[] {
			 "documentation", "Contains the {@link OrbitalImage} if the {@link ImageConstellationRequest} was successfully processed and retrieved."
		   });	
		addAnnotation
		  (constellationRequestPriorityEEnum, 
		   source, 
		   new String[] {
			 "documentation", "This enumeration is used to indicate the possible {@link AbstractConstellationRequest} order priorities."
		   });	
		addAnnotation
		  (constellationRequestStatusEEnum, 
		   source, 
		   new String[] {
			 "documentation", "This enumeration is used to indicate the possible {@link AbstractConstellationRequest} statuses."
		   });	
		addAnnotation
		  (satellitesListEClass, 
		   source, 
		   new String[] {
			 "documentation", "List that contains {@link Satellite}."
		   });	
		addAnnotation
		  (satelliteEClass, 
		   source, 
		   new String[] {
			 "documentation", "Class that defines the properties of a specific satellite."
		   });	
		addAnnotation
		  (getSatellite_OrbitModel(), 
		   source, 
		   new String[] {
			 "documentation", "Refers to the {@link OrbitModel}."
		   });	
		addAnnotation
		  (getSatellite_MaximumRollRate(), 
		   source, 
		   new String[] {
			 "documentation", "The satellite maximum roll rate.",
			 "apogy_units", "rad/s"
		   });	
		addAnnotation
		  (getSatellite_MaximumRoll(), 
		   source, 
		   new String[] {
			 "documentation", "The satellite maximum roll.",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (abstractSatelliteCommandEClass, 
		   source, 
		   new String[] {
			 "documentation", "Satellite Command."
		   });	
		addAnnotation
		  (getAbstractSatelliteCommand_Satellite(), 
		   source, 
		   new String[] {
			 "documentation", "Refers the {@link Satellite} associated with the {@link AbstractSatelliteCommand}."
		   });	
		addAnnotation
		  (getAbstractSatelliteCommand_ConstellationRequest(), 
		   source, 
		   new String[] {
			 "documentation", "Reference to the associated {@link AbstractConstellationRequest}."
		   });	
		addAnnotation
		  (acquireImageSatelliteCommandEClass, 
		   source, 
		   new String[] {
			 "documentation", "Satellite Command to Acquire OrbitalImage"
		   });	
		addAnnotation
		  (getAcquireImageSatelliteCommand_RollAngle(), 
		   source, 
		   new String[] {
			 "documentation", "The satellite is nadir looking, and can roll back and forth (+- X degrees) along its trajectory.\nAn imager is mounted on its nadir axis and can take images of the Earth below."
		   });	
		addAnnotation
		  (orbitalImageEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents an orbital image."
		   });	
		addAnnotation
		  (constellationDownlinksListEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents a list of {@link ConstellationDownlink}."
		   });	
		addAnnotation
		  (constellationDownlinkEClass, 
		   source, 
		   new String[] {
			 "documentation", "A {@link ConstellationDownlink} class contains the {@link AbstractConstellationDownlinkItem}."
		   });	
		addAnnotation
		  (abstractConstellationDownlinkItemEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents an item in a {@link ConstellationDownlink}."
		   });	
		addAnnotation
		  (getAbstractConstellationDownlinkItem_RequestUID(), 
		   source, 
		   new String[] {
			 "documentation", "Unique {@link AbstractConstellationRequest} identifier."
		   });	
		addAnnotation
		  (orbitalImageConstellationDownlinkItemEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents a {@link AbstractDownlinkItem} that contains an {@link OrbitalImage}."
		   });	
		addAnnotation
		  (constellationUtilitiesEClass, 
		   source, 
		   new String[] {
			 "documentation", "Utilities class for the satellite example."
		   });	
		addAnnotation
		  (getConstellationUtilities__SortByPriority__List(), 
		   source, 
		   new String[] {
			 "documentation", "Sorts the list of {@link AbstractConstellationRequest} based on {@link AbstractConstellationRequest#priority}.\n@param requests Specifies the list of {@link AbstractConstellationRequest} to sort."
		   });
	}

} //ApogyExamplesSatellitePackageImpl