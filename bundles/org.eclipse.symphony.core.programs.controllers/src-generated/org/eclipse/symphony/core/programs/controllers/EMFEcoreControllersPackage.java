/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.programs.controllers;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;

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
 * @see org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='EMFEcoreControllers' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)' modelName='EMFEcoreControllers' suppressGenModelAnnotations='false' modelDirectory='/org.eclipse.symphony.core.programs.controllers/src-generated' editDirectory='/org.eclipse.symphony.core.programs.controllers.edit/src-generated' basePackage='org.eclipse.symphony.core.programs'"
 * @generated
 */
public interface EMFEcoreControllersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "controllers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.symphony.core.programs.controllers";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "controllers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EMFEcoreControllersPackage eINSTANCE = org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.programs.controllers.impl.ControllerFacadeImpl <em>Controller Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.programs.controllers.impl.ControllerFacadeImpl
	 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getControllerFacade()
	 * @generated
	 */
	int CONTROLLER_FACADE = 0;

	/**
	 * The number of structural features of the '<em>Controller Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FACADE___CREATE_VALUE__EPARAMETER_FLOAT = 0;

	/**
	 * The operation id for the '<em>Sort Custom Input Conditioning Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FACADE___SORT_CUSTOM_INPUT_CONDITIONING_POINT__LIST = 1;

	/**
	 * The operation id for the '<em>Create Custom Input Conditioning Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FACADE___CREATE_CUSTOM_INPUT_CONDITIONING_POINT__DOUBLE_DOUBLE = 2;

	/**
	 * The number of operations of the '<em>Controller Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FACADE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.programs.controllers.impl.ControllersConfigurationImpl <em>Controllers Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.programs.controllers.impl.ControllersConfigurationImpl
	 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getControllersConfiguration()
	 * @generated
	 */
	int CONTROLLERS_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLERS_CONFIGURATION__NAME = EMFEcoreInvocatorPackage.PROGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLERS_CONFIGURATION__DESCRIPTION = EMFEcoreInvocatorPackage.PROGRAM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Programs List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLERS_CONFIGURATION__PROGRAMS_LIST = EMFEcoreInvocatorPackage.PROGRAM__PROGRAMS_LIST;

	/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLERS_CONFIGURATION__INVOCATOR_SESSION = EMFEcoreInvocatorPackage.PROGRAM__INVOCATOR_SESSION;

	/**
	 * The feature id for the '<em><b>Values List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLERS_CONFIGURATION__VALUES_LIST = EMFEcoreInvocatorPackage.PROGRAM__VALUES_LIST;

	/**
	 * The feature id for the '<em><b>Operation Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLERS_CONFIGURATION__OPERATION_CALLS = EMFEcoreInvocatorPackage.PROGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLERS_CONFIGURATION__ACTIVE = EMFEcoreInvocatorPackage.PROGRAM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Controllers Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLERS_CONFIGURATION_FEATURE_COUNT = EMFEcoreInvocatorPackage.PROGRAM_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Invocator Session</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLERS_CONFIGURATION___GET_INVOCATOR_SESSION = EMFEcoreInvocatorPackage.PROGRAM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Controllers Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLERS_CONFIGURATION_OPERATION_COUNT = EMFEcoreInvocatorPackage.PROGRAM_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.programs.controllers.impl.OperationCallControllerBindingImpl <em>Operation Call Controller Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.programs.controllers.impl.OperationCallControllerBindingImpl
	 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getOperationCallControllerBinding()
	 * @generated
	 */
	int OPERATION_CALL_CONTROLLER_BINDING = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_CONTROLLER_BINDING__NAME = EMFEcoreInvocatorPackage.OPERATION_CALL__NAME;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_CONTROLLER_BINDING__VARIABLE = EMFEcoreInvocatorPackage.OPERATION_CALL__VARIABLE;

	/**
	 * The feature id for the '<em><b>Type Member Reference List Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_CONTROLLER_BINDING__TYPE_MEMBER_REFERENCE_LIST_ELEMENT = EMFEcoreInvocatorPackage.OPERATION_CALL__TYPE_MEMBER_REFERENCE_LIST_ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_CONTROLLER_BINDING__FEATURE_ROOT = EMFEcoreInvocatorPackage.OPERATION_CALL__FEATURE_ROOT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_CONTROLLER_BINDING__DESCRIPTION = EMFEcoreInvocatorPackage.OPERATION_CALL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>EOperation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_CONTROLLER_BINDING__EOPERATION = EMFEcoreInvocatorPackage.OPERATION_CALL__EOPERATION;

	/**
	 * The feature id for the '<em><b>Arguments List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_CONTROLLER_BINDING__ARGUMENTS_LIST = EMFEcoreInvocatorPackage.OPERATION_CALL__ARGUMENTS_LIST;

	/**
	 * The feature id for the '<em><b>Operation Call Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_CONTROLLER_BINDING__OPERATION_CALL_CONTAINER = EMFEcoreInvocatorPackage.OPERATION_CALL__OPERATION_CALL_CONTAINER;

	/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_CONTROLLER_BINDING__INVOCATOR_SESSION = EMFEcoreInvocatorPackage.OPERATION_CALL__INVOCATOR_SESSION;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_CONTROLLER_BINDING__ENVIRONMENT = EMFEcoreInvocatorPackage.OPERATION_CALL__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Create Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_CONTROLLER_BINDING__CREATE_RESULT = EMFEcoreInvocatorPackage.OPERATION_CALL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_CONTROLLER_BINDING__ACTIVE = EMFEcoreInvocatorPackage.OPERATION_CALL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_CONTROLLER_BINDING__TRIGGER = EMFEcoreInvocatorPackage.OPERATION_CALL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation Call Controller Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_CONTROLLER_BINDING_FEATURE_COUNT = EMFEcoreInvocatorPackage.OPERATION_CALL_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_CONTROLLER_BINDING___UPDATE = EMFEcoreInvocatorPackage.OPERATION_CALL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operation Call Controller Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_CONTROLLER_BINDING_OPERATION_COUNT = EMFEcoreInvocatorPackage.OPERATION_CALL_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.programs.controllers.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.programs.controllers.impl.TriggerImpl
	 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__DESCRIPTION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Call Controller Binding</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__OPERATION_CALL_CONTROLLER_BINDING = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.programs.controllers.impl.TimeTriggerImpl <em>Time Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.programs.controllers.impl.TimeTriggerImpl
	 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getTimeTrigger()
	 * @generated
	 */
	int TIME_TRIGGER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TRIGGER__NAME = TRIGGER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TRIGGER__DESCRIPTION = TRIGGER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Operation Call Controller Binding</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TRIGGER__OPERATION_CALL_CONTROLLER_BINDING = TRIGGER__OPERATION_CALL_CONTROLLER_BINDING;

	/**
	 * The feature id for the '<em><b>Refresh Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TRIGGER__REFRESH_PERIOD = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.programs.controllers.impl.ControllerTriggerImpl <em>Controller Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.programs.controllers.impl.ControllerTriggerImpl
	 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getControllerTrigger()
	 * @generated
	 */
	int CONTROLLER_TRIGGER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_TRIGGER__NAME = TRIGGER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_TRIGGER__DESCRIPTION = TRIGGER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Operation Call Controller Binding</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_TRIGGER__OPERATION_CALL_CONTROLLER_BINDING = TRIGGER__OPERATION_CALL_CONTROLLER_BINDING;

	/**
	 * The feature id for the '<em><b>Component Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_TRIGGER__COMPONENT_QUALIFIER = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Controller Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Controller Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.programs.controllers.impl.ControllerEdgeTriggerImpl <em>Controller Edge Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.programs.controllers.impl.ControllerEdgeTriggerImpl
	 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getControllerEdgeTrigger()
	 * @generated
	 */
	int CONTROLLER_EDGE_TRIGGER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EDGE_TRIGGER__NAME = CONTROLLER_TRIGGER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EDGE_TRIGGER__DESCRIPTION = CONTROLLER_TRIGGER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Operation Call Controller Binding</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EDGE_TRIGGER__OPERATION_CALL_CONTROLLER_BINDING = CONTROLLER_TRIGGER__OPERATION_CALL_CONTROLLER_BINDING;

	/**
	 * The feature id for the '<em><b>Component Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EDGE_TRIGGER__COMPONENT_QUALIFIER = CONTROLLER_TRIGGER__COMPONENT_QUALIFIER;

	/**
	 * The feature id for the '<em><b>Edge Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EDGE_TRIGGER__EDGE_TYPE = CONTROLLER_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Controller Edge Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EDGE_TRIGGER_FEATURE_COUNT = CONTROLLER_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Controller Edge Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_EDGE_TRIGGER_OPERATION_COUNT = CONTROLLER_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.programs.controllers.impl.ControllerStateTriggerImpl <em>Controller State Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.programs.controllers.impl.ControllerStateTriggerImpl
	 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getControllerStateTrigger()
	 * @generated
	 */
	int CONTROLLER_STATE_TRIGGER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_STATE_TRIGGER__NAME = CONTROLLER_TRIGGER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_STATE_TRIGGER__DESCRIPTION = CONTROLLER_TRIGGER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Operation Call Controller Binding</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_STATE_TRIGGER__OPERATION_CALL_CONTROLLER_BINDING = CONTROLLER_TRIGGER__OPERATION_CALL_CONTROLLER_BINDING;

	/**
	 * The feature id for the '<em><b>Component Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_STATE_TRIGGER__COMPONENT_QUALIFIER = CONTROLLER_TRIGGER__COMPONENT_QUALIFIER;

	/**
	 * The feature id for the '<em><b>Enabling Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_STATE_TRIGGER__ENABLING_VALUE = CONTROLLER_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repeat Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_STATE_TRIGGER__REPEAT_PERIOD = CONTROLLER_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Controller State Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_STATE_TRIGGER_FEATURE_COUNT = CONTROLLER_TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Controller State Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_STATE_TRIGGER_OPERATION_COUNT = CONTROLLER_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.programs.controllers.impl.BindedEDataTypeArgumentImpl <em>Binded EData Type Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.programs.controllers.impl.BindedEDataTypeArgumentImpl
	 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getBindedEDataTypeArgument()
	 * @generated
	 */
	int BINDED_EDATA_TYPE_ARGUMENT = 8;

	/**
	 * The feature id for the '<em><b>Arguments List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDED_EDATA_TYPE_ARGUMENT__ARGUMENTS_LIST = EMFEcoreInvocatorPackage.ARGUMENT__ARGUMENTS_LIST;

	/**
	 * The feature id for the '<em><b>Operation Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDED_EDATA_TYPE_ARGUMENT__OPERATION_CALL = EMFEcoreInvocatorPackage.ARGUMENT__OPERATION_CALL;

	/**
	 * The feature id for the '<em><b>Value Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE = EMFEcoreInvocatorPackage.ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binded EData Type Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDED_EDATA_TYPE_ARGUMENT_FEATURE_COUNT = EMFEcoreInvocatorPackage.ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EParameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDED_EDATA_TYPE_ARGUMENT___GET_EPARAMETER = EMFEcoreInvocatorPackage.ARGUMENT___GET_EPARAMETER;

	/**
	 * The operation id for the '<em>Get Parameter Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDED_EDATA_TYPE_ARGUMENT___GET_PARAMETER_VALUE = EMFEcoreInvocatorPackage.ARGUMENT___GET_PARAMETER_VALUE;

	/**
	 * The number of operations of the '<em>Binded EData Type Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDED_EDATA_TYPE_ARGUMENT_OPERATION_COUNT = EMFEcoreInvocatorPackage.ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.programs.controllers.impl.ValueSourceImpl <em>Value Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.programs.controllers.impl.ValueSourceImpl
	 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getValueSource()
	 * @generated
	 */
	int VALUE_SOURCE = 9;

	/**
	 * The feature id for the '<em><b>Binded EData Type Argument</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT = 0;

	/**
	 * The number of structural features of the '<em>Value Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SOURCE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Source Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SOURCE___GET_SOURCE_VALUE = 0;

	/**
	 * The number of operations of the '<em>Value Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SOURCE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.programs.controllers.impl.FixedValueSourceImpl <em>Fixed Value Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.programs.controllers.impl.FixedValueSourceImpl
	 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getFixedValueSource()
	 * @generated
	 */
	int FIXED_VALUE_SOURCE = 10;

	/**
	 * The feature id for the '<em><b>Arguments List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_VALUE_SOURCE__ARGUMENTS_LIST = EMFEcoreInvocatorPackage.EDATA_TYPE_ARGUMENT__ARGUMENTS_LIST;

	/**
	 * The feature id for the '<em><b>Operation Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_VALUE_SOURCE__OPERATION_CALL = EMFEcoreInvocatorPackage.EDATA_TYPE_ARGUMENT__OPERATION_CALL;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_VALUE_SOURCE__VALUE = EMFEcoreInvocatorPackage.EDATA_TYPE_ARGUMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Binded EData Type Argument</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT = EMFEcoreInvocatorPackage.EDATA_TYPE_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fixed Value Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_VALUE_SOURCE_FEATURE_COUNT = EMFEcoreInvocatorPackage.EDATA_TYPE_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EParameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_VALUE_SOURCE___GET_EPARAMETER = EMFEcoreInvocatorPackage.EDATA_TYPE_ARGUMENT___GET_EPARAMETER;

	/**
	 * The operation id for the '<em>Get Parameter Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_VALUE_SOURCE___GET_PARAMETER_VALUE = EMFEcoreInvocatorPackage.EDATA_TYPE_ARGUMENT___GET_PARAMETER_VALUE;

	/**
	 * The operation id for the '<em>Get Source Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_VALUE_SOURCE___GET_SOURCE_VALUE = EMFEcoreInvocatorPackage.EDATA_TYPE_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fixed Value Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_VALUE_SOURCE_OPERATION_COUNT = EMFEcoreInvocatorPackage.EDATA_TYPE_ARGUMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.programs.controllers.impl.ToggleValueSourceImpl <em>Toggle Value Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.programs.controllers.impl.ToggleValueSourceImpl
	 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getToggleValueSource()
	 * @generated
	 */
	int TOGGLE_VALUE_SOURCE = 11;

	/**
	 * The feature id for the '<em><b>Binded EData Type Argument</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT = VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_VALUE_SOURCE__INITIAL_VALUE = VALUE_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_VALUE_SOURCE__CURRENT_VALUE = VALUE_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Toggle Value Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_VALUE_SOURCE_FEATURE_COUNT = VALUE_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Source Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_VALUE_SOURCE___GET_SOURCE_VALUE = VALUE_SOURCE___GET_SOURCE_VALUE;

	/**
	 * The number of operations of the '<em>Toggle Value Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_VALUE_SOURCE_OPERATION_COUNT = VALUE_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.programs.controllers.impl.ControllerValueSourceImpl <em>Controller Value Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.programs.controllers.impl.ControllerValueSourceImpl
	 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getControllerValueSource()
	 * @generated
	 */
	int CONTROLLER_VALUE_SOURCE = 12;

	/**
	 * The feature id for the '<em><b>Binded EData Type Argument</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT = VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VALUE_SOURCE__COMPONENT = VALUE_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EComponent Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER = VALUE_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conditioning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VALUE_SOURCE__CONDITIONING = VALUE_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VALUE_SOURCE__LAST_VALUE = VALUE_SOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Controller Value Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VALUE_SOURCE_FEATURE_COUNT = VALUE_SOURCE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Source Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VALUE_SOURCE___GET_SOURCE_VALUE = VALUE_SOURCE___GET_SOURCE_VALUE;

	/**
	 * The number of operations of the '<em>Controller Value Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VALUE_SOURCE_OPERATION_COUNT = VALUE_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.programs.controllers.impl.AbstractInputConditioningImpl <em>Abstract Input Conditioning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.programs.controllers.impl.AbstractInputConditioningImpl
	 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getAbstractInputConditioning()
	 * @generated
	 */
	int ABSTRACT_INPUT_CONDITIONING = 13;

	/**
	 * The number of structural features of the '<em>Abstract Input Conditioning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INPUT_CONDITIONING_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Condition Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INPUT_CONDITIONING___CONDITION_INPUT__ECOMPONENT = 0;

	/**
	 * The number of operations of the '<em>Abstract Input Conditioning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INPUT_CONDITIONING_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.programs.controllers.impl.LinearInputConditioningImpl <em>Linear Input Conditioning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.programs.controllers.impl.LinearInputConditioningImpl
	 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getLinearInputConditioning()
	 * @generated
	 */
	int LINEAR_INPUT_CONDITIONING = 14;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_INPUT_CONDITIONING__MINIMUM = ABSTRACT_INPUT_CONDITIONING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_INPUT_CONDITIONING__MAXIMUM = ABSTRACT_INPUT_CONDITIONING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Linear Input Conditioning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_INPUT_CONDITIONING_FEATURE_COUNT = ABSTRACT_INPUT_CONDITIONING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Condition Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_INPUT_CONDITIONING___CONDITION_INPUT__ECOMPONENT = ABSTRACT_INPUT_CONDITIONING___CONDITION_INPUT__ECOMPONENT;

	/**
	 * The number of operations of the '<em>Linear Input Conditioning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_INPUT_CONDITIONING_OPERATION_COUNT = ABSTRACT_INPUT_CONDITIONING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.programs.controllers.impl.CenteredLinearInputConditioningImpl <em>Centered Linear Input Conditioning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.programs.controllers.impl.CenteredLinearInputConditioningImpl
	 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getCenteredLinearInputConditioning()
	 * @generated
	 */
	int CENTERED_LINEAR_INPUT_CONDITIONING = 15;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTERED_LINEAR_INPUT_CONDITIONING__MINIMUM = LINEAR_INPUT_CONDITIONING__MINIMUM;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTERED_LINEAR_INPUT_CONDITIONING__MAXIMUM = LINEAR_INPUT_CONDITIONING__MAXIMUM;

	/**
	 * The feature id for the '<em><b>Dead Band</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTERED_LINEAR_INPUT_CONDITIONING__DEAD_BAND = LINEAR_INPUT_CONDITIONING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Centered Linear Input Conditioning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTERED_LINEAR_INPUT_CONDITIONING_FEATURE_COUNT = LINEAR_INPUT_CONDITIONING_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Condition Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTERED_LINEAR_INPUT_CONDITIONING___CONDITION_INPUT__ECOMPONENT = LINEAR_INPUT_CONDITIONING___CONDITION_INPUT__ECOMPONENT;

	/**
	 * The number of operations of the '<em>Centered Linear Input Conditioning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTERED_LINEAR_INPUT_CONDITIONING_OPERATION_COUNT = LINEAR_INPUT_CONDITIONING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.programs.controllers.impl.ParabolicInputConditioningImpl <em>Parabolic Input Conditioning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.programs.controllers.impl.ParabolicInputConditioningImpl
	 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getParabolicInputConditioning()
	 * @generated
	 */
	int PARABOLIC_INPUT_CONDITIONING = 16;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARABOLIC_INPUT_CONDITIONING__MINIMUM = ABSTRACT_INPUT_CONDITIONING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARABOLIC_INPUT_CONDITIONING__MAXIMUM = ABSTRACT_INPUT_CONDITIONING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parabolic Input Conditioning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARABOLIC_INPUT_CONDITIONING_FEATURE_COUNT = ABSTRACT_INPUT_CONDITIONING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Condition Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARABOLIC_INPUT_CONDITIONING___CONDITION_INPUT__ECOMPONENT = ABSTRACT_INPUT_CONDITIONING___CONDITION_INPUT__ECOMPONENT;

	/**
	 * The number of operations of the '<em>Parabolic Input Conditioning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARABOLIC_INPUT_CONDITIONING_OPERATION_COUNT = ABSTRACT_INPUT_CONDITIONING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.programs.controllers.impl.CenteredParabolicInputConditioningImpl <em>Centered Parabolic Input Conditioning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.programs.controllers.impl.CenteredParabolicInputConditioningImpl
	 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getCenteredParabolicInputConditioning()
	 * @generated
	 */
	int CENTERED_PARABOLIC_INPUT_CONDITIONING = 17;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTERED_PARABOLIC_INPUT_CONDITIONING__MINIMUM = PARABOLIC_INPUT_CONDITIONING__MINIMUM;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTERED_PARABOLIC_INPUT_CONDITIONING__MAXIMUM = PARABOLIC_INPUT_CONDITIONING__MAXIMUM;

	/**
	 * The feature id for the '<em><b>Dead Band</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTERED_PARABOLIC_INPUT_CONDITIONING__DEAD_BAND = PARABOLIC_INPUT_CONDITIONING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Centered Parabolic Input Conditioning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTERED_PARABOLIC_INPUT_CONDITIONING_FEATURE_COUNT = PARABOLIC_INPUT_CONDITIONING_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Condition Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTERED_PARABOLIC_INPUT_CONDITIONING___CONDITION_INPUT__ECOMPONENT = PARABOLIC_INPUT_CONDITIONING___CONDITION_INPUT__ECOMPONENT;

	/**
	 * The number of operations of the '<em>Centered Parabolic Input Conditioning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTERED_PARABOLIC_INPUT_CONDITIONING_OPERATION_COUNT = PARABOLIC_INPUT_CONDITIONING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.programs.controllers.impl.UserDefinedInputConditioningImpl <em>User Defined Input Conditioning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.programs.controllers.impl.UserDefinedInputConditioningImpl
	 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getUserDefinedInputConditioning()
	 * @generated
	 */
	int USER_DEFINED_INPUT_CONDITIONING = 18;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_INPUT_CONDITIONING__UNITS = ABSTRACT_INPUT_CONDITIONING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transfer Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_INPUT_CONDITIONING__TRANSFER_FUNCTION = ABSTRACT_INPUT_CONDITIONING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User Defined Input Conditioning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_INPUT_CONDITIONING_FEATURE_COUNT = ABSTRACT_INPUT_CONDITIONING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Condition Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_INPUT_CONDITIONING___CONDITION_INPUT__ECOMPONENT = ABSTRACT_INPUT_CONDITIONING___CONDITION_INPUT__ECOMPONENT;

	/**
	 * The number of operations of the '<em>User Defined Input Conditioning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_INPUT_CONDITIONING_OPERATION_COUNT = ABSTRACT_INPUT_CONDITIONING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.programs.controllers.impl.CustomInputConditioningPointImpl <em>Custom Input Conditioning Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.programs.controllers.impl.CustomInputConditioningPointImpl
	 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getCustomInputConditioningPoint()
	 * @generated
	 */
	int CUSTOM_INPUT_CONDITIONING_POINT = 19;

	/**
	 * The feature id for the '<em><b>Input Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INPUT_CONDITIONING_POINT__INPUT_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Output Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INPUT_CONDITIONING_POINT__OUTPUT_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Custom Input Conditioning Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INPUT_CONDITIONING_POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Custom Input Conditioning Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INPUT_CONDITIONING_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.programs.controllers.EdgeType <em>Edge Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.programs.controllers.EdgeType
	 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getEdgeType()
	 * @generated
	 */
	int EDGE_TYPE = 20;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getList()
	 * @generated
	 */
	int LIST = 21;

	/**
	 * The meta object id for the '<em>Tree Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.TreeSet
	 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getTreeSet()
	 * @generated
	 */
	int TREE_SET = 22;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.programs.controllers.ControllerFacade <em>Controller Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller Facade</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.ControllerFacade
	 * @generated
	 */
	EClass getControllerFacade();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.programs.controllers.ControllerFacade#createValue(org.eclipse.emf.ecore.EParameter, float) <em>Create Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Value</em>' operation.
	 * @see org.eclipse.symphony.core.programs.controllers.ControllerFacade#createValue(org.eclipse.emf.ecore.EParameter, float)
	 * @generated
	 */
	EOperation getControllerFacade__CreateValue__EParameter_float();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.programs.controllers.ControllerFacade#sortCustomInputConditioningPoint(java.util.List) <em>Sort Custom Input Conditioning Point</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sort Custom Input Conditioning Point</em>' operation.
	 * @see org.eclipse.symphony.core.programs.controllers.ControllerFacade#sortCustomInputConditioningPoint(java.util.List)
	 * @generated
	 */
	EOperation getControllerFacade__SortCustomInputConditioningPoint__List();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.programs.controllers.ControllerFacade#createCustomInputConditioningPoint(double, double) <em>Create Custom Input Conditioning Point</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Custom Input Conditioning Point</em>' operation.
	 * @see org.eclipse.symphony.core.programs.controllers.ControllerFacade#createCustomInputConditioningPoint(double, double)
	 * @generated
	 */
	EOperation getControllerFacade__CreateCustomInputConditioningPoint__double_double();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.programs.controllers.ControllersConfiguration <em>Controllers Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controllers Configuration</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.ControllersConfiguration
	 * @generated
	 */
	EClass getControllersConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.programs.controllers.ControllersConfiguration#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.ControllersConfiguration#isActive()
	 * @see #getControllersConfiguration()
	 * @generated
	 */
	EAttribute getControllersConfiguration_Active();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.programs.controllers.OperationCallControllerBinding <em>Operation Call Controller Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Call Controller Binding</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.OperationCallControllerBinding
	 * @generated
	 */
	EClass getOperationCallControllerBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.programs.controllers.OperationCallControllerBinding#isCreateResult <em>Create Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Result</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.OperationCallControllerBinding#isCreateResult()
	 * @see #getOperationCallControllerBinding()
	 * @generated
	 */
	EAttribute getOperationCallControllerBinding_CreateResult();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.programs.controllers.OperationCallControllerBinding#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.OperationCallControllerBinding#isActive()
	 * @see #getOperationCallControllerBinding()
	 * @generated
	 */
	EAttribute getOperationCallControllerBinding_Active();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.programs.controllers.OperationCallControllerBinding#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.OperationCallControllerBinding#getTrigger()
	 * @see #getOperationCallControllerBinding()
	 * @generated
	 */
	EReference getOperationCallControllerBinding_Trigger();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.programs.controllers.OperationCallControllerBinding#update() <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see org.eclipse.symphony.core.programs.controllers.OperationCallControllerBinding#update()
	 * @generated
	 */
	EOperation getOperationCallControllerBinding__Update();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.programs.controllers.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.programs.controllers.Trigger#getOperationCallControllerBinding <em>Operation Call Controller Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation Call Controller Binding</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.Trigger#getOperationCallControllerBinding()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_OperationCallControllerBinding();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.programs.controllers.TimeTrigger <em>Time Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Trigger</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.TimeTrigger
	 * @generated
	 */
	EClass getTimeTrigger();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.programs.controllers.TimeTrigger#getRefreshPeriod <em>Refresh Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh Period</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.TimeTrigger#getRefreshPeriod()
	 * @see #getTimeTrigger()
	 * @generated
	 */
	EAttribute getTimeTrigger_RefreshPeriod();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.programs.controllers.ControllerTrigger <em>Controller Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller Trigger</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.ControllerTrigger
	 * @generated
	 */
	EClass getControllerTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.programs.controllers.ControllerTrigger#getComponentQualifier <em>Component Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Qualifier</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.ControllerTrigger#getComponentQualifier()
	 * @see #getControllerTrigger()
	 * @generated
	 */
	EReference getControllerTrigger_ComponentQualifier();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.programs.controllers.ControllerEdgeTrigger <em>Controller Edge Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller Edge Trigger</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.ControllerEdgeTrigger
	 * @generated
	 */
	EClass getControllerEdgeTrigger();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.programs.controllers.ControllerEdgeTrigger#getEdgeType <em>Edge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edge Type</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.ControllerEdgeTrigger#getEdgeType()
	 * @see #getControllerEdgeTrigger()
	 * @generated
	 */
	EAttribute getControllerEdgeTrigger_EdgeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.programs.controllers.ControllerStateTrigger <em>Controller State Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller State Trigger</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.ControllerStateTrigger
	 * @generated
	 */
	EClass getControllerStateTrigger();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.programs.controllers.ControllerStateTrigger#isEnablingValue <em>Enabling Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabling Value</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.ControllerStateTrigger#isEnablingValue()
	 * @see #getControllerStateTrigger()
	 * @generated
	 */
	EAttribute getControllerStateTrigger_EnablingValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.programs.controllers.ControllerStateTrigger#getRepeatPeriod <em>Repeat Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Period</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.ControllerStateTrigger#getRepeatPeriod()
	 * @see #getControllerStateTrigger()
	 * @generated
	 */
	EAttribute getControllerStateTrigger_RepeatPeriod();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.programs.controllers.BindedEDataTypeArgument <em>Binded EData Type Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binded EData Type Argument</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.BindedEDataTypeArgument
	 * @generated
	 */
	EClass getBindedEDataTypeArgument();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.programs.controllers.BindedEDataTypeArgument#getValueSource <em>Value Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Source</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.BindedEDataTypeArgument#getValueSource()
	 * @see #getBindedEDataTypeArgument()
	 * @generated
	 */
	EReference getBindedEDataTypeArgument_ValueSource();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.programs.controllers.ValueSource <em>Value Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Source</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.ValueSource
	 * @generated
	 */
	EClass getValueSource();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.programs.controllers.ValueSource#getBindedEDataTypeArgument <em>Binded EData Type Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Binded EData Type Argument</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.ValueSource#getBindedEDataTypeArgument()
	 * @see #getValueSource()
	 * @generated
	 */
	EReference getValueSource_BindedEDataTypeArgument();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.programs.controllers.ValueSource#getSourceValue() <em>Get Source Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Source Value</em>' operation.
	 * @see org.eclipse.symphony.core.programs.controllers.ValueSource#getSourceValue()
	 * @generated
	 */
	EOperation getValueSource__GetSourceValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.programs.controllers.FixedValueSource <em>Fixed Value Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Value Source</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.FixedValueSource
	 * @generated
	 */
	EClass getFixedValueSource();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.programs.controllers.ToggleValueSource <em>Toggle Value Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toggle Value Source</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.ToggleValueSource
	 * @generated
	 */
	EClass getToggleValueSource();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.programs.controllers.ToggleValueSource#isInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.ToggleValueSource#isInitialValue()
	 * @see #getToggleValueSource()
	 * @generated
	 */
	EAttribute getToggleValueSource_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.programs.controllers.ToggleValueSource#isCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Value</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.ToggleValueSource#isCurrentValue()
	 * @see #getToggleValueSource()
	 * @generated
	 */
	EAttribute getToggleValueSource_CurrentValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.programs.controllers.ControllerValueSource <em>Controller Value Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller Value Source</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.ControllerValueSource
	 * @generated
	 */
	EClass getControllerValueSource();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.programs.controllers.ControllerValueSource#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.ControllerValueSource#getComponent()
	 * @see #getControllerValueSource()
	 * @generated
	 */
	EReference getControllerValueSource_Component();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.programs.controllers.ControllerValueSource#getEComponentQualifier <em>EComponent Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EComponent Qualifier</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.ControllerValueSource#getEComponentQualifier()
	 * @see #getControllerValueSource()
	 * @generated
	 */
	EReference getControllerValueSource_EComponentQualifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.programs.controllers.ControllerValueSource#getConditioning <em>Conditioning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conditioning</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.ControllerValueSource#getConditioning()
	 * @see #getControllerValueSource()
	 * @generated
	 */
	EReference getControllerValueSource_Conditioning();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.programs.controllers.ControllerValueSource#getLastValue <em>Last Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Value</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.ControllerValueSource#getLastValue()
	 * @see #getControllerValueSource()
	 * @generated
	 */
	EAttribute getControllerValueSource_LastValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.programs.controllers.AbstractInputConditioning <em>Abstract Input Conditioning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Input Conditioning</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.AbstractInputConditioning
	 * @generated
	 */
	EClass getAbstractInputConditioning();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.programs.controllers.AbstractInputConditioning#conditionInput(org.eclipse.symphony.common.io.jinput.EComponent) <em>Condition Input</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Condition Input</em>' operation.
	 * @see org.eclipse.symphony.core.programs.controllers.AbstractInputConditioning#conditionInput(org.eclipse.symphony.common.io.jinput.EComponent)
	 * @generated
	 */
	EOperation getAbstractInputConditioning__ConditionInput__EComponent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.programs.controllers.LinearInputConditioning <em>Linear Input Conditioning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Input Conditioning</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.LinearInputConditioning
	 * @generated
	 */
	EClass getLinearInputConditioning();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.programs.controllers.LinearInputConditioning#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.LinearInputConditioning#getMinimum()
	 * @see #getLinearInputConditioning()
	 * @generated
	 */
	EAttribute getLinearInputConditioning_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.programs.controllers.LinearInputConditioning#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.LinearInputConditioning#getMaximum()
	 * @see #getLinearInputConditioning()
	 * @generated
	 */
	EAttribute getLinearInputConditioning_Maximum();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.programs.controllers.CenteredLinearInputConditioning <em>Centered Linear Input Conditioning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Centered Linear Input Conditioning</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.CenteredLinearInputConditioning
	 * @generated
	 */
	EClass getCenteredLinearInputConditioning();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.programs.controllers.CenteredLinearInputConditioning#getDeadBand <em>Dead Band</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dead Band</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.CenteredLinearInputConditioning#getDeadBand()
	 * @see #getCenteredLinearInputConditioning()
	 * @generated
	 */
	EAttribute getCenteredLinearInputConditioning_DeadBand();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.programs.controllers.ParabolicInputConditioning <em>Parabolic Input Conditioning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parabolic Input Conditioning</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.ParabolicInputConditioning
	 * @generated
	 */
	EClass getParabolicInputConditioning();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.programs.controllers.ParabolicInputConditioning#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.ParabolicInputConditioning#getMinimum()
	 * @see #getParabolicInputConditioning()
	 * @generated
	 */
	EAttribute getParabolicInputConditioning_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.programs.controllers.ParabolicInputConditioning#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.ParabolicInputConditioning#getMaximum()
	 * @see #getParabolicInputConditioning()
	 * @generated
	 */
	EAttribute getParabolicInputConditioning_Maximum();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.programs.controllers.CenteredParabolicInputConditioning <em>Centered Parabolic Input Conditioning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Centered Parabolic Input Conditioning</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.CenteredParabolicInputConditioning
	 * @generated
	 */
	EClass getCenteredParabolicInputConditioning();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.programs.controllers.CenteredParabolicInputConditioning#getDeadBand <em>Dead Band</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dead Band</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.CenteredParabolicInputConditioning#getDeadBand()
	 * @see #getCenteredParabolicInputConditioning()
	 * @generated
	 */
	EAttribute getCenteredParabolicInputConditioning_DeadBand();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.programs.controllers.UserDefinedInputConditioning <em>User Defined Input Conditioning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Defined Input Conditioning</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.UserDefinedInputConditioning
	 * @generated
	 */
	EClass getUserDefinedInputConditioning();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.programs.controllers.UserDefinedInputConditioning#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.UserDefinedInputConditioning#getUnits()
	 * @see #getUserDefinedInputConditioning()
	 * @generated
	 */
	EAttribute getUserDefinedInputConditioning_Units();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.programs.controllers.UserDefinedInputConditioning#getTransferFunction <em>Transfer Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transfer Function</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.UserDefinedInputConditioning#getTransferFunction()
	 * @see #getUserDefinedInputConditioning()
	 * @generated
	 */
	EReference getUserDefinedInputConditioning_TransferFunction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.programs.controllers.CustomInputConditioningPoint <em>Custom Input Conditioning Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Input Conditioning Point</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.CustomInputConditioningPoint
	 * @generated
	 */
	EClass getCustomInputConditioningPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.programs.controllers.CustomInputConditioningPoint#getInputValue <em>Input Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Value</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.CustomInputConditioningPoint#getInputValue()
	 * @see #getCustomInputConditioningPoint()
	 * @generated
	 */
	EAttribute getCustomInputConditioningPoint_InputValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.programs.controllers.CustomInputConditioningPoint#getOutputValue <em>Output Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Value</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.CustomInputConditioningPoint#getOutputValue()
	 * @see #getCustomInputConditioningPoint()
	 * @generated
	 */
	EAttribute getCustomInputConditioningPoint_OutputValue();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.symphony.core.programs.controllers.EdgeType <em>Edge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Edge Type</em>'.
	 * @see org.eclipse.symphony.core.programs.controllers.EdgeType
	 * @generated
	 */
	EEnum getEdgeType();

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
	 * Returns the meta object for data type '{@link java.util.TreeSet <em>Tree Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tree Set</em>'.
	 * @see java.util.TreeSet
	 * @model instanceClass="java.util.TreeSet" typeParameters="T"
	 * @generated
	 */
	EDataType getTreeSet();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EMFEcoreControllersFactory getEMFEcoreControllersFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.programs.controllers.impl.ControllerFacadeImpl <em>Controller Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.programs.controllers.impl.ControllerFacadeImpl
		 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getControllerFacade()
		 * @generated
		 */
		EClass CONTROLLER_FACADE = eINSTANCE.getControllerFacade();

		/**
		 * The meta object literal for the '<em><b>Create Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER_FACADE___CREATE_VALUE__EPARAMETER_FLOAT = eINSTANCE.getControllerFacade__CreateValue__EParameter_float();

		/**
		 * The meta object literal for the '<em><b>Sort Custom Input Conditioning Point</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER_FACADE___SORT_CUSTOM_INPUT_CONDITIONING_POINT__LIST = eINSTANCE.getControllerFacade__SortCustomInputConditioningPoint__List();

		/**
		 * The meta object literal for the '<em><b>Create Custom Input Conditioning Point</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER_FACADE___CREATE_CUSTOM_INPUT_CONDITIONING_POINT__DOUBLE_DOUBLE = eINSTANCE.getControllerFacade__CreateCustomInputConditioningPoint__double_double();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.programs.controllers.impl.ControllersConfigurationImpl <em>Controllers Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.programs.controllers.impl.ControllersConfigurationImpl
		 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getControllersConfiguration()
		 * @generated
		 */
		EClass CONTROLLERS_CONFIGURATION = eINSTANCE.getControllersConfiguration();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLERS_CONFIGURATION__ACTIVE = eINSTANCE.getControllersConfiguration_Active();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.programs.controllers.impl.OperationCallControllerBindingImpl <em>Operation Call Controller Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.programs.controllers.impl.OperationCallControllerBindingImpl
		 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getOperationCallControllerBinding()
		 * @generated
		 */
		EClass OPERATION_CALL_CONTROLLER_BINDING = eINSTANCE.getOperationCallControllerBinding();

		/**
		 * The meta object literal for the '<em><b>Create Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_CALL_CONTROLLER_BINDING__CREATE_RESULT = eINSTANCE.getOperationCallControllerBinding_CreateResult();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_CALL_CONTROLLER_BINDING__ACTIVE = eINSTANCE.getOperationCallControllerBinding_Active();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL_CONTROLLER_BINDING__TRIGGER = eINSTANCE.getOperationCallControllerBinding_Trigger();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION_CALL_CONTROLLER_BINDING___UPDATE = eINSTANCE.getOperationCallControllerBinding__Update();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.programs.controllers.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.programs.controllers.impl.TriggerImpl
		 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Operation Call Controller Binding</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__OPERATION_CALL_CONTROLLER_BINDING = eINSTANCE.getTrigger_OperationCallControllerBinding();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.programs.controllers.impl.TimeTriggerImpl <em>Time Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.programs.controllers.impl.TimeTriggerImpl
		 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getTimeTrigger()
		 * @generated
		 */
		EClass TIME_TRIGGER = eINSTANCE.getTimeTrigger();

		/**
		 * The meta object literal for the '<em><b>Refresh Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_TRIGGER__REFRESH_PERIOD = eINSTANCE.getTimeTrigger_RefreshPeriod();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.programs.controllers.impl.ControllerTriggerImpl <em>Controller Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.programs.controllers.impl.ControllerTriggerImpl
		 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getControllerTrigger()
		 * @generated
		 */
		EClass CONTROLLER_TRIGGER = eINSTANCE.getControllerTrigger();

		/**
		 * The meta object literal for the '<em><b>Component Qualifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_TRIGGER__COMPONENT_QUALIFIER = eINSTANCE.getControllerTrigger_ComponentQualifier();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.programs.controllers.impl.ControllerEdgeTriggerImpl <em>Controller Edge Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.programs.controllers.impl.ControllerEdgeTriggerImpl
		 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getControllerEdgeTrigger()
		 * @generated
		 */
		EClass CONTROLLER_EDGE_TRIGGER = eINSTANCE.getControllerEdgeTrigger();

		/**
		 * The meta object literal for the '<em><b>Edge Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_EDGE_TRIGGER__EDGE_TYPE = eINSTANCE.getControllerEdgeTrigger_EdgeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.programs.controllers.impl.ControllerStateTriggerImpl <em>Controller State Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.programs.controllers.impl.ControllerStateTriggerImpl
		 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getControllerStateTrigger()
		 * @generated
		 */
		EClass CONTROLLER_STATE_TRIGGER = eINSTANCE.getControllerStateTrigger();

		/**
		 * The meta object literal for the '<em><b>Enabling Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_STATE_TRIGGER__ENABLING_VALUE = eINSTANCE.getControllerStateTrigger_EnablingValue();

		/**
		 * The meta object literal for the '<em><b>Repeat Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_STATE_TRIGGER__REPEAT_PERIOD = eINSTANCE.getControllerStateTrigger_RepeatPeriod();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.programs.controllers.impl.BindedEDataTypeArgumentImpl <em>Binded EData Type Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.programs.controllers.impl.BindedEDataTypeArgumentImpl
		 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getBindedEDataTypeArgument()
		 * @generated
		 */
		EClass BINDED_EDATA_TYPE_ARGUMENT = eINSTANCE.getBindedEDataTypeArgument();

		/**
		 * The meta object literal for the '<em><b>Value Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE = eINSTANCE.getBindedEDataTypeArgument_ValueSource();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.programs.controllers.impl.ValueSourceImpl <em>Value Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.programs.controllers.impl.ValueSourceImpl
		 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getValueSource()
		 * @generated
		 */
		EClass VALUE_SOURCE = eINSTANCE.getValueSource();

		/**
		 * The meta object literal for the '<em><b>Binded EData Type Argument</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT = eINSTANCE.getValueSource_BindedEDataTypeArgument();

		/**
		 * The meta object literal for the '<em><b>Get Source Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_SOURCE___GET_SOURCE_VALUE = eINSTANCE.getValueSource__GetSourceValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.programs.controllers.impl.FixedValueSourceImpl <em>Fixed Value Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.programs.controllers.impl.FixedValueSourceImpl
		 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getFixedValueSource()
		 * @generated
		 */
		EClass FIXED_VALUE_SOURCE = eINSTANCE.getFixedValueSource();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.programs.controllers.impl.ToggleValueSourceImpl <em>Toggle Value Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.programs.controllers.impl.ToggleValueSourceImpl
		 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getToggleValueSource()
		 * @generated
		 */
		EClass TOGGLE_VALUE_SOURCE = eINSTANCE.getToggleValueSource();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOGGLE_VALUE_SOURCE__INITIAL_VALUE = eINSTANCE.getToggleValueSource_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Current Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOGGLE_VALUE_SOURCE__CURRENT_VALUE = eINSTANCE.getToggleValueSource_CurrentValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.programs.controllers.impl.ControllerValueSourceImpl <em>Controller Value Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.programs.controllers.impl.ControllerValueSourceImpl
		 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getControllerValueSource()
		 * @generated
		 */
		EClass CONTROLLER_VALUE_SOURCE = eINSTANCE.getControllerValueSource();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_VALUE_SOURCE__COMPONENT = eINSTANCE.getControllerValueSource_Component();

		/**
		 * The meta object literal for the '<em><b>EComponent Qualifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER = eINSTANCE.getControllerValueSource_EComponentQualifier();

		/**
		 * The meta object literal for the '<em><b>Conditioning</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_VALUE_SOURCE__CONDITIONING = eINSTANCE.getControllerValueSource_Conditioning();

		/**
		 * The meta object literal for the '<em><b>Last Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_VALUE_SOURCE__LAST_VALUE = eINSTANCE.getControllerValueSource_LastValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.programs.controllers.impl.AbstractInputConditioningImpl <em>Abstract Input Conditioning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.programs.controllers.impl.AbstractInputConditioningImpl
		 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getAbstractInputConditioning()
		 * @generated
		 */
		EClass ABSTRACT_INPUT_CONDITIONING = eINSTANCE.getAbstractInputConditioning();

		/**
		 * The meta object literal for the '<em><b>Condition Input</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_INPUT_CONDITIONING___CONDITION_INPUT__ECOMPONENT = eINSTANCE.getAbstractInputConditioning__ConditionInput__EComponent();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.programs.controllers.impl.LinearInputConditioningImpl <em>Linear Input Conditioning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.programs.controllers.impl.LinearInputConditioningImpl
		 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getLinearInputConditioning()
		 * @generated
		 */
		EClass LINEAR_INPUT_CONDITIONING = eINSTANCE.getLinearInputConditioning();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_INPUT_CONDITIONING__MINIMUM = eINSTANCE.getLinearInputConditioning_Minimum();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_INPUT_CONDITIONING__MAXIMUM = eINSTANCE.getLinearInputConditioning_Maximum();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.programs.controllers.impl.CenteredLinearInputConditioningImpl <em>Centered Linear Input Conditioning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.programs.controllers.impl.CenteredLinearInputConditioningImpl
		 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getCenteredLinearInputConditioning()
		 * @generated
		 */
		EClass CENTERED_LINEAR_INPUT_CONDITIONING = eINSTANCE.getCenteredLinearInputConditioning();

		/**
		 * The meta object literal for the '<em><b>Dead Band</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CENTERED_LINEAR_INPUT_CONDITIONING__DEAD_BAND = eINSTANCE.getCenteredLinearInputConditioning_DeadBand();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.programs.controllers.impl.ParabolicInputConditioningImpl <em>Parabolic Input Conditioning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.programs.controllers.impl.ParabolicInputConditioningImpl
		 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getParabolicInputConditioning()
		 * @generated
		 */
		EClass PARABOLIC_INPUT_CONDITIONING = eINSTANCE.getParabolicInputConditioning();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARABOLIC_INPUT_CONDITIONING__MINIMUM = eINSTANCE.getParabolicInputConditioning_Minimum();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARABOLIC_INPUT_CONDITIONING__MAXIMUM = eINSTANCE.getParabolicInputConditioning_Maximum();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.programs.controllers.impl.CenteredParabolicInputConditioningImpl <em>Centered Parabolic Input Conditioning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.programs.controllers.impl.CenteredParabolicInputConditioningImpl
		 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getCenteredParabolicInputConditioning()
		 * @generated
		 */
		EClass CENTERED_PARABOLIC_INPUT_CONDITIONING = eINSTANCE.getCenteredParabolicInputConditioning();

		/**
		 * The meta object literal for the '<em><b>Dead Band</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CENTERED_PARABOLIC_INPUT_CONDITIONING__DEAD_BAND = eINSTANCE.getCenteredParabolicInputConditioning_DeadBand();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.programs.controllers.impl.UserDefinedInputConditioningImpl <em>User Defined Input Conditioning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.programs.controllers.impl.UserDefinedInputConditioningImpl
		 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getUserDefinedInputConditioning()
		 * @generated
		 */
		EClass USER_DEFINED_INPUT_CONDITIONING = eINSTANCE.getUserDefinedInputConditioning();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DEFINED_INPUT_CONDITIONING__UNITS = eINSTANCE.getUserDefinedInputConditioning_Units();

		/**
		 * The meta object literal for the '<em><b>Transfer Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_DEFINED_INPUT_CONDITIONING__TRANSFER_FUNCTION = eINSTANCE.getUserDefinedInputConditioning_TransferFunction();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.programs.controllers.impl.CustomInputConditioningPointImpl <em>Custom Input Conditioning Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.programs.controllers.impl.CustomInputConditioningPointImpl
		 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getCustomInputConditioningPoint()
		 * @generated
		 */
		EClass CUSTOM_INPUT_CONDITIONING_POINT = eINSTANCE.getCustomInputConditioningPoint();

		/**
		 * The meta object literal for the '<em><b>Input Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_INPUT_CONDITIONING_POINT__INPUT_VALUE = eINSTANCE.getCustomInputConditioningPoint_InputValue();

		/**
		 * The meta object literal for the '<em><b>Output Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_INPUT_CONDITIONING_POINT__OUTPUT_VALUE = eINSTANCE.getCustomInputConditioningPoint_OutputValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.programs.controllers.EdgeType <em>Edge Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.programs.controllers.EdgeType
		 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getEdgeType()
		 * @generated
		 */
		EEnum EDGE_TYPE = eINSTANCE.getEdgeType();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em>Tree Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.TreeSet
		 * @see org.eclipse.symphony.core.programs.controllers.impl.EMFEcoreControllersPackageImpl#getTreeSet()
		 * @generated
		 */
		EDataType TREE_SET = eINSTANCE.getTreeSet();

	}

} //EMFEcoreControllersPackage
