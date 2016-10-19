/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Pierre Allard (Pierre.Allard@canada.ca), 
 *      Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *      Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *      Canadian Space Agency (CSA) - Initial API and implementation
 */
package ca.gc.asc_csa.apogy.core.invocator;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCoreInvocator' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\n All rights reserved. This program and the accompanying materials\n are made available under the terms of the Eclipse Public License v1.0\n which accompanies this distribution, and is available at\n http://www.eclipse.org/legal/epl-v10.html\n \n Contributors:\n     Pierre Allard (Pierre.Allard@canada.ca), \n     Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n     Sebastien Gemme (Sebastien.Gemme@canada.ca),\n     Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyCoreInvocator' fileExtensions='sym' resource='XMI' modelDirectory='/ca.gc.asc_csa.apogy.core.invocator/src-generated' editDirectory='/ca.gc.asc_csa.apogy.core.invocator.edit/src-generated' editorDirectory='/ca.gc.asc_csa.apogy.core.invocator.editor/src-generated' basePackage='ca.gc.asc_csa.apogy.core'"
 * @generated
 */
public interface ApogyCoreInvocatorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "invocator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.core.invocator";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "invocator";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCoreInvocatorPackage eINSTANCE = ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorFacadeImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getApogyCoreInvocatorFacade()
	 * @generated
	 */
	int APOGY_CORE_INVOCATOR_FACADE = 0;

	/**
	 * The feature id for the '<em><b>Init Variable Instances Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE__INIT_VARIABLE_INSTANCES_DATE = 0;

	/**
	 * The feature id for the '<em><b>Active Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION = 1;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Exec</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___EXEC__OPERATIONCALL = 0;

	/**
	 * The operation id for the '<em>Exec</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___EXEC__OPERATIONCALL_BOOLEAN = 1;

	/**
	 * The operation id for the '<em>Exec</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___EXEC__OPERATIONCALLSLIST = 2;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___GET_VALUE__OPERATIONCALLRESULT = 3;

	/**
	 * The operation id for the '<em>Create Abstract Result Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___CREATE_ABSTRACT_RESULT_VALUE__OBJECT = 4;

	/**
	 * The operation id for the '<em>Get Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___GET_INSTANCE__VARIABLE = 5;

	/**
	 * The operation id for the '<em>Get Instance Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___GET_INSTANCE_CLASS__VARIABLE = 6;

	/**
	 * The operation id for the '<em>Get Type Api Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___GET_TYPE_API_ADAPTER__VARIABLEFEATUREREFERENCE = 7;

	/**
	 * The operation id for the '<em>Get Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___GET_INSTANCE__VARIABLEFEATUREREFERENCE = 8;

	/**
	 * The operation id for the '<em>Get Type Member Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___GET_TYPE_MEMBER_INSTANCE__VARIABLEFEATUREREFERENCE = 9;

	/**
	 * The operation id for the '<em>Get EMF Feature Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___GET_EMF_FEATURE_VALUE__VARIABLEFEATUREREFERENCE = 10;

	/**
	 * The operation id for the '<em>Get Instance Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___GET_INSTANCE_CLASS__VARIABLEFEATUREREFERENCE = 11;

	/**
	 * The operation id for the '<em>Get Type Implementation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___GET_TYPE_IMPLEMENTATION__OPERATIONCALL = 12;

	/**
	 * The operation id for the '<em>Get Type Implementation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___GET_TYPE_IMPLEMENTATION__VARIABLE_ABSTRACTTYPE = 13;

	/**
	 * The operation id for the '<em>Get Type Implementation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___GET_TYPE_IMPLEMENTATION__VARIABLE = 14;

	/**
	 * The operation id for the '<em>Get Variable By Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___GET_VARIABLE_BY_NAME__INVOCATORSESSION_STRING = 15;

	/**
	 * The operation id for the '<em>Create Type Member References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___CREATE_TYPE_MEMBER_REFERENCES__TYPEMEMBER = 16;

	/**
	 * The operation id for the '<em>Get Type Implementation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___GET_TYPE_IMPLEMENTATION__ENVIRONMENT_STRING = 17;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___GET_FULLY_QUALIFIED_NAME__TYPEMEMBERREFERENCETREEELEMENT = 18;

	/**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___GET_FULLY_QUALIFIED_NAME__ABSTRACTFEATURENODE = 19;

	/**
	 * The operation id for the '<em>Create Type Member Implementations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___CREATE_TYPE_MEMBER_IMPLEMENTATIONS__TYPE = 20;

	/**
	 * The operation id for the '<em>Init Variable Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___INIT_VARIABLE_INSTANCES__ENVIRONMENT = 21;

	/**
	 * The operation id for the '<em>Dispose Variable Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___DISPOSE_VARIABLE_INSTANCES__ENVIRONMENT = 22;

	/**
	 * The operation id for the '<em>Get Operation Call Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___GET_OPERATION_CALL_CONTAINER__TYPEMEMBERREFERENCELISTELEMENT = 23;

	/**
	 * The operation id for the '<em>Apply Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___APPLY_INITIALIZATION_DATA__ENVIRONMENT = 24;

	/**
	 * The operation id for the '<em>Collect Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___COLLECT_INITIALIZATION_DATA__ENVIRONMENT = 25;

	/**
	 * The operation id for the '<em>Apply Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___APPLY_INITIALIZATION_DATA__VARIABLE = 26;

	/**
	 * The operation id for the '<em>Collect Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___COLLECT_INITIALIZATION_DATA__VARIABLE = 27;

	/**
	 * The operation id for the '<em>Load Registered Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___LOAD_REGISTERED_TYPES__INVOCATORSESSION = 28;

	/**
	 * The operation id for the '<em>Get All Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___GET_ALL_TYPES__ENVIRONMENT = 29;

	/**
	 * The operation id for the '<em>Add Variable Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___ADD_VARIABLE_LISTENER__IVARIABLELISTENER = 30;

	/**
	 * The operation id for the '<em>Remove Variable Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___REMOVE_VARIABLE_LISTENER__IVARIABLELISTENER = 31;

	/**
	 * The operation id for the '<em>Notify Variable Listeners</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___NOTIFY_VARIABLE_LISTENERS__VARIABLE_VARIABLELISTENEREVENTTYPE = 32;

	/**
	 * The operation id for the '<em>Load Invocator Session</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___LOAD_INVOCATOR_SESSION__STRING = 33;

	/**
	 * The operation id for the '<em>Get Data Products By Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___GET_DATA_PRODUCTS_BY_NAME__INVOCATORSESSION_STRING = 34;

	/**
	 * The operation id for the '<em>Get Program By Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___GET_PROGRAM_BY_NAME__INVOCATORSESSION_STRING = 35;

	/**
	 * The operation id for the '<em>Get Context By Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___GET_CONTEXT_BY_NAME__INVOCATORSESSION_STRING = 36;

	/**
	 * The operation id for the '<em>Get All Script Based Programs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___GET_ALL_SCRIPT_BASED_PROGRAMS__PROGRAMSLIST = 37;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE___CREATE_CONTEXT__INVOCATORSESSION = 38;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_FACADE_OPERATION_COUNT = 39;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.InvocatorSessionImpl <em>Invocator Session</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.InvocatorSessionImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getInvocatorSession()
	 * @generated
	 */
	int INVOCATOR_SESSION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATOR_SESSION__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATOR_SESSION__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATOR_SESSION__ENVIRONMENT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Programs List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATOR_SESSION__PROGRAMS_LIST = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Program Runtimes List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATOR_SESSION__PROGRAM_RUNTIMES_LIST = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Products List Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATOR_SESSION__DATA_PRODUCTS_LIST_CONTAINER = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tools List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATOR_SESSION__TOOLS_LIST = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Invocator Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATOR_SESSION_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Invocator Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATOR_SESSION_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.EnvironmentImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__INVOCATOR_SESSION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Types List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__TYPES_LIST = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Variables List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__VARIABLES_LIST = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contexts List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__CONTEXTS_LIST = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Active Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__ACTIVE_CONTEXT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.DataProductsListsContainerImpl <em>Data Products Lists Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.DataProductsListsContainerImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getDataProductsListsContainer()
	 * @generated
	 */
	int DATA_PRODUCTS_LISTS_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRODUCTS_LISTS_CONTAINER__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRODUCTS_LISTS_CONTAINER__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRODUCTS_LISTS_CONTAINER__INVOCATOR_SESSION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Products List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRODUCTS_LISTS_CONTAINER__DATA_PRODUCTS_LIST = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Products Lists Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRODUCTS_LISTS_CONTAINER_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Products Lists Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRODUCTS_LISTS_CONTAINER_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.DataProductsListImpl <em>Data Products List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.DataProductsListImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getDataProductsList()
	 * @generated
	 */
	int DATA_PRODUCTS_LIST = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRODUCTS_LIST__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRODUCTS_LIST__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Products Lists Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRODUCTS_LIST__DATA_PRODUCTS_LISTS_CONTAINER = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation Call Results List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRODUCTS_LIST__OPERATION_CALL_RESULTS_LIST = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Recording Results List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRODUCTS_LIST__RECORDING_RESULTS_LIST = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRODUCTS_LIST__INVOCATOR_SESSION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Data Products List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRODUCTS_LIST_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Data Products List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRODUCTS_LIST_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ToolsListImpl <em>Tools List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ToolsListImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getToolsList()
	 * @generated
	 */
	int TOOLS_LIST = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS_LIST__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS_LIST__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS_LIST__INVOCATOR_SESSION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tools List Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS_LIST__TOOLS_LIST_CONTAINERS = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tools List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS_LIST_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Tools List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLS_LIST_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.AbstractToolsListContainerImpl <em>Abstract Tools List Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.AbstractToolsListContainerImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getAbstractToolsListContainer()
	 * @generated
	 */
	int ABSTRACT_TOOLS_LIST_CONTAINER = 6;

	/**
	 * The feature id for the '<em><b>Tools List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOLS_LIST_CONTAINER__TOOLS_LIST = 0;

	/**
	 * The number of structural features of the '<em>Abstract Tools List Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOLS_LIST_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Tools List Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOOLS_LIST_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypesListImpl <em>Types List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.TypesListImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getTypesList()
	 * @generated
	 */
	int TYPES_LIST = 7;

	/**
	 * The feature id for the '<em><b>Local Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_LIST__LOCAL_TYPES = 0;

	/**
	 * The feature id for the '<em><b>Registered Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_LIST__REGISTERED_TYPES = 1;

	/**
	 * The number of structural features of the '<em>Types List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Types List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.LocalTypesListImpl <em>Local Types List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.LocalTypesListImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getLocalTypesList()
	 * @generated
	 */
	int LOCAL_TYPES_LIST = 8;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TYPES_LIST__TYPES = 0;

	/**
	 * The number of structural features of the '<em>Local Types List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TYPES_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Local Types List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TYPES_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.RegisteredTypesListImpl <em>Registered Types List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.RegisteredTypesListImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getRegisteredTypesList()
	 * @generated
	 */
	int REGISTERED_TYPES_LIST = 9;

	/**
	 * The feature id for the '<em><b>Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_TYPES_LIST__TYPES = 0;

	/**
	 * The number of structural features of the '<em>Registered Types List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_TYPES_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Registered Types List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_TYPES_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractType <em>Abstract Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractType
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getAbstractType()
	 * @generated
	 */
	int ABSTRACT_TYPE = 10;

	/**
	 * The number of structural features of the '<em>Abstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.TypeImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__MEMBERS = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__INTERFACE_CLASS = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Api Adapter Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TYPE_API_ADAPTER_CLASS = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeApiAdapterImpl <em>Type Api Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.TypeApiAdapterImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getTypeApiAdapter()
	 * @generated
	 */
	int TYPE_API_ADAPTER = 12;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_API_ADAPTER__ENVIRONMENT = 0;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_API_ADAPTER__INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_API_ADAPTER__ELEMENT_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Type Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_API_ADAPTER_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT = 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA = 1;

	/**
	 * The operation id for the '<em>Create Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_API_ADAPTER___CREATE_INITIALIZATION_DATA = 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA = 3;

	/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_API_ADAPTER___CREATE_RESULT__OPERATIONCALL = 4;

	/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION = 5;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN = 6;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_API_ADAPTER___DISPOSE = 7;

	/**
	 * The number of operations of the '<em>Type Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_API_ADAPTER_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberImpl <em>Type Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getTypeMember()
	 * @generated
	 */
	int TYPE_MEMBER = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER__MEMBER_TYPE = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Feature Root Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER__TYPE_FEATURE_ROOT_NODE = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Type Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberReferenceImpl <em>Type Member Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberReferenceImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getTypeMemberReference()
	 * @generated
	 */
	int TYPE_MEMBER_REFERENCE = 14;

	/**
	 * The feature id for the '<em><b>Type Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_REFERENCE__TYPE_MEMBER = 0;

	/**
	 * The number of structural features of the '<em>Type Member Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Type Member Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberReferenceListElementImpl <em>Type Member Reference List Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberReferenceListElementImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getTypeMemberReferenceListElement()
	 * @generated
	 */
	int TYPE_MEMBER_REFERENCE_LIST_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Type Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_REFERENCE_LIST_ELEMENT__TYPE_MEMBER = TYPE_MEMBER_REFERENCE__TYPE_MEMBER;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_REFERENCE_LIST_ELEMENT__CHILD = TYPE_MEMBER_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_REFERENCE_LIST_ELEMENT__PARENT = TYPE_MEMBER_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_REFERENCE_LIST_ELEMENT__ROOT = TYPE_MEMBER_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Root Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_REFERENCE_LIST_ELEMENT__ROOT_ELEMENT = TYPE_MEMBER_REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Leaf Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_REFERENCE_LIST_ELEMENT__LEAF_ELEMENT = TYPE_MEMBER_REFERENCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_REFERENCE_LIST_ELEMENT__LEAF = TYPE_MEMBER_REFERENCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sub Segments Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_REFERENCE_LIST_ELEMENT__SUB_SEGMENTS_COUNT = TYPE_MEMBER_REFERENCE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Type Member Reference List Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_REFERENCE_LIST_ELEMENT_FEATURE_COUNT = TYPE_MEMBER_REFERENCE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Type Member Reference List Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_REFERENCE_LIST_ELEMENT_OPERATION_COUNT = TYPE_MEMBER_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberReferenceTreeElementImpl <em>Type Member Reference Tree Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberReferenceTreeElementImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getTypeMemberReferenceTreeElement()
	 * @generated
	 */
	int TYPE_MEMBER_REFERENCE_TREE_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Type Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_REFERENCE_TREE_ELEMENT__TYPE_MEMBER = TYPE_MEMBER_REFERENCE__TYPE_MEMBER;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_REFERENCE_TREE_ELEMENT__CHILD = TYPE_MEMBER_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_REFERENCE_TREE_ELEMENT__PARENT = TYPE_MEMBER_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feature Root Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_REFERENCE_TREE_ELEMENT__FEATURE_ROOT_NODE = TYPE_MEMBER_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_REFERENCE_TREE_ELEMENT__ROOT = TYPE_MEMBER_REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Root Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_REFERENCE_TREE_ELEMENT__ROOT_ELEMENT = TYPE_MEMBER_REFERENCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_REFERENCE_TREE_ELEMENT__LEAF = TYPE_MEMBER_REFERENCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Type Member Reference Tree Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_REFERENCE_TREE_ELEMENT_FEATURE_COUNT = TYPE_MEMBER_REFERENCE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Type Member Reference Tree Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_REFERENCE_TREE_ELEMENT_OPERATION_COUNT = TYPE_MEMBER_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.VariablesListImpl <em>Variables List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.VariablesListImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getVariablesList()
	 * @generated
	 */
	int VARIABLES_LIST = 17;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLES_LIST__ENVIRONMENT = 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLES_LIST__VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>Variables List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLES_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variables List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLES_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.VariableImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Variables List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VARIABLES_LIST = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VARIABLE_TYPE = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ENVIRONMENT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ContextsListImpl <em>Contexts List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ContextsListImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getContextsList()
	 * @generated
	 */
	int CONTEXTS_LIST = 19;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTS_LIST__ENVIRONMENT = 0;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTS_LIST__CONTEXTS = 1;

	/**
	 * The number of structural features of the '<em>Contexts List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTS_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Contexts List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTS_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ContextImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Archived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ARCHIVED = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contexts List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CONTEXTS_LIST = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Variable Implementations List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__VARIABLE_IMPLEMENTATIONS_LIST = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ENVIRONMENT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Data Products List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__DATA_PRODUCTS_LIST = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Instances Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__INSTANCES_CREATION_DATE = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Instances Disposal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__INSTANCES_DISPOSAL_DATE = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Variables Instantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__VARIABLES_INSTANTIATED = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.VariableImplementationsListImpl <em>Variable Implementations List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.VariableImplementationsListImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getVariableImplementationsList()
	 * @generated
	 */
	int VARIABLE_IMPLEMENTATIONS_LIST = 21;

	/**
	 * The feature id for the '<em><b>Variable Implementations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_IMPLEMENTATIONS_LIST__VARIABLE_IMPLEMENTATIONS = 0;

	/**
	 * The number of structural features of the '<em>Variable Implementations List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_IMPLEMENTATIONS_LIST_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Variable Implementation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_IMPLEMENTATIONS_LIST___GET_VARIABLE_IMPLEMENTATION__VARIABLE = 0;

	/**
	 * The operation id for the '<em>Get Variable Implementation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_IMPLEMENTATIONS_LIST___GET_VARIABLE_IMPLEMENTATION__STRING = 1;

	/**
	 * The number of operations of the '<em>Variable Implementations List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_IMPLEMENTATIONS_LIST_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.AbstractInitializationDataImpl <em>Abstract Initialization Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.AbstractInitializationDataImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getAbstractInitializationData()
	 * @generated
	 */
	int ABSTRACT_INITIALIZATION_DATA = 22;

	/**
	 * The number of structural features of the '<em>Abstract Initialization Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INITIALIZATION_DATA_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Initialization Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INITIALIZATION_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.InitializationDataImpl <em>Initialization Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.InitializationDataImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getInitializationData()
	 * @generated
	 */
	int INITIALIZATION_DATA = 23;

	/**
	 * The number of structural features of the '<em>Initialization Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_DATA_FEATURE_COUNT = ABSTRACT_INITIALIZATION_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Initialization Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_DATA_OPERATION_COUNT = ABSTRACT_INITIALIZATION_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.AbstractTypeImplementationImpl <em>Abstract Type Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.AbstractTypeImplementationImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getAbstractTypeImplementation()
	 * @generated
	 */
	int ABSTRACT_TYPE_IMPLEMENTATION = 24;

	/**
	 * The feature id for the '<em><b>Type Member Implementations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_IMPLEMENTATION__TYPE_MEMBER_IMPLEMENTATIONS = 0;

	/**
	 * The feature id for the '<em><b>Implementation Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_IMPLEMENTATION__IMPLEMENTATION_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Abstract Initialization Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_IMPLEMENTATION__ABSTRACT_INITIALIZATION_DATA = 2;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_IMPLEMENTATION__INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Adapter Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_IMPLEMENTATION__ADAPTER_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Handling Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_IMPLEMENTATION__HANDLING_TYPE = 5;

	/**
	 * The number of structural features of the '<em>Abstract Type Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_IMPLEMENTATION_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Get Type Member Implementation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_IMPLEMENTATION___GET_TYPE_MEMBER_IMPLEMENTATION__STRING = 0;

	/**
	 * The operation id for the '<em>Get Type Member Implementation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_IMPLEMENTATION___GET_TYPE_MEMBER_IMPLEMENTATION__TYPEMEMBER = 1;

	/**
	 * The number of operations of the '<em>Abstract Type Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_IMPLEMENTATION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.VariableImplementationImpl <em>Variable Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.VariableImplementationImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getVariableImplementation()
	 * @generated
	 */
	int VARIABLE_IMPLEMENTATION = 25;

	/**
	 * The feature id for the '<em><b>Type Member Implementations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_IMPLEMENTATION__TYPE_MEMBER_IMPLEMENTATIONS = ABSTRACT_TYPE_IMPLEMENTATION__TYPE_MEMBER_IMPLEMENTATIONS;

	/**
	 * The feature id for the '<em><b>Implementation Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_IMPLEMENTATION__IMPLEMENTATION_CLASS = ABSTRACT_TYPE_IMPLEMENTATION__IMPLEMENTATION_CLASS;

	/**
	 * The feature id for the '<em><b>Abstract Initialization Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_IMPLEMENTATION__ABSTRACT_INITIALIZATION_DATA = ABSTRACT_TYPE_IMPLEMENTATION__ABSTRACT_INITIALIZATION_DATA;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_IMPLEMENTATION__INSTANCE = ABSTRACT_TYPE_IMPLEMENTATION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Adapter Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_IMPLEMENTATION__ADAPTER_INSTANCE = ABSTRACT_TYPE_IMPLEMENTATION__ADAPTER_INSTANCE;

	/**
	 * The feature id for the '<em><b>Handling Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_IMPLEMENTATION__HANDLING_TYPE = ABSTRACT_TYPE_IMPLEMENTATION__HANDLING_TYPE;

	/**
	 * The feature id for the '<em><b>Variable Implementations List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_IMPLEMENTATION__VARIABLE_IMPLEMENTATIONS_LIST = ABSTRACT_TYPE_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_IMPLEMENTATION__VARIABLE = ABSTRACT_TYPE_IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_IMPLEMENTATION_FEATURE_COUNT = ABSTRACT_TYPE_IMPLEMENTATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Type Member Implementation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_IMPLEMENTATION___GET_TYPE_MEMBER_IMPLEMENTATION__STRING = ABSTRACT_TYPE_IMPLEMENTATION___GET_TYPE_MEMBER_IMPLEMENTATION__STRING;

	/**
	 * The operation id for the '<em>Get Type Member Implementation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_IMPLEMENTATION___GET_TYPE_MEMBER_IMPLEMENTATION__TYPEMEMBER = ABSTRACT_TYPE_IMPLEMENTATION___GET_TYPE_MEMBER_IMPLEMENTATION__TYPEMEMBER;

	/**
	 * The number of operations of the '<em>Variable Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_IMPLEMENTATION_OPERATION_COUNT = ABSTRACT_TYPE_IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberImplementationImpl <em>Type Member Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberImplementationImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getTypeMemberImplementation()
	 * @generated
	 */
	int TYPE_MEMBER_IMPLEMENTATION = 26;

	/**
	 * The feature id for the '<em><b>Type Member Implementations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_IMPLEMENTATION__TYPE_MEMBER_IMPLEMENTATIONS = ABSTRACT_TYPE_IMPLEMENTATION__TYPE_MEMBER_IMPLEMENTATIONS;

	/**
	 * The feature id for the '<em><b>Implementation Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_IMPLEMENTATION__IMPLEMENTATION_CLASS = ABSTRACT_TYPE_IMPLEMENTATION__IMPLEMENTATION_CLASS;

	/**
	 * The feature id for the '<em><b>Abstract Initialization Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_IMPLEMENTATION__ABSTRACT_INITIALIZATION_DATA = ABSTRACT_TYPE_IMPLEMENTATION__ABSTRACT_INITIALIZATION_DATA;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_IMPLEMENTATION__INSTANCE = ABSTRACT_TYPE_IMPLEMENTATION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Adapter Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_IMPLEMENTATION__ADAPTER_INSTANCE = ABSTRACT_TYPE_IMPLEMENTATION__ADAPTER_INSTANCE;

	/**
	 * The feature id for the '<em><b>Handling Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_IMPLEMENTATION__HANDLING_TYPE = ABSTRACT_TYPE_IMPLEMENTATION__HANDLING_TYPE;

	/**
	 * The feature id for the '<em><b>Type Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_IMPLEMENTATION__TYPE_MEMBER = ABSTRACT_TYPE_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Member Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_IMPLEMENTATION_FEATURE_COUNT = ABSTRACT_TYPE_IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type Member Implementation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_IMPLEMENTATION___GET_TYPE_MEMBER_IMPLEMENTATION__STRING = ABSTRACT_TYPE_IMPLEMENTATION___GET_TYPE_MEMBER_IMPLEMENTATION__STRING;

	/**
	 * The operation id for the '<em>Get Type Member Implementation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_IMPLEMENTATION___GET_TYPE_MEMBER_IMPLEMENTATION__TYPEMEMBER = ABSTRACT_TYPE_IMPLEMENTATION___GET_TYPE_MEMBER_IMPLEMENTATION__TYPEMEMBER;

	/**
	 * The number of operations of the '<em>Type Member Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MEMBER_IMPLEMENTATION_OPERATION_COUNT = ABSTRACT_TYPE_IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ValuesListImpl <em>Values List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ValuesListImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getValuesList()
	 * @generated
	 */
	int VALUES_LIST = 27;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_LIST__VALUES = 0;

	/**
	 * The number of structural features of the '<em>Values List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Values List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ValueImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__VALUE = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ProgramsListImpl <em>Programs List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ProgramsListImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getProgramsList()
	 * @generated
	 */
	int PROGRAMS_LIST = 29;

	/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMS_LIST__INVOCATOR_SESSION = 0;

	/**
	 * The feature id for the '<em><b>Programs Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMS_LIST__PROGRAMS_GROUPS = 1;

	/**
	 * The number of structural features of the '<em>Programs List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMS_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Programs List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMS_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ProgramsGroupImpl <em>Programs Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ProgramsGroupImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getProgramsGroup()
	 * @generated
	 */
	int PROGRAMS_GROUP = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMS_GROUP__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMS_GROUP__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Archived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMS_GROUP__ARCHIVED = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Programs List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMS_GROUP__PROGRAMS_LIST = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMS_GROUP__INVOCATOR_SESSION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Programs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMS_GROUP__PROGRAMS = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Programs Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMS_GROUP_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Programs Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMS_GROUP_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ProgramImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Archived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__ARCHIVED = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Programs Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__PROGRAMS_GROUP = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__INVOCATOR_SESSION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ScriptBasedProgramImpl <em>Script Based Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ScriptBasedProgramImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getScriptBasedProgram()
	 * @generated
	 */
	int SCRIPT_BASED_PROGRAM = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_BASED_PROGRAM__NAME = PROGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_BASED_PROGRAM__DESCRIPTION = PROGRAM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Archived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_BASED_PROGRAM__ARCHIVED = PROGRAM__ARCHIVED;

	/**
	 * The feature id for the '<em><b>Programs Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_BASED_PROGRAM__PROGRAMS_GROUP = PROGRAM__PROGRAMS_GROUP;

	/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_BASED_PROGRAM__INVOCATOR_SESSION = PROGRAM__INVOCATOR_SESSION;

	/**
	 * The number of structural features of the '<em>Script Based Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_BASED_PROGRAM_FEATURE_COUNT = PROGRAM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Script Based Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_BASED_PROGRAM_OPERATION_COUNT = PROGRAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.TriggeredBasedProgramImpl <em>Triggered Based Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.TriggeredBasedProgramImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getTriggeredBasedProgram()
	 * @generated
	 */
	int TRIGGERED_BASED_PROGRAM = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_BASED_PROGRAM__NAME = PROGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_BASED_PROGRAM__DESCRIPTION = PROGRAM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Archived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_BASED_PROGRAM__ARCHIVED = PROGRAM__ARCHIVED;

	/**
	 * The feature id for the '<em><b>Programs Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_BASED_PROGRAM__PROGRAMS_GROUP = PROGRAM__PROGRAMS_GROUP;

	/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_BASED_PROGRAM__INVOCATOR_SESSION = PROGRAM__INVOCATOR_SESSION;

	/**
	 * The number of structural features of the '<em>Triggered Based Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_BASED_PROGRAM_FEATURE_COUNT = PROGRAM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Triggered Based Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERED_BASED_PROGRAM_OPERATION_COUNT = PROGRAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCallContainer <em>Operation Call Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCallContainer
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getOperationCallContainer()
	 * @generated
	 */
	int OPERATION_CALL_CONTAINER = 34;

	/**
	 * The feature id for the '<em><b>Operation Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_CONTAINER__OPERATION_CALLS = 0;

	/**
	 * The number of structural features of the '<em>Operation Call Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Invocator Session</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_CONTAINER___GET_INVOCATOR_SESSION = 0;

	/**
	 * The number of operations of the '<em>Operation Call Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_CONTAINER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallsListImpl <em>Operation Calls List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallsListImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getOperationCallsList()
	 * @generated
	 */
	int OPERATION_CALLS_LIST = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALLS_LIST__NAME = SCRIPT_BASED_PROGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALLS_LIST__DESCRIPTION = SCRIPT_BASED_PROGRAM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Archived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALLS_LIST__ARCHIVED = SCRIPT_BASED_PROGRAM__ARCHIVED;

	/**
	 * The feature id for the '<em><b>Programs Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALLS_LIST__PROGRAMS_GROUP = SCRIPT_BASED_PROGRAM__PROGRAMS_GROUP;

	/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALLS_LIST__INVOCATOR_SESSION = SCRIPT_BASED_PROGRAM__INVOCATOR_SESSION;

	/**
	 * The feature id for the '<em><b>Operation Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALLS_LIST__OPERATION_CALLS = SCRIPT_BASED_PROGRAM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation Calls List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALLS_LIST_FEATURE_COUNT = SCRIPT_BASED_PROGRAM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Invocator Session</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALLS_LIST___GET_INVOCATOR_SESSION = SCRIPT_BASED_PROGRAM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operation Calls List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALLS_LIST_OPERATION_COUNT = SCRIPT_BASED_PROGRAM_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.VariableFeatureReferenceImpl <em>Variable Feature Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.VariableFeatureReferenceImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getVariableFeatureReference()
	 * @generated
	 */
	int VARIABLE_FEATURE_REFERENCE = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_REFERENCE__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_REFERENCE__VARIABLE = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Member Reference List Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feature Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Variable Feature Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_REFERENCE_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Variable Feature Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_REFERENCE_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallImpl <em>Operation Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getOperationCall()
	 * @generated
	 */
	int OPERATION_CALL = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__NAME = VARIABLE_FEATURE_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__VARIABLE = VARIABLE_FEATURE_REFERENCE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Type Member Reference List Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__TYPE_MEMBER_REFERENCE_LIST_ELEMENT = VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__FEATURE_ROOT = VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__DESCRIPTION = VARIABLE_FEATURE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EOperation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__EOPERATION = VARIABLE_FEATURE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arguments List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__ARGUMENTS_LIST = VARIABLE_FEATURE_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operation Call Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__OPERATION_CALL_CONTAINER = VARIABLE_FEATURE_REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__INVOCATOR_SESSION = VARIABLE_FEATURE_REFERENCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__ENVIRONMENT = VARIABLE_FEATURE_REFERENCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Operation Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_FEATURE_COUNT = VARIABLE_FEATURE_REFERENCE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Operation Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_OPERATION_COUNT = VARIABLE_FEATURE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ArgumentsListImpl <em>Arguments List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ArgumentsListImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getArgumentsList()
	 * @generated
	 */
	int ARGUMENTS_LIST = 38;

	/**
	 * The feature id for the '<em><b>Operation Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTS_LIST__OPERATION_CALL = 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTS_LIST__ARGUMENTS = 1;

	/**
	 * The number of structural features of the '<em>Arguments List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTS_LIST_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Argument Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTS_LIST___GET_ARGUMENT_VALUES = 0;

	/**
	 * The number of operations of the '<em>Arguments List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTS_LIST_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ArgumentImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 39;

	/**
	 * The feature id for the '<em><b>Arguments List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ARGUMENTS_LIST = 0;

	/**
	 * The feature id for the '<em><b>Operation Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__OPERATION_CALL = 1;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get EParameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT___GET_EPARAMETER = 0;

	/**
	 * The operation id for the '<em>Get Parameter Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT___GET_PARAMETER_VALUE = 1;

	/**
	 * The number of operations of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.EDataTypeArgumentImpl <em>EData Type Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.EDataTypeArgumentImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getEDataTypeArgument()
	 * @generated
	 */
	int EDATA_TYPE_ARGUMENT = 40;

	/**
	 * The feature id for the '<em><b>Arguments List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE_ARGUMENT__ARGUMENTS_LIST = ARGUMENT__ARGUMENTS_LIST;

	/**
	 * The feature id for the '<em><b>Operation Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE_ARGUMENT__OPERATION_CALL = ARGUMENT__OPERATION_CALL;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE_ARGUMENT__VALUE = ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EData Type Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE_ARGUMENT_FEATURE_COUNT = ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EParameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE_ARGUMENT___GET_EPARAMETER = ARGUMENT___GET_EPARAMETER;

	/**
	 * The operation id for the '<em>Get Parameter Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE_ARGUMENT___GET_PARAMETER_VALUE = ARGUMENT___GET_PARAMETER_VALUE;

	/**
	 * The number of operations of the '<em>EData Type Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE_ARGUMENT_OPERATION_COUNT = ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.BooleanEDataTypeArgumentImpl <em>Boolean EData Type Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.BooleanEDataTypeArgumentImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getBooleanEDataTypeArgument()
	 * @generated
	 */
	int BOOLEAN_EDATA_TYPE_ARGUMENT = 41;

	/**
	 * The feature id for the '<em><b>Arguments List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EDATA_TYPE_ARGUMENT__ARGUMENTS_LIST = EDATA_TYPE_ARGUMENT__ARGUMENTS_LIST;

	/**
	 * The feature id for the '<em><b>Operation Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EDATA_TYPE_ARGUMENT__OPERATION_CALL = EDATA_TYPE_ARGUMENT__OPERATION_CALL;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EDATA_TYPE_ARGUMENT__VALUE = EDATA_TYPE_ARGUMENT__VALUE;

	/**
	 * The number of structural features of the '<em>Boolean EData Type Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EDATA_TYPE_ARGUMENT_FEATURE_COUNT = EDATA_TYPE_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EParameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EDATA_TYPE_ARGUMENT___GET_EPARAMETER = EDATA_TYPE_ARGUMENT___GET_EPARAMETER;

	/**
	 * The operation id for the '<em>Get Parameter Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EDATA_TYPE_ARGUMENT___GET_PARAMETER_VALUE = EDATA_TYPE_ARGUMENT___GET_PARAMETER_VALUE;

	/**
	 * The number of operations of the '<em>Boolean EData Type Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EDATA_TYPE_ARGUMENT_OPERATION_COUNT = EDATA_TYPE_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.NumericEDataTypeArgumentImpl <em>Numeric EData Type Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.NumericEDataTypeArgumentImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getNumericEDataTypeArgument()
	 * @generated
	 */
	int NUMERIC_EDATA_TYPE_ARGUMENT = 42;

	/**
	 * The feature id for the '<em><b>Arguments List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EDATA_TYPE_ARGUMENT__ARGUMENTS_LIST = EDATA_TYPE_ARGUMENT__ARGUMENTS_LIST;

	/**
	 * The feature id for the '<em><b>Operation Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EDATA_TYPE_ARGUMENT__OPERATION_CALL = EDATA_TYPE_ARGUMENT__OPERATION_CALL;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EDATA_TYPE_ARGUMENT__VALUE = EDATA_TYPE_ARGUMENT__VALUE;

	/**
	 * The number of structural features of the '<em>Numeric EData Type Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EDATA_TYPE_ARGUMENT_FEATURE_COUNT = EDATA_TYPE_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EParameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EDATA_TYPE_ARGUMENT___GET_EPARAMETER = EDATA_TYPE_ARGUMENT___GET_EPARAMETER;

	/**
	 * The operation id for the '<em>Get Parameter Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EDATA_TYPE_ARGUMENT___GET_PARAMETER_VALUE = EDATA_TYPE_ARGUMENT___GET_PARAMETER_VALUE;

	/**
	 * The number of operations of the '<em>Numeric EData Type Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EDATA_TYPE_ARGUMENT_OPERATION_COUNT = EDATA_TYPE_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.StringEDataTypeArgumentImpl <em>String EData Type Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.StringEDataTypeArgumentImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getStringEDataTypeArgument()
	 * @generated
	 */
	int STRING_EDATA_TYPE_ARGUMENT = 43;

	/**
	 * The feature id for the '<em><b>Arguments List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDATA_TYPE_ARGUMENT__ARGUMENTS_LIST = EDATA_TYPE_ARGUMENT__ARGUMENTS_LIST;

	/**
	 * The feature id for the '<em><b>Operation Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDATA_TYPE_ARGUMENT__OPERATION_CALL = EDATA_TYPE_ARGUMENT__OPERATION_CALL;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDATA_TYPE_ARGUMENT__VALUE = EDATA_TYPE_ARGUMENT__VALUE;

	/**
	 * The number of structural features of the '<em>String EData Type Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDATA_TYPE_ARGUMENT_FEATURE_COUNT = EDATA_TYPE_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EParameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDATA_TYPE_ARGUMENT___GET_EPARAMETER = EDATA_TYPE_ARGUMENT___GET_EPARAMETER;

	/**
	 * The operation id for the '<em>Get Parameter Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDATA_TYPE_ARGUMENT___GET_PARAMETER_VALUE = EDATA_TYPE_ARGUMENT___GET_PARAMETER_VALUE;

	/**
	 * The number of operations of the '<em>String EData Type Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EDATA_TYPE_ARGUMENT_OPERATION_COUNT = EDATA_TYPE_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.EEnumArgumentImpl <em>EEnum Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.EEnumArgumentImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getEEnumArgument()
	 * @generated
	 */
	int EENUM_ARGUMENT = 44;

	/**
	 * The feature id for the '<em><b>Arguments List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_ARGUMENT__ARGUMENTS_LIST = ARGUMENT__ARGUMENTS_LIST;

	/**
	 * The feature id for the '<em><b>Operation Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_ARGUMENT__OPERATION_CALL = ARGUMENT__OPERATION_CALL;

	/**
	 * The feature id for the '<em><b>EEnum Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_ARGUMENT__EENUM_LITERAL = ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EEnum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_ARGUMENT__EENUM = ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EEnum Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_ARGUMENT_FEATURE_COUNT = ARGUMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EParameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_ARGUMENT___GET_EPARAMETER = ARGUMENT___GET_EPARAMETER;

	/**
	 * The operation id for the '<em>Get Parameter Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_ARGUMENT___GET_PARAMETER_VALUE = ARGUMENT___GET_PARAMETER_VALUE;

	/**
	 * The number of operations of the '<em>EEnum Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_ARGUMENT_OPERATION_COUNT = ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.EClassArgumentImpl <em>EClass Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.EClassArgumentImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getEClassArgument()
	 * @generated
	 */
	int ECLASS_ARGUMENT = 45;

	/**
	 * The feature id for the '<em><b>Arguments List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_ARGUMENT__ARGUMENTS_LIST = ARGUMENT__ARGUMENTS_LIST;

	/**
	 * The feature id for the '<em><b>Operation Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_ARGUMENT__OPERATION_CALL = ARGUMENT__OPERATION_CALL;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_ARGUMENT__VALUE = ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EClass Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_ARGUMENT_FEATURE_COUNT = ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EParameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_ARGUMENT___GET_EPARAMETER = ARGUMENT___GET_EPARAMETER;

	/**
	 * The operation id for the '<em>Get Parameter Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_ARGUMENT___GET_PARAMETER_VALUE = ARGUMENT___GET_PARAMETER_VALUE;

	/**
	 * The number of operations of the '<em>EClass Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_ARGUMENT_OPERATION_COUNT = ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ProgramRuntimesListImpl <em>Program Runtimes List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ProgramRuntimesListImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getProgramRuntimesList()
	 * @generated
	 */
	int PROGRAM_RUNTIMES_LIST = 46;

	/**
	 * The feature id for the '<em><b>Session</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_RUNTIMES_LIST__SESSION = 0;

	/**
	 * The feature id for the '<em><b>Program Runtimes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_RUNTIMES_LIST__PROGRAM_RUNTIMES = 1;

	/**
	 * The number of structural features of the '<em>Program Runtimes List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_RUNTIMES_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Program Runtimes List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_RUNTIMES_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.AbstractProgramRuntimeImpl <em>Abstract Program Runtime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.AbstractProgramRuntimeImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getAbstractProgramRuntime()
	 * @generated
	 */
	int ABSTRACT_PROGRAM_RUNTIME = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROGRAM_RUNTIME__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROGRAM_RUNTIME__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROGRAM_RUNTIME__STATE = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROGRAM_RUNTIME__PROGRAM = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Program Runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROGRAM_RUNTIME_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROGRAM_RUNTIME___INIT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROGRAM_RUNTIME___TERMINATE = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Resume</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROGRAM_RUNTIME___RESUME = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROGRAM_RUNTIME___SUSPEND = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Step Into</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROGRAM_RUNTIME___STEP_INTO = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Step Over</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROGRAM_RUNTIME___STEP_OVER = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Step Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROGRAM_RUNTIME___STEP_RETURN = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Abstract Program Runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROGRAM_RUNTIME_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallsListProgramRuntimeImpl <em>Operation Calls List Program Runtime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallsListProgramRuntimeImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getOperationCallsListProgramRuntime()
	 * @generated
	 */
	int OPERATION_CALLS_LIST_PROGRAM_RUNTIME = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALLS_LIST_PROGRAM_RUNTIME__NAME = ABSTRACT_PROGRAM_RUNTIME__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALLS_LIST_PROGRAM_RUNTIME__DESCRIPTION = ABSTRACT_PROGRAM_RUNTIME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALLS_LIST_PROGRAM_RUNTIME__STATE = ABSTRACT_PROGRAM_RUNTIME__STATE;

	/**
	 * The feature id for the '<em><b>Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALLS_LIST_PROGRAM_RUNTIME__PROGRAM = ABSTRACT_PROGRAM_RUNTIME__PROGRAM;

	/**
	 * The number of structural features of the '<em>Operation Calls List Program Runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALLS_LIST_PROGRAM_RUNTIME_FEATURE_COUNT = ABSTRACT_PROGRAM_RUNTIME_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALLS_LIST_PROGRAM_RUNTIME___INIT = ABSTRACT_PROGRAM_RUNTIME___INIT;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALLS_LIST_PROGRAM_RUNTIME___TERMINATE = ABSTRACT_PROGRAM_RUNTIME___TERMINATE;

	/**
	 * The operation id for the '<em>Resume</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALLS_LIST_PROGRAM_RUNTIME___RESUME = ABSTRACT_PROGRAM_RUNTIME___RESUME;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALLS_LIST_PROGRAM_RUNTIME___SUSPEND = ABSTRACT_PROGRAM_RUNTIME___SUSPEND;

	/**
	 * The operation id for the '<em>Step Into</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALLS_LIST_PROGRAM_RUNTIME___STEP_INTO = ABSTRACT_PROGRAM_RUNTIME___STEP_INTO;

	/**
	 * The operation id for the '<em>Step Over</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALLS_LIST_PROGRAM_RUNTIME___STEP_OVER = ABSTRACT_PROGRAM_RUNTIME___STEP_OVER;

	/**
	 * The operation id for the '<em>Step Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALLS_LIST_PROGRAM_RUNTIME___STEP_RETURN = ABSTRACT_PROGRAM_RUNTIME___STEP_RETURN;

	/**
	 * The number of operations of the '<em>Operation Calls List Program Runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALLS_LIST_PROGRAM_RUNTIME_OPERATION_COUNT = ABSTRACT_PROGRAM_RUNTIME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.ResultsList <em>Results List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ResultsList
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getResultsList()
	 * @generated
	 */
	int RESULTS_LIST = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST__RESULTS = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Results List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Invocator Session</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST___GET_INVOCATOR_SESSION = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Results List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallResultsListImpl <em>Operation Call Results List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallResultsListImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getOperationCallResultsList()
	 * @generated
	 */
	int OPERATION_CALL_RESULTS_LIST = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST__NAME = RESULTS_LIST__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST__DESCRIPTION = RESULTS_LIST__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST__RESULTS = RESULTS_LIST__RESULTS;

	/**
	 * The feature id for the '<em><b>Data Products List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST__DATA_PRODUCTS_LIST = RESULTS_LIST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST__INVOCATOR_SESSION = RESULTS_LIST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation Call Results List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_FEATURE_COUNT = RESULTS_LIST_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Invocator Session</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST___GET_INVOCATOR_SESSION = RESULTS_LIST___GET_INVOCATOR_SESSION;

	/**
	 * The number of operations of the '<em>Operation Call Results List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_OPERATION_COUNT = RESULTS_LIST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.RecordingResultsListImpl <em>Recording Results List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.RecordingResultsListImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getRecordingResultsList()
	 * @generated
	 */
	int RECORDING_RESULTS_LIST = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDING_RESULTS_LIST__NAME = RESULTS_LIST__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDING_RESULTS_LIST__DESCRIPTION = RESULTS_LIST__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDING_RESULTS_LIST__RESULTS = RESULTS_LIST__RESULTS;

	/**
	 * The feature id for the '<em><b>Data Products List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDING_RESULTS_LIST__DATA_PRODUCTS_LIST = RESULTS_LIST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDING_RESULTS_LIST__INVOCATOR_SESSION = RESULTS_LIST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Recording Results List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDING_RESULTS_LIST_FEATURE_COUNT = RESULTS_LIST_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Invocator Session</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDING_RESULTS_LIST___GET_INVOCATOR_SESSION = RESULTS_LIST___GET_INVOCATOR_SESSION;

	/**
	 * The number of operations of the '<em>Recording Results List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDING_RESULTS_LIST_OPERATION_COUNT = RESULTS_LIST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.AbstractResultImpl <em>Abstract Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.AbstractResultImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getAbstractResult()
	 * @generated
	 */
	int ABSTRACT_RESULT = 52;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT__TIME = ApogyCommonEMFPackage.TIMED__TIME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT__DESCRIPTION = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Results List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT__RESULTS_LIST = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT__INVOCATOR_SESSION = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT__CONTEXT = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Result Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT__RESULT_VALUE = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Abstract Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT_FEATURE_COUNT = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Abstract Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT_OPERATION_COUNT = ApogyCommonEMFPackage.TIMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.AbstractResultValueImpl <em>Abstract Result Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.AbstractResultValueImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getAbstractResultValue()
	 * @generated
	 */
	int ABSTRACT_RESULT_VALUE = 53;

	/**
	 * The feature id for the '<em><b>Result</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT_VALUE__RESULT = 0;

	/**
	 * The number of structural features of the '<em>Abstract Result Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Result Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallResultImpl <em>Operation Call Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallResultImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getOperationCallResult()
	 * @generated
	 */
	int OPERATION_CALL_RESULT = 54;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULT__TIME = ABSTRACT_RESULT__TIME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULT__DESCRIPTION = ABSTRACT_RESULT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Results List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULT__RESULTS_LIST = ABSTRACT_RESULT__RESULTS_LIST;

	/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULT__INVOCATOR_SESSION = ABSTRACT_RESULT__INVOCATOR_SESSION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULT__CONTEXT = ABSTRACT_RESULT__CONTEXT;

	/**
	 * The feature id for the '<em><b>Result Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULT__RESULT_VALUE = ABSTRACT_RESULT__RESULT_VALUE;

	/**
	 * The feature id for the '<em><b>Operation Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULT__OPERATION_CALLS = ABSTRACT_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULT__OPERATION_CALL = ABSTRACT_RESULT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exception Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULT__EXCEPTION_CONTAINER = ABSTRACT_RESULT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation Call Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULT_FEATURE_COUNT = ABSTRACT_RESULT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Invocator Session</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULT___GET_INVOCATOR_SESSION = ABSTRACT_RESULT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operation Call Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULT_OPERATION_COUNT = ABSTRACT_RESULT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ExceptionContainerImpl <em>Exception Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ExceptionContainerImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getExceptionContainer()
	 * @generated
	 */
	int EXCEPTION_CONTAINER = 55;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_CONTAINER__EXCEPTION = 0;

	/**
	 * The number of structural features of the '<em>Exception Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Exception Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.AttributeResultValueImpl <em>Attribute Result Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.AttributeResultValueImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getAttributeResultValue()
	 * @generated
	 */
	int ATTRIBUTE_RESULT_VALUE = 56;

	/**
	 * The feature id for the '<em><b>Result</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RESULT_VALUE__RESULT = ABSTRACT_RESULT_VALUE__RESULT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RESULT_VALUE__VALUE = ABSTRACT_RESULT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Result Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RESULT_VALUE_FEATURE_COUNT = ABSTRACT_RESULT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute Result Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RESULT_VALUE_OPERATION_COUNT = ABSTRACT_RESULT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.AttributeValueImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getAttributeValue()
	 * @generated
	 */
	int ATTRIBUTE_VALUE = 57;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE__OBJECT = 0;

	/**
	 * The number of structural features of the '<em>Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ReferenceResultValueImpl <em>Reference Result Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ReferenceResultValueImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getReferenceResultValue()
	 * @generated
	 */
	int REFERENCE_RESULT_VALUE = 58;

	/**
	 * The feature id for the '<em><b>Result</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_RESULT_VALUE__RESULT = ABSTRACT_RESULT_VALUE__RESULT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_RESULT_VALUE__VALUE = ABSTRACT_RESULT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Result Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_RESULT_VALUE_FEATURE_COUNT = ABSTRACT_RESULT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference Result Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_RESULT_VALUE_OPERATION_COUNT = ABSTRACT_RESULT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.RecordingToolsContainerImpl <em>Recording Tools Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.RecordingToolsContainerImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getRecordingToolsContainer()
	 * @generated
	 */
	int RECORDING_TOOLS_CONTAINER = 59;

	/**
	 * The feature id for the '<em><b>Tools List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDING_TOOLS_CONTAINER__TOOLS_LIST = ABSTRACT_TOOLS_LIST_CONTAINER__TOOLS_LIST;

	/**
	 * The feature id for the '<em><b>Recorder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDING_TOOLS_CONTAINER__RECORDER = ABSTRACT_TOOLS_LIST_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Player</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDING_TOOLS_CONTAINER__PLAYER = ABSTRACT_TOOLS_LIST_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Channels Lists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDING_TOOLS_CONTAINER__CHANNELS_LISTS = ABSTRACT_TOOLS_LIST_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Recording Tools Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDING_TOOLS_CONTAINER_FEATURE_COUNT = ABSTRACT_TOOLS_LIST_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Recording Tools Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDING_TOOLS_CONTAINER_OPERATION_COUNT = ABSTRACT_TOOLS_LIST_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ChannelsListImpl <em>Channels List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ChannelsListImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getChannelsList()
	 * @generated
	 */
	int CHANNELS_LIST = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS_LIST__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS_LIST__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS_LIST__CHANNELS = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Recording Tools Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS_LIST__RECORDING_TOOLS_CONTAINER = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Channels List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS_LIST_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Channels List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS_LIST_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.AbstractChannelImpl <em>Abstract Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.AbstractChannelImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getAbstractChannel()
	 * @generated
	 */
	int ABSTRACT_CHANNEL = 61;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CHANNEL__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CHANNEL__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Channels List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CHANNEL__CHANNELS_LIST = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CHANNEL_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CHANNEL_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.AbstractRecorderImpl <em>Abstract Recorder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.AbstractRecorderImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getAbstractRecorder()
	 * @generated
	 */
	int ABSTRACT_RECORDER = 62;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RECORDER__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RECORDER__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Recording Tools Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RECORDER__RECORDING_TOOLS_CONTAINER = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Recorder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RECORDER_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Recorder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RECORDER_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.AbstractPlayerImpl <em>Abstract Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.AbstractPlayerImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getAbstractPlayer()
	 * @generated
	 */
	int ABSTRACT_PLAYER = 63;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PLAYER__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PLAYER__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Recording Tools Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PLAYER__RECORDING_TOOLS_CONTAINER = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PLAYER_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PLAYER_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallResultsListTimeSourceImpl <em>Operation Call Results List Time Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallResultsListTimeSourceImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getOperationCallResultsListTimeSource()
	 * @generated
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE = 64;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__NAME = ApogyCommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__DESCRIPTION = ApogyCommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__TIME = ApogyCommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__TIME;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__OFFSET = ApogyCommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__OFFSET;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__START_TIME = ApogyCommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__START_TIME;

	/**
	 * The feature id for the '<em><b>Update Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__UPDATE_PERIOD = ApogyCommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__UPDATE_PERIOD;

	/**
	 * The feature id for the '<em><b>Time Acceration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__TIME_ACCERATION = ApogyCommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__TIME_ACCERATION;

	/**
	 * The feature id for the '<em><b>Time Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__TIME_DIRECTION = ApogyCommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__TIME_DIRECTION;

	/**
	 * The feature id for the '<em><b>Loop Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__LOOP_ENABLE = ApogyCommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__LOOP_ENABLE;

	/**
	 * The feature id for the '<em><b>Timeds List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__TIMEDS_LIST = ApogyCommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__TIMEDS_LIST;

	/**
	 * The feature id for the '<em><b>Current Timed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__CURRENT_TIMED_ELEMENT = ApogyCommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__CURRENT_TIMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Earliest Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__EARLIEST_DATE = ApogyCommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__EARLIEST_DATE;

	/**
	 * The feature id for the '<em><b>Latest Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__LATEST_DATE = ApogyCommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__LATEST_DATE;

	/**
	 * The feature id for the '<em><b>Ops Call List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__OPS_CALL_LIST = ApogyCommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation Call Results List Time Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE_FEATURE_COUNT = ApogyCommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE___DISPOSE = ApogyCommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE___DISPOSE;

	/**
	 * The operation id for the '<em>Play Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE___PLAY_FORWARD = ApogyCommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE___PLAY_FORWARD;

	/**
	 * The operation id for the '<em>Play Reverse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE___PLAY_REVERSE = ApogyCommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE___PLAY_REVERSE;

	/**
	 * The operation id for the '<em>Pause</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE___PAUSE = ApogyCommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE___PAUSE;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE___RESET = ApogyCommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE___RESET;

	/**
	 * The operation id for the '<em>Jump To Next</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE___JUMP_TO_NEXT = ApogyCommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE___JUMP_TO_NEXT;

	/**
	 * The operation id for the '<em>Jump To Previous</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE___JUMP_TO_PREVIOUS = ApogyCommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE___JUMP_TO_PREVIOUS;

	/**
	 * The number of operations of the '<em>Operation Call Results List Time Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE_OPERATION_COUNT = ApogyCommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.VariableListenerEventType <em>Variable Listener Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.VariableListenerEventType
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getVariableListenerEventType()
	 * @generated
	 */
	int VARIABLE_LISTENER_EVENT_TYPE = 65;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.ProgramRuntimeState <em>Program Runtime State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ProgramRuntimeState
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getProgramRuntimeState()
	 * @generated
	 */
	int PROGRAM_RUNTIME_STATE = 66;

	/**
	 * The meta object id for the '<em>Throwable</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Throwable
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getThrowable()
	 * @generated
	 */
	int THROWABLE = 67;

	/**
	 * The meta object id for the '<em>Notification</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.notify.Notification
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getNotification()
	 * @generated
	 */
	int NOTIFICATION = 68;

	/**
	 * The meta object id for the '<em>Type Member Implementations EList</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.EList
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getTypeMemberImplementationsEList()
	 * @generated
	 */
	int TYPE_MEMBER_IMPLEMENTATIONS_ELIST = 69;

	/**
	 * The meta object id for the '<em>Type Members Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getTypeMembersArray()
	 * @generated
	 */
	int TYPE_MEMBERS_ARRAY = 70;

	/**
	 * The meta object id for the '<em>IVariable Listener</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.IVariableListener
	 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getIVariableListener()
	 * @generated
	 */
	int IVARIABLE_LISTENER = 71;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade
	 * @generated
	 */
	EClass getApogyCoreInvocatorFacade();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getInitVariableInstancesDate <em>Init Variable Instances Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Variable Instances Date</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getInitVariableInstancesDate()
	 * @see #getApogyCoreInvocatorFacade()
	 * @generated
	 */
	EAttribute getApogyCoreInvocatorFacade_InitVariableInstancesDate();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getActiveInvocatorSession <em>Active Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Invocator Session</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getActiveInvocatorSession()
	 * @see #getApogyCoreInvocatorFacade()
	 * @generated
	 */
	EReference getApogyCoreInvocatorFacade_ActiveInvocatorSession();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#exec(ca.gc.asc_csa.apogy.core.invocator.OperationCall) <em>Exec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exec</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#exec(ca.gc.asc_csa.apogy.core.invocator.OperationCall)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__Exec__OperationCall();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#exec(ca.gc.asc_csa.apogy.core.invocator.OperationCall, boolean) <em>Exec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exec</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#exec(ca.gc.asc_csa.apogy.core.invocator.OperationCall, boolean)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__Exec__OperationCall_boolean();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#exec(ca.gc.asc_csa.apogy.core.invocator.OperationCallsList) <em>Exec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exec</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#exec(ca.gc.asc_csa.apogy.core.invocator.OperationCallsList)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__Exec__OperationCallsList();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getValue(ca.gc.asc_csa.apogy.core.invocator.OperationCallResult) <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getValue(ca.gc.asc_csa.apogy.core.invocator.OperationCallResult)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__GetValue__OperationCallResult();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#createAbstractResultValue(java.lang.Object) <em>Create Abstract Result Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Abstract Result Value</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#createAbstractResultValue(java.lang.Object)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__CreateAbstractResultValue__Object();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getInstance(ca.gc.asc_csa.apogy.core.invocator.Variable) <em>Get Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Instance</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getInstance(ca.gc.asc_csa.apogy.core.invocator.Variable)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__GetInstance__Variable();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getInstanceClass(ca.gc.asc_csa.apogy.core.invocator.Variable) <em>Get Instance Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Instance Class</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getInstanceClass(ca.gc.asc_csa.apogy.core.invocator.Variable)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__GetInstanceClass__Variable();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getTypeApiAdapter(ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference) <em>Get Type Api Adapter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type Api Adapter</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getTypeApiAdapter(ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__GetTypeApiAdapter__VariableFeatureReference();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getInstance(ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference) <em>Get Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Instance</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getInstance(ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__GetInstance__VariableFeatureReference();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getTypeMemberInstance(ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference) <em>Get Type Member Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type Member Instance</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getTypeMemberInstance(ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__GetTypeMemberInstance__VariableFeatureReference();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getEMFFeatureValue(ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference) <em>Get EMF Feature Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EMF Feature Value</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getEMFFeatureValue(ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__GetEMFFeatureValue__VariableFeatureReference();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getInstanceClass(ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference) <em>Get Instance Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Instance Class</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getInstanceClass(ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__GetInstanceClass__VariableFeatureReference();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getTypeImplementation(ca.gc.asc_csa.apogy.core.invocator.OperationCall) <em>Get Type Implementation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type Implementation</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getTypeImplementation(ca.gc.asc_csa.apogy.core.invocator.OperationCall)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__GetTypeImplementation__OperationCall();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getTypeImplementation(ca.gc.asc_csa.apogy.core.invocator.Variable, ca.gc.asc_csa.apogy.core.invocator.AbstractType) <em>Get Type Implementation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type Implementation</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getTypeImplementation(ca.gc.asc_csa.apogy.core.invocator.Variable, ca.gc.asc_csa.apogy.core.invocator.AbstractType)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__GetTypeImplementation__Variable_AbstractType();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getTypeImplementation(ca.gc.asc_csa.apogy.core.invocator.Variable) <em>Get Type Implementation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type Implementation</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getTypeImplementation(ca.gc.asc_csa.apogy.core.invocator.Variable)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__GetTypeImplementation__Variable();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getVariableByName(ca.gc.asc_csa.apogy.core.invocator.InvocatorSession, java.lang.String) <em>Get Variable By Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Variable By Name</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getVariableByName(ca.gc.asc_csa.apogy.core.invocator.InvocatorSession, java.lang.String)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__GetVariableByName__InvocatorSession_String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#createTypeMemberReferences(ca.gc.asc_csa.apogy.core.invocator.TypeMember[]) <em>Create Type Member References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Type Member References</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#createTypeMemberReferences(ca.gc.asc_csa.apogy.core.invocator.TypeMember[])
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__CreateTypeMemberReferences__TypeMember();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getTypeImplementation(ca.gc.asc_csa.apogy.core.invocator.Environment, java.lang.String) <em>Get Type Implementation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type Implementation</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getTypeImplementation(ca.gc.asc_csa.apogy.core.invocator.Environment, java.lang.String)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__GetTypeImplementation__Environment_String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getFullyQualifiedName(ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement) <em>Get Fully Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Fully Qualified Name</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getFullyQualifiedName(ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__GetFullyQualifiedName__TypeMemberReferenceTreeElement();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getFullyQualifiedName(ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode) <em>Get Fully Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Fully Qualified Name</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getFullyQualifiedName(ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__GetFullyQualifiedName__AbstractFeatureNode();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#createTypeMemberImplementations(ca.gc.asc_csa.apogy.core.invocator.Type) <em>Create Type Member Implementations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Type Member Implementations</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#createTypeMemberImplementations(ca.gc.asc_csa.apogy.core.invocator.Type)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__CreateTypeMemberImplementations__Type();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#initVariableInstances(ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Init Variable Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init Variable Instances</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#initVariableInstances(ca.gc.asc_csa.apogy.core.invocator.Environment)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__InitVariableInstances__Environment();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#disposeVariableInstances(ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Dispose Variable Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dispose Variable Instances</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#disposeVariableInstances(ca.gc.asc_csa.apogy.core.invocator.Environment)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__DisposeVariableInstances__Environment();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getOperationCallContainer(ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement) <em>Get Operation Call Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Operation Call Container</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getOperationCallContainer(ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__GetOperationCallContainer__TypeMemberReferenceListElement();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#applyInitializationData(ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Apply Initialization Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Initialization Data</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#applyInitializationData(ca.gc.asc_csa.apogy.core.invocator.Environment)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__ApplyInitializationData__Environment();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#collectInitializationData(ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Collect Initialization Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Collect Initialization Data</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#collectInitializationData(ca.gc.asc_csa.apogy.core.invocator.Environment)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__CollectInitializationData__Environment();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#applyInitializationData(ca.gc.asc_csa.apogy.core.invocator.Variable) <em>Apply Initialization Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Initialization Data</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#applyInitializationData(ca.gc.asc_csa.apogy.core.invocator.Variable)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__ApplyInitializationData__Variable();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#collectInitializationData(ca.gc.asc_csa.apogy.core.invocator.Variable) <em>Collect Initialization Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Collect Initialization Data</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#collectInitializationData(ca.gc.asc_csa.apogy.core.invocator.Variable)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__CollectInitializationData__Variable();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#loadRegisteredTypes(ca.gc.asc_csa.apogy.core.invocator.InvocatorSession) <em>Load Registered Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Registered Types</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#loadRegisteredTypes(ca.gc.asc_csa.apogy.core.invocator.InvocatorSession)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__LoadRegisteredTypes__InvocatorSession();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getAllTypes(ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Get All Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Types</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getAllTypes(ca.gc.asc_csa.apogy.core.invocator.Environment)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__GetAllTypes__Environment();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#addVariableListener(ca.gc.asc_csa.apogy.core.invocator.IVariableListener) <em>Add Variable Listener</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Variable Listener</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#addVariableListener(ca.gc.asc_csa.apogy.core.invocator.IVariableListener)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__AddVariableListener__IVariableListener();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#removeVariableListener(ca.gc.asc_csa.apogy.core.invocator.IVariableListener) <em>Remove Variable Listener</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Variable Listener</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#removeVariableListener(ca.gc.asc_csa.apogy.core.invocator.IVariableListener)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__RemoveVariableListener__IVariableListener();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#notifyVariableListeners(ca.gc.asc_csa.apogy.core.invocator.Variable, ca.gc.asc_csa.apogy.core.invocator.VariableListenerEventType) <em>Notify Variable Listeners</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Notify Variable Listeners</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#notifyVariableListeners(ca.gc.asc_csa.apogy.core.invocator.Variable, ca.gc.asc_csa.apogy.core.invocator.VariableListenerEventType)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__NotifyVariableListeners__Variable_VariableListenerEventType();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#loadInvocatorSession(java.lang.String) <em>Load Invocator Session</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Invocator Session</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#loadInvocatorSession(java.lang.String)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__LoadInvocatorSession__String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getDataProductsByName(ca.gc.asc_csa.apogy.core.invocator.InvocatorSession, java.lang.String) <em>Get Data Products By Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Data Products By Name</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getDataProductsByName(ca.gc.asc_csa.apogy.core.invocator.InvocatorSession, java.lang.String)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__GetDataProductsByName__InvocatorSession_String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getProgramByName(ca.gc.asc_csa.apogy.core.invocator.InvocatorSession, java.lang.String) <em>Get Program By Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Program By Name</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getProgramByName(ca.gc.asc_csa.apogy.core.invocator.InvocatorSession, java.lang.String)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__GetProgramByName__InvocatorSession_String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getContextByName(ca.gc.asc_csa.apogy.core.invocator.InvocatorSession, java.lang.String) <em>Get Context By Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Context By Name</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getContextByName(ca.gc.asc_csa.apogy.core.invocator.InvocatorSession, java.lang.String)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__GetContextByName__InvocatorSession_String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getAllScriptBasedPrograms(ca.gc.asc_csa.apogy.core.invocator.ProgramsList) <em>Get All Script Based Programs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Script Based Programs</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getAllScriptBasedPrograms(ca.gc.asc_csa.apogy.core.invocator.ProgramsList)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__GetAllScriptBasedPrograms__ProgramsList();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#createContext(ca.gc.asc_csa.apogy.core.invocator.InvocatorSession) <em>Create Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Context</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#createContext(ca.gc.asc_csa.apogy.core.invocator.InvocatorSession)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorFacade__CreateContext__InvocatorSession();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.InvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invocator Session</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.InvocatorSession
	 * @generated
	 */
	EClass getInvocatorSession();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.invocator.InvocatorSession#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.InvocatorSession#getEnvironment()
	 * @see #getInvocatorSession()
	 * @generated
	 */
	EReference getInvocatorSession_Environment();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.invocator.InvocatorSession#getProgramsList <em>Programs List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Programs List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.InvocatorSession#getProgramsList()
	 * @see #getInvocatorSession()
	 * @generated
	 */
	EReference getInvocatorSession_ProgramsList();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.invocator.InvocatorSession#getProgramRuntimesList <em>Program Runtimes List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program Runtimes List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.InvocatorSession#getProgramRuntimesList()
	 * @see #getInvocatorSession()
	 * @generated
	 */
	EReference getInvocatorSession_ProgramRuntimesList();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.invocator.InvocatorSession#getDataProductsListContainer <em>Data Products List Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Products List Container</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.InvocatorSession#getDataProductsListContainer()
	 * @see #getInvocatorSession()
	 * @generated
	 */
	EReference getInvocatorSession_DataProductsListContainer();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.invocator.InvocatorSession#getToolsList <em>Tools List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tools List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.InvocatorSession#getToolsList()
	 * @see #getInvocatorSession()
	 * @generated
	 */
	EReference getInvocatorSession_ToolsList();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.invocator.Environment#getInvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Invocator Session</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Environment#getInvocatorSession()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_InvocatorSession();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.invocator.Environment#getTypesList <em>Types List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Types List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Environment#getTypesList()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_TypesList();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.invocator.Environment#getVariablesList <em>Variables List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variables List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Environment#getVariablesList()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_VariablesList();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.invocator.Environment#getContextsList <em>Contexts List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contexts List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Environment#getContextsList()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_ContextsList();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.Environment#getActiveContext <em>Active Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Context</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Environment#getActiveContext()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_ActiveContext();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.DataProductsListsContainer <em>Data Products Lists Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Products Lists Container</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.DataProductsListsContainer
	 * @generated
	 */
	EClass getDataProductsListsContainer();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.invocator.DataProductsListsContainer#getInvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Invocator Session</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.DataProductsListsContainer#getInvocatorSession()
	 * @see #getDataProductsListsContainer()
	 * @generated
	 */
	EReference getDataProductsListsContainer_InvocatorSession();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.invocator.DataProductsListsContainer#getDataProductsList <em>Data Products List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Products List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.DataProductsListsContainer#getDataProductsList()
	 * @see #getDataProductsListsContainer()
	 * @generated
	 */
	EReference getDataProductsListsContainer_DataProductsList();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.DataProductsList <em>Data Products List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Products List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.DataProductsList
	 * @generated
	 */
	EClass getDataProductsList();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.invocator.DataProductsList#getDataProductsListsContainer <em>Data Products Lists Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Products Lists Container</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.DataProductsList#getDataProductsListsContainer()
	 * @see #getDataProductsList()
	 * @generated
	 */
	EReference getDataProductsList_DataProductsListsContainer();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.invocator.DataProductsList#getOperationCallResultsList <em>Operation Call Results List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation Call Results List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.DataProductsList#getOperationCallResultsList()
	 * @see #getDataProductsList()
	 * @generated
	 */
	EReference getDataProductsList_OperationCallResultsList();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.invocator.DataProductsList#getRecordingResultsList <em>Recording Results List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recording Results List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.DataProductsList#getRecordingResultsList()
	 * @see #getDataProductsList()
	 * @generated
	 */
	EReference getDataProductsList_RecordingResultsList();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.DataProductsList#getInvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invocator Session</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.DataProductsList#getInvocatorSession()
	 * @see #getDataProductsList()
	 * @generated
	 */
	EReference getDataProductsList_InvocatorSession();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.ToolsList <em>Tools List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tools List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ToolsList
	 * @generated
	 */
	EClass getToolsList();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.invocator.ToolsList#getInvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Invocator Session</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ToolsList#getInvocatorSession()
	 * @see #getToolsList()
	 * @generated
	 */
	EReference getToolsList_InvocatorSession();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.invocator.ToolsList#getToolsListContainers <em>Tools List Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tools List Containers</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ToolsList#getToolsListContainers()
	 * @see #getToolsList()
	 * @generated
	 */
	EReference getToolsList_ToolsListContainers();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractToolsListContainer <em>Abstract Tools List Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Tools List Container</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractToolsListContainer
	 * @generated
	 */
	EClass getAbstractToolsListContainer();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractToolsListContainer#getToolsList <em>Tools List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tools List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractToolsListContainer#getToolsList()
	 * @see #getAbstractToolsListContainer()
	 * @generated
	 */
	EReference getAbstractToolsListContainer_ToolsList();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.TypesList <em>Types List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Types List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypesList
	 * @generated
	 */
	EClass getTypesList();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.invocator.TypesList#getLocalTypes <em>Local Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Types</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypesList#getLocalTypes()
	 * @see #getTypesList()
	 * @generated
	 */
	EReference getTypesList_LocalTypes();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.invocator.TypesList#getRegisteredTypes <em>Registered Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registered Types</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypesList#getRegisteredTypes()
	 * @see #getTypesList()
	 * @generated
	 */
	EReference getTypesList_RegisteredTypes();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.LocalTypesList <em>Local Types List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Types List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.LocalTypesList
	 * @generated
	 */
	EClass getLocalTypesList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.invocator.LocalTypesList#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.LocalTypesList#getTypes()
	 * @see #getLocalTypesList()
	 * @generated
	 */
	EReference getLocalTypesList_Types();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.RegisteredTypesList <em>Registered Types List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registered Types List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.RegisteredTypesList
	 * @generated
	 */
	EClass getRegisteredTypesList();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.core.invocator.RegisteredTypesList#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Types</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.RegisteredTypesList#getTypes()
	 * @see #getRegisteredTypesList()
	 * @generated
	 */
	EReference getRegisteredTypesList_Types();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractType <em>Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Type</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractType
	 * @generated
	 */
	EClass getAbstractType();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.invocator.Type#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Type#getMembers()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Members();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.Type#getInterfaceClass <em>Interface Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface Class</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Type#getInterfaceClass()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_InterfaceClass();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.Type#getTypeApiAdapterClass <em>Type Api Adapter Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Api Adapter Class</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Type#getTypeApiAdapterClass()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_TypeApiAdapterClass();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter <em>Type Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Api Adapter</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter
	 * @generated
	 */
	EClass getTypeApiAdapter();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Environment</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter#getEnvironment()
	 * @see #getTypeApiAdapter()
	 * @generated
	 */
	EReference getTypeApiAdapter_Environment();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter#getInstance()
	 * @see #getTypeApiAdapter()
	 * @generated
	 */
	EReference getTypeApiAdapter_Instance();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Type</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter#getElementType()
	 * @see #getTypeApiAdapter()
	 * @generated
	 */
	EReference getTypeApiAdapter_ElementType();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter#init(ca.gc.asc_csa.apogy.core.invocator.Environment, ca.gc.asc_csa.apogy.core.invocator.Type, org.eclipse.emf.ecore.EObject) <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter#init(ca.gc.asc_csa.apogy.core.invocator.Environment, ca.gc.asc_csa.apogy.core.invocator.Type, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTypeApiAdapter__Init__Environment_Type_EObject();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter#apply(ca.gc.asc_csa.apogy.core.invocator.AbstractInitializationData) <em>Apply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter#apply(ca.gc.asc_csa.apogy.core.invocator.AbstractInitializationData)
	 * @generated
	 */
	EOperation getTypeApiAdapter__Apply__AbstractInitializationData();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter#createInitializationData() <em>Create Initialization Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Initialization Data</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter#createInitializationData()
	 * @generated
	 */
	EOperation getTypeApiAdapter__CreateInitializationData();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter#collect(ca.gc.asc_csa.apogy.core.invocator.AbstractInitializationData) <em>Collect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Collect</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter#collect(ca.gc.asc_csa.apogy.core.invocator.AbstractInitializationData)
	 * @generated
	 */
	EOperation getTypeApiAdapter__Collect__AbstractInitializationData();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter#createResult(ca.gc.asc_csa.apogy.core.invocator.OperationCall) <em>Create Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Result</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter#createResult(ca.gc.asc_csa.apogy.core.invocator.OperationCall)
	 * @generated
	 */
	EOperation getTypeApiAdapter__CreateResult__OperationCall();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter#createResult(ca.gc.asc_csa.apogy.core.invocator.OperationCall, long, java.lang.Object, java.lang.Exception) <em>Create Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Result</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter#createResult(ca.gc.asc_csa.apogy.core.invocator.OperationCall, long, java.lang.Object, java.lang.Exception)
	 * @generated
	 */
	EOperation getTypeApiAdapter__CreateResult__OperationCall_long_Object_Exception();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter#invoke(org.eclipse.emf.ecore.EObject, ca.gc.asc_csa.apogy.core.invocator.OperationCall, boolean) <em>Invoke</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Invoke</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter#invoke(org.eclipse.emf.ecore.EObject, ca.gc.asc_csa.apogy.core.invocator.OperationCall, boolean)
	 * @generated
	 */
	EOperation getTypeApiAdapter__Invoke__EObject_OperationCall_boolean();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter#dispose() <em>Dispose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dispose</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter#dispose()
	 * @generated
	 */
	EOperation getTypeApiAdapter__Dispose();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMember <em>Type Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Member</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeMember
	 * @generated
	 */
	EClass getTypeMember();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMember#getMemberType <em>Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Type</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeMember#getMemberType()
	 * @see #getTypeMember()
	 * @generated
	 */
	EReference getTypeMember_MemberType();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMember#getTypeFeatureRootNode <em>Type Feature Root Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Feature Root Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeMember#getTypeFeatureRootNode()
	 * @see #getTypeMember()
	 * @generated
	 */
	EReference getTypeMember_TypeFeatureRootNode();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReference <em>Type Member Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Member Reference</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeMemberReference
	 * @generated
	 */
	EClass getTypeMemberReference();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReference#getTypeMember <em>Type Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Member</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeMemberReference#getTypeMember()
	 * @see #getTypeMemberReference()
	 * @generated
	 */
	EReference getTypeMemberReference_TypeMember();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement <em>Type Member Reference List Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Member Reference List Element</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement
	 * @generated
	 */
	EClass getTypeMemberReferenceListElement();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement#getChild()
	 * @see #getTypeMemberReferenceListElement()
	 * @generated
	 */
	EReference getTypeMemberReferenceListElement_Child();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement#getParent()
	 * @see #getTypeMemberReferenceListElement()
	 * @generated
	 */
	EReference getTypeMemberReferenceListElement_Parent();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement#isRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement#isRoot()
	 * @see #getTypeMemberReferenceListElement()
	 * @generated
	 */
	EAttribute getTypeMemberReferenceListElement_Root();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement#getRootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Element</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement#getRootElement()
	 * @see #getTypeMemberReferenceListElement()
	 * @generated
	 */
	EReference getTypeMemberReferenceListElement_RootElement();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement#getLeafElement <em>Leaf Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Leaf Element</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement#getLeafElement()
	 * @see #getTypeMemberReferenceListElement()
	 * @generated
	 */
	EReference getTypeMemberReferenceListElement_LeafElement();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement#isLeaf <em>Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leaf</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement#isLeaf()
	 * @see #getTypeMemberReferenceListElement()
	 * @generated
	 */
	EAttribute getTypeMemberReferenceListElement_Leaf();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement#getSubSegmentsCount <em>Sub Segments Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Segments Count</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement#getSubSegmentsCount()
	 * @see #getTypeMemberReferenceListElement()
	 * @generated
	 */
	EAttribute getTypeMemberReferenceListElement_SubSegmentsCount();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement <em>Type Member Reference Tree Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Member Reference Tree Element</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement
	 * @generated
	 */
	EClass getTypeMemberReferenceTreeElement();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement#getChild()
	 * @see #getTypeMemberReferenceTreeElement()
	 * @generated
	 */
	EReference getTypeMemberReferenceTreeElement_Child();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement#getParent()
	 * @see #getTypeMemberReferenceTreeElement()
	 * @generated
	 */
	EReference getTypeMemberReferenceTreeElement_Parent();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement#getFeatureRootNode <em>Feature Root Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Root Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement#getFeatureRootNode()
	 * @see #getTypeMemberReferenceTreeElement()
	 * @generated
	 */
	EReference getTypeMemberReferenceTreeElement_FeatureRootNode();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement#isRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement#isRoot()
	 * @see #getTypeMemberReferenceTreeElement()
	 * @generated
	 */
	EAttribute getTypeMemberReferenceTreeElement_Root();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement#getRootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Element</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement#getRootElement()
	 * @see #getTypeMemberReferenceTreeElement()
	 * @generated
	 */
	EReference getTypeMemberReferenceTreeElement_RootElement();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement#isLeaf <em>Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leaf</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement#isLeaf()
	 * @see #getTypeMemberReferenceTreeElement()
	 * @generated
	 */
	EAttribute getTypeMemberReferenceTreeElement_Leaf();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.VariablesList <em>Variables List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variables List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.VariablesList
	 * @generated
	 */
	EClass getVariablesList();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.invocator.VariablesList#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Environment</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.VariablesList#getEnvironment()
	 * @see #getVariablesList()
	 * @generated
	 */
	EReference getVariablesList_Environment();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.invocator.VariablesList#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.VariablesList#getVariables()
	 * @see #getVariablesList()
	 * @generated
	 */
	EReference getVariablesList_Variables();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.invocator.Variable#getVariablesList <em>Variables List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Variables List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Variable#getVariablesList()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_VariablesList();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.Variable#getVariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable Type</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Variable#getVariableType()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_VariableType();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.Variable#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Environment</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Variable#getEnvironment()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Environment();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.ContextsList <em>Contexts List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contexts List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ContextsList
	 * @generated
	 */
	EClass getContextsList();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.invocator.ContextsList#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Environment</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ContextsList#getEnvironment()
	 * @see #getContextsList()
	 * @generated
	 */
	EReference getContextsList_Environment();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.invocator.ContextsList#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ContextsList#getContexts()
	 * @see #getContextsList()
	 * @generated
	 */
	EReference getContextsList_Contexts();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.invocator.Context#isArchived <em>Archived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archived</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Context#isArchived()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_Archived();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.invocator.Context#getContextsList <em>Contexts List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Contexts List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Context#getContextsList()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_ContextsList();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.invocator.Context#getVariableImplementationsList <em>Variable Implementations List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable Implementations List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Context#getVariableImplementationsList()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_VariableImplementationsList();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.Context#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Environment</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Context#getEnvironment()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Environment();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.Context#getDataProductsList <em>Data Products List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Products List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Context#getDataProductsList()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_DataProductsList();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.invocator.Context#getInstancesCreationDate <em>Instances Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instances Creation Date</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Context#getInstancesCreationDate()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_InstancesCreationDate();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.invocator.Context#getInstancesDisposalDate <em>Instances Disposal Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instances Disposal Date</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Context#getInstancesDisposalDate()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_InstancesDisposalDate();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.invocator.Context#isVariablesInstantiated <em>Variables Instantiated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variables Instantiated</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Context#isVariablesInstantiated()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_VariablesInstantiated();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.VariableImplementationsList <em>Variable Implementations List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Implementations List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.VariableImplementationsList
	 * @generated
	 */
	EClass getVariableImplementationsList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.invocator.VariableImplementationsList#getVariableImplementations <em>Variable Implementations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable Implementations</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.VariableImplementationsList#getVariableImplementations()
	 * @see #getVariableImplementationsList()
	 * @generated
	 */
	EReference getVariableImplementationsList_VariableImplementations();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.VariableImplementationsList#getVariableImplementation(ca.gc.asc_csa.apogy.core.invocator.Variable) <em>Get Variable Implementation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Variable Implementation</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.VariableImplementationsList#getVariableImplementation(ca.gc.asc_csa.apogy.core.invocator.Variable)
	 * @generated
	 */
	EOperation getVariableImplementationsList__GetVariableImplementation__Variable();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.VariableImplementationsList#getVariableImplementation(java.lang.String) <em>Get Variable Implementation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Variable Implementation</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.VariableImplementationsList#getVariableImplementation(java.lang.String)
	 * @generated
	 */
	EOperation getVariableImplementationsList__GetVariableImplementation__String();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractInitializationData <em>Abstract Initialization Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Initialization Data</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractInitializationData
	 * @generated
	 */
	EClass getAbstractInitializationData();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.InitializationData <em>Initialization Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initialization Data</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.InitializationData
	 * @generated
	 */
	EClass getInitializationData();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation <em>Abstract Type Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Type Implementation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation
	 * @generated
	 */
	EClass getAbstractTypeImplementation();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation#getTypeMemberImplementations <em>Type Member Implementations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Member Implementations</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation#getTypeMemberImplementations()
	 * @see #getAbstractTypeImplementation()
	 * @generated
	 */
	EReference getAbstractTypeImplementation_TypeMemberImplementations();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation#getImplementationClass <em>Implementation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementation Class</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation#getImplementationClass()
	 * @see #getAbstractTypeImplementation()
	 * @generated
	 */
	EReference getAbstractTypeImplementation_ImplementationClass();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation#getAbstractInitializationData <em>Abstract Initialization Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Initialization Data</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation#getAbstractInitializationData()
	 * @see #getAbstractTypeImplementation()
	 * @generated
	 */
	EReference getAbstractTypeImplementation_AbstractInitializationData();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation#getInstance()
	 * @see #getAbstractTypeImplementation()
	 * @generated
	 */
	EReference getAbstractTypeImplementation_Instance();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation#getAdapterInstance <em>Adapter Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Adapter Instance</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation#getAdapterInstance()
	 * @see #getAbstractTypeImplementation()
	 * @generated
	 */
	EReference getAbstractTypeImplementation_AdapterInstance();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation#getHandlingType <em>Handling Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Handling Type</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation#getHandlingType()
	 * @see #getAbstractTypeImplementation()
	 * @generated
	 */
	EReference getAbstractTypeImplementation_HandlingType();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation#getTypeMemberImplementation(java.lang.String) <em>Get Type Member Implementation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type Member Implementation</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation#getTypeMemberImplementation(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractTypeImplementation__GetTypeMemberImplementation__String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation#getTypeMemberImplementation(ca.gc.asc_csa.apogy.core.invocator.TypeMember) <em>Get Type Member Implementation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type Member Implementation</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation#getTypeMemberImplementation(ca.gc.asc_csa.apogy.core.invocator.TypeMember)
	 * @generated
	 */
	EOperation getAbstractTypeImplementation__GetTypeMemberImplementation__TypeMember();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.VariableImplementation <em>Variable Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Implementation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.VariableImplementation
	 * @generated
	 */
	EClass getVariableImplementation();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.invocator.VariableImplementation#getVariableImplementationsList <em>Variable Implementations List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Variable Implementations List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.VariableImplementation#getVariableImplementationsList()
	 * @see #getVariableImplementation()
	 * @generated
	 */
	EReference getVariableImplementation_VariableImplementationsList();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.VariableImplementation#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.VariableImplementation#getVariable()
	 * @see #getVariableImplementation()
	 * @generated
	 */
	EReference getVariableImplementation_Variable();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberImplementation <em>Type Member Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Member Implementation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeMemberImplementation
	 * @generated
	 */
	EClass getTypeMemberImplementation();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberImplementation#getTypeMember <em>Type Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Member</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeMemberImplementation#getTypeMember()
	 * @see #getTypeMemberImplementation()
	 * @generated
	 */
	EReference getTypeMemberImplementation_TypeMember();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.ValuesList <em>Values List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Values List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ValuesList
	 * @generated
	 */
	EClass getValuesList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.invocator.ValuesList#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ValuesList#getValues()
	 * @see #getValuesList()
	 * @generated
	 */
	EReference getValuesList_Values();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.invocator.Value#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Value#getValue()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_Value();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.ProgramsList <em>Programs List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programs List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ProgramsList
	 * @generated
	 */
	EClass getProgramsList();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.invocator.ProgramsList#getInvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Invocator Session</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ProgramsList#getInvocatorSession()
	 * @see #getProgramsList()
	 * @generated
	 */
	EReference getProgramsList_InvocatorSession();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.invocator.ProgramsList#getProgramsGroups <em>Programs Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programs Groups</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ProgramsList#getProgramsGroups()
	 * @see #getProgramsList()
	 * @generated
	 */
	EReference getProgramsList_ProgramsGroups();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup <em>Programs Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programs Group</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup
	 * @generated
	 */
	EClass getProgramsGroup();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup#getProgramsList <em>Programs List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Programs List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup#getProgramsList()
	 * @see #getProgramsGroup()
	 * @generated
	 */
	EReference getProgramsGroup_ProgramsList();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup#getInvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invocator Session</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup#getInvocatorSession()
	 * @see #getProgramsGroup()
	 * @generated
	 */
	EReference getProgramsGroup_InvocatorSession();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup#getPrograms <em>Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programs</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup#getPrograms()
	 * @see #getProgramsGroup()
	 * @generated
	 */
	EReference getProgramsGroup_Programs();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.invocator.Program#getProgramsGroup <em>Programs Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Programs Group</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Program#getProgramsGroup()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_ProgramsGroup();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.Program#getInvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invocator Session</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Program#getInvocatorSession()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_InvocatorSession();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.ScriptBasedProgram <em>Script Based Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Based Program</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ScriptBasedProgram
	 * @generated
	 */
	EClass getScriptBasedProgram();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.TriggeredBasedProgram <em>Triggered Based Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triggered Based Program</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TriggeredBasedProgram
	 * @generated
	 */
	EClass getTriggeredBasedProgram();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCallContainer <em>Operation Call Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Call Container</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCallContainer
	 * @generated
	 */
	EClass getOperationCallContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCallContainer#getOperationCalls <em>Operation Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Calls</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCallContainer#getOperationCalls()
	 * @see #getOperationCallContainer()
	 * @generated
	 */
	EReference getOperationCallContainer_OperationCalls();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCallContainer#getInvocatorSession() <em>Get Invocator Session</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Invocator Session</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCallContainer#getInvocatorSession()
	 * @generated
	 */
	EOperation getOperationCallContainer__GetInvocatorSession();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCallsList <em>Operation Calls List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Calls List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCallsList
	 * @generated
	 */
	EClass getOperationCallsList();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference <em>Variable Feature Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Feature Reference</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference
	 * @generated
	 */
	EClass getVariableFeatureReference();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference#getVariable()
	 * @see #getVariableFeatureReference()
	 * @generated
	 */
	EReference getVariableFeatureReference_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference#getTypeMemberReferenceListElement <em>Type Member Reference List Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Member Reference List Element</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference#getTypeMemberReferenceListElement()
	 * @see #getVariableFeatureReference()
	 * @generated
	 */
	EReference getVariableFeatureReference_TypeMemberReferenceListElement();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference#getFeatureRoot <em>Feature Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Root</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference#getFeatureRoot()
	 * @see #getVariableFeatureReference()
	 * @generated
	 */
	EReference getVariableFeatureReference_FeatureRoot();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCall <em>Operation Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Call</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCall
	 * @generated
	 */
	EClass getOperationCall();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCall#getEOperation <em>EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EOperation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCall#getEOperation()
	 * @see #getOperationCall()
	 * @generated
	 */
	EReference getOperationCall_EOperation();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCall#getArgumentsList <em>Arguments List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arguments List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCall#getArgumentsList()
	 * @see #getOperationCall()
	 * @generated
	 */
	EReference getOperationCall_ArgumentsList();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCall#getOperationCallContainer <em>Operation Call Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation Call Container</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCall#getOperationCallContainer()
	 * @see #getOperationCall()
	 * @generated
	 */
	EReference getOperationCall_OperationCallContainer();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCall#getInvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invocator Session</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCall#getInvocatorSession()
	 * @see #getOperationCall()
	 * @generated
	 */
	EReference getOperationCall_InvocatorSession();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCall#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Environment</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCall#getEnvironment()
	 * @see #getOperationCall()
	 * @generated
	 */
	EReference getOperationCall_Environment();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.ArgumentsList <em>Arguments List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arguments List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ArgumentsList
	 * @generated
	 */
	EClass getArgumentsList();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.invocator.ArgumentsList#getOperationCall <em>Operation Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation Call</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ArgumentsList#getOperationCall()
	 * @see #getArgumentsList()
	 * @generated
	 */
	EReference getArgumentsList_OperationCall();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.invocator.ArgumentsList#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ArgumentsList#getArguments()
	 * @see #getArgumentsList()
	 * @generated
	 */
	EReference getArgumentsList_Arguments();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ArgumentsList#getArgumentValues() <em>Get Argument Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Argument Values</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ArgumentsList#getArgumentValues()
	 * @generated
	 */
	EOperation getArgumentsList__GetArgumentValues();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.invocator.Argument#getArgumentsList <em>Arguments List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Arguments List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Argument#getArgumentsList()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_ArgumentsList();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.Argument#getOperationCall <em>Operation Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation Call</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Argument#getOperationCall()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_OperationCall();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.Argument#getEParameter() <em>Get EParameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EParameter</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Argument#getEParameter()
	 * @generated
	 */
	EOperation getArgument__GetEParameter();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.Argument#getParameterValue() <em>Get Parameter Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Parameter Value</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Argument#getParameterValue()
	 * @generated
	 */
	EOperation getArgument__GetParameterValue();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.EDataTypeArgument <em>EData Type Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EData Type Argument</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.EDataTypeArgument
	 * @generated
	 */
	EClass getEDataTypeArgument();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.invocator.EDataTypeArgument#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.EDataTypeArgument#getValue()
	 * @see #getEDataTypeArgument()
	 * @generated
	 */
	EAttribute getEDataTypeArgument_Value();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.BooleanEDataTypeArgument <em>Boolean EData Type Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean EData Type Argument</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.BooleanEDataTypeArgument
	 * @generated
	 */
	EClass getBooleanEDataTypeArgument();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.NumericEDataTypeArgument <em>Numeric EData Type Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric EData Type Argument</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.NumericEDataTypeArgument
	 * @generated
	 */
	EClass getNumericEDataTypeArgument();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.StringEDataTypeArgument <em>String EData Type Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String EData Type Argument</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.StringEDataTypeArgument
	 * @generated
	 */
	EClass getStringEDataTypeArgument();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.EEnumArgument <em>EEnum Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEnum Argument</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.EEnumArgument
	 * @generated
	 */
	EClass getEEnumArgument();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.EEnumArgument#getEEnumLiteral <em>EEnum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EEnum Literal</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.EEnumArgument#getEEnumLiteral()
	 * @see #getEEnumArgument()
	 * @generated
	 */
	EReference getEEnumArgument_EEnumLiteral();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.EEnumArgument#getEEnum <em>EEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EEnum</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.EEnumArgument#getEEnum()
	 * @see #getEEnumArgument()
	 * @generated
	 */
	EReference getEEnumArgument_EEnum();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.EClassArgument <em>EClass Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClass Argument</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.EClassArgument
	 * @generated
	 */
	EClass getEClassArgument();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.invocator.EClassArgument#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.EClassArgument#getValue()
	 * @see #getEClassArgument()
	 * @generated
	 */
	EReference getEClassArgument_Value();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.ProgramRuntimesList <em>Program Runtimes List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Runtimes List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ProgramRuntimesList
	 * @generated
	 */
	EClass getProgramRuntimesList();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.invocator.ProgramRuntimesList#getSession <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Session</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ProgramRuntimesList#getSession()
	 * @see #getProgramRuntimesList()
	 * @generated
	 */
	EReference getProgramRuntimesList_Session();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.invocator.ProgramRuntimesList#getProgramRuntimes <em>Program Runtimes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Program Runtimes</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ProgramRuntimesList#getProgramRuntimes()
	 * @see #getProgramRuntimesList()
	 * @generated
	 */
	EReference getProgramRuntimesList_ProgramRuntimes();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractProgramRuntime <em>Abstract Program Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Program Runtime</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractProgramRuntime
	 * @generated
	 */
	EClass getAbstractProgramRuntime();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractProgramRuntime#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractProgramRuntime#getState()
	 * @see #getAbstractProgramRuntime()
	 * @generated
	 */
	EAttribute getAbstractProgramRuntime_State();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractProgramRuntime#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Program</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractProgramRuntime#getProgram()
	 * @see #getAbstractProgramRuntime()
	 * @generated
	 */
	EReference getAbstractProgramRuntime_Program();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractProgramRuntime#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractProgramRuntime#init()
	 * @generated
	 */
	EOperation getAbstractProgramRuntime__Init();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractProgramRuntime#terminate() <em>Terminate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Terminate</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractProgramRuntime#terminate()
	 * @generated
	 */
	EOperation getAbstractProgramRuntime__Terminate();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractProgramRuntime#resume() <em>Resume</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resume</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractProgramRuntime#resume()
	 * @generated
	 */
	EOperation getAbstractProgramRuntime__Resume();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractProgramRuntime#suspend() <em>Suspend</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Suspend</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractProgramRuntime#suspend()
	 * @generated
	 */
	EOperation getAbstractProgramRuntime__Suspend();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractProgramRuntime#stepInto() <em>Step Into</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Step Into</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractProgramRuntime#stepInto()
	 * @generated
	 */
	EOperation getAbstractProgramRuntime__StepInto();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractProgramRuntime#stepOver() <em>Step Over</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Step Over</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractProgramRuntime#stepOver()
	 * @generated
	 */
	EOperation getAbstractProgramRuntime__StepOver();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractProgramRuntime#stepReturn() <em>Step Return</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Step Return</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractProgramRuntime#stepReturn()
	 * @generated
	 */
	EOperation getAbstractProgramRuntime__StepReturn();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCallsListProgramRuntime <em>Operation Calls List Program Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Calls List Program Runtime</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCallsListProgramRuntime
	 * @generated
	 */
	EClass getOperationCallsListProgramRuntime();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.ResultsList <em>Results List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Results List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ResultsList
	 * @generated
	 */
	EClass getResultsList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.invocator.ResultsList#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ResultsList#getResults()
	 * @see #getResultsList()
	 * @generated
	 */
	EReference getResultsList_Results();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ResultsList#getInvocatorSession() <em>Get Invocator Session</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Invocator Session</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ResultsList#getInvocatorSession()
	 * @generated
	 */
	EOperation getResultsList__GetInvocatorSession();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsList <em>Operation Call Results List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Call Results List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsList
	 * @generated
	 */
	EClass getOperationCallResultsList();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsList#getDataProductsList <em>Data Products List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Products List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsList#getDataProductsList()
	 * @see #getOperationCallResultsList()
	 * @generated
	 */
	EReference getOperationCallResultsList_DataProductsList();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsList#getInvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invocator Session</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsList#getInvocatorSession()
	 * @see #getOperationCallResultsList()
	 * @generated
	 */
	EReference getOperationCallResultsList_InvocatorSession();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.RecordingResultsList <em>Recording Results List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recording Results List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.RecordingResultsList
	 * @generated
	 */
	EClass getRecordingResultsList();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.invocator.RecordingResultsList#getDataProductsList <em>Data Products List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Products List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.RecordingResultsList#getDataProductsList()
	 * @see #getRecordingResultsList()
	 * @generated
	 */
	EReference getRecordingResultsList_DataProductsList();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.RecordingResultsList#getInvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invocator Session</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.RecordingResultsList#getInvocatorSession()
	 * @see #getRecordingResultsList()
	 * @generated
	 */
	EReference getRecordingResultsList_InvocatorSession();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractResult <em>Abstract Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Result</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractResult
	 * @generated
	 */
	EClass getAbstractResult();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractResult#getResultsList <em>Results List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Results List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractResult#getResultsList()
	 * @see #getAbstractResult()
	 * @generated
	 */
	EReference getAbstractResult_ResultsList();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractResult#getInvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invocator Session</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractResult#getInvocatorSession()
	 * @see #getAbstractResult()
	 * @generated
	 */
	EReference getAbstractResult_InvocatorSession();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractResult#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractResult#getContext()
	 * @see #getAbstractResult()
	 * @generated
	 */
	EReference getAbstractResult_Context();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractResult#getResultValue <em>Result Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result Value</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractResult#getResultValue()
	 * @see #getAbstractResult()
	 * @generated
	 */
	EReference getAbstractResult_ResultValue();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractResultValue <em>Abstract Result Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Result Value</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractResultValue
	 * @generated
	 */
	EClass getAbstractResultValue();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractResultValue#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Result</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractResultValue#getResult()
	 * @see #getAbstractResultValue()
	 * @generated
	 */
	EReference getAbstractResultValue_Result();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCallResult <em>Operation Call Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Call Result</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCallResult
	 * @generated
	 */
	EClass getOperationCallResult();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCallResult#getOperationCall <em>Operation Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation Call</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCallResult#getOperationCall()
	 * @see #getOperationCallResult()
	 * @generated
	 */
	EReference getOperationCallResult_OperationCall();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCallResult#getExceptionContainer <em>Exception Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception Container</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCallResult#getExceptionContainer()
	 * @see #getOperationCallResult()
	 * @generated
	 */
	EReference getOperationCallResult_ExceptionContainer();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.ExceptionContainer <em>Exception Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Container</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ExceptionContainer
	 * @generated
	 */
	EClass getExceptionContainer();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.invocator.ExceptionContainer#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ExceptionContainer#getException()
	 * @see #getExceptionContainer()
	 * @generated
	 */
	EAttribute getExceptionContainer_Exception();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.AttributeResultValue <em>Attribute Result Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Result Value</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AttributeResultValue
	 * @generated
	 */
	EClass getAttributeResultValue();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.invocator.AttributeResultValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AttributeResultValue#getValue()
	 * @see #getAttributeResultValue()
	 * @generated
	 */
	EReference getAttributeResultValue_Value();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.AttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AttributeValue
	 * @generated
	 */
	EClass getAttributeValue();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.invocator.AttributeValue#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AttributeValue#getObject()
	 * @see #getAttributeValue()
	 * @generated
	 */
	EAttribute getAttributeValue_Object();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.ReferenceResultValue <em>Reference Result Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Result Value</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ReferenceResultValue
	 * @generated
	 */
	EClass getReferenceResultValue();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.invocator.ReferenceResultValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ReferenceResultValue#getValue()
	 * @see #getReferenceResultValue()
	 * @generated
	 */
	EReference getReferenceResultValue_Value();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.RecordingToolsContainer <em>Recording Tools Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recording Tools Container</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.RecordingToolsContainer
	 * @generated
	 */
	EClass getRecordingToolsContainer();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.invocator.RecordingToolsContainer#getRecorder <em>Recorder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recorder</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.RecordingToolsContainer#getRecorder()
	 * @see #getRecordingToolsContainer()
	 * @generated
	 */
	EReference getRecordingToolsContainer_Recorder();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.invocator.RecordingToolsContainer#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Player</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.RecordingToolsContainer#getPlayer()
	 * @see #getRecordingToolsContainer()
	 * @generated
	 */
	EReference getRecordingToolsContainer_Player();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.invocator.RecordingToolsContainer#getChannelsLists <em>Channels Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channels Lists</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.RecordingToolsContainer#getChannelsLists()
	 * @see #getRecordingToolsContainer()
	 * @generated
	 */
	EReference getRecordingToolsContainer_ChannelsLists();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.ChannelsList <em>Channels List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channels List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ChannelsList
	 * @generated
	 */
	EClass getChannelsList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.invocator.ChannelsList#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channels</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ChannelsList#getChannels()
	 * @see #getChannelsList()
	 * @generated
	 */
	EReference getChannelsList_Channels();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.invocator.ChannelsList#getRecordingToolsContainer <em>Recording Tools Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Recording Tools Container</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ChannelsList#getRecordingToolsContainer()
	 * @see #getChannelsList()
	 * @generated
	 */
	EReference getChannelsList_RecordingToolsContainer();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractChannel <em>Abstract Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Channel</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractChannel
	 * @generated
	 */
	EClass getAbstractChannel();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractChannel#getChannelsList <em>Channels List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Channels List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractChannel#getChannelsList()
	 * @see #getAbstractChannel()
	 * @generated
	 */
	EReference getAbstractChannel_ChannelsList();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractRecorder <em>Abstract Recorder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Recorder</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractRecorder
	 * @generated
	 */
	EClass getAbstractRecorder();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractRecorder#getRecordingToolsContainer <em>Recording Tools Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Recording Tools Container</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractRecorder#getRecordingToolsContainer()
	 * @see #getAbstractRecorder()
	 * @generated
	 */
	EReference getAbstractRecorder_RecordingToolsContainer();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractPlayer <em>Abstract Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Player</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractPlayer
	 * @generated
	 */
	EClass getAbstractPlayer();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractPlayer#getRecordingToolsContainer <em>Recording Tools Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Recording Tools Container</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractPlayer#getRecordingToolsContainer()
	 * @see #getAbstractPlayer()
	 * @generated
	 */
	EReference getAbstractPlayer_RecordingToolsContainer();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsListTimeSource <em>Operation Call Results List Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Call Results List Time Source</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsListTimeSource
	 * @generated
	 */
	EClass getOperationCallResultsListTimeSource();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsListTimeSource#getOpsCallList <em>Ops Call List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ops Call List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsListTimeSource#getOpsCallList()
	 * @see #getOperationCallResultsListTimeSource()
	 * @generated
	 */
	EReference getOperationCallResultsListTimeSource_OpsCallList();

	/**
	 * Returns the meta object for enum '{@link ca.gc.asc_csa.apogy.core.invocator.VariableListenerEventType <em>Variable Listener Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variable Listener Event Type</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.VariableListenerEventType
	 * @generated
	 */
	EEnum getVariableListenerEventType();

	/**
	 * Returns the meta object for enum '{@link ca.gc.asc_csa.apogy.core.invocator.ProgramRuntimeState <em>Program Runtime State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Program Runtime State</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ProgramRuntimeState
	 * @generated
	 */
	EEnum getProgramRuntimeState();

	/**
	 * Returns the meta object for data type '{@link java.lang.Throwable <em>Throwable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Throwable</em>'.
	 * @see java.lang.Throwable
	 * @model instanceClass="java.lang.Throwable"
	 * @generated
	 */
	EDataType getThrowable();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.notify.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Notification</em>'.
	 * @see org.eclipse.emf.common.notify.Notification
	 * @model instanceClass="org.eclipse.emf.common.notify.Notification"
	 * @generated
	 */
	EDataType getNotification();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.EList <em>Type Member Implementations EList</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Member Implementations EList</em>'.
	 * @see org.eclipse.emf.common.util.EList
	 * @model instanceClass="org.eclipse.emf.common.util.EList<ca.gc.asc_csa.apogy.core.invocator.TypeMemberImplementation>"
	 * @generated
	 */
	EDataType getTypeMemberImplementationsEList();

	/**
	 * Returns the meta object for data type '<em>Type Members Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Members Array</em>'.
	 * @model instanceClass="ca.gc.asc_csa.apogy.core.invocator.TypeMember[]"
	 * @generated
	 */
	EDataType getTypeMembersArray();

	/**
	 * Returns the meta object for data type '{@link ca.gc.asc_csa.apogy.core.invocator.IVariableListener <em>IVariable Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IVariable Listener</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.IVariableListener
	 * @model instanceClass="ca.gc.asc_csa.apogy.core.invocator.IVariableListener"
	 * @generated
	 */
	EDataType getIVariableListener();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCoreInvocatorFactory getApogyCoreInvocatorFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorFacadeImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getApogyCoreInvocatorFacade()
		 * @generated
		 */
		EClass APOGY_CORE_INVOCATOR_FACADE = eINSTANCE.getApogyCoreInvocatorFacade();

		/**
		 * The meta object literal for the '<em><b>Init Variable Instances Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APOGY_CORE_INVOCATOR_FACADE__INIT_VARIABLE_INSTANCES_DATE = eINSTANCE.getApogyCoreInvocatorFacade_InitVariableInstancesDate();

		/**
		 * The meta object literal for the '<em><b>Active Invocator Session</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION = eINSTANCE.getApogyCoreInvocatorFacade_ActiveInvocatorSession();

		/**
		 * The meta object literal for the '<em><b>Exec</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___EXEC__OPERATIONCALL = eINSTANCE.getApogyCoreInvocatorFacade__Exec__OperationCall();

		/**
		 * The meta object literal for the '<em><b>Exec</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___EXEC__OPERATIONCALL_BOOLEAN = eINSTANCE.getApogyCoreInvocatorFacade__Exec__OperationCall_boolean();

		/**
		 * The meta object literal for the '<em><b>Exec</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___EXEC__OPERATIONCALLSLIST = eINSTANCE.getApogyCoreInvocatorFacade__Exec__OperationCallsList();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___GET_VALUE__OPERATIONCALLRESULT = eINSTANCE.getApogyCoreInvocatorFacade__GetValue__OperationCallResult();

		/**
		 * The meta object literal for the '<em><b>Create Abstract Result Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___CREATE_ABSTRACT_RESULT_VALUE__OBJECT = eINSTANCE.getApogyCoreInvocatorFacade__CreateAbstractResultValue__Object();

		/**
		 * The meta object literal for the '<em><b>Get Instance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___GET_INSTANCE__VARIABLE = eINSTANCE.getApogyCoreInvocatorFacade__GetInstance__Variable();

		/**
		 * The meta object literal for the '<em><b>Get Instance Class</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___GET_INSTANCE_CLASS__VARIABLE = eINSTANCE.getApogyCoreInvocatorFacade__GetInstanceClass__Variable();

		/**
		 * The meta object literal for the '<em><b>Get Type Api Adapter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___GET_TYPE_API_ADAPTER__VARIABLEFEATUREREFERENCE = eINSTANCE.getApogyCoreInvocatorFacade__GetTypeApiAdapter__VariableFeatureReference();

		/**
		 * The meta object literal for the '<em><b>Get Instance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___GET_INSTANCE__VARIABLEFEATUREREFERENCE = eINSTANCE.getApogyCoreInvocatorFacade__GetInstance__VariableFeatureReference();

		/**
		 * The meta object literal for the '<em><b>Get Type Member Instance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___GET_TYPE_MEMBER_INSTANCE__VARIABLEFEATUREREFERENCE = eINSTANCE.getApogyCoreInvocatorFacade__GetTypeMemberInstance__VariableFeatureReference();

		/**
		 * The meta object literal for the '<em><b>Get EMF Feature Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___GET_EMF_FEATURE_VALUE__VARIABLEFEATUREREFERENCE = eINSTANCE.getApogyCoreInvocatorFacade__GetEMFFeatureValue__VariableFeatureReference();

		/**
		 * The meta object literal for the '<em><b>Get Instance Class</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___GET_INSTANCE_CLASS__VARIABLEFEATUREREFERENCE = eINSTANCE.getApogyCoreInvocatorFacade__GetInstanceClass__VariableFeatureReference();

		/**
		 * The meta object literal for the '<em><b>Get Type Implementation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___GET_TYPE_IMPLEMENTATION__OPERATIONCALL = eINSTANCE.getApogyCoreInvocatorFacade__GetTypeImplementation__OperationCall();

		/**
		 * The meta object literal for the '<em><b>Get Type Implementation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___GET_TYPE_IMPLEMENTATION__VARIABLE_ABSTRACTTYPE = eINSTANCE.getApogyCoreInvocatorFacade__GetTypeImplementation__Variable_AbstractType();

		/**
		 * The meta object literal for the '<em><b>Get Type Implementation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___GET_TYPE_IMPLEMENTATION__VARIABLE = eINSTANCE.getApogyCoreInvocatorFacade__GetTypeImplementation__Variable();

		/**
		 * The meta object literal for the '<em><b>Get Variable By Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___GET_VARIABLE_BY_NAME__INVOCATORSESSION_STRING = eINSTANCE.getApogyCoreInvocatorFacade__GetVariableByName__InvocatorSession_String();

		/**
		 * The meta object literal for the '<em><b>Create Type Member References</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___CREATE_TYPE_MEMBER_REFERENCES__TYPEMEMBER = eINSTANCE.getApogyCoreInvocatorFacade__CreateTypeMemberReferences__TypeMember();

		/**
		 * The meta object literal for the '<em><b>Get Type Implementation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___GET_TYPE_IMPLEMENTATION__ENVIRONMENT_STRING = eINSTANCE.getApogyCoreInvocatorFacade__GetTypeImplementation__Environment_String();

		/**
		 * The meta object literal for the '<em><b>Get Fully Qualified Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___GET_FULLY_QUALIFIED_NAME__TYPEMEMBERREFERENCETREEELEMENT = eINSTANCE.getApogyCoreInvocatorFacade__GetFullyQualifiedName__TypeMemberReferenceTreeElement();

		/**
		 * The meta object literal for the '<em><b>Get Fully Qualified Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___GET_FULLY_QUALIFIED_NAME__ABSTRACTFEATURENODE = eINSTANCE.getApogyCoreInvocatorFacade__GetFullyQualifiedName__AbstractFeatureNode();

		/**
		 * The meta object literal for the '<em><b>Create Type Member Implementations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___CREATE_TYPE_MEMBER_IMPLEMENTATIONS__TYPE = eINSTANCE.getApogyCoreInvocatorFacade__CreateTypeMemberImplementations__Type();

		/**
		 * The meta object literal for the '<em><b>Init Variable Instances</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___INIT_VARIABLE_INSTANCES__ENVIRONMENT = eINSTANCE.getApogyCoreInvocatorFacade__InitVariableInstances__Environment();

		/**
		 * The meta object literal for the '<em><b>Dispose Variable Instances</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___DISPOSE_VARIABLE_INSTANCES__ENVIRONMENT = eINSTANCE.getApogyCoreInvocatorFacade__DisposeVariableInstances__Environment();

		/**
		 * The meta object literal for the '<em><b>Get Operation Call Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___GET_OPERATION_CALL_CONTAINER__TYPEMEMBERREFERENCELISTELEMENT = eINSTANCE.getApogyCoreInvocatorFacade__GetOperationCallContainer__TypeMemberReferenceListElement();

		/**
		 * The meta object literal for the '<em><b>Apply Initialization Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___APPLY_INITIALIZATION_DATA__ENVIRONMENT = eINSTANCE.getApogyCoreInvocatorFacade__ApplyInitializationData__Environment();

		/**
		 * The meta object literal for the '<em><b>Collect Initialization Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___COLLECT_INITIALIZATION_DATA__ENVIRONMENT = eINSTANCE.getApogyCoreInvocatorFacade__CollectInitializationData__Environment();

		/**
		 * The meta object literal for the '<em><b>Apply Initialization Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___APPLY_INITIALIZATION_DATA__VARIABLE = eINSTANCE.getApogyCoreInvocatorFacade__ApplyInitializationData__Variable();

		/**
		 * The meta object literal for the '<em><b>Collect Initialization Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___COLLECT_INITIALIZATION_DATA__VARIABLE = eINSTANCE.getApogyCoreInvocatorFacade__CollectInitializationData__Variable();

		/**
		 * The meta object literal for the '<em><b>Load Registered Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___LOAD_REGISTERED_TYPES__INVOCATORSESSION = eINSTANCE.getApogyCoreInvocatorFacade__LoadRegisteredTypes__InvocatorSession();

		/**
		 * The meta object literal for the '<em><b>Get All Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___GET_ALL_TYPES__ENVIRONMENT = eINSTANCE.getApogyCoreInvocatorFacade__GetAllTypes__Environment();

		/**
		 * The meta object literal for the '<em><b>Add Variable Listener</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___ADD_VARIABLE_LISTENER__IVARIABLELISTENER = eINSTANCE.getApogyCoreInvocatorFacade__AddVariableListener__IVariableListener();

		/**
		 * The meta object literal for the '<em><b>Remove Variable Listener</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___REMOVE_VARIABLE_LISTENER__IVARIABLELISTENER = eINSTANCE.getApogyCoreInvocatorFacade__RemoveVariableListener__IVariableListener();

		/**
		 * The meta object literal for the '<em><b>Notify Variable Listeners</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___NOTIFY_VARIABLE_LISTENERS__VARIABLE_VARIABLELISTENEREVENTTYPE = eINSTANCE.getApogyCoreInvocatorFacade__NotifyVariableListeners__Variable_VariableListenerEventType();

		/**
		 * The meta object literal for the '<em><b>Load Invocator Session</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___LOAD_INVOCATOR_SESSION__STRING = eINSTANCE.getApogyCoreInvocatorFacade__LoadInvocatorSession__String();

		/**
		 * The meta object literal for the '<em><b>Get Data Products By Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___GET_DATA_PRODUCTS_BY_NAME__INVOCATORSESSION_STRING = eINSTANCE.getApogyCoreInvocatorFacade__GetDataProductsByName__InvocatorSession_String();

		/**
		 * The meta object literal for the '<em><b>Get Program By Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___GET_PROGRAM_BY_NAME__INVOCATORSESSION_STRING = eINSTANCE.getApogyCoreInvocatorFacade__GetProgramByName__InvocatorSession_String();

		/**
		 * The meta object literal for the '<em><b>Get Context By Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___GET_CONTEXT_BY_NAME__INVOCATORSESSION_STRING = eINSTANCE.getApogyCoreInvocatorFacade__GetContextByName__InvocatorSession_String();

		/**
		 * The meta object literal for the '<em><b>Get All Script Based Programs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___GET_ALL_SCRIPT_BASED_PROGRAMS__PROGRAMSLIST = eINSTANCE.getApogyCoreInvocatorFacade__GetAllScriptBasedPrograms__ProgramsList();

		/**
		 * The meta object literal for the '<em><b>Create Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_FACADE___CREATE_CONTEXT__INVOCATORSESSION = eINSTANCE.getApogyCoreInvocatorFacade__CreateContext__InvocatorSession();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.InvocatorSessionImpl <em>Invocator Session</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.InvocatorSessionImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getInvocatorSession()
		 * @generated
		 */
		EClass INVOCATOR_SESSION = eINSTANCE.getInvocatorSession();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATOR_SESSION__ENVIRONMENT = eINSTANCE.getInvocatorSession_Environment();

		/**
		 * The meta object literal for the '<em><b>Programs List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATOR_SESSION__PROGRAMS_LIST = eINSTANCE.getInvocatorSession_ProgramsList();

		/**
		 * The meta object literal for the '<em><b>Program Runtimes List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATOR_SESSION__PROGRAM_RUNTIMES_LIST = eINSTANCE.getInvocatorSession_ProgramRuntimesList();

		/**
		 * The meta object literal for the '<em><b>Data Products List Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATOR_SESSION__DATA_PRODUCTS_LIST_CONTAINER = eINSTANCE.getInvocatorSession_DataProductsListContainer();

		/**
		 * The meta object literal for the '<em><b>Tools List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATOR_SESSION__TOOLS_LIST = eINSTANCE.getInvocatorSession_ToolsList();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.EnvironmentImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '<em><b>Invocator Session</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__INVOCATOR_SESSION = eINSTANCE.getEnvironment_InvocatorSession();

		/**
		 * The meta object literal for the '<em><b>Types List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__TYPES_LIST = eINSTANCE.getEnvironment_TypesList();

		/**
		 * The meta object literal for the '<em><b>Variables List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__VARIABLES_LIST = eINSTANCE.getEnvironment_VariablesList();

		/**
		 * The meta object literal for the '<em><b>Contexts List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__CONTEXTS_LIST = eINSTANCE.getEnvironment_ContextsList();

		/**
		 * The meta object literal for the '<em><b>Active Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__ACTIVE_CONTEXT = eINSTANCE.getEnvironment_ActiveContext();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.DataProductsListsContainerImpl <em>Data Products Lists Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.DataProductsListsContainerImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getDataProductsListsContainer()
		 * @generated
		 */
		EClass DATA_PRODUCTS_LISTS_CONTAINER = eINSTANCE.getDataProductsListsContainer();

		/**
		 * The meta object literal for the '<em><b>Invocator Session</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PRODUCTS_LISTS_CONTAINER__INVOCATOR_SESSION = eINSTANCE.getDataProductsListsContainer_InvocatorSession();

		/**
		 * The meta object literal for the '<em><b>Data Products List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PRODUCTS_LISTS_CONTAINER__DATA_PRODUCTS_LIST = eINSTANCE.getDataProductsListsContainer_DataProductsList();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.DataProductsListImpl <em>Data Products List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.DataProductsListImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getDataProductsList()
		 * @generated
		 */
		EClass DATA_PRODUCTS_LIST = eINSTANCE.getDataProductsList();

		/**
		 * The meta object literal for the '<em><b>Data Products Lists Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PRODUCTS_LIST__DATA_PRODUCTS_LISTS_CONTAINER = eINSTANCE.getDataProductsList_DataProductsListsContainer();

		/**
		 * The meta object literal for the '<em><b>Operation Call Results List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PRODUCTS_LIST__OPERATION_CALL_RESULTS_LIST = eINSTANCE.getDataProductsList_OperationCallResultsList();

		/**
		 * The meta object literal for the '<em><b>Recording Results List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PRODUCTS_LIST__RECORDING_RESULTS_LIST = eINSTANCE.getDataProductsList_RecordingResultsList();

		/**
		 * The meta object literal for the '<em><b>Invocator Session</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PRODUCTS_LIST__INVOCATOR_SESSION = eINSTANCE.getDataProductsList_InvocatorSession();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ToolsListImpl <em>Tools List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ToolsListImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getToolsList()
		 * @generated
		 */
		EClass TOOLS_LIST = eINSTANCE.getToolsList();

		/**
		 * The meta object literal for the '<em><b>Invocator Session</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOLS_LIST__INVOCATOR_SESSION = eINSTANCE.getToolsList_InvocatorSession();

		/**
		 * The meta object literal for the '<em><b>Tools List Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOLS_LIST__TOOLS_LIST_CONTAINERS = eINSTANCE.getToolsList_ToolsListContainers();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.AbstractToolsListContainerImpl <em>Abstract Tools List Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.AbstractToolsListContainerImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getAbstractToolsListContainer()
		 * @generated
		 */
		EClass ABSTRACT_TOOLS_LIST_CONTAINER = eINSTANCE.getAbstractToolsListContainer();

		/**
		 * The meta object literal for the '<em><b>Tools List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TOOLS_LIST_CONTAINER__TOOLS_LIST = eINSTANCE.getAbstractToolsListContainer_ToolsList();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypesListImpl <em>Types List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.TypesListImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getTypesList()
		 * @generated
		 */
		EClass TYPES_LIST = eINSTANCE.getTypesList();

		/**
		 * The meta object literal for the '<em><b>Local Types</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPES_LIST__LOCAL_TYPES = eINSTANCE.getTypesList_LocalTypes();

		/**
		 * The meta object literal for the '<em><b>Registered Types</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPES_LIST__REGISTERED_TYPES = eINSTANCE.getTypesList_RegisteredTypes();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.LocalTypesListImpl <em>Local Types List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.LocalTypesListImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getLocalTypesList()
		 * @generated
		 */
		EClass LOCAL_TYPES_LIST = eINSTANCE.getLocalTypesList();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_TYPES_LIST__TYPES = eINSTANCE.getLocalTypesList_Types();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.RegisteredTypesListImpl <em>Registered Types List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.RegisteredTypesListImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getRegisteredTypesList()
		 * @generated
		 */
		EClass REGISTERED_TYPES_LIST = eINSTANCE.getRegisteredTypesList();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTERED_TYPES_LIST__TYPES = eINSTANCE.getRegisteredTypesList_Types();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractType <em>Abstract Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractType
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getAbstractType()
		 * @generated
		 */
		EClass ABSTRACT_TYPE = eINSTANCE.getAbstractType();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.TypeImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__MEMBERS = eINSTANCE.getType_Members();

		/**
		 * The meta object literal for the '<em><b>Interface Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__INTERFACE_CLASS = eINSTANCE.getType_InterfaceClass();

		/**
		 * The meta object literal for the '<em><b>Type Api Adapter Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__TYPE_API_ADAPTER_CLASS = eINSTANCE.getType_TypeApiAdapterClass();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeApiAdapterImpl <em>Type Api Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.TypeApiAdapterImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getTypeApiAdapter()
		 * @generated
		 */
		EClass TYPE_API_ADAPTER = eINSTANCE.getTypeApiAdapter();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_API_ADAPTER__ENVIRONMENT = eINSTANCE.getTypeApiAdapter_Environment();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_API_ADAPTER__INSTANCE = eINSTANCE.getTypeApiAdapter_Instance();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_API_ADAPTER__ELEMENT_TYPE = eINSTANCE.getTypeApiAdapter_ElementType();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT = eINSTANCE.getTypeApiAdapter__Init__Environment_Type_EObject();

		/**
		 * The meta object literal for the '<em><b>Apply</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA = eINSTANCE.getTypeApiAdapter__Apply__AbstractInitializationData();

		/**
		 * The meta object literal for the '<em><b>Create Initialization Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_API_ADAPTER___CREATE_INITIALIZATION_DATA = eINSTANCE.getTypeApiAdapter__CreateInitializationData();

		/**
		 * The meta object literal for the '<em><b>Collect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA = eINSTANCE.getTypeApiAdapter__Collect__AbstractInitializationData();

		/**
		 * The meta object literal for the '<em><b>Create Result</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_API_ADAPTER___CREATE_RESULT__OPERATIONCALL = eINSTANCE.getTypeApiAdapter__CreateResult__OperationCall();

		/**
		 * The meta object literal for the '<em><b>Create Result</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION = eINSTANCE.getTypeApiAdapter__CreateResult__OperationCall_long_Object_Exception();

		/**
		 * The meta object literal for the '<em><b>Invoke</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN = eINSTANCE.getTypeApiAdapter__Invoke__EObject_OperationCall_boolean();

		/**
		 * The meta object literal for the '<em><b>Dispose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE_API_ADAPTER___DISPOSE = eINSTANCE.getTypeApiAdapter__Dispose();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberImpl <em>Type Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getTypeMember()
		 * @generated
		 */
		EClass TYPE_MEMBER = eINSTANCE.getTypeMember();

		/**
		 * The meta object literal for the '<em><b>Member Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MEMBER__MEMBER_TYPE = eINSTANCE.getTypeMember_MemberType();

		/**
		 * The meta object literal for the '<em><b>Type Feature Root Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MEMBER__TYPE_FEATURE_ROOT_NODE = eINSTANCE.getTypeMember_TypeFeatureRootNode();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberReferenceImpl <em>Type Member Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberReferenceImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getTypeMemberReference()
		 * @generated
		 */
		EClass TYPE_MEMBER_REFERENCE = eINSTANCE.getTypeMemberReference();

		/**
		 * The meta object literal for the '<em><b>Type Member</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MEMBER_REFERENCE__TYPE_MEMBER = eINSTANCE.getTypeMemberReference_TypeMember();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberReferenceListElementImpl <em>Type Member Reference List Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberReferenceListElementImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getTypeMemberReferenceListElement()
		 * @generated
		 */
		EClass TYPE_MEMBER_REFERENCE_LIST_ELEMENT = eINSTANCE.getTypeMemberReferenceListElement();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MEMBER_REFERENCE_LIST_ELEMENT__CHILD = eINSTANCE.getTypeMemberReferenceListElement_Child();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MEMBER_REFERENCE_LIST_ELEMENT__PARENT = eINSTANCE.getTypeMemberReferenceListElement_Parent();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_MEMBER_REFERENCE_LIST_ELEMENT__ROOT = eINSTANCE.getTypeMemberReferenceListElement_Root();

		/**
		 * The meta object literal for the '<em><b>Root Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MEMBER_REFERENCE_LIST_ELEMENT__ROOT_ELEMENT = eINSTANCE.getTypeMemberReferenceListElement_RootElement();

		/**
		 * The meta object literal for the '<em><b>Leaf Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MEMBER_REFERENCE_LIST_ELEMENT__LEAF_ELEMENT = eINSTANCE.getTypeMemberReferenceListElement_LeafElement();

		/**
		 * The meta object literal for the '<em><b>Leaf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_MEMBER_REFERENCE_LIST_ELEMENT__LEAF = eINSTANCE.getTypeMemberReferenceListElement_Leaf();

		/**
		 * The meta object literal for the '<em><b>Sub Segments Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_MEMBER_REFERENCE_LIST_ELEMENT__SUB_SEGMENTS_COUNT = eINSTANCE.getTypeMemberReferenceListElement_SubSegmentsCount();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberReferenceTreeElementImpl <em>Type Member Reference Tree Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberReferenceTreeElementImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getTypeMemberReferenceTreeElement()
		 * @generated
		 */
		EClass TYPE_MEMBER_REFERENCE_TREE_ELEMENT = eINSTANCE.getTypeMemberReferenceTreeElement();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MEMBER_REFERENCE_TREE_ELEMENT__CHILD = eINSTANCE.getTypeMemberReferenceTreeElement_Child();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MEMBER_REFERENCE_TREE_ELEMENT__PARENT = eINSTANCE.getTypeMemberReferenceTreeElement_Parent();

		/**
		 * The meta object literal for the '<em><b>Feature Root Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MEMBER_REFERENCE_TREE_ELEMENT__FEATURE_ROOT_NODE = eINSTANCE.getTypeMemberReferenceTreeElement_FeatureRootNode();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_MEMBER_REFERENCE_TREE_ELEMENT__ROOT = eINSTANCE.getTypeMemberReferenceTreeElement_Root();

		/**
		 * The meta object literal for the '<em><b>Root Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MEMBER_REFERENCE_TREE_ELEMENT__ROOT_ELEMENT = eINSTANCE.getTypeMemberReferenceTreeElement_RootElement();

		/**
		 * The meta object literal for the '<em><b>Leaf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_MEMBER_REFERENCE_TREE_ELEMENT__LEAF = eINSTANCE.getTypeMemberReferenceTreeElement_Leaf();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.VariablesListImpl <em>Variables List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.VariablesListImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getVariablesList()
		 * @generated
		 */
		EClass VARIABLES_LIST = eINSTANCE.getVariablesList();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLES_LIST__ENVIRONMENT = eINSTANCE.getVariablesList_Environment();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLES_LIST__VARIABLES = eINSTANCE.getVariablesList_Variables();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.VariableImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Variables List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__VARIABLES_LIST = eINSTANCE.getVariable_VariablesList();

		/**
		 * The meta object literal for the '<em><b>Variable Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__VARIABLE_TYPE = eINSTANCE.getVariable_VariableType();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__ENVIRONMENT = eINSTANCE.getVariable_Environment();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ContextsListImpl <em>Contexts List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ContextsListImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getContextsList()
		 * @generated
		 */
		EClass CONTEXTS_LIST = eINSTANCE.getContextsList();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXTS_LIST__ENVIRONMENT = eINSTANCE.getContextsList_Environment();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXTS_LIST__CONTEXTS = eINSTANCE.getContextsList_Contexts();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ContextImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Archived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__ARCHIVED = eINSTANCE.getContext_Archived();

		/**
		 * The meta object literal for the '<em><b>Contexts List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__CONTEXTS_LIST = eINSTANCE.getContext_ContextsList();

		/**
		 * The meta object literal for the '<em><b>Variable Implementations List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__VARIABLE_IMPLEMENTATIONS_LIST = eINSTANCE.getContext_VariableImplementationsList();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__ENVIRONMENT = eINSTANCE.getContext_Environment();

		/**
		 * The meta object literal for the '<em><b>Data Products List</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__DATA_PRODUCTS_LIST = eINSTANCE.getContext_DataProductsList();

		/**
		 * The meta object literal for the '<em><b>Instances Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__INSTANCES_CREATION_DATE = eINSTANCE.getContext_InstancesCreationDate();

		/**
		 * The meta object literal for the '<em><b>Instances Disposal Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__INSTANCES_DISPOSAL_DATE = eINSTANCE.getContext_InstancesDisposalDate();

		/**
		 * The meta object literal for the '<em><b>Variables Instantiated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__VARIABLES_INSTANTIATED = eINSTANCE.getContext_VariablesInstantiated();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.VariableImplementationsListImpl <em>Variable Implementations List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.VariableImplementationsListImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getVariableImplementationsList()
		 * @generated
		 */
		EClass VARIABLE_IMPLEMENTATIONS_LIST = eINSTANCE.getVariableImplementationsList();

		/**
		 * The meta object literal for the '<em><b>Variable Implementations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_IMPLEMENTATIONS_LIST__VARIABLE_IMPLEMENTATIONS = eINSTANCE.getVariableImplementationsList_VariableImplementations();

		/**
		 * The meta object literal for the '<em><b>Get Variable Implementation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_IMPLEMENTATIONS_LIST___GET_VARIABLE_IMPLEMENTATION__VARIABLE = eINSTANCE.getVariableImplementationsList__GetVariableImplementation__Variable();

		/**
		 * The meta object literal for the '<em><b>Get Variable Implementation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE_IMPLEMENTATIONS_LIST___GET_VARIABLE_IMPLEMENTATION__STRING = eINSTANCE.getVariableImplementationsList__GetVariableImplementation__String();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.AbstractInitializationDataImpl <em>Abstract Initialization Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.AbstractInitializationDataImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getAbstractInitializationData()
		 * @generated
		 */
		EClass ABSTRACT_INITIALIZATION_DATA = eINSTANCE.getAbstractInitializationData();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.InitializationDataImpl <em>Initialization Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.InitializationDataImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getInitializationData()
		 * @generated
		 */
		EClass INITIALIZATION_DATA = eINSTANCE.getInitializationData();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.AbstractTypeImplementationImpl <em>Abstract Type Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.AbstractTypeImplementationImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getAbstractTypeImplementation()
		 * @generated
		 */
		EClass ABSTRACT_TYPE_IMPLEMENTATION = eINSTANCE.getAbstractTypeImplementation();

		/**
		 * The meta object literal for the '<em><b>Type Member Implementations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TYPE_IMPLEMENTATION__TYPE_MEMBER_IMPLEMENTATIONS = eINSTANCE.getAbstractTypeImplementation_TypeMemberImplementations();

		/**
		 * The meta object literal for the '<em><b>Implementation Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TYPE_IMPLEMENTATION__IMPLEMENTATION_CLASS = eINSTANCE.getAbstractTypeImplementation_ImplementationClass();

		/**
		 * The meta object literal for the '<em><b>Abstract Initialization Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TYPE_IMPLEMENTATION__ABSTRACT_INITIALIZATION_DATA = eINSTANCE.getAbstractTypeImplementation_AbstractInitializationData();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TYPE_IMPLEMENTATION__INSTANCE = eINSTANCE.getAbstractTypeImplementation_Instance();

		/**
		 * The meta object literal for the '<em><b>Adapter Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TYPE_IMPLEMENTATION__ADAPTER_INSTANCE = eINSTANCE.getAbstractTypeImplementation_AdapterInstance();

		/**
		 * The meta object literal for the '<em><b>Handling Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TYPE_IMPLEMENTATION__HANDLING_TYPE = eINSTANCE.getAbstractTypeImplementation_HandlingType();

		/**
		 * The meta object literal for the '<em><b>Get Type Member Implementation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_TYPE_IMPLEMENTATION___GET_TYPE_MEMBER_IMPLEMENTATION__STRING = eINSTANCE.getAbstractTypeImplementation__GetTypeMemberImplementation__String();

		/**
		 * The meta object literal for the '<em><b>Get Type Member Implementation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_TYPE_IMPLEMENTATION___GET_TYPE_MEMBER_IMPLEMENTATION__TYPEMEMBER = eINSTANCE.getAbstractTypeImplementation__GetTypeMemberImplementation__TypeMember();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.VariableImplementationImpl <em>Variable Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.VariableImplementationImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getVariableImplementation()
		 * @generated
		 */
		EClass VARIABLE_IMPLEMENTATION = eINSTANCE.getVariableImplementation();

		/**
		 * The meta object literal for the '<em><b>Variable Implementations List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_IMPLEMENTATION__VARIABLE_IMPLEMENTATIONS_LIST = eINSTANCE.getVariableImplementation_VariableImplementationsList();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_IMPLEMENTATION__VARIABLE = eINSTANCE.getVariableImplementation_Variable();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberImplementationImpl <em>Type Member Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberImplementationImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getTypeMemberImplementation()
		 * @generated
		 */
		EClass TYPE_MEMBER_IMPLEMENTATION = eINSTANCE.getTypeMemberImplementation();

		/**
		 * The meta object literal for the '<em><b>Type Member</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MEMBER_IMPLEMENTATION__TYPE_MEMBER = eINSTANCE.getTypeMemberImplementation_TypeMember();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ValuesListImpl <em>Values List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ValuesListImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getValuesList()
		 * @generated
		 */
		EClass VALUES_LIST = eINSTANCE.getValuesList();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_LIST__VALUES = eINSTANCE.getValuesList_Values();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ValueImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__VALUE = eINSTANCE.getValue_Value();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ProgramsListImpl <em>Programs List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ProgramsListImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getProgramsList()
		 * @generated
		 */
		EClass PROGRAMS_LIST = eINSTANCE.getProgramsList();

		/**
		 * The meta object literal for the '<em><b>Invocator Session</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMS_LIST__INVOCATOR_SESSION = eINSTANCE.getProgramsList_InvocatorSession();

		/**
		 * The meta object literal for the '<em><b>Programs Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMS_LIST__PROGRAMS_GROUPS = eINSTANCE.getProgramsList_ProgramsGroups();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ProgramsGroupImpl <em>Programs Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ProgramsGroupImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getProgramsGroup()
		 * @generated
		 */
		EClass PROGRAMS_GROUP = eINSTANCE.getProgramsGroup();

		/**
		 * The meta object literal for the '<em><b>Programs List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMS_GROUP__PROGRAMS_LIST = eINSTANCE.getProgramsGroup_ProgramsList();

		/**
		 * The meta object literal for the '<em><b>Invocator Session</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMS_GROUP__INVOCATOR_SESSION = eINSTANCE.getProgramsGroup_InvocatorSession();

		/**
		 * The meta object literal for the '<em><b>Programs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMS_GROUP__PROGRAMS = eINSTANCE.getProgramsGroup_Programs();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ProgramImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Programs Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__PROGRAMS_GROUP = eINSTANCE.getProgram_ProgramsGroup();

		/**
		 * The meta object literal for the '<em><b>Invocator Session</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__INVOCATOR_SESSION = eINSTANCE.getProgram_InvocatorSession();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ScriptBasedProgramImpl <em>Script Based Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ScriptBasedProgramImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getScriptBasedProgram()
		 * @generated
		 */
		EClass SCRIPT_BASED_PROGRAM = eINSTANCE.getScriptBasedProgram();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.TriggeredBasedProgramImpl <em>Triggered Based Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.TriggeredBasedProgramImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getTriggeredBasedProgram()
		 * @generated
		 */
		EClass TRIGGERED_BASED_PROGRAM = eINSTANCE.getTriggeredBasedProgram();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCallContainer <em>Operation Call Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCallContainer
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getOperationCallContainer()
		 * @generated
		 */
		EClass OPERATION_CALL_CONTAINER = eINSTANCE.getOperationCallContainer();

		/**
		 * The meta object literal for the '<em><b>Operation Calls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL_CONTAINER__OPERATION_CALLS = eINSTANCE.getOperationCallContainer_OperationCalls();

		/**
		 * The meta object literal for the '<em><b>Get Invocator Session</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION_CALL_CONTAINER___GET_INVOCATOR_SESSION = eINSTANCE.getOperationCallContainer__GetInvocatorSession();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallsListImpl <em>Operation Calls List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallsListImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getOperationCallsList()
		 * @generated
		 */
		EClass OPERATION_CALLS_LIST = eINSTANCE.getOperationCallsList();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.VariableFeatureReferenceImpl <em>Variable Feature Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.VariableFeatureReferenceImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getVariableFeatureReference()
		 * @generated
		 */
		EClass VARIABLE_FEATURE_REFERENCE = eINSTANCE.getVariableFeatureReference();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_FEATURE_REFERENCE__VARIABLE = eINSTANCE.getVariableFeatureReference_Variable();

		/**
		 * The meta object literal for the '<em><b>Type Member Reference List Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT = eINSTANCE.getVariableFeatureReference_TypeMemberReferenceListElement();

		/**
		 * The meta object literal for the '<em><b>Feature Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT = eINSTANCE.getVariableFeatureReference_FeatureRoot();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallImpl <em>Operation Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getOperationCall()
		 * @generated
		 */
		EClass OPERATION_CALL = eINSTANCE.getOperationCall();

		/**
		 * The meta object literal for the '<em><b>EOperation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL__EOPERATION = eINSTANCE.getOperationCall_EOperation();

		/**
		 * The meta object literal for the '<em><b>Arguments List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL__ARGUMENTS_LIST = eINSTANCE.getOperationCall_ArgumentsList();

		/**
		 * The meta object literal for the '<em><b>Operation Call Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL__OPERATION_CALL_CONTAINER = eINSTANCE.getOperationCall_OperationCallContainer();

		/**
		 * The meta object literal for the '<em><b>Invocator Session</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL__INVOCATOR_SESSION = eINSTANCE.getOperationCall_InvocatorSession();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL__ENVIRONMENT = eINSTANCE.getOperationCall_Environment();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ArgumentsListImpl <em>Arguments List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ArgumentsListImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getArgumentsList()
		 * @generated
		 */
		EClass ARGUMENTS_LIST = eINSTANCE.getArgumentsList();

		/**
		 * The meta object literal for the '<em><b>Operation Call</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENTS_LIST__OPERATION_CALL = eINSTANCE.getArgumentsList_OperationCall();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENTS_LIST__ARGUMENTS = eINSTANCE.getArgumentsList_Arguments();

		/**
		 * The meta object literal for the '<em><b>Get Argument Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARGUMENTS_LIST___GET_ARGUMENT_VALUES = eINSTANCE.getArgumentsList__GetArgumentValues();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ArgumentImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Arguments List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__ARGUMENTS_LIST = eINSTANCE.getArgument_ArgumentsList();

		/**
		 * The meta object literal for the '<em><b>Operation Call</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__OPERATION_CALL = eINSTANCE.getArgument_OperationCall();

		/**
		 * The meta object literal for the '<em><b>Get EParameter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARGUMENT___GET_EPARAMETER = eINSTANCE.getArgument__GetEParameter();

		/**
		 * The meta object literal for the '<em><b>Get Parameter Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARGUMENT___GET_PARAMETER_VALUE = eINSTANCE.getArgument__GetParameterValue();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.EDataTypeArgumentImpl <em>EData Type Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.EDataTypeArgumentImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getEDataTypeArgument()
		 * @generated
		 */
		EClass EDATA_TYPE_ARGUMENT = eINSTANCE.getEDataTypeArgument();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDATA_TYPE_ARGUMENT__VALUE = eINSTANCE.getEDataTypeArgument_Value();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.BooleanEDataTypeArgumentImpl <em>Boolean EData Type Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.BooleanEDataTypeArgumentImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getBooleanEDataTypeArgument()
		 * @generated
		 */
		EClass BOOLEAN_EDATA_TYPE_ARGUMENT = eINSTANCE.getBooleanEDataTypeArgument();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.NumericEDataTypeArgumentImpl <em>Numeric EData Type Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.NumericEDataTypeArgumentImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getNumericEDataTypeArgument()
		 * @generated
		 */
		EClass NUMERIC_EDATA_TYPE_ARGUMENT = eINSTANCE.getNumericEDataTypeArgument();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.StringEDataTypeArgumentImpl <em>String EData Type Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.StringEDataTypeArgumentImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getStringEDataTypeArgument()
		 * @generated
		 */
		EClass STRING_EDATA_TYPE_ARGUMENT = eINSTANCE.getStringEDataTypeArgument();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.EEnumArgumentImpl <em>EEnum Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.EEnumArgumentImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getEEnumArgument()
		 * @generated
		 */
		EClass EENUM_ARGUMENT = eINSTANCE.getEEnumArgument();

		/**
		 * The meta object literal for the '<em><b>EEnum Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EENUM_ARGUMENT__EENUM_LITERAL = eINSTANCE.getEEnumArgument_EEnumLiteral();

		/**
		 * The meta object literal for the '<em><b>EEnum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EENUM_ARGUMENT__EENUM = eINSTANCE.getEEnumArgument_EEnum();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.EClassArgumentImpl <em>EClass Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.EClassArgumentImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getEClassArgument()
		 * @generated
		 */
		EClass ECLASS_ARGUMENT = eINSTANCE.getEClassArgument();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS_ARGUMENT__VALUE = eINSTANCE.getEClassArgument_Value();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ProgramRuntimesListImpl <em>Program Runtimes List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ProgramRuntimesListImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getProgramRuntimesList()
		 * @generated
		 */
		EClass PROGRAM_RUNTIMES_LIST = eINSTANCE.getProgramRuntimesList();

		/**
		 * The meta object literal for the '<em><b>Session</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_RUNTIMES_LIST__SESSION = eINSTANCE.getProgramRuntimesList_Session();

		/**
		 * The meta object literal for the '<em><b>Program Runtimes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_RUNTIMES_LIST__PROGRAM_RUNTIMES = eINSTANCE.getProgramRuntimesList_ProgramRuntimes();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.AbstractProgramRuntimeImpl <em>Abstract Program Runtime</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.AbstractProgramRuntimeImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getAbstractProgramRuntime()
		 * @generated
		 */
		EClass ABSTRACT_PROGRAM_RUNTIME = eINSTANCE.getAbstractProgramRuntime();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PROGRAM_RUNTIME__STATE = eINSTANCE.getAbstractProgramRuntime_State();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PROGRAM_RUNTIME__PROGRAM = eINSTANCE.getAbstractProgramRuntime_Program();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_PROGRAM_RUNTIME___INIT = eINSTANCE.getAbstractProgramRuntime__Init();

		/**
		 * The meta object literal for the '<em><b>Terminate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_PROGRAM_RUNTIME___TERMINATE = eINSTANCE.getAbstractProgramRuntime__Terminate();

		/**
		 * The meta object literal for the '<em><b>Resume</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_PROGRAM_RUNTIME___RESUME = eINSTANCE.getAbstractProgramRuntime__Resume();

		/**
		 * The meta object literal for the '<em><b>Suspend</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_PROGRAM_RUNTIME___SUSPEND = eINSTANCE.getAbstractProgramRuntime__Suspend();

		/**
		 * The meta object literal for the '<em><b>Step Into</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_PROGRAM_RUNTIME___STEP_INTO = eINSTANCE.getAbstractProgramRuntime__StepInto();

		/**
		 * The meta object literal for the '<em><b>Step Over</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_PROGRAM_RUNTIME___STEP_OVER = eINSTANCE.getAbstractProgramRuntime__StepOver();

		/**
		 * The meta object literal for the '<em><b>Step Return</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_PROGRAM_RUNTIME___STEP_RETURN = eINSTANCE.getAbstractProgramRuntime__StepReturn();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallsListProgramRuntimeImpl <em>Operation Calls List Program Runtime</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallsListProgramRuntimeImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getOperationCallsListProgramRuntime()
		 * @generated
		 */
		EClass OPERATION_CALLS_LIST_PROGRAM_RUNTIME = eINSTANCE.getOperationCallsListProgramRuntime();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.ResultsList <em>Results List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.ResultsList
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getResultsList()
		 * @generated
		 */
		EClass RESULTS_LIST = eINSTANCE.getResultsList();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTS_LIST__RESULTS = eINSTANCE.getResultsList_Results();

		/**
		 * The meta object literal for the '<em><b>Get Invocator Session</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESULTS_LIST___GET_INVOCATOR_SESSION = eINSTANCE.getResultsList__GetInvocatorSession();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallResultsListImpl <em>Operation Call Results List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallResultsListImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getOperationCallResultsList()
		 * @generated
		 */
		EClass OPERATION_CALL_RESULTS_LIST = eINSTANCE.getOperationCallResultsList();

		/**
		 * The meta object literal for the '<em><b>Data Products List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL_RESULTS_LIST__DATA_PRODUCTS_LIST = eINSTANCE.getOperationCallResultsList_DataProductsList();

		/**
		 * The meta object literal for the '<em><b>Invocator Session</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL_RESULTS_LIST__INVOCATOR_SESSION = eINSTANCE.getOperationCallResultsList_InvocatorSession();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.RecordingResultsListImpl <em>Recording Results List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.RecordingResultsListImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getRecordingResultsList()
		 * @generated
		 */
		EClass RECORDING_RESULTS_LIST = eINSTANCE.getRecordingResultsList();

		/**
		 * The meta object literal for the '<em><b>Data Products List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORDING_RESULTS_LIST__DATA_PRODUCTS_LIST = eINSTANCE.getRecordingResultsList_DataProductsList();

		/**
		 * The meta object literal for the '<em><b>Invocator Session</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORDING_RESULTS_LIST__INVOCATOR_SESSION = eINSTANCE.getRecordingResultsList_InvocatorSession();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.AbstractResultImpl <em>Abstract Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.AbstractResultImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getAbstractResult()
		 * @generated
		 */
		EClass ABSTRACT_RESULT = eINSTANCE.getAbstractResult();

		/**
		 * The meta object literal for the '<em><b>Results List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_RESULT__RESULTS_LIST = eINSTANCE.getAbstractResult_ResultsList();

		/**
		 * The meta object literal for the '<em><b>Invocator Session</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_RESULT__INVOCATOR_SESSION = eINSTANCE.getAbstractResult_InvocatorSession();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_RESULT__CONTEXT = eINSTANCE.getAbstractResult_Context();

		/**
		 * The meta object literal for the '<em><b>Result Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_RESULT__RESULT_VALUE = eINSTANCE.getAbstractResult_ResultValue();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.AbstractResultValueImpl <em>Abstract Result Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.AbstractResultValueImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getAbstractResultValue()
		 * @generated
		 */
		EClass ABSTRACT_RESULT_VALUE = eINSTANCE.getAbstractResultValue();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_RESULT_VALUE__RESULT = eINSTANCE.getAbstractResultValue_Result();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallResultImpl <em>Operation Call Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallResultImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getOperationCallResult()
		 * @generated
		 */
		EClass OPERATION_CALL_RESULT = eINSTANCE.getOperationCallResult();

		/**
		 * The meta object literal for the '<em><b>Operation Call</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL_RESULT__OPERATION_CALL = eINSTANCE.getOperationCallResult_OperationCall();

		/**
		 * The meta object literal for the '<em><b>Exception Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL_RESULT__EXCEPTION_CONTAINER = eINSTANCE.getOperationCallResult_ExceptionContainer();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ExceptionContainerImpl <em>Exception Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ExceptionContainerImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getExceptionContainer()
		 * @generated
		 */
		EClass EXCEPTION_CONTAINER = eINSTANCE.getExceptionContainer();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_CONTAINER__EXCEPTION = eINSTANCE.getExceptionContainer_Exception();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.AttributeResultValueImpl <em>Attribute Result Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.AttributeResultValueImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getAttributeResultValue()
		 * @generated
		 */
		EClass ATTRIBUTE_RESULT_VALUE = eINSTANCE.getAttributeResultValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_RESULT_VALUE__VALUE = eINSTANCE.getAttributeResultValue_Value();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.AttributeValueImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getAttributeValue()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE = eINSTANCE.getAttributeValue();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE__OBJECT = eINSTANCE.getAttributeValue_Object();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ReferenceResultValueImpl <em>Reference Result Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ReferenceResultValueImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getReferenceResultValue()
		 * @generated
		 */
		EClass REFERENCE_RESULT_VALUE = eINSTANCE.getReferenceResultValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_RESULT_VALUE__VALUE = eINSTANCE.getReferenceResultValue_Value();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.RecordingToolsContainerImpl <em>Recording Tools Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.RecordingToolsContainerImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getRecordingToolsContainer()
		 * @generated
		 */
		EClass RECORDING_TOOLS_CONTAINER = eINSTANCE.getRecordingToolsContainer();

		/**
		 * The meta object literal for the '<em><b>Recorder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORDING_TOOLS_CONTAINER__RECORDER = eINSTANCE.getRecordingToolsContainer_Recorder();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORDING_TOOLS_CONTAINER__PLAYER = eINSTANCE.getRecordingToolsContainer_Player();

		/**
		 * The meta object literal for the '<em><b>Channels Lists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORDING_TOOLS_CONTAINER__CHANNELS_LISTS = eINSTANCE.getRecordingToolsContainer_ChannelsLists();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.ChannelsListImpl <em>Channels List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ChannelsListImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getChannelsList()
		 * @generated
		 */
		EClass CHANNELS_LIST = eINSTANCE.getChannelsList();

		/**
		 * The meta object literal for the '<em><b>Channels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNELS_LIST__CHANNELS = eINSTANCE.getChannelsList_Channels();

		/**
		 * The meta object literal for the '<em><b>Recording Tools Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNELS_LIST__RECORDING_TOOLS_CONTAINER = eINSTANCE.getChannelsList_RecordingToolsContainer();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.AbstractChannelImpl <em>Abstract Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.AbstractChannelImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getAbstractChannel()
		 * @generated
		 */
		EClass ABSTRACT_CHANNEL = eINSTANCE.getAbstractChannel();

		/**
		 * The meta object literal for the '<em><b>Channels List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CHANNEL__CHANNELS_LIST = eINSTANCE.getAbstractChannel_ChannelsList();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.AbstractRecorderImpl <em>Abstract Recorder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.AbstractRecorderImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getAbstractRecorder()
		 * @generated
		 */
		EClass ABSTRACT_RECORDER = eINSTANCE.getAbstractRecorder();

		/**
		 * The meta object literal for the '<em><b>Recording Tools Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_RECORDER__RECORDING_TOOLS_CONTAINER = eINSTANCE.getAbstractRecorder_RecordingToolsContainer();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.AbstractPlayerImpl <em>Abstract Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.AbstractPlayerImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getAbstractPlayer()
		 * @generated
		 */
		EClass ABSTRACT_PLAYER = eINSTANCE.getAbstractPlayer();

		/**
		 * The meta object literal for the '<em><b>Recording Tools Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PLAYER__RECORDING_TOOLS_CONTAINER = eINSTANCE.getAbstractPlayer_RecordingToolsContainer();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallResultsListTimeSourceImpl <em>Operation Call Results List Time Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallResultsListTimeSourceImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getOperationCallResultsListTimeSource()
		 * @generated
		 */
		EClass OPERATION_CALL_RESULTS_LIST_TIME_SOURCE = eINSTANCE.getOperationCallResultsListTimeSource();

		/**
		 * The meta object literal for the '<em><b>Ops Call List</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__OPS_CALL_LIST = eINSTANCE.getOperationCallResultsListTimeSource_OpsCallList();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.VariableListenerEventType <em>Variable Listener Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.VariableListenerEventType
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getVariableListenerEventType()
		 * @generated
		 */
		EEnum VARIABLE_LISTENER_EVENT_TYPE = eINSTANCE.getVariableListenerEventType();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.ProgramRuntimeState <em>Program Runtime State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.ProgramRuntimeState
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getProgramRuntimeState()
		 * @generated
		 */
		EEnum PROGRAM_RUNTIME_STATE = eINSTANCE.getProgramRuntimeState();

		/**
		 * The meta object literal for the '<em>Throwable</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Throwable
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getThrowable()
		 * @generated
		 */
		EDataType THROWABLE = eINSTANCE.getThrowable();

		/**
		 * The meta object literal for the '<em>Notification</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.notify.Notification
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getNotification()
		 * @generated
		 */
		EDataType NOTIFICATION = eINSTANCE.getNotification();

		/**
		 * The meta object literal for the '<em>Type Member Implementations EList</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.EList
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getTypeMemberImplementationsEList()
		 * @generated
		 */
		EDataType TYPE_MEMBER_IMPLEMENTATIONS_ELIST = eINSTANCE.getTypeMemberImplementationsEList();

		/**
		 * The meta object literal for the '<em>Type Members Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getTypeMembersArray()
		 * @generated
		 */
		EDataType TYPE_MEMBERS_ARRAY = eINSTANCE.getTypeMembersArray();

		/**
		 * The meta object literal for the '<em>IVariable Listener</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.IVariableListener
		 * @see ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorPackageImpl#getIVariableListener()
		 * @generated
		 */
		EDataType IVARIABLE_LISTENER = eINSTANCE.getIVariableListener();

	}

} //ApogyCoreInvocatorPackage
