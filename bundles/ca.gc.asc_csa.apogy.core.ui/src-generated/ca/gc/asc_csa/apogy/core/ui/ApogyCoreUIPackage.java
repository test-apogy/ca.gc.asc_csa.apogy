package ca.gc.asc_csa.apogy.core.ui;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;

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
 * <!-- begin-model-doc -->
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca),
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 * <!-- end-model-doc -->
 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCoreUI' copyrightText='Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyCoreUI' modelDirectory='/ca.gc.asc_csa.apogy.core.ui/src-generated' editDirectory='/ca.gc.asc_csa.apogy.core.ui.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.core'"
 * @generated
 */
public interface ApogyCoreUIPackage extends EPackage
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
  String eNS_URI = "ca.gc.asc_csa.apogy.core.ui";

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
  ApogyCoreUIPackage eINSTANCE = ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl.init();

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIFacadeImpl
	 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getApogyCoreUIFacade()
	 * @generated
	 */
  int APOGY_CORE_UI_FACADE = 0;

  /**
	 * The feature id for the '<em><b>Default Apogy Project Name Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_UI_FACADE__DEFAULT_APOGY_PROJECT_NAME_PREFIX = 0;

		/**
	 * The feature id for the '<em><b>Default Apogy Session Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_UI_FACADE__DEFAULT_APOGY_SESSION_FILENAME = 1;

		/**
	 * The feature id for the '<em><b>Default Apogy Session Filename Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_UI_FACADE__DEFAULT_APOGY_SESSION_FILENAME_EXTENSION = 2;

		/**
	 * The feature id for the '<em><b>Default Apogy Session Folder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_UI_FACADE__DEFAULT_APOGY_SESSION_FOLDER_NAME = 3;

		/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int APOGY_CORE_UI_FACADE_FEATURE_COUNT = 4;

  /**
	 * The operation id for the '<em>Create Apogy Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_UI_FACADE___CREATE_APOGY_PROJECT__NEWAPOGYPROJECTSETTINGS = 0;

		/**
	 * The operation id for the '<em>Create Apogy Session Folder</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_UI_FACADE___CREATE_APOGY_SESSION_FOLDER__NEWAPOGYPROJECTSETTINGS = 1;

		/**
	 * The operation id for the '<em>Create Apogy Session</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_UI_FACADE___CREATE_APOGY_SESSION__NEWAPOGYSESSIONSETTINGS = 2;

		/**
	 * The operation id for the '<em>Create Apogy Session File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_UI_FACADE___CREATE_APOGY_SESSION_FILE__ICONTAINER_STRING_INVOCATORSESSION = 3;

		/**
	 * The operation id for the '<em>Get Apogy Session File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_UI_FACADE___GET_APOGY_SESSION_FILE__ICONTAINER_STRING = 4;

		/**
	 * The operation id for the '<em>Create Apogy System</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_UI_FACADE___CREATE_APOGY_SYSTEM__NEWAPOGYSYSTEMSETTINGS = 5;

		/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int APOGY_CORE_UI_FACADE_OPERATION_COUNT = 6;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.ui.impl.ApogyResourceSettingsImpl <em>Apogy Resource Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyResourceSettingsImpl
	 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getApogyResourceSettings()
	 * @generated
	 */
	int APOGY_RESOURCE_SETTINGS = 1;

		/**
	 * The feature id for the '<em><b>Resource Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_RESOURCE_SETTINGS__RESOURCE_PROJECT = 0;

		/**
	 * The feature id for the '<em><b>Resource File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_RESOURCE_SETTINGS__RESOURCE_FILE = 1;

		/**
	 * The feature id for the '<em><b>Resource Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_RESOURCE_SETTINGS__RESOURCE_CONTAINER = 2;

		/**
	 * The number of structural features of the '<em>Apogy Resource Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_RESOURCE_SETTINGS_FEATURE_COUNT = 3;

		/**
	 * The number of operations of the '<em>Apogy Resource Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_RESOURCE_SETTINGS_OPERATION_COUNT = 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.ui.impl.NewApogyProjectSettingsImpl <em>New Apogy Project Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.ui.impl.NewApogyProjectSettingsImpl
	 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getNewApogyProjectSettings()
	 * @generated
	 */
	int NEW_APOGY_PROJECT_SETTINGS = 2;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_APOGY_PROJECT_SETTINGS__NAME = 0;

		/**
	 * The feature id for the '<em><b>Import Registered Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_APOGY_PROJECT_SETTINGS__IMPORT_REGISTERED_PROJECT = 1;

		/**
	 * The number of structural features of the '<em>New Apogy Project Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_APOGY_PROJECT_SETTINGS_FEATURE_COUNT = 2;

		/**
	 * The operation id for the '<em>Get Default Project Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_APOGY_PROJECT_SETTINGS___GET_DEFAULT_PROJECT_NAME = 0;

		/**
	 * The operation id for the '<em>Set Default Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_APOGY_PROJECT_SETTINGS___SET_DEFAULT_VALUES = 1;

		/**
	 * The number of operations of the '<em>New Apogy Project Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_APOGY_PROJECT_SETTINGS_OPERATION_COUNT = 2;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.ui.impl.NewApogySessionSettingsImpl <em>New Apogy Session Settings</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.ui.impl.NewApogySessionSettingsImpl
	 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getNewApogySessionSettings()
	 * @generated
	 */
  int NEW_APOGY_SESSION_SETTINGS = 3;

  /**
	 * The feature id for the '<em><b>Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NEW_APOGY_SESSION_SETTINGS__FOLDER = 0;

  /**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NEW_APOGY_SESSION_SETTINGS__FILENAME = 1;

  /**
	 * The feature id for the '<em><b>Create Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NEW_APOGY_SESSION_SETTINGS__CREATE_ENVIRONMENT = 2;

  /**
	 * The feature id for the '<em><b>Create Programs</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NEW_APOGY_SESSION_SETTINGS__CREATE_PROGRAMS = 3;

  /**
	 * The feature id for the '<em><b>Create Data Products</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NEW_APOGY_SESSION_SETTINGS__CREATE_DATA_PRODUCTS = 4;

  /**
	 * The feature id for the '<em><b>Create Tools</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NEW_APOGY_SESSION_SETTINGS__CREATE_TOOLS = 5;

  /**
	 * The number of structural features of the '<em>New Apogy Session Settings</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NEW_APOGY_SESSION_SETTINGS_FEATURE_COUNT = 6;

  /**
	 * The operation id for the '<em>Get Default Filename</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_APOGY_SESSION_SETTINGS___GET_DEFAULT_FILENAME__ICONTAINER = 0;

		/**
	 * The operation id for the '<em>Set Default Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_APOGY_SESSION_SETTINGS___SET_DEFAULT_VALUES__ICONTAINER = 1;

		/**
	 * The number of operations of the '<em>New Apogy Session Settings</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NEW_APOGY_SESSION_SETTINGS_OPERATION_COUNT = 2;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.ui.impl.NewApogySystemSettingsImpl <em>New Apogy System Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.ui.impl.NewApogySystemSettingsImpl
	 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getNewApogySystemSettings()
	 * @generated
	 */
	int NEW_APOGY_SYSTEM_SETTINGS = 4;

		/**
	 * The feature id for the '<em><b>Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_APOGY_SYSTEM_SETTINGS__FOLDER = 0;

		/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_APOGY_SYSTEM_SETTINGS__FILENAME = 1;

		/**
	 * The number of structural features of the '<em>New Apogy System Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_APOGY_SYSTEM_SETTINGS_FEATURE_COUNT = 2;

		/**
	 * The number of operations of the '<em>New Apogy System Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_APOGY_SYSTEM_SETTINGS_OPERATION_COUNT = 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.ui.impl.ResultNodePresentationImpl <em>Result Node Presentation</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.ui.impl.ResultNodePresentationImpl
	 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getResultNodePresentation()
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
	int RESULT_NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

		/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__NODE = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION__NODE;

  /**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__COLOR = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION__COLOR;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__VISIBLE = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION__VISIBLE;

  /**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE_PRESENTATION__SHADOW_MODE = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION__SHADOW_MODE;

		/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

		/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__CENTROID = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION__CENTROID;

		/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__MIN = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION__MIN;

		/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__MAX = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION__MAX;

		/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__XRANGE = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION__XRANGE;

		/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__YRANGE = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION__YRANGE;

		/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__ZRANGE = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION__ZRANGE;

		/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__SCENE_OBJECT = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION__SCENE_OBJECT;

		/**
	 * The feature id for the '<em><b>Axis Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE_PRESENTATION__AXIS_VISIBLE = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION__AXIS_VISIBLE;

		/**
	 * The feature id for the '<em><b>Axis Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE_PRESENTATION__AXIS_LENGTH = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION__AXIS_LENGTH;

		/**
	 * The feature id for the '<em><b>Pole Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__POLE_HEIGHT = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Flag Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__FLAG_VISIBLE = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Result Node Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION_FEATURE_COUNT = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Result Node Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION_OPERATION_COUNT = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '<em>IProject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IProject
	 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getIProject()
	 * @generated
	 */
	int IPROJECT = 6;

		/**
	 * The meta object id for the '<em>IContainer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IContainer
	 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getIContainer()
	 * @generated
	 */
	int ICONTAINER = 7;

		/**
	 * The meta object id for the '<em>IFile</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IFile
	 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getIFile()
	 * @generated
	 */
	int IFILE = 8;

		/**
	 * The meta object id for the '<em>IFolder</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IFolder
	 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getIFolder()
	 * @generated
	 */
	int IFOLDER = 9;

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade
	 * @generated
	 */
	EClass getApogyCoreUIFacade();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade#getDefaultApogyProjectNamePrefix <em>Default Apogy Project Name Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Apogy Project Name Prefix</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade#getDefaultApogyProjectNamePrefix()
	 * @see #getApogyCoreUIFacade()
	 * @generated
	 */
	EAttribute getApogyCoreUIFacade_DefaultApogyProjectNamePrefix();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade#getDefaultApogySessionFilename <em>Default Apogy Session Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Apogy Session Filename</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade#getDefaultApogySessionFilename()
	 * @see #getApogyCoreUIFacade()
	 * @generated
	 */
	EAttribute getApogyCoreUIFacade_DefaultApogySessionFilename();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade#getDefaultApogySessionFilenameExtension <em>Default Apogy Session Filename Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Apogy Session Filename Extension</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade#getDefaultApogySessionFilenameExtension()
	 * @see #getApogyCoreUIFacade()
	 * @generated
	 */
	EAttribute getApogyCoreUIFacade_DefaultApogySessionFilenameExtension();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade#getDefaultApogySessionFolderName <em>Default Apogy Session Folder Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Apogy Session Folder Name</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade#getDefaultApogySessionFolderName()
	 * @see #getApogyCoreUIFacade()
	 * @generated
	 */
	EAttribute getApogyCoreUIFacade_DefaultApogySessionFolderName();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade#createApogyProject(ca.gc.asc_csa.apogy.core.ui.NewApogyProjectSettings) <em>Create Apogy Project</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Apogy Project</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade#createApogyProject(ca.gc.asc_csa.apogy.core.ui.NewApogyProjectSettings)
	 * @generated
	 */
	EOperation getApogyCoreUIFacade__CreateApogyProject__NewApogyProjectSettings();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade#createApogySessionFolder(ca.gc.asc_csa.apogy.core.ui.NewApogyProjectSettings) <em>Create Apogy Session Folder</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Apogy Session Folder</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade#createApogySessionFolder(ca.gc.asc_csa.apogy.core.ui.NewApogyProjectSettings)
	 * @generated
	 */
	EOperation getApogyCoreUIFacade__CreateApogySessionFolder__NewApogyProjectSettings();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade#createApogySession(ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings) <em>Create Apogy Session</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Apogy Session</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade#createApogySession(ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings)
	 * @generated
	 */
	EOperation getApogyCoreUIFacade__CreateApogySession__NewApogySessionSettings();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade#createApogySessionFile(org.eclipse.core.resources.IContainer, java.lang.String, ca.gc.asc_csa.apogy.core.invocator.InvocatorSession) <em>Create Apogy Session File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Apogy Session File</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade#createApogySessionFile(org.eclipse.core.resources.IContainer, java.lang.String, ca.gc.asc_csa.apogy.core.invocator.InvocatorSession)
	 * @generated
	 */
	EOperation getApogyCoreUIFacade__CreateApogySessionFile__IContainer_String_InvocatorSession();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade#getApogySessionFile(org.eclipse.core.resources.IContainer, java.lang.String) <em>Get Apogy Session File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Apogy Session File</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade#getApogySessionFile(org.eclipse.core.resources.IContainer, java.lang.String)
	 * @generated
	 */
	EOperation getApogyCoreUIFacade__GetApogySessionFile__IContainer_String();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade#createApogySystem(ca.gc.asc_csa.apogy.core.ui.NewApogySystemSettings) <em>Create Apogy System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Apogy System</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade#createApogySystem(ca.gc.asc_csa.apogy.core.ui.NewApogySystemSettings)
	 * @generated
	 */
	EOperation getApogyCoreUIFacade__CreateApogySystem__NewApogySystemSettings();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.ui.ApogyResourceSettings <em>Apogy Resource Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apogy Resource Settings</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyResourceSettings
	 * @generated
	 */
	EClass getApogyResourceSettings();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.ui.ApogyResourceSettings#getResourceProject <em>Resource Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Project</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyResourceSettings#getResourceProject()
	 * @see #getApogyResourceSettings()
	 * @generated
	 */
	EAttribute getApogyResourceSettings_ResourceProject();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.ui.ApogyResourceSettings#getResourceFile <em>Resource File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource File</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyResourceSettings#getResourceFile()
	 * @see #getApogyResourceSettings()
	 * @generated
	 */
	EAttribute getApogyResourceSettings_ResourceFile();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.ui.ApogyResourceSettings#getResourceContainer <em>Resource Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Container</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyResourceSettings#getResourceContainer()
	 * @see #getApogyResourceSettings()
	 * @generated
	 */
	EAttribute getApogyResourceSettings_ResourceContainer();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.ui.NewApogyProjectSettings <em>New Apogy Project Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Apogy Project Settings</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ui.NewApogyProjectSettings
	 * @generated
	 */
	EClass getNewApogyProjectSettings();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.ui.NewApogyProjectSettings#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ui.NewApogyProjectSettings#getName()
	 * @see #getNewApogyProjectSettings()
	 * @generated
	 */
	EAttribute getNewApogyProjectSettings_Name();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.ui.NewApogyProjectSettings#isImportRegisteredProject <em>Import Registered Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Registered Project</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ui.NewApogyProjectSettings#isImportRegisteredProject()
	 * @see #getNewApogyProjectSettings()
	 * @generated
	 */
	EAttribute getNewApogyProjectSettings_ImportRegisteredProject();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.ui.NewApogyProjectSettings#getDefaultProjectName() <em>Get Default Project Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Project Name</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.ui.NewApogyProjectSettings#getDefaultProjectName()
	 * @generated
	 */
	EOperation getNewApogyProjectSettings__GetDefaultProjectName();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.ui.NewApogyProjectSettings#setDefaultValues() <em>Set Default Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Default Values</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.ui.NewApogyProjectSettings#setDefaultValues()
	 * @generated
	 */
	EOperation getNewApogyProjectSettings__SetDefaultValues();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings <em>New Apogy Session Settings</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Apogy Session Settings</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings
	 * @generated
	 */
  EClass getNewApogySessionSettings();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings#getFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Folder</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings#getFolder()
	 * @see #getNewApogySessionSettings()
	 * @generated
	 */
  EAttribute getNewApogySessionSettings_Folder();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings#getFilename()
	 * @see #getNewApogySessionSettings()
	 * @generated
	 */
  EAttribute getNewApogySessionSettings_Filename();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings#isCreateEnvironment <em>Create Environment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Environment</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings#isCreateEnvironment()
	 * @see #getNewApogySessionSettings()
	 * @generated
	 */
  EAttribute getNewApogySessionSettings_CreateEnvironment();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings#isCreatePrograms <em>Create Programs</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Programs</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings#isCreatePrograms()
	 * @see #getNewApogySessionSettings()
	 * @generated
	 */
  EAttribute getNewApogySessionSettings_CreatePrograms();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings#isCreateDataProducts <em>Create Data Products</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Data Products</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings#isCreateDataProducts()
	 * @see #getNewApogySessionSettings()
	 * @generated
	 */
  EAttribute getNewApogySessionSettings_CreateDataProducts();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings#isCreateTools <em>Create Tools</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Tools</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings#isCreateTools()
	 * @see #getNewApogySessionSettings()
	 * @generated
	 */
  EAttribute getNewApogySessionSettings_CreateTools();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings#getDefaultFilename(org.eclipse.core.resources.IContainer) <em>Get Default Filename</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Filename</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings#getDefaultFilename(org.eclipse.core.resources.IContainer)
	 * @generated
	 */
	EOperation getNewApogySessionSettings__GetDefaultFilename__IContainer();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings#setDefaultValues(org.eclipse.core.resources.IContainer) <em>Set Default Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Default Values</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings#setDefaultValues(org.eclipse.core.resources.IContainer)
	 * @generated
	 */
	EOperation getNewApogySessionSettings__SetDefaultValues__IContainer();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.ui.NewApogySystemSettings <em>New Apogy System Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Apogy System Settings</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ui.NewApogySystemSettings
	 * @generated
	 */
	EClass getNewApogySystemSettings();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.ui.NewApogySystemSettings#getFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Folder</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ui.NewApogySystemSettings#getFolder()
	 * @see #getNewApogySystemSettings()
	 * @generated
	 */
	EAttribute getNewApogySystemSettings_Folder();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.ui.NewApogySystemSettings#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ui.NewApogySystemSettings#getFilename()
	 * @see #getNewApogySystemSettings()
	 * @generated
	 */
	EAttribute getNewApogySystemSettings_Filename();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.ui.ResultNodePresentation <em>Result Node Presentation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Node Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ui.ResultNodePresentation
	 * @generated
	 */
  EClass getResultNodePresentation();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.ui.ResultNodePresentation#getPoleHeight <em>Pole Height</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pole Height</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ui.ResultNodePresentation#getPoleHeight()
	 * @see #getResultNodePresentation()
	 * @generated
	 */
  EAttribute getResultNodePresentation_PoleHeight();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.ui.ResultNodePresentation#isFlagVisible <em>Flag Visible</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flag Visible</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ui.ResultNodePresentation#isFlagVisible()
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
	ApogyCoreUIFactory getApogyCoreUIFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIFacadeImpl
		 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getApogyCoreUIFacade()
		 * @generated
		 */
    EClass APOGY_CORE_UI_FACADE = eINSTANCE.getApogyCoreUIFacade();

    /**
		 * The meta object literal for the '<em><b>Default Apogy Project Name Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APOGY_CORE_UI_FACADE__DEFAULT_APOGY_PROJECT_NAME_PREFIX = eINSTANCE.getApogyCoreUIFacade_DefaultApogyProjectNamePrefix();

				/**
		 * The meta object literal for the '<em><b>Default Apogy Session Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APOGY_CORE_UI_FACADE__DEFAULT_APOGY_SESSION_FILENAME = eINSTANCE.getApogyCoreUIFacade_DefaultApogySessionFilename();

				/**
		 * The meta object literal for the '<em><b>Default Apogy Session Filename Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APOGY_CORE_UI_FACADE__DEFAULT_APOGY_SESSION_FILENAME_EXTENSION = eINSTANCE.getApogyCoreUIFacade_DefaultApogySessionFilenameExtension();

				/**
		 * The meta object literal for the '<em><b>Default Apogy Session Folder Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APOGY_CORE_UI_FACADE__DEFAULT_APOGY_SESSION_FOLDER_NAME = eINSTANCE.getApogyCoreUIFacade_DefaultApogySessionFolderName();

				/**
		 * The meta object literal for the '<em><b>Create Apogy Project</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_UI_FACADE___CREATE_APOGY_PROJECT__NEWAPOGYPROJECTSETTINGS = eINSTANCE.getApogyCoreUIFacade__CreateApogyProject__NewApogyProjectSettings();

				/**
		 * The meta object literal for the '<em><b>Create Apogy Session Folder</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_UI_FACADE___CREATE_APOGY_SESSION_FOLDER__NEWAPOGYPROJECTSETTINGS = eINSTANCE.getApogyCoreUIFacade__CreateApogySessionFolder__NewApogyProjectSettings();

				/**
		 * The meta object literal for the '<em><b>Create Apogy Session</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_UI_FACADE___CREATE_APOGY_SESSION__NEWAPOGYSESSIONSETTINGS = eINSTANCE.getApogyCoreUIFacade__CreateApogySession__NewApogySessionSettings();

				/**
		 * The meta object literal for the '<em><b>Create Apogy Session File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_UI_FACADE___CREATE_APOGY_SESSION_FILE__ICONTAINER_STRING_INVOCATORSESSION = eINSTANCE.getApogyCoreUIFacade__CreateApogySessionFile__IContainer_String_InvocatorSession();

				/**
		 * The meta object literal for the '<em><b>Get Apogy Session File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_UI_FACADE___GET_APOGY_SESSION_FILE__ICONTAINER_STRING = eINSTANCE.getApogyCoreUIFacade__GetApogySessionFile__IContainer_String();

				/**
		 * The meta object literal for the '<em><b>Create Apogy System</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_UI_FACADE___CREATE_APOGY_SYSTEM__NEWAPOGYSYSTEMSETTINGS = eINSTANCE.getApogyCoreUIFacade__CreateApogySystem__NewApogySystemSettings();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.ui.impl.ApogyResourceSettingsImpl <em>Apogy Resource Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyResourceSettingsImpl
		 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getApogyResourceSettings()
		 * @generated
		 */
		EClass APOGY_RESOURCE_SETTINGS = eINSTANCE.getApogyResourceSettings();

				/**
		 * The meta object literal for the '<em><b>Resource Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APOGY_RESOURCE_SETTINGS__RESOURCE_PROJECT = eINSTANCE.getApogyResourceSettings_ResourceProject();

				/**
		 * The meta object literal for the '<em><b>Resource File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APOGY_RESOURCE_SETTINGS__RESOURCE_FILE = eINSTANCE.getApogyResourceSettings_ResourceFile();

				/**
		 * The meta object literal for the '<em><b>Resource Container</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APOGY_RESOURCE_SETTINGS__RESOURCE_CONTAINER = eINSTANCE.getApogyResourceSettings_ResourceContainer();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.ui.impl.NewApogyProjectSettingsImpl <em>New Apogy Project Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.ui.impl.NewApogyProjectSettingsImpl
		 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getNewApogyProjectSettings()
		 * @generated
		 */
		EClass NEW_APOGY_PROJECT_SETTINGS = eINSTANCE.getNewApogyProjectSettings();

				/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEW_APOGY_PROJECT_SETTINGS__NAME = eINSTANCE.getNewApogyProjectSettings_Name();

				/**
		 * The meta object literal for the '<em><b>Import Registered Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEW_APOGY_PROJECT_SETTINGS__IMPORT_REGISTERED_PROJECT = eINSTANCE.getNewApogyProjectSettings_ImportRegisteredProject();

				/**
		 * The meta object literal for the '<em><b>Get Default Project Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEW_APOGY_PROJECT_SETTINGS___GET_DEFAULT_PROJECT_NAME = eINSTANCE.getNewApogyProjectSettings__GetDefaultProjectName();

				/**
		 * The meta object literal for the '<em><b>Set Default Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEW_APOGY_PROJECT_SETTINGS___SET_DEFAULT_VALUES = eINSTANCE.getNewApogyProjectSettings__SetDefaultValues();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.ui.impl.NewApogySessionSettingsImpl <em>New Apogy Session Settings</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.ui.impl.NewApogySessionSettingsImpl
		 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getNewApogySessionSettings()
		 * @generated
		 */
    EClass NEW_APOGY_SESSION_SETTINGS = eINSTANCE.getNewApogySessionSettings();

    /**
		 * The meta object literal for the '<em><b>Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NEW_APOGY_SESSION_SETTINGS__FOLDER = eINSTANCE.getNewApogySessionSettings_Folder();

    /**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NEW_APOGY_SESSION_SETTINGS__FILENAME = eINSTANCE.getNewApogySessionSettings_Filename();

    /**
		 * The meta object literal for the '<em><b>Create Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NEW_APOGY_SESSION_SETTINGS__CREATE_ENVIRONMENT = eINSTANCE.getNewApogySessionSettings_CreateEnvironment();

    /**
		 * The meta object literal for the '<em><b>Create Programs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NEW_APOGY_SESSION_SETTINGS__CREATE_PROGRAMS = eINSTANCE.getNewApogySessionSettings_CreatePrograms();

    /**
		 * The meta object literal for the '<em><b>Create Data Products</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NEW_APOGY_SESSION_SETTINGS__CREATE_DATA_PRODUCTS = eINSTANCE.getNewApogySessionSettings_CreateDataProducts();

    /**
		 * The meta object literal for the '<em><b>Create Tools</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NEW_APOGY_SESSION_SETTINGS__CREATE_TOOLS = eINSTANCE.getNewApogySessionSettings_CreateTools();

    /**
		 * The meta object literal for the '<em><b>Get Default Filename</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEW_APOGY_SESSION_SETTINGS___GET_DEFAULT_FILENAME__ICONTAINER = eINSTANCE.getNewApogySessionSettings__GetDefaultFilename__IContainer();

				/**
		 * The meta object literal for the '<em><b>Set Default Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEW_APOGY_SESSION_SETTINGS___SET_DEFAULT_VALUES__ICONTAINER = eINSTANCE.getNewApogySessionSettings__SetDefaultValues__IContainer();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.ui.impl.NewApogySystemSettingsImpl <em>New Apogy System Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.ui.impl.NewApogySystemSettingsImpl
		 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getNewApogySystemSettings()
		 * @generated
		 */
		EClass NEW_APOGY_SYSTEM_SETTINGS = eINSTANCE.getNewApogySystemSettings();

				/**
		 * The meta object literal for the '<em><b>Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEW_APOGY_SYSTEM_SETTINGS__FOLDER = eINSTANCE.getNewApogySystemSettings_Folder();

				/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEW_APOGY_SYSTEM_SETTINGS__FILENAME = eINSTANCE.getNewApogySystemSettings_Filename();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.ui.impl.ResultNodePresentationImpl <em>Result Node Presentation</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.ui.impl.ResultNodePresentationImpl
		 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getResultNodePresentation()
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
		 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getIProject()
		 * @generated
		 */
		EDataType IPROJECT = eINSTANCE.getIProject();

				/**
		 * The meta object literal for the '<em>IContainer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IContainer
		 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getIContainer()
		 * @generated
		 */
		EDataType ICONTAINER = eINSTANCE.getIContainer();

				/**
		 * The meta object literal for the '<em>IFile</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IFile
		 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getIFile()
		 * @generated
		 */
		EDataType IFILE = eINSTANCE.getIFile();

				/**
		 * The meta object literal for the '<em>IFolder</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IFolder
		 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getIFolder()
		 * @generated
		 */
		EDataType IFOLDER = eINSTANCE.getIFolder();

  }

} //ApogyCoreUIPackage
