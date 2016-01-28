/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.ui.impl;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.ui.NewApogyProjectSettings;
import ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings;
import ca.gc.asc_csa.apogy.core.ui.NewApogySystemSettings;
import ca.gc.asc_csa.apogy.core.ui.ResultNodePresentation;
import ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade;
import ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFactory;
import ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage;
import ca.gc.asc_csa.apogy.core.ui.ApogyResourceSettings;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreUIPackageImpl extends EPackageImpl implements ApogyCoreUIPackage
{
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyCoreUIFacadeEClass = null;
		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyResourceSettingsEClass = null;
		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newApogyProjectSettingsEClass = null;
		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass newApogySessionSettingsEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newApogySystemSettingsEClass = null;
		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass resultNodePresentationEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iProjectEDataType = null;
		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iContainerEDataType = null;
		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iFileEDataType = null;
		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iFolderEDataType = null;

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
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private ApogyCoreUIPackageImpl()
  {
		super(eNS_URI, ApogyCoreUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyCoreUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static ApogyCoreUIPackage init()
  {
		if (isInited) return (ApogyCoreUIPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreUIPackage.eNS_URI);

		// Obtain or create and register package
		ApogyCoreUIPackageImpl theApogyCoreUIPackage = (ApogyCoreUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCoreUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCoreUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCorePackage.eINSTANCE.eClass();
		ApogyCommonTopologyUIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyCoreUIPackage.createPackageContents();

		// Initialize created meta-data
		theApogyCoreUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCoreUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCoreUIPackage.eNS_URI, theApogyCoreUIPackage);
		return theApogyCoreUIPackage;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyCoreUIFacade() {
		return apogyCoreUIFacadeEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApogyCoreUIFacade_DefaultApogyProjectNamePrefix() {
		return (EAttribute)apogyCoreUIFacadeEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApogyCoreUIFacade_DefaultApogySessionFilename() {
		return (EAttribute)apogyCoreUIFacadeEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApogyCoreUIFacade_DefaultApogySessionFilenameExtension() {
		return (EAttribute)apogyCoreUIFacadeEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApogyCoreUIFacade_DefaultApogySessionFolderName() {
		return (EAttribute)apogyCoreUIFacadeEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreUIFacade__CreateApogyProject__NewApogyProjectSettings() {
		return apogyCoreUIFacadeEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreUIFacade__CreateApogySessionFolder__NewApogyProjectSettings() {
		return apogyCoreUIFacadeEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreUIFacade__CreateApogySession__NewApogySessionSettings() {
		return apogyCoreUIFacadeEClass.getEOperations().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreUIFacade__CreateApogySessionFile__IContainer_String_InvocatorSession() {
		return apogyCoreUIFacadeEClass.getEOperations().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreUIFacade__GetApogySessionFile__IContainer_String() {
		return apogyCoreUIFacadeEClass.getEOperations().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreUIFacade__CreateApogySystem__NewApogySystemSettings() {
		return apogyCoreUIFacadeEClass.getEOperations().get(5);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyResourceSettings() {
		return apogyResourceSettingsEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApogyResourceSettings_ResourceProject() {
		return (EAttribute)apogyResourceSettingsEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApogyResourceSettings_ResourceFile() {
		return (EAttribute)apogyResourceSettingsEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApogyResourceSettings_ResourceContainer() {
		return (EAttribute)apogyResourceSettingsEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewApogyProjectSettings() {
		return newApogyProjectSettingsEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNewApogyProjectSettings_Name() {
		return (EAttribute)newApogyProjectSettingsEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNewApogyProjectSettings_ImportRegisteredProject() {
		return (EAttribute)newApogyProjectSettingsEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNewApogyProjectSettings__GetDefaultProjectName() {
		return newApogyProjectSettingsEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNewApogyProjectSettings__SetDefaultValues() {
		return newApogyProjectSettingsEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getNewApogySessionSettings()
  {
		return newApogySessionSettingsEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getNewApogySessionSettings_Folder()
  {
		return (EAttribute)newApogySessionSettingsEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getNewApogySessionSettings_Filename()
  {
		return (EAttribute)newApogySessionSettingsEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getNewApogySessionSettings_CreateEnvironment()
  {
		return (EAttribute)newApogySessionSettingsEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getNewApogySessionSettings_CreatePrograms()
  {
		return (EAttribute)newApogySessionSettingsEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getNewApogySessionSettings_CreateDataProducts()
  {
		return (EAttribute)newApogySessionSettingsEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getNewApogySessionSettings_CreateTools()
  {
		return (EAttribute)newApogySessionSettingsEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNewApogySessionSettings__GetDefaultFilename__IContainer() {
		return newApogySessionSettingsEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNewApogySessionSettings__SetDefaultValues__IContainer() {
		return newApogySessionSettingsEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewApogySystemSettings() {
		return newApogySystemSettingsEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNewApogySystemSettings_Folder() {
		return (EAttribute)newApogySystemSettingsEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNewApogySystemSettings_Filename() {
		return (EAttribute)newApogySystemSettingsEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getResultNodePresentation()
  {
		return resultNodePresentationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getResultNodePresentation_PoleHeight()
  {
		return (EAttribute)resultNodePresentationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getResultNodePresentation_FlagVisible()
  {
		return (EAttribute)resultNodePresentationEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIProject() {
		return iProjectEDataType;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIContainer() {
		return iContainerEDataType;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIFile() {
		return iFileEDataType;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIFolder() {
		return iFolderEDataType;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreUIFactory getApogyCoreUIFactory() {
		return (ApogyCoreUIFactory)getEFactoryInstance();
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
		apogyCoreUIFacadeEClass = createEClass(APOGY_CORE_UI_FACADE);
		createEAttribute(apogyCoreUIFacadeEClass, APOGY_CORE_UI_FACADE__DEFAULT_APOGY_PROJECT_NAME_PREFIX);
		createEAttribute(apogyCoreUIFacadeEClass, APOGY_CORE_UI_FACADE__DEFAULT_APOGY_SESSION_FILENAME);
		createEAttribute(apogyCoreUIFacadeEClass, APOGY_CORE_UI_FACADE__DEFAULT_APOGY_SESSION_FILENAME_EXTENSION);
		createEAttribute(apogyCoreUIFacadeEClass, APOGY_CORE_UI_FACADE__DEFAULT_APOGY_SESSION_FOLDER_NAME);
		createEOperation(apogyCoreUIFacadeEClass, APOGY_CORE_UI_FACADE___CREATE_APOGY_PROJECT__NEWAPOGYPROJECTSETTINGS);
		createEOperation(apogyCoreUIFacadeEClass, APOGY_CORE_UI_FACADE___CREATE_APOGY_SESSION_FOLDER__NEWAPOGYPROJECTSETTINGS);
		createEOperation(apogyCoreUIFacadeEClass, APOGY_CORE_UI_FACADE___CREATE_APOGY_SESSION__NEWAPOGYSESSIONSETTINGS);
		createEOperation(apogyCoreUIFacadeEClass, APOGY_CORE_UI_FACADE___CREATE_APOGY_SESSION_FILE__ICONTAINER_STRING_INVOCATORSESSION);
		createEOperation(apogyCoreUIFacadeEClass, APOGY_CORE_UI_FACADE___GET_APOGY_SESSION_FILE__ICONTAINER_STRING);
		createEOperation(apogyCoreUIFacadeEClass, APOGY_CORE_UI_FACADE___CREATE_APOGY_SYSTEM__NEWAPOGYSYSTEMSETTINGS);

		apogyResourceSettingsEClass = createEClass(APOGY_RESOURCE_SETTINGS);
		createEAttribute(apogyResourceSettingsEClass, APOGY_RESOURCE_SETTINGS__RESOURCE_PROJECT);
		createEAttribute(apogyResourceSettingsEClass, APOGY_RESOURCE_SETTINGS__RESOURCE_FILE);
		createEAttribute(apogyResourceSettingsEClass, APOGY_RESOURCE_SETTINGS__RESOURCE_CONTAINER);

		newApogyProjectSettingsEClass = createEClass(NEW_APOGY_PROJECT_SETTINGS);
		createEAttribute(newApogyProjectSettingsEClass, NEW_APOGY_PROJECT_SETTINGS__NAME);
		createEAttribute(newApogyProjectSettingsEClass, NEW_APOGY_PROJECT_SETTINGS__IMPORT_REGISTERED_PROJECT);
		createEOperation(newApogyProjectSettingsEClass, NEW_APOGY_PROJECT_SETTINGS___GET_DEFAULT_PROJECT_NAME);
		createEOperation(newApogyProjectSettingsEClass, NEW_APOGY_PROJECT_SETTINGS___SET_DEFAULT_VALUES);

		newApogySessionSettingsEClass = createEClass(NEW_APOGY_SESSION_SETTINGS);
		createEAttribute(newApogySessionSettingsEClass, NEW_APOGY_SESSION_SETTINGS__FOLDER);
		createEAttribute(newApogySessionSettingsEClass, NEW_APOGY_SESSION_SETTINGS__FILENAME);
		createEAttribute(newApogySessionSettingsEClass, NEW_APOGY_SESSION_SETTINGS__CREATE_ENVIRONMENT);
		createEAttribute(newApogySessionSettingsEClass, NEW_APOGY_SESSION_SETTINGS__CREATE_PROGRAMS);
		createEAttribute(newApogySessionSettingsEClass, NEW_APOGY_SESSION_SETTINGS__CREATE_DATA_PRODUCTS);
		createEAttribute(newApogySessionSettingsEClass, NEW_APOGY_SESSION_SETTINGS__CREATE_TOOLS);
		createEOperation(newApogySessionSettingsEClass, NEW_APOGY_SESSION_SETTINGS___GET_DEFAULT_FILENAME__ICONTAINER);
		createEOperation(newApogySessionSettingsEClass, NEW_APOGY_SESSION_SETTINGS___SET_DEFAULT_VALUES__ICONTAINER);

		newApogySystemSettingsEClass = createEClass(NEW_APOGY_SYSTEM_SETTINGS);
		createEAttribute(newApogySystemSettingsEClass, NEW_APOGY_SYSTEM_SETTINGS__FOLDER);
		createEAttribute(newApogySystemSettingsEClass, NEW_APOGY_SYSTEM_SETTINGS__FILENAME);

		resultNodePresentationEClass = createEClass(RESULT_NODE_PRESENTATION);
		createEAttribute(resultNodePresentationEClass, RESULT_NODE_PRESENTATION__POLE_HEIGHT);
		createEAttribute(resultNodePresentationEClass, RESULT_NODE_PRESENTATION__FLAG_VISIBLE);

		// Create data types
		iProjectEDataType = createEDataType(IPROJECT);
		iContainerEDataType = createEDataType(ICONTAINER);
		iFileEDataType = createEDataType(IFILE);
		iFolderEDataType = createEDataType(IFOLDER);
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
		ApogyCoreInvocatorPackage theApogyCoreInvocatorPackage = (ApogyCoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreInvocatorPackage.eNS_URI);
		ApogyCommonEMFPackage theApogyCommonEMFPackage = (ApogyCommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonEMFPackage.eNS_URI);
		ApogyCorePackage theApogyCorePackage = (ApogyCorePackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCorePackage.eNS_URI);
		ApogyCommonTopologyUIPackage theApogyCommonTopologyUIPackage = (ApogyCommonTopologyUIPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonTopologyUIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		resultNodePresentationEClass.getESuperTypes().add(theApogyCommonTopologyUIPackage.getTransformNodePresentation());

		// Initialize classes, features, and operations; add parameters
		initEClass(apogyCoreUIFacadeEClass, ApogyCoreUIFacade.class, "ApogyCoreUIFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApogyCoreUIFacade_DefaultApogyProjectNamePrefix(), theEcorePackage.getEString(), "defaultApogyProjectNamePrefix", "Project", 0, 1, ApogyCoreUIFacade.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApogyCoreUIFacade_DefaultApogySessionFilename(), theEcorePackage.getEString(), "defaultApogySessionFilename", "session", 0, 1, ApogyCoreUIFacade.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApogyCoreUIFacade_DefaultApogySessionFilenameExtension(), theEcorePackage.getEString(), "defaultApogySessionFilenameExtension", "sym", 0, 1, ApogyCoreUIFacade.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApogyCoreUIFacade_DefaultApogySessionFolderName(), theEcorePackage.getEString(), "defaultApogySessionFolderName", "Sessions", 0, 1, ApogyCoreUIFacade.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getApogyCoreUIFacade__CreateApogyProject__NewApogyProjectSettings(), this.getIProject(), "createApogyProject", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNewApogyProjectSettings(), "settings", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreUIFacade__CreateApogySessionFolder__NewApogyProjectSettings(), this.getIFolder(), "createApogySessionFolder", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNewApogyProjectSettings(), "settings", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreUIFacade__CreateApogySession__NewApogySessionSettings(), theApogyCoreInvocatorPackage.getInvocatorSession(), "createApogySession", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNewApogySessionSettings(), "sessionSettings", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreUIFacade__CreateApogySessionFile__IContainer_String_InvocatorSession(), this.getIFile(), "createApogySessionFile", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIContainer(), "resourceContainer", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "filename", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreInvocatorPackage.getInvocatorSession(), "session", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, theApogyCommonEMFPackage.getException());

		op = initEOperation(getApogyCoreUIFacade__GetApogySessionFile__IContainer_String(), this.getIFile(), "getApogySessionFile", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIContainer(), "resourceContainer", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "filename", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreUIFacade__CreateApogySystem__NewApogySystemSettings(), theApogyCorePackage.getApogySystem(), "createApogySystem", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNewApogySystemSettings(), "systemSettings", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(apogyResourceSettingsEClass, ApogyResourceSettings.class, "ApogyResourceSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApogyResourceSettings_ResourceProject(), this.getIProject(), "resourceProject", null, 0, 1, ApogyResourceSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApogyResourceSettings_ResourceFile(), this.getIFile(), "resourceFile", null, 0, 1, ApogyResourceSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApogyResourceSettings_ResourceContainer(), this.getIContainer(), "resourceContainer", null, 0, 1, ApogyResourceSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newApogyProjectSettingsEClass, NewApogyProjectSettings.class, "NewApogyProjectSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNewApogyProjectSettings_Name(), theEcorePackage.getEString(), "name", null, 0, 1, NewApogyProjectSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewApogyProjectSettings_ImportRegisteredProject(), theEcorePackage.getEBoolean(), "importRegisteredProject", "false", 0, 1, NewApogyProjectSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNewApogyProjectSettings__GetDefaultProjectName(), theEcorePackage.getEString(), "getDefaultProjectName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getNewApogyProjectSettings__SetDefaultValues(), null, "setDefaultValues", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(newApogySessionSettingsEClass, NewApogySessionSettings.class, "NewApogySessionSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNewApogySessionSettings_Folder(), theEcorePackage.getEString(), "folder", null, 0, 1, NewApogySessionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewApogySessionSettings_Filename(), theEcorePackage.getEString(), "filename", null, 0, 1, NewApogySessionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewApogySessionSettings_CreateEnvironment(), theEcorePackage.getEBoolean(), "createEnvironment", "true", 0, 1, NewApogySessionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewApogySessionSettings_CreatePrograms(), theEcorePackage.getEBoolean(), "createPrograms", "true", 0, 1, NewApogySessionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewApogySessionSettings_CreateDataProducts(), theEcorePackage.getEBoolean(), "createDataProducts", "true", 0, 1, NewApogySessionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewApogySessionSettings_CreateTools(), theEcorePackage.getEBoolean(), "createTools", "true", 0, 1, NewApogySessionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getNewApogySessionSettings__GetDefaultFilename__IContainer(), theEcorePackage.getEString(), "getDefaultFilename", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIContainer(), "resourceContainer", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNewApogySessionSettings__SetDefaultValues__IContainer(), null, "setDefaultValues", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIContainer(), "resourceContainer", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(newApogySystemSettingsEClass, NewApogySystemSettings.class, "NewApogySystemSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNewApogySystemSettings_Folder(), theEcorePackage.getEString(), "folder", null, 0, 1, NewApogySystemSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewApogySystemSettings_Filename(), theEcorePackage.getEString(), "filename", null, 0, 1, NewApogySystemSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultNodePresentationEClass, ResultNodePresentation.class, "ResultNodePresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResultNodePresentation_PoleHeight(), theEcorePackage.getEFloat(), "poleHeight", "1.0f", 0, 1, ResultNodePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultNodePresentation_FlagVisible(), theEcorePackage.getEBoolean(), "flagVisible", "true", 0, 1, ResultNodePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(iProjectEDataType, IProject.class, "IProject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iContainerEDataType, IContainer.class, "IContainer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iFileEDataType, IFile.class, "IFile", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iFolderEDataType, IFolder.class, "IFolder", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyCoreUIPackageImpl
