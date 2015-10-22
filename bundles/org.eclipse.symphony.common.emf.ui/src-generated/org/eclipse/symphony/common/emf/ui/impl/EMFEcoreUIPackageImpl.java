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
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.common.emf.ui.EMFEcoreUIFacade;
import org.eclipse.symphony.common.emf.ui.EMFEcoreUIFactory;
import org.eclipse.symphony.common.emf.ui.EMFEcoreUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFEcoreUIPackageImpl extends EPackageImpl implements EMFEcoreUIPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass emfEcoreUIFacadeEClass = null;

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
	 * @see org.eclipse.symphony.common.emf.ui.EMFEcoreUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private EMFEcoreUIPackageImpl()
  {
		super(eNS_URI, EMFEcoreUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EMFEcoreUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static EMFEcoreUIPackage init()
  {
		if (isInited) return (EMFEcoreUIPackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcoreUIPackage.eNS_URI);

		// Obtain or create and register package
		EMFEcoreUIPackageImpl theEMFEcoreUIPackage = (EMFEcoreUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EMFEcoreUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EMFEcoreUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EMFEcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEMFEcoreUIPackage.createPackageContents();

		// Initialize created meta-data
		theEMFEcoreUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEMFEcoreUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EMFEcoreUIPackage.eNS_URI, theEMFEcoreUIPackage);
		return theEMFEcoreUIPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEMFEcoreUIFacade()
  {
		return emfEcoreUIFacadeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEMFEcoreUIFacade__GetColorForRange__Ranges()
  {
		return emfEcoreUIFacadeEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEMFEcoreUIFacade__GetDisplayUnits__ETypedElement()
  {
		return emfEcoreUIFacadeEClass.getEOperations().get(1);
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
  public EMFEcoreUIFactory getEMFEcoreUIFactory()
  {
		return (EMFEcoreUIFactory)getEFactoryInstance();
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
		emfEcoreUIFacadeEClass = createEClass(EMF_ECORE_UI_FACADE);
		createEOperation(emfEcoreUIFacadeEClass, EMF_ECORE_UI_FACADE___GET_COLOR_FOR_RANGE__RANGES);
		createEOperation(emfEcoreUIFacadeEClass, EMF_ECORE_UI_FACADE___GET_DISPLAY_UNITS__ETYPEDELEMENT);

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
		EMFEcorePackage theEMFEcorePackage = (EMFEcorePackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(emfEcoreUIFacadeEClass, EMFEcoreUIFacade.class, "EMFEcoreUIFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getEMFEcoreUIFacade__GetColorForRange__Ranges(), this.getColor(), "getColorForRange", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEMFEcorePackage.getRanges(), "range", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEMFEcoreUIFacade__GetDisplayUnits__ETypedElement(), this.getUnit(), "getDisplayUnits", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(colorEDataType, Color.class, "Color", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unitEDataType, Unit.class, "Unit", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "javax.measure.unit.Unit<?>");

		// Create resource
		createResource(eNS_URI);
	}

} //EMFEcoreUIPackageImpl
