/**
 */
package ca.gc.asc_csa.apogy.core.invocator.ui.impl;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIFacade;
import ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIFactory;
import ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreInvocatorUIPackageImpl extends EPackageImpl implements ApogyCoreInvocatorUIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogy__CoreInvocatorUIFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType compoundCommandEDataType = null;

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
	 * @see ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyCoreInvocatorUIPackageImpl() {
		super(eNS_URI, ApogyCoreInvocatorUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyCoreInvocatorUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyCoreInvocatorUIPackage init() {
		if (isInited) return (ApogyCoreInvocatorUIPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreInvocatorUIPackage.eNS_URI);

		// Obtain or create and register package
		ApogyCoreInvocatorUIPackageImpl theApogyCoreInvocatorUIPackage = (ApogyCoreInvocatorUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCoreInvocatorUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCoreInvocatorUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCoreInvocatorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyCoreInvocatorUIPackage.createPackageContents();

		// Initialize created meta-data
		theApogyCoreInvocatorUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCoreInvocatorUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCoreInvocatorUIPackage.eNS_URI, theApogyCoreInvocatorUIPackage);
		return theApogyCoreInvocatorUIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyCoreInvocatorUIFacade() {
		return apogy__CoreInvocatorUIFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorUIFacade__CopyInitializationData__Context_Context() {
		return apogy__CoreInvocatorUIFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorUIFacade__CopyInitializationData__AbstractTypeImplementation_AbstractTypeImplementation_CompoundCommand() {
		return apogy__CoreInvocatorUIFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCompoundCommand() {
		return compoundCommandEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreInvocatorUIFactory getApogyCoreInvocatorUIFactory() {
		return (ApogyCoreInvocatorUIFactory)getEFactoryInstance();
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
		apogy__CoreInvocatorUIFacadeEClass = createEClass(APOGY_CORE_INVOCATOR_UI_FACADE);
		createEOperation(apogy__CoreInvocatorUIFacadeEClass, APOGY_CORE_INVOCATOR_UI_FACADE___COPY_INITIALIZATION_DATA__CONTEXT_CONTEXT);
		createEOperation(apogy__CoreInvocatorUIFacadeEClass, APOGY_CORE_INVOCATOR_UI_FACADE___COPY_INITIALIZATION_DATA__ABSTRACTTYPEIMPLEMENTATION_ABSTRACTTYPEIMPLEMENTATION_COMPOUNDCOMMAND);

		// Create data types
		compoundCommandEDataType = createEDataType(COMPOUND_COMMAND);
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
		ApogyCoreInvocatorPackage theApogyCoreInvocatorPackage = (ApogyCoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreInvocatorPackage.eNS_URI);
		ApogyCommonEMFPackage theApogyCommonEMFPackage = (ApogyCommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonEMFPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(apogy__CoreInvocatorUIFacadeEClass, ApogyCoreInvocatorUIFacade.class, "ApogyCoreInvocatorUIFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getApogyCoreInvocatorUIFacade__CopyInitializationData__Context_Context(), null, "copyInitializationData", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreInvocatorPackage.getContext(), "source", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreInvocatorPackage.getContext(), "destination", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, theApogyCommonEMFPackage.getException());

		op = initEOperation(getApogyCoreInvocatorUIFacade__CopyInitializationData__AbstractTypeImplementation_AbstractTypeImplementation_CompoundCommand(), null, "copyInitializationData", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreInvocatorPackage.getAbstractTypeImplementation(), "source", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreInvocatorPackage.getAbstractTypeImplementation(), "destination", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompoundCommand(), "command", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, theApogyCommonEMFPackage.getException());

		// Initialize data types
		initEDataType(compoundCommandEDataType, CompoundCommand.class, "CompoundCommand", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyCoreInvocatorUIPackageImpl
