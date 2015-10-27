/**
 */
package org.eclipse.symphony.core.invocator.ui.impl;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.ui.Symphony__CoreInvocatorUIFacade;
import org.eclipse.symphony.core.invocator.ui.Symphony__CoreInvocatorUIFactory;
import org.eclipse.symphony.core.invocator.ui.Symphony__CoreInvocatorUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CoreInvocatorUIPackageImpl extends EPackageImpl implements Symphony__CoreInvocatorUIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symphony__CoreInvocatorUIFacadeEClass = null;

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
	 * @see org.eclipse.symphony.core.invocator.ui.Symphony__CoreInvocatorUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Symphony__CoreInvocatorUIPackageImpl() {
		super(eNS_URI, Symphony__CoreInvocatorUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Symphony__CoreInvocatorUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Symphony__CoreInvocatorUIPackage init() {
		if (isInited) return (Symphony__CoreInvocatorUIPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CoreInvocatorUIPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__CoreInvocatorUIPackageImpl theSymphony__CoreInvocatorUIPackage = (Symphony__CoreInvocatorUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__CoreInvocatorUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__CoreInvocatorUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Symphony__CoreInvocatorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__CoreInvocatorUIPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__CoreInvocatorUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__CoreInvocatorUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__CoreInvocatorUIPackage.eNS_URI, theSymphony__CoreInvocatorUIPackage);
		return theSymphony__CoreInvocatorUIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymphony__CoreInvocatorUIFacade() {
		return symphony__CoreInvocatorUIFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CoreInvocatorUIFacade__CopyInitializationData__Context_Context() {
		return symphony__CoreInvocatorUIFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CoreInvocatorUIFacade__CopyInitializationData__AbstractTypeImplementation_AbstractTypeImplementation_CompoundCommand() {
		return symphony__CoreInvocatorUIFacadeEClass.getEOperations().get(1);
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
	public Symphony__CoreInvocatorUIFactory getSymphony__CoreInvocatorUIFactory() {
		return (Symphony__CoreInvocatorUIFactory)getEFactoryInstance();
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
		symphony__CoreInvocatorUIFacadeEClass = createEClass(SYMPHONY_CORE_INVOCATOR_UI_FACADE);
		createEOperation(symphony__CoreInvocatorUIFacadeEClass, SYMPHONY_CORE_INVOCATOR_UI_FACADE___COPY_INITIALIZATION_DATA__CONTEXT_CONTEXT);
		createEOperation(symphony__CoreInvocatorUIFacadeEClass, SYMPHONY_CORE_INVOCATOR_UI_FACADE___COPY_INITIALIZATION_DATA__ABSTRACTTYPEIMPLEMENTATION_ABSTRACTTYPEIMPLEMENTATION_COMPOUNDCOMMAND);

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
		Symphony__CoreInvocatorPackage theSymphony__CoreInvocatorPackage = (Symphony__CoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CoreInvocatorPackage.eNS_URI);
		Symphony__CommonEMFPackage theSymphony__CommonEMFPackage = (Symphony__CommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonEMFPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(symphony__CoreInvocatorUIFacadeEClass, Symphony__CoreInvocatorUIFacade.class, "Symphony__CoreInvocatorUIFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getSymphony__CoreInvocatorUIFacade__CopyInitializationData__Context_Context(), null, "copyInitializationData", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__CoreInvocatorPackage.getContext(), "source", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__CoreInvocatorPackage.getContext(), "destination", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, theSymphony__CommonEMFPackage.getException());

		op = initEOperation(getSymphony__CoreInvocatorUIFacade__CopyInitializationData__AbstractTypeImplementation_AbstractTypeImplementation_CompoundCommand(), null, "copyInitializationData", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__CoreInvocatorPackage.getAbstractTypeImplementation(), "source", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__CoreInvocatorPackage.getAbstractTypeImplementation(), "destination", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompoundCommand(), "command", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, theSymphony__CommonEMFPackage.getException());

		// Initialize data types
		initEDataType(compoundCommandEDataType, CompoundCommand.class, "CompoundCommand", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Symphony__CoreInvocatorUIPackageImpl
