/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle.ui.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.addons.vehicle.ui.LanderSphericalFootPresentation;
import org.eclipse.symphony.addons.vehicle.ui.PhysicalWheelPresentation;
import org.eclipse.symphony.addons.vehicle.ui.Symphony__AddonsVehicleUIFactory;
import org.eclipse.symphony.addons.vehicle.ui.Symphony__AddonsVehicleUIPackage;
import org.eclipse.symphony.addons.vehicle.ui.ThrusterPresentation;
import org.eclipse.symphony.common.topology.ui.TopologyUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsVehicleUIPackageImpl extends EPackageImpl implements Symphony__AddonsVehicleUIPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass physicalWheelPresentationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass landerSphericalFootPresentationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass thrusterPresentationEClass = null;

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
	 * @see org.eclipse.symphony.addons.vehicle.ui.Symphony__AddonsVehicleUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private Symphony__AddonsVehicleUIPackageImpl()
  {
		super(eNS_URI, Symphony__AddonsVehicleUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Symphony__AddonsVehicleUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static Symphony__AddonsVehicleUIPackage init()
  {
		if (isInited) return (Symphony__AddonsVehicleUIPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__AddonsVehicleUIPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__AddonsVehicleUIPackageImpl theSymphony__AddonsVehicleUIPackage = (Symphony__AddonsVehicleUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__AddonsVehicleUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__AddonsVehicleUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TopologyUIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__AddonsVehicleUIPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__AddonsVehicleUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__AddonsVehicleUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__AddonsVehicleUIPackage.eNS_URI, theSymphony__AddonsVehicleUIPackage);
		return theSymphony__AddonsVehicleUIPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getPhysicalWheelPresentation()
  {
		return physicalWheelPresentationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getLanderSphericalFootPresentation()
  {
		return landerSphericalFootPresentationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getThrusterPresentation()
  {
		return thrusterPresentationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThrusterPresentation_PlumeEnvelopeVisible() {
		return (EAttribute)thrusterPresentationEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThrusterPresentation_PlumeEnvelopeLenght() {
		return (EAttribute)thrusterPresentationEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsVehicleUIFactory getSymphony__AddonsVehicleUIFactory() {
		return (Symphony__AddonsVehicleUIFactory)getEFactoryInstance();
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
		physicalWheelPresentationEClass = createEClass(PHYSICAL_WHEEL_PRESENTATION);

		landerSphericalFootPresentationEClass = createEClass(LANDER_SPHERICAL_FOOT_PRESENTATION);

		thrusterPresentationEClass = createEClass(THRUSTER_PRESENTATION);
		createEAttribute(thrusterPresentationEClass, THRUSTER_PRESENTATION__PLUME_ENVELOPE_VISIBLE);
		createEAttribute(thrusterPresentationEClass, THRUSTER_PRESENTATION__PLUME_ENVELOPE_LENGHT);
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
		TopologyUIPackage theTopologyUIPackage = (TopologyUIPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyUIPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		physicalWheelPresentationEClass.getESuperTypes().add(theTopologyUIPackage.getNodePresentation());
		landerSphericalFootPresentationEClass.getESuperTypes().add(theTopologyUIPackage.getNodePresentation());
		thrusterPresentationEClass.getESuperTypes().add(theTopologyUIPackage.getNodePresentation());

		// Initialize classes, features, and operations; add parameters
		initEClass(physicalWheelPresentationEClass, PhysicalWheelPresentation.class, "PhysicalWheelPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(landerSphericalFootPresentationEClass, LanderSphericalFootPresentation.class, "LanderSphericalFootPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(thrusterPresentationEClass, ThrusterPresentation.class, "ThrusterPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThrusterPresentation_PlumeEnvelopeVisible(), theEcorePackage.getEBoolean(), "plumeEnvelopeVisible", "false", 0, 1, ThrusterPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThrusterPresentation_PlumeEnvelopeLenght(), theEcorePackage.getEDouble(), "plumeEnvelopeLenght", "1.0", 0, 1, ThrusterPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Symphony__AddonsVehicleUIPackageImpl
