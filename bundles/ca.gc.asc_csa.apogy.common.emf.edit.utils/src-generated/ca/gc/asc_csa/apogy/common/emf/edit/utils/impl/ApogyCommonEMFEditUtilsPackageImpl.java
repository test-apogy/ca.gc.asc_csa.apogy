/**
 */
package org.eclipse.symphony.common.emf.edit.utils.impl;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.common.emf.edit.utils.Symphony__CommonEMFEditUtilsFacade;
import org.eclipse.symphony.common.emf.edit.utils.Symphony__CommonEMFEditUtilsFactory;
import org.eclipse.symphony.common.emf.edit.utils.Symphony__CommonEMFEditUtilsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonEMFEditUtilsPackageImpl extends EPackageImpl implements Symphony__CommonEMFEditUtilsPackage
{
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symphony__CommonEMFEditUtilsFacadeEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType collectionObjectEDataType = null;

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
	 * @see org.eclipse.symphony.common.emf.edit.utils.Symphony__CommonEMFEditUtilsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private Symphony__CommonEMFEditUtilsPackageImpl()
  {
		super(eNS_URI, Symphony__CommonEMFEditUtilsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Symphony__CommonEMFEditUtilsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static Symphony__CommonEMFEditUtilsPackage init()
  {
		if (isInited) return (Symphony__CommonEMFEditUtilsPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonEMFEditUtilsPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__CommonEMFEditUtilsPackageImpl theSymphony__CommonEMFEditUtilsPackage = (Symphony__CommonEMFEditUtilsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__CommonEMFEditUtilsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__CommonEMFEditUtilsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__CommonEMFEditUtilsPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__CommonEMFEditUtilsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__CommonEMFEditUtilsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__CommonEMFEditUtilsPackage.eNS_URI, theSymphony__CommonEMFEditUtilsPackage);
		return theSymphony__CommonEMFEditUtilsPackage;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymphony__CommonEMFEditUtilsFacade() {
		return symphony__CommonEMFEditUtilsFacadeEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFEditUtilsFacade__GetText__Object() {
		return symphony__CommonEMFEditUtilsFacadeEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFEditUtilsFacade__RemoveChildDescriptor__Collection_Object() {
		return symphony__CommonEMFEditUtilsFacadeEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getCollectionObject()
  {
		return collectionObjectEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonEMFEditUtilsFactory getSymphony__CommonEMFEditUtilsFactory() {
		return (Symphony__CommonEMFEditUtilsFactory)getEFactoryInstance();
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
		symphony__CommonEMFEditUtilsFacadeEClass = createEClass(SYMPHONY_COMMON_EMF_EDIT_UTILS_FACADE);
		createEOperation(symphony__CommonEMFEditUtilsFacadeEClass, SYMPHONY_COMMON_EMF_EDIT_UTILS_FACADE___GET_TEXT__OBJECT);
		createEOperation(symphony__CommonEMFEditUtilsFacadeEClass, SYMPHONY_COMMON_EMF_EDIT_UTILS_FACADE___REMOVE_CHILD_DESCRIPTOR__COLLECTION_OBJECT);

		// Create data types
		collectionObjectEDataType = createEDataType(COLLECTION_OBJECT);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(symphony__CommonEMFEditUtilsFacadeEClass, Symphony__CommonEMFEditUtilsFacade.class, "Symphony__CommonEMFEditUtilsFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getSymphony__CommonEMFEditUtilsFacade__GetText__Object(), theEcorePackage.getEString(), "getText", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "object", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CommonEMFEditUtilsFacade__RemoveChildDescriptor__Collection_Object(), null, "removeChildDescriptor", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCollectionObject(), "newChildDescriptors", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "feature", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(collectionObjectEDataType, Collection.class, "CollectionObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.Collection<java.lang.Object>");

		// Create resource
		createResource(eNS_URI);
	}

} //Symphony__CommonEMFEditUtilsPackageImpl
