/**
 */
package ca.gc.asc_csa.apogy.common.emf.ui.impl;

import javax.measure.unit.Unit;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.swt.graphics.Color;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIFactory;
import ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonEMFUIPackageImpl extends EPackageImpl implements ApogyCommonEMFUIPackage
{
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyCommonEMFUIFacadeEClass = null;

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
	 * @see ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private ApogyCommonEMFUIPackageImpl()
  {
		super(eNS_URI, ApogyCommonEMFUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyCommonEMFUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static ApogyCommonEMFUIPackage init()
  {
		if (isInited) return (ApogyCommonEMFUIPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonEMFUIPackage.eNS_URI);

		// Obtain or create and register package
		ApogyCommonEMFUIPackageImpl theApogyCommonEMFUIPackage = (ApogyCommonEMFUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCommonEMFUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCommonEMFUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCommonEMFPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyCommonEMFUIPackage.createPackageContents();

		// Initialize created meta-data
		theApogyCommonEMFUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCommonEMFUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCommonEMFUIPackage.eNS_URI, theApogyCommonEMFUIPackage);
		return theApogyCommonEMFUIPackage;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyCommonEMFUIFacade() {
		return apogyCommonEMFUIFacadeEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFUIFacade__GetColorForRange__Ranges() {
		return apogyCommonEMFUIFacadeEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFUIFacade__GetDisplayUnits__ETypedElement() {
		return apogyCommonEMFUIFacadeEClass.getEOperations().get(1);
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
	public ApogyCommonEMFUIFactory getApogyCommonEMFUIFactory() {
		return (ApogyCommonEMFUIFactory)getEFactoryInstance();
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
		apogyCommonEMFUIFacadeEClass = createEClass(APOGY_COMMON_EMFUI_FACADE);
		createEOperation(apogyCommonEMFUIFacadeEClass, APOGY_COMMON_EMFUI_FACADE___GET_COLOR_FOR_RANGE__RANGES);
		createEOperation(apogyCommonEMFUIFacadeEClass, APOGY_COMMON_EMFUI_FACADE___GET_DISPLAY_UNITS__ETYPEDELEMENT);

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
		ApogyCommonEMFPackage theApogyCommonEMFPackage = (ApogyCommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonEMFPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(apogyCommonEMFUIFacadeEClass, ApogyCommonEMFUIFacade.class, "ApogyCommonEMFUIFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getApogyCommonEMFUIFacade__GetColorForRange__Ranges(), this.getColor(), "getColorForRange", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonEMFPackage.getRanges(), "range", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFUIFacade__GetDisplayUnits__ETypedElement(), this.getUnit(), "getDisplayUnits", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(colorEDataType, Color.class, "Color", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unitEDataType, Unit.class, "Unit", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "javax.measure.unit.Unit<?>");

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyCommonEMFUIPackageImpl
