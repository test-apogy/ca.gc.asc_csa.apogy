/**
 */
package ca.gc.asc_csa.eclipse.emf.ecore.edit.utils.impl;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import ca.gc.asc_csa.eclipse.emf.ecore.edit.utils.EMFEcoreEditUtilsFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.edit.utils.EMFEcoreEditUtilsFactory;
import ca.gc.asc_csa.eclipse.emf.ecore.edit.utils.EMFEcoreEditUtilsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFEcoreEditUtilsPackageImpl extends EPackageImpl implements EMFEcoreEditUtilsPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass emfEcoreEditUtilsFacadeEClass = null;

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
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.edit.utils.EMFEcoreEditUtilsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private EMFEcoreEditUtilsPackageImpl()
  {
		super(eNS_URI, EMFEcoreEditUtilsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EMFEcoreEditUtilsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static EMFEcoreEditUtilsPackage init()
  {
		if (isInited) return (EMFEcoreEditUtilsPackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcoreEditUtilsPackage.eNS_URI);

		// Obtain or create and register package
		EMFEcoreEditUtilsPackageImpl theEMFEcoreEditUtilsPackage = (EMFEcoreEditUtilsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EMFEcoreEditUtilsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EMFEcoreEditUtilsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEMFEcoreEditUtilsPackage.createPackageContents();

		// Initialize created meta-data
		theEMFEcoreEditUtilsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEMFEcoreEditUtilsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EMFEcoreEditUtilsPackage.eNS_URI, theEMFEcoreEditUtilsPackage);
		return theEMFEcoreEditUtilsPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEMFEcoreEditUtilsFacade()
  {
		return emfEcoreEditUtilsFacadeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEMFEcoreEditUtilsFacade__GetText__Object()
  {
		return emfEcoreEditUtilsFacadeEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEMFEcoreEditUtilsFacade__RemoveChildDescriptor__Collection_Object()
  {
		return emfEcoreEditUtilsFacadeEClass.getEOperations().get(1);
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
  public EMFEcoreEditUtilsFactory getEMFEcoreEditUtilsFactory()
  {
		return (EMFEcoreEditUtilsFactory)getEFactoryInstance();
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
		emfEcoreEditUtilsFacadeEClass = createEClass(EMF_ECORE_EDIT_UTILS_FACADE);
		createEOperation(emfEcoreEditUtilsFacadeEClass, EMF_ECORE_EDIT_UTILS_FACADE___GET_TEXT__OBJECT);
		createEOperation(emfEcoreEditUtilsFacadeEClass, EMF_ECORE_EDIT_UTILS_FACADE___REMOVE_CHILD_DESCRIPTOR__COLLECTION_OBJECT);

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
		initEClass(emfEcoreEditUtilsFacadeEClass, EMFEcoreEditUtilsFacade.class, "EMFEcoreEditUtilsFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getEMFEcoreEditUtilsFacade__GetText__Object(), theEcorePackage.getEString(), "getText", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "object", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEMFEcoreEditUtilsFacade__RemoveChildDescriptor__Collection_Object(), null, "removeChildDescriptor", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCollectionObject(), "newChildDescriptors", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "feature", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(collectionObjectEDataType, Collection.class, "CollectionObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.Collection<java.lang.Object>");

		// Create resource
		createResource(eNS_URI);
	}

} //EMFEcoreEditUtilsPackageImpl
