package ca.gc.asc_csa.apogy.core;
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
import org.eclipse.emf.ecore.EReference;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;

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
 * @see ca.gc.asc_csa.apogy.core.ApogyCoreFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCore' childCreationExtenders='true' extensibleProviderFactory='true' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)' modelName='ApogyCore' multipleEditorPages='false' fileExtensions='sym' modelDirectory='/ca.gc.asc_csa.apogy.core/src-generated' editDirectory='/ca.gc.asc_csa.apogy.core.edit/src-generated' basePackage='ca.gc.asc_csa.apogy'"
 * @generated
 */
public interface ApogyCorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCorePackage eINSTANCE = ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.ApogyCoreFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCoreFacadeImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getApogyCoreFacade()
	 * @generated
	 */
	int APOGY_CORE_FACADE = 0;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Compute Absolute Pose Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_FACADE___COMPUTE_ABSOLUTE_POSE_MATRIX__APOGYSYSTEM_MATRIX4X4 = 0;

	/**
	 * The operation id for the '<em>Create Result Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_FACADE___CREATE_RESULT_NODE__POSITIONEDRESULT = 1;

	/**
	 * The operation id for the '<em>Create Apogy Session</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_FACADE___CREATE_APOGY_SESSION__BOOLEAN_BOOLEAN_BOOLEAN_BOOLEAN = 2;

	/**
	 * The operation id for the '<em>Get Apogy System</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_FACADE___GET_APOGY_SYSTEM__ENVIRONMENT_STRING = 3;

	/**
	 * The operation id for the '<em>Load Feature Of Interest From File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_FACADE___LOAD_FEATURE_OF_INTEREST_FROM_FILE__STRING = 4;

	/**
	 * The operation id for the '<em>Save Feature Of Interest To File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_FACADE___SAVE_FEATURE_OF_INTEREST_TO_FILE__STRING_LIST = 5;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_FACADE_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.ApogyEnvironmentImpl <em>Apogy Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyEnvironmentImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getApogyEnvironment()
	 * @generated
	 */
	int APOGY_ENVIRONMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ENVIRONMENT__NAME = ApogyCoreInvocatorPackage.ENVIRONMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ENVIRONMENT__DESCRIPTION = ApogyCoreInvocatorPackage.ENVIRONMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ENVIRONMENT__INVOCATOR_SESSION = ApogyCoreInvocatorPackage.ENVIRONMENT__INVOCATOR_SESSION;

	/**
	 * The feature id for the '<em><b>Types List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ENVIRONMENT__TYPES_LIST = ApogyCoreInvocatorPackage.ENVIRONMENT__TYPES_LIST;

	/**
	 * The feature id for the '<em><b>Variables List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ENVIRONMENT__VARIABLES_LIST = ApogyCoreInvocatorPackage.ENVIRONMENT__VARIABLES_LIST;

	/**
	 * The feature id for the '<em><b>Contexts List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ENVIRONMENT__CONTEXTS_LIST = ApogyCoreInvocatorPackage.ENVIRONMENT__CONTEXTS_LIST;

	/**
	 * The feature id for the '<em><b>Active Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ENVIRONMENT__ACTIVE_CONTEXT = ApogyCoreInvocatorPackage.ENVIRONMENT__ACTIVE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ENVIRONMENT__TIME = ApogyCoreInvocatorPackage.ENVIRONMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Worksites List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ENVIRONMENT__WORKSITES_LIST = ApogyCoreInvocatorPackage.ENVIRONMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Active Worksite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ENVIRONMENT__ACTIVE_WORKSITE = ApogyCoreInvocatorPackage.ENVIRONMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Apogy Topology</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ENVIRONMENT__APOGY_TOPOLOGY = ApogyCoreInvocatorPackage.ENVIRONMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Time Sources List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ENVIRONMENT__TIME_SOURCES_LIST = ApogyCoreInvocatorPackage.ENVIRONMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Active Time Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ENVIRONMENT__ACTIVE_TIME_SOURCE = ApogyCoreInvocatorPackage.ENVIRONMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Apogy Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ENVIRONMENT_FEATURE_COUNT = ApogyCoreInvocatorPackage.ENVIRONMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Apogy Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ENVIRONMENT_OPERATION_COUNT = ApogyCoreInvocatorPackage.ENVIRONMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.TimeSourcesListImpl <em>Time Sources List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.TimeSourcesListImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getTimeSourcesList()
	 * @generated
	 */
	int TIME_SOURCES_LIST = 2;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SOURCES_LIST__ENVIRONMENT = 0;

	/**
	 * The feature id for the '<em><b>Time Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SOURCES_LIST__TIME_SOURCES = 1;

	/**
	 * The number of structural features of the '<em>Time Sources List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SOURCES_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Time Sources List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SOURCES_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.ApogyTopologyImpl <em>Apogy Topology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyTopologyImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getApogyTopology()
	 * @generated
	 */
	int APOGY_TOPOLOGY = 3;

	/**
	 * The feature id for the '<em><b>Root Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_TOPOLOGY__ROOT_NODE = 0;

	/**
	 * The number of structural features of the '<em>Apogy Topology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_TOPOLOGY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Apogy Topology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_TOPOLOGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.ApogySystemImpl <em>Apogy System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogySystemImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getApogySystem()
	 * @generated
	 */
	int APOGY_SYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SYSTEM__NAME = ApogyCoreInvocatorPackage.TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SYSTEM__MEMBERS = ApogyCoreInvocatorPackage.TYPE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Interface Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SYSTEM__INTERFACE_CLASS = ApogyCoreInvocatorPackage.TYPE__INTERFACE_CLASS;

	/**
	 * The feature id for the '<em><b>Type Api Adapter Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SYSTEM__TYPE_API_ADAPTER_CLASS = ApogyCoreInvocatorPackage.TYPE__TYPE_API_ADAPTER_CLASS;

	/**
	 * The feature id for the '<em><b>Topology Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SYSTEM__TOPOLOGY_ROOT = ApogyCoreInvocatorPackage.TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SYSTEM__BINDING_SET = ApogyCoreInvocatorPackage.TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connection Points List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SYSTEM__CONNECTION_POINTS_LIST = ApogyCoreInvocatorPackage.TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assembly Links List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SYSTEM__ASSEMBLY_LINKS_LIST = ApogyCoreInvocatorPackage.TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pose Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SYSTEM__POSE_PROVIDER = ApogyCoreInvocatorPackage.TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pose Provider Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SYSTEM__POSE_PROVIDER_INSTANCE = ApogyCoreInvocatorPackage.TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Apogy System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SYSTEM_FEATURE_COUNT = ApogyCoreInvocatorPackage.TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Apogy System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SYSTEM_OPERATION_COUNT = ApogyCoreInvocatorPackage.TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.ApogySystemApiAdapterImpl <em>Apogy System Api Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogySystemApiAdapterImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getApogySystemApiAdapter()
	 * @generated
	 */
	int APOGY_SYSTEM_API_ADAPTER = 5;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SYSTEM_API_ADAPTER__ENVIRONMENT = ApogyCoreInvocatorPackage.TYPE_API_ADAPTER__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SYSTEM_API_ADAPTER__INSTANCE = ApogyCoreInvocatorPackage.TYPE_API_ADAPTER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SYSTEM_API_ADAPTER__ELEMENT_TYPE = ApogyCoreInvocatorPackage.TYPE_API_ADAPTER__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SYSTEM_API_ADAPTER__POSE_TRANSFORM = ApogyCoreInvocatorPackage.TYPE_API_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pose Corrector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SYSTEM_API_ADAPTER__POSE_CORRECTOR = ApogyCoreInvocatorPackage.TYPE_API_ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Apogy System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SYSTEM_API_ADAPTER__APOGY_SYSTEM = ApogyCoreInvocatorPackage.TYPE_API_ADAPTER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Apogy System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SYSTEM_API_ADAPTER_FEATURE_COUNT = ApogyCoreInvocatorPackage.TYPE_API_ADAPTER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SYSTEM_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT = ApogyCoreInvocatorPackage.TYPE_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SYSTEM_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA = ApogyCoreInvocatorPackage.TYPE_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA;

	/**
	 * The operation id for the '<em>Create Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SYSTEM_API_ADAPTER___CREATE_INITIALIZATION_DATA = ApogyCoreInvocatorPackage.TYPE_API_ADAPTER___CREATE_INITIALIZATION_DATA;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SYSTEM_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA = ApogyCoreInvocatorPackage.TYPE_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA;

	/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL = ApogyCoreInvocatorPackage.TYPE_API_ADAPTER___CREATE_RESULT__OPERATIONCALL;

	/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION = ApogyCoreInvocatorPackage.TYPE_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SYSTEM_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN = ApogyCoreInvocatorPackage.TYPE_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SYSTEM_API_ADAPTER___DISPOSE = ApogyCoreInvocatorPackage.TYPE_API_ADAPTER___DISPOSE;

	/**
	 * The operation id for the '<em>Create Result Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL = ApogyCoreInvocatorPackage.TYPE_API_ADAPTER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Apogy System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SYSTEM_API_ADAPTER_OPERATION_COUNT = ApogyCoreInvocatorPackage.TYPE_API_ADAPTER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.ConnectionPointsListImpl <em>Connection Points List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.ConnectionPointsListImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getConnectionPointsList()
	 * @generated
	 */
	int CONNECTION_POINTS_LIST = 6;

	/**
	 * The feature id for the '<em><b>Apogy System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINTS_LIST__APOGY_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Connection Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINTS_LIST__CONNECTION_POINTS = 1;

	/**
	 * The number of structural features of the '<em>Connection Points List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINTS_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Connection Points List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINTS_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.ConnectionPointImpl <em>Connection Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.ConnectionPointImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getConnectionPoint()
	 * @generated
	 */
	int CONNECTION_POINT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Points List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__POINTS_LIST = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__NODE = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connection Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Connection Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.AssemblyLinkImpl <em>Assembly Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.AssemblyLinkImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getAssemblyLink()
	 * @generated
	 */
	int ASSEMBLY_LINK = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Type Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK__PARENT_TYPE_MEMBER = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub System Type Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK__SUB_SYSTEM_TYPE_MEMBER = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Connection Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK__PARENT_CONNECTION_POINT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transformation Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK__TRANSFORMATION_MATRIX = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Geometry Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK__GEOMETRY_NODE = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parent Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK__PARENT_INSTANCE = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sub System Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK__SUB_SYSTEM_INSTANCE = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Assembly Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Assembly Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINK_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.AssemblyLinksListImpl <em>Assembly Links List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.AssemblyLinksListImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getAssemblyLinksList()
	 * @generated
	 */
	int ASSEMBLY_LINKS_LIST = 9;

	/**
	 * The feature id for the '<em><b>Assembly Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINKS_LIST__ASSEMBLY_LINKS = 0;

	/**
	 * The number of structural features of the '<em>Assembly Links List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINKS_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Assembly Links List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_LINKS_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.PoseProviderImpl <em>Pose Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.PoseProviderImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getPoseProvider()
	 * @generated
	 */
	int POSE_PROVIDER = 10;

	/**
	 * The feature id for the '<em><b>Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_PROVIDER__POSE_TRANSFORM = 0;

	/**
	 * The number of structural features of the '<em>Pose Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_PROVIDER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Pose Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.AbsolutePoseProviderImpl <em>Absolute Pose Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.AbsolutePoseProviderImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getAbsolutePoseProvider()
	 * @generated
	 */
	int ABSOLUTE_POSE_PROVIDER = 11;

	/**
	 * The feature id for the '<em><b>Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_POSE_PROVIDER__POSE_TRANSFORM = POSE_PROVIDER__POSE_TRANSFORM;

	/**
	 * The number of structural features of the '<em>Absolute Pose Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_POSE_PROVIDER_FEATURE_COUNT = POSE_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Absolute Pose Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_POSE_PROVIDER_OPERATION_COUNT = POSE_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.PoseCorrectorImpl <em>Pose Corrector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.PoseCorrectorImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getPoseCorrector()
	 * @generated
	 */
	int POSE_CORRECTOR = 12;

	/**
	 * The feature id for the '<em><b>Apogy System Api Adapter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_CORRECTOR__APOGY_SYSTEM_API_ADAPTER = 0;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_CORRECTOR__ENABLED = 1;

	/**
	 * The number of structural features of the '<em>Pose Corrector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_CORRECTOR_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Apply Correction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_CORRECTOR___APPLY_CORRECTION__MATRIX4X4 = 0;

	/**
	 * The number of operations of the '<em>Pose Corrector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_CORRECTOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.ApogyInitializationDataImpl <em>Apogy Initialization Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyInitializationDataImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getApogyInitializationData()
	 * @generated
	 */
	int APOGY_INITIALIZATION_DATA = 13;

	/**
	 * The feature id for the '<em><b>Initial Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_INITIALIZATION_DATA__INITIAL_POSE_TRANSFORM = ApogyCoreInvocatorPackage.INITIALIZATION_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Apogy Initialization Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_INITIALIZATION_DATA_FEATURE_COUNT = ApogyCoreInvocatorPackage.INITIALIZATION_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Apogy Initialization Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_INITIALIZATION_DATA_OPERATION_COUNT = ApogyCoreInvocatorPackage.INITIALIZATION_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.WorksitesListImpl <em>Worksites List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.WorksitesListImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getWorksitesList()
	 * @generated
	 */
	int WORKSITES_LIST = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITES_LIST__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITES_LIST__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Worksites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITES_LIST__WORKSITES = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Orbits Models Lists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITES_LIST__ORBITS_MODELS_LISTS = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Surface Locations Lists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITES_LIST__SURFACE_LOCATIONS_LISTS = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Worksites List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITES_LIST_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Worksites List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITES_LIST_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.AbstractWorksiteImpl <em>Abstract Worksite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.AbstractWorksiteImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getAbstractWorksite()
	 * @generated
	 */
	int ABSTRACT_WORKSITE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORKSITE__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORKSITE__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORKSITE__TIME = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Worksites List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORKSITE__WORKSITES_LIST = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Worksite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORKSITE_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Abstract Worksite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORKSITE_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.AbstractSurfaceLocationImpl <em>Abstract Surface Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.AbstractSurfaceLocationImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getAbstractSurfaceLocation()
	 * @generated
	 */
	int ABSTRACT_SURFACE_LOCATION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_LOCATION__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_LOCATION__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Surface Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_LOCATION_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Surface Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_LOCATION_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.SurfaceLocationsListImpl <em>Surface Locations List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.SurfaceLocationsListImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getSurfaceLocationsList()
	 * @generated
	 */
	int SURFACE_LOCATIONS_LIST = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_LOCATIONS_LIST__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_LOCATIONS_LIST__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Surface Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_LOCATIONS_LIST__SURFACE_LOCATIONS = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Surface Locations List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_LOCATIONS_LIST_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Surface Locations List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_LOCATIONS_LIST_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.OrbitModelsListImpl <em>Orbit Models List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.OrbitModelsListImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getOrbitModelsList()
	 * @generated
	 */
	int ORBIT_MODELS_LIST = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODELS_LIST__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODELS_LIST__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Orbit Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODELS_LIST__ORBIT_MODELS = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Orbit Models List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODELS_LIST_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Orbit Models List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODELS_LIST_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.AbstractOrbitModelImpl <em>Abstract Orbit Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.AbstractOrbitModelImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getAbstractOrbitModel()
	 * @generated
	 */
	int ABSTRACT_ORBIT_MODEL = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_MODEL__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_MODEL__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Orbit Models List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_MODEL__ORBIT_MODELS_LIST = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Orbit Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_MODEL_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Orbit Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_MODEL_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.PositionedImpl <em>Positioned</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.PositionedImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getPositioned()
	 * @generated
	 */
	int POSITIONED = 20;

	/**
	 * The feature id for the '<em><b>Pose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED__POSE = 0;

	/**
	 * The number of structural features of the '<em>Positioned</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Positioned</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.TopologyRootImpl <em>Topology Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.TopologyRootImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getTopologyRoot()
	 * @generated
	 */
	int TOPOLOGY_ROOT = 23;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.FeatureOfInterestListImpl <em>Feature Of Interest List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.FeatureOfInterestListImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getFeatureOfInterestList()
	 * @generated
	 */
	int FEATURE_OF_INTEREST_LIST = 22;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.FeatureOfInterestImpl <em>Feature Of Interest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.FeatureOfInterestImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getFeatureOfInterest()
	 * @generated
	 */
	int FEATURE_OF_INTEREST = 21;

	/**
	 * The feature id for the '<em><b>Pose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST__POSE = POSITIONED__POSE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST__NAME = POSITIONED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST__DESCRIPTION = POSITIONED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Of Interest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_FEATURE_COUNT = POSITIONED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Feature Of Interest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_OPERATION_COUNT = POSITIONED_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features Of Interest</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST__FEATURES_OF_INTEREST = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Of Interest List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Feature Of Interest List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Origin Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_ROOT__ORIGIN_NODE = 0;

	/**
	 * The number of structural features of the '<em>Topology Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_ROOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Topology Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.PositionedResultImpl <em>Positioned Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.PositionedResultImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getPositionedResult()
	 * @generated
	 */
	int POSITIONED_RESULT = 24;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RESULT__TIME = ApogyCoreInvocatorPackage.ABSTRACT_RESULT__TIME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RESULT__DESCRIPTION = ApogyCoreInvocatorPackage.ABSTRACT_RESULT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Results List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RESULT__RESULTS_LIST = ApogyCoreInvocatorPackage.ABSTRACT_RESULT__RESULTS_LIST;

	/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RESULT__INVOCATOR_SESSION = ApogyCoreInvocatorPackage.ABSTRACT_RESULT__INVOCATOR_SESSION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RESULT__CONTEXT = ApogyCoreInvocatorPackage.ABSTRACT_RESULT__CONTEXT;

	/**
	 * The feature id for the '<em><b>Result Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RESULT__RESULT_VALUE = ApogyCoreInvocatorPackage.ABSTRACT_RESULT__RESULT_VALUE;

	/**
	 * The feature id for the '<em><b>Pose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RESULT__POSE = ApogyCoreInvocatorPackage.ABSTRACT_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Positioned Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RESULT_FEATURE_COUNT = ApogyCoreInvocatorPackage.ABSTRACT_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Positioned Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_RESULT_OPERATION_COUNT = ApogyCoreInvocatorPackage.ABSTRACT_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.OperationCallPositionedResultImpl <em>Operation Call Positioned Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.OperationCallPositionedResultImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getOperationCallPositionedResult()
	 * @generated
	 */
	int OPERATION_CALL_POSITIONED_RESULT = 25;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__TIME = ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT__TIME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__DESCRIPTION = ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Results List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__RESULTS_LIST = ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT__RESULTS_LIST;

	/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__INVOCATOR_SESSION = ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT__INVOCATOR_SESSION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__CONTEXT = ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT__CONTEXT;

	/**
	 * The feature id for the '<em><b>Result Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__RESULT_VALUE = ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT__RESULT_VALUE;

	/**
	 * The feature id for the '<em><b>Operation Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__OPERATION_CALLS = ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT__OPERATION_CALLS;

	/**
	 * The feature id for the '<em><b>Operation Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__OPERATION_CALL = ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT__OPERATION_CALL;

	/**
	 * The feature id for the '<em><b>Exception Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__EXCEPTION_CONTAINER = ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT__EXCEPTION_CONTAINER;

	/**
	 * The feature id for the '<em><b>Pose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__POSE = ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relative Pose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT__RELATIVE_POSE = ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation Call Positioned Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT_FEATURE_COUNT = ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Invocator Session</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT___GET_INVOCATOR_SESSION = ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT___GET_INVOCATOR_SESSION;

	/**
	 * The number of operations of the '<em>Operation Call Positioned Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_POSITIONED_RESULT_OPERATION_COUNT = ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.UserDefinedResultImpl <em>User Defined Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.UserDefinedResultImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getUserDefinedResult()
	 * @generated
	 */
	int USER_DEFINED_RESULT = 26;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_RESULT__TIME = POSITIONED_RESULT__TIME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_RESULT__DESCRIPTION = POSITIONED_RESULT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Results List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_RESULT__RESULTS_LIST = POSITIONED_RESULT__RESULTS_LIST;

	/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_RESULT__INVOCATOR_SESSION = POSITIONED_RESULT__INVOCATOR_SESSION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_RESULT__CONTEXT = POSITIONED_RESULT__CONTEXT;

	/**
	 * The feature id for the '<em><b>Result Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_RESULT__RESULT_VALUE = POSITIONED_RESULT__RESULT_VALUE;

	/**
	 * The feature id for the '<em><b>Pose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_RESULT__POSE = POSITIONED_RESULT__POSE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_RESULT__NAME = POSITIONED_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>User Defined Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_RESULT_FEATURE_COUNT = POSITIONED_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>User Defined Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_RESULT_OPERATION_COUNT = POSITIONED_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.ResultNodeImpl <em>Result Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.ResultNodeImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getResultNode()
	 * @generated
	 */
	int RESULT_NODE = 27;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE__PARENT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE__DESCRIPTION = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE__NODE_ID = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE__CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE__AGGREGATED_CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE__RESULT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Result Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE_FEATURE_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Result Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE_OPERATION_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.ResultsListNodeImpl <em>Results List Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.ResultsListNodeImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getResultsListNode()
	 * @generated
	 */
	int RESULTS_LIST_NODE = 28;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST_NODE__PARENT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST_NODE__DESCRIPTION = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST_NODE__NODE_ID = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST_NODE__CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST_NODE__AGGREGATED_CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Results List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST_NODE__RESULTS_LIST = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Results List Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST_NODE_FEATURE_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST_NODE___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Results List Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST_NODE_OPERATION_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.FeatureOfInterestNodeImpl <em>Feature Of Interest Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.FeatureOfInterestNodeImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getFeatureOfInterestNode()
	 * @generated
	 */
	int FEATURE_OF_INTEREST_NODE = 29;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE__PARENT = ApogyCommonTopologyPackage.TRANSFORM_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE__DESCRIPTION = ApogyCommonTopologyPackage.TRANSFORM_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE__NODE_ID = ApogyCommonTopologyPackage.TRANSFORM_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE__CHILDREN = ApogyCommonTopologyPackage.TRANSFORM_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE__AGGREGATED_CHILDREN = ApogyCommonTopologyPackage.TRANSFORM_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE__POSITION = ApogyCommonTopologyPackage.TRANSFORM_NODE__POSITION;

	/**
	 * The feature id for the '<em><b>Rotation Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE__ROTATION_MATRIX = ApogyCommonTopologyPackage.TRANSFORM_NODE__ROTATION_MATRIX;

	/**
	 * The feature id for the '<em><b>Feature Of Interest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE__FEATURE_OF_INTEREST = ApogyCommonTopologyPackage.TRANSFORM_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Of Interest Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_FEATURE_COUNT = ApogyCommonTopologyPackage.TRANSFORM_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.TRANSFORM_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>As Matrix4d</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE___AS_MATRIX4D = ApogyCommonTopologyPackage.TRANSFORM_NODE___AS_MATRIX4D;

	/**
	 * The operation id for the '<em>Set Transformation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE___SET_TRANSFORMATION__MATRIX4D = ApogyCommonTopologyPackage.TRANSFORM_NODE___SET_TRANSFORMATION__MATRIX4D;

	/**
	 * The number of operations of the '<em>Feature Of Interest Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_OPERATION_COUNT = ApogyCommonTopologyPackage.TRANSFORM_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.FeatureOfInterestListNodeImpl <em>Feature Of Interest List Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.FeatureOfInterestListNodeImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getFeatureOfInterestListNode()
	 * @generated
	 */
	int FEATURE_OF_INTEREST_LIST_NODE = 30;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_NODE__PARENT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_NODE__DESCRIPTION = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_NODE__NODE_ID = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_NODE__CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_NODE__AGGREGATED_CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Feature Of Interest List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_NODE__FEATURE_OF_INTEREST_LIST = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Of Interest List Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_NODE_FEATURE_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_NODE___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Feature Of Interest List Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_LIST_NODE_OPERATION_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.impl.UpdatableImpl <em>Updatable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.impl.UpdatableImpl
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getUpdatable()
	 * @generated
	 */
	int UPDATABLE = 31;

	/**
	 * The feature id for the '<em><b>Updating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATABLE__UPDATING = 0;

	/**
	 * The feature id for the '<em><b>Auto Update Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATABLE__AUTO_UPDATE_ENABLED = 1;

	/**
	 * The number of structural features of the '<em>Updatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATABLE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Default Auto Update Enabled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATABLE___GET_DEFAULT_AUTO_UPDATE_ENABLED = 0;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATABLE___UPDATE = 1;

	/**
	 * The number of operations of the '<em>Updatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATABLE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '<em>Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getMap()
	 * @generated
	 */
	int MAP = 32;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getList()
	 * @generated
	 */
	int LIST = 33;


	/**
	 * The meta object id for the '<em>Collection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Collection
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 34;


	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 35;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.ApogyCoreFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ApogyCoreFacade
	 * @generated
	 */
	EClass getApogyCoreFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.ApogyCoreFacade#computeAbsolutePoseMatrix(ca.gc.asc_csa.apogy.core.ApogySystem, ca.gc.asc_csa.apogy.common.math.Matrix4x4) <em>Compute Absolute Pose Matrix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Absolute Pose Matrix</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.ApogyCoreFacade#computeAbsolutePoseMatrix(ca.gc.asc_csa.apogy.core.ApogySystem, ca.gc.asc_csa.apogy.common.math.Matrix4x4)
	 * @generated
	 */
	EOperation getApogyCoreFacade__ComputeAbsolutePoseMatrix__ApogySystem_Matrix4x4();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.ApogyCoreFacade#createResultNode(ca.gc.asc_csa.apogy.core.PositionedResult) <em>Create Result Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Result Node</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.ApogyCoreFacade#createResultNode(ca.gc.asc_csa.apogy.core.PositionedResult)
	 * @generated
	 */
	EOperation getApogyCoreFacade__CreateResultNode__PositionedResult();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.ApogyCoreFacade#createApogySession(boolean, boolean, boolean, boolean) <em>Create Apogy Session</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Apogy Session</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.ApogyCoreFacade#createApogySession(boolean, boolean, boolean, boolean)
	 * @generated
	 */
	EOperation getApogyCoreFacade__CreateApogySession__boolean_boolean_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.ApogyCoreFacade#getApogySystem(ca.gc.asc_csa.apogy.core.invocator.Environment, java.lang.String) <em>Get Apogy System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Apogy System</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.ApogyCoreFacade#getApogySystem(ca.gc.asc_csa.apogy.core.invocator.Environment, java.lang.String)
	 * @generated
	 */
	EOperation getApogyCoreFacade__GetApogySystem__Environment_String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.ApogyCoreFacade#loadFeatureOfInterestFromFile(java.lang.String) <em>Load Feature Of Interest From File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Feature Of Interest From File</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.ApogyCoreFacade#loadFeatureOfInterestFromFile(java.lang.String)
	 * @generated
	 */
	EOperation getApogyCoreFacade__LoadFeatureOfInterestFromFile__String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.ApogyCoreFacade#saveFeatureOfInterestToFile(java.lang.String, java.util.List) <em>Save Feature Of Interest To File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save Feature Of Interest To File</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.ApogyCoreFacade#saveFeatureOfInterestToFile(java.lang.String, java.util.List)
	 * @generated
	 */
	EOperation getApogyCoreFacade__SaveFeatureOfInterestToFile__String_List();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.ApogyEnvironment <em>Apogy Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apogy Environment</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ApogyEnvironment
	 * @generated
	 */
	EClass getApogyEnvironment();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.ApogyEnvironment#getWorksitesList <em>Worksites List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Worksites List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ApogyEnvironment#getWorksitesList()
	 * @see #getApogyEnvironment()
	 * @generated
	 */
	EReference getApogyEnvironment_WorksitesList();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.ApogyEnvironment#getActiveWorksite <em>Active Worksite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Worksite</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ApogyEnvironment#getActiveWorksite()
	 * @see #getApogyEnvironment()
	 * @generated
	 */
	EReference getApogyEnvironment_ActiveWorksite();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.ApogyEnvironment#getApogyTopology <em>Apogy Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Apogy Topology</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ApogyEnvironment#getApogyTopology()
	 * @see #getApogyEnvironment()
	 * @generated
	 */
	EReference getApogyEnvironment_ApogyTopology();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.ApogyEnvironment#getTimeSourcesList <em>Time Sources List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Sources List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ApogyEnvironment#getTimeSourcesList()
	 * @see #getApogyEnvironment()
	 * @generated
	 */
	EReference getApogyEnvironment_TimeSourcesList();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.ApogyEnvironment#getActiveTimeSource <em>Active Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Time Source</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ApogyEnvironment#getActiveTimeSource()
	 * @see #getApogyEnvironment()
	 * @generated
	 */
	EReference getApogyEnvironment_ActiveTimeSource();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.TimeSourcesList <em>Time Sources List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Sources List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.TimeSourcesList
	 * @generated
	 */
	EClass getTimeSourcesList();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.TimeSourcesList#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Environment</em>'.
	 * @see ca.gc.asc_csa.apogy.core.TimeSourcesList#getEnvironment()
	 * @see #getTimeSourcesList()
	 * @generated
	 */
	EReference getTimeSourcesList_Environment();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.TimeSourcesList#getTimeSources <em>Time Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Sources</em>'.
	 * @see ca.gc.asc_csa.apogy.core.TimeSourcesList#getTimeSources()
	 * @see #getTimeSourcesList()
	 * @generated
	 */
	EReference getTimeSourcesList_TimeSources();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.ApogyTopology <em>Apogy Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apogy Topology</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ApogyTopology
	 * @generated
	 */
	EClass getApogyTopology();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.ApogyTopology#getRootNode <em>Root Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ApogyTopology#getRootNode()
	 * @see #getApogyTopology()
	 * @generated
	 */
	EReference getApogyTopology_RootNode();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.ApogySystem <em>Apogy System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apogy System</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ApogySystem
	 * @generated
	 */
	EClass getApogySystem();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.ApogySystem#getTopologyRoot <em>Topology Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Topology Root</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ApogySystem#getTopologyRoot()
	 * @see #getApogySystem()
	 * @generated
	 */
	EReference getApogySystem_TopologyRoot();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.ApogySystem#getBindingSet <em>Binding Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding Set</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ApogySystem#getBindingSet()
	 * @see #getApogySystem()
	 * @generated
	 */
	EReference getApogySystem_BindingSet();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.ApogySystem#getConnectionPointsList <em>Connection Points List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Points List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ApogySystem#getConnectionPointsList()
	 * @see #getApogySystem()
	 * @generated
	 */
	EReference getApogySystem_ConnectionPointsList();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.ApogySystem#getAssemblyLinksList <em>Assembly Links List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assembly Links List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ApogySystem#getAssemblyLinksList()
	 * @see #getApogySystem()
	 * @generated
	 */
	EReference getApogySystem_AssemblyLinksList();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.ApogySystem#getPoseProvider <em>Pose Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pose Provider</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ApogySystem#getPoseProvider()
	 * @see #getApogySystem()
	 * @generated
	 */
	EReference getApogySystem_PoseProvider();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.ApogySystem#getPoseProviderInstance <em>Pose Provider Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pose Provider Instance</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ApogySystem#getPoseProviderInstance()
	 * @see #getApogySystem()
	 * @generated
	 */
	EReference getApogySystem_PoseProviderInstance();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.ApogySystemApiAdapter <em>Apogy System Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apogy System Api Adapter</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ApogySystemApiAdapter
	 * @generated
	 */
	EClass getApogySystemApiAdapter();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.ApogySystemApiAdapter#getPoseCorrector <em>Pose Corrector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pose Corrector</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ApogySystemApiAdapter#getPoseCorrector()
	 * @see #getApogySystemApiAdapter()
	 * @generated
	 */
	EReference getApogySystemApiAdapter_PoseCorrector();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.ApogySystemApiAdapter#getApogySystem <em>Apogy System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Apogy System</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ApogySystemApiAdapter#getApogySystem()
	 * @see #getApogySystemApiAdapter()
	 * @generated
	 */
	EReference getApogySystemApiAdapter_ApogySystem();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.ApogySystemApiAdapter#createResultMatrix(ca.gc.asc_csa.apogy.core.invocator.OperationCall) <em>Create Result Matrix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Result Matrix</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.ApogySystemApiAdapter#createResultMatrix(ca.gc.asc_csa.apogy.core.invocator.OperationCall)
	 * @generated
	 */
	EOperation getApogySystemApiAdapter__CreateResultMatrix__OperationCall();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.ConnectionPointsList <em>Connection Points List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Points List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ConnectionPointsList
	 * @generated
	 */
	EClass getConnectionPointsList();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.ConnectionPointsList#getApogySystem <em>Apogy System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Apogy System</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ConnectionPointsList#getApogySystem()
	 * @see #getConnectionPointsList()
	 * @generated
	 */
	EReference getConnectionPointsList_ApogySystem();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.ConnectionPointsList#getConnectionPoints <em>Connection Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Points</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ConnectionPointsList#getConnectionPoints()
	 * @see #getConnectionPointsList()
	 * @generated
	 */
	EReference getConnectionPointsList_ConnectionPoints();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.ConnectionPoint <em>Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Point</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ConnectionPoint
	 * @generated
	 */
	EClass getConnectionPoint();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.ConnectionPoint#getPointsList <em>Points List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Points List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ConnectionPoint#getPointsList()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EReference getConnectionPoint_PointsList();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.ConnectionPoint#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ConnectionPoint#getNode()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EReference getConnectionPoint_Node();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.AssemblyLink <em>Assembly Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Link</em>'.
	 * @see ca.gc.asc_csa.apogy.core.AssemblyLink
	 * @generated
	 */
	EClass getAssemblyLink();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.AssemblyLink#getParentTypeMember <em>Parent Type Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Member</em>'.
	 * @see ca.gc.asc_csa.apogy.core.AssemblyLink#getParentTypeMember()
	 * @see #getAssemblyLink()
	 * @generated
	 */
	EReference getAssemblyLink_ParentTypeMember();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.AssemblyLink#getSubSystemTypeMember <em>Sub System Type Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub System Type Member</em>'.
	 * @see ca.gc.asc_csa.apogy.core.AssemblyLink#getSubSystemTypeMember()
	 * @see #getAssemblyLink()
	 * @generated
	 */
	EReference getAssemblyLink_SubSystemTypeMember();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.AssemblyLink#getParentConnectionPoint <em>Parent Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Connection Point</em>'.
	 * @see ca.gc.asc_csa.apogy.core.AssemblyLink#getParentConnectionPoint()
	 * @see #getAssemblyLink()
	 * @generated
	 */
	EReference getAssemblyLink_ParentConnectionPoint();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.AssemblyLink#getTransformationMatrix <em>Transformation Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation Matrix</em>'.
	 * @see ca.gc.asc_csa.apogy.core.AssemblyLink#getTransformationMatrix()
	 * @see #getAssemblyLink()
	 * @generated
	 */
	EReference getAssemblyLink_TransformationMatrix();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.AssemblyLink#getGeometryNode <em>Geometry Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geometry Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.AssemblyLink#getGeometryNode()
	 * @see #getAssemblyLink()
	 * @generated
	 */
	EReference getAssemblyLink_GeometryNode();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.AssemblyLink#getParentInstance <em>Parent Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Instance</em>'.
	 * @see ca.gc.asc_csa.apogy.core.AssemblyLink#getParentInstance()
	 * @see #getAssemblyLink()
	 * @generated
	 */
	EReference getAssemblyLink_ParentInstance();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.AssemblyLink#getSubSystemInstance <em>Sub System Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub System Instance</em>'.
	 * @see ca.gc.asc_csa.apogy.core.AssemblyLink#getSubSystemInstance()
	 * @see #getAssemblyLink()
	 * @generated
	 */
	EReference getAssemblyLink_SubSystemInstance();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.AssemblyLinksList <em>Assembly Links List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Links List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.AssemblyLinksList
	 * @generated
	 */
	EClass getAssemblyLinksList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.AssemblyLinksList#getAssemblyLinks <em>Assembly Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assembly Links</em>'.
	 * @see ca.gc.asc_csa.apogy.core.AssemblyLinksList#getAssemblyLinks()
	 * @see #getAssemblyLinksList()
	 * @generated
	 */
	EReference getAssemblyLinksList_AssemblyLinks();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.PoseProvider <em>Pose Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pose Provider</em>'.
	 * @see ca.gc.asc_csa.apogy.core.PoseProvider
	 * @generated
	 */
	EClass getPoseProvider();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.PoseProvider#getPoseTransform <em>Pose Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pose Transform</em>'.
	 * @see ca.gc.asc_csa.apogy.core.PoseProvider#getPoseTransform()
	 * @see #getPoseProvider()
	 * @generated
	 */
	EReference getPoseProvider_PoseTransform();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.AbsolutePoseProvider <em>Absolute Pose Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute Pose Provider</em>'.
	 * @see ca.gc.asc_csa.apogy.core.AbsolutePoseProvider
	 * @generated
	 */
	EClass getAbsolutePoseProvider();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.PoseCorrector <em>Pose Corrector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pose Corrector</em>'.
	 * @see ca.gc.asc_csa.apogy.core.PoseCorrector
	 * @generated
	 */
	EClass getPoseCorrector();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.PoseCorrector#getApogySystemApiAdapter <em>Apogy System Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Apogy System Api Adapter</em>'.
	 * @see ca.gc.asc_csa.apogy.core.PoseCorrector#getApogySystemApiAdapter()
	 * @see #getPoseCorrector()
	 * @generated
	 */
	EReference getPoseCorrector_ApogySystemApiAdapter();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.PoseCorrector#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see ca.gc.asc_csa.apogy.core.PoseCorrector#isEnabled()
	 * @see #getPoseCorrector()
	 * @generated
	 */
	EAttribute getPoseCorrector_Enabled();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.PoseCorrector#applyCorrection(ca.gc.asc_csa.apogy.common.math.Matrix4x4) <em>Apply Correction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Correction</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.PoseCorrector#applyCorrection(ca.gc.asc_csa.apogy.common.math.Matrix4x4)
	 * @generated
	 */
	EOperation getPoseCorrector__ApplyCorrection__Matrix4x4();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.ApogyInitializationData <em>Apogy Initialization Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apogy Initialization Data</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ApogyInitializationData
	 * @generated
	 */
	EClass getApogyInitializationData();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.ApogyInitializationData#getInitialPoseTransform <em>Initial Pose Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Pose Transform</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ApogyInitializationData#getInitialPoseTransform()
	 * @see #getApogyInitializationData()
	 * @generated
	 */
	EReference getApogyInitializationData_InitialPoseTransform();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.WorksitesList <em>Worksites List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Worksites List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.WorksitesList
	 * @generated
	 */
	EClass getWorksitesList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.WorksitesList#getWorksites <em>Worksites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Worksites</em>'.
	 * @see ca.gc.asc_csa.apogy.core.WorksitesList#getWorksites()
	 * @see #getWorksitesList()
	 * @generated
	 */
	EReference getWorksitesList_Worksites();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.WorksitesList#getOrbitsModelsLists <em>Orbits Models Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orbits Models Lists</em>'.
	 * @see ca.gc.asc_csa.apogy.core.WorksitesList#getOrbitsModelsLists()
	 * @see #getWorksitesList()
	 * @generated
	 */
	EReference getWorksitesList_OrbitsModelsLists();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.WorksitesList#getSurfaceLocationsLists <em>Surface Locations Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Surface Locations Lists</em>'.
	 * @see ca.gc.asc_csa.apogy.core.WorksitesList#getSurfaceLocationsLists()
	 * @see #getWorksitesList()
	 * @generated
	 */
	EReference getWorksitesList_SurfaceLocationsLists();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.AbstractWorksite <em>Abstract Worksite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Worksite</em>'.
	 * @see ca.gc.asc_csa.apogy.core.AbstractWorksite
	 * @generated
	 */
	EClass getAbstractWorksite();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.AbstractWorksite#getWorksitesList <em>Worksites List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Worksites List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.AbstractWorksite#getWorksitesList()
	 * @see #getAbstractWorksite()
	 * @generated
	 */
	EReference getAbstractWorksite_WorksitesList();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.AbstractSurfaceLocation <em>Abstract Surface Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Surface Location</em>'.
	 * @see ca.gc.asc_csa.apogy.core.AbstractSurfaceLocation
	 * @generated
	 */
	EClass getAbstractSurfaceLocation();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.SurfaceLocationsList <em>Surface Locations List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surface Locations List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.SurfaceLocationsList
	 * @generated
	 */
	EClass getSurfaceLocationsList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.SurfaceLocationsList#getSurfaceLocations <em>Surface Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Surface Locations</em>'.
	 * @see ca.gc.asc_csa.apogy.core.SurfaceLocationsList#getSurfaceLocations()
	 * @see #getSurfaceLocationsList()
	 * @generated
	 */
	EReference getSurfaceLocationsList_SurfaceLocations();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.OrbitModelsList <em>Orbit Models List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orbit Models List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.OrbitModelsList
	 * @generated
	 */
	EClass getOrbitModelsList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.OrbitModelsList#getOrbitModels <em>Orbit Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orbit Models</em>'.
	 * @see ca.gc.asc_csa.apogy.core.OrbitModelsList#getOrbitModels()
	 * @see #getOrbitModelsList()
	 * @generated
	 */
	EReference getOrbitModelsList_OrbitModels();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.AbstractOrbitModel <em>Abstract Orbit Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Orbit Model</em>'.
	 * @see ca.gc.asc_csa.apogy.core.AbstractOrbitModel
	 * @generated
	 */
	EClass getAbstractOrbitModel();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.AbstractOrbitModel#getOrbitModelsList <em>Orbit Models List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Orbit Models List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.AbstractOrbitModel#getOrbitModelsList()
	 * @see #getAbstractOrbitModel()
	 * @generated
	 */
	EReference getAbstractOrbitModel_OrbitModelsList();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.Positioned <em>Positioned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positioned</em>'.
	 * @see ca.gc.asc_csa.apogy.core.Positioned
	 * @generated
	 */
	EClass getPositioned();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.Positioned#getPose <em>Pose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pose</em>'.
	 * @see ca.gc.asc_csa.apogy.core.Positioned#getPose()
	 * @see #getPositioned()
	 * @generated
	 */
	EReference getPositioned_Pose();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.TopologyRoot <em>Topology Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topology Root</em>'.
	 * @see ca.gc.asc_csa.apogy.core.TopologyRoot
	 * @generated
	 */
	EClass getTopologyRoot();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.TopologyRoot#getOriginNode <em>Origin Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Origin Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.TopologyRoot#getOriginNode()
	 * @see #getTopologyRoot()
	 * @generated
	 */
	EReference getTopologyRoot_OriginNode();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.FeatureOfInterestList <em>Feature Of Interest List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Of Interest List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.FeatureOfInterestList
	 * @generated
	 */
	EClass getFeatureOfInterestList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.FeatureOfInterestList#getFeaturesOfInterest <em>Features Of Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features Of Interest</em>'.
	 * @see ca.gc.asc_csa.apogy.core.FeatureOfInterestList#getFeaturesOfInterest()
	 * @see #getFeatureOfInterestList()
	 * @generated
	 */
	EReference getFeatureOfInterestList_FeaturesOfInterest();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.FeatureOfInterest <em>Feature Of Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Of Interest</em>'.
	 * @see ca.gc.asc_csa.apogy.core.FeatureOfInterest
	 * @generated
	 */
	EClass getFeatureOfInterest();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.PositionedResult <em>Positioned Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positioned Result</em>'.
	 * @see ca.gc.asc_csa.apogy.core.PositionedResult
	 * @generated
	 */
	EClass getPositionedResult();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.OperationCallPositionedResult <em>Operation Call Positioned Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Call Positioned Result</em>'.
	 * @see ca.gc.asc_csa.apogy.core.OperationCallPositionedResult
	 * @generated
	 */
	EClass getOperationCallPositionedResult();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.OperationCallPositionedResult#getRelativePose <em>Relative Pose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relative Pose</em>'.
	 * @see ca.gc.asc_csa.apogy.core.OperationCallPositionedResult#getRelativePose()
	 * @see #getOperationCallPositionedResult()
	 * @generated
	 */
	EReference getOperationCallPositionedResult_RelativePose();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.UserDefinedResult <em>User Defined Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Defined Result</em>'.
	 * @see ca.gc.asc_csa.apogy.core.UserDefinedResult
	 * @generated
	 */
	EClass getUserDefinedResult();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.ResultNode <em>Result Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ResultNode
	 * @generated
	 */
	EClass getResultNode();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.ResultNode#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ResultNode#getResult()
	 * @see #getResultNode()
	 * @generated
	 */
	EReference getResultNode_Result();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.ResultsListNode <em>Results List Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Results List Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ResultsListNode
	 * @generated
	 */
	EClass getResultsListNode();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.ResultsListNode#getResultsList <em>Results List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Results List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ResultsListNode#getResultsList()
	 * @see #getResultsListNode()
	 * @generated
	 */
	EReference getResultsListNode_ResultsList();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.FeatureOfInterestNode <em>Feature Of Interest Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Of Interest Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.FeatureOfInterestNode
	 * @generated
	 */
	EClass getFeatureOfInterestNode();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.FeatureOfInterestNode#getFeatureOfInterest <em>Feature Of Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature Of Interest</em>'.
	 * @see ca.gc.asc_csa.apogy.core.FeatureOfInterestNode#getFeatureOfInterest()
	 * @see #getFeatureOfInterestNode()
	 * @generated
	 */
	EReference getFeatureOfInterestNode_FeatureOfInterest();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.FeatureOfInterestListNode <em>Feature Of Interest List Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Of Interest List Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.FeatureOfInterestListNode
	 * @generated
	 */
	EClass getFeatureOfInterestListNode();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.FeatureOfInterestListNode#getFeatureOfInterestList <em>Feature Of Interest List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature Of Interest List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.FeatureOfInterestListNode#getFeatureOfInterestList()
	 * @see #getFeatureOfInterestListNode()
	 * @generated
	 */
	EReference getFeatureOfInterestListNode_FeatureOfInterestList();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.Updatable <em>Updatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Updatable</em>'.
	 * @see ca.gc.asc_csa.apogy.core.Updatable
	 * @generated
	 */
	EClass getUpdatable();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.Updatable#isUpdating <em>Updating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updating</em>'.
	 * @see ca.gc.asc_csa.apogy.core.Updatable#isUpdating()
	 * @see #getUpdatable()
	 * @generated
	 */
	EAttribute getUpdatable_Updating();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.Updatable#isAutoUpdateEnabled <em>Auto Update Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Update Enabled</em>'.
	 * @see ca.gc.asc_csa.apogy.core.Updatable#isAutoUpdateEnabled()
	 * @see #getUpdatable()
	 * @generated
	 */
	EAttribute getUpdatable_AutoUpdateEnabled();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.Updatable#getDefaultAutoUpdateEnabled() <em>Get Default Auto Update Enabled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Auto Update Enabled</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.Updatable#getDefaultAutoUpdateEnabled()
	 * @generated
	 */
	EOperation getUpdatable__GetDefaultAutoUpdateEnabled();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.Updatable#update() <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.Updatable#update()
	 * @generated
	 */
	EOperation getUpdatable__Update();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map" typeParameters="K V"
	 * @generated
	 */
	EDataType getMap();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List" typeParameters="T"
	 * @generated
	 */
	EDataType getList();

	/**
	 * Returns the meta object for data type '{@link java.util.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Collection</em>'.
	 * @see java.util.Collection
	 * @model instanceClass="java.util.Collection" typeParameters="T"
	 * @generated
	 */
	EDataType getCollection();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCoreFactory getApogyCoreFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.ApogyCoreFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCoreFacadeImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getApogyCoreFacade()
		 * @generated
		 */
		EClass APOGY_CORE_FACADE = eINSTANCE.getApogyCoreFacade();

		/**
		 * The meta object literal for the '<em><b>Compute Absolute Pose Matrix</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_FACADE___COMPUTE_ABSOLUTE_POSE_MATRIX__APOGYSYSTEM_MATRIX4X4 = eINSTANCE.getApogyCoreFacade__ComputeAbsolutePoseMatrix__ApogySystem_Matrix4x4();

		/**
		 * The meta object literal for the '<em><b>Create Result Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_FACADE___CREATE_RESULT_NODE__POSITIONEDRESULT = eINSTANCE.getApogyCoreFacade__CreateResultNode__PositionedResult();

		/**
		 * The meta object literal for the '<em><b>Create Apogy Session</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_FACADE___CREATE_APOGY_SESSION__BOOLEAN_BOOLEAN_BOOLEAN_BOOLEAN = eINSTANCE.getApogyCoreFacade__CreateApogySession__boolean_boolean_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Get Apogy System</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_FACADE___GET_APOGY_SYSTEM__ENVIRONMENT_STRING = eINSTANCE.getApogyCoreFacade__GetApogySystem__Environment_String();

		/**
		 * The meta object literal for the '<em><b>Load Feature Of Interest From File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_FACADE___LOAD_FEATURE_OF_INTEREST_FROM_FILE__STRING = eINSTANCE.getApogyCoreFacade__LoadFeatureOfInterestFromFile__String();

		/**
		 * The meta object literal for the '<em><b>Save Feature Of Interest To File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_FACADE___SAVE_FEATURE_OF_INTEREST_TO_FILE__STRING_LIST = eINSTANCE.getApogyCoreFacade__SaveFeatureOfInterestToFile__String_List();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.ApogyEnvironmentImpl <em>Apogy Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyEnvironmentImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getApogyEnvironment()
		 * @generated
		 */
		EClass APOGY_ENVIRONMENT = eINSTANCE.getApogyEnvironment();

		/**
		 * The meta object literal for the '<em><b>Worksites List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APOGY_ENVIRONMENT__WORKSITES_LIST = eINSTANCE.getApogyEnvironment_WorksitesList();

		/**
		 * The meta object literal for the '<em><b>Active Worksite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APOGY_ENVIRONMENT__ACTIVE_WORKSITE = eINSTANCE.getApogyEnvironment_ActiveWorksite();

		/**
		 * The meta object literal for the '<em><b>Apogy Topology</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APOGY_ENVIRONMENT__APOGY_TOPOLOGY = eINSTANCE.getApogyEnvironment_ApogyTopology();

		/**
		 * The meta object literal for the '<em><b>Time Sources List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APOGY_ENVIRONMENT__TIME_SOURCES_LIST = eINSTANCE.getApogyEnvironment_TimeSourcesList();

		/**
		 * The meta object literal for the '<em><b>Active Time Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APOGY_ENVIRONMENT__ACTIVE_TIME_SOURCE = eINSTANCE.getApogyEnvironment_ActiveTimeSource();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.TimeSourcesListImpl <em>Time Sources List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.TimeSourcesListImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getTimeSourcesList()
		 * @generated
		 */
		EClass TIME_SOURCES_LIST = eINSTANCE.getTimeSourcesList();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SOURCES_LIST__ENVIRONMENT = eINSTANCE.getTimeSourcesList_Environment();

		/**
		 * The meta object literal for the '<em><b>Time Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SOURCES_LIST__TIME_SOURCES = eINSTANCE.getTimeSourcesList_TimeSources();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.ApogyTopologyImpl <em>Apogy Topology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyTopologyImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getApogyTopology()
		 * @generated
		 */
		EClass APOGY_TOPOLOGY = eINSTANCE.getApogyTopology();

		/**
		 * The meta object literal for the '<em><b>Root Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APOGY_TOPOLOGY__ROOT_NODE = eINSTANCE.getApogyTopology_RootNode();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.ApogySystemImpl <em>Apogy System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogySystemImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getApogySystem()
		 * @generated
		 */
		EClass APOGY_SYSTEM = eINSTANCE.getApogySystem();

		/**
		 * The meta object literal for the '<em><b>Topology Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APOGY_SYSTEM__TOPOLOGY_ROOT = eINSTANCE.getApogySystem_TopologyRoot();

		/**
		 * The meta object literal for the '<em><b>Binding Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APOGY_SYSTEM__BINDING_SET = eINSTANCE.getApogySystem_BindingSet();

		/**
		 * The meta object literal for the '<em><b>Connection Points List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APOGY_SYSTEM__CONNECTION_POINTS_LIST = eINSTANCE.getApogySystem_ConnectionPointsList();

		/**
		 * The meta object literal for the '<em><b>Assembly Links List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APOGY_SYSTEM__ASSEMBLY_LINKS_LIST = eINSTANCE.getApogySystem_AssemblyLinksList();

		/**
		 * The meta object literal for the '<em><b>Pose Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APOGY_SYSTEM__POSE_PROVIDER = eINSTANCE.getApogySystem_PoseProvider();

		/**
		 * The meta object literal for the '<em><b>Pose Provider Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APOGY_SYSTEM__POSE_PROVIDER_INSTANCE = eINSTANCE.getApogySystem_PoseProviderInstance();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.ApogySystemApiAdapterImpl <em>Apogy System Api Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogySystemApiAdapterImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getApogySystemApiAdapter()
		 * @generated
		 */
		EClass APOGY_SYSTEM_API_ADAPTER = eINSTANCE.getApogySystemApiAdapter();

		/**
		 * The meta object literal for the '<em><b>Pose Corrector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APOGY_SYSTEM_API_ADAPTER__POSE_CORRECTOR = eINSTANCE.getApogySystemApiAdapter_PoseCorrector();

		/**
		 * The meta object literal for the '<em><b>Apogy System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APOGY_SYSTEM_API_ADAPTER__APOGY_SYSTEM = eINSTANCE.getApogySystemApiAdapter_ApogySystem();

		/**
		 * The meta object literal for the '<em><b>Create Result Matrix</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL = eINSTANCE.getApogySystemApiAdapter__CreateResultMatrix__OperationCall();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.ConnectionPointsListImpl <em>Connection Points List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.ConnectionPointsListImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getConnectionPointsList()
		 * @generated
		 */
		EClass CONNECTION_POINTS_LIST = eINSTANCE.getConnectionPointsList();

		/**
		 * The meta object literal for the '<em><b>Apogy System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POINTS_LIST__APOGY_SYSTEM = eINSTANCE.getConnectionPointsList_ApogySystem();

		/**
		 * The meta object literal for the '<em><b>Connection Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POINTS_LIST__CONNECTION_POINTS = eINSTANCE.getConnectionPointsList_ConnectionPoints();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.ConnectionPointImpl <em>Connection Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.ConnectionPointImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getConnectionPoint()
		 * @generated
		 */
		EClass CONNECTION_POINT = eINSTANCE.getConnectionPoint();

		/**
		 * The meta object literal for the '<em><b>Points List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POINT__POINTS_LIST = eINSTANCE.getConnectionPoint_PointsList();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POINT__NODE = eINSTANCE.getConnectionPoint_Node();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.AssemblyLinkImpl <em>Assembly Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.AssemblyLinkImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getAssemblyLink()
		 * @generated
		 */
		EClass ASSEMBLY_LINK = eINSTANCE.getAssemblyLink();

		/**
		 * The meta object literal for the '<em><b>Parent Type Member</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_LINK__PARENT_TYPE_MEMBER = eINSTANCE.getAssemblyLink_ParentTypeMember();

		/**
		 * The meta object literal for the '<em><b>Sub System Type Member</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_LINK__SUB_SYSTEM_TYPE_MEMBER = eINSTANCE.getAssemblyLink_SubSystemTypeMember();

		/**
		 * The meta object literal for the '<em><b>Parent Connection Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_LINK__PARENT_CONNECTION_POINT = eINSTANCE.getAssemblyLink_ParentConnectionPoint();

		/**
		 * The meta object literal for the '<em><b>Transformation Matrix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_LINK__TRANSFORMATION_MATRIX = eINSTANCE.getAssemblyLink_TransformationMatrix();

		/**
		 * The meta object literal for the '<em><b>Geometry Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_LINK__GEOMETRY_NODE = eINSTANCE.getAssemblyLink_GeometryNode();

		/**
		 * The meta object literal for the '<em><b>Parent Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_LINK__PARENT_INSTANCE = eINSTANCE.getAssemblyLink_ParentInstance();

		/**
		 * The meta object literal for the '<em><b>Sub System Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_LINK__SUB_SYSTEM_INSTANCE = eINSTANCE.getAssemblyLink_SubSystemInstance();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.AssemblyLinksListImpl <em>Assembly Links List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.AssemblyLinksListImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getAssemblyLinksList()
		 * @generated
		 */
		EClass ASSEMBLY_LINKS_LIST = eINSTANCE.getAssemblyLinksList();

		/**
		 * The meta object literal for the '<em><b>Assembly Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_LINKS_LIST__ASSEMBLY_LINKS = eINSTANCE.getAssemblyLinksList_AssemblyLinks();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.PoseProviderImpl <em>Pose Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.PoseProviderImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getPoseProvider()
		 * @generated
		 */
		EClass POSE_PROVIDER = eINSTANCE.getPoseProvider();

		/**
		 * The meta object literal for the '<em><b>Pose Transform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSE_PROVIDER__POSE_TRANSFORM = eINSTANCE.getPoseProvider_PoseTransform();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.AbsolutePoseProviderImpl <em>Absolute Pose Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.AbsolutePoseProviderImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getAbsolutePoseProvider()
		 * @generated
		 */
		EClass ABSOLUTE_POSE_PROVIDER = eINSTANCE.getAbsolutePoseProvider();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.PoseCorrectorImpl <em>Pose Corrector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.PoseCorrectorImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getPoseCorrector()
		 * @generated
		 */
		EClass POSE_CORRECTOR = eINSTANCE.getPoseCorrector();

		/**
		 * The meta object literal for the '<em><b>Apogy System Api Adapter</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSE_CORRECTOR__APOGY_SYSTEM_API_ADAPTER = eINSTANCE.getPoseCorrector_ApogySystemApiAdapter();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSE_CORRECTOR__ENABLED = eINSTANCE.getPoseCorrector_Enabled();

		/**
		 * The meta object literal for the '<em><b>Apply Correction</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POSE_CORRECTOR___APPLY_CORRECTION__MATRIX4X4 = eINSTANCE.getPoseCorrector__ApplyCorrection__Matrix4x4();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.ApogyInitializationDataImpl <em>Apogy Initialization Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyInitializationDataImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getApogyInitializationData()
		 * @generated
		 */
		EClass APOGY_INITIALIZATION_DATA = eINSTANCE.getApogyInitializationData();

		/**
		 * The meta object literal for the '<em><b>Initial Pose Transform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APOGY_INITIALIZATION_DATA__INITIAL_POSE_TRANSFORM = eINSTANCE.getApogyInitializationData_InitialPoseTransform();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.WorksitesListImpl <em>Worksites List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.WorksitesListImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getWorksitesList()
		 * @generated
		 */
		EClass WORKSITES_LIST = eINSTANCE.getWorksitesList();

		/**
		 * The meta object literal for the '<em><b>Worksites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSITES_LIST__WORKSITES = eINSTANCE.getWorksitesList_Worksites();

		/**
		 * The meta object literal for the '<em><b>Orbits Models Lists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSITES_LIST__ORBITS_MODELS_LISTS = eINSTANCE.getWorksitesList_OrbitsModelsLists();

		/**
		 * The meta object literal for the '<em><b>Surface Locations Lists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSITES_LIST__SURFACE_LOCATIONS_LISTS = eINSTANCE.getWorksitesList_SurfaceLocationsLists();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.AbstractWorksiteImpl <em>Abstract Worksite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.AbstractWorksiteImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getAbstractWorksite()
		 * @generated
		 */
		EClass ABSTRACT_WORKSITE = eINSTANCE.getAbstractWorksite();

		/**
		 * The meta object literal for the '<em><b>Worksites List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_WORKSITE__WORKSITES_LIST = eINSTANCE.getAbstractWorksite_WorksitesList();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.AbstractSurfaceLocationImpl <em>Abstract Surface Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.AbstractSurfaceLocationImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getAbstractSurfaceLocation()
		 * @generated
		 */
		EClass ABSTRACT_SURFACE_LOCATION = eINSTANCE.getAbstractSurfaceLocation();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.SurfaceLocationsListImpl <em>Surface Locations List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.SurfaceLocationsListImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getSurfaceLocationsList()
		 * @generated
		 */
		EClass SURFACE_LOCATIONS_LIST = eINSTANCE.getSurfaceLocationsList();

		/**
		 * The meta object literal for the '<em><b>Surface Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURFACE_LOCATIONS_LIST__SURFACE_LOCATIONS = eINSTANCE.getSurfaceLocationsList_SurfaceLocations();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.OrbitModelsListImpl <em>Orbit Models List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.OrbitModelsListImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getOrbitModelsList()
		 * @generated
		 */
		EClass ORBIT_MODELS_LIST = eINSTANCE.getOrbitModelsList();

		/**
		 * The meta object literal for the '<em><b>Orbit Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORBIT_MODELS_LIST__ORBIT_MODELS = eINSTANCE.getOrbitModelsList_OrbitModels();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.AbstractOrbitModelImpl <em>Abstract Orbit Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.AbstractOrbitModelImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getAbstractOrbitModel()
		 * @generated
		 */
		EClass ABSTRACT_ORBIT_MODEL = eINSTANCE.getAbstractOrbitModel();

		/**
		 * The meta object literal for the '<em><b>Orbit Models List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ORBIT_MODEL__ORBIT_MODELS_LIST = eINSTANCE.getAbstractOrbitModel_OrbitModelsList();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.PositionedImpl <em>Positioned</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.PositionedImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getPositioned()
		 * @generated
		 */
		EClass POSITIONED = eINSTANCE.getPositioned();

		/**
		 * The meta object literal for the '<em><b>Pose</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITIONED__POSE = eINSTANCE.getPositioned_Pose();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.TopologyRootImpl <em>Topology Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.TopologyRootImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getTopologyRoot()
		 * @generated
		 */
		EClass TOPOLOGY_ROOT = eINSTANCE.getTopologyRoot();

		/**
		 * The meta object literal for the '<em><b>Origin Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_ROOT__ORIGIN_NODE = eINSTANCE.getTopologyRoot_OriginNode();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.FeatureOfInterestListImpl <em>Feature Of Interest List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.FeatureOfInterestListImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getFeatureOfInterestList()
		 * @generated
		 */
		EClass FEATURE_OF_INTEREST_LIST = eINSTANCE.getFeatureOfInterestList();

		/**
		 * The meta object literal for the '<em><b>Features Of Interest</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_OF_INTEREST_LIST__FEATURES_OF_INTEREST = eINSTANCE.getFeatureOfInterestList_FeaturesOfInterest();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.FeatureOfInterestImpl <em>Feature Of Interest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.FeatureOfInterestImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getFeatureOfInterest()
		 * @generated
		 */
		EClass FEATURE_OF_INTEREST = eINSTANCE.getFeatureOfInterest();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.PositionedResultImpl <em>Positioned Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.PositionedResultImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getPositionedResult()
		 * @generated
		 */
		EClass POSITIONED_RESULT = eINSTANCE.getPositionedResult();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.OperationCallPositionedResultImpl <em>Operation Call Positioned Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.OperationCallPositionedResultImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getOperationCallPositionedResult()
		 * @generated
		 */
		EClass OPERATION_CALL_POSITIONED_RESULT = eINSTANCE.getOperationCallPositionedResult();

		/**
		 * The meta object literal for the '<em><b>Relative Pose</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL_POSITIONED_RESULT__RELATIVE_POSE = eINSTANCE.getOperationCallPositionedResult_RelativePose();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.UserDefinedResultImpl <em>User Defined Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.UserDefinedResultImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getUserDefinedResult()
		 * @generated
		 */
		EClass USER_DEFINED_RESULT = eINSTANCE.getUserDefinedResult();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.ResultNodeImpl <em>Result Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.ResultNodeImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getResultNode()
		 * @generated
		 */
		EClass RESULT_NODE = eINSTANCE.getResultNode();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_NODE__RESULT = eINSTANCE.getResultNode_Result();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.ResultsListNodeImpl <em>Results List Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.ResultsListNodeImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getResultsListNode()
		 * @generated
		 */
		EClass RESULTS_LIST_NODE = eINSTANCE.getResultsListNode();

		/**
		 * The meta object literal for the '<em><b>Results List</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTS_LIST_NODE__RESULTS_LIST = eINSTANCE.getResultsListNode_ResultsList();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.FeatureOfInterestNodeImpl <em>Feature Of Interest Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.FeatureOfInterestNodeImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getFeatureOfInterestNode()
		 * @generated
		 */
		EClass FEATURE_OF_INTEREST_NODE = eINSTANCE.getFeatureOfInterestNode();

		/**
		 * The meta object literal for the '<em><b>Feature Of Interest</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_OF_INTEREST_NODE__FEATURE_OF_INTEREST = eINSTANCE.getFeatureOfInterestNode_FeatureOfInterest();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.FeatureOfInterestListNodeImpl <em>Feature Of Interest List Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.FeatureOfInterestListNodeImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getFeatureOfInterestListNode()
		 * @generated
		 */
		EClass FEATURE_OF_INTEREST_LIST_NODE = eINSTANCE.getFeatureOfInterestListNode();

		/**
		 * The meta object literal for the '<em><b>Feature Of Interest List</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_OF_INTEREST_LIST_NODE__FEATURE_OF_INTEREST_LIST = eINSTANCE.getFeatureOfInterestListNode_FeatureOfInterestList();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.impl.UpdatableImpl <em>Updatable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.impl.UpdatableImpl
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getUpdatable()
		 * @generated
		 */
		EClass UPDATABLE = eINSTANCE.getUpdatable();

		/**
		 * The meta object literal for the '<em><b>Updating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATABLE__UPDATING = eINSTANCE.getUpdatable_Updating();

		/**
		 * The meta object literal for the '<em><b>Auto Update Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATABLE__AUTO_UPDATE_ENABLED = eINSTANCE.getUpdatable_AutoUpdateEnabled();

		/**
		 * The meta object literal for the '<em><b>Get Default Auto Update Enabled</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UPDATABLE___GET_DEFAULT_AUTO_UPDATE_ENABLED = eINSTANCE.getUpdatable__GetDefaultAutoUpdateEnabled();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UPDATABLE___UPDATE = eINSTANCE.getUpdatable__Update();

		/**
		 * The meta object literal for the '<em>Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getMap()
		 * @generated
		 */
		EDataType MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em>Collection</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Collection
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getCollection()
		 * @generated
		 */
		EDataType COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see ca.gc.asc_csa.apogy.core.impl.ApogyCorePackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

	}

} //ApogyCorePackage
