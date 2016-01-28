/**
 */
package org.eclipse.symphony.common.emf.ui.impl;

import javax.measure.unit.Unit;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.swt.graphics.Color;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.common.emf.ui.Symphony__CommonEMFUIFacade;
import org.eclipse.symphony.common.emf.ui.Symphony__CommonEMFUIFactory;
import org.eclipse.symphony.common.emf.ui.Symphony__CommonEMFUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonEMFUIPackageImpl extends EPackageImpl implements Symphony__CommonEMFUIPackage
{
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symphony__CommonEMFUIFacadeEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType colorEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType unitEDataType = null;

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
	 * @see org.eclipse.symphony.common.emf.ui.Symphony__CommonEMFUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private Symphony__CommonEMFUIPackageImpl()
  {
		super(eNS_URI, Symphony__CommonEMFUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Symphony__CommonEMFUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static Symphony__CommonEMFUIPackage init()
  {
		if (isInited) return (Symphony__CommonEMFUIPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonEMFUIPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__CommonEMFUIPackageImpl theSymphony__CommonEMFUIPackage = (Symphony__CommonEMFUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__CommonEMFUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__CommonEMFUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Symphony__CommonEMFPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__CommonEMFUIPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__CommonEMFUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__CommonEMFUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__CommonEMFUIPackage.eNS_URI, theSymphony__CommonEMFUIPackage);
		return theSymphony__CommonEMFUIPackage;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymphony__CommonEMFUIFacade() {
		return symphony__CommonEMFUIFacadeEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFUIFacade__GetColorForRange__Ranges() {
		return symphony__CommonEMFUIFacadeEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFUIFacade__GetDisplayUnits__ETypedElement() {
		return symphony__CommonEMFUIFacadeEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getColor()
  {
		return colorEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getUnit()
  {
		return unitEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonEMFUIFactory getSymphony__CommonEMFUIFactory() {
		return (Symphony__CommonEMFUIFactory)getEFactoryInstance();
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
		symphony__CommonEMFUIFacadeEClass = createEClass(SYMPHONY_COMMON_EMFUI_FACADE);
		createEOperation(symphony__CommonEMFUIFacadeEClass, SYMPHONY_COMMON_EMFUI_FACADE___GET_COLOR_FOR_RANGE__RANGES);
		createEOperation(symphony__CommonEMFUIFacadeEClass, SYMPHONY_COMMON_EMFUI_FACADE___GET_DISPLAY_UNITS__ETYPEDELEMENT);

		// Create data types
		colorEDataType = createEDataType(COLOR);
		unitEDataType = createEDataType(UNIT);
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
		Symphony__CommonEMFPackage theSymphony__CommonEMFPackage = (Symphony__CommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonEMFPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(symphony__CommonEMFUIFacadeEClass, Symphony__CommonEMFUIFacade.class, "Symphony__CommonEMFUIFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getSymphony__CommonEMFUIFacade__GetColorForRange__Ranges(), this.getColor(), "getColorForRange", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__CommonEMFPackage.getRanges(), "range", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CommonEMFUIFacade__GetDisplayUnits__ETypedElement(), this.getUnit(), "getDisplayUnits", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(colorEDataType, Color.class, "Color", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unitEDataType, Unit.class, "Unit", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "javax.measure.unit.Unit<?>");

		// Create resource
		createResource(eNS_URI);
	}

} //Symphony__CommonEMFUIPackageImpl
