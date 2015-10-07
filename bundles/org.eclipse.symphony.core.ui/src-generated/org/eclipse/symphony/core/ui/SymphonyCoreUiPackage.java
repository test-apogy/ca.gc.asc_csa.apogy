/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.ui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import ca.gc.space.topology.ui.TopologyUIPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.core.ui.SymphonyCoreUiFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='SymphonyCoreUi' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)' modelName='SymphonyCoreUi' modelDirectory='/org.eclipse.symphony.core.ui/src-generated' editDirectory='/org.eclipse.symphony.core.ui.edit/src-generated' basePackage='org.eclipse.symphony.core'"
 * @generated
 */
public interface SymphonyCoreUiPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "ui";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "org.eclipse.symphony.core.ui";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "ui";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  SymphonyCoreUiPackage eINSTANCE = org.eclipse.symphony.core.ui.impl.SymphonyCoreUiPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.ui.impl.SymphonyCoreUiFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.ui.impl.SymphonyCoreUiFacadeImpl
	 * @see org.eclipse.symphony.core.ui.impl.SymphonyCoreUiPackageImpl#getSymphonyCoreUiFacade()
	 * @generated
	 */
  int SYMPHONY_CORE_UI_FACADE = 0;

  /**
	 * The feature id for the '<em><b>Default Symphony Project Name Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_PROJECT_NAME_PREFIX = 0;

		/**
	 * The feature id for the '<em><b>Default Symphony Session Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_SESSION_FILENAME = 1;

		/**
	 * The feature id for the '<em><b>Default Symphony Session Filename Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_SESSION_FILENAME_EXTENSION = 2;

		/**
	 * The feature id for the '<em><b>Default Symphony Session Folder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_SESSION_FOLDER_NAME = 3;

		/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_CORE_UI_FACADE_FEATURE_COUNT = 4;

  /**
	 * The operation id for the '<em>Create Symphony Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_UI_FACADE___CREATE_SYMPHONY_PROJECT__NEWSYMPHONYPROJECTSETTINGS = 0;

		/**
	 * The operation id for the '<em>Create Symphony Session Folder</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_UI_FACADE___CREATE_SYMPHONY_SESSION_FOLDER__NEWSYMPHONYPROJECTSETTINGS = 1;

		/**
	 * The operation id for the '<em>Create Symphony Session</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_UI_FACADE___CREATE_SYMPHONY_SESSION__NEWSYMPHONYSESSIONSETTINGS = 2;

		/**
	 * The operation id for the '<em>Create Symphony Session File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_UI_FACADE___CREATE_SYMPHONY_SESSION_FILE__ICONTAINER_STRING_INVOCATORSESSION = 3;

		/**
	 * The operation id for the '<em>Get Symphony Session File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_UI_FACADE___GET_SYMPHONY_SESSION_FILE__ICONTAINER_STRING = 4;

		/**
	 * The operation id for the '<em>Create Symphony System</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_UI_FACADE___CREATE_SYMPHONY_SYSTEM__NEWSYMPHONYSYSTEMSETTINGS = 5;

		/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_CORE_UI_FACADE_OPERATION_COUNT = 6;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.ui.impl.SymphonyResourceSettingsImpl <em>Symphony Resource Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.ui.impl.SymphonyResourceSettingsImpl
	 * @see org.eclipse.symphony.core.ui.impl.SymphonyCoreUiPackageImpl#getSymphonyResourceSettings()
	 * @generated
	 */
	int SYMPHONY_RESOURCE_SETTINGS = 1;

		/**
	 * The feature id for the '<em><b>Resource Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_RESOURCE_SETTINGS__RESOURCE_PROJECT = 0;

		/**
	 * The feature id for the '<em><b>Resource File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_RESOURCE_SETTINGS__RESOURCE_FILE = 1;

		/**
	 * The feature id for the '<em><b>Resource Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_RESOURCE_SETTINGS__RESOURCE_CONTAINER = 2;

		/**
	 * The number of structural features of the '<em>Symphony Resource Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_RESOURCE_SETTINGS_FEATURE_COUNT = 3;

		/**
	 * The number of operations of the '<em>Symphony Resource Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_RESOURCE_SETTINGS_OPERATION_COUNT = 0;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.ui.impl.NewSymphonyProjectSettingsImpl <em>New Symphony Project Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.ui.impl.NewSymphonyProjectSettingsImpl
	 * @see org.eclipse.symphony.core.ui.impl.SymphonyCoreUiPackageImpl#getNewSymphonyProjectSettings()
	 * @generated
	 */
	int NEW_SYMPHONY_PROJECT_SETTINGS = 2;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_SYMPHONY_PROJECT_SETTINGS__NAME = 0;

		/**
	 * The feature id for the '<em><b>Import Registered Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_SYMPHONY_PROJECT_SETTINGS__IMPORT_REGISTERED_PROJECT = 1;

		/**
	 * The number of structural features of the '<em>New Symphony Project Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_SYMPHONY_PROJECT_SETTINGS_FEATURE_COUNT = 2;

		/**
	 * The operation id for the '<em>Get Default Project Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_SYMPHONY_PROJECT_SETTINGS___GET_DEFAULT_PROJECT_NAME = 0;

		/**
	 * The operation id for the '<em>Set Default Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_SYMPHONY_PROJECT_SETTINGS___SET_DEFAULT_VALUES = 1;

		/**
	 * The number of operations of the '<em>New Symphony Project Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_SYMPHONY_PROJECT_SETTINGS_OPERATION_COUNT = 2;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.ui.impl.NewSymphonySessionSettingsImpl <em>New Symphony Session Settings</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.ui.impl.NewSymphonySessionSettingsImpl
	 * @see org.eclipse.symphony.core.ui.impl.SymphonyCoreUiPackageImpl#getNewSymphonySessionSettings()
	 * @generated
	 */
  int NEW_SYMPHONY_SESSION_SETTINGS = 3;

  /**
	 * The feature id for the '<em><b>Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NEW_SYMPHONY_SESSION_SETTINGS__FOLDER = 0;

  /**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NEW_SYMPHONY_SESSION_SETTINGS__FILENAME = 1;

  /**
	 * The feature id for the '<em><b>Create Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NEW_SYMPHONY_SESSION_SETTINGS__CREATE_ENVIRONMENT = 2;

  /**
	 * The feature id for the '<em><b>Create Programs</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NEW_SYMPHONY_SESSION_SETTINGS__CREATE_PROGRAMS = 3;

  /**
	 * The feature id for the '<em><b>Create Data Products</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NEW_SYMPHONY_SESSION_SETTINGS__CREATE_DATA_PRODUCTS = 4;

  /**
	 * The feature id for the '<em><b>Create Tools</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NEW_SYMPHONY_SESSION_SETTINGS__CREATE_TOOLS = 5;

  /**
	 * The number of structural features of the '<em>New Symphony Session Settings</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NEW_SYMPHONY_SESSION_SETTINGS_FEATURE_COUNT = 6;

  /**
	 * The operation id for the '<em>Get Default Filename</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_SYMPHONY_SESSION_SETTINGS___GET_DEFAULT_FILENAME__ICONTAINER = 0;

		/**
	 * The operation id for the '<em>Set Default Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_SYMPHONY_SESSION_SETTINGS___SET_DEFAULT_VALUES__ICONTAINER = 1;

		/**
	 * The number of operations of the '<em>New Symphony Session Settings</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NEW_SYMPHONY_SESSION_SETTINGS_OPERATION_COUNT = 2;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.ui.impl.NewSymphonySystemSettingsImpl <em>New Symphony System Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.ui.impl.NewSymphonySystemSettingsImpl
	 * @see org.eclipse.symphony.core.ui.impl.SymphonyCoreUiPackageImpl#getNewSymphonySystemSettings()
	 * @generated
	 */
	int NEW_SYMPHONY_SYSTEM_SETTINGS = 4;

		/**
	 * The feature id for the '<em><b>Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_SYMPHONY_SYSTEM_SETTINGS__FOLDER = 0;

		/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_SYMPHONY_SYSTEM_SETTINGS__FILENAME = 1;

		/**
	 * The number of structural features of the '<em>New Symphony System Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_SYMPHONY_SYSTEM_SETTINGS_FEATURE_COUNT = 2;

		/**
	 * The number of operations of the '<em>New Symphony System Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_SYMPHONY_SYSTEM_SETTINGS_OPERATION_COUNT = 0;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.ui.impl.ResultNodePresentationImpl <em>Result Node Presentation</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.ui.impl.ResultNodePresentationImpl
	 * @see org.eclipse.symphony.core.ui.impl.SymphonyCoreUiPackageImpl#getResultNodePresentation()
	 * @generated
	 */
  int RESULT_NODE_PRESENTATION = 5;

  /**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET = TopologyUIPackage.TRANSFORM_NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

		/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__NODE = TopologyUIPackage.TRANSFORM_NODE_PRESENTATION__NODE;

  /**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__COLOR = TopologyUIPackage.TRANSFORM_NODE_PRESENTATION__COLOR;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__VISIBLE = TopologyUIPackage.TRANSFORM_NODE_PRESENTATION__VISIBLE;

  /**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE_PRESENTATION__SHADOW_MODE = TopologyUIPackage.TRANSFORM_NODE_PRESENTATION__SHADOW_MODE;

		/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION = TopologyUIPackage.TRANSFORM_NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

		/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__CENTROID = TopologyUIPackage.TRANSFORM_NODE_PRESENTATION__CENTROID;

		/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__MIN = TopologyUIPackage.TRANSFORM_NODE_PRESENTATION__MIN;

		/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__MAX = TopologyUIPackage.TRANSFORM_NODE_PRESENTATION__MAX;

		/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__XRANGE = TopologyUIPackage.TRANSFORM_NODE_PRESENTATION__XRANGE;

		/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__YRANGE = TopologyUIPackage.TRANSFORM_NODE_PRESENTATION__YRANGE;

		/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__ZRANGE = TopologyUIPackage.TRANSFORM_NODE_PRESENTATION__ZRANGE;

		/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__SCENE_OBJECT = TopologyUIPackage.TRANSFORM_NODE_PRESENTATION__SCENE_OBJECT;

		/**
	 * The feature id for the '<em><b>Axis Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE_PRESENTATION__AXIS_VISIBLE = TopologyUIPackage.TRANSFORM_NODE_PRESENTATION__AXIS_VISIBLE;

		/**
	 * The feature id for the '<em><b>Axis Lenght</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE_PRESENTATION__AXIS_LENGHT = TopologyUIPackage.TRANSFORM_NODE_PRESENTATION__AXIS_LENGHT;

		/**
	 * The feature id for the '<em><b>Pole Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__POLE_HEIGHT = TopologyUIPackage.TRANSFORM_NODE_PRESENTATION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Flag Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__FLAG_VISIBLE = TopologyUIPackage.TRANSFORM_NODE_PRESENTATION_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Result Node Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION_FEATURE_COUNT = TopologyUIPackage.TRANSFORM_NODE_PRESENTATION_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Result Node Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION_OPERATION_COUNT = TopologyUIPackage.TRANSFORM_NODE_PRESENTATION_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '<em>IProject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IProject
	 * @see org.eclipse.symphony.core.ui.impl.SymphonyCoreUiPackageImpl#getIProject()
	 * @generated
	 */
	int IPROJECT = 6;

		/**
	 * The meta object id for the '<em>IContainer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IContainer
	 * @see org.eclipse.symphony.core.ui.impl.SymphonyCoreUiPackageImpl#getIContainer()
	 * @generated
	 */
	int ICONTAINER = 7;

		/**
	 * The meta object id for the '<em>IFile</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IFile
	 * @see org.eclipse.symphony.core.ui.impl.SymphonyCoreUiPackageImpl#getIFile()
	 * @generated
	 */
	int IFILE = 8;

		/**
	 * The meta object id for the '<em>IFolder</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IFolder
	 * @see org.eclipse.symphony.core.ui.impl.SymphonyCoreUiPackageImpl#getIFolder()
	 * @generated
	 */
	int IFOLDER = 9;

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.ui.SymphonyCoreUiFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see org.eclipse.symphony.core.ui.SymphonyCoreUiFacade
	 * @generated
	 */
  EClass getSymphonyCoreUiFacade();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.ui.SymphonyCoreUiFacade#getDefaultSymphonyProjectNamePrefix <em>Default Symphony Project Name Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Symphony Project Name Prefix</em>'.
	 * @see org.eclipse.symphony.core.ui.SymphonyCoreUiFacade#getDefaultSymphonyProjectNamePrefix()
	 * @see #getSymphonyCoreUiFacade()
	 * @generated
	 */
	EAttribute getSymphonyCoreUiFacade_DefaultSymphonyProjectNamePrefix();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.ui.SymphonyCoreUiFacade#getDefaultSymphonySessionFilename <em>Default Symphony Session Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Symphony Session Filename</em>'.
	 * @see org.eclipse.symphony.core.ui.SymphonyCoreUiFacade#getDefaultSymphonySessionFilename()
	 * @see #getSymphonyCoreUiFacade()
	 * @generated
	 */
	EAttribute getSymphonyCoreUiFacade_DefaultSymphonySessionFilename();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.ui.SymphonyCoreUiFacade#getDefaultSymphonySessionFilenameExtension <em>Default Symphony Session Filename Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Symphony Session Filename Extension</em>'.
	 * @see org.eclipse.symphony.core.ui.SymphonyCoreUiFacade#getDefaultSymphonySessionFilenameExtension()
	 * @see #getSymphonyCoreUiFacade()
	 * @generated
	 */
	EAttribute getSymphonyCoreUiFacade_DefaultSymphonySessionFilenameExtension();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.ui.SymphonyCoreUiFacade#getDefaultSymphonySessionFolderName <em>Default Symphony Session Folder Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Symphony Session Folder Name</em>'.
	 * @see org.eclipse.symphony.core.ui.SymphonyCoreUiFacade#getDefaultSymphonySessionFolderName()
	 * @see #getSymphonyCoreUiFacade()
	 * @generated
	 */
	EAttribute getSymphonyCoreUiFacade_DefaultSymphonySessionFolderName();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.ui.SymphonyCoreUiFacade#createSymphonyProject(org.eclipse.symphony.core.ui.NewSymphonyProjectSettings) <em>Create Symphony Project</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Symphony Project</em>' operation.
	 * @see org.eclipse.symphony.core.ui.SymphonyCoreUiFacade#createSymphonyProject(org.eclipse.symphony.core.ui.NewSymphonyProjectSettings)
	 * @generated
	 */
	EOperation getSymphonyCoreUiFacade__CreateSymphonyProject__NewSymphonyProjectSettings();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.ui.SymphonyCoreUiFacade#createSymphonySessionFolder(org.eclipse.symphony.core.ui.NewSymphonyProjectSettings) <em>Create Symphony Session Folder</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Symphony Session Folder</em>' operation.
	 * @see org.eclipse.symphony.core.ui.SymphonyCoreUiFacade#createSymphonySessionFolder(org.eclipse.symphony.core.ui.NewSymphonyProjectSettings)
	 * @generated
	 */
	EOperation getSymphonyCoreUiFacade__CreateSymphonySessionFolder__NewSymphonyProjectSettings();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.ui.SymphonyCoreUiFacade#createSymphonySession(org.eclipse.symphony.core.ui.NewSymphonySessionSettings) <em>Create Symphony Session</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Symphony Session</em>' operation.
	 * @see org.eclipse.symphony.core.ui.SymphonyCoreUiFacade#createSymphonySession(org.eclipse.symphony.core.ui.NewSymphonySessionSettings)
	 * @generated
	 */
	EOperation getSymphonyCoreUiFacade__CreateSymphonySession__NewSymphonySessionSettings();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.ui.SymphonyCoreUiFacade#createSymphonySessionFile(org.eclipse.core.resources.IContainer, java.lang.String, ca.gc.asc_csa.eclipse.emf.ecore.invocator.InvocatorSession) <em>Create Symphony Session File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Symphony Session File</em>' operation.
	 * @see org.eclipse.symphony.core.ui.SymphonyCoreUiFacade#createSymphonySessionFile(org.eclipse.core.resources.IContainer, java.lang.String, ca.gc.asc_csa.eclipse.emf.ecore.invocator.InvocatorSession)
	 * @generated
	 */
	EOperation getSymphonyCoreUiFacade__CreateSymphonySessionFile__IContainer_String_InvocatorSession();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.ui.SymphonyCoreUiFacade#getSymphonySessionFile(org.eclipse.core.resources.IContainer, java.lang.String) <em>Get Symphony Session File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symphony Session File</em>' operation.
	 * @see org.eclipse.symphony.core.ui.SymphonyCoreUiFacade#getSymphonySessionFile(org.eclipse.core.resources.IContainer, java.lang.String)
	 * @generated
	 */
	EOperation getSymphonyCoreUiFacade__GetSymphonySessionFile__IContainer_String();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.ui.SymphonyCoreUiFacade#createSymphonySystem(org.eclipse.symphony.core.ui.NewSymphonySystemSettings) <em>Create Symphony System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Symphony System</em>' operation.
	 * @see org.eclipse.symphony.core.ui.SymphonyCoreUiFacade#createSymphonySystem(org.eclipse.symphony.core.ui.NewSymphonySystemSettings)
	 * @generated
	 */
	EOperation getSymphonyCoreUiFacade__CreateSymphonySystem__NewSymphonySystemSettings();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.ui.SymphonyResourceSettings <em>Symphony Resource Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symphony Resource Settings</em>'.
	 * @see org.eclipse.symphony.core.ui.SymphonyResourceSettings
	 * @generated
	 */
	EClass getSymphonyResourceSettings();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.ui.SymphonyResourceSettings#getResourceProject <em>Resource Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Project</em>'.
	 * @see org.eclipse.symphony.core.ui.SymphonyResourceSettings#getResourceProject()
	 * @see #getSymphonyResourceSettings()
	 * @generated
	 */
	EAttribute getSymphonyResourceSettings_ResourceProject();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.ui.SymphonyResourceSettings#getResourceFile <em>Resource File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource File</em>'.
	 * @see org.eclipse.symphony.core.ui.SymphonyResourceSettings#getResourceFile()
	 * @see #getSymphonyResourceSettings()
	 * @generated
	 */
	EAttribute getSymphonyResourceSettings_ResourceFile();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.ui.SymphonyResourceSettings#getResourceContainer <em>Resource Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Container</em>'.
	 * @see org.eclipse.symphony.core.ui.SymphonyResourceSettings#getResourceContainer()
	 * @see #getSymphonyResourceSettings()
	 * @generated
	 */
	EAttribute getSymphonyResourceSettings_ResourceContainer();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.ui.NewSymphonyProjectSettings <em>New Symphony Project Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Symphony Project Settings</em>'.
	 * @see org.eclipse.symphony.core.ui.NewSymphonyProjectSettings
	 * @generated
	 */
	EClass getNewSymphonyProjectSettings();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.ui.NewSymphonyProjectSettings#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.symphony.core.ui.NewSymphonyProjectSettings#getName()
	 * @see #getNewSymphonyProjectSettings()
	 * @generated
	 */
	EAttribute getNewSymphonyProjectSettings_Name();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.ui.NewSymphonyProjectSettings#isImportRegisteredProject <em>Import Registered Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Registered Project</em>'.
	 * @see org.eclipse.symphony.core.ui.NewSymphonyProjectSettings#isImportRegisteredProject()
	 * @see #getNewSymphonyProjectSettings()
	 * @generated
	 */
	EAttribute getNewSymphonyProjectSettings_ImportRegisteredProject();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.ui.NewSymphonyProjectSettings#getDefaultProjectName() <em>Get Default Project Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Project Name</em>' operation.
	 * @see org.eclipse.symphony.core.ui.NewSymphonyProjectSettings#getDefaultProjectName()
	 * @generated
	 */
	EOperation getNewSymphonyProjectSettings__GetDefaultProjectName();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.ui.NewSymphonyProjectSettings#setDefaultValues() <em>Set Default Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Default Values</em>' operation.
	 * @see org.eclipse.symphony.core.ui.NewSymphonyProjectSettings#setDefaultValues()
	 * @generated
	 */
	EOperation getNewSymphonyProjectSettings__SetDefaultValues();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.ui.NewSymphonySessionSettings <em>New Symphony Session Settings</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Symphony Session Settings</em>'.
	 * @see org.eclipse.symphony.core.ui.NewSymphonySessionSettings
	 * @generated
	 */
  EClass getNewSymphonySessionSettings();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.ui.NewSymphonySessionSettings#getFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Folder</em>'.
	 * @see org.eclipse.symphony.core.ui.NewSymphonySessionSettings#getFolder()
	 * @see #getNewSymphonySessionSettings()
	 * @generated
	 */
  EAttribute getNewSymphonySessionSettings_Folder();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.ui.NewSymphonySessionSettings#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see org.eclipse.symphony.core.ui.NewSymphonySessionSettings#getFilename()
	 * @see #getNewSymphonySessionSettings()
	 * @generated
	 */
  EAttribute getNewSymphonySessionSettings_Filename();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.ui.NewSymphonySessionSettings#isCreateEnvironment <em>Create Environment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Environment</em>'.
	 * @see org.eclipse.symphony.core.ui.NewSymphonySessionSettings#isCreateEnvironment()
	 * @see #getNewSymphonySessionSettings()
	 * @generated
	 */
  EAttribute getNewSymphonySessionSettings_CreateEnvironment();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.ui.NewSymphonySessionSettings#isCreatePrograms <em>Create Programs</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Programs</em>'.
	 * @see org.eclipse.symphony.core.ui.NewSymphonySessionSettings#isCreatePrograms()
	 * @see #getNewSymphonySessionSettings()
	 * @generated
	 */
  EAttribute getNewSymphonySessionSettings_CreatePrograms();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.ui.NewSymphonySessionSettings#isCreateDataProducts <em>Create Data Products</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Data Products</em>'.
	 * @see org.eclipse.symphony.core.ui.NewSymphonySessionSettings#isCreateDataProducts()
	 * @see #getNewSymphonySessionSettings()
	 * @generated
	 */
  EAttribute getNewSymphonySessionSettings_CreateDataProducts();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.ui.NewSymphonySessionSettings#isCreateTools <em>Create Tools</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Tools</em>'.
	 * @see org.eclipse.symphony.core.ui.NewSymphonySessionSettings#isCreateTools()
	 * @see #getNewSymphonySessionSettings()
	 * @generated
	 */
  EAttribute getNewSymphonySessionSettings_CreateTools();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.ui.NewSymphonySessionSettings#getDefaultFilename(org.eclipse.core.resources.IContainer) <em>Get Default Filename</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Filename</em>' operation.
	 * @see org.eclipse.symphony.core.ui.NewSymphonySessionSettings#getDefaultFilename(org.eclipse.core.resources.IContainer)
	 * @generated
	 */
	EOperation getNewSymphonySessionSettings__GetDefaultFilename__IContainer();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.ui.NewSymphonySessionSettings#setDefaultValues(org.eclipse.core.resources.IContainer) <em>Set Default Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Default Values</em>' operation.
	 * @see org.eclipse.symphony.core.ui.NewSymphonySessionSettings#setDefaultValues(org.eclipse.core.resources.IContainer)
	 * @generated
	 */
	EOperation getNewSymphonySessionSettings__SetDefaultValues__IContainer();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.ui.NewSymphonySystemSettings <em>New Symphony System Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Symphony System Settings</em>'.
	 * @see org.eclipse.symphony.core.ui.NewSymphonySystemSettings
	 * @generated
	 */
	EClass getNewSymphonySystemSettings();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.ui.NewSymphonySystemSettings#getFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Folder</em>'.
	 * @see org.eclipse.symphony.core.ui.NewSymphonySystemSettings#getFolder()
	 * @see #getNewSymphonySystemSettings()
	 * @generated
	 */
	EAttribute getNewSymphonySystemSettings_Folder();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.ui.NewSymphonySystemSettings#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see org.eclipse.symphony.core.ui.NewSymphonySystemSettings#getFilename()
	 * @see #getNewSymphonySystemSettings()
	 * @generated
	 */
	EAttribute getNewSymphonySystemSettings_Filename();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.ui.ResultNodePresentation <em>Result Node Presentation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Node Presentation</em>'.
	 * @see org.eclipse.symphony.core.ui.ResultNodePresentation
	 * @generated
	 */
  EClass getResultNodePresentation();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.ui.ResultNodePresentation#getPoleHeight <em>Pole Height</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pole Height</em>'.
	 * @see org.eclipse.symphony.core.ui.ResultNodePresentation#getPoleHeight()
	 * @see #getResultNodePresentation()
	 * @generated
	 */
  EAttribute getResultNodePresentation_PoleHeight();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.ui.ResultNodePresentation#isFlagVisible <em>Flag Visible</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flag Visible</em>'.
	 * @see org.eclipse.symphony.core.ui.ResultNodePresentation#isFlagVisible()
	 * @see #getResultNodePresentation()
	 * @generated
	 */
  EAttribute getResultNodePresentation_FlagVisible();

  /**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IProject <em>IProject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IProject</em>'.
	 * @see org.eclipse.core.resources.IProject
	 * @model instanceClass="org.eclipse.core.resources.IProject"
	 * @generated
	 */
	EDataType getIProject();

		/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IContainer <em>IContainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IContainer</em>'.
	 * @see org.eclipse.core.resources.IContainer
	 * @model instanceClass="org.eclipse.core.resources.IContainer"
	 * @generated
	 */
	EDataType getIContainer();

		/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IFile <em>IFile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IFile</em>'.
	 * @see org.eclipse.core.resources.IFile
	 * @model instanceClass="org.eclipse.core.resources.IFile"
	 * @generated
	 */
	EDataType getIFile();

		/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IFolder <em>IFolder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IFolder</em>'.
	 * @see org.eclipse.core.resources.IFolder
	 * @model instanceClass="org.eclipse.core.resources.IFolder"
	 * @generated
	 */
	EDataType getIFolder();

		/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  SymphonyCoreUiFactory getSymphonyCoreUiFactory();

  /**
	 * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
	 * @generated
	 */
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.ui.impl.SymphonyCoreUiFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.ui.impl.SymphonyCoreUiFacadeImpl
		 * @see org.eclipse.symphony.core.ui.impl.SymphonyCoreUiPackageImpl#getSymphonyCoreUiFacade()
		 * @generated
		 */
    EClass SYMPHONY_CORE_UI_FACADE = eINSTANCE.getSymphonyCoreUiFacade();

    /**
		 * The meta object literal for the '<em><b>Default Symphony Project Name Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_PROJECT_NAME_PREFIX = eINSTANCE.getSymphonyCoreUiFacade_DefaultSymphonyProjectNamePrefix();

				/**
		 * The meta object literal for the '<em><b>Default Symphony Session Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_SESSION_FILENAME = eINSTANCE.getSymphonyCoreUiFacade_DefaultSymphonySessionFilename();

				/**
		 * The meta object literal for the '<em><b>Default Symphony Session Filename Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_SESSION_FILENAME_EXTENSION = eINSTANCE.getSymphonyCoreUiFacade_DefaultSymphonySessionFilenameExtension();

				/**
		 * The meta object literal for the '<em><b>Default Symphony Session Folder Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_SESSION_FOLDER_NAME = eINSTANCE.getSymphonyCoreUiFacade_DefaultSymphonySessionFolderName();

				/**
		 * The meta object literal for the '<em><b>Create Symphony Project</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_CORE_UI_FACADE___CREATE_SYMPHONY_PROJECT__NEWSYMPHONYPROJECTSETTINGS = eINSTANCE.getSymphonyCoreUiFacade__CreateSymphonyProject__NewSymphonyProjectSettings();

				/**
		 * The meta object literal for the '<em><b>Create Symphony Session Folder</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_CORE_UI_FACADE___CREATE_SYMPHONY_SESSION_FOLDER__NEWSYMPHONYPROJECTSETTINGS = eINSTANCE.getSymphonyCoreUiFacade__CreateSymphonySessionFolder__NewSymphonyProjectSettings();

				/**
		 * The meta object literal for the '<em><b>Create Symphony Session</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_CORE_UI_FACADE___CREATE_SYMPHONY_SESSION__NEWSYMPHONYSESSIONSETTINGS = eINSTANCE.getSymphonyCoreUiFacade__CreateSymphonySession__NewSymphonySessionSettings();

				/**
		 * The meta object literal for the '<em><b>Create Symphony Session File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_CORE_UI_FACADE___CREATE_SYMPHONY_SESSION_FILE__ICONTAINER_STRING_INVOCATORSESSION = eINSTANCE.getSymphonyCoreUiFacade__CreateSymphonySessionFile__IContainer_String_InvocatorSession();

				/**
		 * The meta object literal for the '<em><b>Get Symphony Session File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_CORE_UI_FACADE___GET_SYMPHONY_SESSION_FILE__ICONTAINER_STRING = eINSTANCE.getSymphonyCoreUiFacade__GetSymphonySessionFile__IContainer_String();

				/**
		 * The meta object literal for the '<em><b>Create Symphony System</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_CORE_UI_FACADE___CREATE_SYMPHONY_SYSTEM__NEWSYMPHONYSYSTEMSETTINGS = eINSTANCE.getSymphonyCoreUiFacade__CreateSymphonySystem__NewSymphonySystemSettings();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.ui.impl.SymphonyResourceSettingsImpl <em>Symphony Resource Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.ui.impl.SymphonyResourceSettingsImpl
		 * @see org.eclipse.symphony.core.ui.impl.SymphonyCoreUiPackageImpl#getSymphonyResourceSettings()
		 * @generated
		 */
		EClass SYMPHONY_RESOURCE_SETTINGS = eINSTANCE.getSymphonyResourceSettings();

				/**
		 * The meta object literal for the '<em><b>Resource Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMPHONY_RESOURCE_SETTINGS__RESOURCE_PROJECT = eINSTANCE.getSymphonyResourceSettings_ResourceProject();

				/**
		 * The meta object literal for the '<em><b>Resource File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMPHONY_RESOURCE_SETTINGS__RESOURCE_FILE = eINSTANCE.getSymphonyResourceSettings_ResourceFile();

				/**
		 * The meta object literal for the '<em><b>Resource Container</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMPHONY_RESOURCE_SETTINGS__RESOURCE_CONTAINER = eINSTANCE.getSymphonyResourceSettings_ResourceContainer();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.ui.impl.NewSymphonyProjectSettingsImpl <em>New Symphony Project Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.ui.impl.NewSymphonyProjectSettingsImpl
		 * @see org.eclipse.symphony.core.ui.impl.SymphonyCoreUiPackageImpl#getNewSymphonyProjectSettings()
		 * @generated
		 */
		EClass NEW_SYMPHONY_PROJECT_SETTINGS = eINSTANCE.getNewSymphonyProjectSettings();

				/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEW_SYMPHONY_PROJECT_SETTINGS__NAME = eINSTANCE.getNewSymphonyProjectSettings_Name();

				/**
		 * The meta object literal for the '<em><b>Import Registered Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEW_SYMPHONY_PROJECT_SETTINGS__IMPORT_REGISTERED_PROJECT = eINSTANCE.getNewSymphonyProjectSettings_ImportRegisteredProject();

				/**
		 * The meta object literal for the '<em><b>Get Default Project Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEW_SYMPHONY_PROJECT_SETTINGS___GET_DEFAULT_PROJECT_NAME = eINSTANCE.getNewSymphonyProjectSettings__GetDefaultProjectName();

				/**
		 * The meta object literal for the '<em><b>Set Default Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEW_SYMPHONY_PROJECT_SETTINGS___SET_DEFAULT_VALUES = eINSTANCE.getNewSymphonyProjectSettings__SetDefaultValues();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.ui.impl.NewSymphonySessionSettingsImpl <em>New Symphony Session Settings</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.ui.impl.NewSymphonySessionSettingsImpl
		 * @see org.eclipse.symphony.core.ui.impl.SymphonyCoreUiPackageImpl#getNewSymphonySessionSettings()
		 * @generated
		 */
    EClass NEW_SYMPHONY_SESSION_SETTINGS = eINSTANCE.getNewSymphonySessionSettings();

    /**
		 * The meta object literal for the '<em><b>Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NEW_SYMPHONY_SESSION_SETTINGS__FOLDER = eINSTANCE.getNewSymphonySessionSettings_Folder();

    /**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NEW_SYMPHONY_SESSION_SETTINGS__FILENAME = eINSTANCE.getNewSymphonySessionSettings_Filename();

    /**
		 * The meta object literal for the '<em><b>Create Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NEW_SYMPHONY_SESSION_SETTINGS__CREATE_ENVIRONMENT = eINSTANCE.getNewSymphonySessionSettings_CreateEnvironment();

    /**
		 * The meta object literal for the '<em><b>Create Programs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NEW_SYMPHONY_SESSION_SETTINGS__CREATE_PROGRAMS = eINSTANCE.getNewSymphonySessionSettings_CreatePrograms();

    /**
		 * The meta object literal for the '<em><b>Create Data Products</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NEW_SYMPHONY_SESSION_SETTINGS__CREATE_DATA_PRODUCTS = eINSTANCE.getNewSymphonySessionSettings_CreateDataProducts();

    /**
		 * The meta object literal for the '<em><b>Create Tools</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NEW_SYMPHONY_SESSION_SETTINGS__CREATE_TOOLS = eINSTANCE.getNewSymphonySessionSettings_CreateTools();

    /**
		 * The meta object literal for the '<em><b>Get Default Filename</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEW_SYMPHONY_SESSION_SETTINGS___GET_DEFAULT_FILENAME__ICONTAINER = eINSTANCE.getNewSymphonySessionSettings__GetDefaultFilename__IContainer();

				/**
		 * The meta object literal for the '<em><b>Set Default Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEW_SYMPHONY_SESSION_SETTINGS___SET_DEFAULT_VALUES__ICONTAINER = eINSTANCE.getNewSymphonySessionSettings__SetDefaultValues__IContainer();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.ui.impl.NewSymphonySystemSettingsImpl <em>New Symphony System Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.ui.impl.NewSymphonySystemSettingsImpl
		 * @see org.eclipse.symphony.core.ui.impl.SymphonyCoreUiPackageImpl#getNewSymphonySystemSettings()
		 * @generated
		 */
		EClass NEW_SYMPHONY_SYSTEM_SETTINGS = eINSTANCE.getNewSymphonySystemSettings();

				/**
		 * The meta object literal for the '<em><b>Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEW_SYMPHONY_SYSTEM_SETTINGS__FOLDER = eINSTANCE.getNewSymphonySystemSettings_Folder();

				/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEW_SYMPHONY_SYSTEM_SETTINGS__FILENAME = eINSTANCE.getNewSymphonySystemSettings_Filename();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.ui.impl.ResultNodePresentationImpl <em>Result Node Presentation</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.ui.impl.ResultNodePresentationImpl
		 * @see org.eclipse.symphony.core.ui.impl.SymphonyCoreUiPackageImpl#getResultNodePresentation()
		 * @generated
		 */
    EClass RESULT_NODE_PRESENTATION = eINSTANCE.getResultNodePresentation();

    /**
		 * The meta object literal for the '<em><b>Pole Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RESULT_NODE_PRESENTATION__POLE_HEIGHT = eINSTANCE.getResultNodePresentation_PoleHeight();

    /**
		 * The meta object literal for the '<em><b>Flag Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RESULT_NODE_PRESENTATION__FLAG_VISIBLE = eINSTANCE.getResultNodePresentation_FlagVisible();

				/**
		 * The meta object literal for the '<em>IProject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IProject
		 * @see org.eclipse.symphony.core.ui.impl.SymphonyCoreUiPackageImpl#getIProject()
		 * @generated
		 */
		EDataType IPROJECT = eINSTANCE.getIProject();

				/**
		 * The meta object literal for the '<em>IContainer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IContainer
		 * @see org.eclipse.symphony.core.ui.impl.SymphonyCoreUiPackageImpl#getIContainer()
		 * @generated
		 */
		EDataType ICONTAINER = eINSTANCE.getIContainer();

				/**
		 * The meta object literal for the '<em>IFile</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IFile
		 * @see org.eclipse.symphony.core.ui.impl.SymphonyCoreUiPackageImpl#getIFile()
		 * @generated
		 */
		EDataType IFILE = eINSTANCE.getIFile();

				/**
		 * The meta object literal for the '<em>IFolder</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IFolder
		 * @see org.eclipse.symphony.core.ui.impl.SymphonyCoreUiPackageImpl#getIFolder()
		 * @generated
		 */
		EDataType IFOLDER = eINSTANCE.getIFolder();

  }

} //SymphonyCoreUiPackage
