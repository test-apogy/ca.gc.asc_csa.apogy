/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Canadian Space Agency (CSA) - Initial API and implementation
 * -Pierre Allard (Pierre.Allard@canada.ca),
 * -Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 * -Sebastien Gemme (Sebastien.Gemme@canada.ca)
 */
package ca.gc.asc_csa.apogy.examples.satellite.impl;

import java.util.Comparator;
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
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationCommandPlan;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationDownlinkItem;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractRequestBasedSatelliteCommand;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractSatelliteCommand;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractUID;
import ca.gc.asc_csa.apogy.examples.satellite.AcquireImageSatelliteCommand;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatelliteFacade;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatelliteFactory;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlansList;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlink;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlinksList;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationPlannersContainer;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestPriority;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestStatus;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsListsContainer;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationState;
import ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellation;
import ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellationCommandPlan;
import ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellationPlanner;
import ca.gc.asc_csa.apogy.examples.satellite.ImageConstellationRequest;
import ca.gc.asc_csa.apogy.examples.satellite.ObservationConstellationRequest;
import ca.gc.asc_csa.apogy.examples.satellite.OrbitalImage;
import ca.gc.asc_csa.apogy.examples.satellite.OrbitalImageConstellationDownlinkItem;
import ca.gc.asc_csa.apogy.examples.satellite.Satellite;
import ca.gc.asc_csa.apogy.examples.satellite.SatelliteCommandsList;
import ca.gc.asc_csa.apogy.examples.satellite.SatellitesList;
import ca.gc.asc_csa.apogy.examples.satellite.SimpleRequest;
import ca.gc.asc_csa.apogy.examples.satellite.StringUID;
import ca.gc.asc_csa.apogy.examples.satellite.VisibilityPassBasedSatelliteCommand;

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
	private EClass apogyExamplesSatelliteFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractUIDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringUIDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constellationCommandPlansListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constellationStateEClass = null;

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
	private EClass defaultConstellationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constellationPlannersContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractConstellationPlannerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultConstellationPlannerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractConstellationCommandPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satelliteCommandsListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultConstellationCommandPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constellationRequestsListsContainerEClass = null;

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
	private EClass simpleRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationConstellationRequestEClass = null;

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
	private EClass abstractRequestBasedSatelliteCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visibilityPassBasedSatelliteCommandEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType comparatorEDataType = null;

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
	public EClass getApogyExamplesSatelliteFacade() {
		return apogyExamplesSatelliteFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractUID() {
		return abstractUIDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringUID() {
		return stringUIDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringUID_Id() {
		return (EAttribute)stringUIDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstellationCommandPlansList() {
		return constellationCommandPlansListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstellationCommandPlansList_ConstellationState() {
		return (EReference)constellationCommandPlansListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstellationCommandPlansList_Plans() {
		return (EReference)constellationCommandPlansListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstellationState() {
		return constellationStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstellationState_ConstellationCommandPlansList() {
		return (EReference)constellationStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstellationState_SatellitesList() {
		return (EReference)constellationStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstellationState_GroundStationsReferencesList() {
		return (EReference)constellationStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstellationState_DownlinksLists() {
		return (EReference)constellationStateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstellationState_ConstellationRequestsListsContainer() {
		return (EReference)constellationStateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstellationState_ConstellationPlannersContainer() {
		return (EReference)constellationStateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstellationState__ImportConstellationRequests__String() {
		return constellationStateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstellationState__Export__AbstractConstellationCommandPlan_String() {
		return constellationStateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstellationState__ImportConstellationDownlinkItems__String() {
		return constellationStateEClass.getEOperations().get(2);
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
	public EReference getAbstractConstellation_ConstellationState() {
		return (EReference)abstractConstellationEClass.getEStructuralFeatures().get(0);
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
	public EClass getConstellationPlannersContainer() {
		return constellationPlannersContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstellationPlannersContainer_ConstellationState() {
		return (EReference)constellationPlannersContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstellationPlannersContainer_ConstellationPlanners() {
		return (EReference)constellationPlannersContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractConstellationPlanner() {
		return abstractConstellationPlannerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConstellationPlanner_ConstellationPlannersContainer() {
		return (EReference)abstractConstellationPlannerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConstellationPlanner_ConstellationState() {
		return (EReference)abstractConstellationPlannerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractConstellationPlanner_StartDate() {
		return (EAttribute)abstractConstellationPlannerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractConstellationPlanner_EndDate() {
		return (EAttribute)abstractConstellationPlannerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConstellationPlanner_ConstellationRequestsList() {
		return (EReference)abstractConstellationPlannerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConstellationPlanner_ConstellationCommandPlan() {
		return (EReference)abstractConstellationPlannerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractConstellationPlanner_MaxNumberThreads() {
		return (EAttribute)abstractConstellationPlannerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractConstellationPlanner_CommandDuplicatesPreserved() {
		return (EAttribute)abstractConstellationPlannerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConstellationPlanner_ElevationMask() {
		return (EReference)abstractConstellationPlannerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractConstellationPlanner__IsValid__VisibilityPass() {
		return abstractConstellationPlannerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractConstellationPlanner__GetSatellite__EarthOrbitModel() {
		return abstractConstellationPlannerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractConstellationPlanner__Plan() {
		return abstractConstellationPlannerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractConstellationPlanner__Validate() {
		return abstractConstellationPlannerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractConstellationPlanner__GetRequestBasedSatelliteCommandsComparator() {
		return abstractConstellationPlannerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractConstellationPlanner__CreateVisibilityPassBasedSatelliteCommand__ObservationConstellationRequest_VisibilityPass() {
		return abstractConstellationPlannerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractConstellationPlanner__PopulateVisibilityPassBasedSatelliteCommand__VisibilityPassBasedSatelliteCommand_ObservationConstellationRequest_VisibilityPass() {
		return abstractConstellationPlannerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultConstellationPlanner() {
		return defaultConstellationPlannerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultConstellationPlanner_UmbraPassesValid() {
		return (EAttribute)defaultConstellationPlannerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultConstellationPlanner_SatelliteRollCommandValid() {
		return (EAttribute)defaultConstellationPlannerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultConstellationPlanner_SunHorizonAngleUmbraThreshold() {
		return (EAttribute)defaultConstellationPlannerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractConstellationCommandPlan() {
		return abstractConstellationCommandPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConstellationCommandPlan_CommandPlansList() {
		return (EReference)abstractConstellationCommandPlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConstellationCommandPlan_ConstellationState() {
		return (EReference)abstractConstellationCommandPlanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConstellationCommandPlan_SatelliteCommandsList() {
		return (EReference)abstractConstellationCommandPlanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSatelliteCommandsList() {
		return satelliteCommandsListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSatelliteCommandsList_ConstellationCommands() {
		return (EReference)satelliteCommandsListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultConstellationCommandPlan() {
		return defaultConstellationCommandPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstellationRequestsListsContainer() {
		return constellationRequestsListsContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstellationRequestsListsContainer_ConstellationState() {
		return (EReference)constellationRequestsListsContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstellationRequestsListsContainer_ConstellationRequestsLists() {
		return (EReference)constellationRequestsListsContainerEClass.getEStructuralFeatures().get(1);
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
	public EReference getConstellationRequestsList_ConstellationRequestsListsContainer() {
		return (EReference)constellationRequestsListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstellationRequestsList_ConstellationState() {
		return (EReference)constellationRequestsListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstellationRequestsList_ConstellationRequests() {
		return (EReference)constellationRequestsListEClass.getEStructuralFeatures().get(2);
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
	public EReference getAbstractConstellationRequest_Uid() {
		return (EReference)abstractConstellationRequestEClass.getEStructuralFeatures().get(0);
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
	public EClass getSimpleRequest() {
		return simpleRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservationConstellationRequest() {
		return observationConstellationRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationConstellationRequest_Location() {
		return (EReference)observationConstellationRequestEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getSatellite_MaximumRoll() {
		return (EAttribute)satelliteEClass.getEStructuralFeatures().get(1);
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
	public EReference getAbstractSatelliteCommand_Uid() {
		return (EReference)abstractSatelliteCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractSatelliteCommand_Satellite() {
		return (EReference)abstractSatelliteCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractRequestBasedSatelliteCommand() {
		return abstractRequestBasedSatelliteCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractRequestBasedSatelliteCommand_ConstellationRequest() {
		return (EReference)abstractRequestBasedSatelliteCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisibilityPassBasedSatelliteCommand() {
		return visibilityPassBasedSatelliteCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisibilityPassBasedSatelliteCommand_VisibilityPass() {
		return (EReference)visibilityPassBasedSatelliteCommandEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getOrbitalImage_RollAngle() {
		return (EAttribute)orbitalImageEClass.getEStructuralFeatures().get(0);
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
	public EReference getConstellationDownlinksList_ConstellationState() {
		return (EReference)constellationDownlinksListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstellationDownlinksList_Downlinks() {
		return (EReference)constellationDownlinksListEClass.getEStructuralFeatures().get(1);
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
	public EReference getConstellationDownlink_ConstellationDownlinksList() {
		return (EReference)constellationDownlinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstellationDownlink_DownlinkItems() {
		return (EReference)constellationDownlinkEClass.getEStructuralFeatures().get(1);
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
	public EReference getAbstractConstellationDownlinkItem_RequestUID() {
		return (EReference)abstractConstellationDownlinkItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConstellationDownlinkItem_Request() {
		return (EReference)abstractConstellationDownlinkItemEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getOrbitalImageConstellationDownlinkItem_ImageURL() {
		return (EAttribute)orbitalImageConstellationDownlinkItemEClass.getEStructuralFeatures().get(0);
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
	public EDataType getComparator() {
		return comparatorEDataType;
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
		apogyExamplesSatelliteFacadeEClass = createEClass(APOGY_EXAMPLES_SATELLITE_FACADE);

		abstractUIDEClass = createEClass(ABSTRACT_UID);

		stringUIDEClass = createEClass(STRING_UID);
		createEAttribute(stringUIDEClass, STRING_UID__ID);

		constellationCommandPlansListEClass = createEClass(CONSTELLATION_COMMAND_PLANS_LIST);
		createEReference(constellationCommandPlansListEClass, CONSTELLATION_COMMAND_PLANS_LIST__CONSTELLATION_STATE);
		createEReference(constellationCommandPlansListEClass, CONSTELLATION_COMMAND_PLANS_LIST__PLANS);

		constellationStateEClass = createEClass(CONSTELLATION_STATE);
		createEReference(constellationStateEClass, CONSTELLATION_STATE__CONSTELLATION_COMMAND_PLANS_LIST);
		createEReference(constellationStateEClass, CONSTELLATION_STATE__SATELLITES_LIST);
		createEReference(constellationStateEClass, CONSTELLATION_STATE__GROUND_STATIONS_REFERENCES_LIST);
		createEReference(constellationStateEClass, CONSTELLATION_STATE__DOWNLINKS_LISTS);
		createEReference(constellationStateEClass, CONSTELLATION_STATE__CONSTELLATION_REQUESTS_LISTS_CONTAINER);
		createEReference(constellationStateEClass, CONSTELLATION_STATE__CONSTELLATION_PLANNERS_CONTAINER);
		createEOperation(constellationStateEClass, CONSTELLATION_STATE___IMPORT_CONSTELLATION_REQUESTS__STRING);
		createEOperation(constellationStateEClass, CONSTELLATION_STATE___EXPORT__ABSTRACTCONSTELLATIONCOMMANDPLAN_STRING);
		createEOperation(constellationStateEClass, CONSTELLATION_STATE___IMPORT_CONSTELLATION_DOWNLINK_ITEMS__STRING);

		abstractConstellationEClass = createEClass(ABSTRACT_CONSTELLATION);
		createEReference(abstractConstellationEClass, ABSTRACT_CONSTELLATION__CONSTELLATION_STATE);

		defaultConstellationEClass = createEClass(DEFAULT_CONSTELLATION);

		constellationPlannersContainerEClass = createEClass(CONSTELLATION_PLANNERS_CONTAINER);
		createEReference(constellationPlannersContainerEClass, CONSTELLATION_PLANNERS_CONTAINER__CONSTELLATION_STATE);
		createEReference(constellationPlannersContainerEClass, CONSTELLATION_PLANNERS_CONTAINER__CONSTELLATION_PLANNERS);

		abstractConstellationPlannerEClass = createEClass(ABSTRACT_CONSTELLATION_PLANNER);
		createEReference(abstractConstellationPlannerEClass, ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_PLANNERS_CONTAINER);
		createEReference(abstractConstellationPlannerEClass, ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_STATE);
		createEAttribute(abstractConstellationPlannerEClass, ABSTRACT_CONSTELLATION_PLANNER__START_DATE);
		createEAttribute(abstractConstellationPlannerEClass, ABSTRACT_CONSTELLATION_PLANNER__END_DATE);
		createEReference(abstractConstellationPlannerEClass, ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_REQUESTS_LIST);
		createEReference(abstractConstellationPlannerEClass, ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_COMMAND_PLAN);
		createEAttribute(abstractConstellationPlannerEClass, ABSTRACT_CONSTELLATION_PLANNER__MAX_NUMBER_THREADS);
		createEAttribute(abstractConstellationPlannerEClass, ABSTRACT_CONSTELLATION_PLANNER__COMMAND_DUPLICATES_PRESERVED);
		createEReference(abstractConstellationPlannerEClass, ABSTRACT_CONSTELLATION_PLANNER__ELEVATION_MASK);
		createEOperation(abstractConstellationPlannerEClass, ABSTRACT_CONSTELLATION_PLANNER___IS_VALID__VISIBILITYPASS);
		createEOperation(abstractConstellationPlannerEClass, ABSTRACT_CONSTELLATION_PLANNER___GET_SATELLITE__EARTHORBITMODEL);
		createEOperation(abstractConstellationPlannerEClass, ABSTRACT_CONSTELLATION_PLANNER___PLAN);
		createEOperation(abstractConstellationPlannerEClass, ABSTRACT_CONSTELLATION_PLANNER___VALIDATE);
		createEOperation(abstractConstellationPlannerEClass, ABSTRACT_CONSTELLATION_PLANNER___GET_REQUEST_BASED_SATELLITE_COMMANDS_COMPARATOR);
		createEOperation(abstractConstellationPlannerEClass, ABSTRACT_CONSTELLATION_PLANNER___CREATE_VISIBILITY_PASS_BASED_SATELLITE_COMMAND__OBSERVATIONCONSTELLATIONREQUEST_VISIBILITYPASS);
		createEOperation(abstractConstellationPlannerEClass, ABSTRACT_CONSTELLATION_PLANNER___POPULATE_VISIBILITY_PASS_BASED_SATELLITE_COMMAND__VISIBILITYPASSBASEDSATELLITECOMMAND_OBSERVATIONCONSTELLATIONREQUEST_VISIBILITYPASS);

		defaultConstellationPlannerEClass = createEClass(DEFAULT_CONSTELLATION_PLANNER);
		createEAttribute(defaultConstellationPlannerEClass, DEFAULT_CONSTELLATION_PLANNER__UMBRA_PASSES_VALID);
		createEAttribute(defaultConstellationPlannerEClass, DEFAULT_CONSTELLATION_PLANNER__SATELLITE_ROLL_COMMAND_VALID);
		createEAttribute(defaultConstellationPlannerEClass, DEFAULT_CONSTELLATION_PLANNER__SUN_HORIZON_ANGLE_UMBRA_THRESHOLD);

		abstractConstellationCommandPlanEClass = createEClass(ABSTRACT_CONSTELLATION_COMMAND_PLAN);
		createEReference(abstractConstellationCommandPlanEClass, ABSTRACT_CONSTELLATION_COMMAND_PLAN__COMMAND_PLANS_LIST);
		createEReference(abstractConstellationCommandPlanEClass, ABSTRACT_CONSTELLATION_COMMAND_PLAN__CONSTELLATION_STATE);
		createEReference(abstractConstellationCommandPlanEClass, ABSTRACT_CONSTELLATION_COMMAND_PLAN__SATELLITE_COMMANDS_LIST);

		satelliteCommandsListEClass = createEClass(SATELLITE_COMMANDS_LIST);
		createEReference(satelliteCommandsListEClass, SATELLITE_COMMANDS_LIST__CONSTELLATION_COMMANDS);

		defaultConstellationCommandPlanEClass = createEClass(DEFAULT_CONSTELLATION_COMMAND_PLAN);

		constellationRequestsListsContainerEClass = createEClass(CONSTELLATION_REQUESTS_LISTS_CONTAINER);
		createEReference(constellationRequestsListsContainerEClass, CONSTELLATION_REQUESTS_LISTS_CONTAINER__CONSTELLATION_STATE);
		createEReference(constellationRequestsListsContainerEClass, CONSTELLATION_REQUESTS_LISTS_CONTAINER__CONSTELLATION_REQUESTS_LISTS);

		constellationRequestsListEClass = createEClass(CONSTELLATION_REQUESTS_LIST);
		createEReference(constellationRequestsListEClass, CONSTELLATION_REQUESTS_LIST__CONSTELLATION_REQUESTS_LISTS_CONTAINER);
		createEReference(constellationRequestsListEClass, CONSTELLATION_REQUESTS_LIST__CONSTELLATION_STATE);
		createEReference(constellationRequestsListEClass, CONSTELLATION_REQUESTS_LIST__CONSTELLATION_REQUESTS);

		abstractConstellationRequestEClass = createEClass(ABSTRACT_CONSTELLATION_REQUEST);
		createEReference(abstractConstellationRequestEClass, ABSTRACT_CONSTELLATION_REQUEST__UID);
		createEAttribute(abstractConstellationRequestEClass, ABSTRACT_CONSTELLATION_REQUEST__ORDER_PRIORITY);
		createEAttribute(abstractConstellationRequestEClass, ABSTRACT_CONSTELLATION_REQUEST__ORDER_STATUS);

		simpleRequestEClass = createEClass(SIMPLE_REQUEST);

		observationConstellationRequestEClass = createEClass(OBSERVATION_CONSTELLATION_REQUEST);
		createEReference(observationConstellationRequestEClass, OBSERVATION_CONSTELLATION_REQUEST__LOCATION);

		imageConstellationRequestEClass = createEClass(IMAGE_CONSTELLATION_REQUEST);
		createEReference(imageConstellationRequestEClass, IMAGE_CONSTELLATION_REQUEST__IMAGE);

		satellitesListEClass = createEClass(SATELLITES_LIST);
		createEReference(satellitesListEClass, SATELLITES_LIST__SATELLITES);

		satelliteEClass = createEClass(SATELLITE);
		createEReference(satelliteEClass, SATELLITE__ORBIT_MODEL);
		createEAttribute(satelliteEClass, SATELLITE__MAXIMUM_ROLL);

		abstractSatelliteCommandEClass = createEClass(ABSTRACT_SATELLITE_COMMAND);
		createEReference(abstractSatelliteCommandEClass, ABSTRACT_SATELLITE_COMMAND__UID);
		createEReference(abstractSatelliteCommandEClass, ABSTRACT_SATELLITE_COMMAND__SATELLITE);

		abstractRequestBasedSatelliteCommandEClass = createEClass(ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND);
		createEReference(abstractRequestBasedSatelliteCommandEClass, ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND__CONSTELLATION_REQUEST);

		visibilityPassBasedSatelliteCommandEClass = createEClass(VISIBILITY_PASS_BASED_SATELLITE_COMMAND);
		createEReference(visibilityPassBasedSatelliteCommandEClass, VISIBILITY_PASS_BASED_SATELLITE_COMMAND__VISIBILITY_PASS);

		acquireImageSatelliteCommandEClass = createEClass(ACQUIRE_IMAGE_SATELLITE_COMMAND);
		createEAttribute(acquireImageSatelliteCommandEClass, ACQUIRE_IMAGE_SATELLITE_COMMAND__ROLL_ANGLE);

		orbitalImageEClass = createEClass(ORBITAL_IMAGE);
		createEAttribute(orbitalImageEClass, ORBITAL_IMAGE__ROLL_ANGLE);

		constellationDownlinksListEClass = createEClass(CONSTELLATION_DOWNLINKS_LIST);
		createEReference(constellationDownlinksListEClass, CONSTELLATION_DOWNLINKS_LIST__CONSTELLATION_STATE);
		createEReference(constellationDownlinksListEClass, CONSTELLATION_DOWNLINKS_LIST__DOWNLINKS);

		constellationDownlinkEClass = createEClass(CONSTELLATION_DOWNLINK);
		createEReference(constellationDownlinkEClass, CONSTELLATION_DOWNLINK__CONSTELLATION_DOWNLINKS_LIST);
		createEReference(constellationDownlinkEClass, CONSTELLATION_DOWNLINK__DOWNLINK_ITEMS);

		abstractConstellationDownlinkItemEClass = createEClass(ABSTRACT_CONSTELLATION_DOWNLINK_ITEM);
		createEReference(abstractConstellationDownlinkItemEClass, ABSTRACT_CONSTELLATION_DOWNLINK_ITEM__REQUEST_UID);
		createEReference(abstractConstellationDownlinkItemEClass, ABSTRACT_CONSTELLATION_DOWNLINK_ITEM__REQUEST);

		orbitalImageConstellationDownlinkItemEClass = createEClass(ORBITAL_IMAGE_CONSTELLATION_DOWNLINK_ITEM);
		createEAttribute(orbitalImageConstellationDownlinkItemEClass, ORBITAL_IMAGE_CONSTELLATION_DOWNLINK_ITEM__IMAGE_URL);

		// Create enums
		constellationRequestPriorityEEnum = createEEnum(CONSTELLATION_REQUEST_PRIORITY);
		constellationRequestStatusEEnum = createEEnum(CONSTELLATION_REQUEST_STATUS);

		// Create data types
		listEDataType = createEDataType(LIST);
		sortedSetEDataType = createEDataType(SORTED_SET);
		comparatorEDataType = createEDataType(COMPARATOR);
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
		ApogyCoreEnvironmentOrbitEarthPackage theApogyCoreEnvironmentOrbitEarthPackage = (ApogyCoreEnvironmentOrbitEarthPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreEnvironmentOrbitEarthPackage.eNS_URI);
		ApogyCommonEMFPackage theApogyCommonEMFPackage = (ApogyCommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonEMFPackage.eNS_URI);
		ApogyCorePackage theApogyCorePackage = (ApogyCorePackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCorePackage.eNS_URI);
		ApogyCoreEnvironmentPackage theApogyCoreEnvironmentPackage = (ApogyCoreEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreEnvironmentPackage.eNS_URI);
		ApogyCommonImagesPackage theApogyCommonImagesPackage = (ApogyCommonImagesPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonImagesPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(listEDataType, "T");
		addETypeParameter(sortedSetEDataType, "T");
		addETypeParameter(comparatorEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		stringUIDEClass.getESuperTypes().add(this.getAbstractUID());
		abstractConstellationEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		abstractConstellationEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		defaultConstellationEClass.getESuperTypes().add(this.getAbstractConstellation());
		abstractConstellationPlannerEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		abstractConstellationPlannerEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		defaultConstellationPlannerEClass.getESuperTypes().add(this.getAbstractConstellationPlanner());
		abstractConstellationCommandPlanEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		abstractConstellationCommandPlanEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		defaultConstellationCommandPlanEClass.getESuperTypes().add(this.getAbstractConstellationCommandPlan());
		constellationRequestsListEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		constellationRequestsListEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		simpleRequestEClass.getESuperTypes().add(this.getAbstractConstellationRequest());
		observationConstellationRequestEClass.getESuperTypes().add(this.getAbstractConstellationRequest());
		imageConstellationRequestEClass.getESuperTypes().add(this.getObservationConstellationRequest());
		satelliteEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		abstractSatelliteCommandEClass.getESuperTypes().add(theApogyCommonEMFPackage.getTimed());
		abstractRequestBasedSatelliteCommandEClass.getESuperTypes().add(this.getAbstractSatelliteCommand());
		visibilityPassBasedSatelliteCommandEClass.getESuperTypes().add(this.getAbstractRequestBasedSatelliteCommand());
		acquireImageSatelliteCommandEClass.getESuperTypes().add(this.getAbstractRequestBasedSatelliteCommand());
		acquireImageSatelliteCommandEClass.getESuperTypes().add(theApogyCoreEnvironmentPackage.getGeographicCoordinates());
		orbitalImageEClass.getESuperTypes().add(theApogyCommonImagesPackage.getEImage());
		orbitalImageEClass.getESuperTypes().add(theApogyCoreEnvironmentPackage.getGeographicCoordinates());
		constellationDownlinksListEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		constellationDownlinksListEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		orbitalImageConstellationDownlinkItemEClass.getESuperTypes().add(this.getAbstractConstellationDownlinkItem());

		// Initialize classes, features, and operations; add parameters
		initEClass(apogyExamplesSatelliteFacadeEClass, ApogyExamplesSatelliteFacade.class, "ApogyExamplesSatelliteFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractUIDEClass, AbstractUID.class, "AbstractUID", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringUIDEClass, StringUID.class, "StringUID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringUID_Id(), theEcorePackage.getEString(), "id", null, 0, 1, StringUID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constellationCommandPlansListEClass, ConstellationCommandPlansList.class, "ConstellationCommandPlansList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstellationCommandPlansList_ConstellationState(), this.getConstellationState(), this.getConstellationState_ConstellationCommandPlansList(), "constellationState", null, 0, 1, ConstellationCommandPlansList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstellationCommandPlansList_Plans(), this.getAbstractConstellationCommandPlan(), this.getAbstractConstellationCommandPlan_CommandPlansList(), "plans", null, 0, -1, ConstellationCommandPlansList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constellationStateEClass, ConstellationState.class, "ConstellationState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstellationState_ConstellationCommandPlansList(), this.getConstellationCommandPlansList(), this.getConstellationCommandPlansList_ConstellationState(), "constellationCommandPlansList", null, 0, 1, ConstellationState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstellationState_SatellitesList(), this.getSatellitesList(), null, "satellitesList", null, 0, 1, ConstellationState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstellationState_GroundStationsReferencesList(), theApogyCoreEnvironmentOrbitEarthPackage.getGroundStationReferencesList(), null, "groundStationsReferencesList", null, 0, 1, ConstellationState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstellationState_DownlinksLists(), this.getConstellationDownlinksList(), this.getConstellationDownlinksList_ConstellationState(), "downlinksLists", null, 0, 1, ConstellationState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstellationState_ConstellationRequestsListsContainer(), this.getConstellationRequestsListsContainer(), this.getConstellationRequestsListsContainer_ConstellationState(), "constellationRequestsListsContainer", null, 0, 1, ConstellationState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstellationState_ConstellationPlannersContainer(), this.getConstellationPlannersContainer(), this.getConstellationPlannersContainer_ConstellationState(), "constellationPlannersContainer", null, 0, 1, ConstellationState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getConstellationState__ImportConstellationRequests__String(), null, "importConstellationRequests", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "url", 0, 1, !IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(this.getList());
		EGenericType g2 = createEGenericType(this.getAbstractConstellationRequest());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getConstellationState__Export__AbstractConstellationCommandPlan_String(), null, "export", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractConstellationCommandPlan(), "plan", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "url", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConstellationState__ImportConstellationDownlinkItems__String(), null, "importConstellationDownlinkItems", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "url", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getAbstractConstellationDownlinkItem());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(abstractConstellationEClass, AbstractConstellation.class, "AbstractConstellation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractConstellation_ConstellationState(), this.getConstellationState(), null, "constellationState", null, 0, 1, AbstractConstellation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultConstellationEClass, DefaultConstellation.class, "DefaultConstellation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constellationPlannersContainerEClass, ConstellationPlannersContainer.class, "ConstellationPlannersContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstellationPlannersContainer_ConstellationState(), this.getConstellationState(), this.getConstellationState_ConstellationPlannersContainer(), "constellationState", null, 0, 1, ConstellationPlannersContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstellationPlannersContainer_ConstellationPlanners(), this.getAbstractConstellationPlanner(), this.getAbstractConstellationPlanner_ConstellationPlannersContainer(), "constellationPlanners", null, 0, -1, ConstellationPlannersContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractConstellationPlannerEClass, AbstractConstellationPlanner.class, "AbstractConstellationPlanner", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractConstellationPlanner_ConstellationPlannersContainer(), this.getConstellationPlannersContainer(), this.getConstellationPlannersContainer_ConstellationPlanners(), "constellationPlannersContainer", null, 0, 1, AbstractConstellationPlanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractConstellationPlanner_ConstellationState(), this.getConstellationState(), null, "constellationState", null, 0, 1, AbstractConstellationPlanner.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractConstellationPlanner_StartDate(), theEcorePackage.getEDate(), "startDate", null, 1, 1, AbstractConstellationPlanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractConstellationPlanner_EndDate(), theEcorePackage.getEDate(), "endDate", null, 1, 1, AbstractConstellationPlanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractConstellationPlanner_ConstellationRequestsList(), this.getConstellationRequestsList(), null, "constellationRequestsList", null, 1, 1, AbstractConstellationPlanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractConstellationPlanner_ConstellationCommandPlan(), this.getAbstractConstellationCommandPlan(), null, "constellationCommandPlan", null, 1, 1, AbstractConstellationPlanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractConstellationPlanner_MaxNumberThreads(), theEcorePackage.getEInt(), "maxNumberThreads", "0", 0, 1, AbstractConstellationPlanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractConstellationPlanner_CommandDuplicatesPreserved(), theEcorePackage.getEBoolean(), "commandDuplicatesPreserved", "false", 0, 1, AbstractConstellationPlanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractConstellationPlanner_ElevationMask(), theApogyCoreEnvironmentOrbitEarthPackage.getConstantElevationMask(), null, "elevationMask", null, 1, 1, AbstractConstellationPlanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAbstractConstellationPlanner__IsValid__VisibilityPass(), theEcorePackage.getEBoolean(), "isValid", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreEnvironmentOrbitEarthPackage.getVisibilityPass(), "visibilityPass", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractConstellationPlanner__GetSatellite__EarthOrbitModel(), this.getSatellite(), "getSatellite", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreEnvironmentOrbitEarthPackage.getEarthOrbitModel(), "orbitModel", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractConstellationPlanner__Plan(), null, "plan", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, theApogyCorePackage.getException());

		op = initEOperation(getAbstractConstellationPlanner__Validate(), null, "validate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, theApogyCorePackage.getException());

		op = initEOperation(getAbstractConstellationPlanner__GetRequestBasedSatelliteCommandsComparator(), null, "getRequestBasedSatelliteCommandsComparator", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getComparator());
		g2 = createEGenericType(this.getAbstractRequestBasedSatelliteCommand());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getAbstractConstellationPlanner__CreateVisibilityPassBasedSatelliteCommand__ObservationConstellationRequest_VisibilityPass(), this.getVisibilityPassBasedSatelliteCommand(), "createVisibilityPassBasedSatelliteCommand", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObservationConstellationRequest(), "request", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreEnvironmentOrbitEarthPackage.getVisibilityPass(), "visibilityPass", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractConstellationPlanner__PopulateVisibilityPassBasedSatelliteCommand__VisibilityPassBasedSatelliteCommand_ObservationConstellationRequest_VisibilityPass(), null, "populateVisibilityPassBasedSatelliteCommand", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVisibilityPassBasedSatelliteCommand(), "command", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObservationConstellationRequest(), "request", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreEnvironmentOrbitEarthPackage.getVisibilityPass(), "visibilityPass", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(defaultConstellationPlannerEClass, DefaultConstellationPlanner.class, "DefaultConstellationPlanner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultConstellationPlanner_UmbraPassesValid(), theEcorePackage.getEBoolean(), "umbraPassesValid", "false", 0, 1, DefaultConstellationPlanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultConstellationPlanner_SatelliteRollCommandValid(), theEcorePackage.getEBoolean(), "satelliteRollCommandValid", "false", 0, 1, DefaultConstellationPlanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultConstellationPlanner_SunHorizonAngleUmbraThreshold(), theEcorePackage.getEDouble(), "sunHorizonAngleUmbraThreshold", "5.0", 0, 1, DefaultConstellationPlanner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractConstellationCommandPlanEClass, AbstractConstellationCommandPlan.class, "AbstractConstellationCommandPlan", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractConstellationCommandPlan_CommandPlansList(), this.getConstellationCommandPlansList(), this.getConstellationCommandPlansList_Plans(), "commandPlansList", null, 0, 1, AbstractConstellationCommandPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractConstellationCommandPlan_ConstellationState(), this.getConstellationState(), null, "constellationState", null, 0, 1, AbstractConstellationCommandPlan.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractConstellationCommandPlan_SatelliteCommandsList(), this.getSatelliteCommandsList(), null, "satelliteCommandsList", null, 0, 1, AbstractConstellationCommandPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(satelliteCommandsListEClass, SatelliteCommandsList.class, "SatelliteCommandsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSatelliteCommandsList_ConstellationCommands(), this.getAbstractSatelliteCommand(), null, "constellationCommands", null, 0, -1, SatelliteCommandsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultConstellationCommandPlanEClass, DefaultConstellationCommandPlan.class, "DefaultConstellationCommandPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constellationRequestsListsContainerEClass, ConstellationRequestsListsContainer.class, "ConstellationRequestsListsContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstellationRequestsListsContainer_ConstellationState(), this.getConstellationState(), this.getConstellationState_ConstellationRequestsListsContainer(), "constellationState", null, 0, 1, ConstellationRequestsListsContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstellationRequestsListsContainer_ConstellationRequestsLists(), this.getConstellationRequestsList(), this.getConstellationRequestsList_ConstellationRequestsListsContainer(), "constellationRequestsLists", null, 0, -1, ConstellationRequestsListsContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constellationRequestsListEClass, ConstellationRequestsList.class, "ConstellationRequestsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstellationRequestsList_ConstellationRequestsListsContainer(), this.getConstellationRequestsListsContainer(), this.getConstellationRequestsListsContainer_ConstellationRequestsLists(), "constellationRequestsListsContainer", null, 0, 1, ConstellationRequestsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstellationRequestsList_ConstellationState(), this.getConstellationState(), null, "constellationState", null, 0, 1, ConstellationRequestsList.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getConstellationRequestsList_ConstellationRequests(), this.getAbstractConstellationRequest(), null, "constellationRequests", null, 0, -1, ConstellationRequestsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractConstellationRequestEClass, AbstractConstellationRequest.class, "AbstractConstellationRequest", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractConstellationRequest_Uid(), this.getAbstractUID(), null, "uid", null, 0, 1, AbstractConstellationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractConstellationRequest_OrderPriority(), this.getConstellationRequestPriority(), "orderPriority", "NORMAL", 0, 1, AbstractConstellationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractConstellationRequest_OrderStatus(), this.getConstellationRequestStatus(), "orderStatus", "NEW", 0, 1, AbstractConstellationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleRequestEClass, SimpleRequest.class, "SimpleRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(observationConstellationRequestEClass, ObservationConstellationRequest.class, "ObservationConstellationRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObservationConstellationRequest_Location(), theApogyCoreEnvironmentOrbitEarthPackage.getEarthSurfaceLocation(), null, "location", null, 0, 1, ObservationConstellationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageConstellationRequestEClass, ImageConstellationRequest.class, "ImageConstellationRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImageConstellationRequest_Image(), this.getOrbitalImage(), null, "image", null, 0, 1, ImageConstellationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(satellitesListEClass, SatellitesList.class, "SatellitesList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSatellitesList_Satellites(), this.getSatellite(), null, "satellites", null, 0, -1, SatellitesList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(satelliteEClass, Satellite.class, "Satellite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSatellite_OrbitModel(), theApogyCoreEnvironmentOrbitEarthPackage.getEarthOrbitModel(), null, "orbitModel", null, 1, 1, Satellite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSatellite_MaximumRoll(), theEcorePackage.getEDouble(), "maximumRoll", "5.0", 0, 1, Satellite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractSatelliteCommandEClass, AbstractSatelliteCommand.class, "AbstractSatelliteCommand", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractSatelliteCommand_Uid(), this.getAbstractUID(), null, "uid", null, 0, 1, AbstractSatelliteCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractSatelliteCommand_Satellite(), this.getSatellite(), null, "satellite", null, 0, 1, AbstractSatelliteCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractRequestBasedSatelliteCommandEClass, AbstractRequestBasedSatelliteCommand.class, "AbstractRequestBasedSatelliteCommand", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractRequestBasedSatelliteCommand_ConstellationRequest(), this.getAbstractConstellationRequest(), null, "constellationRequest", null, 0, 1, AbstractRequestBasedSatelliteCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visibilityPassBasedSatelliteCommandEClass, VisibilityPassBasedSatelliteCommand.class, "VisibilityPassBasedSatelliteCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVisibilityPassBasedSatelliteCommand_VisibilityPass(), theApogyCoreEnvironmentOrbitEarthPackage.getVisibilityPass(), null, "visibilityPass", null, 0, 1, VisibilityPassBasedSatelliteCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(acquireImageSatelliteCommandEClass, AcquireImageSatelliteCommand.class, "AcquireImageSatelliteCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcquireImageSatelliteCommand_RollAngle(), theEcorePackage.getEDouble(), "rollAngle", "0.0", 0, 1, AcquireImageSatelliteCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orbitalImageEClass, OrbitalImage.class, "OrbitalImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrbitalImage_RollAngle(), theEcorePackage.getEDouble(), "rollAngle", "0.0", 0, 1, OrbitalImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constellationDownlinksListEClass, ConstellationDownlinksList.class, "ConstellationDownlinksList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstellationDownlinksList_ConstellationState(), this.getConstellationState(), this.getConstellationState_DownlinksLists(), "constellationState", null, 0, 1, ConstellationDownlinksList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstellationDownlinksList_Downlinks(), this.getConstellationDownlink(), this.getConstellationDownlink_ConstellationDownlinksList(), "downlinks", null, 0, -1, ConstellationDownlinksList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constellationDownlinkEClass, ConstellationDownlink.class, "ConstellationDownlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstellationDownlink_ConstellationDownlinksList(), this.getConstellationDownlinksList(), this.getConstellationDownlinksList_Downlinks(), "constellationDownlinksList", null, 0, 1, ConstellationDownlink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstellationDownlink_DownlinkItems(), this.getAbstractConstellationDownlinkItem(), null, "downlinkItems", null, 0, -1, ConstellationDownlink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractConstellationDownlinkItemEClass, AbstractConstellationDownlinkItem.class, "AbstractConstellationDownlinkItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractConstellationDownlinkItem_RequestUID(), this.getAbstractUID(), null, "requestUID", null, 0, 1, AbstractConstellationDownlinkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractConstellationDownlinkItem_Request(), this.getAbstractConstellationRequest(), null, "request", null, 0, 1, AbstractConstellationDownlinkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orbitalImageConstellationDownlinkItemEClass, OrbitalImageConstellationDownlinkItem.class, "OrbitalImageConstellationDownlinkItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrbitalImageConstellationDownlinkItem_ImageURL(), theEcorePackage.getEString(), "imageURL", null, 0, 1, OrbitalImageConstellationDownlinkItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		addEEnumLiteral(constellationRequestStatusEEnum, ConstellationRequestStatus.ABORTED);

		// Initialize data types
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sortedSetEDataType, SortedSet.class, "SortedSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(comparatorEDataType, Comparator.class, "Comparator", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
			 "prefix", "ApogyExamplesSatellite",
			 "copyrightText", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\nCanadian Space Agency (CSA) - Initial API and implementation\n-Pierre Allard (Pierre.Allard@canada.ca),\n-Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n-Sebastien Gemme (Sebastien.Gemme@canada.ca)",
			 "modelName", "ApogyExamplesSatellite",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "suppressGenModelAnnotations", "false",
			 "dynamicTemplates", "true",
			 "templateDirectory", "platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.examples.satellite/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.examples.satellite.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.examples"
		   });	
		addAnnotation
		  (apogyExamplesSatelliteFacadeEClass, 
		   source, 
		   new String[] {
			 "documentation", "Class that provides utility methods."
		   });	
		addAnnotation
		  (abstractUIDEClass, 
		   source, 
		   new String[] {
			 "documentation", "Abstract Unique Identifier.  This class is meant to be sub-classed."
		   });	
		addAnnotation
		  (stringUIDEClass, 
		   source, 
		   new String[] {
			 "documentation", "Unique Identifier in string format (Default)."
		   });	
		addAnnotation
		  (constellationCommandPlansListEClass, 
		   source, 
		   new String[] {
			 "documentation", "Class that contains list of {@link ConstellationCommandPlan}."
		   });	
		addAnnotation
		  (getConstellationCommandPlansList_ConstellationState(), 
		   source, 
		   new String[] {
			 "documentation", "Refers to the container of this {@link ConstellationCommandPlansList}."
		   });	
		addAnnotation
		  (getConstellationCommandPlansList_Plans(), 
		   source, 
		   new String[] {
			 "documentation", "Contains the plan."
		   });	
		addAnnotation
		  (constellationStateEClass, 
		   source, 
		   new String[] {
			 "documentation", "Class used to store the constellation state."
		   });	
		addAnnotation
		  (getConstellationState__ImportConstellationRequests__String(), 
		   source, 
		   new String[] {
			 "documentation", "Imports the {@link AbstractConstellationRequest} contained in the resource specified by the {@link url}.\n@param url URL that specifies the resource.\n@return List of imported {@link AbstractConstellationRequest}."
		   });	
		addAnnotation
		  (getConstellationState__Export__AbstractConstellationCommandPlan_String(), 
		   source, 
		   new String[] {
			 "documentation", "Exports the specified plan into the resource specified by the url.\n@param plan Refers the plan to export.\n@param url Specifies the location where the plan must be exported."
		   });	
		addAnnotation
		  (getConstellationState__ImportConstellationDownlinkItems__String(), 
		   source, 
		   new String[] {
			 "documentation", "Imports the {@link AbstractConstellationDownlinkItem} contained in the resource specified by the {@link url}.\n@param url URL that specifies the resource.\n@return List of imported {@link AbstractConstellationDownlinkItem}."
		   });	
		addAnnotation
		  (getConstellationState_ConstellationCommandPlansList(), 
		   source, 
		   new String[] {
			 "documentation", "List of {@link ConstellationCommandPlan}s."
		   });	
		addAnnotation
		  (getConstellationState_SatellitesList(), 
		   source, 
		   new String[] {
			 "documentation", "List of the constellation {@link Satellite}."
		   });	
		addAnnotation
		  (getConstellationState_GroundStationsReferencesList(), 
		   source, 
		   new String[] {
			 "documentation", "List of the {@link GroundStation}."
		   });	
		addAnnotation
		  (getConstellationState_DownlinksLists(), 
		   source, 
		   new String[] {
			 "documentation", "List of {@link ConstellationDownlinkList} used to store {@link ConstellationDownlink}."
		   });	
		addAnnotation
		  (getConstellationState_ConstellationRequestsListsContainer(), 
		   source, 
		   new String[] {
			 "documentation", "List of {@link ConstellationRequestsLists}."
		   });	
		addAnnotation
		  (getConstellationState_ConstellationPlannersContainer(), 
		   source, 
		   new String[] {
			 "documentation", "Constellation Planners Container."
		   });	
		addAnnotation
		  (abstractConstellationEClass, 
		   source, 
		   new String[] {
			 "documentation", "Represents a constellation of Satellites. It provides basic queries used to schedule\nimage acquisition and upload requests and downloads data from the satellites."
		   });	
		addAnnotation
		  (getAbstractConstellation_ConstellationState(), 
		   source, 
		   new String[] {
			 "documentation", "Constellation State."
		   });	
		addAnnotation
		  (defaultConstellationEClass, 
		   source, 
		   new String[] {
			 "documentation", "Default Constellation Implementation Class.\n\nBy default {@link AbstractConstellation#newUID} returns {@link DigitUID}."
		   });	
		addAnnotation
		  (constellationPlannersContainerEClass, 
		   source, 
		   new String[] {
			 "documentation", "Container of {@link AbstractConstellationPlanner}."
		   });	
		addAnnotation
		  (getConstellationPlannersContainer_ConstellationState(), 
		   source, 
		   new String[] {
			 "documentation", "Refers to the {@link ConstellationState} that contains this container.",
			 "property", "None"
		   });	
		addAnnotation
		  (getConstellationPlannersContainer_ConstellationPlanners(), 
		   source, 
		   new String[] {
			 "documentation", "Constellation Planners."
		   });	
		addAnnotation
		  (abstractConstellationPlannerEClass, 
		   source, 
		   new String[] {
			 "documentation", "Abstract class that defines the concept of Constellation Planner.  A planner is used to process\na list of {@link AbstractConstellationRequest} and to generate a {@link ConstellationCommandPlan}."
		   });	
		addAnnotation
		  (getAbstractConstellationPlanner__IsValid__VisibilityPass(), 
		   source, 
		   new String[] {
			 "documentation", "Checks if the pass is valid."
		   });	
		addAnnotation
		  (getAbstractConstellationPlanner__GetSatellite__EarthOrbitModel(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the satellite associated with the specified {@link OrbitModel}.\n@param orbitModel The specified {@link OrbitModel}.\n@return The Satellite associated with the specified {@link OrbitModel}, null if none is found."
		   });	
		addAnnotation
		  (getAbstractConstellationPlanner__Plan(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the list of {@link AbstractSatelliteCommand} required to process a specific list of {@link AbstractConstellationRequest}\nbased on the available constellation satellites.  The plan is added to the list of plans."
		   });	
		addAnnotation
		  (getAbstractConstellationPlanner__Validate(), 
		   source, 
		   new String[] {
			 "documentation", "Validates the planner properties."
		   });	
		addAnnotation
		  (getAbstractConstellationPlanner__GetRequestBasedSatelliteCommandsComparator(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the comparator of {@link AbstractRequestBasedSatelliteCommand} used to sort them."
		   });	
		addAnnotation
		  (getAbstractConstellationPlanner__CreateVisibilityPassBasedSatelliteCommand__ObservationConstellationRequest_VisibilityPass(), 
		   source, 
		   new String[] {
			 "documentation", "Instantiates and returns a command instance to address the specified {@link ObservationConstellationRequest}.\n@param request Refers to the request.\n@param visibilityPass Visibility pass context."
		   });	
		addAnnotation
		  (getAbstractConstellationPlanner__PopulateVisibilityPassBasedSatelliteCommand__VisibilityPassBasedSatelliteCommand_ObservationConstellationRequest_VisibilityPass(), 
		   source, 
		   new String[] {
			 "documentation", "Populates the content of the command to address the specified {@link ObservationConstellationRequest}.\n@param command Command to populate.\n@param request Refers to the request.\n@param visibilityPass Visibility pass context."
		   });	
		addAnnotation
		  (getAbstractConstellationPlanner_ConstellationPlannersContainer(), 
		   source, 
		   new String[] {
			 "documentation", "Refers the {@link ConstellationState} that contains the planner.",
			 "property", "None"
		   });	
		addAnnotation
		  (getAbstractConstellationPlanner_ConstellationState(), 
		   source, 
		   new String[] {
			 "documentation", "Refers to the {@link ConstellationState} that contains the current planner.",
			 "children", "false",
			 "property", "None",
			 "get", "<%ca.gc.asc_csa.apogy.examples.satellite.ConstellationPlannersContainer%> _constellationPlannersContainer = this.getConstellationPlannersContainer();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_constellationPlannersContainer, null);\nif (_equals)\n{\n\treturn null;\n}\nelse\n{\n\t<%ca.gc.asc_csa.apogy.examples.satellite.ConstellationPlannersContainer%> _constellationPlannersContainer_1 = this.getConstellationPlannersContainer();\n\treturn _constellationPlannersContainer_1.getConstellationState();\n}"
		   });	
		addAnnotation
		  (getAbstractConstellationPlanner_StartDate(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the start date used by the planner.",
			 "propertyCategory", "PLANNER_SETTINGS"
		   });	
		addAnnotation
		  (getAbstractConstellationPlanner_EndDate(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the end date used by the planner.",
			 "propertyCategory", "PLANNER_SETTINGS"
		   });	
		addAnnotation
		  (getAbstractConstellationPlanner_ConstellationRequestsList(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the list of {@AbstractConstellationRequest} to be processed by the planner.",
			 "propertyCategory", "PLANNER_SETTINGS"
		   });	
		addAnnotation
		  (getAbstractConstellationPlanner_ConstellationCommandPlan(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies in which plan the planner will store its results.",
			 "propertyCategory", "PLANNER_SETTINGS"
		   });	
		addAnnotation
		  (getAbstractConstellationPlanner_MaxNumberThreads(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the maximum number of threads used by the planner.  0 (default) means the maximum available.",
			 "propertyCategory", "PLANNER_SETTINGS"
		   });	
		addAnnotation
		  (getAbstractConstellationPlanner_CommandDuplicatesPreserved(), 
		   source, 
		   new String[] {
			 "documentation", "Indicates if the duplicates are preserved.  False (default value) indicates only the first command that addresses a\n{@link ObservationConstellationRequest} will be preserved.  The commands that occur after in time will be deleted.  True means\nall the commands will be preserved.",
			 "propertyCategory", "VISIBILITY_PASS_VALIDITY"
		   });	
		addAnnotation
		  (getAbstractConstellationPlanner_ElevationMask(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the elevation mask used"
		   });	
		addAnnotation
		  (defaultConstellationPlannerEClass, 
		   source, 
		   new String[] {
			 "documentation", "Default Implementation of {@link AbstractConstellationPlanner}."
		   });	
		addAnnotation
		  (getDefaultConstellationPlanner_UmbraPassesValid(), 
		   source, 
		   new String[] {
			 "documentation", "Indicates if a pass that occurs in umbra must be considered by the planner.",
			 "propertyCategory", "VISIBILITY_PASS_VALIDITY"
		   });	
		addAnnotation
		  (getDefaultConstellationPlanner_SatelliteRollCommandValid(), 
		   source, 
		   new String[] {
			 "documentation", "Indicates if a pass that requires roll command to ensure coverage must be considered by the planner.",
			 "propertyCategory", "VISIBILITY_PASS_VALIDITY"
		   });	
		addAnnotation
		  (getDefaultConstellationPlanner_SunHorizonAngleUmbraThreshold(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the angle threshold value the planner uses to determine the umbra.",
			 "propertyCategory", "VISIBILITY_PASS_VALIDITY",
			 "apogy_units", "deg"
		   });	
		addAnnotation
		  (abstractConstellationCommandPlanEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class contains a list of {@link AbstractSatelliteCommand}.\nThe {@link AbstractConstellation#plan} produces {@link ConstellationCommandPlan}."
		   });	
		addAnnotation
		  (getAbstractConstellationCommandPlan_CommandPlansList(), 
		   source, 
		   new String[] {
			 "documentation", "Refers the container of this {@link AbstractConstellationCommandPlan}.",
			 "property", "None"
		   });	
		addAnnotation
		  (getAbstractConstellationCommandPlan_ConstellationState(), 
		   source, 
		   new String[] {
			 "documentation", "Refers to the {@link ConstellationState} that contains the current plan.",
			 "children", "false",
			 "property", "None",
			 "get", "<%ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlansList%> _commandPlansList = this.getCommandPlansList();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_commandPlansList, null);\nif (_equals)\n{\n\treturn null;\n}\nelse\n{\n\t<%ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlansList%> _commandPlansList_1 = this.getCommandPlansList();\n\treturn _commandPlansList_1.getConstellationState();\n}"
		   });	
		addAnnotation
		  (getAbstractConstellationCommandPlan_SatelliteCommandsList(), 
		   source, 
		   new String[] {
			 "documentation", "Container of {@link AbstractSatelliteCommand}."
		   });	
		addAnnotation
		  (satelliteCommandsListEClass, 
		   source, 
		   new String[] {
			 "documentation", "List of {@link AbstractSatelliteCommand}."
		   });	
		addAnnotation
		  (getSatelliteCommandsList_ConstellationCommands(), 
		   source, 
		   new String[] {
			 "documentation", "List of {@link AbstractSatelliteCommand}."
		   });	
		addAnnotation
		  (defaultConstellationCommandPlanEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class contains a list of {@link AbstractSatelliteCommand}.\nThe {@link AbstractConstellation#plan} produces {@link ConstellationCommandPlan}."
		   });	
		addAnnotation
		  (constellationRequestsListsContainerEClass, 
		   source, 
		   new String[] {
			 "documentation", "Container of {@link ConstellationRequestsList}."
		   });	
		addAnnotation
		  (getConstellationRequestsListsContainer_ConstellationState(), 
		   source, 
		   new String[] {
			 "documentation", "Refers to the container {@link ConstellationState}.",
			 "property", "None"
		   });	
		addAnnotation
		  (getConstellationRequestsListsContainer_ConstellationRequestsLists(), 
		   source, 
		   new String[] {
			 "documentation", "{@link ConstellationRequestsList} container."
		   });	
		addAnnotation
		  (constellationRequestsListEClass, 
		   source, 
		   new String[] {
			 "documentation", "List that contains {@link AbstractConstellationRequest}."
		   });	
		addAnnotation
		  (getConstellationRequestsList_ConstellationRequestsListsContainer(), 
		   source, 
		   new String[] {
			 "documentation", "Refers the container of this {@link ConstellationRequestsList}.",
			 "property", "None"
		   });	
		addAnnotation
		  (getConstellationRequestsList_ConstellationState(), 
		   source, 
		   new String[] {
			 "documentation", "Refers to the {@link ConstellationState} that contains the current list.",
			 "children", "false",
			 "property", "None",
			 "get", "<%ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsListsContainer%> _constellationRequestsListsContainer = this.getConstellationRequestsListsContainer();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_constellationRequestsListsContainer, null);\nif (_equals)\n{\n\treturn null;\n}\nelse\n{\n\t<%ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsListsContainer%> _constellationRequestsListsContainer_1 = this.getConstellationRequestsListsContainer();\n\treturn _constellationRequestsListsContainer_1.getConstellationState();\n}"
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
		  (simpleRequestEClass, 
		   source, 
		   new String[] {
			 "documentation", "Simple Request."
		   });	
		addAnnotation
		  (observationConstellationRequestEClass, 
		   source, 
		   new String[] {
			 "documentation", "Class that defines a Earth Observation request."
		   });	
		addAnnotation
		  (getObservationConstellationRequest_Location(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies the location of the observation."
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
		  (getSatellite_MaximumRoll(), 
		   source, 
		   new String[] {
			 "documentation", "Maximum Satellite Roll.",
			 "apogy_units", "deg"
		   });	
		addAnnotation
		  (abstractSatelliteCommandEClass, 
		   source, 
		   new String[] {
			 "documentation", "Satellite Command."
		   });	
		addAnnotation
		  (getAbstractSatelliteCommand_Uid(), 
		   source, 
		   new String[] {
			 "documentation", "Request Unique Identifier."
		   });	
		addAnnotation
		  (getAbstractSatelliteCommand_Satellite(), 
		   source, 
		   new String[] {
			 "documentation", "Refers the {@link Satellite} associated with the {@link AbstractSatelliteCommand}."
		   });	
		addAnnotation
		  (abstractRequestBasedSatelliteCommandEClass, 
		   source, 
		   new String[] {
			 "documentation", "Satellite Command that is linked to a specific {@link AbstractConstellationRequest}."
		   });	
		addAnnotation
		  (getAbstractRequestBasedSatelliteCommand_ConstellationRequest(), 
		   source, 
		   new String[] {
			 "documentation", "Refers to the {@link AbstractConstellationRequest} managed by this command."
		   });	
		addAnnotation
		  (getVisibilityPassBasedSatelliteCommand_VisibilityPass(), 
		   source, 
		   new String[] {
			 "documentation", "Refers the {@link VisibilityPass} associated to the command."
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
		  (getConstellationDownlinksList_ConstellationState(), 
		   source, 
		   new String[] {
			 "documentation", "Refers to the container {@link ConstellationState}.",
			 "property", "None"
		   });	
		addAnnotation
		  (getConstellationDownlinksList_Downlinks(), 
		   source, 
		   new String[] {
			 "documentation", "Contains the {@link ConstellationDownlink}."
		   });	
		addAnnotation
		  (constellationDownlinkEClass, 
		   source, 
		   new String[] {
			 "documentation", "A {@link ConstellationDownlink} class contains the {@link AbstractConstellationDownlinkItem}."
		   });	
		addAnnotation
		  (getConstellationDownlink_ConstellationDownlinksList(), 
		   source, 
		   new String[] {
			 "documentation", "Refers he container {@link ConstellationDownlinksList}."
		   });	
		addAnnotation
		  (getConstellationDownlink_DownlinkItems(), 
		   source, 
		   new String[] {
			 "documentation", "Contains the {@link AbstractConstellationDownlinkItem}."
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
		  (getAbstractConstellationDownlinkItem_Request(), 
		   source, 
		   new String[] {
			 "documentation", "Refers to the request that is the owner of this item."
		   });	
		addAnnotation
		  (orbitalImageConstellationDownlinkItemEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents a {@link AbstractDownlinkItem} that contains an {@link OrbitalImage}."
		   });	
		addAnnotation
		  (getOrbitalImageConstellationDownlinkItem_ImageURL(), 
		   source, 
		   new String[] {
			 "documentation", "Refers to the image."
		   });
	}

} //ApogyExamplesSatellitePackageImpl
