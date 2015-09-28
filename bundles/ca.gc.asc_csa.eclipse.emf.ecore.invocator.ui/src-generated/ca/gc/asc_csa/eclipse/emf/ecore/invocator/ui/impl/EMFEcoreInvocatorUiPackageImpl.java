/**
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.impl;

import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.EMFEcoreInvocatorUiFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.EMFEcoreInvocatorUiFactory;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.EMFEcoreInvocatorUiPackage;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFEcoreInvocatorUiPackageImpl extends EPackageImpl implements EMFEcoreInvocatorUiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfEcoreInvocatorUiFacadeEClass = null;

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
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.EMFEcoreInvocatorUiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EMFEcoreInvocatorUiPackageImpl() {
		super(eNS_URI, EMFEcoreInvocatorUiFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EMFEcoreInvocatorUiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EMFEcoreInvocatorUiPackage init() {
		if (isInited) return (EMFEcoreInvocatorUiPackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcoreInvocatorUiPackage.eNS_URI);

		// Obtain or create and register package
		EMFEcoreInvocatorUiPackageImpl theEMFEcoreInvocatorUiPackage = (EMFEcoreInvocatorUiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EMFEcoreInvocatorUiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EMFEcoreInvocatorUiPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EMFEcoreInvocatorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEMFEcoreInvocatorUiPackage.createPackageContents();

		// Initialize created meta-data
		theEMFEcoreInvocatorUiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEMFEcoreInvocatorUiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EMFEcoreInvocatorUiPackage.eNS_URI, theEMFEcoreInvocatorUiPackage);
		return theEMFEcoreInvocatorUiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFEcoreInvocatorUiFacade() {
		return emfEcoreInvocatorUiFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEMFEcoreInvocatorUiFacade__CopyInitializationData__Context_Context() {
		return emfEcoreInvocatorUiFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEMFEcoreInvocatorUiFacade__CopyInitializationData__AbstractTypeImplementation_AbstractTypeImplementation_CompoundCommand() {
		return emfEcoreInvocatorUiFacadeEClass.getEOperations().get(1);
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
	public EMFEcoreInvocatorUiFactory getEMFEcoreInvocatorUiFactory() {
		return (EMFEcoreInvocatorUiFactory)getEFactoryInstance();
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
		emfEcoreInvocatorUiFacadeEClass = createEClass(EMF_ECORE_INVOCATOR_UI_FACADE);
		createEOperation(emfEcoreInvocatorUiFacadeEClass, EMF_ECORE_INVOCATOR_UI_FACADE___COPY_INITIALIZATION_DATA__CONTEXT_CONTEXT);
		createEOperation(emfEcoreInvocatorUiFacadeEClass, EMF_ECORE_INVOCATOR_UI_FACADE___COPY_INITIALIZATION_DATA__ABSTRACTTYPEIMPLEMENTATION_ABSTRACTTYPEIMPLEMENTATION_COMPOUNDCOMMAND);

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
		EMFEcoreInvocatorPackage theEMFEcoreInvocatorPackage = (EMFEcoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcoreInvocatorPackage.eNS_URI);
		EMFEcorePackage theEMFEcorePackage = (EMFEcorePackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(emfEcoreInvocatorUiFacadeEClass, EMFEcoreInvocatorUiFacade.class, "EMFEcoreInvocatorUiFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getEMFEcoreInvocatorUiFacade__CopyInitializationData__Context_Context(), null, "copyInitializationData", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEMFEcoreInvocatorPackage.getContext(), "source", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEMFEcoreInvocatorPackage.getContext(), "destination", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, theEMFEcorePackage.getException());

		op = initEOperation(getEMFEcoreInvocatorUiFacade__CopyInitializationData__AbstractTypeImplementation_AbstractTypeImplementation_CompoundCommand(), null, "copyInitializationData", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEMFEcoreInvocatorPackage.getAbstractTypeImplementation(), "source", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEMFEcoreInvocatorPackage.getAbstractTypeImplementation(), "destination", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompoundCommand(), "command", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, theEMFEcorePackage.getException());

		// Initialize data types
		initEDataType(compoundCommandEDataType, CompoundCommand.class, "CompoundCommand", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EMFEcoreInvocatorUiPackageImpl
