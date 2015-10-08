/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.telecoms.ui.impl;

import ca.gc.space.topology.ui.TopologyUIPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.addons.telecoms.ui.AbstractAntennaRadiationPatternPresentation;
import org.eclipse.symphony.addons.telecoms.ui.SymphonyTelecomToolsUIFactory;
import org.eclipse.symphony.addons.telecoms.ui.SymphonyTelecomToolsUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyTelecomToolsUIPackageImpl extends EPackageImpl implements SymphonyTelecomToolsUIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractAntennaRadiationPatternPresentationEClass = null;
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
	 * @see org.eclipse.symphony.addons.telecoms.ui.SymphonyTelecomToolsUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SymphonyTelecomToolsUIPackageImpl() {
		super(eNS_URI, SymphonyTelecomToolsUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SymphonyTelecomToolsUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SymphonyTelecomToolsUIPackage init() {
		if (isInited) return (SymphonyTelecomToolsUIPackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyTelecomToolsUIPackage.eNS_URI);

		// Obtain or create and register package
		SymphonyTelecomToolsUIPackageImpl theSymphonyTelecomToolsUIPackage = (SymphonyTelecomToolsUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SymphonyTelecomToolsUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SymphonyTelecomToolsUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TopologyUIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphonyTelecomToolsUIPackage.createPackageContents();

		// Initialize created meta-data
		theSymphonyTelecomToolsUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphonyTelecomToolsUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SymphonyTelecomToolsUIPackage.eNS_URI, theSymphonyTelecomToolsUIPackage);
		return theSymphonyTelecomToolsUIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractAntennaRadiationPatternPresentation() {
		return abstractAntennaRadiationPatternPresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyTelecomToolsUIFactory getSymphonyTelecomToolsUIFactory() {
		return (SymphonyTelecomToolsUIFactory)getEFactoryInstance();
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
		abstractAntennaRadiationPatternPresentationEClass = createEClass(ABSTRACT_ANTENNA_RADIATION_PATTERN_PRESENTATION);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractAntennaRadiationPatternPresentationEClass.getESuperTypes().add(theTopologyUIPackage.getNodePresentation());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractAntennaRadiationPatternPresentationEClass, AbstractAntennaRadiationPatternPresentation.class, "AbstractAntennaRadiationPatternPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
			 "prefix", "SymphonyTelecomToolsUI",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)",
			 "modelName", "SymphonyTelecomToolsUI",
			 "complianceLevel", "6.0",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/org.eclipse.symphony.addons.telecoms.ui/src-generated",
			 "editDirectory", "/org.eclipse.symphony.addons.telecoms.ui.edit/src-generated",
			 "basePackage", "org.eclipse.symphony.addons.telecoms"
		   });
	}

} //SymphonyTelecomToolsUIPackageImpl
