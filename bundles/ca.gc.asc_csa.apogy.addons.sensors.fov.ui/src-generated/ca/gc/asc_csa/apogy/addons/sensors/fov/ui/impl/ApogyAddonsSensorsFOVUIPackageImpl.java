/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.fov.ui.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.CircularSectorFieldOfViewPresentation;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.ConicalFieldOfViewPresentation;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.FieldOfViewPresentation;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.ApogyAddonsSensorsFOVUIFactory;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.ApogyAddonsSensorsFOVUIPackage;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.RectangularFrustrumFieldOfViewPresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsSensorsFOVUIPackageImpl extends EPackageImpl implements ApogyAddonsSensorsFOVUIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldOfViewPresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circularSectorFieldOfViewPresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conicalFieldOfViewPresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectangularFrustrumFieldOfViewPresentationEClass = null;

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
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.ApogyAddonsSensorsFOVUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyAddonsSensorsFOVUIPackageImpl() {
		super(eNS_URI, ApogyAddonsSensorsFOVUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyAddonsSensorsFOVUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyAddonsSensorsFOVUIPackage init() {
		if (isInited) return (ApogyAddonsSensorsFOVUIPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsSensorsFOVUIPackage.eNS_URI);

		// Obtain or create and register package
		ApogyAddonsSensorsFOVUIPackageImpl theApogyAddonsSensorsFOVUIPackage = (ApogyAddonsSensorsFOVUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyAddonsSensorsFOVUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyAddonsSensorsFOVUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCommonTopologyUIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyAddonsSensorsFOVUIPackage.createPackageContents();

		// Initialize created meta-data
		theApogyAddonsSensorsFOVUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyAddonsSensorsFOVUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyAddonsSensorsFOVUIPackage.eNS_URI, theApogyAddonsSensorsFOVUIPackage);
		return theApogyAddonsSensorsFOVUIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldOfViewPresentation() {
		return fieldOfViewPresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldOfViewPresentation_Transparency() {
		return (EAttribute)fieldOfViewPresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldOfViewPresentation_PresentationMode() {
		return (EAttribute)fieldOfViewPresentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldOfViewPresentation_ShowOutlineOnly() {
		return (EAttribute)fieldOfViewPresentationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldOfViewPresentation_ShowProjection() {
		return (EAttribute)fieldOfViewPresentationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldOfViewPresentation_ProjectionColor() {
		return (EAttribute)fieldOfViewPresentationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCircularSectorFieldOfViewPresentation() {
		return circularSectorFieldOfViewPresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConicalFieldOfViewPresentation() {
		return conicalFieldOfViewPresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectangularFrustrumFieldOfViewPresentation() {
		return rectangularFrustrumFieldOfViewPresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsSensorsFOVUIFactory getApogyAddonsSensorsFOVUIFactory() {
		return (ApogyAddonsSensorsFOVUIFactory)getEFactoryInstance();
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
		fieldOfViewPresentationEClass = createEClass(FIELD_OF_VIEW_PRESENTATION);
		createEAttribute(fieldOfViewPresentationEClass, FIELD_OF_VIEW_PRESENTATION__TRANSPARENCY);
		createEAttribute(fieldOfViewPresentationEClass, FIELD_OF_VIEW_PRESENTATION__PRESENTATION_MODE);
		createEAttribute(fieldOfViewPresentationEClass, FIELD_OF_VIEW_PRESENTATION__SHOW_OUTLINE_ONLY);
		createEAttribute(fieldOfViewPresentationEClass, FIELD_OF_VIEW_PRESENTATION__SHOW_PROJECTION);
		createEAttribute(fieldOfViewPresentationEClass, FIELD_OF_VIEW_PRESENTATION__PROJECTION_COLOR);

		circularSectorFieldOfViewPresentationEClass = createEClass(CIRCULAR_SECTOR_FIELD_OF_VIEW_PRESENTATION);

		conicalFieldOfViewPresentationEClass = createEClass(CONICAL_FIELD_OF_VIEW_PRESENTATION);

		rectangularFrustrumFieldOfViewPresentationEClass = createEClass(RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_PRESENTATION);
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
		ApogyCommonTopologyUIPackage theApogyCommonTopologyUIPackage = (ApogyCommonTopologyUIPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonTopologyUIPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fieldOfViewPresentationEClass.getESuperTypes().add(theApogyCommonTopologyUIPackage.getNodePresentation());
		circularSectorFieldOfViewPresentationEClass.getESuperTypes().add(this.getFieldOfViewPresentation());
		conicalFieldOfViewPresentationEClass.getESuperTypes().add(this.getFieldOfViewPresentation());
		rectangularFrustrumFieldOfViewPresentationEClass.getESuperTypes().add(this.getFieldOfViewPresentation());

		// Initialize classes, features, and operations; add parameters
		initEClass(fieldOfViewPresentationEClass, FieldOfViewPresentation.class, "FieldOfViewPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFieldOfViewPresentation_Transparency(), theEcorePackage.getEFloat(), "transparency", null, 0, 1, FieldOfViewPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldOfViewPresentation_PresentationMode(), theApogyCommonTopologyUIPackage.getMeshPresentationMode(), "presentationMode", null, 0, 1, FieldOfViewPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldOfViewPresentation_ShowOutlineOnly(), theEcorePackage.getEBoolean(), "showOutlineOnly", "true", 0, 1, FieldOfViewPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldOfViewPresentation_ShowProjection(), theEcorePackage.getEBoolean(), "showProjection", "false", 0, 1, FieldOfViewPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldOfViewPresentation_ProjectionColor(), theApogyCommonTopologyUIPackage.getRGB(), "projectionColor", null, 0, 1, FieldOfViewPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(circularSectorFieldOfViewPresentationEClass, CircularSectorFieldOfViewPresentation.class, "CircularSectorFieldOfViewPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conicalFieldOfViewPresentationEClass, ConicalFieldOfViewPresentation.class, "ConicalFieldOfViewPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rectangularFrustrumFieldOfViewPresentationEClass, RectangularFrustrumFieldOfViewPresentation.class, "RectangularFrustrumFieldOfViewPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyAddonsSensorsFOVUIPackageImpl
