/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.addons.primitives.ui.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.common.topology.addons.primitives.ui.LabelPresentation;
import org.eclipse.symphony.common.topology.addons.primitives.ui.SpherePrimitivePresentation;
import org.eclipse.symphony.common.topology.addons.primitives.ui.TopologyUIPrimitivesFactory;
import org.eclipse.symphony.common.topology.addons.primitives.ui.TopologyUIPrimitivesPackage;
import org.eclipse.symphony.common.topology.addons.primitives.ui.VectorPresentation;
import org.eclipse.symphony.common.topology.addons.primitives.ui.WayPointPresentation;
import org.eclipse.symphony.common.topology.ui.TopologyUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TopologyUIPrimitivesPackageImpl extends EPackageImpl implements TopologyUIPrimitivesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vectorPresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wayPointPresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelPresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spherePrimitivePresentationEClass = null;

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
	 * @see org.eclipse.symphony.common.topology.addons.primitives.ui.TopologyUIPrimitivesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TopologyUIPrimitivesPackageImpl() {
		super(eNS_URI, TopologyUIPrimitivesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TopologyUIPrimitivesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TopologyUIPrimitivesPackage init() {
		if (isInited) return (TopologyUIPrimitivesPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyUIPrimitivesPackage.eNS_URI);

		// Obtain or create and register package
		TopologyUIPrimitivesPackageImpl theTopologyUIPrimitivesPackage = (TopologyUIPrimitivesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TopologyUIPrimitivesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TopologyUIPrimitivesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TopologyUIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTopologyUIPrimitivesPackage.createPackageContents();

		// Initialize created meta-data
		theTopologyUIPrimitivesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTopologyUIPrimitivesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TopologyUIPrimitivesPackage.eNS_URI, theTopologyUIPrimitivesPackage);
		return theTopologyUIPrimitivesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVectorPresentation() {
		return vectorPresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVectorPresentation_LineWidth() {
		return (EAttribute)vectorPresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWayPointPresentation() {
		return wayPointPresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelPresentation() {
		return labelPresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpherePrimitivePresentation() {
		return spherePrimitivePresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyUIPrimitivesFactory getTopologyUIPrimitivesFactory() {
		return (TopologyUIPrimitivesFactory)getEFactoryInstance();
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
		vectorPresentationEClass = createEClass(VECTOR_PRESENTATION);
		createEAttribute(vectorPresentationEClass, VECTOR_PRESENTATION__LINE_WIDTH);

		wayPointPresentationEClass = createEClass(WAY_POINT_PRESENTATION);

		labelPresentationEClass = createEClass(LABEL_PRESENTATION);

		spherePrimitivePresentationEClass = createEClass(SPHERE_PRIMITIVE_PRESENTATION);
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
		TopologyUIPackage theTopologyUIPackage = (TopologyUIPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyUIPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vectorPresentationEClass.getESuperTypes().add(theTopologyUIPackage.getNodePresentation());
		wayPointPresentationEClass.getESuperTypes().add(theTopologyUIPackage.getNodePresentation());
		labelPresentationEClass.getESuperTypes().add(theTopologyUIPackage.getNodePresentation());
		spherePrimitivePresentationEClass.getESuperTypes().add(theTopologyUIPackage.getNodePresentation());

		// Initialize classes, features, and operations; add parameters
		initEClass(vectorPresentationEClass, VectorPresentation.class, "VectorPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVectorPresentation_LineWidth(), theEcorePackage.getEInt(), "lineWidth", "1", 0, 1, VectorPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wayPointPresentationEClass, WayPointPresentation.class, "WayPointPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(labelPresentationEClass, LabelPresentation.class, "LabelPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spherePrimitivePresentationEClass, SpherePrimitivePresentation.class, "SpherePrimitivePresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TopologyUIPrimitivesPackageImpl
