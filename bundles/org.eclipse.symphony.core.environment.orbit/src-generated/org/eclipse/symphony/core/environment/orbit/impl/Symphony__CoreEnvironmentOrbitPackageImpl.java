/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.common.math.Symphony__CommonMathPackage;
import org.eclipse.symphony.core.Symphony__CorePackage;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage;
import org.eclipse.symphony.core.environment.orbit.AbstractFrame;
import org.eclipse.symphony.core.environment.orbit.AbstractOrbitPropagator;
import org.eclipse.symphony.core.environment.orbit.AngularCoordinates;
import org.eclipse.symphony.core.environment.orbit.AttitudeProvider;
import org.eclipse.symphony.core.environment.orbit.Orbit;
import org.eclipse.symphony.core.environment.orbit.Symphony__CoreEnvironmentOrbitFacade;
import org.eclipse.symphony.core.environment.orbit.OrbitModel;
import org.eclipse.symphony.core.environment.orbit.OrbitWorksite;
import org.eclipse.symphony.core.environment.orbit.PVACoordinates;
import org.eclipse.symphony.core.environment.orbit.PVCoordinatesProviderProvider;
import org.eclipse.symphony.core.environment.orbit.SpacecraftAttitude;
import org.eclipse.symphony.core.environment.orbit.SpacecraftState;
import org.eclipse.symphony.core.environment.orbit.Symphony__CoreEnvironmentOrbitFactory;
import org.eclipse.symphony.core.environment.orbit.Symphony__CoreEnvironmentOrbitPackage;
import org.eclipse.symphony.core.environment.orbit.TimedStampedAngularCoordinates;
import org.eclipse.symphony.core.environment.orbit.TimedStampedPVACoordinates;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CoreEnvironmentOrbitPackageImpl extends EPackageImpl implements Symphony__CoreEnvironmentOrbitPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orbitWorksiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFrameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pvaCoordinatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedStampedPVACoordinatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pvCoordinatesProviderProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angularCoordinatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedStampedAngularCoordinatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spacecraftAttitudeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attitudeProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spacecraftStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orbitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractOrbitPropagatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orbitModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symphony__CoreEnvironmentOrbitFacadeEClass = null;

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
	 * @see org.eclipse.symphony.core.environment.orbit.Symphony__CoreEnvironmentOrbitPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Symphony__CoreEnvironmentOrbitPackageImpl() {
		super(eNS_URI, Symphony__CoreEnvironmentOrbitFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Symphony__CoreEnvironmentOrbitPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Symphony__CoreEnvironmentOrbitPackage init() {
		if (isInited) return (Symphony__CoreEnvironmentOrbitPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CoreEnvironmentOrbitPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__CoreEnvironmentOrbitPackageImpl theSymphony__CoreEnvironmentOrbitPackage = (Symphony__CoreEnvironmentOrbitPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__CoreEnvironmentOrbitPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__CoreEnvironmentOrbitPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Symphony__CoreEnvironmentPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__CoreEnvironmentOrbitPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__CoreEnvironmentOrbitPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__CoreEnvironmentOrbitPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__CoreEnvironmentOrbitPackage.eNS_URI, theSymphony__CoreEnvironmentOrbitPackage);
		return theSymphony__CoreEnvironmentOrbitPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrbitWorksite() {
		return orbitWorksiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrbitWorksite_ActiveOrbitModel() {
		return (EReference)orbitWorksiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFrame() {
		return abstractFrameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPVACoordinates() {
		return pvaCoordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPVACoordinates_Position() {
		return (EReference)pvaCoordinatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPVACoordinates_Velocity() {
		return (EReference)pvaCoordinatesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPVACoordinates_Acceleration() {
		return (EReference)pvaCoordinatesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPVACoordinates_AngularVelocity() {
		return (EReference)pvaCoordinatesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedStampedPVACoordinates() {
		return timedStampedPVACoordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPVCoordinatesProviderProvider() {
		return pvCoordinatesProviderProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPVCoordinatesProviderProvider__GetPVCoordinates__Date_AbstractFrame() {
		return pvCoordinatesProviderProviderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAngularCoordinates() {
		return angularCoordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAngularCoordinates_Rotation() {
		return (EReference)angularCoordinatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAngularCoordinates_AngularRate() {
		return (EReference)angularCoordinatesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAngularCoordinates_AngularAcceleration() {
		return (EReference)angularCoordinatesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedStampedAngularCoordinates() {
		return timedStampedAngularCoordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpacecraftAttitude() {
		return spacecraftAttitudeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpacecraftAttitude_Orientation() {
		return (EReference)spacecraftAttitudeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpacecraftAttitude_ReferenceFrame() {
		return (EReference)spacecraftAttitudeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttitudeProvider() {
		return attitudeProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAttitudeProvider__GetAttitude__PVCoordinatesProviderProvider_Date_AbstractFrame() {
		return attitudeProviderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpacecraftState() {
		return spacecraftStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpacecraftState_Coordinates() {
		return (EReference)spacecraftStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpacecraftState_Attitude() {
		return (EReference)spacecraftStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpacecraftState_Orbit() {
		return (EReference)spacecraftStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrbit() {
		return orbitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrbit_ReferenceFrame() {
		return (EReference)orbitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractOrbitPropagator() {
		return abstractOrbitPropagatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractOrbitPropagator_ReferenceFrame() {
		return (EReference)abstractOrbitPropagatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractOrbitPropagator_AttitudeProvider() {
		return (EReference)abstractOrbitPropagatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractOrbitPropagator_InitialOrbit() {
		return (EReference)abstractOrbitPropagatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractOrbitPropagator_ValidFromDate() {
		return (EAttribute)abstractOrbitPropagatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractOrbitPropagator_ValidToDate() {
		return (EAttribute)abstractOrbitPropagatorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractOrbitPropagator__Propagate__Date() {
		return abstractOrbitPropagatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractOrbitPropagator__GetSpacecraftStates__Date_Date_double() {
		return abstractOrbitPropagatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractOrbitPropagator__IsDateInValidRange__Date() {
		return abstractOrbitPropagatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrbitModel() {
		return orbitModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrbitModel_InitialOrbit() {
		return (EReference)orbitModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrbitModel_Propagator() {
		return (EReference)orbitModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymphony__CoreEnvironmentOrbitFacade() {
		return symphony__CoreEnvironmentOrbitFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CoreEnvironmentOrbitFacade__CreateOrbitModelCopy__OrbitModel() {
		return symphony__CoreEnvironmentOrbitFacadeEClass.getEOperations().get(0);
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
	public EDataType getException() {
		return exceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CoreEnvironmentOrbitFactory getSymphony__CoreEnvironmentOrbitFactory() {
		return (Symphony__CoreEnvironmentOrbitFactory)getEFactoryInstance();
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
		orbitWorksiteEClass = createEClass(ORBIT_WORKSITE);
		createEReference(orbitWorksiteEClass, ORBIT_WORKSITE__ACTIVE_ORBIT_MODEL);

		abstractFrameEClass = createEClass(ABSTRACT_FRAME);

		pvaCoordinatesEClass = createEClass(PVA_COORDINATES);
		createEReference(pvaCoordinatesEClass, PVA_COORDINATES__POSITION);
		createEReference(pvaCoordinatesEClass, PVA_COORDINATES__VELOCITY);
		createEReference(pvaCoordinatesEClass, PVA_COORDINATES__ACCELERATION);
		createEReference(pvaCoordinatesEClass, PVA_COORDINATES__ANGULAR_VELOCITY);

		timedStampedPVACoordinatesEClass = createEClass(TIMED_STAMPED_PVA_COORDINATES);

		pvCoordinatesProviderProviderEClass = createEClass(PV_COORDINATES_PROVIDER_PROVIDER);
		createEOperation(pvCoordinatesProviderProviderEClass, PV_COORDINATES_PROVIDER_PROVIDER___GET_PV_COORDINATES__DATE_ABSTRACTFRAME);

		angularCoordinatesEClass = createEClass(ANGULAR_COORDINATES);
		createEReference(angularCoordinatesEClass, ANGULAR_COORDINATES__ROTATION);
		createEReference(angularCoordinatesEClass, ANGULAR_COORDINATES__ANGULAR_RATE);
		createEReference(angularCoordinatesEClass, ANGULAR_COORDINATES__ANGULAR_ACCELERATION);

		timedStampedAngularCoordinatesEClass = createEClass(TIMED_STAMPED_ANGULAR_COORDINATES);

		spacecraftAttitudeEClass = createEClass(SPACECRAFT_ATTITUDE);
		createEReference(spacecraftAttitudeEClass, SPACECRAFT_ATTITUDE__ORIENTATION);
		createEReference(spacecraftAttitudeEClass, SPACECRAFT_ATTITUDE__REFERENCE_FRAME);

		attitudeProviderEClass = createEClass(ATTITUDE_PROVIDER);
		createEOperation(attitudeProviderEClass, ATTITUDE_PROVIDER___GET_ATTITUDE__PVCOORDINATESPROVIDERPROVIDER_DATE_ABSTRACTFRAME);

		spacecraftStateEClass = createEClass(SPACECRAFT_STATE);
		createEReference(spacecraftStateEClass, SPACECRAFT_STATE__COORDINATES);
		createEReference(spacecraftStateEClass, SPACECRAFT_STATE__ATTITUDE);
		createEReference(spacecraftStateEClass, SPACECRAFT_STATE__ORBIT);

		orbitEClass = createEClass(ORBIT);
		createEReference(orbitEClass, ORBIT__REFERENCE_FRAME);

		abstractOrbitPropagatorEClass = createEClass(ABSTRACT_ORBIT_PROPAGATOR);
		createEReference(abstractOrbitPropagatorEClass, ABSTRACT_ORBIT_PROPAGATOR__REFERENCE_FRAME);
		createEReference(abstractOrbitPropagatorEClass, ABSTRACT_ORBIT_PROPAGATOR__ATTITUDE_PROVIDER);
		createEReference(abstractOrbitPropagatorEClass, ABSTRACT_ORBIT_PROPAGATOR__INITIAL_ORBIT);
		createEAttribute(abstractOrbitPropagatorEClass, ABSTRACT_ORBIT_PROPAGATOR__VALID_FROM_DATE);
		createEAttribute(abstractOrbitPropagatorEClass, ABSTRACT_ORBIT_PROPAGATOR__VALID_TO_DATE);
		createEOperation(abstractOrbitPropagatorEClass, ABSTRACT_ORBIT_PROPAGATOR___PROPAGATE__DATE);
		createEOperation(abstractOrbitPropagatorEClass, ABSTRACT_ORBIT_PROPAGATOR___GET_SPACECRAFT_STATES__DATE_DATE_DOUBLE);
		createEOperation(abstractOrbitPropagatorEClass, ABSTRACT_ORBIT_PROPAGATOR___IS_DATE_IN_VALID_RANGE__DATE);

		orbitModelEClass = createEClass(ORBIT_MODEL);
		createEReference(orbitModelEClass, ORBIT_MODEL__INITIAL_ORBIT);
		createEReference(orbitModelEClass, ORBIT_MODEL__PROPAGATOR);

		symphony__CoreEnvironmentOrbitFacadeEClass = createEClass(SYMPHONY_CORE_ENVIRONMENT_ORBIT_FACADE);
		createEOperation(symphony__CoreEnvironmentOrbitFacadeEClass, SYMPHONY_CORE_ENVIRONMENT_ORBIT_FACADE___CREATE_ORBIT_MODEL_COPY__ORBITMODEL);

		// Create data types
		listEDataType = createEDataType(LIST);
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
		Symphony__CoreEnvironmentPackage theSymphony__CoreEnvironmentPackage = (Symphony__CoreEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CoreEnvironmentPackage.eNS_URI);
		Symphony__CorePackage theSymphony__CorePackage = (Symphony__CorePackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CorePackage.eNS_URI);
		Symphony__CommonEMFPackage theSymphony__CommonEMFPackage = (Symphony__CommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonEMFPackage.eNS_URI);
		Symphony__CommonMathPackage theSymphony__CommonMathPackage = (Symphony__CommonMathPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonMathPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters
		addETypeParameter(listEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		orbitWorksiteEClass.getESuperTypes().add(theSymphony__CoreEnvironmentPackage.getWorksite());
		abstractFrameEClass.getESuperTypes().add(theSymphony__CommonEMFPackage.getNamed());
		abstractFrameEClass.getESuperTypes().add(theSymphony__CommonEMFPackage.getDescribed());
		timedStampedPVACoordinatesEClass.getESuperTypes().add(this.getPVACoordinates());
		timedStampedPVACoordinatesEClass.getESuperTypes().add(theSymphony__CommonEMFPackage.getTimed());
		timedStampedAngularCoordinatesEClass.getESuperTypes().add(this.getAngularCoordinates());
		timedStampedAngularCoordinatesEClass.getESuperTypes().add(theSymphony__CommonEMFPackage.getTimed());
		spacecraftAttitudeEClass.getESuperTypes().add(theSymphony__CommonEMFPackage.getTimed());
		spacecraftStateEClass.getESuperTypes().add(theSymphony__CommonEMFPackage.getTimed());
		orbitEClass.getESuperTypes().add(theSymphony__CommonEMFPackage.getNamed());
		orbitEClass.getESuperTypes().add(theSymphony__CommonEMFPackage.getDescribed());
		orbitEClass.getESuperTypes().add(theSymphony__CommonEMFPackage.getTimed());
		abstractOrbitPropagatorEClass.getESuperTypes().add(theSymphony__CommonEMFPackage.getNamed());
		abstractOrbitPropagatorEClass.getESuperTypes().add(theSymphony__CommonEMFPackage.getDescribed());
		orbitModelEClass.getESuperTypes().add(theSymphony__CorePackage.getAbstractOrbitModel());

		// Initialize classes, features, and operations; add parameters
		initEClass(orbitWorksiteEClass, OrbitWorksite.class, "OrbitWorksite", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrbitWorksite_ActiveOrbitModel(), theSymphony__CorePackage.getAbstractOrbitModel(), null, "activeOrbitModel", null, 0, 1, OrbitWorksite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractFrameEClass, AbstractFrame.class, "AbstractFrame", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pvaCoordinatesEClass, PVACoordinates.class, "PVACoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPVACoordinates_Position(), theSymphony__CommonMathPackage.getTuple3d(), null, "position", null, 1, 1, PVACoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPVACoordinates_Velocity(), theSymphony__CommonMathPackage.getTuple3d(), null, "velocity", null, 1, 1, PVACoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPVACoordinates_Acceleration(), theSymphony__CommonMathPackage.getTuple3d(), null, "acceleration", null, 1, 1, PVACoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPVACoordinates_AngularVelocity(), theSymphony__CommonMathPackage.getTuple3d(), null, "angularVelocity", null, 1, 1, PVACoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timedStampedPVACoordinatesEClass, TimedStampedPVACoordinates.class, "TimedStampedPVACoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pvCoordinatesProviderProviderEClass, PVCoordinatesProviderProvider.class, "PVCoordinatesProviderProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getPVCoordinatesProviderProvider__GetPVCoordinates__Date_AbstractFrame(), this.getTimedStampedPVACoordinates(), "getPVCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractFrame(), "frame", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(angularCoordinatesEClass, AngularCoordinates.class, "AngularCoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAngularCoordinates_Rotation(), theSymphony__CommonMathPackage.getMatrix3x3(), null, "rotation", null, 0, 1, AngularCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngularCoordinates_AngularRate(), theSymphony__CommonMathPackage.getTuple3d(), null, "angularRate", null, 1, 1, AngularCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngularCoordinates_AngularAcceleration(), theSymphony__CommonMathPackage.getTuple3d(), null, "angularAcceleration", null, 1, 1, AngularCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timedStampedAngularCoordinatesEClass, TimedStampedAngularCoordinates.class, "TimedStampedAngularCoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spacecraftAttitudeEClass, SpacecraftAttitude.class, "SpacecraftAttitude", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpacecraftAttitude_Orientation(), this.getTimedStampedAngularCoordinates(), null, "orientation", null, 0, 1, SpacecraftAttitude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpacecraftAttitude_ReferenceFrame(), this.getAbstractFrame(), null, "referenceFrame", null, 0, 1, SpacecraftAttitude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attitudeProviderEClass, AttitudeProvider.class, "AttitudeProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getAttitudeProvider__GetAttitude__PVCoordinatesProviderProvider_Date_AbstractFrame(), this.getSpacecraftAttitude(), "getAttitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPVCoordinatesProviderProvider(), "pvProvider", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractFrame(), "frame", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(spacecraftStateEClass, SpacecraftState.class, "SpacecraftState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpacecraftState_Coordinates(), this.getTimedStampedPVACoordinates(), null, "coordinates", null, 0, 1, SpacecraftState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpacecraftState_Attitude(), this.getTimedStampedAngularCoordinates(), null, "attitude", null, 0, 1, SpacecraftState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpacecraftState_Orbit(), this.getOrbit(), null, "orbit", null, 0, 1, SpacecraftState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orbitEClass, Orbit.class, "Orbit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrbit_ReferenceFrame(), this.getAbstractFrame(), null, "referenceFrame", null, 0, 1, Orbit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractOrbitPropagatorEClass, AbstractOrbitPropagator.class, "AbstractOrbitPropagator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractOrbitPropagator_ReferenceFrame(), this.getAbstractFrame(), null, "referenceFrame", null, 0, 1, AbstractOrbitPropagator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractOrbitPropagator_AttitudeProvider(), this.getAttitudeProvider(), null, "attitudeProvider", null, 0, -1, AbstractOrbitPropagator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractOrbitPropagator_InitialOrbit(), this.getOrbit(), null, "initialOrbit", null, 1, 1, AbstractOrbitPropagator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractOrbitPropagator_ValidFromDate(), theEcorePackage.getEDate(), "validFromDate", null, 1, 1, AbstractOrbitPropagator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractOrbitPropagator_ValidToDate(), theEcorePackage.getEDate(), "validToDate", null, 1, 1, AbstractOrbitPropagator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAbstractOrbitPropagator__Propagate__Date(), this.getSpacecraftState(), "propagate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "targetDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getAbstractOrbitPropagator__GetSpacecraftStates__Date_Date_double(), null, "getSpacecraftStates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "startDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "endDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "timeInterval", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());
		EGenericType g1 = createEGenericType(this.getList());
		EGenericType g2 = createEGenericType(this.getSpacecraftState());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getAbstractOrbitPropagator__IsDateInValidRange__Date(), theEcorePackage.getEBoolean(), "isDateInValidRange", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(orbitModelEClass, OrbitModel.class, "OrbitModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrbitModel_InitialOrbit(), this.getOrbit(), null, "initialOrbit", null, 0, 1, OrbitModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrbitModel_Propagator(), this.getAbstractOrbitPropagator(), null, "propagator", null, 0, 1, OrbitModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symphony__CoreEnvironmentOrbitFacadeEClass, Symphony__CoreEnvironmentOrbitFacade.class, "Symphony__CoreEnvironmentOrbitFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getSymphony__CoreEnvironmentOrbitFacade__CreateOrbitModelCopy__OrbitModel(), this.getOrbitModel(), "createOrbitModelCopy", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOrbitModel(), "originalOrbitModel", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
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
			 "prefix", "Symphony__CoreEnvironmentOrbit",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)",
			 "modelName", "Symphony__CoreEnvironmentOrbit",
			 "complianceLevel", "8.0",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/org.eclipse.symphony.core.environment.orbit/src-generated",
			 "editDirectory", "/org.eclipse.symphony.core.environment.orbit.edit/src-generated",
			 "basePackage", "org.eclipse.symphony.core.environment"
		   });	
		addAnnotation
		  (getOrbitWorksite_ActiveOrbitModel(), 
		   source, 
		   new String[] {
			 "documentation", "The active OrbitModel to use to update the orbit worksite."
		   });	
		addAnnotation
		  (pvaCoordinatesEClass, 
		   source, 
		   new String[] {
			 "documentation", "Defines the triplet of Position, Velocity, Acceleration."
		   });	
		addAnnotation
		  (getPVACoordinates_Position(), 
		   source, 
		   new String[] {
			 "documentation", "The position.",
			 "symphony_units", "m"
		   });	
		addAnnotation
		  (getPVACoordinates_Velocity(), 
		   source, 
		   new String[] {
			 "documentation", "The velocity.",
			 "symphony_units", "m/s"
		   });	
		addAnnotation
		  (getPVACoordinates_Acceleration(), 
		   source, 
		   new String[] {
			 "documentation", "The acceleration.",
			 "symphony_units", "m/s\u00b2"
		   });	
		addAnnotation
		  (getPVACoordinates_AngularVelocity(), 
		   source, 
		   new String[] {
			 "documentation", "The angular velocity (spin) of this point as seen from the origin.",
			 "symphony_units", "rad/s"
		   });	
		addAnnotation
		  (timedStampedPVACoordinatesEClass, 
		   source, 
		   new String[] {
			 "documentation", "Defines the triplet of Position, Velocity, Acceleration that is time stamped."
		   });	
		addAnnotation
		  (pvCoordinatesProviderProviderEClass, 
		   source, 
		   new String[] {
			 "documentation", "This interface represents a PVCoordinates provider."
		   });	
		addAnnotation
		  (getAngularCoordinates_Rotation(), 
		   source, 
		   new String[] {
			 "documentation", "The rotation expressed as a rotation matrix."
		   });	
		addAnnotation
		  (getAngularCoordinates_AngularRate(), 
		   source, 
		   new String[] {
			 "documentation", "The rotation rates, in rad/s"
		   });	
		addAnnotation
		  (getAngularCoordinates_AngularAcceleration(), 
		   source, 
		   new String[] {
			 "documentation", "The rotation acceleration, in rad/s\u00b2"
		   });	
		addAnnotation
		  (spacecraftAttitudeEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents the rotation between a reference frame and the satellite frame,\nas well as the spin of the satellite (axis and rotation rate)."
		   });	
		addAnnotation
		  (attitudeProviderEClass, 
		   source, 
		   new String[] {
			 "documentation", "This interface represents an attitude provider.\nAn attitude provider provides a way to compute an Attitude from an date and position-velocity local provider."
		   });	
		addAnnotation
		  (spacecraftStateEClass, 
		   source, 
		   new String[] {
			 "documentation", "Defines a space craft state (position, velocity, acceleration and attitude) at one point in time."
		   });	
		addAnnotation
		  (getSpacecraftState_Coordinates(), 
		   source, 
		   new String[] {
			 "documentation", "The spacecraft PVA coordinates at the specified time.",
			 "property", "Readonly"
		   });	
		addAnnotation
		  (getSpacecraftState_Attitude(), 
		   source, 
		   new String[] {
			 "documentation", "The spacecraft attitude at the specified time.",
			 "property", "Readonly"
		   });	
		addAnnotation
		  (getSpacecraftState_Orbit(), 
		   source, 
		   new String[] {
			 "documentation", "The spacecraft orbit at the specified time.",
			 "property", "Readonly"
		   });	
		addAnnotation
		  (orbitEClass, 
		   source, 
		   new String[] {
			 "documentation", "Defines an Orbit. An orbit defines the orbital parameter at a given point in time (orbital parameters can change with time.)"
		   });	
		addAnnotation
		  (getOrbit_ReferenceFrame(), 
		   source, 
		   new String[] {
			 "documentation", "The inertial frame used to represent this orbit."
		   });	
		addAnnotation
		  (abstractOrbitPropagatorEClass, 
		   source, 
		   new String[] {
			 "documentation", "Defines a class that propagate an initial orbit through time."
		   });	
		addAnnotation
		  (getAbstractOrbitPropagator__Propagate__Date(), 
		   source, 
		   new String[] {
			 "documentation", "Propagate the current orbit to a specified time to get a Spacecraft state."
		   });	
		addAnnotation
		  (getAbstractOrbitPropagator__GetSpacecraftStates__Date_Date_double(), 
		   source, 
		   new String[] {
			 "documentation", "Returns a list of SpacecraftState from startDate to endDate at time interval of timeInterval.\n@param timeInterval The time interval to get spacecraft states, in seconds."
		   });	
		addAnnotation
		  ((getAbstractOrbitPropagator__GetSpacecraftStates__Date_Date_double()).getEParameters().get(2), 
		   source, 
		   new String[] {
			 "symphony_units", "s"
		   });	
		addAnnotation
		  (getAbstractOrbitPropagator__IsDateInValidRange__Date(), 
		   source, 
		   new String[] {
			 "documentation", "Returns wether or not a specified date falls within the validity range of the propagator."
		   });	
		addAnnotation
		  (getAbstractOrbitPropagator_ReferenceFrame(), 
		   source, 
		   new String[] {
			 "documentation", "The frame in which the orbit is propagated."
		   });	
		addAnnotation
		  (getAbstractOrbitPropagator_AttitudeProvider(), 
		   source, 
		   new String[] {
			 "documentation", "The attitude provider. Can be used to specify an attitude control law."
		   });	
		addAnnotation
		  (getAbstractOrbitPropagator_InitialOrbit(), 
		   source, 
		   new String[] {
			 "documentation", "The initial orbit to propagate in time."
		   });	
		addAnnotation
		  (getAbstractOrbitPropagator_ValidFromDate(), 
		   source, 
		   new String[] {
			 "documentation", "Defines the earliest data for which the propagator is valid."
		   });	
		addAnnotation
		  (getAbstractOrbitPropagator_ValidToDate(), 
		   source, 
		   new String[] {
			 "documentation", "Defines the latest data for which the propagator is valid."
		   });	
		addAnnotation
		  (orbitModelEClass, 
		   source, 
		   new String[] {
			 "documentation", "Class that defines an orbit model. An orbit model specifies both initial condition (through the initial Orbit), and\na propagation method (through the AbstractOrbitPropagator)."
		   });	
		addAnnotation
		  (symphony__CoreEnvironmentOrbitFacadeEClass, 
		   source, 
		   new String[] {
			 "documentation", "A class providing utilities methods for Orbits."
		   });
	}

} //Symphony__CoreEnvironmentOrbitPackageImpl
