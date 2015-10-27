/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.ui.impl;

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
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.common.topology.ui.Symphony__CommonTopologyUIPackage;
import org.eclipse.symphony.core.Symphony__CorePackage;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;
import org.eclipse.symphony.core.ui.NewSymphonyProjectSettings;
import org.eclipse.symphony.core.ui.NewSymphonySessionSettings;
import org.eclipse.symphony.core.ui.NewSymphonySystemSettings;
import org.eclipse.symphony.core.ui.ResultNodePresentation;
import org.eclipse.symphony.core.ui.SymphonyCoreUiFacade;
import org.eclipse.symphony.core.ui.Symphony__CoreUIFactory;
import org.eclipse.symphony.core.ui.Symphony__CoreUIPackage;
import org.eclipse.symphony.core.ui.SymphonyResourceSettings;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CoreUIPackageImpl extends EPackageImpl implements Symphony__CoreUIPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass symphonyCoreUiFacadeEClass = null;
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symphonyResourceSettingsEClass = null;
		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newSymphonyProjectSettingsEClass = null;
		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass newSymphonySessionSettingsEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newSymphonySystemSettingsEClass = null;
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
	 * @see org.eclipse.symphony.core.ui.Symphony__CoreUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private Symphony__CoreUIPackageImpl()
  {
		super(eNS_URI, Symphony__CoreUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Symphony__CoreUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static Symphony__CoreUIPackage init()
  {
		if (isInited) return (Symphony__CoreUIPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CoreUIPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__CoreUIPackageImpl theSymphony__CoreUIPackage = (Symphony__CoreUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__CoreUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__CoreUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Symphony__CorePackage.eINSTANCE.eClass();
		Symphony__CommonTopologyUIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__CoreUIPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__CoreUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__CoreUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__CoreUIPackage.eNS_URI, theSymphony__CoreUIPackage);
		return theSymphony__CoreUIPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSymphonyCoreUiFacade()
  {
		return symphonyCoreUiFacadeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSymphonyCoreUiFacade_DefaultSymphonyProjectNamePrefix() {
		return (EAttribute)symphonyCoreUiFacadeEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSymphonyCoreUiFacade_DefaultSymphonySessionFilename() {
		return (EAttribute)symphonyCoreUiFacadeEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSymphonyCoreUiFacade_DefaultSymphonySessionFilenameExtension() {
		return (EAttribute)symphonyCoreUiFacadeEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSymphonyCoreUiFacade_DefaultSymphonySessionFolderName() {
		return (EAttribute)symphonyCoreUiFacadeEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphonyCoreUiFacade__CreateSymphonyProject__NewSymphonyProjectSettings() {
		return symphonyCoreUiFacadeEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphonyCoreUiFacade__CreateSymphonySessionFolder__NewSymphonyProjectSettings() {
		return symphonyCoreUiFacadeEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphonyCoreUiFacade__CreateSymphonySession__NewSymphonySessionSettings() {
		return symphonyCoreUiFacadeEClass.getEOperations().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphonyCoreUiFacade__CreateSymphonySessionFile__IContainer_String_InvocatorSession() {
		return symphonyCoreUiFacadeEClass.getEOperations().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphonyCoreUiFacade__GetSymphonySessionFile__IContainer_String() {
		return symphonyCoreUiFacadeEClass.getEOperations().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphonyCoreUiFacade__CreateSymphonySystem__NewSymphonySystemSettings() {
		return symphonyCoreUiFacadeEClass.getEOperations().get(5);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymphonyResourceSettings() {
		return symphonyResourceSettingsEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSymphonyResourceSettings_ResourceProject() {
		return (EAttribute)symphonyResourceSettingsEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSymphonyResourceSettings_ResourceFile() {
		return (EAttribute)symphonyResourceSettingsEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSymphonyResourceSettings_ResourceContainer() {
		return (EAttribute)symphonyResourceSettingsEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewSymphonyProjectSettings() {
		return newSymphonyProjectSettingsEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNewSymphonyProjectSettings_Name() {
		return (EAttribute)newSymphonyProjectSettingsEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNewSymphonyProjectSettings_ImportRegisteredProject() {
		return (EAttribute)newSymphonyProjectSettingsEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNewSymphonyProjectSettings__GetDefaultProjectName() {
		return newSymphonyProjectSettingsEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNewSymphonyProjectSettings__SetDefaultValues() {
		return newSymphonyProjectSettingsEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getNewSymphonySessionSettings()
  {
		return newSymphonySessionSettingsEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getNewSymphonySessionSettings_Folder()
  {
		return (EAttribute)newSymphonySessionSettingsEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getNewSymphonySessionSettings_Filename()
  {
		return (EAttribute)newSymphonySessionSettingsEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getNewSymphonySessionSettings_CreateEnvironment()
  {
		return (EAttribute)newSymphonySessionSettingsEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getNewSymphonySessionSettings_CreatePrograms()
  {
		return (EAttribute)newSymphonySessionSettingsEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getNewSymphonySessionSettings_CreateDataProducts()
  {
		return (EAttribute)newSymphonySessionSettingsEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getNewSymphonySessionSettings_CreateTools()
  {
		return (EAttribute)newSymphonySessionSettingsEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNewSymphonySessionSettings__GetDefaultFilename__IContainer() {
		return newSymphonySessionSettingsEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNewSymphonySessionSettings__SetDefaultValues__IContainer() {
		return newSymphonySessionSettingsEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewSymphonySystemSettings() {
		return newSymphonySystemSettingsEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNewSymphonySystemSettings_Folder() {
		return (EAttribute)newSymphonySystemSettingsEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNewSymphonySystemSettings_Filename() {
		return (EAttribute)newSymphonySystemSettingsEClass.getEStructuralFeatures().get(1);
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
	public Symphony__CoreUIFactory getSymphony__CoreUIFactory() {
		return (Symphony__CoreUIFactory)getEFactoryInstance();
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
		symphonyCoreUiFacadeEClass = createEClass(SYMPHONY_CORE_UI_FACADE);
		createEAttribute(symphonyCoreUiFacadeEClass, SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_PROJECT_NAME_PREFIX);
		createEAttribute(symphonyCoreUiFacadeEClass, SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_SESSION_FILENAME);
		createEAttribute(symphonyCoreUiFacadeEClass, SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_SESSION_FILENAME_EXTENSION);
		createEAttribute(symphonyCoreUiFacadeEClass, SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_SESSION_FOLDER_NAME);
		createEOperation(symphonyCoreUiFacadeEClass, SYMPHONY_CORE_UI_FACADE___CREATE_SYMPHONY_PROJECT__NEWSYMPHONYPROJECTSETTINGS);
		createEOperation(symphonyCoreUiFacadeEClass, SYMPHONY_CORE_UI_FACADE___CREATE_SYMPHONY_SESSION_FOLDER__NEWSYMPHONYPROJECTSETTINGS);
		createEOperation(symphonyCoreUiFacadeEClass, SYMPHONY_CORE_UI_FACADE___CREATE_SYMPHONY_SESSION__NEWSYMPHONYSESSIONSETTINGS);
		createEOperation(symphonyCoreUiFacadeEClass, SYMPHONY_CORE_UI_FACADE___CREATE_SYMPHONY_SESSION_FILE__ICONTAINER_STRING_INVOCATORSESSION);
		createEOperation(symphonyCoreUiFacadeEClass, SYMPHONY_CORE_UI_FACADE___GET_SYMPHONY_SESSION_FILE__ICONTAINER_STRING);
		createEOperation(symphonyCoreUiFacadeEClass, SYMPHONY_CORE_UI_FACADE___CREATE_SYMPHONY_SYSTEM__NEWSYMPHONYSYSTEMSETTINGS);

		symphonyResourceSettingsEClass = createEClass(SYMPHONY_RESOURCE_SETTINGS);
		createEAttribute(symphonyResourceSettingsEClass, SYMPHONY_RESOURCE_SETTINGS__RESOURCE_PROJECT);
		createEAttribute(symphonyResourceSettingsEClass, SYMPHONY_RESOURCE_SETTINGS__RESOURCE_FILE);
		createEAttribute(symphonyResourceSettingsEClass, SYMPHONY_RESOURCE_SETTINGS__RESOURCE_CONTAINER);

		newSymphonyProjectSettingsEClass = createEClass(NEW_SYMPHONY_PROJECT_SETTINGS);
		createEAttribute(newSymphonyProjectSettingsEClass, NEW_SYMPHONY_PROJECT_SETTINGS__NAME);
		createEAttribute(newSymphonyProjectSettingsEClass, NEW_SYMPHONY_PROJECT_SETTINGS__IMPORT_REGISTERED_PROJECT);
		createEOperation(newSymphonyProjectSettingsEClass, NEW_SYMPHONY_PROJECT_SETTINGS___GET_DEFAULT_PROJECT_NAME);
		createEOperation(newSymphonyProjectSettingsEClass, NEW_SYMPHONY_PROJECT_SETTINGS___SET_DEFAULT_VALUES);

		newSymphonySessionSettingsEClass = createEClass(NEW_SYMPHONY_SESSION_SETTINGS);
		createEAttribute(newSymphonySessionSettingsEClass, NEW_SYMPHONY_SESSION_SETTINGS__FOLDER);
		createEAttribute(newSymphonySessionSettingsEClass, NEW_SYMPHONY_SESSION_SETTINGS__FILENAME);
		createEAttribute(newSymphonySessionSettingsEClass, NEW_SYMPHONY_SESSION_SETTINGS__CREATE_ENVIRONMENT);
		createEAttribute(newSymphonySessionSettingsEClass, NEW_SYMPHONY_SESSION_SETTINGS__CREATE_PROGRAMS);
		createEAttribute(newSymphonySessionSettingsEClass, NEW_SYMPHONY_SESSION_SETTINGS__CREATE_DATA_PRODUCTS);
		createEAttribute(newSymphonySessionSettingsEClass, NEW_SYMPHONY_SESSION_SETTINGS__CREATE_TOOLS);
		createEOperation(newSymphonySessionSettingsEClass, NEW_SYMPHONY_SESSION_SETTINGS___GET_DEFAULT_FILENAME__ICONTAINER);
		createEOperation(newSymphonySessionSettingsEClass, NEW_SYMPHONY_SESSION_SETTINGS___SET_DEFAULT_VALUES__ICONTAINER);

		newSymphonySystemSettingsEClass = createEClass(NEW_SYMPHONY_SYSTEM_SETTINGS);
		createEAttribute(newSymphonySystemSettingsEClass, NEW_SYMPHONY_SYSTEM_SETTINGS__FOLDER);
		createEAttribute(newSymphonySystemSettingsEClass, NEW_SYMPHONY_SYSTEM_SETTINGS__FILENAME);

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
		Symphony__CoreInvocatorPackage theSymphony__CoreInvocatorPackage = (Symphony__CoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CoreInvocatorPackage.eNS_URI);
		Symphony__CommonEMFPackage theSymphony__CommonEMFPackage = (Symphony__CommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonEMFPackage.eNS_URI);
		Symphony__CorePackage theSymphony__CorePackage = (Symphony__CorePackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CorePackage.eNS_URI);
		Symphony__CommonTopologyUIPackage theSymphony__CommonTopologyUIPackage = (Symphony__CommonTopologyUIPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonTopologyUIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		resultNodePresentationEClass.getESuperTypes().add(theSymphony__CommonTopologyUIPackage.getTransformNodePresentation());

		// Initialize classes, features, and operations; add parameters
		initEClass(symphonyCoreUiFacadeEClass, SymphonyCoreUiFacade.class, "SymphonyCoreUiFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSymphonyCoreUiFacade_DefaultSymphonyProjectNamePrefix(), theEcorePackage.getEString(), "defaultSymphonyProjectNamePrefix", "Project", 0, 1, SymphonyCoreUiFacade.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSymphonyCoreUiFacade_DefaultSymphonySessionFilename(), theEcorePackage.getEString(), "defaultSymphonySessionFilename", "session", 0, 1, SymphonyCoreUiFacade.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSymphonyCoreUiFacade_DefaultSymphonySessionFilenameExtension(), theEcorePackage.getEString(), "defaultSymphonySessionFilenameExtension", "sym", 0, 1, SymphonyCoreUiFacade.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSymphonyCoreUiFacade_DefaultSymphonySessionFolderName(), theEcorePackage.getEString(), "defaultSymphonySessionFolderName", "Sessions", 0, 1, SymphonyCoreUiFacade.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getSymphonyCoreUiFacade__CreateSymphonyProject__NewSymphonyProjectSettings(), this.getIProject(), "createSymphonyProject", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNewSymphonyProjectSettings(), "settings", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphonyCoreUiFacade__CreateSymphonySessionFolder__NewSymphonyProjectSettings(), this.getIFolder(), "createSymphonySessionFolder", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNewSymphonyProjectSettings(), "settings", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphonyCoreUiFacade__CreateSymphonySession__NewSymphonySessionSettings(), theSymphony__CoreInvocatorPackage.getInvocatorSession(), "createSymphonySession", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNewSymphonySessionSettings(), "sessionSettings", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphonyCoreUiFacade__CreateSymphonySessionFile__IContainer_String_InvocatorSession(), this.getIFile(), "createSymphonySessionFile", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIContainer(), "resourceContainer", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "filename", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__CoreInvocatorPackage.getInvocatorSession(), "session", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, theSymphony__CommonEMFPackage.getException());

		op = initEOperation(getSymphonyCoreUiFacade__GetSymphonySessionFile__IContainer_String(), this.getIFile(), "getSymphonySessionFile", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIContainer(), "resourceContainer", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "filename", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphonyCoreUiFacade__CreateSymphonySystem__NewSymphonySystemSettings(), theSymphony__CorePackage.getSymphonySystem(), "createSymphonySystem", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNewSymphonySystemSettings(), "systemSettings", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(symphonyResourceSettingsEClass, SymphonyResourceSettings.class, "SymphonyResourceSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSymphonyResourceSettings_ResourceProject(), this.getIProject(), "resourceProject", null, 0, 1, SymphonyResourceSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSymphonyResourceSettings_ResourceFile(), this.getIFile(), "resourceFile", null, 0, 1, SymphonyResourceSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSymphonyResourceSettings_ResourceContainer(), this.getIContainer(), "resourceContainer", null, 0, 1, SymphonyResourceSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newSymphonyProjectSettingsEClass, NewSymphonyProjectSettings.class, "NewSymphonyProjectSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNewSymphonyProjectSettings_Name(), theEcorePackage.getEString(), "name", null, 0, 1, NewSymphonyProjectSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewSymphonyProjectSettings_ImportRegisteredProject(), theEcorePackage.getEBoolean(), "importRegisteredProject", "false", 0, 1, NewSymphonyProjectSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNewSymphonyProjectSettings__GetDefaultProjectName(), theEcorePackage.getEString(), "getDefaultProjectName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getNewSymphonyProjectSettings__SetDefaultValues(), null, "setDefaultValues", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(newSymphonySessionSettingsEClass, NewSymphonySessionSettings.class, "NewSymphonySessionSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNewSymphonySessionSettings_Folder(), theEcorePackage.getEString(), "folder", null, 0, 1, NewSymphonySessionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewSymphonySessionSettings_Filename(), theEcorePackage.getEString(), "filename", null, 0, 1, NewSymphonySessionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewSymphonySessionSettings_CreateEnvironment(), theEcorePackage.getEBoolean(), "createEnvironment", "true", 0, 1, NewSymphonySessionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewSymphonySessionSettings_CreatePrograms(), theEcorePackage.getEBoolean(), "createPrograms", "true", 0, 1, NewSymphonySessionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewSymphonySessionSettings_CreateDataProducts(), theEcorePackage.getEBoolean(), "createDataProducts", "true", 0, 1, NewSymphonySessionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewSymphonySessionSettings_CreateTools(), theEcorePackage.getEBoolean(), "createTools", "true", 0, 1, NewSymphonySessionSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getNewSymphonySessionSettings__GetDefaultFilename__IContainer(), theEcorePackage.getEString(), "getDefaultFilename", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIContainer(), "resourceContainer", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNewSymphonySessionSettings__SetDefaultValues__IContainer(), null, "setDefaultValues", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIContainer(), "resourceContainer", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(newSymphonySystemSettingsEClass, NewSymphonySystemSettings.class, "NewSymphonySystemSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNewSymphonySystemSettings_Folder(), theEcorePackage.getEString(), "folder", null, 0, 1, NewSymphonySystemSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewSymphonySystemSettings_Filename(), theEcorePackage.getEString(), "filename", null, 0, 1, NewSymphonySystemSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

} //Symphony__CoreUIPackageImpl
