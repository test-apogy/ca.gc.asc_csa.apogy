/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.converters.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.jface.viewers.ISelection;

import org.eclipse.symphony.common.converters.Symphony__CommonConvertersPackage;

import org.eclipse.symphony.common.converters.ui.Symphony__CommonConvertersUIFacade;
import org.eclipse.symphony.common.converters.ui.Symphony__CommonConvertersUIFactory;
import org.eclipse.symphony.common.converters.ui.Symphony__CommonConvertersUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonConvertersUIPackageImpl extends EPackageImpl implements Symphony__CommonConvertersUIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symphony__CommonConvertersUIFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iSelectionEDataType = null;

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
	 * @see org.eclipse.symphony.common.converters.ui.Symphony__CommonConvertersUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Symphony__CommonConvertersUIPackageImpl() {
		super(eNS_URI, Symphony__CommonConvertersUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Symphony__CommonConvertersUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Symphony__CommonConvertersUIPackage init() {
		if (isInited) return (Symphony__CommonConvertersUIPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonConvertersUIPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__CommonConvertersUIPackageImpl theSymphony__CommonConvertersUIPackage = (Symphony__CommonConvertersUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__CommonConvertersUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__CommonConvertersUIPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSymphony__CommonConvertersUIPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__CommonConvertersUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__CommonConvertersUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__CommonConvertersUIPackage.eNS_URI, theSymphony__CommonConvertersUIPackage);
		return theSymphony__CommonConvertersUIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymphony__CommonConvertersUIFacade() {
		return symphony__CommonConvertersUIFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonConvertersUIFacade__Convert__ISelection_Class() {
		return symphony__CommonConvertersUIFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getISelection() {
		return iSelectionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonConvertersUIFactory getSymphony__CommonConvertersUIFactory() {
		return (Symphony__CommonConvertersUIFactory)getEFactoryInstance();
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
		symphony__CommonConvertersUIFacadeEClass = createEClass(SYMPHONY_COMMON_CONVERTERS_UI_FACADE);
		createEOperation(symphony__CommonConvertersUIFacadeEClass, SYMPHONY_COMMON_CONVERTERS_UI_FACADE___CONVERT__ISELECTION_CLASS);

		// Create data types
		iSelectionEDataType = createEDataType(ISELECTION);
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
		Symphony__CommonConvertersPackage theSymphony__CommonConvertersPackage = (Symphony__CommonConvertersPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonConvertersPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(symphony__CommonConvertersUIFacadeEClass, Symphony__CommonConvertersUIFacade.class, "Symphony__CommonConvertersUIFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getSymphony__CommonConvertersUIFacade__Convert__ISelection_Class(), null, "convert", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getISelection(), "selection", 0, 1, !IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theEcorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "targetType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theSymphony__CommonConvertersPackage.getList());
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		// Initialize data types
		initEDataType(iSelectionEDataType, ISelection.class, "ISelection", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Symphony__CommonConvertersUIPackageImpl
