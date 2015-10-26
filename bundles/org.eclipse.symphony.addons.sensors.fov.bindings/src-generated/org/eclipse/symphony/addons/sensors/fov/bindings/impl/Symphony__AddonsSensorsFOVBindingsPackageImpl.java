/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.fov.bindings.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.addons.sensors.fov.Symphony__AddonsSensorsFOVPackage;
import org.eclipse.symphony.addons.sensors.fov.bindings.CircularSectorFieldOfViewBinding;
import org.eclipse.symphony.addons.sensors.fov.bindings.ConicalFieldOfViewBinding;
import org.eclipse.symphony.addons.sensors.fov.bindings.Symphony__AddonsSensorsFOVBindingsFactory;
import org.eclipse.symphony.addons.sensors.fov.bindings.Symphony__AddonsSensorsFOVBindingsPackage;
import org.eclipse.symphony.addons.sensors.fov.bindings.RectangularFrustrumFieldOfViewBinding;
import org.eclipse.symphony.common.topology.bindings.TopologyBindingsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsSensorsFOVBindingsPackageImpl extends EPackageImpl implements Symphony__AddonsSensorsFOVBindingsPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass circularSectorFieldOfViewBindingEClass = null;
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass conicalFieldOfViewBindingEClass = null;
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass rectangularFrustrumFieldOfViewBindingEClass = null;

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
	 * @see org.eclipse.symphony.addons.sensors.fov.bindings.Symphony__AddonsSensorsFOVBindingsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private Symphony__AddonsSensorsFOVBindingsPackageImpl()
  {
		super(eNS_URI, Symphony__AddonsSensorsFOVBindingsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Symphony__AddonsSensorsFOVBindingsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static Symphony__AddonsSensorsFOVBindingsPackage init()
  {
		if (isInited) return (Symphony__AddonsSensorsFOVBindingsPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__AddonsSensorsFOVBindingsPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__AddonsSensorsFOVBindingsPackageImpl theSymphony__AddonsSensorsFOVBindingsPackage = (Symphony__AddonsSensorsFOVBindingsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__AddonsSensorsFOVBindingsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__AddonsSensorsFOVBindingsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TopologyBindingsPackage.eINSTANCE.eClass();
		Symphony__AddonsSensorsFOVPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__AddonsSensorsFOVBindingsPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__AddonsSensorsFOVBindingsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__AddonsSensorsFOVBindingsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__AddonsSensorsFOVBindingsPackage.eNS_URI, theSymphony__AddonsSensorsFOVBindingsPackage);
		return theSymphony__AddonsSensorsFOVBindingsPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCircularSectorFieldOfViewBinding()
  {
		return circularSectorFieldOfViewBindingEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCircularSectorFieldOfViewBinding_Fov()
  {
		return (EReference)circularSectorFieldOfViewBindingEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getConicalFieldOfViewBinding()
  {
		return conicalFieldOfViewBindingEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getConicalFieldOfViewBinding_Fov()
  {
		return (EReference)conicalFieldOfViewBindingEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRectangularFrustrumFieldOfViewBinding()
  {
		return rectangularFrustrumFieldOfViewBindingEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRectangularFrustrumFieldOfViewBinding_Fov()
  {
		return (EReference)rectangularFrustrumFieldOfViewBindingEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsSensorsFOVBindingsFactory getSymphony__AddonsSensorsFOVBindingsFactory() {
		return (Symphony__AddonsSensorsFOVBindingsFactory)getEFactoryInstance();
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
		circularSectorFieldOfViewBindingEClass = createEClass(CIRCULAR_SECTOR_FIELD_OF_VIEW_BINDING);
		createEReference(circularSectorFieldOfViewBindingEClass, CIRCULAR_SECTOR_FIELD_OF_VIEW_BINDING__FOV);

		conicalFieldOfViewBindingEClass = createEClass(CONICAL_FIELD_OF_VIEW_BINDING);
		createEReference(conicalFieldOfViewBindingEClass, CONICAL_FIELD_OF_VIEW_BINDING__FOV);

		rectangularFrustrumFieldOfViewBindingEClass = createEClass(RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_BINDING);
		createEReference(rectangularFrustrumFieldOfViewBindingEClass, RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_BINDING__FOV);
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
		TopologyBindingsPackage theTopologyBindingsPackage = (TopologyBindingsPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyBindingsPackage.eNS_URI);
		Symphony__AddonsSensorsFOVPackage theSymphony__AddonsSensorsFOVPackage = (Symphony__AddonsSensorsFOVPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__AddonsSensorsFOVPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		circularSectorFieldOfViewBindingEClass.getESuperTypes().add(theTopologyBindingsPackage.getAbstractTopologyBinding());
		conicalFieldOfViewBindingEClass.getESuperTypes().add(theTopologyBindingsPackage.getAbstractTopologyBinding());
		rectangularFrustrumFieldOfViewBindingEClass.getESuperTypes().add(theTopologyBindingsPackage.getAbstractTopologyBinding());

		// Initialize classes, features, and operations; add parameters
		initEClass(circularSectorFieldOfViewBindingEClass, CircularSectorFieldOfViewBinding.class, "CircularSectorFieldOfViewBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCircularSectorFieldOfViewBinding_Fov(), theSymphony__AddonsSensorsFOVPackage.getCircularSectorFieldOfView(), null, "fov", null, 0, 1, CircularSectorFieldOfViewBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conicalFieldOfViewBindingEClass, ConicalFieldOfViewBinding.class, "ConicalFieldOfViewBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConicalFieldOfViewBinding_Fov(), theSymphony__AddonsSensorsFOVPackage.getConicalFieldOfView(), null, "fov", null, 0, 1, ConicalFieldOfViewBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rectangularFrustrumFieldOfViewBindingEClass, RectangularFrustrumFieldOfViewBinding.class, "RectangularFrustrumFieldOfViewBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRectangularFrustrumFieldOfViewBinding_Fov(), theSymphony__AddonsSensorsFOVPackage.getRectangularFrustrumFieldOfView(), null, "fov", null, 0, 1, RectangularFrustrumFieldOfViewBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Symphony__AddonsSensorsFOVBindingsPackageImpl
