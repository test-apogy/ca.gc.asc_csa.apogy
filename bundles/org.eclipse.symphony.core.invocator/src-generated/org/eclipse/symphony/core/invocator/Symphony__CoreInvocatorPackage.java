/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;

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
 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Symphony__CoreInvocator' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2012-2015 Copyrights (c)' modelName='Symphony__CoreInvocator' fileExtensions='sym' resource='XMI' modelDirectory='/org.eclipse.symphony.core.invocator/src-generated' editDirectory='/org.eclipse.symphony.core.invocator.edit/src-generated' editorDirectory='/org.eclipse.symphony.core.invocator.editor/src-generated' testsDirectory='/org.eclipse.symphony.core.invocator.tests/src-generated' basePackage='org.eclipse.symphony.core'"
 * @generated
 */
public interface Symphony__CoreInvocatorPackage extends EPackage
{
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
  String eNS_URI = "org.eclipse.symphony.core.invocator";

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
  Symphony__CoreInvocatorPackage eINSTANCE = org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.EMFEcoreInvocatorFacadeImpl <em>EMF Ecore Invocator Facade</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.EMFEcoreInvocatorFacadeImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getEMFEcoreInvocatorFacade()
	 * @generated
	 */
  int EMF_ECORE_INVOCATOR_FACADE = 0;

  /**
	 * The feature id for the '<em><b>Active Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ECORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION = 0;

		/**
	 * The number of structural features of the '<em>EMF Ecore Invocator Facade</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_FACADE_FEATURE_COUNT = 1;

  /**
	 * The operation id for the '<em>Exec</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_FACADE___EXEC__OPERATIONCALL = 0;

  /**
	 * The operation id for the '<em>Exec</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_FACADE___EXEC__OPERATIONCALL_BOOLEAN = 1;

  /**
	 * The operation id for the '<em>Exec</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_FACADE___EXEC__OPERATIONCALLSLIST = 2;

  /**
	 * The operation id for the '<em>Create Abstract Result Value</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_FACADE___CREATE_ABSTRACT_RESULT_VALUE__OBJECT = 3;

  /**
	 * The operation id for the '<em>Resolve Watch</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_FACADE___RESOLVE_WATCH__ABSTRACTFEATURENODE = 4;

  /**
	 * The operation id for the '<em>Resolve Watch</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_FACADE___RESOLVE_WATCH__TYPEMEMBERREFERENCETREEELEMENT = 5;

  /**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_FACADE___GET_VALUE__ABSTRACTFEATURENODE = 6;

  /**
	 * The operation id for the '<em>Get Instance</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_FACADE___GET_INSTANCE__VARIABLE = 7;

  /**
	 * The operation id for the '<em>Get Instance Class</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_FACADE___GET_INSTANCE_CLASS__VARIABLE = 8;

  /**
	 * The operation id for the '<em>Get Type Api Adapter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ECORE_INVOCATOR_FACADE___GET_TYPE_API_ADAPTER__VARIABLEFEATUREREFERENCE = 9;

		/**
	 * The operation id for the '<em>Get Instance</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_FACADE___GET_INSTANCE__VARIABLEFEATUREREFERENCE = 10;

  /**
	 * The operation id for the '<em>Get Type Member Instance</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_FACADE___GET_TYPE_MEMBER_INSTANCE__VARIABLEFEATUREREFERENCE = 11;

  /**
	 * The operation id for the '<em>Get EMF Feature Value</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_FACADE___GET_EMF_FEATURE_VALUE__VARIABLEFEATUREREFERENCE = 12;

  /**
	 * The operation id for the '<em>Get Instance Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ECORE_INVOCATOR_FACADE___GET_INSTANCE_CLASS__VARIABLEFEATUREREFERENCE = 13;

		/**
	 * The operation id for the '<em>Get Instance</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_FACADE___GET_INSTANCE__TYPEMEMBERREFERENCETREEELEMENT = 14;

  /**
	 * The operation id for the '<em>Get Type Implementation</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_FACADE___GET_TYPE_IMPLEMENTATION__OPERATIONCALL = 15;

  /**
	 * The operation id for the '<em>Get Type Implementation</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_FACADE___GET_TYPE_IMPLEMENTATION__VARIABLE_ABSTRACTTYPE = 16;

  /**
	 * The operation id for the '<em>Get Type Implementation</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_FACADE___GET_TYPE_IMPLEMENTATION__VARIABLE = 17;

  /**
	 * The operation id for the '<em>Create Type Member References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ECORE_INVOCATOR_FACADE___CREATE_TYPE_MEMBER_REFERENCES__TYPEMEMBER = 18;

		/**
	 * The operation id for the '<em>Get Type Implementation</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_FACADE___GET_TYPE_IMPLEMENTATION__ENVIRONMENT_STRING = 19;

  /**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_FACADE___GET_FULLY_QUALIFIED_NAME__TYPEMEMBERREFERENCETREEELEMENT = 20;

  /**
	 * The operation id for the '<em>Get Fully Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_FACADE___GET_FULLY_QUALIFIED_NAME__ABSTRACTFEATURENODE = 21;

  /**
	 * The operation id for the '<em>Create Type Member Implementations</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_FACADE___CREATE_TYPE_MEMBER_IMPLEMENTATIONS__TYPE = 22;

  /**
	 * The operation id for the '<em>Init Variable Instances</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_FACADE___INIT_VARIABLE_INSTANCES__ENVIRONMENT = 23;

  /**
	 * The operation id for the '<em>Dispose Variable Instances</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_FACADE___DISPOSE_VARIABLE_INSTANCES__ENVIRONMENT = 24;

  /**
	 * The operation id for the '<em>Get Operation Call Container</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_FACADE___GET_OPERATION_CALL_CONTAINER__TYPEMEMBERREFERENCELISTELEMENT = 25;

  /**
	 * The operation id for the '<em>Apply Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_FACADE___APPLY_INITIALIZATION_DATA__ENVIRONMENT = 26;

  /**
	 * The operation id for the '<em>Collect Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_FACADE___COLLECT_INITIALIZATION_DATA__ENVIRONMENT = 27;

  /**
	 * The operation id for the '<em>Apply Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_FACADE___APPLY_INITIALIZATION_DATA__VARIABLE = 28;

  /**
	 * The operation id for the '<em>Collect Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_FACADE___COLLECT_INITIALIZATION_DATA__VARIABLE = 29;

  /**
	 * The operation id for the '<em>Load Registered Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ECORE_INVOCATOR_FACADE___LOAD_REGISTERED_TYPES__INVOCATORSESSION = 30;

		/**
	 * The operation id for the '<em>Get All Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ECORE_INVOCATOR_FACADE___GET_ALL_TYPES__ENVIRONMENT = 31;

		/**
	 * The number of operations of the '<em>EMF Ecore Invocator Facade</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_FACADE_OPERATION_COUNT = 32;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.InvocatorSessionImpl <em>Invocator Session</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.InvocatorSessionImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getInvocatorSession()
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
  int INVOCATOR_SESSION__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INVOCATOR_SESSION__DESCRIPTION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INVOCATOR_SESSION__ENVIRONMENT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Programs List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INVOCATOR_SESSION__PROGRAMS_LIST = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Data Products List Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INVOCATOR_SESSION__DATA_PRODUCTS_LIST_CONTAINER = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Tools List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INVOCATOR_SESSION__TOOLS_LIST = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 4;

  /**
	 * The number of structural features of the '<em>Invocator Session</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INVOCATOR_SESSION_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 5;

  /**
	 * The number of operations of the '<em>Invocator Session</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INVOCATOR_SESSION_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.EnvironmentImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getEnvironment()
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
  int ENVIRONMENT__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENVIRONMENT__DESCRIPTION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Invocator Session</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENVIRONMENT__INVOCATOR_SESSION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Types List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENVIRONMENT__TYPES_LIST = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Variables List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENVIRONMENT__VARIABLES_LIST = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Contexts List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENVIRONMENT__CONTEXTS_LIST = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Active Context</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENVIRONMENT__ACTIVE_CONTEXT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 5;

  /**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENVIRONMENT_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 6;

  /**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENVIRONMENT_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.DataProductsListsContainerImpl <em>Data Products Lists Container</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.DataProductsListsContainerImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getDataProductsListsContainer()
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
  int DATA_PRODUCTS_LISTS_CONTAINER__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATA_PRODUCTS_LISTS_CONTAINER__DESCRIPTION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Invocator Session</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATA_PRODUCTS_LISTS_CONTAINER__INVOCATOR_SESSION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Data Products List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATA_PRODUCTS_LISTS_CONTAINER__DATA_PRODUCTS_LIST = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Data Products Lists Container</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATA_PRODUCTS_LISTS_CONTAINER_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 3;

  /**
	 * The number of operations of the '<em>Data Products Lists Container</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATA_PRODUCTS_LISTS_CONTAINER_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.DataProductsListImpl <em>Data Products List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.DataProductsListImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getDataProductsList()
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
  int DATA_PRODUCTS_LIST__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATA_PRODUCTS_LIST__DESCRIPTION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Data Products Lists Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATA_PRODUCTS_LIST__DATA_PRODUCTS_LISTS_CONTAINER = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Operation Call Results List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATA_PRODUCTS_LIST__OPERATION_CALL_RESULTS_LIST = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Recording Results List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATA_PRODUCTS_LIST__RECORDING_RESULTS_LIST = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRODUCTS_LIST__INVOCATOR_SESSION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 4;

		/**
	 * The number of structural features of the '<em>Data Products List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATA_PRODUCTS_LIST_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 5;

  /**
	 * The number of operations of the '<em>Data Products List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATA_PRODUCTS_LIST_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.ToolsListImpl <em>Tools List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.ToolsListImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getToolsList()
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
  int TOOLS_LIST__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOOLS_LIST__DESCRIPTION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Invocator Session</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOOLS_LIST__INVOCATOR_SESSION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Tools List Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOOLS_LIST__TOOLS_LIST_CONTAINERS = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Tools List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOOLS_LIST_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 3;

  /**
	 * The number of operations of the '<em>Tools List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOOLS_LIST_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.AbstractToolsListContainerImpl <em>Abstract Tools List Container</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.AbstractToolsListContainerImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getAbstractToolsListContainer()
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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.TypesListImpl <em>Types List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.TypesListImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getTypesList()
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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.LocalTypesListImpl <em>Local Types List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.LocalTypesListImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getLocalTypesList()
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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.RegisteredTypesListImpl <em>Registered Types List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.RegisteredTypesListImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getRegisteredTypesList()
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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.AbstractType <em>Abstract Type</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.AbstractType
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getAbstractType()
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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.TypeImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getType()
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
  int TYPE__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

  /**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TYPE__MEMBERS = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Interface Class</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TYPE__INTERFACE_CLASS = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Type Api Adapter Class</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TYPE__TYPE_API_ADAPTER_CLASS = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TYPE_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 3;

  /**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TYPE_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.TypeApiAdapterImpl <em>Type Api Adapter</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.TypeApiAdapterImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getTypeApiAdapter()
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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.TypeMemberImpl <em>Type Member</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.TypeMemberImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getTypeMember()
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
  int TYPE_MEMBER__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

  /**
	 * The feature id for the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TYPE_MEMBER__MEMBER_TYPE = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Type Feature Root Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TYPE_MEMBER__TYPE_FEATURE_ROOT_NODE = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Type Member</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TYPE_MEMBER_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Type Member</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TYPE_MEMBER_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.TypeMemberReferenceImpl <em>Type Member Reference</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.TypeMemberReferenceImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getTypeMemberReference()
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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.TypeMemberReferenceListElementImpl <em>Type Member Reference List Element</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.TypeMemberReferenceListElementImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getTypeMemberReferenceListElement()
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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.TypeMemberReferenceTreeElementImpl <em>Type Member Reference Tree Element</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.TypeMemberReferenceTreeElementImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getTypeMemberReferenceTreeElement()
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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.VariablesListImpl <em>Variables List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.VariablesListImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getVariablesList()
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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.VariableImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getVariable()
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
  int VARIABLE__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

  /**
	 * The feature id for the '<em><b>Variables List</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE__VARIABLES_LIST = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Variable Type</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE__VARIABLE_TYPE = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE__ENVIRONMENT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 3;

  /**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.ContextsListImpl <em>Contexts List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.ContextsListImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getContextsList()
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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.ContextImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getContext()
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
  int CONTEXT__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

  /**
	 * The feature id for the '<em><b>Contexts List</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTEXT__CONTEXTS_LIST = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Variable Implementations List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTEXT__VARIABLE_IMPLEMENTATIONS_LIST = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTEXT__ENVIRONMENT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Data Products List</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTEXT__DATA_PRODUCTS_LIST = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Instances Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTEXT__INSTANCES_CREATION_DATE = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Instances Disposal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTEXT__INSTANCES_DISPOSAL_DATE = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 5;

  /**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTEXT_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 6;

  /**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTEXT_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.BasicContextImpl <em>Basic Context</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.BasicContextImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getBasicContext()
	 * @generated
	 */
  int BASIC_CONTEXT = 21;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BASIC_CONTEXT__NAME = CONTEXT__NAME;

  /**
	 * The feature id for the '<em><b>Contexts List</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BASIC_CONTEXT__CONTEXTS_LIST = CONTEXT__CONTEXTS_LIST;

  /**
	 * The feature id for the '<em><b>Variable Implementations List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BASIC_CONTEXT__VARIABLE_IMPLEMENTATIONS_LIST = CONTEXT__VARIABLE_IMPLEMENTATIONS_LIST;

  /**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BASIC_CONTEXT__ENVIRONMENT = CONTEXT__ENVIRONMENT;

  /**
	 * The feature id for the '<em><b>Data Products List</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BASIC_CONTEXT__DATA_PRODUCTS_LIST = CONTEXT__DATA_PRODUCTS_LIST;

  /**
	 * The feature id for the '<em><b>Instances Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BASIC_CONTEXT__INSTANCES_CREATION_DATE = CONTEXT__INSTANCES_CREATION_DATE;

  /**
	 * The feature id for the '<em><b>Instances Disposal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BASIC_CONTEXT__INSTANCES_DISPOSAL_DATE = CONTEXT__INSTANCES_DISPOSAL_DATE;

  /**
	 * The number of structural features of the '<em>Basic Context</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BASIC_CONTEXT_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 0;

  /**
	 * The number of operations of the '<em>Basic Context</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BASIC_CONTEXT_OPERATION_COUNT = CONTEXT_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.VariableImplementationsListImpl <em>Variable Implementations List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.VariableImplementationsListImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getVariableImplementationsList()
	 * @generated
	 */
  int VARIABLE_IMPLEMENTATIONS_LIST = 22;

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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.AbstractInitializationDataImpl <em>Abstract Initialization Data</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.AbstractInitializationDataImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getAbstractInitializationData()
	 * @generated
	 */
  int ABSTRACT_INITIALIZATION_DATA = 23;

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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.InitializationDataImpl <em>Initialization Data</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.InitializationDataImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getInitializationData()
	 * @generated
	 */
  int INITIALIZATION_DATA = 24;

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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.AbstractTypeImplementationImpl <em>Abstract Type Implementation</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.AbstractTypeImplementationImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getAbstractTypeImplementation()
	 * @generated
	 */
  int ABSTRACT_TYPE_IMPLEMENTATION = 25;

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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.VariableImplementationImpl <em>Variable Implementation</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.VariableImplementationImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getVariableImplementation()
	 * @generated
	 */
  int VARIABLE_IMPLEMENTATION = 26;

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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.TypeMemberImplementationImpl <em>Type Member Implementation</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.TypeMemberImplementationImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getTypeMemberImplementation()
	 * @generated
	 */
  int TYPE_MEMBER_IMPLEMENTATION = 27;

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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.ValuesListImpl <em>Values List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.ValuesListImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getValuesList()
	 * @generated
	 */
  int VALUES_LIST = 28;

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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.ValueImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getValue()
	 * @generated
	 */
  int VALUE = 29;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VALUE__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

  /**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VALUE__VALUE = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VALUE_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VALUE_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.ProgramsListImpl <em>Programs List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.ProgramsListImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getProgramsList()
	 * @generated
	 */
  int PROGRAMS_LIST = 30;

  /**
	 * The feature id for the '<em><b>Invocator Session</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROGRAMS_LIST__INVOCATOR_SESSION = 0;

  /**
	 * The feature id for the '<em><b>Programs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROGRAMS_LIST__PROGRAMS = 1;

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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.ProgramImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getProgram()
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
  int PROGRAM__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROGRAM__DESCRIPTION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Programs List</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROGRAM__PROGRAMS_LIST = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROGRAM__INVOCATOR_SESSION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Values List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__VALUES_LIST = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 3;

		/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROGRAM_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 4;

  /**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROGRAM_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.OperationCallContainer <em>Operation Call Container</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.OperationCallContainer
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getOperationCallContainer()
	 * @generated
	 */
  int OPERATION_CALL_CONTAINER = 32;

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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.OperationCallsListImpl <em>Operation Calls List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.OperationCallsListImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getOperationCallsList()
	 * @generated
	 */
  int OPERATION_CALLS_LIST = 33;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPERATION_CALLS_LIST__NAME = PROGRAM__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPERATION_CALLS_LIST__DESCRIPTION = PROGRAM__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Programs List</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPERATION_CALLS_LIST__PROGRAMS_LIST = PROGRAM__PROGRAMS_LIST;

  /**
	 * The feature id for the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPERATION_CALLS_LIST__INVOCATOR_SESSION = PROGRAM__INVOCATOR_SESSION;

  /**
	 * The feature id for the '<em><b>Values List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALLS_LIST__VALUES_LIST = PROGRAM__VALUES_LIST;

		/**
	 * The feature id for the '<em><b>Operation Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPERATION_CALLS_LIST__OPERATION_CALLS = PROGRAM_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Operation Calls List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPERATION_CALLS_LIST_FEATURE_COUNT = PROGRAM_FEATURE_COUNT + 1;

  /**
	 * The operation id for the '<em>Get Invocator Session</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPERATION_CALLS_LIST___GET_INVOCATOR_SESSION = PROGRAM_OPERATION_COUNT + 0;

  /**
	 * The number of operations of the '<em>Operation Calls List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPERATION_CALLS_LIST_OPERATION_COUNT = PROGRAM_OPERATION_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.VariableFeatureReferenceImpl <em>Variable Feature Reference</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.VariableFeatureReferenceImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getVariableFeatureReference()
	 * @generated
	 */
  int VARIABLE_FEATURE_REFERENCE = 34;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_REFERENCE__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

		/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_FEATURE_REFERENCE__VARIABLE = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Type Member Reference List Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Feature Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Variable Feature Reference</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_FEATURE_REFERENCE_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 3;

  /**
	 * The number of operations of the '<em>Variable Feature Reference</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_FEATURE_REFERENCE_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.OperationCallImpl <em>Operation Call</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.OperationCallImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getOperationCall()
	 * @generated
	 */
  int OPERATION_CALL = 35;

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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.ArgumentsListImpl <em>Arguments List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.ArgumentsListImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getArgumentsList()
	 * @generated
	 */
  int ARGUMENTS_LIST = 36;

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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.ArgumentImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getArgument()
	 * @generated
	 */
  int ARGUMENT = 37;

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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.EDataTypeArgumentImpl <em>EData Type Argument</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.EDataTypeArgumentImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getEDataTypeArgument()
	 * @generated
	 */
  int EDATA_TYPE_ARGUMENT = 38;

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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.EEnumArgumentImpl <em>EEnum Argument</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.EEnumArgumentImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getEEnumArgument()
	 * @generated
	 */
  int EENUM_ARGUMENT = 39;

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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.EClassArgumentImpl <em>EClass Argument</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.EClassArgumentImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getEClassArgument()
	 * @generated
	 */
  int ECLASS_ARGUMENT = 40;

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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.ResultsList <em>Results List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.ResultsList
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getResultsList()
	 * @generated
	 */
  int RESULTS_LIST = 41;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULTS_LIST__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULTS_LIST__DESCRIPTION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULTS_LIST__RESULTS = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Results List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULTS_LIST_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 2;

  /**
	 * The operation id for the '<em>Get Invocator Session</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_LIST___GET_INVOCATOR_SESSION = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

		/**
	 * The number of operations of the '<em>Results List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULTS_LIST_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.OperationCallResultsListImpl <em>Operation Call Results List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.OperationCallResultsListImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getOperationCallResultsList()
	 * @generated
	 */
  int OPERATION_CALL_RESULTS_LIST = 42;

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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.RecordingResultsListImpl <em>Recording Results List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.RecordingResultsListImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getRecordingResultsList()
	 * @generated
	 */
  int RECORDING_RESULTS_LIST = 43;

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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.AbstractResultImpl <em>Abstract Result</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.AbstractResultImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getAbstractResult()
	 * @generated
	 */
  int ABSTRACT_RESULT = 44;

  /**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_RESULT__TIME = Symphony__CommonEMFPackage.TIMED__TIME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT__DESCRIPTION = Symphony__CommonEMFPackage.TIMED_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Results List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT__RESULTS_LIST = Symphony__CommonEMFPackage.TIMED_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT__INVOCATOR_SESSION = Symphony__CommonEMFPackage.TIMED_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_RESULT__CONTEXT = Symphony__CommonEMFPackage.TIMED_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Result Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_RESULT__RESULT_VALUE = Symphony__CommonEMFPackage.TIMED_FEATURE_COUNT + 4;

  /**
	 * The number of structural features of the '<em>Abstract Result</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_RESULT_FEATURE_COUNT = Symphony__CommonEMFPackage.TIMED_FEATURE_COUNT + 5;

  /**
	 * The number of operations of the '<em>Abstract Result</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_RESULT_OPERATION_COUNT = Symphony__CommonEMFPackage.TIMED_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.AbstractResultValueImpl <em>Abstract Result Value</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.AbstractResultValueImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getAbstractResultValue()
	 * @generated
	 */
  int ABSTRACT_RESULT_VALUE = 45;

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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.OperationCallResultImpl <em>Operation Call Result</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.OperationCallResultImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getOperationCallResult()
	 * @generated
	 */
  int OPERATION_CALL_RESULT = 46;

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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.ExceptionContainerImpl <em>Exception Container</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.ExceptionContainerImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getExceptionContainer()
	 * @generated
	 */
  int EXCEPTION_CONTAINER = 47;

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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.AttributeResultValueImpl <em>Attribute Result Value</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.AttributeResultValueImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getAttributeResultValue()
	 * @generated
	 */
  int ATTRIBUTE_RESULT_VALUE = 48;

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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.AttributeValueImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getAttributeValue()
	 * @generated
	 */
  int ATTRIBUTE_VALUE = 49;

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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.ReferenceResultValueImpl <em>Reference Result Value</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.ReferenceResultValueImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getReferenceResultValue()
	 * @generated
	 */
  int REFERENCE_RESULT_VALUE = 50;

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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.WatchesListsContainerImpl <em>Watches Lists Container</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.WatchesListsContainerImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getWatchesListsContainer()
	 * @generated
	 */
  int WATCHES_LISTS_CONTAINER = 51;

  /**
	 * The feature id for the '<em><b>Tools List</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WATCHES_LISTS_CONTAINER__TOOLS_LIST = ABSTRACT_TOOLS_LIST_CONTAINER__TOOLS_LIST;

  /**
	 * The feature id for the '<em><b>Watches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WATCHES_LISTS_CONTAINER__WATCHES = ABSTRACT_TOOLS_LIST_CONTAINER_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Watches Lists Container</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WATCHES_LISTS_CONTAINER_FEATURE_COUNT = ABSTRACT_TOOLS_LIST_CONTAINER_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Watches Lists Container</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WATCHES_LISTS_CONTAINER_OPERATION_COUNT = ABSTRACT_TOOLS_LIST_CONTAINER_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.WatchesListImpl <em>Watches List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.WatchesListImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getWatchesList()
	 * @generated
	 */
  int WATCHES_LIST = 52;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WATCHES_LIST__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WATCHES_LIST__DESCRIPTION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Watches Lists Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WATCHES_LIST__WATCHES_LISTS_CONTAINER = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Watches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WATCHES_LIST__WATCHES = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Watches List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WATCHES_LIST_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 3;

  /**
	 * The number of operations of the '<em>Watches List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WATCHES_LIST_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.WatchImpl <em>Watch</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.WatchImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getWatch()
	 * @generated
	 */
  int WATCH = 53;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATCH__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WATCH__DESCRIPTION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Watches List</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WATCH__WATCHES_LIST = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WATCH__VARIABLE = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Type Member Reference Tree Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WATCH__TYPE_MEMBER_REFERENCE_TREE_ELEMENT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Tree Root Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WATCH__TREE_ROOT_NODE = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 4;

  /**
	 * The number of structural features of the '<em>Watch</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WATCH_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 5;

  /**
	 * The number of operations of the '<em>Watch</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WATCH_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.WatchFeatureNodeAdapterImpl <em>Watch Feature Node Adapter</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.WatchFeatureNodeAdapterImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getWatchFeatureNodeAdapter()
	 * @generated
	 */
  int WATCH_FEATURE_NODE_ADAPTER = 54;

  /**
	 * The feature id for the '<em><b>Source Object</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WATCH_FEATURE_NODE_ADAPTER__SOURCE_OBJECT = 0;

  /**
	 * The feature id for the '<em><b>Feature Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WATCH_FEATURE_NODE_ADAPTER__FEATURE_NODE = 1;

  /**
	 * The feature id for the '<em><b>Current Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WATCH_FEATURE_NODE_ADAPTER__CURRENT_VALUE = 2;

  /**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WATCH_FEATURE_NODE_ADAPTER__RESOLVED = 3;

  /**
	 * The number of structural features of the '<em>Watch Feature Node Adapter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WATCH_FEATURE_NODE_ADAPTER_FEATURE_COUNT = 4;

  /**
	 * The number of operations of the '<em>Watch Feature Node Adapter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WATCH_FEATURE_NODE_ADAPTER_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.DisplaysListsContainerImpl <em>Displays Lists Container</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.DisplaysListsContainerImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getDisplaysListsContainer()
	 * @generated
	 */
  int DISPLAYS_LISTS_CONTAINER = 55;

  /**
	 * The feature id for the '<em><b>Tools List</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DISPLAYS_LISTS_CONTAINER__TOOLS_LIST = ABSTRACT_TOOLS_LIST_CONTAINER__TOOLS_LIST;

  /**
	 * The feature id for the '<em><b>Displays</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DISPLAYS_LISTS_CONTAINER__DISPLAYS = ABSTRACT_TOOLS_LIST_CONTAINER_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Displays Lists Container</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DISPLAYS_LISTS_CONTAINER_FEATURE_COUNT = ABSTRACT_TOOLS_LIST_CONTAINER_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Displays Lists Container</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DISPLAYS_LISTS_CONTAINER_OPERATION_COUNT = ABSTRACT_TOOLS_LIST_CONTAINER_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.DisplaysListImpl <em>Displays List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.DisplaysListImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getDisplaysList()
	 * @generated
	 */
  int DISPLAYS_LIST = 56;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DISPLAYS_LIST__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DISPLAYS_LIST__DESCRIPTION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Displays Lists Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DISPLAYS_LIST__DISPLAYS_LISTS_CONTAINER = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Displays</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DISPLAYS_LIST__DISPLAYS = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Displays List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DISPLAYS_LIST_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 3;

  /**
	 * The number of operations of the '<em>Displays List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DISPLAYS_LIST_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.AbstractDisplayImpl <em>Abstract Display</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.AbstractDisplayImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getAbstractDisplay()
	 * @generated
	 */
  int ABSTRACT_DISPLAY = 57;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_DISPLAY__DESCRIPTION = Symphony__CommonEMFPackage.DESCRIBED__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Displays List</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_DISPLAY__DISPLAYS_LIST = Symphony__CommonEMFPackage.DESCRIBED_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Abstract Display</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_DISPLAY_FEATURE_COUNT = Symphony__CommonEMFPackage.DESCRIBED_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Abstract Display</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_DISPLAY_OPERATION_COUNT = Symphony__CommonEMFPackage.DESCRIBED_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.RecordingToolsContainerImpl <em>Recording Tools Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.RecordingToolsContainerImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getRecordingToolsContainer()
	 * @generated
	 */
	int RECORDING_TOOLS_CONTAINER = 58;

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
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.ChannelsListImpl <em>Channels List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.ChannelsListImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getChannelsList()
	 * @generated
	 */
	int CHANNELS_LIST = 59;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS_LIST__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS_LIST__DESCRIPTION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Channels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS_LIST__CHANNELS = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Recording Tools Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS_LIST__RECORDING_TOOLS_CONTAINER = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 2;

		/**
	 * The number of structural features of the '<em>Channels List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS_LIST_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 3;

		/**
	 * The number of operations of the '<em>Channels List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS_LIST_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.AbstractChannelImpl <em>Abstract Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.AbstractChannelImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getAbstractChannel()
	 * @generated
	 */
	int ABSTRACT_CHANNEL = 60;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CHANNEL__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CHANNEL__DESCRIPTION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Channels List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CHANNEL__CHANNELS_LIST = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Abstract Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CHANNEL_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 2;

		/**
	 * The number of operations of the '<em>Abstract Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CHANNEL_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.AbstractRecorderImpl <em>Abstract Recorder</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.AbstractRecorderImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getAbstractRecorder()
	 * @generated
	 */
  int ABSTRACT_RECORDER = 61;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_RECORDER__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_RECORDER__DESCRIPTION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Recording Tools Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RECORDER__RECORDING_TOOLS_CONTAINER = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Abstract Recorder</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_RECORDER_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Abstract Recorder</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_RECORDER_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.AbstractPlayerImpl <em>Abstract Player</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.AbstractPlayerImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getAbstractPlayer()
	 * @generated
	 */
  int ABSTRACT_PLAYER = 62;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_PLAYER__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_PLAYER__DESCRIPTION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Recording Tools Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PLAYER__RECORDING_TOOLS_CONTAINER = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Abstract Player</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_PLAYER_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Abstract Player</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_PLAYER_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.invocator.impl.OperationCallResultsListTimeSourceImpl <em>Operation Call Results List Time Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.OperationCallResultsListTimeSourceImpl
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getOperationCallResultsListTimeSource()
	 * @generated
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE = 63;

		/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__TIME = Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__TIME;

		/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__START_TIME = Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__START_TIME;

		/**
	 * The feature id for the '<em><b>Update Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__UPDATE_PERIOD = Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__UPDATE_PERIOD;

		/**
	 * The feature id for the '<em><b>Time Acceration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__TIME_ACCERATION = Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__TIME_ACCERATION;

		/**
	 * The feature id for the '<em><b>Time Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__TIME_DIRECTION = Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__TIME_DIRECTION;

		/**
	 * The feature id for the '<em><b>Loop Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__LOOP_ENABLE = Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__LOOP_ENABLE;

		/**
	 * The feature id for the '<em><b>Timeds List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__TIMEDS_LIST = Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__TIMEDS_LIST;

		/**
	 * The feature id for the '<em><b>Current Timed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__CURRENT_TIMED_ELEMENT = Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__CURRENT_TIMED_ELEMENT;

		/**
	 * The feature id for the '<em><b>Earliest Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__EARLIEST_DATE = Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__EARLIEST_DATE;

		/**
	 * The feature id for the '<em><b>Latest Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__LATEST_DATE = Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__LATEST_DATE;

		/**
	 * The feature id for the '<em><b>Ops Call List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__OPS_CALL_LIST = Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Operation Call Results List Time Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE_FEATURE_COUNT = Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE_FEATURE_COUNT + 1;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE___DISPOSE = Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE___DISPOSE;

		/**
	 * The operation id for the '<em>Play Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE___PLAY_FORWARD = Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE___PLAY_FORWARD;

		/**
	 * The operation id for the '<em>Play Reverse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE___PLAY_REVERSE = Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE___PLAY_REVERSE;

		/**
	 * The operation id for the '<em>Pause</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE___PAUSE = Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE___PAUSE;

		/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE___RESET = Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE___RESET;

		/**
	 * The operation id for the '<em>Jump To Next</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE___JUMP_TO_NEXT = Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE___JUMP_TO_NEXT;

		/**
	 * The operation id for the '<em>Jump To Previous</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE___JUMP_TO_PREVIOUS = Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE___JUMP_TO_PREVIOUS;

		/**
	 * The number of operations of the '<em>Operation Call Results List Time Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_RESULTS_LIST_TIME_SOURCE_OPERATION_COUNT = Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '<em>Throwable</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.lang.Throwable
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getThrowable()
	 * @generated
	 */
  int THROWABLE = 64;

  /**
	 * The meta object id for the '<em>Notification</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.notify.Notification
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getNotification()
	 * @generated
	 */
  int NOTIFICATION = 65;


  /**
	 * The meta object id for the '<em>Type Member Implementations EList</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.EList
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getTypeMemberImplementationsEList()
	 * @generated
	 */
  int TYPE_MEMBER_IMPLEMENTATIONS_ELIST = 66;


  /**
	 * The meta object id for the '<em>Type Members Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getTypeMembersArray()
	 * @generated
	 */
	int TYPE_MEMBERS_ARRAY = 67;


		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade <em>EMF Ecore Invocator Facade</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Ecore Invocator Facade</em>'.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade
	 * @generated
	 */
  EClass getEMFEcoreInvocatorFacade();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getActiveInvocatorSession <em>Active Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Invocator Session</em>'.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getActiveInvocatorSession()
	 * @see #getEMFEcoreInvocatorFacade()
	 * @generated
	 */
	EReference getEMFEcoreInvocatorFacade_ActiveInvocatorSession();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#exec(org.eclipse.symphony.core.invocator.OperationCall) <em>Exec</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exec</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#exec(org.eclipse.symphony.core.invocator.OperationCall)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorFacade__Exec__OperationCall();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#exec(org.eclipse.symphony.core.invocator.OperationCall, boolean) <em>Exec</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exec</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#exec(org.eclipse.symphony.core.invocator.OperationCall, boolean)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorFacade__Exec__OperationCall_boolean();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#exec(org.eclipse.symphony.core.invocator.OperationCallsList) <em>Exec</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exec</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#exec(org.eclipse.symphony.core.invocator.OperationCallsList)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorFacade__Exec__OperationCallsList();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#createAbstractResultValue(java.lang.Object) <em>Create Abstract Result Value</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Abstract Result Value</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#createAbstractResultValue(java.lang.Object)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorFacade__CreateAbstractResultValue__Object();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#resolveWatch(org.eclipse.symphony.common.emf.AbstractFeatureNode) <em>Resolve Watch</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Watch</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#resolveWatch(org.eclipse.symphony.common.emf.AbstractFeatureNode)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorFacade__ResolveWatch__AbstractFeatureNode();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#resolveWatch(org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement) <em>Resolve Watch</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Watch</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#resolveWatch(org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorFacade__ResolveWatch__TypeMemberReferenceTreeElement();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getValue(org.eclipse.symphony.common.emf.AbstractFeatureNode) <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getValue(org.eclipse.symphony.common.emf.AbstractFeatureNode)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorFacade__GetValue__AbstractFeatureNode();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getInstance(org.eclipse.symphony.core.invocator.Variable) <em>Get Instance</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Instance</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getInstance(org.eclipse.symphony.core.invocator.Variable)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorFacade__GetInstance__Variable();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getInstanceClass(org.eclipse.symphony.core.invocator.Variable) <em>Get Instance Class</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Instance Class</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getInstanceClass(org.eclipse.symphony.core.invocator.Variable)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorFacade__GetInstanceClass__Variable();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getTypeApiAdapter(org.eclipse.symphony.core.invocator.VariableFeatureReference) <em>Get Type Api Adapter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type Api Adapter</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getTypeApiAdapter(org.eclipse.symphony.core.invocator.VariableFeatureReference)
	 * @generated
	 */
	EOperation getEMFEcoreInvocatorFacade__GetTypeApiAdapter__VariableFeatureReference();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getInstance(org.eclipse.symphony.core.invocator.VariableFeatureReference) <em>Get Instance</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Instance</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getInstance(org.eclipse.symphony.core.invocator.VariableFeatureReference)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorFacade__GetInstance__VariableFeatureReference();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getTypeMemberInstance(org.eclipse.symphony.core.invocator.VariableFeatureReference) <em>Get Type Member Instance</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type Member Instance</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getTypeMemberInstance(org.eclipse.symphony.core.invocator.VariableFeatureReference)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorFacade__GetTypeMemberInstance__VariableFeatureReference();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getEMFFeatureValue(org.eclipse.symphony.core.invocator.VariableFeatureReference) <em>Get EMF Feature Value</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EMF Feature Value</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getEMFFeatureValue(org.eclipse.symphony.core.invocator.VariableFeatureReference)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorFacade__GetEMFFeatureValue__VariableFeatureReference();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getInstanceClass(org.eclipse.symphony.core.invocator.VariableFeatureReference) <em>Get Instance Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Instance Class</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getInstanceClass(org.eclipse.symphony.core.invocator.VariableFeatureReference)
	 * @generated
	 */
	EOperation getEMFEcoreInvocatorFacade__GetInstanceClass__VariableFeatureReference();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getInstance(org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement) <em>Get Instance</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Instance</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getInstance(org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorFacade__GetInstance__TypeMemberReferenceTreeElement();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getTypeImplementation(org.eclipse.symphony.core.invocator.OperationCall) <em>Get Type Implementation</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type Implementation</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getTypeImplementation(org.eclipse.symphony.core.invocator.OperationCall)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorFacade__GetTypeImplementation__OperationCall();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getTypeImplementation(org.eclipse.symphony.core.invocator.Variable, org.eclipse.symphony.core.invocator.AbstractType) <em>Get Type Implementation</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type Implementation</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getTypeImplementation(org.eclipse.symphony.core.invocator.Variable, org.eclipse.symphony.core.invocator.AbstractType)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorFacade__GetTypeImplementation__Variable_AbstractType();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getTypeImplementation(org.eclipse.symphony.core.invocator.Variable) <em>Get Type Implementation</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type Implementation</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getTypeImplementation(org.eclipse.symphony.core.invocator.Variable)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorFacade__GetTypeImplementation__Variable();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#createTypeMemberReferences(org.eclipse.symphony.core.invocator.TypeMember[]) <em>Create Type Member References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Type Member References</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#createTypeMemberReferences(org.eclipse.symphony.core.invocator.TypeMember[])
	 * @generated
	 */
	EOperation getEMFEcoreInvocatorFacade__CreateTypeMemberReferences__TypeMember();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getTypeImplementation(org.eclipse.symphony.core.invocator.Environment, java.lang.String) <em>Get Type Implementation</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type Implementation</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getTypeImplementation(org.eclipse.symphony.core.invocator.Environment, java.lang.String)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorFacade__GetTypeImplementation__Environment_String();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getFullyQualifiedName(org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement) <em>Get Fully Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Fully Qualified Name</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getFullyQualifiedName(org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorFacade__GetFullyQualifiedName__TypeMemberReferenceTreeElement();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getFullyQualifiedName(org.eclipse.symphony.common.emf.AbstractFeatureNode) <em>Get Fully Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Fully Qualified Name</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getFullyQualifiedName(org.eclipse.symphony.common.emf.AbstractFeatureNode)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorFacade__GetFullyQualifiedName__AbstractFeatureNode();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#createTypeMemberImplementations(org.eclipse.symphony.core.invocator.Type) <em>Create Type Member Implementations</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Type Member Implementations</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#createTypeMemberImplementations(org.eclipse.symphony.core.invocator.Type)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorFacade__CreateTypeMemberImplementations__Type();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#initVariableInstances(org.eclipse.symphony.core.invocator.Environment) <em>Init Variable Instances</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init Variable Instances</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#initVariableInstances(org.eclipse.symphony.core.invocator.Environment)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorFacade__InitVariableInstances__Environment();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#disposeVariableInstances(org.eclipse.symphony.core.invocator.Environment) <em>Dispose Variable Instances</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dispose Variable Instances</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#disposeVariableInstances(org.eclipse.symphony.core.invocator.Environment)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorFacade__DisposeVariableInstances__Environment();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getOperationCallContainer(org.eclipse.symphony.core.invocator.TypeMemberReferenceListElement) <em>Get Operation Call Container</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Operation Call Container</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getOperationCallContainer(org.eclipse.symphony.core.invocator.TypeMemberReferenceListElement)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorFacade__GetOperationCallContainer__TypeMemberReferenceListElement();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#applyInitializationData(org.eclipse.symphony.core.invocator.Environment) <em>Apply Initialization Data</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Initialization Data</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#applyInitializationData(org.eclipse.symphony.core.invocator.Environment)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorFacade__ApplyInitializationData__Environment();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#collectInitializationData(org.eclipse.symphony.core.invocator.Environment) <em>Collect Initialization Data</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Collect Initialization Data</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#collectInitializationData(org.eclipse.symphony.core.invocator.Environment)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorFacade__CollectInitializationData__Environment();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#applyInitializationData(org.eclipse.symphony.core.invocator.Variable) <em>Apply Initialization Data</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Initialization Data</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#applyInitializationData(org.eclipse.symphony.core.invocator.Variable)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorFacade__ApplyInitializationData__Variable();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#collectInitializationData(org.eclipse.symphony.core.invocator.Variable) <em>Collect Initialization Data</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Collect Initialization Data</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#collectInitializationData(org.eclipse.symphony.core.invocator.Variable)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorFacade__CollectInitializationData__Variable();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#loadRegisteredTypes(org.eclipse.symphony.core.invocator.InvocatorSession) <em>Load Registered Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Registered Types</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#loadRegisteredTypes(org.eclipse.symphony.core.invocator.InvocatorSession)
	 * @generated
	 */
	EOperation getEMFEcoreInvocatorFacade__LoadRegisteredTypes__InvocatorSession();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getAllTypes(org.eclipse.symphony.core.invocator.Environment) <em>Get All Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Types</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getAllTypes(org.eclipse.symphony.core.invocator.Environment)
	 * @generated
	 */
	EOperation getEMFEcoreInvocatorFacade__GetAllTypes__Environment();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.InvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invocator Session</em>'.
	 * @see org.eclipse.symphony.core.invocator.InvocatorSession
	 * @generated
	 */
  EClass getInvocatorSession();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.invocator.InvocatorSession#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment</em>'.
	 * @see org.eclipse.symphony.core.invocator.InvocatorSession#getEnvironment()
	 * @see #getInvocatorSession()
	 * @generated
	 */
  EReference getInvocatorSession_Environment();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.invocator.InvocatorSession#getProgramsList <em>Programs List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Programs List</em>'.
	 * @see org.eclipse.symphony.core.invocator.InvocatorSession#getProgramsList()
	 * @see #getInvocatorSession()
	 * @generated
	 */
  EReference getInvocatorSession_ProgramsList();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.invocator.InvocatorSession#getDataProductsListContainer <em>Data Products List Container</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Products List Container</em>'.
	 * @see org.eclipse.symphony.core.invocator.InvocatorSession#getDataProductsListContainer()
	 * @see #getInvocatorSession()
	 * @generated
	 */
  EReference getInvocatorSession_DataProductsListContainer();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.invocator.InvocatorSession#getToolsList <em>Tools List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tools List</em>'.
	 * @see org.eclipse.symphony.core.invocator.InvocatorSession#getToolsList()
	 * @see #getInvocatorSession()
	 * @generated
	 */
  EReference getInvocatorSession_ToolsList();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see org.eclipse.symphony.core.invocator.Environment
	 * @generated
	 */
  EClass getEnvironment();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.invocator.Environment#getInvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Invocator Session</em>'.
	 * @see org.eclipse.symphony.core.invocator.Environment#getInvocatorSession()
	 * @see #getEnvironment()
	 * @generated
	 */
  EReference getEnvironment_InvocatorSession();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.invocator.Environment#getTypesList <em>Types List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Types List</em>'.
	 * @see org.eclipse.symphony.core.invocator.Environment#getTypesList()
	 * @see #getEnvironment()
	 * @generated
	 */
  EReference getEnvironment_TypesList();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.invocator.Environment#getVariablesList <em>Variables List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variables List</em>'.
	 * @see org.eclipse.symphony.core.invocator.Environment#getVariablesList()
	 * @see #getEnvironment()
	 * @generated
	 */
  EReference getEnvironment_VariablesList();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.invocator.Environment#getContextsList <em>Contexts List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contexts List</em>'.
	 * @see org.eclipse.symphony.core.invocator.Environment#getContextsList()
	 * @see #getEnvironment()
	 * @generated
	 */
  EReference getEnvironment_ContextsList();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.Environment#getActiveContext <em>Active Context</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Context</em>'.
	 * @see org.eclipse.symphony.core.invocator.Environment#getActiveContext()
	 * @see #getEnvironment()
	 * @generated
	 */
  EReference getEnvironment_ActiveContext();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.DataProductsListsContainer <em>Data Products Lists Container</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Products Lists Container</em>'.
	 * @see org.eclipse.symphony.core.invocator.DataProductsListsContainer
	 * @generated
	 */
  EClass getDataProductsListsContainer();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.invocator.DataProductsListsContainer#getInvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Invocator Session</em>'.
	 * @see org.eclipse.symphony.core.invocator.DataProductsListsContainer#getInvocatorSession()
	 * @see #getDataProductsListsContainer()
	 * @generated
	 */
  EReference getDataProductsListsContainer_InvocatorSession();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.invocator.DataProductsListsContainer#getDataProductsList <em>Data Products List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Products List</em>'.
	 * @see org.eclipse.symphony.core.invocator.DataProductsListsContainer#getDataProductsList()
	 * @see #getDataProductsListsContainer()
	 * @generated
	 */
  EReference getDataProductsListsContainer_DataProductsList();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.DataProductsList <em>Data Products List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Products List</em>'.
	 * @see org.eclipse.symphony.core.invocator.DataProductsList
	 * @generated
	 */
  EClass getDataProductsList();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.invocator.DataProductsList#getDataProductsListsContainer <em>Data Products Lists Container</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Products Lists Container</em>'.
	 * @see org.eclipse.symphony.core.invocator.DataProductsList#getDataProductsListsContainer()
	 * @see #getDataProductsList()
	 * @generated
	 */
  EReference getDataProductsList_DataProductsListsContainer();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.invocator.DataProductsList#getOperationCallResultsList <em>Operation Call Results List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation Call Results List</em>'.
	 * @see org.eclipse.symphony.core.invocator.DataProductsList#getOperationCallResultsList()
	 * @see #getDataProductsList()
	 * @generated
	 */
  EReference getDataProductsList_OperationCallResultsList();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.invocator.DataProductsList#getRecordingResultsList <em>Recording Results List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recording Results List</em>'.
	 * @see org.eclipse.symphony.core.invocator.DataProductsList#getRecordingResultsList()
	 * @see #getDataProductsList()
	 * @generated
	 */
  EReference getDataProductsList_RecordingResultsList();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.DataProductsList#getInvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invocator Session</em>'.
	 * @see org.eclipse.symphony.core.invocator.DataProductsList#getInvocatorSession()
	 * @see #getDataProductsList()
	 * @generated
	 */
	EReference getDataProductsList_InvocatorSession();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.ToolsList <em>Tools List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tools List</em>'.
	 * @see org.eclipse.symphony.core.invocator.ToolsList
	 * @generated
	 */
  EClass getToolsList();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.invocator.ToolsList#getInvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Invocator Session</em>'.
	 * @see org.eclipse.symphony.core.invocator.ToolsList#getInvocatorSession()
	 * @see #getToolsList()
	 * @generated
	 */
  EReference getToolsList_InvocatorSession();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.invocator.ToolsList#getToolsListContainers <em>Tools List Containers</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tools List Containers</em>'.
	 * @see org.eclipse.symphony.core.invocator.ToolsList#getToolsListContainers()
	 * @see #getToolsList()
	 * @generated
	 */
  EReference getToolsList_ToolsListContainers();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.AbstractToolsListContainer <em>Abstract Tools List Container</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Tools List Container</em>'.
	 * @see org.eclipse.symphony.core.invocator.AbstractToolsListContainer
	 * @generated
	 */
  EClass getAbstractToolsListContainer();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.invocator.AbstractToolsListContainer#getToolsList <em>Tools List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tools List</em>'.
	 * @see org.eclipse.symphony.core.invocator.AbstractToolsListContainer#getToolsList()
	 * @see #getAbstractToolsListContainer()
	 * @generated
	 */
  EReference getAbstractToolsListContainer_ToolsList();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.TypesList <em>Types List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Types List</em>'.
	 * @see org.eclipse.symphony.core.invocator.TypesList
	 * @generated
	 */
  EClass getTypesList();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.invocator.TypesList#getLocalTypes <em>Local Types</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Types</em>'.
	 * @see org.eclipse.symphony.core.invocator.TypesList#getLocalTypes()
	 * @see #getTypesList()
	 * @generated
	 */
  EReference getTypesList_LocalTypes();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.invocator.TypesList#getRegisteredTypes <em>Registered Types</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registered Types</em>'.
	 * @see org.eclipse.symphony.core.invocator.TypesList#getRegisteredTypes()
	 * @see #getTypesList()
	 * @generated
	 */
  EReference getTypesList_RegisteredTypes();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.LocalTypesList <em>Local Types List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Types List</em>'.
	 * @see org.eclipse.symphony.core.invocator.LocalTypesList
	 * @generated
	 */
  EClass getLocalTypesList();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.invocator.LocalTypesList#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see org.eclipse.symphony.core.invocator.LocalTypesList#getTypes()
	 * @see #getLocalTypesList()
	 * @generated
	 */
  EReference getLocalTypesList_Types();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.RegisteredTypesList <em>Registered Types List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registered Types List</em>'.
	 * @see org.eclipse.symphony.core.invocator.RegisteredTypesList
	 * @generated
	 */
  EClass getRegisteredTypesList();

  /**
	 * Returns the meta object for the reference list '{@link org.eclipse.symphony.core.invocator.RegisteredTypesList#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Types</em>'.
	 * @see org.eclipse.symphony.core.invocator.RegisteredTypesList#getTypes()
	 * @see #getRegisteredTypesList()
	 * @generated
	 */
  EReference getRegisteredTypesList_Types();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.AbstractType <em>Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Type</em>'.
	 * @see org.eclipse.symphony.core.invocator.AbstractType
	 * @generated
	 */
  EClass getAbstractType();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.eclipse.symphony.core.invocator.Type
	 * @generated
	 */
  EClass getType();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.invocator.Type#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.eclipse.symphony.core.invocator.Type#getMembers()
	 * @see #getType()
	 * @generated
	 */
  EReference getType_Members();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.Type#getInterfaceClass <em>Interface Class</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface Class</em>'.
	 * @see org.eclipse.symphony.core.invocator.Type#getInterfaceClass()
	 * @see #getType()
	 * @generated
	 */
  EReference getType_InterfaceClass();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.Type#getTypeApiAdapterClass <em>Type Api Adapter Class</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Api Adapter Class</em>'.
	 * @see org.eclipse.symphony.core.invocator.Type#getTypeApiAdapterClass()
	 * @see #getType()
	 * @generated
	 */
  EReference getType_TypeApiAdapterClass();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.TypeApiAdapter <em>Type Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Api Adapter</em>'.
	 * @see org.eclipse.symphony.core.invocator.TypeApiAdapter
	 * @generated
	 */
  EClass getTypeApiAdapter();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.TypeApiAdapter#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Environment</em>'.
	 * @see org.eclipse.symphony.core.invocator.TypeApiAdapter#getEnvironment()
	 * @see #getTypeApiAdapter()
	 * @generated
	 */
  EReference getTypeApiAdapter_Environment();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.TypeApiAdapter#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see org.eclipse.symphony.core.invocator.TypeApiAdapter#getInstance()
	 * @see #getTypeApiAdapter()
	 * @generated
	 */
  EReference getTypeApiAdapter_Instance();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.TypeApiAdapter#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Type</em>'.
	 * @see org.eclipse.symphony.core.invocator.TypeApiAdapter#getElementType()
	 * @see #getTypeApiAdapter()
	 * @generated
	 */
  EReference getTypeApiAdapter_ElementType();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.TypeApiAdapter#init(org.eclipse.symphony.core.invocator.Environment, org.eclipse.symphony.core.invocator.Type, org.eclipse.emf.ecore.EObject) <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.TypeApiAdapter#init(org.eclipse.symphony.core.invocator.Environment, org.eclipse.symphony.core.invocator.Type, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
  EOperation getTypeApiAdapter__Init__Environment_Type_EObject();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.TypeApiAdapter#apply(org.eclipse.symphony.core.invocator.AbstractInitializationData) <em>Apply</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.TypeApiAdapter#apply(org.eclipse.symphony.core.invocator.AbstractInitializationData)
	 * @generated
	 */
  EOperation getTypeApiAdapter__Apply__AbstractInitializationData();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.TypeApiAdapter#createInitializationData() <em>Create Initialization Data</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Initialization Data</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.TypeApiAdapter#createInitializationData()
	 * @generated
	 */
  EOperation getTypeApiAdapter__CreateInitializationData();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.TypeApiAdapter#collect(org.eclipse.symphony.core.invocator.AbstractInitializationData) <em>Collect</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Collect</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.TypeApiAdapter#collect(org.eclipse.symphony.core.invocator.AbstractInitializationData)
	 * @generated
	 */
  EOperation getTypeApiAdapter__Collect__AbstractInitializationData();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.TypeApiAdapter#createResult(org.eclipse.symphony.core.invocator.OperationCall) <em>Create Result</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Result</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.TypeApiAdapter#createResult(org.eclipse.symphony.core.invocator.OperationCall)
	 * @generated
	 */
  EOperation getTypeApiAdapter__CreateResult__OperationCall();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.TypeApiAdapter#createResult(org.eclipse.symphony.core.invocator.OperationCall, long, java.lang.Object, java.lang.Exception) <em>Create Result</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Result</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.TypeApiAdapter#createResult(org.eclipse.symphony.core.invocator.OperationCall, long, java.lang.Object, java.lang.Exception)
	 * @generated
	 */
  EOperation getTypeApiAdapter__CreateResult__OperationCall_long_Object_Exception();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.TypeApiAdapter#invoke(org.eclipse.emf.ecore.EObject, org.eclipse.symphony.core.invocator.OperationCall, boolean) <em>Invoke</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Invoke</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.TypeApiAdapter#invoke(org.eclipse.emf.ecore.EObject, org.eclipse.symphony.core.invocator.OperationCall, boolean)
	 * @generated
	 */
	EOperation getTypeApiAdapter__Invoke__EObject_OperationCall_boolean();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.TypeApiAdapter#dispose() <em>Dispose</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dispose</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.TypeApiAdapter#dispose()
	 * @generated
	 */
  EOperation getTypeApiAdapter__Dispose();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.TypeMember <em>Type Member</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Member</em>'.
	 * @see org.eclipse.symphony.core.invocator.TypeMember
	 * @generated
	 */
  EClass getTypeMember();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.TypeMember#getMemberType <em>Member Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Type</em>'.
	 * @see org.eclipse.symphony.core.invocator.TypeMember#getMemberType()
	 * @see #getTypeMember()
	 * @generated
	 */
  EReference getTypeMember_MemberType();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.invocator.TypeMember#getTypeFeatureRootNode <em>Type Feature Root Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Feature Root Node</em>'.
	 * @see org.eclipse.symphony.core.invocator.TypeMember#getTypeFeatureRootNode()
	 * @see #getTypeMember()
	 * @generated
	 */
  EReference getTypeMember_TypeFeatureRootNode();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.TypeMemberReference <em>Type Member Reference</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Member Reference</em>'.
	 * @see org.eclipse.symphony.core.invocator.TypeMemberReference
	 * @generated
	 */
  EClass getTypeMemberReference();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.TypeMemberReference#getTypeMember <em>Type Member</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Member</em>'.
	 * @see org.eclipse.symphony.core.invocator.TypeMemberReference#getTypeMember()
	 * @see #getTypeMemberReference()
	 * @generated
	 */
  EReference getTypeMemberReference_TypeMember();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.TypeMemberReferenceListElement <em>Type Member Reference List Element</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Member Reference List Element</em>'.
	 * @see org.eclipse.symphony.core.invocator.TypeMemberReferenceListElement
	 * @generated
	 */
  EClass getTypeMemberReferenceListElement();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.invocator.TypeMemberReferenceListElement#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see org.eclipse.symphony.core.invocator.TypeMemberReferenceListElement#getChild()
	 * @see #getTypeMemberReferenceListElement()
	 * @generated
	 */
  EReference getTypeMemberReferenceListElement_Child();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.invocator.TypeMemberReferenceListElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.eclipse.symphony.core.invocator.TypeMemberReferenceListElement#getParent()
	 * @see #getTypeMemberReferenceListElement()
	 * @generated
	 */
  EReference getTypeMemberReferenceListElement_Parent();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.invocator.TypeMemberReferenceListElement#isRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root</em>'.
	 * @see org.eclipse.symphony.core.invocator.TypeMemberReferenceListElement#isRoot()
	 * @see #getTypeMemberReferenceListElement()
	 * @generated
	 */
  EAttribute getTypeMemberReferenceListElement_Root();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.TypeMemberReferenceListElement#getRootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Element</em>'.
	 * @see org.eclipse.symphony.core.invocator.TypeMemberReferenceListElement#getRootElement()
	 * @see #getTypeMemberReferenceListElement()
	 * @generated
	 */
  EReference getTypeMemberReferenceListElement_RootElement();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.TypeMemberReferenceListElement#getLeafElement <em>Leaf Element</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Leaf Element</em>'.
	 * @see org.eclipse.symphony.core.invocator.TypeMemberReferenceListElement#getLeafElement()
	 * @see #getTypeMemberReferenceListElement()
	 * @generated
	 */
  EReference getTypeMemberReferenceListElement_LeafElement();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.invocator.TypeMemberReferenceListElement#isLeaf <em>Leaf</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leaf</em>'.
	 * @see org.eclipse.symphony.core.invocator.TypeMemberReferenceListElement#isLeaf()
	 * @see #getTypeMemberReferenceListElement()
	 * @generated
	 */
  EAttribute getTypeMemberReferenceListElement_Leaf();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.invocator.TypeMemberReferenceListElement#getSubSegmentsCount <em>Sub Segments Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Segments Count</em>'.
	 * @see org.eclipse.symphony.core.invocator.TypeMemberReferenceListElement#getSubSegmentsCount()
	 * @see #getTypeMemberReferenceListElement()
	 * @generated
	 */
	EAttribute getTypeMemberReferenceListElement_SubSegmentsCount();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement <em>Type Member Reference Tree Element</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Member Reference Tree Element</em>'.
	 * @see org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement
	 * @generated
	 */
  EClass getTypeMemberReferenceTreeElement();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child</em>'.
	 * @see org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement#getChild()
	 * @see #getTypeMemberReferenceTreeElement()
	 * @generated
	 */
  EReference getTypeMemberReferenceTreeElement_Child();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement#getParent()
	 * @see #getTypeMemberReferenceTreeElement()
	 * @generated
	 */
  EReference getTypeMemberReferenceTreeElement_Parent();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement#getFeatureRootNode <em>Feature Root Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Root Node</em>'.
	 * @see org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement#getFeatureRootNode()
	 * @see #getTypeMemberReferenceTreeElement()
	 * @generated
	 */
  EReference getTypeMemberReferenceTreeElement_FeatureRootNode();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement#isRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root</em>'.
	 * @see org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement#isRoot()
	 * @see #getTypeMemberReferenceTreeElement()
	 * @generated
	 */
  EAttribute getTypeMemberReferenceTreeElement_Root();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement#getRootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Element</em>'.
	 * @see org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement#getRootElement()
	 * @see #getTypeMemberReferenceTreeElement()
	 * @generated
	 */
  EReference getTypeMemberReferenceTreeElement_RootElement();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement#isLeaf <em>Leaf</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leaf</em>'.
	 * @see org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement#isLeaf()
	 * @see #getTypeMemberReferenceTreeElement()
	 * @generated
	 */
  EAttribute getTypeMemberReferenceTreeElement_Leaf();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.VariablesList <em>Variables List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variables List</em>'.
	 * @see org.eclipse.symphony.core.invocator.VariablesList
	 * @generated
	 */
  EClass getVariablesList();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.invocator.VariablesList#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Environment</em>'.
	 * @see org.eclipse.symphony.core.invocator.VariablesList#getEnvironment()
	 * @see #getVariablesList()
	 * @generated
	 */
  EReference getVariablesList_Environment();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.invocator.VariablesList#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.eclipse.symphony.core.invocator.VariablesList#getVariables()
	 * @see #getVariablesList()
	 * @generated
	 */
  EReference getVariablesList_Variables();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.eclipse.symphony.core.invocator.Variable
	 * @generated
	 */
  EClass getVariable();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.invocator.Variable#getVariablesList <em>Variables List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Variables List</em>'.
	 * @see org.eclipse.symphony.core.invocator.Variable#getVariablesList()
	 * @see #getVariable()
	 * @generated
	 */
  EReference getVariable_VariablesList();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.Variable#getVariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable Type</em>'.
	 * @see org.eclipse.symphony.core.invocator.Variable#getVariableType()
	 * @see #getVariable()
	 * @generated
	 */
  EReference getVariable_VariableType();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.Variable#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Environment</em>'.
	 * @see org.eclipse.symphony.core.invocator.Variable#getEnvironment()
	 * @see #getVariable()
	 * @generated
	 */
  EReference getVariable_Environment();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.ContextsList <em>Contexts List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contexts List</em>'.
	 * @see org.eclipse.symphony.core.invocator.ContextsList
	 * @generated
	 */
  EClass getContextsList();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.invocator.ContextsList#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Environment</em>'.
	 * @see org.eclipse.symphony.core.invocator.ContextsList#getEnvironment()
	 * @see #getContextsList()
	 * @generated
	 */
  EReference getContextsList_Environment();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.invocator.ContextsList#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see org.eclipse.symphony.core.invocator.ContextsList#getContexts()
	 * @see #getContextsList()
	 * @generated
	 */
  EReference getContextsList_Contexts();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see org.eclipse.symphony.core.invocator.Context
	 * @generated
	 */
  EClass getContext();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.invocator.Context#getContextsList <em>Contexts List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Contexts List</em>'.
	 * @see org.eclipse.symphony.core.invocator.Context#getContextsList()
	 * @see #getContext()
	 * @generated
	 */
  EReference getContext_ContextsList();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.invocator.Context#getVariableImplementationsList <em>Variable Implementations List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable Implementations List</em>'.
	 * @see org.eclipse.symphony.core.invocator.Context#getVariableImplementationsList()
	 * @see #getContext()
	 * @generated
	 */
  EReference getContext_VariableImplementationsList();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.Context#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Environment</em>'.
	 * @see org.eclipse.symphony.core.invocator.Context#getEnvironment()
	 * @see #getContext()
	 * @generated
	 */
  EReference getContext_Environment();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.Context#getDataProductsList <em>Data Products List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Products List</em>'.
	 * @see org.eclipse.symphony.core.invocator.Context#getDataProductsList()
	 * @see #getContext()
	 * @generated
	 */
  EReference getContext_DataProductsList();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.invocator.Context#getInstancesCreationDate <em>Instances Creation Date</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instances Creation Date</em>'.
	 * @see org.eclipse.symphony.core.invocator.Context#getInstancesCreationDate()
	 * @see #getContext()
	 * @generated
	 */
  EAttribute getContext_InstancesCreationDate();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.invocator.Context#getInstancesDisposalDate <em>Instances Disposal Date</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instances Disposal Date</em>'.
	 * @see org.eclipse.symphony.core.invocator.Context#getInstancesDisposalDate()
	 * @see #getContext()
	 * @generated
	 */
  EAttribute getContext_InstancesDisposalDate();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.BasicContext <em>Basic Context</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Context</em>'.
	 * @see org.eclipse.symphony.core.invocator.BasicContext
	 * @generated
	 */
  EClass getBasicContext();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.VariableImplementationsList <em>Variable Implementations List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Implementations List</em>'.
	 * @see org.eclipse.symphony.core.invocator.VariableImplementationsList
	 * @generated
	 */
  EClass getVariableImplementationsList();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.invocator.VariableImplementationsList#getVariableImplementations <em>Variable Implementations</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable Implementations</em>'.
	 * @see org.eclipse.symphony.core.invocator.VariableImplementationsList#getVariableImplementations()
	 * @see #getVariableImplementationsList()
	 * @generated
	 */
  EReference getVariableImplementationsList_VariableImplementations();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.VariableImplementationsList#getVariableImplementation(org.eclipse.symphony.core.invocator.Variable) <em>Get Variable Implementation</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Variable Implementation</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.VariableImplementationsList#getVariableImplementation(org.eclipse.symphony.core.invocator.Variable)
	 * @generated
	 */
  EOperation getVariableImplementationsList__GetVariableImplementation__Variable();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.VariableImplementationsList#getVariableImplementation(java.lang.String) <em>Get Variable Implementation</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Variable Implementation</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.VariableImplementationsList#getVariableImplementation(java.lang.String)
	 * @generated
	 */
  EOperation getVariableImplementationsList__GetVariableImplementation__String();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.AbstractInitializationData <em>Abstract Initialization Data</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Initialization Data</em>'.
	 * @see org.eclipse.symphony.core.invocator.AbstractInitializationData
	 * @generated
	 */
  EClass getAbstractInitializationData();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.InitializationData <em>Initialization Data</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initialization Data</em>'.
	 * @see org.eclipse.symphony.core.invocator.InitializationData
	 * @generated
	 */
  EClass getInitializationData();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.AbstractTypeImplementation <em>Abstract Type Implementation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Type Implementation</em>'.
	 * @see org.eclipse.symphony.core.invocator.AbstractTypeImplementation
	 * @generated
	 */
  EClass getAbstractTypeImplementation();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.invocator.AbstractTypeImplementation#getTypeMemberImplementations <em>Type Member Implementations</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Member Implementations</em>'.
	 * @see org.eclipse.symphony.core.invocator.AbstractTypeImplementation#getTypeMemberImplementations()
	 * @see #getAbstractTypeImplementation()
	 * @generated
	 */
  EReference getAbstractTypeImplementation_TypeMemberImplementations();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.AbstractTypeImplementation#getImplementationClass <em>Implementation Class</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementation Class</em>'.
	 * @see org.eclipse.symphony.core.invocator.AbstractTypeImplementation#getImplementationClass()
	 * @see #getAbstractTypeImplementation()
	 * @generated
	 */
  EReference getAbstractTypeImplementation_ImplementationClass();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.invocator.AbstractTypeImplementation#getAbstractInitializationData <em>Abstract Initialization Data</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Initialization Data</em>'.
	 * @see org.eclipse.symphony.core.invocator.AbstractTypeImplementation#getAbstractInitializationData()
	 * @see #getAbstractTypeImplementation()
	 * @generated
	 */
  EReference getAbstractTypeImplementation_AbstractInitializationData();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.AbstractTypeImplementation#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see org.eclipse.symphony.core.invocator.AbstractTypeImplementation#getInstance()
	 * @see #getAbstractTypeImplementation()
	 * @generated
	 */
  EReference getAbstractTypeImplementation_Instance();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.AbstractTypeImplementation#getAdapterInstance <em>Adapter Instance</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Adapter Instance</em>'.
	 * @see org.eclipse.symphony.core.invocator.AbstractTypeImplementation#getAdapterInstance()
	 * @see #getAbstractTypeImplementation()
	 * @generated
	 */
  EReference getAbstractTypeImplementation_AdapterInstance();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.AbstractTypeImplementation#getHandlingType <em>Handling Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Handling Type</em>'.
	 * @see org.eclipse.symphony.core.invocator.AbstractTypeImplementation#getHandlingType()
	 * @see #getAbstractTypeImplementation()
	 * @generated
	 */
  EReference getAbstractTypeImplementation_HandlingType();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.AbstractTypeImplementation#getTypeMemberImplementation(java.lang.String) <em>Get Type Member Implementation</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type Member Implementation</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.AbstractTypeImplementation#getTypeMemberImplementation(java.lang.String)
	 * @generated
	 */
  EOperation getAbstractTypeImplementation__GetTypeMemberImplementation__String();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.AbstractTypeImplementation#getTypeMemberImplementation(org.eclipse.symphony.core.invocator.TypeMember) <em>Get Type Member Implementation</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type Member Implementation</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.AbstractTypeImplementation#getTypeMemberImplementation(org.eclipse.symphony.core.invocator.TypeMember)
	 * @generated
	 */
  EOperation getAbstractTypeImplementation__GetTypeMemberImplementation__TypeMember();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.VariableImplementation <em>Variable Implementation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Implementation</em>'.
	 * @see org.eclipse.symphony.core.invocator.VariableImplementation
	 * @generated
	 */
  EClass getVariableImplementation();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.invocator.VariableImplementation#getVariableImplementationsList <em>Variable Implementations List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Variable Implementations List</em>'.
	 * @see org.eclipse.symphony.core.invocator.VariableImplementation#getVariableImplementationsList()
	 * @see #getVariableImplementation()
	 * @generated
	 */
  EReference getVariableImplementation_VariableImplementationsList();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.VariableImplementation#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.eclipse.symphony.core.invocator.VariableImplementation#getVariable()
	 * @see #getVariableImplementation()
	 * @generated
	 */
  EReference getVariableImplementation_Variable();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.TypeMemberImplementation <em>Type Member Implementation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Member Implementation</em>'.
	 * @see org.eclipse.symphony.core.invocator.TypeMemberImplementation
	 * @generated
	 */
  EClass getTypeMemberImplementation();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.TypeMemberImplementation#getTypeMember <em>Type Member</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Member</em>'.
	 * @see org.eclipse.symphony.core.invocator.TypeMemberImplementation#getTypeMember()
	 * @see #getTypeMemberImplementation()
	 * @generated
	 */
  EReference getTypeMemberImplementation_TypeMember();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.ValuesList <em>Values List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Values List</em>'.
	 * @see org.eclipse.symphony.core.invocator.ValuesList
	 * @generated
	 */
  EClass getValuesList();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.invocator.ValuesList#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.eclipse.symphony.core.invocator.ValuesList#getValues()
	 * @see #getValuesList()
	 * @generated
	 */
  EReference getValuesList_Values();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see org.eclipse.symphony.core.invocator.Value
	 * @generated
	 */
  EClass getValue();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.invocator.Value#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.symphony.core.invocator.Value#getValue()
	 * @see #getValue()
	 * @generated
	 */
  EReference getValue_Value();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.ProgramsList <em>Programs List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programs List</em>'.
	 * @see org.eclipse.symphony.core.invocator.ProgramsList
	 * @generated
	 */
  EClass getProgramsList();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.invocator.ProgramsList#getInvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Invocator Session</em>'.
	 * @see org.eclipse.symphony.core.invocator.ProgramsList#getInvocatorSession()
	 * @see #getProgramsList()
	 * @generated
	 */
  EReference getProgramsList_InvocatorSession();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.invocator.ProgramsList#getPrograms <em>Programs</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programs</em>'.
	 * @see org.eclipse.symphony.core.invocator.ProgramsList#getPrograms()
	 * @see #getProgramsList()
	 * @generated
	 */
  EReference getProgramsList_Programs();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see org.eclipse.symphony.core.invocator.Program
	 * @generated
	 */
  EClass getProgram();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.invocator.Program#getProgramsList <em>Programs List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Programs List</em>'.
	 * @see org.eclipse.symphony.core.invocator.Program#getProgramsList()
	 * @see #getProgram()
	 * @generated
	 */
  EReference getProgram_ProgramsList();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.Program#getInvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invocator Session</em>'.
	 * @see org.eclipse.symphony.core.invocator.Program#getInvocatorSession()
	 * @see #getProgram()
	 * @generated
	 */
  EReference getProgram_InvocatorSession();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.invocator.Program#getValuesList <em>Values List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Values List</em>'.
	 * @see org.eclipse.symphony.core.invocator.Program#getValuesList()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_ValuesList();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.OperationCallContainer <em>Operation Call Container</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Call Container</em>'.
	 * @see org.eclipse.symphony.core.invocator.OperationCallContainer
	 * @generated
	 */
  EClass getOperationCallContainer();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.invocator.OperationCallContainer#getOperationCalls <em>Operation Calls</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Calls</em>'.
	 * @see org.eclipse.symphony.core.invocator.OperationCallContainer#getOperationCalls()
	 * @see #getOperationCallContainer()
	 * @generated
	 */
  EReference getOperationCallContainer_OperationCalls();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.OperationCallContainer#getInvocatorSession() <em>Get Invocator Session</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Invocator Session</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.OperationCallContainer#getInvocatorSession()
	 * @generated
	 */
  EOperation getOperationCallContainer__GetInvocatorSession();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.OperationCallsList <em>Operation Calls List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Calls List</em>'.
	 * @see org.eclipse.symphony.core.invocator.OperationCallsList
	 * @generated
	 */
  EClass getOperationCallsList();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.VariableFeatureReference <em>Variable Feature Reference</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Feature Reference</em>'.
	 * @see org.eclipse.symphony.core.invocator.VariableFeatureReference
	 * @generated
	 */
  EClass getVariableFeatureReference();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.VariableFeatureReference#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.eclipse.symphony.core.invocator.VariableFeatureReference#getVariable()
	 * @see #getVariableFeatureReference()
	 * @generated
	 */
  EReference getVariableFeatureReference_Variable();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.invocator.VariableFeatureReference#getTypeMemberReferenceListElement <em>Type Member Reference List Element</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Member Reference List Element</em>'.
	 * @see org.eclipse.symphony.core.invocator.VariableFeatureReference#getTypeMemberReferenceListElement()
	 * @see #getVariableFeatureReference()
	 * @generated
	 */
  EReference getVariableFeatureReference_TypeMemberReferenceListElement();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.invocator.VariableFeatureReference#getFeatureRoot <em>Feature Root</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Root</em>'.
	 * @see org.eclipse.symphony.core.invocator.VariableFeatureReference#getFeatureRoot()
	 * @see #getVariableFeatureReference()
	 * @generated
	 */
  EReference getVariableFeatureReference_FeatureRoot();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.OperationCall <em>Operation Call</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Call</em>'.
	 * @see org.eclipse.symphony.core.invocator.OperationCall
	 * @generated
	 */
  EClass getOperationCall();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.OperationCall#getEOperation <em>EOperation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EOperation</em>'.
	 * @see org.eclipse.symphony.core.invocator.OperationCall#getEOperation()
	 * @see #getOperationCall()
	 * @generated
	 */
  EReference getOperationCall_EOperation();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.invocator.OperationCall#getArgumentsList <em>Arguments List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arguments List</em>'.
	 * @see org.eclipse.symphony.core.invocator.OperationCall#getArgumentsList()
	 * @see #getOperationCall()
	 * @generated
	 */
  EReference getOperationCall_ArgumentsList();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.invocator.OperationCall#getOperationCallContainer <em>Operation Call Container</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation Call Container</em>'.
	 * @see org.eclipse.symphony.core.invocator.OperationCall#getOperationCallContainer()
	 * @see #getOperationCall()
	 * @generated
	 */
  EReference getOperationCall_OperationCallContainer();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.OperationCall#getInvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invocator Session</em>'.
	 * @see org.eclipse.symphony.core.invocator.OperationCall#getInvocatorSession()
	 * @see #getOperationCall()
	 * @generated
	 */
  EReference getOperationCall_InvocatorSession();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.OperationCall#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Environment</em>'.
	 * @see org.eclipse.symphony.core.invocator.OperationCall#getEnvironment()
	 * @see #getOperationCall()
	 * @generated
	 */
  EReference getOperationCall_Environment();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.ArgumentsList <em>Arguments List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arguments List</em>'.
	 * @see org.eclipse.symphony.core.invocator.ArgumentsList
	 * @generated
	 */
  EClass getArgumentsList();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.invocator.ArgumentsList#getOperationCall <em>Operation Call</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation Call</em>'.
	 * @see org.eclipse.symphony.core.invocator.ArgumentsList#getOperationCall()
	 * @see #getArgumentsList()
	 * @generated
	 */
  EReference getArgumentsList_OperationCall();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.invocator.ArgumentsList#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see org.eclipse.symphony.core.invocator.ArgumentsList#getArguments()
	 * @see #getArgumentsList()
	 * @generated
	 */
  EReference getArgumentsList_Arguments();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.ArgumentsList#getArgumentValues() <em>Get Argument Values</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Argument Values</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.ArgumentsList#getArgumentValues()
	 * @generated
	 */
  EOperation getArgumentsList__GetArgumentValues();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see org.eclipse.symphony.core.invocator.Argument
	 * @generated
	 */
  EClass getArgument();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.invocator.Argument#getArgumentsList <em>Arguments List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Arguments List</em>'.
	 * @see org.eclipse.symphony.core.invocator.Argument#getArgumentsList()
	 * @see #getArgument()
	 * @generated
	 */
  EReference getArgument_ArgumentsList();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.Argument#getOperationCall <em>Operation Call</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation Call</em>'.
	 * @see org.eclipse.symphony.core.invocator.Argument#getOperationCall()
	 * @see #getArgument()
	 * @generated
	 */
  EReference getArgument_OperationCall();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.Argument#getEParameter() <em>Get EParameter</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EParameter</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.Argument#getEParameter()
	 * @generated
	 */
  EOperation getArgument__GetEParameter();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.Argument#getParameterValue() <em>Get Parameter Value</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Parameter Value</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.Argument#getParameterValue()
	 * @generated
	 */
  EOperation getArgument__GetParameterValue();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.EDataTypeArgument <em>EData Type Argument</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EData Type Argument</em>'.
	 * @see org.eclipse.symphony.core.invocator.EDataTypeArgument
	 * @generated
	 */
  EClass getEDataTypeArgument();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.invocator.EDataTypeArgument#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.symphony.core.invocator.EDataTypeArgument#getValue()
	 * @see #getEDataTypeArgument()
	 * @generated
	 */
  EAttribute getEDataTypeArgument_Value();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.EEnumArgument <em>EEnum Argument</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEnum Argument</em>'.
	 * @see org.eclipse.symphony.core.invocator.EEnumArgument
	 * @generated
	 */
  EClass getEEnumArgument();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.EEnumArgument#getEEnumLiteral <em>EEnum Literal</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EEnum Literal</em>'.
	 * @see org.eclipse.symphony.core.invocator.EEnumArgument#getEEnumLiteral()
	 * @see #getEEnumArgument()
	 * @generated
	 */
  EReference getEEnumArgument_EEnumLiteral();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.EEnumArgument#getEEnum <em>EEnum</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EEnum</em>'.
	 * @see org.eclipse.symphony.core.invocator.EEnumArgument#getEEnum()
	 * @see #getEEnumArgument()
	 * @generated
	 */
  EReference getEEnumArgument_EEnum();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.EClassArgument <em>EClass Argument</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClass Argument</em>'.
	 * @see org.eclipse.symphony.core.invocator.EClassArgument
	 * @generated
	 */
  EClass getEClassArgument();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.invocator.EClassArgument#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.symphony.core.invocator.EClassArgument#getValue()
	 * @see #getEClassArgument()
	 * @generated
	 */
  EReference getEClassArgument_Value();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.ResultsList <em>Results List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Results List</em>'.
	 * @see org.eclipse.symphony.core.invocator.ResultsList
	 * @generated
	 */
  EClass getResultsList();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.invocator.ResultsList#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see org.eclipse.symphony.core.invocator.ResultsList#getResults()
	 * @see #getResultsList()
	 * @generated
	 */
  EReference getResultsList_Results();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.invocator.ResultsList#getInvocatorSession() <em>Get Invocator Session</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Invocator Session</em>' operation.
	 * @see org.eclipse.symphony.core.invocator.ResultsList#getInvocatorSession()
	 * @generated
	 */
	EOperation getResultsList__GetInvocatorSession();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.OperationCallResultsList <em>Operation Call Results List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Call Results List</em>'.
	 * @see org.eclipse.symphony.core.invocator.OperationCallResultsList
	 * @generated
	 */
  EClass getOperationCallResultsList();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.invocator.OperationCallResultsList#getDataProductsList <em>Data Products List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Products List</em>'.
	 * @see org.eclipse.symphony.core.invocator.OperationCallResultsList#getDataProductsList()
	 * @see #getOperationCallResultsList()
	 * @generated
	 */
	EReference getOperationCallResultsList_DataProductsList();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.OperationCallResultsList#getInvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invocator Session</em>'.
	 * @see org.eclipse.symphony.core.invocator.OperationCallResultsList#getInvocatorSession()
	 * @see #getOperationCallResultsList()
	 * @generated
	 */
	EReference getOperationCallResultsList_InvocatorSession();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.RecordingResultsList <em>Recording Results List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recording Results List</em>'.
	 * @see org.eclipse.symphony.core.invocator.RecordingResultsList
	 * @generated
	 */
  EClass getRecordingResultsList();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.invocator.RecordingResultsList#getDataProductsList <em>Data Products List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Products List</em>'.
	 * @see org.eclipse.symphony.core.invocator.RecordingResultsList#getDataProductsList()
	 * @see #getRecordingResultsList()
	 * @generated
	 */
	EReference getRecordingResultsList_DataProductsList();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.RecordingResultsList#getInvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invocator Session</em>'.
	 * @see org.eclipse.symphony.core.invocator.RecordingResultsList#getInvocatorSession()
	 * @see #getRecordingResultsList()
	 * @generated
	 */
	EReference getRecordingResultsList_InvocatorSession();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.AbstractResult <em>Abstract Result</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Result</em>'.
	 * @see org.eclipse.symphony.core.invocator.AbstractResult
	 * @generated
	 */
  EClass getAbstractResult();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.invocator.AbstractResult#getResultsList <em>Results List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Results List</em>'.
	 * @see org.eclipse.symphony.core.invocator.AbstractResult#getResultsList()
	 * @see #getAbstractResult()
	 * @generated
	 */
	EReference getAbstractResult_ResultsList();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.AbstractResult#getInvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invocator Session</em>'.
	 * @see org.eclipse.symphony.core.invocator.AbstractResult#getInvocatorSession()
	 * @see #getAbstractResult()
	 * @generated
	 */
	EReference getAbstractResult_InvocatorSession();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.AbstractResult#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see org.eclipse.symphony.core.invocator.AbstractResult#getContext()
	 * @see #getAbstractResult()
	 * @generated
	 */
  EReference getAbstractResult_Context();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.invocator.AbstractResult#getResultValue <em>Result Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result Value</em>'.
	 * @see org.eclipse.symphony.core.invocator.AbstractResult#getResultValue()
	 * @see #getAbstractResult()
	 * @generated
	 */
  EReference getAbstractResult_ResultValue();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.AbstractResultValue <em>Abstract Result Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Result Value</em>'.
	 * @see org.eclipse.symphony.core.invocator.AbstractResultValue
	 * @generated
	 */
  EClass getAbstractResultValue();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.invocator.AbstractResultValue#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Result</em>'.
	 * @see org.eclipse.symphony.core.invocator.AbstractResultValue#getResult()
	 * @see #getAbstractResultValue()
	 * @generated
	 */
  EReference getAbstractResultValue_Result();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.OperationCallResult <em>Operation Call Result</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Call Result</em>'.
	 * @see org.eclipse.symphony.core.invocator.OperationCallResult
	 * @generated
	 */
  EClass getOperationCallResult();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.OperationCallResult#getOperationCall <em>Operation Call</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation Call</em>'.
	 * @see org.eclipse.symphony.core.invocator.OperationCallResult#getOperationCall()
	 * @see #getOperationCallResult()
	 * @generated
	 */
  EReference getOperationCallResult_OperationCall();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.invocator.OperationCallResult#getExceptionContainer <em>Exception Container</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception Container</em>'.
	 * @see org.eclipse.symphony.core.invocator.OperationCallResult#getExceptionContainer()
	 * @see #getOperationCallResult()
	 * @generated
	 */
  EReference getOperationCallResult_ExceptionContainer();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.ExceptionContainer <em>Exception Container</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Container</em>'.
	 * @see org.eclipse.symphony.core.invocator.ExceptionContainer
	 * @generated
	 */
  EClass getExceptionContainer();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.invocator.ExceptionContainer#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception</em>'.
	 * @see org.eclipse.symphony.core.invocator.ExceptionContainer#getException()
	 * @see #getExceptionContainer()
	 * @generated
	 */
  EAttribute getExceptionContainer_Exception();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.AttributeResultValue <em>Attribute Result Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Result Value</em>'.
	 * @see org.eclipse.symphony.core.invocator.AttributeResultValue
	 * @generated
	 */
  EClass getAttributeResultValue();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.invocator.AttributeResultValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.symphony.core.invocator.AttributeResultValue#getValue()
	 * @see #getAttributeResultValue()
	 * @generated
	 */
  EReference getAttributeResultValue_Value();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.AttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value</em>'.
	 * @see org.eclipse.symphony.core.invocator.AttributeValue
	 * @generated
	 */
  EClass getAttributeValue();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.invocator.AttributeValue#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see org.eclipse.symphony.core.invocator.AttributeValue#getObject()
	 * @see #getAttributeValue()
	 * @generated
	 */
  EAttribute getAttributeValue_Object();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.ReferenceResultValue <em>Reference Result Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Result Value</em>'.
	 * @see org.eclipse.symphony.core.invocator.ReferenceResultValue
	 * @generated
	 */
  EClass getReferenceResultValue();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.invocator.ReferenceResultValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.symphony.core.invocator.ReferenceResultValue#getValue()
	 * @see #getReferenceResultValue()
	 * @generated
	 */
  EReference getReferenceResultValue_Value();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.WatchesListsContainer <em>Watches Lists Container</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Watches Lists Container</em>'.
	 * @see org.eclipse.symphony.core.invocator.WatchesListsContainer
	 * @generated
	 */
  EClass getWatchesListsContainer();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.invocator.WatchesListsContainer#getWatches <em>Watches</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Watches</em>'.
	 * @see org.eclipse.symphony.core.invocator.WatchesListsContainer#getWatches()
	 * @see #getWatchesListsContainer()
	 * @generated
	 */
  EReference getWatchesListsContainer_Watches();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.WatchesList <em>Watches List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Watches List</em>'.
	 * @see org.eclipse.symphony.core.invocator.WatchesList
	 * @generated
	 */
  EClass getWatchesList();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.invocator.WatchesList#getWatchesListsContainer <em>Watches Lists Container</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Watches Lists Container</em>'.
	 * @see org.eclipse.symphony.core.invocator.WatchesList#getWatchesListsContainer()
	 * @see #getWatchesList()
	 * @generated
	 */
  EReference getWatchesList_WatchesListsContainer();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.invocator.WatchesList#getWatches <em>Watches</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Watches</em>'.
	 * @see org.eclipse.symphony.core.invocator.WatchesList#getWatches()
	 * @see #getWatchesList()
	 * @generated
	 */
  EReference getWatchesList_Watches();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.Watch <em>Watch</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Watch</em>'.
	 * @see org.eclipse.symphony.core.invocator.Watch
	 * @generated
	 */
  EClass getWatch();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.invocator.Watch#getWatchesList <em>Watches List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Watches List</em>'.
	 * @see org.eclipse.symphony.core.invocator.Watch#getWatchesList()
	 * @see #getWatch()
	 * @generated
	 */
  EReference getWatch_WatchesList();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.Watch#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.eclipse.symphony.core.invocator.Watch#getVariable()
	 * @see #getWatch()
	 * @generated
	 */
  EReference getWatch_Variable();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.invocator.Watch#getTypeMemberReferenceTreeElement <em>Type Member Reference Tree Element</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Member Reference Tree Element</em>'.
	 * @see org.eclipse.symphony.core.invocator.Watch#getTypeMemberReferenceTreeElement()
	 * @see #getWatch()
	 * @generated
	 */
  EReference getWatch_TypeMemberReferenceTreeElement();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.invocator.Watch#getTreeRootNode <em>Tree Root Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tree Root Node</em>'.
	 * @see org.eclipse.symphony.core.invocator.Watch#getTreeRootNode()
	 * @see #getWatch()
	 * @generated
	 */
  EReference getWatch_TreeRootNode();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.WatchFeatureNodeAdapter <em>Watch Feature Node Adapter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Watch Feature Node Adapter</em>'.
	 * @see org.eclipse.symphony.core.invocator.WatchFeatureNodeAdapter
	 * @generated
	 */
  EClass getWatchFeatureNodeAdapter();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.WatchFeatureNodeAdapter#getSourceObject <em>Source Object</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Object</em>'.
	 * @see org.eclipse.symphony.core.invocator.WatchFeatureNodeAdapter#getSourceObject()
	 * @see #getWatchFeatureNodeAdapter()
	 * @generated
	 */
  EReference getWatchFeatureNodeAdapter_SourceObject();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.WatchFeatureNodeAdapter#getFeatureNode <em>Feature Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature Node</em>'.
	 * @see org.eclipse.symphony.core.invocator.WatchFeatureNodeAdapter#getFeatureNode()
	 * @see #getWatchFeatureNodeAdapter()
	 * @generated
	 */
  EReference getWatchFeatureNodeAdapter_FeatureNode();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.invocator.WatchFeatureNodeAdapter#getCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Value</em>'.
	 * @see org.eclipse.symphony.core.invocator.WatchFeatureNodeAdapter#getCurrentValue()
	 * @see #getWatchFeatureNodeAdapter()
	 * @generated
	 */
  EAttribute getWatchFeatureNodeAdapter_CurrentValue();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.invocator.WatchFeatureNodeAdapter#isResolved <em>Resolved</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolved</em>'.
	 * @see org.eclipse.symphony.core.invocator.WatchFeatureNodeAdapter#isResolved()
	 * @see #getWatchFeatureNodeAdapter()
	 * @generated
	 */
  EAttribute getWatchFeatureNodeAdapter_Resolved();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.DisplaysListsContainer <em>Displays Lists Container</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Displays Lists Container</em>'.
	 * @see org.eclipse.symphony.core.invocator.DisplaysListsContainer
	 * @generated
	 */
  EClass getDisplaysListsContainer();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.invocator.DisplaysListsContainer#getDisplays <em>Displays</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Displays</em>'.
	 * @see org.eclipse.symphony.core.invocator.DisplaysListsContainer#getDisplays()
	 * @see #getDisplaysListsContainer()
	 * @generated
	 */
  EReference getDisplaysListsContainer_Displays();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.DisplaysList <em>Displays List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Displays List</em>'.
	 * @see org.eclipse.symphony.core.invocator.DisplaysList
	 * @generated
	 */
  EClass getDisplaysList();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.invocator.DisplaysList#getDisplaysListsContainer <em>Displays Lists Container</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Displays Lists Container</em>'.
	 * @see org.eclipse.symphony.core.invocator.DisplaysList#getDisplaysListsContainer()
	 * @see #getDisplaysList()
	 * @generated
	 */
  EReference getDisplaysList_DisplaysListsContainer();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.invocator.DisplaysList#getDisplays <em>Displays</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Displays</em>'.
	 * @see org.eclipse.symphony.core.invocator.DisplaysList#getDisplays()
	 * @see #getDisplaysList()
	 * @generated
	 */
  EReference getDisplaysList_Displays();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.AbstractDisplay <em>Abstract Display</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Display</em>'.
	 * @see org.eclipse.symphony.core.invocator.AbstractDisplay
	 * @generated
	 */
  EClass getAbstractDisplay();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.invocator.AbstractDisplay#getDisplaysList <em>Displays List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Displays List</em>'.
	 * @see org.eclipse.symphony.core.invocator.AbstractDisplay#getDisplaysList()
	 * @see #getAbstractDisplay()
	 * @generated
	 */
  EReference getAbstractDisplay_DisplaysList();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.RecordingToolsContainer <em>Recording Tools Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recording Tools Container</em>'.
	 * @see org.eclipse.symphony.core.invocator.RecordingToolsContainer
	 * @generated
	 */
	EClass getRecordingToolsContainer();

		/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.invocator.RecordingToolsContainer#getRecorder <em>Recorder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recorder</em>'.
	 * @see org.eclipse.symphony.core.invocator.RecordingToolsContainer#getRecorder()
	 * @see #getRecordingToolsContainer()
	 * @generated
	 */
	EReference getRecordingToolsContainer_Recorder();

		/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.invocator.RecordingToolsContainer#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Player</em>'.
	 * @see org.eclipse.symphony.core.invocator.RecordingToolsContainer#getPlayer()
	 * @see #getRecordingToolsContainer()
	 * @generated
	 */
	EReference getRecordingToolsContainer_Player();

		/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.invocator.RecordingToolsContainer#getChannelsLists <em>Channels Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channels Lists</em>'.
	 * @see org.eclipse.symphony.core.invocator.RecordingToolsContainer#getChannelsLists()
	 * @see #getRecordingToolsContainer()
	 * @generated
	 */
	EReference getRecordingToolsContainer_ChannelsLists();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.ChannelsList <em>Channels List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channels List</em>'.
	 * @see org.eclipse.symphony.core.invocator.ChannelsList
	 * @generated
	 */
	EClass getChannelsList();

		/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.invocator.ChannelsList#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channels</em>'.
	 * @see org.eclipse.symphony.core.invocator.ChannelsList#getChannels()
	 * @see #getChannelsList()
	 * @generated
	 */
	EReference getChannelsList_Channels();

		/**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.invocator.ChannelsList#getRecordingToolsContainer <em>Recording Tools Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Recording Tools Container</em>'.
	 * @see org.eclipse.symphony.core.invocator.ChannelsList#getRecordingToolsContainer()
	 * @see #getChannelsList()
	 * @generated
	 */
	EReference getChannelsList_RecordingToolsContainer();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.AbstractChannel <em>Abstract Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Channel</em>'.
	 * @see org.eclipse.symphony.core.invocator.AbstractChannel
	 * @generated
	 */
	EClass getAbstractChannel();

		/**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.invocator.AbstractChannel#getChannelsList <em>Channels List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Channels List</em>'.
	 * @see org.eclipse.symphony.core.invocator.AbstractChannel#getChannelsList()
	 * @see #getAbstractChannel()
	 * @generated
	 */
	EReference getAbstractChannel_ChannelsList();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.AbstractRecorder <em>Abstract Recorder</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Recorder</em>'.
	 * @see org.eclipse.symphony.core.invocator.AbstractRecorder
	 * @generated
	 */
  EClass getAbstractRecorder();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.invocator.AbstractRecorder#getRecordingToolsContainer <em>Recording Tools Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Recording Tools Container</em>'.
	 * @see org.eclipse.symphony.core.invocator.AbstractRecorder#getRecordingToolsContainer()
	 * @see #getAbstractRecorder()
	 * @generated
	 */
	EReference getAbstractRecorder_RecordingToolsContainer();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.AbstractPlayer <em>Abstract Player</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Player</em>'.
	 * @see org.eclipse.symphony.core.invocator.AbstractPlayer
	 * @generated
	 */
  EClass getAbstractPlayer();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.invocator.AbstractPlayer#getRecordingToolsContainer <em>Recording Tools Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Recording Tools Container</em>'.
	 * @see org.eclipse.symphony.core.invocator.AbstractPlayer#getRecordingToolsContainer()
	 * @see #getAbstractPlayer()
	 * @generated
	 */
	EReference getAbstractPlayer_RecordingToolsContainer();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.invocator.OperationCallResultsListTimeSource <em>Operation Call Results List Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Call Results List Time Source</em>'.
	 * @see org.eclipse.symphony.core.invocator.OperationCallResultsListTimeSource
	 * @generated
	 */
	EClass getOperationCallResultsListTimeSource();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.invocator.OperationCallResultsListTimeSource#getOpsCallList <em>Ops Call List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ops Call List</em>'.
	 * @see org.eclipse.symphony.core.invocator.OperationCallResultsListTimeSource#getOpsCallList()
	 * @see #getOperationCallResultsListTimeSource()
	 * @generated
	 */
	EReference getOperationCallResultsListTimeSource_OpsCallList();

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
	 * @model instanceClass="org.eclipse.emf.common.util.EList<org.eclipse.symphony.core.invocator.TypeMemberImplementation>"
	 * @generated
	 */
  EDataType getTypeMemberImplementationsEList();

  /**
	 * Returns the meta object for data type '<em>Type Members Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Members Array</em>'.
	 * @model instanceClass="org.eclipse.symphony.core.invocator.TypeMember[]"
	 * @generated
	 */
	EDataType getTypeMembersArray();

		/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Symphony__CoreInvocatorFactory getSymphony__CoreInvocatorFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.EMFEcoreInvocatorFacadeImpl <em>EMF Ecore Invocator Facade</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.EMFEcoreInvocatorFacadeImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getEMFEcoreInvocatorFacade()
		 * @generated
		 */
    EClass EMF_ECORE_INVOCATOR_FACADE = eINSTANCE.getEMFEcoreInvocatorFacade();

    /**
		 * The meta object literal for the '<em><b>Active Invocator Session</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_ECORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION = eINSTANCE.getEMFEcoreInvocatorFacade_ActiveInvocatorSession();

				/**
		 * The meta object literal for the '<em><b>Exec</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_FACADE___EXEC__OPERATIONCALL = eINSTANCE.getEMFEcoreInvocatorFacade__Exec__OperationCall();

    /**
		 * The meta object literal for the '<em><b>Exec</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_FACADE___EXEC__OPERATIONCALL_BOOLEAN = eINSTANCE.getEMFEcoreInvocatorFacade__Exec__OperationCall_boolean();

    /**
		 * The meta object literal for the '<em><b>Exec</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_FACADE___EXEC__OPERATIONCALLSLIST = eINSTANCE.getEMFEcoreInvocatorFacade__Exec__OperationCallsList();

    /**
		 * The meta object literal for the '<em><b>Create Abstract Result Value</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_FACADE___CREATE_ABSTRACT_RESULT_VALUE__OBJECT = eINSTANCE.getEMFEcoreInvocatorFacade__CreateAbstractResultValue__Object();

    /**
		 * The meta object literal for the '<em><b>Resolve Watch</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_FACADE___RESOLVE_WATCH__ABSTRACTFEATURENODE = eINSTANCE.getEMFEcoreInvocatorFacade__ResolveWatch__AbstractFeatureNode();

    /**
		 * The meta object literal for the '<em><b>Resolve Watch</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_FACADE___RESOLVE_WATCH__TYPEMEMBERREFERENCETREEELEMENT = eINSTANCE.getEMFEcoreInvocatorFacade__ResolveWatch__TypeMemberReferenceTreeElement();

    /**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_FACADE___GET_VALUE__ABSTRACTFEATURENODE = eINSTANCE.getEMFEcoreInvocatorFacade__GetValue__AbstractFeatureNode();

    /**
		 * The meta object literal for the '<em><b>Get Instance</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_FACADE___GET_INSTANCE__VARIABLE = eINSTANCE.getEMFEcoreInvocatorFacade__GetInstance__Variable();

    /**
		 * The meta object literal for the '<em><b>Get Instance Class</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_FACADE___GET_INSTANCE_CLASS__VARIABLE = eINSTANCE.getEMFEcoreInvocatorFacade__GetInstanceClass__Variable();

    /**
		 * The meta object literal for the '<em><b>Get Type Api Adapter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMF_ECORE_INVOCATOR_FACADE___GET_TYPE_API_ADAPTER__VARIABLEFEATUREREFERENCE = eINSTANCE.getEMFEcoreInvocatorFacade__GetTypeApiAdapter__VariableFeatureReference();

				/**
		 * The meta object literal for the '<em><b>Get Instance</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_FACADE___GET_INSTANCE__VARIABLEFEATUREREFERENCE = eINSTANCE.getEMFEcoreInvocatorFacade__GetInstance__VariableFeatureReference();

    /**
		 * The meta object literal for the '<em><b>Get Type Member Instance</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_FACADE___GET_TYPE_MEMBER_INSTANCE__VARIABLEFEATUREREFERENCE = eINSTANCE.getEMFEcoreInvocatorFacade__GetTypeMemberInstance__VariableFeatureReference();

    /**
		 * The meta object literal for the '<em><b>Get EMF Feature Value</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_FACADE___GET_EMF_FEATURE_VALUE__VARIABLEFEATUREREFERENCE = eINSTANCE.getEMFEcoreInvocatorFacade__GetEMFFeatureValue__VariableFeatureReference();

    /**
		 * The meta object literal for the '<em><b>Get Instance Class</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMF_ECORE_INVOCATOR_FACADE___GET_INSTANCE_CLASS__VARIABLEFEATUREREFERENCE = eINSTANCE.getEMFEcoreInvocatorFacade__GetInstanceClass__VariableFeatureReference();

				/**
		 * The meta object literal for the '<em><b>Get Instance</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_FACADE___GET_INSTANCE__TYPEMEMBERREFERENCETREEELEMENT = eINSTANCE.getEMFEcoreInvocatorFacade__GetInstance__TypeMemberReferenceTreeElement();

    /**
		 * The meta object literal for the '<em><b>Get Type Implementation</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_FACADE___GET_TYPE_IMPLEMENTATION__OPERATIONCALL = eINSTANCE.getEMFEcoreInvocatorFacade__GetTypeImplementation__OperationCall();

    /**
		 * The meta object literal for the '<em><b>Get Type Implementation</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_FACADE___GET_TYPE_IMPLEMENTATION__VARIABLE_ABSTRACTTYPE = eINSTANCE.getEMFEcoreInvocatorFacade__GetTypeImplementation__Variable_AbstractType();

    /**
		 * The meta object literal for the '<em><b>Get Type Implementation</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_FACADE___GET_TYPE_IMPLEMENTATION__VARIABLE = eINSTANCE.getEMFEcoreInvocatorFacade__GetTypeImplementation__Variable();

    /**
		 * The meta object literal for the '<em><b>Create Type Member References</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMF_ECORE_INVOCATOR_FACADE___CREATE_TYPE_MEMBER_REFERENCES__TYPEMEMBER = eINSTANCE.getEMFEcoreInvocatorFacade__CreateTypeMemberReferences__TypeMember();

				/**
		 * The meta object literal for the '<em><b>Get Type Implementation</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_FACADE___GET_TYPE_IMPLEMENTATION__ENVIRONMENT_STRING = eINSTANCE.getEMFEcoreInvocatorFacade__GetTypeImplementation__Environment_String();

    /**
		 * The meta object literal for the '<em><b>Get Fully Qualified Name</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_FACADE___GET_FULLY_QUALIFIED_NAME__TYPEMEMBERREFERENCETREEELEMENT = eINSTANCE.getEMFEcoreInvocatorFacade__GetFullyQualifiedName__TypeMemberReferenceTreeElement();

    /**
		 * The meta object literal for the '<em><b>Get Fully Qualified Name</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_FACADE___GET_FULLY_QUALIFIED_NAME__ABSTRACTFEATURENODE = eINSTANCE.getEMFEcoreInvocatorFacade__GetFullyQualifiedName__AbstractFeatureNode();

    /**
		 * The meta object literal for the '<em><b>Create Type Member Implementations</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_FACADE___CREATE_TYPE_MEMBER_IMPLEMENTATIONS__TYPE = eINSTANCE.getEMFEcoreInvocatorFacade__CreateTypeMemberImplementations__Type();

    /**
		 * The meta object literal for the '<em><b>Init Variable Instances</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_FACADE___INIT_VARIABLE_INSTANCES__ENVIRONMENT = eINSTANCE.getEMFEcoreInvocatorFacade__InitVariableInstances__Environment();

    /**
		 * The meta object literal for the '<em><b>Dispose Variable Instances</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_FACADE___DISPOSE_VARIABLE_INSTANCES__ENVIRONMENT = eINSTANCE.getEMFEcoreInvocatorFacade__DisposeVariableInstances__Environment();

    /**
		 * The meta object literal for the '<em><b>Get Operation Call Container</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_FACADE___GET_OPERATION_CALL_CONTAINER__TYPEMEMBERREFERENCELISTELEMENT = eINSTANCE.getEMFEcoreInvocatorFacade__GetOperationCallContainer__TypeMemberReferenceListElement();

    /**
		 * The meta object literal for the '<em><b>Apply Initialization Data</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_FACADE___APPLY_INITIALIZATION_DATA__ENVIRONMENT = eINSTANCE.getEMFEcoreInvocatorFacade__ApplyInitializationData__Environment();

    /**
		 * The meta object literal for the '<em><b>Collect Initialization Data</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_FACADE___COLLECT_INITIALIZATION_DATA__ENVIRONMENT = eINSTANCE.getEMFEcoreInvocatorFacade__CollectInitializationData__Environment();

    /**
		 * The meta object literal for the '<em><b>Apply Initialization Data</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_FACADE___APPLY_INITIALIZATION_DATA__VARIABLE = eINSTANCE.getEMFEcoreInvocatorFacade__ApplyInitializationData__Variable();

    /**
		 * The meta object literal for the '<em><b>Collect Initialization Data</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_FACADE___COLLECT_INITIALIZATION_DATA__VARIABLE = eINSTANCE.getEMFEcoreInvocatorFacade__CollectInitializationData__Variable();

    /**
		 * The meta object literal for the '<em><b>Load Registered Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMF_ECORE_INVOCATOR_FACADE___LOAD_REGISTERED_TYPES__INVOCATORSESSION = eINSTANCE.getEMFEcoreInvocatorFacade__LoadRegisteredTypes__InvocatorSession();

				/**
		 * The meta object literal for the '<em><b>Get All Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMF_ECORE_INVOCATOR_FACADE___GET_ALL_TYPES__ENVIRONMENT = eINSTANCE.getEMFEcoreInvocatorFacade__GetAllTypes__Environment();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.InvocatorSessionImpl <em>Invocator Session</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.InvocatorSessionImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getInvocatorSession()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.EnvironmentImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getEnvironment()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.DataProductsListsContainerImpl <em>Data Products Lists Container</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.DataProductsListsContainerImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getDataProductsListsContainer()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.DataProductsListImpl <em>Data Products List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.DataProductsListImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getDataProductsList()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.ToolsListImpl <em>Tools List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.ToolsListImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getToolsList()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.AbstractToolsListContainerImpl <em>Abstract Tools List Container</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.AbstractToolsListContainerImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getAbstractToolsListContainer()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.TypesListImpl <em>Types List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.TypesListImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getTypesList()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.LocalTypesListImpl <em>Local Types List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.LocalTypesListImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getLocalTypesList()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.RegisteredTypesListImpl <em>Registered Types List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.RegisteredTypesListImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getRegisteredTypesList()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.AbstractType <em>Abstract Type</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.AbstractType
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getAbstractType()
		 * @generated
		 */
    EClass ABSTRACT_TYPE = eINSTANCE.getAbstractType();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.TypeImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getType()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.TypeApiAdapterImpl <em>Type Api Adapter</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.TypeApiAdapterImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getTypeApiAdapter()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.TypeMemberImpl <em>Type Member</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.TypeMemberImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getTypeMember()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.TypeMemberReferenceImpl <em>Type Member Reference</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.TypeMemberReferenceImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getTypeMemberReference()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.TypeMemberReferenceListElementImpl <em>Type Member Reference List Element</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.TypeMemberReferenceListElementImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getTypeMemberReferenceListElement()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.TypeMemberReferenceTreeElementImpl <em>Type Member Reference Tree Element</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.TypeMemberReferenceTreeElementImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getTypeMemberReferenceTreeElement()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.VariablesListImpl <em>Variables List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.VariablesListImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getVariablesList()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.VariableImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getVariable()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.ContextsListImpl <em>Contexts List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.ContextsListImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getContextsList()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.ContextImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getContext()
		 * @generated
		 */
    EClass CONTEXT = eINSTANCE.getContext();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.BasicContextImpl <em>Basic Context</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.BasicContextImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getBasicContext()
		 * @generated
		 */
    EClass BASIC_CONTEXT = eINSTANCE.getBasicContext();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.VariableImplementationsListImpl <em>Variable Implementations List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.VariableImplementationsListImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getVariableImplementationsList()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.AbstractInitializationDataImpl <em>Abstract Initialization Data</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.AbstractInitializationDataImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getAbstractInitializationData()
		 * @generated
		 */
    EClass ABSTRACT_INITIALIZATION_DATA = eINSTANCE.getAbstractInitializationData();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.InitializationDataImpl <em>Initialization Data</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.InitializationDataImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getInitializationData()
		 * @generated
		 */
    EClass INITIALIZATION_DATA = eINSTANCE.getInitializationData();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.AbstractTypeImplementationImpl <em>Abstract Type Implementation</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.AbstractTypeImplementationImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getAbstractTypeImplementation()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.VariableImplementationImpl <em>Variable Implementation</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.VariableImplementationImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getVariableImplementation()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.TypeMemberImplementationImpl <em>Type Member Implementation</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.TypeMemberImplementationImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getTypeMemberImplementation()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.ValuesListImpl <em>Values List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.ValuesListImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getValuesList()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.ValueImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getValue()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.ProgramsListImpl <em>Programs List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.ProgramsListImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getProgramsList()
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
		 * The meta object literal for the '<em><b>Programs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference PROGRAMS_LIST__PROGRAMS = eINSTANCE.getProgramsList_Programs();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.ProgramImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getProgram()
		 * @generated
		 */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
		 * The meta object literal for the '<em><b>Programs List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference PROGRAM__PROGRAMS_LIST = eINSTANCE.getProgram_ProgramsList();

    /**
		 * The meta object literal for the '<em><b>Invocator Session</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference PROGRAM__INVOCATOR_SESSION = eINSTANCE.getProgram_InvocatorSession();

    /**
		 * The meta object literal for the '<em><b>Values List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__VALUES_LIST = eINSTANCE.getProgram_ValuesList();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.OperationCallContainer <em>Operation Call Container</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.OperationCallContainer
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getOperationCallContainer()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.OperationCallsListImpl <em>Operation Calls List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.OperationCallsListImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getOperationCallsList()
		 * @generated
		 */
    EClass OPERATION_CALLS_LIST = eINSTANCE.getOperationCallsList();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.VariableFeatureReferenceImpl <em>Variable Feature Reference</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.VariableFeatureReferenceImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getVariableFeatureReference()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.OperationCallImpl <em>Operation Call</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.OperationCallImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getOperationCall()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.ArgumentsListImpl <em>Arguments List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.ArgumentsListImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getArgumentsList()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.ArgumentImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getArgument()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.EDataTypeArgumentImpl <em>EData Type Argument</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.EDataTypeArgumentImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getEDataTypeArgument()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.EEnumArgumentImpl <em>EEnum Argument</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.EEnumArgumentImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getEEnumArgument()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.EClassArgumentImpl <em>EClass Argument</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.EClassArgumentImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getEClassArgument()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.ResultsList <em>Results List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.ResultsList
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getResultsList()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.OperationCallResultsListImpl <em>Operation Call Results List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.OperationCallResultsListImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getOperationCallResultsList()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.RecordingResultsListImpl <em>Recording Results List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.RecordingResultsListImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getRecordingResultsList()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.AbstractResultImpl <em>Abstract Result</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.AbstractResultImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getAbstractResult()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.AbstractResultValueImpl <em>Abstract Result Value</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.AbstractResultValueImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getAbstractResultValue()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.OperationCallResultImpl <em>Operation Call Result</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.OperationCallResultImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getOperationCallResult()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.ExceptionContainerImpl <em>Exception Container</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.ExceptionContainerImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getExceptionContainer()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.AttributeResultValueImpl <em>Attribute Result Value</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.AttributeResultValueImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getAttributeResultValue()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.AttributeValueImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getAttributeValue()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.ReferenceResultValueImpl <em>Reference Result Value</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.ReferenceResultValueImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getReferenceResultValue()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.WatchesListsContainerImpl <em>Watches Lists Container</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.WatchesListsContainerImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getWatchesListsContainer()
		 * @generated
		 */
    EClass WATCHES_LISTS_CONTAINER = eINSTANCE.getWatchesListsContainer();

    /**
		 * The meta object literal for the '<em><b>Watches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference WATCHES_LISTS_CONTAINER__WATCHES = eINSTANCE.getWatchesListsContainer_Watches();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.WatchesListImpl <em>Watches List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.WatchesListImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getWatchesList()
		 * @generated
		 */
    EClass WATCHES_LIST = eINSTANCE.getWatchesList();

    /**
		 * The meta object literal for the '<em><b>Watches Lists Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference WATCHES_LIST__WATCHES_LISTS_CONTAINER = eINSTANCE.getWatchesList_WatchesListsContainer();

    /**
		 * The meta object literal for the '<em><b>Watches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference WATCHES_LIST__WATCHES = eINSTANCE.getWatchesList_Watches();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.WatchImpl <em>Watch</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.WatchImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getWatch()
		 * @generated
		 */
    EClass WATCH = eINSTANCE.getWatch();

    /**
		 * The meta object literal for the '<em><b>Watches List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference WATCH__WATCHES_LIST = eINSTANCE.getWatch_WatchesList();

    /**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference WATCH__VARIABLE = eINSTANCE.getWatch_Variable();

    /**
		 * The meta object literal for the '<em><b>Type Member Reference Tree Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference WATCH__TYPE_MEMBER_REFERENCE_TREE_ELEMENT = eINSTANCE.getWatch_TypeMemberReferenceTreeElement();

    /**
		 * The meta object literal for the '<em><b>Tree Root Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference WATCH__TREE_ROOT_NODE = eINSTANCE.getWatch_TreeRootNode();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.WatchFeatureNodeAdapterImpl <em>Watch Feature Node Adapter</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.WatchFeatureNodeAdapterImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getWatchFeatureNodeAdapter()
		 * @generated
		 */
    EClass WATCH_FEATURE_NODE_ADAPTER = eINSTANCE.getWatchFeatureNodeAdapter();

    /**
		 * The meta object literal for the '<em><b>Source Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference WATCH_FEATURE_NODE_ADAPTER__SOURCE_OBJECT = eINSTANCE.getWatchFeatureNodeAdapter_SourceObject();

    /**
		 * The meta object literal for the '<em><b>Feature Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference WATCH_FEATURE_NODE_ADAPTER__FEATURE_NODE = eINSTANCE.getWatchFeatureNodeAdapter_FeatureNode();

    /**
		 * The meta object literal for the '<em><b>Current Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute WATCH_FEATURE_NODE_ADAPTER__CURRENT_VALUE = eINSTANCE.getWatchFeatureNodeAdapter_CurrentValue();

    /**
		 * The meta object literal for the '<em><b>Resolved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute WATCH_FEATURE_NODE_ADAPTER__RESOLVED = eINSTANCE.getWatchFeatureNodeAdapter_Resolved();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.DisplaysListsContainerImpl <em>Displays Lists Container</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.DisplaysListsContainerImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getDisplaysListsContainer()
		 * @generated
		 */
    EClass DISPLAYS_LISTS_CONTAINER = eINSTANCE.getDisplaysListsContainer();

    /**
		 * The meta object literal for the '<em><b>Displays</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DISPLAYS_LISTS_CONTAINER__DISPLAYS = eINSTANCE.getDisplaysListsContainer_Displays();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.DisplaysListImpl <em>Displays List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.DisplaysListImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getDisplaysList()
		 * @generated
		 */
    EClass DISPLAYS_LIST = eINSTANCE.getDisplaysList();

    /**
		 * The meta object literal for the '<em><b>Displays Lists Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DISPLAYS_LIST__DISPLAYS_LISTS_CONTAINER = eINSTANCE.getDisplaysList_DisplaysListsContainer();

    /**
		 * The meta object literal for the '<em><b>Displays</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DISPLAYS_LIST__DISPLAYS = eINSTANCE.getDisplaysList_Displays();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.AbstractDisplayImpl <em>Abstract Display</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.AbstractDisplayImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getAbstractDisplay()
		 * @generated
		 */
    EClass ABSTRACT_DISPLAY = eINSTANCE.getAbstractDisplay();

    /**
		 * The meta object literal for the '<em><b>Displays List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_DISPLAY__DISPLAYS_LIST = eINSTANCE.getAbstractDisplay_DisplaysList();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.RecordingToolsContainerImpl <em>Recording Tools Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.RecordingToolsContainerImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getRecordingToolsContainer()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.ChannelsListImpl <em>Channels List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.ChannelsListImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getChannelsList()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.AbstractChannelImpl <em>Abstract Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.AbstractChannelImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getAbstractChannel()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.AbstractRecorderImpl <em>Abstract Recorder</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.AbstractRecorderImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getAbstractRecorder()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.AbstractPlayerImpl <em>Abstract Player</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.AbstractPlayerImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getAbstractPlayer()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.invocator.impl.OperationCallResultsListTimeSourceImpl <em>Operation Call Results List Time Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.OperationCallResultsListTimeSourceImpl
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getOperationCallResultsListTimeSource()
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
		 * The meta object literal for the '<em>Throwable</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.lang.Throwable
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getThrowable()
		 * @generated
		 */
    EDataType THROWABLE = eINSTANCE.getThrowable();

    /**
		 * The meta object literal for the '<em>Notification</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.notify.Notification
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getNotification()
		 * @generated
		 */
    EDataType NOTIFICATION = eINSTANCE.getNotification();

    /**
		 * The meta object literal for the '<em>Type Member Implementations EList</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.EList
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getTypeMemberImplementationsEList()
		 * @generated
		 */
    EDataType TYPE_MEMBER_IMPLEMENTATIONS_ELIST = eINSTANCE.getTypeMemberImplementationsEList();

				/**
		 * The meta object literal for the '<em>Type Members Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.invocator.impl.Symphony__CoreInvocatorPackageImpl#getTypeMembersArray()
		 * @generated
		 */
		EDataType TYPE_MEMBERS_ARRAY = eINSTANCE.getTypeMembersArray();

  }

} //Symphony__CoreInvocatorPackage
