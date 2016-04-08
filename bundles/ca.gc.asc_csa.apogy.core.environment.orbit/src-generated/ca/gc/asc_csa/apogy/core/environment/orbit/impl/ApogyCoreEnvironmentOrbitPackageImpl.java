package ca.gc.asc_csa.apogy.core.environment.orbit.impl;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.AbstractFrame;
import ca.gc.asc_csa.apogy.core.environment.orbit.AngularCoordinates;
import ca.gc.asc_csa.apogy.core.environment.orbit.AttitudeProvider;
import ca.gc.asc_csa.apogy.core.environment.orbit.Orbit;
import ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitFacade;
import ca.gc.asc_csa.apogy.core.environment.orbit.OrbitModel;
import ca.gc.asc_csa.apogy.core.environment.orbit.OrbitWorksite;
import ca.gc.asc_csa.apogy.core.environment.orbit.PVACoordinates;
import ca.gc.asc_csa.apogy.core.environment.orbit.PVCoordinatesProviderProvider;
import ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftAttitude;
import ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState;
import ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitFactory;
import ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.TimedStampedAngularCoordinates;
import ca.gc.asc_csa.apogy.core.environment.orbit.TimedStampedPVACoordinates;
import ca.gc.asc_csa.apogy.core.environment.orbit.ValidityRangeProvider;
import java.util.List;
import org.eclipse.emf.ecore.EAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreEnvironmentOrbitPackageImpl extends EPackageImpl implements ApogyCoreEnvironmentOrbitPackage {
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
	private EClass validityRangeProviderEClass = null;

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
	private EClass apogyCoreEnvironmentOrbitFacadeEClass = null;

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
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyCoreEnvironmentOrbitPackageImpl() {
		super(eNS_URI, ApogyCoreEnvironmentOrbitFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyCoreEnvironmentOrbitPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyCoreEnvironmentOrbitPackage init() {
		if (isInited) return (ApogyCoreEnvironmentOrbitPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreEnvironmentOrbitPackage.eNS_URI);

		// Obtain or create and register package
		ApogyCoreEnvironmentOrbitPackageImpl theApogyCoreEnvironmentOrbitPackage = (ApogyCoreEnvironmentOrbitPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCoreEnvironmentOrbitPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCoreEnvironmentOrbitPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCoreEnvironmentPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyCoreEnvironmentOrbitPackage.createPackageContents();

		// Initialize created meta-data
		theApogyCoreEnvironmentOrbitPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCoreEnvironmentOrbitPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCoreEnvironmentOrbitPackage.eNS_URI, theApogyCoreEnvironmentOrbitPackage);
		return theApogyCoreEnvironmentOrbitPackage;
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
	public EReference getOrbitWorksite_OrbitModel() {
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
	public EClass getValidityRangeProvider() {
		return validityRangeProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValidityRangeProvider_FromValidDate() {
		return (EAttribute)validityRangeProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValidityRangeProvider_ToValidDate() {
		return (EAttribute)validityRangeProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValidityRangeProvider__IsDateInValidRange__Date() {
		return validityRangeProviderEClass.getEOperations().get(0);
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
	public EReference getOrbitModel_ReferenceFrame() {
		return (EReference)orbitModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrbitModel_AttitudeProvider() {
		return (EReference)orbitModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOrbitModel__Propagate__Date() {
		return orbitModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOrbitModel__GetSpacecraftStates__Date_Date_double() {
		return orbitModelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyCoreEnvironmentOrbitFacade() {
		return apogyCoreEnvironmentOrbitFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentOrbitFacade__IsDateInValidRange__Date_Date_Date() {
		return apogyCoreEnvironmentOrbitFacadeEClass.getEOperations().get(0);
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
	public ApogyCoreEnvironmentOrbitFactory getApogyCoreEnvironmentOrbitFactory() {
		return (ApogyCoreEnvironmentOrbitFactory)getEFactoryInstance();
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
		createEReference(orbitWorksiteEClass, ORBIT_WORKSITE__ORBIT_MODEL);

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

		orbitEClass = createEClass(ORBIT);
		createEReference(orbitEClass, ORBIT__REFERENCE_FRAME);

		validityRangeProviderEClass = createEClass(VALIDITY_RANGE_PROVIDER);
		createEAttribute(validityRangeProviderEClass, VALIDITY_RANGE_PROVIDER__FROM_VALID_DATE);
		createEAttribute(validityRangeProviderEClass, VALIDITY_RANGE_PROVIDER__TO_VALID_DATE);
		createEOperation(validityRangeProviderEClass, VALIDITY_RANGE_PROVIDER___IS_DATE_IN_VALID_RANGE__DATE);

		orbitModelEClass = createEClass(ORBIT_MODEL);
		createEReference(orbitModelEClass, ORBIT_MODEL__REFERENCE_FRAME);
		createEReference(orbitModelEClass, ORBIT_MODEL__ATTITUDE_PROVIDER);
		createEOperation(orbitModelEClass, ORBIT_MODEL___PROPAGATE__DATE);
		createEOperation(orbitModelEClass, ORBIT_MODEL___GET_SPACECRAFT_STATES__DATE_DATE_DOUBLE);

		apogyCoreEnvironmentOrbitFacadeEClass = createEClass(APOGY_CORE_ENVIRONMENT_ORBIT_FACADE);
		createEOperation(apogyCoreEnvironmentOrbitFacadeEClass, APOGY_CORE_ENVIRONMENT_ORBIT_FACADE___IS_DATE_IN_VALID_RANGE__DATE_DATE_DATE);

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
		ApogyCoreEnvironmentPackage theApogyCoreEnvironmentPackage = (ApogyCoreEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreEnvironmentPackage.eNS_URI);
		ApogyCorePackage theApogyCorePackage = (ApogyCorePackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCorePackage.eNS_URI);
		ApogyCommonEMFPackage theApogyCommonEMFPackage = (ApogyCommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonEMFPackage.eNS_URI);
		ApogyCommonMathPackage theApogyCommonMathPackage = (ApogyCommonMathPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonMathPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters
		addETypeParameter(listEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		orbitWorksiteEClass.getESuperTypes().add(theApogyCoreEnvironmentPackage.getWorksite());
		abstractFrameEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		abstractFrameEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		timedStampedPVACoordinatesEClass.getESuperTypes().add(this.getPVACoordinates());
		timedStampedPVACoordinatesEClass.getESuperTypes().add(theApogyCommonEMFPackage.getTimed());
		timedStampedAngularCoordinatesEClass.getESuperTypes().add(this.getAngularCoordinates());
		timedStampedAngularCoordinatesEClass.getESuperTypes().add(theApogyCommonEMFPackage.getTimed());
		spacecraftAttitudeEClass.getESuperTypes().add(theApogyCommonEMFPackage.getTimed());
		spacecraftStateEClass.getESuperTypes().add(theApogyCommonEMFPackage.getTimed());
		orbitEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		orbitEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		orbitEClass.getESuperTypes().add(theApogyCommonEMFPackage.getTimed());
		orbitModelEClass.getESuperTypes().add(theApogyCorePackage.getAbstractOrbitModel());
		orbitModelEClass.getESuperTypes().add(this.getValidityRangeProvider());

		// Initialize classes, features, and operations; add parameters
		initEClass(orbitWorksiteEClass, OrbitWorksite.class, "OrbitWorksite", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrbitWorksite_OrbitModel(), theApogyCorePackage.getAbstractOrbitModel(), null, "orbitModel", null, 0, 1, OrbitWorksite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractFrameEClass, AbstractFrame.class, "AbstractFrame", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pvaCoordinatesEClass, PVACoordinates.class, "PVACoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPVACoordinates_Position(), theApogyCommonMathPackage.getTuple3d(), null, "position", null, 1, 1, PVACoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPVACoordinates_Velocity(), theApogyCommonMathPackage.getTuple3d(), null, "velocity", null, 1, 1, PVACoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPVACoordinates_Acceleration(), theApogyCommonMathPackage.getTuple3d(), null, "acceleration", null, 1, 1, PVACoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPVACoordinates_AngularVelocity(), theApogyCommonMathPackage.getTuple3d(), null, "angularVelocity", null, 1, 1, PVACoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timedStampedPVACoordinatesEClass, TimedStampedPVACoordinates.class, "TimedStampedPVACoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pvCoordinatesProviderProviderEClass, PVCoordinatesProviderProvider.class, "PVCoordinatesProviderProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getPVCoordinatesProviderProvider__GetPVCoordinates__Date_AbstractFrame(), this.getTimedStampedPVACoordinates(), "getPVCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractFrame(), "frame", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(angularCoordinatesEClass, AngularCoordinates.class, "AngularCoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAngularCoordinates_Rotation(), theApogyCommonMathPackage.getMatrix3x3(), null, "rotation", null, 0, 1, AngularCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngularCoordinates_AngularRate(), theApogyCommonMathPackage.getTuple3d(), null, "angularRate", null, 1, 1, AngularCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAngularCoordinates_AngularAcceleration(), theApogyCommonMathPackage.getTuple3d(), null, "angularAcceleration", null, 1, 1, AngularCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(orbitEClass, Orbit.class, "Orbit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrbit_ReferenceFrame(), this.getAbstractFrame(), null, "referenceFrame", null, 0, 1, Orbit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validityRangeProviderEClass, ValidityRangeProvider.class, "ValidityRangeProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValidityRangeProvider_FromValidDate(), theEcorePackage.getEDate(), "fromValidDate", null, 1, 1, ValidityRangeProvider.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidityRangeProvider_ToValidDate(), theEcorePackage.getEDate(), "toValidDate", null, 1, 1, ValidityRangeProvider.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getValidityRangeProvider__IsDateInValidRange__Date(), theEcorePackage.getEBoolean(), "isDateInValidRange", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(orbitModelEClass, OrbitModel.class, "OrbitModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrbitModel_ReferenceFrame(), this.getAbstractFrame(), null, "referenceFrame", null, 0, 1, OrbitModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrbitModel_AttitudeProvider(), this.getAttitudeProvider(), null, "attitudeProvider", null, 0, -1, OrbitModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getOrbitModel__Propagate__Date(), this.getSpacecraftState(), "propagate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "targetDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getOrbitModel__GetSpacecraftStates__Date_Date_double(), null, "getSpacecraftStates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "startDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "endDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "timeInterval", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());
		EGenericType g1 = createEGenericType(this.getList());
		EGenericType g2 = createEGenericType(this.getSpacecraftState());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(apogyCoreEnvironmentOrbitFacadeEClass, ApogyCoreEnvironmentOrbitFacade.class, "ApogyCoreEnvironmentOrbitFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getApogyCoreEnvironmentOrbitFacade__IsDateInValidRange__Date_Date_Date(), theEcorePackage.getEBoolean(), "isDateInValidRange", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "fromDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "toDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);

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
			 "documentation", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca),\n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "prefix", "ApogyCoreEnvironmentOrbit",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "modelName", "ApogyCoreEnvironmentOrbit",
			 "complianceLevel", "8.0",
			 "suppressGenModelAnnotations", "false",
			 "dynamicTemplates", "true",
			 "templateDirectory", "platform:/plugin/ca.gc.asc_csa.apogy.common.emf/templates",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.core.environment.orbit/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.core.environment.orbit.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.core.environment"
		   });	
		addAnnotation
		  (getOrbitWorksite_OrbitModel(), 
		   source, 
		   new String[] {
			 "documentation", "The active OrbitModel to use to update the orbit worksite."
		   });	
		addAnnotation
		  (getPVACoordinates_Position(), 
		   source, 
		   new String[] {
			 "documentation", "The position.",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getPVACoordinates_Velocity(), 
		   source, 
		   new String[] {
			 "documentation", "The velocity.",
			 "apogy_units", "m/s"
		   });	
		addAnnotation
		  (getPVACoordinates_Acceleration(), 
		   source, 
		   new String[] {
			 "documentation", "The acceleration.",
			 "apogy_units", "m/s\u00b2"
		   });	
		addAnnotation
		  (getPVACoordinates_AngularVelocity(), 
		   source, 
		   new String[] {
			 "documentation", "The angular velocity (spin) of this point as seen from the origin.",
			 "apogy_units", "rad/s"
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
		  (getValidityRangeProvider__IsDateInValidRange__Date(), 
		   source, 
		   new String[] {
			 "documentation", "Returns whether or not a specified date falls within the validity range."
		   });	
		addAnnotation
		  (getValidityRangeProvider_FromValidDate(), 
		   source, 
		   new String[] {
			 "documentation", "Defines the earliest date for which the data is valid."
		   });	
		addAnnotation
		  (getValidityRangeProvider_ToValidDate(), 
		   source, 
		   new String[] {
			 "documentation", "Defines the latest date for which the data is valid."
		   });	
		addAnnotation
		  (orbitModelEClass, 
		   source, 
		   new String[] {
			 "documentation", "Class that defines an orbit model. An orbit model specifies both initial condition (through the initial Orbit), and\na propagation method (through the AbstractOrbitPropagator)."
		   });	
		addAnnotation
		  (getOrbitModel__Propagate__Date(), 
		   source, 
		   new String[] {
			 "documentation", "Propagate the current orbit to a specified time to get a Spacecraft state."
		   });	
		addAnnotation
		  (getOrbitModel__GetSpacecraftStates__Date_Date_double(), 
		   source, 
		   new String[] {
			 "documentation", "Returns a list of SpacecraftState from startDate to endDate at time interval of timeInterval.\n@param timeInterval The time interval to get spacecraft states, in seconds."
		   });	
		addAnnotation
		  ((getOrbitModel__GetSpacecraftStates__Date_Date_double()).getEParameters().get(2), 
		   source, 
		   new String[] {
			 "apogy_units", "s"
		   });	
		addAnnotation
		  (getOrbitModel_ReferenceFrame(), 
		   source, 
		   new String[] {
			 "documentation", "The frame in which the orbit is propagated."
		   });	
		addAnnotation
		  (getOrbitModel_AttitudeProvider(), 
		   source, 
		   new String[] {
			 "documentation", "The attitude provider. Can be used to specify an attitude control law."
		   });	
		addAnnotation
		  (apogyCoreEnvironmentOrbitFacadeEClass, 
		   source, 
		   new String[] {
			 "documentation", "A class providing utilities methods for Orbits."
		   });
	}

} //ApogyCoreEnvironmentOrbitPackageImpl
