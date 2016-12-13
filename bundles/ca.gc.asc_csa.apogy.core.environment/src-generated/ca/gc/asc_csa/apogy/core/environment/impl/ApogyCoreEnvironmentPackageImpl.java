package ca.gc.asc_csa.apogy.core.environment.impl;
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

import java.util.Date;
import java.util.List;
import java.util.SortedSet;

import javax.vecmath.Color3f;
import javax.vecmath.Point3d;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAttribute;
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
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.environment.AbstractApogyEnvironmentItem;
import ca.gc.asc_csa.apogy.core.environment.AbstractSurfaceLocation;
import ca.gc.asc_csa.apogy.core.environment.AbstractWorksite;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.environment.CelestialBody;
import ca.gc.asc_csa.apogy.core.environment.Earth;
import ca.gc.asc_csa.apogy.core.environment.EnvironmentUtilities;
import ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates;
import ca.gc.asc_csa.apogy.core.environment.Moon;
import ca.gc.asc_csa.apogy.core.environment.Sky;
import ca.gc.asc_csa.apogy.core.environment.SkyNode;
import ca.gc.asc_csa.apogy.core.environment.Star;
import ca.gc.asc_csa.apogy.core.environment.StarField;
import ca.gc.asc_csa.apogy.core.environment.Sun;
import ca.gc.asc_csa.apogy.core.environment.SurfaceLocationsList;
import ca.gc.asc_csa.apogy.core.environment.TimeSourcesList;
import ca.gc.asc_csa.apogy.core.environment.Worksite;
import ca.gc.asc_csa.apogy.core.environment.WorksiteNode;
import ca.gc.asc_csa.apogy.core.environment.WorksitesList;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreEnvironmentPackageImpl extends EPackageImpl implements ApogyCoreEnvironmentPackage
{
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractApogyEnvironmentItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeSourcesListEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass worksiteEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass worksitesListEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractWorksiteEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSurfaceLocationEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surfaceLocationsListEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass equatorialCoordinatesEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass skyEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass celestialBodyEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass sunEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass earthEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass moonEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass environmentUtilitiesEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyCoreEnvironmentFacadeEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass starEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass starFieldEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass worksiteNodeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass skyNodeEClass = null;

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
  private EDataType dateEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType point3dEDataType = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType color3fEDataType = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iProgressMonitorEDataType = null;

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
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private ApogyCoreEnvironmentPackageImpl()
  {
		super(eNS_URI, ApogyCoreEnvironmentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyCoreEnvironmentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static ApogyCoreEnvironmentPackage init()
  {
		if (isInited) return (ApogyCoreEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreEnvironmentPackage.eNS_URI);

		// Obtain or create and register package
		ApogyCoreEnvironmentPackageImpl theApogyCoreEnvironmentPackage = (ApogyCoreEnvironmentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCoreEnvironmentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCoreEnvironmentPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyCoreEnvironmentPackage.createPackageContents();

		// Initialize created meta-data
		theApogyCoreEnvironmentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCoreEnvironmentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCoreEnvironmentPackage.eNS_URI, theApogyCoreEnvironmentPackage);
		return theApogyCoreEnvironmentPackage;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyEnvironment() {
		return apogyEnvironmentEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApogyEnvironment_WorksitesList() {
		return (EReference)apogyEnvironmentEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApogyEnvironment_ActiveWorksite() {
		return (EReference)apogyEnvironmentEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApogyEnvironment_TimeSourcesList() {
		return (EReference)apogyEnvironmentEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApogyEnvironment_ActiveTimeSource() {
		return (EReference)apogyEnvironmentEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApogyEnvironment_EnvironmentItems() {
		return (EReference)apogyEnvironmentEClass.getEStructuralFeatures().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractApogyEnvironmentItem() {
		return abstractApogyEnvironmentItemEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractApogyEnvironmentItem_Environment() {
		return (EReference)abstractApogyEnvironmentItemEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeSourcesList() {
		return timeSourcesListEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeSourcesList_Environment() {
		return (EReference)timeSourcesListEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeSourcesList_TimeSources() {
		return (EReference)timeSourcesListEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getWorksite()
  {
		return worksiteEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getWorksite_WorksiteNode()
  {
		return (EReference)worksiteEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorksite_Sky() {
		return (EReference)worksiteEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorksitesList() {
		return worksitesListEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorksitesList_Worksites() {
		return (EReference)worksitesListEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractWorksite() {
		return abstractWorksiteEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractWorksite_WorksitesList() {
		return (EReference)abstractWorksiteEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSurfaceLocation() {
		return abstractSurfaceLocationEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurfaceLocationsList() {
		return surfaceLocationsListEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurfaceLocationsList_SurfaceLocations() {
		return (EReference)surfaceLocationsListEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEquatorialCoordinates()
  {
		return equatorialCoordinatesEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEquatorialCoordinates_RightAscension()
  {
		return (EAttribute)equatorialCoordinatesEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEquatorialCoordinates_Declination()
  {
		return (EAttribute)equatorialCoordinatesEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEquatorialCoordinates_Radius()
  {
		return (EAttribute)equatorialCoordinatesEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSky()
  {
		return skyEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSky_Worksite() {
		return (EReference)skyEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSky_SkyNode()
  {
		return (EReference)skyEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSky_Sun()
  {
		return (EReference)skyEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSky_StarField()
  {
		return (EReference)skyEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getSky__GetSunAngularDiameter()
  {
		return skyEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCelestialBody() {
		return celestialBodyEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCelestialBody_MeanRadius() {
		return (EAttribute)celestialBodyEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSun()
  {
		return sunEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getSun_Radius()
  {
		return (EAttribute)sunEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getSun__GetIrradiance__double()
  {
		return sunEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEarth() {
		return earthEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEarth_Radius() {
		return (EAttribute)earthEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMoon()
  {
		return moonEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getMoon_Radius()
  {
		return (EAttribute)moonEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEnvironmentUtilities()
  {
		return environmentUtilitiesEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentUtilities__ConvertToJulianDate__Date()
  {
		return environmentUtilitiesEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentUtilities__ParseRightAscension__String()
  {
		return environmentUtilitiesEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentUtilities__ParseDegMinSec__String()
  {
		return environmentUtilitiesEClass.getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentUtilities__SortByMagnitude__List()
  {
		return environmentUtilitiesEClass.getEOperations().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyCoreEnvironmentFacade() {
		return apogyCoreEnvironmentFacadeEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentFacade__CreateApogySession() {
		return apogyCoreEnvironmentFacadeEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentFacade__CreateApogySession__boolean_boolean_boolean_boolean() {
		return apogyCoreEnvironmentFacadeEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentFacade__CreateAndInitializeStars() {
		return apogyCoreEnvironmentFacadeEClass.getEOperations().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentFacade__SortByMagnitude__List() {
		return apogyCoreEnvironmentFacadeEClass.getEOperations().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentFacade__CreateSky() {
		return apogyCoreEnvironmentFacadeEClass.getEOperations().get(5);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentFacade__CreateSkyNode() {
		return apogyCoreEnvironmentFacadeEClass.getEOperations().get(6);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentFacade__InitializeSkyNode__SkyNode() {
		return apogyCoreEnvironmentFacadeEClass.getEOperations().get(7);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentFacade__CreateStar__float_double_double() {
		return apogyCoreEnvironmentFacadeEClass.getEOperations().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentFacade__GetSunVector__ApogySystem_String_Environment() {
		return apogyCoreEnvironmentFacadeEClass.getEOperations().get(8);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentFacade__GetSunVector__Node_Environment() {
		return apogyCoreEnvironmentFacadeEClass.getEOperations().get(9);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentFacade__GetVector__Node_ApogySystem_ConnectionPoint_Environment() {
		return apogyCoreEnvironmentFacadeEClass.getEOperations().get(10);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentFacade__GetVector__ApogySystem_String_ApogySystem_ConnectionPoint_Environment() {
		return apogyCoreEnvironmentFacadeEClass.getEOperations().get(11);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentFacade__GetVector__ApogySystem_String_ApogySystem_String_Environment() {
		return apogyCoreEnvironmentFacadeEClass.getEOperations().get(12);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentFacade__GetVector__ApogySystem_String_String_String_Environment() {
		return apogyCoreEnvironmentFacadeEClass.getEOperations().get(13);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getStar()
  {
		return starEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getStar_Magnitude()
  {
		return (EAttribute)starEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getStar_EquatorialCoordinates()
  {
		return (EReference)starEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getStarField()
  {
		return starFieldEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getStarField_Stars()
  {
		return (EReference)starFieldEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getStarField_StarFieldFileName()
  {
		return (EAttribute)starFieldEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getWorksiteNode()
  {
		return worksiteNodeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getWorksiteNode_Worksite()
  {
		return (EReference)worksiteNodeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSkyNode()
  {
		return skyNodeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSkyNode_Sky()
  {
		return (EReference)skyNodeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getList()
  {
		return listEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getSortedSet()
  {
		return sortedSetEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getDate()
  {
		return dateEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getPoint3d()
  {
		return point3dEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColor3f() {
		return color3fEDataType;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIProgressMonitor() {
		return iProgressMonitorEDataType;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentFactory getApogyCoreEnvironmentFactory() {
		return (ApogyCoreEnvironmentFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		apogyEnvironmentEClass = createEClass(APOGY_ENVIRONMENT);
		createEReference(apogyEnvironmentEClass, APOGY_ENVIRONMENT__WORKSITES_LIST);
		createEReference(apogyEnvironmentEClass, APOGY_ENVIRONMENT__ACTIVE_WORKSITE);
		createEReference(apogyEnvironmentEClass, APOGY_ENVIRONMENT__TIME_SOURCES_LIST);
		createEReference(apogyEnvironmentEClass, APOGY_ENVIRONMENT__ACTIVE_TIME_SOURCE);
		createEReference(apogyEnvironmentEClass, APOGY_ENVIRONMENT__ENVIRONMENT_ITEMS);

		abstractApogyEnvironmentItemEClass = createEClass(ABSTRACT_APOGY_ENVIRONMENT_ITEM);
		createEReference(abstractApogyEnvironmentItemEClass, ABSTRACT_APOGY_ENVIRONMENT_ITEM__ENVIRONMENT);

		timeSourcesListEClass = createEClass(TIME_SOURCES_LIST);
		createEReference(timeSourcesListEClass, TIME_SOURCES_LIST__ENVIRONMENT);
		createEReference(timeSourcesListEClass, TIME_SOURCES_LIST__TIME_SOURCES);

		worksiteEClass = createEClass(WORKSITE);
		createEReference(worksiteEClass, WORKSITE__WORKSITE_NODE);
		createEReference(worksiteEClass, WORKSITE__SKY);

		worksitesListEClass = createEClass(WORKSITES_LIST);
		createEReference(worksitesListEClass, WORKSITES_LIST__WORKSITES);

		abstractWorksiteEClass = createEClass(ABSTRACT_WORKSITE);
		createEReference(abstractWorksiteEClass, ABSTRACT_WORKSITE__WORKSITES_LIST);

		abstractSurfaceLocationEClass = createEClass(ABSTRACT_SURFACE_LOCATION);

		surfaceLocationsListEClass = createEClass(SURFACE_LOCATIONS_LIST);
		createEReference(surfaceLocationsListEClass, SURFACE_LOCATIONS_LIST__SURFACE_LOCATIONS);

		skyEClass = createEClass(SKY);
		createEReference(skyEClass, SKY__WORKSITE);
		createEReference(skyEClass, SKY__SKY_NODE);
		createEReference(skyEClass, SKY__SUN);
		createEReference(skyEClass, SKY__STAR_FIELD);
		createEOperation(skyEClass, SKY___GET_SUN_ANGULAR_DIAMETER);

		celestialBodyEClass = createEClass(CELESTIAL_BODY);
		createEAttribute(celestialBodyEClass, CELESTIAL_BODY__MEAN_RADIUS);

		sunEClass = createEClass(SUN);
		createEAttribute(sunEClass, SUN__RADIUS);
		createEOperation(sunEClass, SUN___GET_IRRADIANCE__DOUBLE);

		earthEClass = createEClass(EARTH);
		createEAttribute(earthEClass, EARTH__RADIUS);

		moonEClass = createEClass(MOON);
		createEAttribute(moonEClass, MOON__RADIUS);

		environmentUtilitiesEClass = createEClass(ENVIRONMENT_UTILITIES);
		createEOperation(environmentUtilitiesEClass, ENVIRONMENT_UTILITIES___CONVERT_TO_JULIAN_DATE__DATE);
		createEOperation(environmentUtilitiesEClass, ENVIRONMENT_UTILITIES___PARSE_RIGHT_ASCENSION__STRING);
		createEOperation(environmentUtilitiesEClass, ENVIRONMENT_UTILITIES___PARSE_DEG_MIN_SEC__STRING);
		createEOperation(environmentUtilitiesEClass, ENVIRONMENT_UTILITIES___SORT_BY_MAGNITUDE__LIST);

		apogyCoreEnvironmentFacadeEClass = createEClass(APOGY_CORE_ENVIRONMENT_FACADE);
		createEOperation(apogyCoreEnvironmentFacadeEClass, APOGY_CORE_ENVIRONMENT_FACADE___CREATE_APOGY_SESSION);
		createEOperation(apogyCoreEnvironmentFacadeEClass, APOGY_CORE_ENVIRONMENT_FACADE___CREATE_APOGY_SESSION__BOOLEAN_BOOLEAN_BOOLEAN_BOOLEAN);
		createEOperation(apogyCoreEnvironmentFacadeEClass, APOGY_CORE_ENVIRONMENT_FACADE___CREATE_STAR__FLOAT_DOUBLE_DOUBLE);
		createEOperation(apogyCoreEnvironmentFacadeEClass, APOGY_CORE_ENVIRONMENT_FACADE___CREATE_AND_INITIALIZE_STARS);
		createEOperation(apogyCoreEnvironmentFacadeEClass, APOGY_CORE_ENVIRONMENT_FACADE___SORT_BY_MAGNITUDE__LIST);
		createEOperation(apogyCoreEnvironmentFacadeEClass, APOGY_CORE_ENVIRONMENT_FACADE___CREATE_SKY);
		createEOperation(apogyCoreEnvironmentFacadeEClass, APOGY_CORE_ENVIRONMENT_FACADE___CREATE_SKY_NODE);
		createEOperation(apogyCoreEnvironmentFacadeEClass, APOGY_CORE_ENVIRONMENT_FACADE___INITIALIZE_SKY_NODE__SKYNODE);
		createEOperation(apogyCoreEnvironmentFacadeEClass, APOGY_CORE_ENVIRONMENT_FACADE___GET_SUN_VECTOR__APOGYSYSTEM_STRING_ENVIRONMENT);
		createEOperation(apogyCoreEnvironmentFacadeEClass, APOGY_CORE_ENVIRONMENT_FACADE___GET_SUN_VECTOR__NODE_ENVIRONMENT);
		createEOperation(apogyCoreEnvironmentFacadeEClass, APOGY_CORE_ENVIRONMENT_FACADE___GET_VECTOR__NODE_APOGYSYSTEM_CONNECTIONPOINT_ENVIRONMENT);
		createEOperation(apogyCoreEnvironmentFacadeEClass, APOGY_CORE_ENVIRONMENT_FACADE___GET_VECTOR__APOGYSYSTEM_STRING_APOGYSYSTEM_CONNECTIONPOINT_ENVIRONMENT);
		createEOperation(apogyCoreEnvironmentFacadeEClass, APOGY_CORE_ENVIRONMENT_FACADE___GET_VECTOR__APOGYSYSTEM_STRING_APOGYSYSTEM_STRING_ENVIRONMENT);
		createEOperation(apogyCoreEnvironmentFacadeEClass, APOGY_CORE_ENVIRONMENT_FACADE___GET_VECTOR__APOGYSYSTEM_STRING_STRING_STRING_ENVIRONMENT);

		starEClass = createEClass(STAR);
		createEAttribute(starEClass, STAR__MAGNITUDE);
		createEReference(starEClass, STAR__EQUATORIAL_COORDINATES);

		starFieldEClass = createEClass(STAR_FIELD);
		createEReference(starFieldEClass, STAR_FIELD__STARS);
		createEAttribute(starFieldEClass, STAR_FIELD__STAR_FIELD_FILE_NAME);

		equatorialCoordinatesEClass = createEClass(EQUATORIAL_COORDINATES);
		createEAttribute(equatorialCoordinatesEClass, EQUATORIAL_COORDINATES__RIGHT_ASCENSION);
		createEAttribute(equatorialCoordinatesEClass, EQUATORIAL_COORDINATES__DECLINATION);
		createEAttribute(equatorialCoordinatesEClass, EQUATORIAL_COORDINATES__RADIUS);

		worksiteNodeEClass = createEClass(WORKSITE_NODE);
		createEReference(worksiteNodeEClass, WORKSITE_NODE__WORKSITE);

		skyNodeEClass = createEClass(SKY_NODE);
		createEReference(skyNodeEClass, SKY_NODE__SKY);

		// Create data types
		listEDataType = createEDataType(LIST);
		sortedSetEDataType = createEDataType(SORTED_SET);
		dateEDataType = createEDataType(DATE);
		point3dEDataType = createEDataType(POINT3D);
		color3fEDataType = createEDataType(COLOR3F);
		iProgressMonitorEDataType = createEDataType(IPROGRESS_MONITOR);
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
  public void initializePackageContents()
  {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ApogyCoreInvocatorPackage theApogyCoreInvocatorPackage = (ApogyCoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreInvocatorPackage.eNS_URI);
		ApogyCommonEMFPackage theApogyCommonEMFPackage = (ApogyCommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonEMFPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ApogyCommonTopologyPackage theApogyCommonTopologyPackage = (ApogyCommonTopologyPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonTopologyPackage.eNS_URI);
		ApogyCommonMathPackage theApogyCommonMathPackage = (ApogyCommonMathPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonMathPackage.eNS_URI);
		ApogyCorePackage theApogyCorePackage = (ApogyCorePackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCorePackage.eNS_URI);

		// Create type parameters
		addETypeParameter(listEDataType, "T");
		addETypeParameter(sortedSetEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		apogyEnvironmentEClass.getESuperTypes().add(theApogyCoreInvocatorPackage.getEnvironment());
		apogyEnvironmentEClass.getESuperTypes().add(theApogyCommonEMFPackage.getTimed());
		abstractApogyEnvironmentItemEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		abstractApogyEnvironmentItemEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		worksiteEClass.getESuperTypes().add(this.getAbstractWorksite());
		worksitesListEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		worksitesListEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		abstractWorksiteEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		abstractWorksiteEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		abstractWorksiteEClass.getESuperTypes().add(theApogyCommonEMFPackage.getTimed());
		abstractSurfaceLocationEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		abstractSurfaceLocationEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		surfaceLocationsListEClass.getESuperTypes().add(this.getAbstractApogyEnvironmentItem());
		skyEClass.getESuperTypes().add(theApogyCommonEMFPackage.getTimed());
		celestialBodyEClass.getESuperTypes().add(theApogyCommonTopologyPackage.getGroupNode());
		celestialBodyEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		sunEClass.getESuperTypes().add(this.getCelestialBody());
		earthEClass.getESuperTypes().add(this.getCelestialBody());
		moonEClass.getESuperTypes().add(this.getCelestialBody());
		starFieldEClass.getESuperTypes().add(theApogyCommonTopologyPackage.getNode());
		worksiteNodeEClass.getESuperTypes().add(theApogyCommonTopologyPackage.getAggregateGroupNode());
		skyNodeEClass.getESuperTypes().add(theApogyCommonTopologyPackage.getGroupNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(apogyEnvironmentEClass, ApogyEnvironment.class, "ApogyEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApogyEnvironment_WorksitesList(), this.getWorksitesList(), null, "worksitesList", null, 0, 1, ApogyEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApogyEnvironment_ActiveWorksite(), this.getAbstractWorksite(), null, "activeWorksite", null, 0, 1, ApogyEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApogyEnvironment_TimeSourcesList(), this.getTimeSourcesList(), this.getTimeSourcesList_Environment(), "timeSourcesList", null, 0, 1, ApogyEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApogyEnvironment_ActiveTimeSource(), theApogyCommonEMFPackage.getTimeSource(), null, "activeTimeSource", null, 0, 1, ApogyEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApogyEnvironment_EnvironmentItems(), this.getAbstractApogyEnvironmentItem(), this.getAbstractApogyEnvironmentItem_Environment(), "environmentItems", null, 0, -1, ApogyEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractApogyEnvironmentItemEClass, AbstractApogyEnvironmentItem.class, "AbstractApogyEnvironmentItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractApogyEnvironmentItem_Environment(), this.getApogyEnvironment(), this.getApogyEnvironment_EnvironmentItems(), "environment", null, 0, 1, AbstractApogyEnvironmentItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeSourcesListEClass, TimeSourcesList.class, "TimeSourcesList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeSourcesList_Environment(), this.getApogyEnvironment(), this.getApogyEnvironment_TimeSourcesList(), "environment", null, 0, 1, TimeSourcesList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeSourcesList_TimeSources(), theApogyCommonEMFPackage.getTimeSource(), null, "timeSources", null, 0, -1, TimeSourcesList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(worksiteEClass, Worksite.class, "Worksite", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorksite_WorksiteNode(), this.getWorksiteNode(), null, "worksiteNode", null, 0, 1, Worksite.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getWorksite_Sky(), this.getSky(), this.getSky_Worksite(), "sky", null, 1, 1, Worksite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(worksitesListEClass, WorksitesList.class, "WorksitesList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorksitesList_Worksites(), this.getAbstractWorksite(), this.getAbstractWorksite_WorksitesList(), "worksites", null, 0, -1, WorksitesList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractWorksiteEClass, AbstractWorksite.class, "AbstractWorksite", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractWorksite_WorksitesList(), this.getWorksitesList(), this.getWorksitesList_Worksites(), "worksitesList", null, 0, 1, AbstractWorksite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractSurfaceLocationEClass, AbstractSurfaceLocation.class, "AbstractSurfaceLocation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(surfaceLocationsListEClass, SurfaceLocationsList.class, "SurfaceLocationsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSurfaceLocationsList_SurfaceLocations(), this.getAbstractSurfaceLocation(), null, "surfaceLocations", null, 0, -1, SurfaceLocationsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skyEClass, Sky.class, "Sky", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSky_Worksite(), this.getWorksite(), this.getWorksite_Sky(), "worksite", null, 0, 1, Sky.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSky_SkyNode(), this.getSkyNode(), this.getSkyNode_Sky(), "skyNode", null, 0, 1, Sky.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSky_Sun(), this.getSun(), null, "sun", null, 0, 1, Sky.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSky_StarField(), this.getStarField(), null, "starField", null, 0, 1, Sky.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getSky__GetSunAngularDiameter(), theEcorePackage.getEDouble(), "getSunAngularDiameter", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(celestialBodyEClass, CelestialBody.class, "CelestialBody", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCelestialBody_MeanRadius(), theEcorePackage.getEDouble(), "meanRadius", null, 0, 1, CelestialBody.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sunEClass, Sun.class, "Sun", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSun_Radius(), theEcorePackage.getEDouble(), "radius", "6.955E8", 0, 1, Sun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getSun__GetIrradiance__double(), theEcorePackage.getEDouble(), "getIrradiance", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "radius", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(earthEClass, Earth.class, "Earth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEarth_Radius(), theEcorePackage.getEDouble(), "radius", "6371000", 0, 1, Earth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moonEClass, Moon.class, "Moon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoon_Radius(), theEcorePackage.getEDouble(), "radius", "1737100", 0, 1, Moon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentUtilitiesEClass, EnvironmentUtilities.class, "EnvironmentUtilities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getEnvironmentUtilities__ConvertToJulianDate__Date(), theEcorePackage.getEDouble(), "convertToJulianDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDate(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentUtilities__ParseRightAscension__String(), theEcorePackage.getEFloat(), "parseRightAscension", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "rightAscensionString", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, theApogyCommonEMFPackage.getException());

		op = initEOperation(getEnvironmentUtilities__ParseDegMinSec__String(), theEcorePackage.getEFloat(), "parseDegMinSec", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "degMinSecAngleString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentUtilities__SortByMagnitude__List(), null, "sortByMagnitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(this.getList());
		EGenericType g2 = createEGenericType(this.getStar());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "stars", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(this.getStar());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(apogyCoreEnvironmentFacadeEClass, ApogyCoreEnvironmentFacade.class, "ApogyCoreEnvironmentFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getApogyCoreEnvironmentFacade__CreateApogySession(), theApogyCoreInvocatorPackage.getInvocatorSession(), "createApogySession", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreEnvironmentFacade__CreateApogySession__boolean_boolean_boolean_boolean(), theApogyCoreInvocatorPackage.getInvocatorSession(), "createApogySession", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "createEnvironment", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "createPrograms", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "createDataProducts", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "createTools", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreEnvironmentFacade__CreateStar__float_double_double(), this.getStar(), "createStar", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEFloat(), "magnitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "rightAscension", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "declination", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getApogyCoreEnvironmentFacade__CreateAndInitializeStars(), this.getStarField(), "createAndInitializeStars", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreEnvironmentFacade__SortByMagnitude__List(), null, "sortByMagnitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getStar());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "stars", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(this.getStar());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEOperation(getApogyCoreEnvironmentFacade__CreateSky(), this.getSky(), "createSky", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getApogyCoreEnvironmentFacade__CreateSkyNode(), this.getSkyNode(), "createSkyNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreEnvironmentFacade__InitializeSkyNode__SkyNode(), null, "initializeSkyNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSkyNode(), "skyNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreEnvironmentFacade__GetSunVector__ApogySystem_String_Environment(), theApogyCommonMathPackage.getTuple3d(), "getSunVector", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCorePackage.getApogySystem(), "apogySystem", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "nodeID", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreInvocatorPackage.getEnvironment(), "environment", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreEnvironmentFacade__GetSunVector__Node_Environment(), theApogyCommonMathPackage.getTuple3d(), "getSunVector", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonTopologyPackage.getNode(), "node", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreInvocatorPackage.getEnvironment(), "environment", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreEnvironmentFacade__GetVector__Node_ApogySystem_ConnectionPoint_Environment(), theApogyCommonMathPackage.getTuple3d(), "getVector", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonTopologyPackage.getNode(), "node", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCorePackage.getApogySystem(), "targetApogySystem", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCorePackage.getConnectionPoint(), "connectionPoint", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreInvocatorPackage.getEnvironment(), "environment", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreEnvironmentFacade__GetVector__ApogySystem_String_ApogySystem_ConnectionPoint_Environment(), theApogyCommonMathPackage.getTuple3d(), "getVector", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCorePackage.getApogySystem(), "sourceApogySystem", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "nodeID", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCorePackage.getApogySystem(), "targetApogySystem", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCorePackage.getConnectionPoint(), "connectionPoint", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreInvocatorPackage.getEnvironment(), "environment", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreEnvironmentFacade__GetVector__ApogySystem_String_ApogySystem_String_Environment(), theApogyCommonMathPackage.getTuple3d(), "getVector", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCorePackage.getApogySystem(), "sourceApogySystem", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "nodeID", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCorePackage.getApogySystem(), "targetApogySystem", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "connectionPointName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreInvocatorPackage.getEnvironment(), "environment", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreEnvironmentFacade__GetVector__ApogySystem_String_String_String_Environment(), theApogyCommonMathPackage.getTuple3d(), "getVector", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCorePackage.getApogySystem(), "sourceApogySystem", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "nodeID", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "targetSystemfullyQualifiedName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "connectionPointName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreInvocatorPackage.getEnvironment(), "environment", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(starEClass, Star.class, "Star", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStar_Magnitude(), theEcorePackage.getEFloat(), "magnitude", null, 0, 1, Star.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStar_EquatorialCoordinates(), this.getEquatorialCoordinates(), null, "equatorialCoordinates", null, 0, 1, Star.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(starFieldEClass, StarField.class, "StarField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStarField_Stars(), this.getStar(), null, "stars", null, 0, -1, StarField.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStarField_StarFieldFileName(), theEcorePackage.getEString(), "starFieldFileName", "bright_star_catalog_5.txt", 0, 1, StarField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equatorialCoordinatesEClass, EquatorialCoordinates.class, "EquatorialCoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEquatorialCoordinates_RightAscension(), theEcorePackage.getEDouble(), "rightAscension", null, 0, 1, EquatorialCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEquatorialCoordinates_Declination(), theEcorePackage.getEDouble(), "declination", null, 0, 1, EquatorialCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEquatorialCoordinates_Radius(), theEcorePackage.getEDouble(), "radius", null, 0, 1, EquatorialCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(worksiteNodeEClass, WorksiteNode.class, "WorksiteNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorksiteNode_Worksite(), this.getWorksite(), null, "worksite", null, 0, 1, WorksiteNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skyNodeEClass, SkyNode.class, "SkyNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSkyNode_Sky(), this.getSky(), this.getSky_SkyNode(), "sky", null, 0, 1, SkyNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sortedSetEDataType, SortedSet.class, "SortedSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateEDataType, Date.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(point3dEDataType, Point3d.class, "Point3d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(color3fEDataType, Color3f.class, "Color3f", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iProgressMonitorEDataType, IProgressMonitor.class, "IProgressMonitor", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
  protected void createGenModelAnnotations()
  {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "documentation", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca),\n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "prefix", "ApogyCoreEnvironment",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "modelName", "ApogyCoreEnvironment",
			 "complianceLevel", "6.0",
			 "suppressGenModelAnnotations", "false",
			 "dynamicTemplates", "true",
			 "templateDirectory", "platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.core.environment/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.core.environment.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.core"
		   });	
		addAnnotation
		  (apogyEnvironmentEClass, 
		   source, 
		   new String[] {
			 "documentation", " -------------------------------------------------------------------------\n\nApogy Environment.\n\n-------------------------------------------------------------------------"
		   });	
		addAnnotation
		  (getApogyEnvironment_WorksitesList(), 
		   source, 
		   new String[] {
			 "documentation", "The list of available worksites."
		   });	
		addAnnotation
		  (getApogyEnvironment_ActiveWorksite(), 
		   source, 
		   new String[] {
			 "documentation", "The worksite currently active."
		   });	
		addAnnotation
		  (getApogyEnvironment_TimeSourcesList(), 
		   source, 
		   new String[] {
			 "documentation", "The list of available time sources."
		   });	
		addAnnotation
		  (getApogyEnvironment_ActiveTimeSource(), 
		   source, 
		   new String[] {
			 "documentation", "The time source currently providing time used to drive the environment."
		   });	
		addAnnotation
		  (getApogyEnvironment_EnvironmentItems(), 
		   source, 
		   new String[] {
			 "documentation", "A list of environment items."
		   });	
		addAnnotation
		  (abstractApogyEnvironmentItemEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nAbstract class representing an item that can be stored under an ApogyEnvironment."
		   });	
		addAnnotation
		  (timeSourcesListEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nList of Time Sources."
		   });	
		addAnnotation
		  (getTimeSourcesList_Environment(), 
		   source, 
		   new String[] {
			 "property", "None"
		   });	
		addAnnotation
		  (worksiteEClass, 
		   source, 
		   new String[] {
			 "documentation", " -------------------------------------------------------------------------\n\nWorksites\n\n-------------------------------------------------------------------------"
		   });	
		addAnnotation
		  (getWorksite_WorksiteNode(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe Topology Node associated with the Worksite.",
			 "property", "None",
			 "children", "true",
			 "notify", "true"
		   });	
		addAnnotation
		  (getWorksite_Sky(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe Sky associated with the Worksite.",
			 "children", "true",
			 "notify", "true",
			 "property", "None"
		   });	
		addAnnotation
		  (getAbstractWorksite_WorksitesList(), 
		   source, 
		   new String[] {
			 "property", "None"
		   });	
		addAnnotation
		  (abstractSurfaceLocationEClass, 
		   source, 
		   new String[] {
			 "documentation", " -------------------------------------------------------------------------\n\nSurface Location\n\n-------------------------------------------------------------------------"
		   });	
		addAnnotation
		  (surfaceLocationsListEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nA list of AbstractSurfaceLocation."
		   });	
		addAnnotation
		  (skyEClass, 
		   source, 
		   new String[] {
			 "documentation", " -------------------------------------------------------------------------\n\nSky\n\n-------------------------------------------------------------------------"
		   });	
		addAnnotation
		  (getSky__GetSunAngularDiameter(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the Sun angular diameter, in radians.",
			 "propertyCategory", "SUN",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getSky_Worksite(), 
		   source, 
		   new String[] {
			 "documentation", "The worksite to which the sky is associated.",
			 "property", "None"
		   });	
		addAnnotation
		  (getSky_SkyNode(), 
		   source, 
		   new String[] {
			 "children", "true",
			 "notify", "true",
			 "property", "None"
		   });	
		addAnnotation
		  (getSky_Sun(), 
		   source, 
		   new String[] {
			 "documentation", "The Sun in the sky.",
			 "propertyCategory", "SUN"
		   });	
		addAnnotation
		  (getSky_StarField(), 
		   source, 
		   new String[] {
			 "documentation", "The stars in the sky.",
			 "propertyCategory", "STARS"
		   });	
		addAnnotation
		  (celestialBodyEClass, 
		   source, 
		   new String[] {
			 "documentation", " -------------------------------------------------------------------------\n\nCelestial Bodies\n\n-------------------------------------------------------------------------"
		   });	
		addAnnotation
		  (getCelestialBody_MeanRadius(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe mean radius of the body. Sub-classes should overload the getter to return the appropriate value.",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (sunEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nThe Sun. Its mean radius is 6.955E8 meters."
		   });	
		addAnnotation
		  (getSun__GetIrradiance__double(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the sun intensity at the specified radius.\n@param radius The distance from the sun center, in meters."
		   });	
		addAnnotation
		  ((getSun__GetIrradiance__double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getSun_Radius(), 
		   source, 
		   new String[] {
			 "documentation", "Sun radius, in meters.",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (earthEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nThe Earth. Its mean radius is 6371000 meters."
		   });	
		addAnnotation
		  (getEarth_Radius(), 
		   source, 
		   new String[] {
			 "documentation", "Earth mean radius, in meters.",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (moonEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nThe Moon. Its mean radius is 1737100 meters."
		   });	
		addAnnotation
		  (getMoon_Radius(), 
		   source, 
		   new String[] {
			 "documentation", "Moon radius, in meters.",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (environmentUtilitiesEClass, 
		   source, 
		   new String[] {
			 "documentation", "Utilities class providing conversion methods."
		   });	
		addAnnotation
		  (getEnvironmentUtilities__ConvertToJulianDate__Date(), 
		   source, 
		   new String[] {
			 "documentation", "Convert from Date (UTC) to Julian.\nUses formula found at http://en.wikipedia.org/wiki/Julian_date#cite_note-12"
		   });	
		addAnnotation
		  (getEnvironmentUtilities__ParseRightAscension__String(), 
		   source, 
		   new String[] {
			 "documentation", "Method that parses Right Ascension angle expressed in\nHH:mm:ss format and return an angle in radians.",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getEnvironmentUtilities__ParseDegMinSec__String(), 
		   source, 
		   new String[] {
			 "documentation", "Method that parses an angle expressed in deg:mm:ss format\nand return an angle in radians.",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getEnvironmentUtilities__SortByMagnitude__List(), 
		   source, 
		   new String[] {
			 "documentation", "Method that sorts a list of stars by magnitude."
		   });	
		addAnnotation
		  (apogyCoreEnvironmentFacadeEClass, 
		   source, 
		   new String[] {
			 "documentation", "A class providing utilities methods to create fully initialze object."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentFacade__CreateApogySession(), 
		   source, 
		   new String[] {
			 "documentation", "Create an Apogy session.\n@return Reference to the newly created session."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentFacade__CreateStar__float_double_double(), 
		   source, 
		   new String[] {
			 "documentation", "*\nCreates and initialize a star.\n@param magnitude Star\'s magnitude.\n@param rightAscension Right Ascension position of the star.\n@param declination The declination of the star."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentFacade__CreateAndInitializeStars(), 
		   source, 
		   new String[] {
			 "documentation", "Creates and initialize a StarField."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentFacade__SortByMagnitude__List(), 
		   source, 
		   new String[] {
			 "documentation", "Method that sorts a list of stars by magnitude."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentFacade__CreateSky(), 
		   source, 
		   new String[] {
			 "documentation", "*\nCreates and initialize a Sky. This includes creating and initializing the associated SkyNode.\n@return An initialized Sky."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentFacade__CreateSkyNode(), 
		   source, 
		   new String[] {
			 "documentation", "*\nCreates and initialize a SkyNode.\n@return An initialized SkyNode."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentFacade__InitializeSkyNode__SkyNode(), 
		   source, 
		   new String[] {
			 "documentation", "*\nInitialize an existing SkyNode."
		   });	
		addAnnotation
		  (starEClass, 
		   source, 
		   new String[] {
			 "documentation", "A star."
		   });	
		addAnnotation
		  (starFieldEClass, 
		   source, 
		   new String[] {
			 "documentation", "Represents the brightest stars in the sky."
		   });	
		addAnnotation
		  (getStarField_Stars(), 
		   source, 
		   new String[] {
			 "children", "true",
			 "notify", "true",
			 "property", "None"
		   });	
		addAnnotation
		  (equatorialCoordinatesEClass, 
		   source, 
		   new String[] {
			 "documentation", "The equatorial coordinate system is a widely-used method of mapping celestial objects.\nIt functions by projecting the Earth\'s geographic poles and equator onto the celestial\nsphere. The projection of the Earth\'s equator onto the celestial sphere is called the\ncelestial equator. Similarly, the projections of the Earth\'s north and south geographic\npoles become the north and south celestial poles, respectively."
		   });	
		addAnnotation
		  (worksiteNodeEClass, 
		   source, 
		   new String[] {
			 "documentation", " -------------------------------------------------------------------------\n\nSpecific Topology Nodes.\n\n-------------------------------------------------------------------------"
		   });	
		addAnnotation
		  (getSkyNode_Sky(), 
		   source, 
		   new String[] {
			 "property", "None"
		   });
	}

} //ApogyCoreEnvironmentPackageImpl
