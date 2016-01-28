/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.io.jinput;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.eclipse.symphony.common.io.jinput.Symphony__CommonIOJInputFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Symphony__CommonIOJInput' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)' modelName='Symphony__CommonIOJInput' suppressGenModelAnnotations='false' modelDirectory='/org.eclipse.symphony.common.io.jinput/src-generated' editDirectory='/org.eclipse.symphony.common.io.jinput.edit/src-generated' basePackage='org.eclipse.symphony.common.io'"
 * @generated
 */
public interface Symphony__CommonIOJInputPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jinput";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.symphony.common.io.jinput";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jinput";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__CommonIOJInputPackage eINSTANCE = org.eclipse.symphony.common.io.jinput.impl.Symphony__CommonIOJInputPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.io.jinput.impl.EControllerImpl <em>EController</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.io.jinput.impl.EControllerImpl
	 * @see org.eclipse.symphony.common.io.jinput.impl.Symphony__CommonIOJInputPackageImpl#getEController()
	 * @generated
	 */
	int ECONTROLLER = 0;

	/**
	 * The feature id for the '<em><b>Last Poll Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROLLER__LAST_POLL_RESULT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROLLER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROLLER__PORT_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROLLER__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROLLER__PORT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Pojo Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROLLER__POJO_CONTROLLER = 5;

	/**
	 * The feature id for the '<em><b>EComponents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROLLER__ECOMPONENTS = 6;

	/**
	 * The feature id for the '<em><b>Controller Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROLLER__CONTROLLER_COUNT = 7;

	/**
	 * The number of structural features of the '<em>EController</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROLLER_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Poll</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROLLER___POLL = 0;

	/**
	 * The number of operations of the '<em>EController</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROLLER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.io.jinput.impl.EControllerEnvironmentImpl <em>EController Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.io.jinput.impl.EControllerEnvironmentImpl
	 * @see org.eclipse.symphony.common.io.jinput.impl.Symphony__CommonIOJInputPackageImpl#getEControllerEnvironment()
	 * @generated
	 */
	int ECONTROLLER_ENVIRONMENT = 1;

	/**
	 * The feature id for the '<em><b>Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROLLER_ENVIRONMENT__SUPPORTED = 0;

	/**
	 * The feature id for the '<em><b>Controllers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROLLER_ENVIRONMENT__CONTROLLERS = 1;

	/**
	 * The feature id for the '<em><b>Refresh Requested</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROLLER_ENVIRONMENT__REFRESH_REQUESTED = 2;

	/**
	 * The feature id for the '<em><b>Polling Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROLLER_ENVIRONMENT__POLLING_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Polling Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROLLER_ENVIRONMENT__POLLING_JOB = 4;

	/**
	 * The feature id for the '<em><b>Polling Problem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROLLER_ENVIRONMENT__POLLING_PROBLEM = 5;

	/**
	 * The number of structural features of the '<em>EController Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROLLER_ENVIRONMENT_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROLLER_ENVIRONMENT___REFRESH = 0;

	/**
	 * The operation id for the '<em>Start Polling</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROLLER_ENVIRONMENT___START_POLLING = 1;

	/**
	 * The operation id for the '<em>Stop Polling</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROLLER_ENVIRONMENT___STOP_POLLING = 2;

	/**
	 * The operation id for the '<em>Resolve Controller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROLLER_ENVIRONMENT___RESOLVE_CONTROLLER__STRING = 3;

	/**
	 * The operation id for the '<em>Resolve EComponent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROLLER_ENVIRONMENT___RESOLVE_ECOMPONENT__STRING_ECONTROLLER = 4;

	/**
	 * The operation id for the '<em>Resolve EComponent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROLLER_ENVIRONMENT___RESOLVE_ECOMPONENT__ECOMPONENTQUALIFIER = 5;

	/**
	 * The number of operations of the '<em>EController Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROLLER_ENVIRONMENT_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.io.jinput.impl.EComponentImpl <em>EComponent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.io.jinput.impl.EComponentImpl
	 * @see org.eclipse.symphony.common.io.jinput.impl.Symphony__CommonIOJInputPackageImpl#getEComponent()
	 * @generated
	 */
	int ECOMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Dead Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENT__DEAD_ZONE = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENT__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENT__RELATIVE = 2;

	/**
	 * The feature id for the '<em><b>Analog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENT__ANALOG = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENT__NAME = 4;

	/**
	 * The feature id for the '<em><b>Pojo Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENT__POJO_COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Poll Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENT__POLL_DATA = 6;

	/**
	 * The feature id for the '<em><b>EComponents</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENT__ECOMPONENTS = 7;

	/**
	 * The number of structural features of the '<em>EComponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>EComponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.io.jinput.impl.EComponentsImpl <em>EComponents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.io.jinput.impl.EComponentsImpl
	 * @see org.eclipse.symphony.common.io.jinput.impl.Symphony__CommonIOJInputPackageImpl#getEComponents()
	 * @generated
	 */
	int ECOMPONENTS = 3;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENTS__COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENTS__NAME = 1;

	/**
	 * The feature id for the '<em><b>EController</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENTS__ECONTROLLER = 2;

	/**
	 * The number of structural features of the '<em>EComponents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENTS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>EComponents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.io.jinput.impl.EButtonImpl <em>EButton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.io.jinput.impl.EButtonImpl
	 * @see org.eclipse.symphony.common.io.jinput.impl.Symphony__CommonIOJInputPackageImpl#getEButton()
	 * @generated
	 */
	int EBUTTON = 4;

	/**
	 * The feature id for the '<em><b>Dead Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON__DEAD_ZONE = ECOMPONENT__DEAD_ZONE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON__IDENTIFIER = ECOMPONENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON__RELATIVE = ECOMPONENT__RELATIVE;

	/**
	 * The feature id for the '<em><b>Analog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON__ANALOG = ECOMPONENT__ANALOG;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON__NAME = ECOMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Pojo Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON__POJO_COMPONENT = ECOMPONENT__POJO_COMPONENT;

	/**
	 * The feature id for the '<em><b>Poll Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON__POLL_DATA = ECOMPONENT__POLL_DATA;

	/**
	 * The feature id for the '<em><b>EComponents</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON__ECOMPONENTS = ECOMPONENT__ECOMPONENTS;

	/**
	 * The number of structural features of the '<em>EButton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON_FEATURE_COUNT = ECOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EButton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON_OPERATION_COUNT = ECOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.io.jinput.impl.EAxisImpl <em>EAxis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.io.jinput.impl.EAxisImpl
	 * @see org.eclipse.symphony.common.io.jinput.impl.Symphony__CommonIOJInputPackageImpl#getEAxis()
	 * @generated
	 */
	int EAXIS = 5;

	/**
	 * The feature id for the '<em><b>Dead Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXIS__DEAD_ZONE = ECOMPONENT__DEAD_ZONE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXIS__IDENTIFIER = ECOMPONENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXIS__RELATIVE = ECOMPONENT__RELATIVE;

	/**
	 * The feature id for the '<em><b>Analog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXIS__ANALOG = ECOMPONENT__ANALOG;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXIS__NAME = ECOMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Pojo Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXIS__POJO_COMPONENT = ECOMPONENT__POJO_COMPONENT;

	/**
	 * The feature id for the '<em><b>Poll Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXIS__POLL_DATA = ECOMPONENT__POLL_DATA;

	/**
	 * The feature id for the '<em><b>EComponents</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXIS__ECOMPONENTS = ECOMPONENT__ECOMPONENTS;

	/**
	 * The number of structural features of the '<em>EAxis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXIS_FEATURE_COUNT = ECOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EAxis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXIS_OPERATION_COUNT = ECOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.io.jinput.impl.EKeyImpl <em>EKey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.io.jinput.impl.EKeyImpl
	 * @see org.eclipse.symphony.common.io.jinput.impl.Symphony__CommonIOJInputPackageImpl#getEKey()
	 * @generated
	 */
	int EKEY = 6;

	/**
	 * The feature id for the '<em><b>Dead Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EKEY__DEAD_ZONE = ECOMPONENT__DEAD_ZONE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EKEY__IDENTIFIER = ECOMPONENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EKEY__RELATIVE = ECOMPONENT__RELATIVE;

	/**
	 * The feature id for the '<em><b>Analog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EKEY__ANALOG = ECOMPONENT__ANALOG;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EKEY__NAME = ECOMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Pojo Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EKEY__POJO_COMPONENT = ECOMPONENT__POJO_COMPONENT;

	/**
	 * The feature id for the '<em><b>Poll Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EKEY__POLL_DATA = ECOMPONENT__POLL_DATA;

	/**
	 * The feature id for the '<em><b>EComponents</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EKEY__ECOMPONENTS = ECOMPONENT__ECOMPONENTS;

	/**
	 * The number of structural features of the '<em>EKey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EKEY_FEATURE_COUNT = ECOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EKey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EKEY_OPERATION_COUNT = ECOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.io.jinput.impl.EComponentQualifierImpl <em>EComponent Qualifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.io.jinput.impl.EComponentQualifierImpl
	 * @see org.eclipse.symphony.common.io.jinput.impl.Symphony__CommonIOJInputPackageImpl#getEComponentQualifier()
	 * @generated
	 */
	int ECOMPONENT_QUALIFIER = 7;

	/**
	 * The feature id for the '<em><b>EComponent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENT_QUALIFIER__ECOMPONENT_NAME = 0;

	/**
	 * The feature id for the '<em><b>EController Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENT_QUALIFIER__ECONTROLLER_NAME = 1;

	/**
	 * The number of structural features of the '<em>EComponent Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENT_QUALIFIER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EComponent Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENT_QUALIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.io.jinput.impl.EVirtualComponentImpl <em>EVirtual Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.io.jinput.impl.EVirtualComponentImpl
	 * @see org.eclipse.symphony.common.io.jinput.impl.Symphony__CommonIOJInputPackageImpl#getEVirtualComponent()
	 * @generated
	 */
	int EVIRTUAL_COMPONENT = 8;

	/**
	 * The feature id for the '<em><b>Dead Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIRTUAL_COMPONENT__DEAD_ZONE = ECOMPONENT__DEAD_ZONE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIRTUAL_COMPONENT__IDENTIFIER = ECOMPONENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIRTUAL_COMPONENT__RELATIVE = ECOMPONENT__RELATIVE;

	/**
	 * The feature id for the '<em><b>Analog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIRTUAL_COMPONENT__ANALOG = ECOMPONENT__ANALOG;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIRTUAL_COMPONENT__NAME = ECOMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Pojo Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIRTUAL_COMPONENT__POJO_COMPONENT = ECOMPONENT__POJO_COMPONENT;

	/**
	 * The feature id for the '<em><b>Poll Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIRTUAL_COMPONENT__POLL_DATA = ECOMPONENT__POLL_DATA;

	/**
	 * The feature id for the '<em><b>EComponents</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIRTUAL_COMPONENT__ECOMPONENTS = ECOMPONENT__ECOMPONENTS;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIRTUAL_COMPONENT__CURRENT_VALUE = ECOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EVirtual Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIRTUAL_COMPONENT_FEATURE_COUNT = ECOMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EVirtual Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIRTUAL_COMPONENT_OPERATION_COUNT = ECOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Job</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.jobs.Job
	 * @see org.eclipse.symphony.common.io.jinput.impl.Symphony__CommonIOJInputPackageImpl#getJob()
	 * @generated
	 */
	int JOB = 9;

	/**
	 * The meta object id for the '<em>Component</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.java.games.input.Component
	 * @see org.eclipse.symphony.common.io.jinput.impl.Symphony__CommonIOJInputPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 10;

	/**
	 * The meta object id for the '<em>Controller</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.java.games.input.Controller
	 * @see org.eclipse.symphony.common.io.jinput.impl.Symphony__CommonIOJInputPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 11;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.io.jinput.EController <em>EController</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EController</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EController
	 * @generated
	 */
	EClass getEController();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.io.jinput.EController#isLastPollResult <em>Last Poll Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Poll Result</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EController#isLastPollResult()
	 * @see #getEController()
	 * @generated
	 */
	EAttribute getEController_LastPollResult();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.io.jinput.EController#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EController#getName()
	 * @see #getEController()
	 * @generated
	 */
	EAttribute getEController_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.io.jinput.EController#getPortNumber <em>Port Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Number</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EController#getPortNumber()
	 * @see #getEController()
	 * @generated
	 */
	EAttribute getEController_PortNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.io.jinput.EController#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EController#getType()
	 * @see #getEController()
	 * @generated
	 */
	EAttribute getEController_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.io.jinput.EController#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Type</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EController#getPortType()
	 * @see #getEController()
	 * @generated
	 */
	EAttribute getEController_PortType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.io.jinput.EController#getPojoController <em>Pojo Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pojo Controller</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EController#getPojoController()
	 * @see #getEController()
	 * @generated
	 */
	EAttribute getEController_PojoController();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.common.io.jinput.EController#getEComponents <em>EComponents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EComponents</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EController#getEComponents()
	 * @see #getEController()
	 * @generated
	 */
	EReference getEController_EComponents();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.io.jinput.EController#getControllerCount <em>Controller Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controller Count</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EController#getControllerCount()
	 * @see #getEController()
	 * @generated
	 */
	EAttribute getEController_ControllerCount();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.io.jinput.EController#poll() <em>Poll</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Poll</em>' operation.
	 * @see org.eclipse.symphony.common.io.jinput.EController#poll()
	 * @generated
	 */
	EOperation getEController__Poll();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.io.jinput.EControllerEnvironment <em>EController Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EController Environment</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EControllerEnvironment
	 * @generated
	 */
	EClass getEControllerEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.io.jinput.EControllerEnvironment#isSupported <em>Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supported</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EControllerEnvironment#isSupported()
	 * @see #getEControllerEnvironment()
	 * @generated
	 */
	EAttribute getEControllerEnvironment_Supported();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.common.io.jinput.EControllerEnvironment#getControllers <em>Controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controllers</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EControllerEnvironment#getControllers()
	 * @see #getEControllerEnvironment()
	 * @generated
	 */
	EReference getEControllerEnvironment_Controllers();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.io.jinput.EControllerEnvironment#isRefreshRequested <em>Refresh Requested</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh Requested</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EControllerEnvironment#isRefreshRequested()
	 * @see #getEControllerEnvironment()
	 * @generated
	 */
	EAttribute getEControllerEnvironment_RefreshRequested();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.io.jinput.EControllerEnvironment#getPollingCount <em>Polling Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Polling Count</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EControllerEnvironment#getPollingCount()
	 * @see #getEControllerEnvironment()
	 * @generated
	 */
	EAttribute getEControllerEnvironment_PollingCount();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.io.jinput.EControllerEnvironment#getPollingJob <em>Polling Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Polling Job</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EControllerEnvironment#getPollingJob()
	 * @see #getEControllerEnvironment()
	 * @generated
	 */
	EAttribute getEControllerEnvironment_PollingJob();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.io.jinput.EControllerEnvironment#isPollingProblem <em>Polling Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Polling Problem</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EControllerEnvironment#isPollingProblem()
	 * @see #getEControllerEnvironment()
	 * @generated
	 */
	EAttribute getEControllerEnvironment_PollingProblem();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.io.jinput.EControllerEnvironment#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see org.eclipse.symphony.common.io.jinput.EControllerEnvironment#refresh()
	 * @generated
	 */
	EOperation getEControllerEnvironment__Refresh();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.io.jinput.EControllerEnvironment#startPolling() <em>Start Polling</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start Polling</em>' operation.
	 * @see org.eclipse.symphony.common.io.jinput.EControllerEnvironment#startPolling()
	 * @generated
	 */
	EOperation getEControllerEnvironment__StartPolling();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.io.jinput.EControllerEnvironment#stopPolling() <em>Stop Polling</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop Polling</em>' operation.
	 * @see org.eclipse.symphony.common.io.jinput.EControllerEnvironment#stopPolling()
	 * @generated
	 */
	EOperation getEControllerEnvironment__StopPolling();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.io.jinput.EControllerEnvironment#resolveController(java.lang.String) <em>Resolve Controller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Controller</em>' operation.
	 * @see org.eclipse.symphony.common.io.jinput.EControllerEnvironment#resolveController(java.lang.String)
	 * @generated
	 */
	EOperation getEControllerEnvironment__ResolveController__String();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.io.jinput.EControllerEnvironment#resolveEComponent(java.lang.String, org.eclipse.symphony.common.io.jinput.EController) <em>Resolve EComponent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve EComponent</em>' operation.
	 * @see org.eclipse.symphony.common.io.jinput.EControllerEnvironment#resolveEComponent(java.lang.String, org.eclipse.symphony.common.io.jinput.EController)
	 * @generated
	 */
	EOperation getEControllerEnvironment__ResolveEComponent__String_EController();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.io.jinput.EControllerEnvironment#resolveEComponent(org.eclipse.symphony.common.io.jinput.EComponentQualifier) <em>Resolve EComponent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve EComponent</em>' operation.
	 * @see org.eclipse.symphony.common.io.jinput.EControllerEnvironment#resolveEComponent(org.eclipse.symphony.common.io.jinput.EComponentQualifier)
	 * @generated
	 */
	EOperation getEControllerEnvironment__ResolveEComponent__EComponentQualifier();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.io.jinput.EComponent <em>EComponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EComponent</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EComponent
	 * @generated
	 */
	EClass getEComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.io.jinput.EComponent#getDeadZone <em>Dead Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dead Zone</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EComponent#getDeadZone()
	 * @see #getEComponent()
	 * @generated
	 */
	EAttribute getEComponent_DeadZone();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.io.jinput.EComponent#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EComponent#getIdentifier()
	 * @see #getEComponent()
	 * @generated
	 */
	EAttribute getEComponent_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.io.jinput.EComponent#isRelative <em>Relative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EComponent#isRelative()
	 * @see #getEComponent()
	 * @generated
	 */
	EAttribute getEComponent_Relative();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.io.jinput.EComponent#isAnalog <em>Analog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Analog</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EComponent#isAnalog()
	 * @see #getEComponent()
	 * @generated
	 */
	EAttribute getEComponent_Analog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.io.jinput.EComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EComponent#getName()
	 * @see #getEComponent()
	 * @generated
	 */
	EAttribute getEComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.io.jinput.EComponent#getPojoComponent <em>Pojo Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pojo Component</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EComponent#getPojoComponent()
	 * @see #getEComponent()
	 * @generated
	 */
	EAttribute getEComponent_PojoComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.io.jinput.EComponent#getPollData <em>Poll Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Poll Data</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EComponent#getPollData()
	 * @see #getEComponent()
	 * @generated
	 */
	EAttribute getEComponent_PollData();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.common.io.jinput.EComponent#getEComponents <em>EComponents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EComponents</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EComponent#getEComponents()
	 * @see #getEComponent()
	 * @generated
	 */
	EReference getEComponent_EComponents();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.io.jinput.EComponents <em>EComponents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EComponents</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EComponents
	 * @generated
	 */
	EClass getEComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.common.io.jinput.EComponents#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EComponents#getComponents()
	 * @see #getEComponents()
	 * @generated
	 */
	EReference getEComponents_Components();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.io.jinput.EComponents#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EComponents#getName()
	 * @see #getEComponents()
	 * @generated
	 */
	EAttribute getEComponents_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.common.io.jinput.EComponents#getEController <em>EController</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EController</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EComponents#getEController()
	 * @see #getEComponents()
	 * @generated
	 */
	EReference getEComponents_EController();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.io.jinput.EButton <em>EButton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EButton</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EButton
	 * @generated
	 */
	EClass getEButton();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.io.jinput.EAxis <em>EAxis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAxis</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EAxis
	 * @generated
	 */
	EClass getEAxis();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.io.jinput.EKey <em>EKey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EKey</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EKey
	 * @generated
	 */
	EClass getEKey();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.io.jinput.EComponentQualifier <em>EComponent Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EComponent Qualifier</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EComponentQualifier
	 * @generated
	 */
	EClass getEComponentQualifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.io.jinput.EComponentQualifier#getEComponentName <em>EComponent Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EComponent Name</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EComponentQualifier#getEComponentName()
	 * @see #getEComponentQualifier()
	 * @generated
	 */
	EAttribute getEComponentQualifier_EComponentName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.io.jinput.EComponentQualifier#getEControllerName <em>EController Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EController Name</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EComponentQualifier#getEControllerName()
	 * @see #getEComponentQualifier()
	 * @generated
	 */
	EAttribute getEComponentQualifier_EControllerName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.io.jinput.EVirtualComponent <em>EVirtual Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EVirtual Component</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EVirtualComponent
	 * @generated
	 */
	EClass getEVirtualComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.io.jinput.EVirtualComponent#getCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Value</em>'.
	 * @see org.eclipse.symphony.common.io.jinput.EVirtualComponent#getCurrentValue()
	 * @see #getEVirtualComponent()
	 * @generated
	 */
	EAttribute getEVirtualComponent_CurrentValue();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.jobs.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Job</em>'.
	 * @see org.eclipse.core.runtime.jobs.Job
	 * @model instanceClass="org.eclipse.core.runtime.jobs.Job"
	 * @generated
	 */
	EDataType getJob();

	/**
	 * Returns the meta object for data type '{@link net.java.games.input.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Component</em>'.
	 * @see net.java.games.input.Component
	 * @model instanceClass="net.java.games.input.Component"
	 * @generated
	 */
	EDataType getComponent();

	/**
	 * Returns the meta object for data type '{@link net.java.games.input.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Controller</em>'.
	 * @see net.java.games.input.Controller
	 * @model instanceClass="net.java.games.input.Controller"
	 * @generated
	 */
	EDataType getController();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Symphony__CommonIOJInputFactory getSymphony__CommonIOJInputFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.common.io.jinput.impl.EControllerImpl <em>EController</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.io.jinput.impl.EControllerImpl
		 * @see org.eclipse.symphony.common.io.jinput.impl.Symphony__CommonIOJInputPackageImpl#getEController()
		 * @generated
		 */
		EClass ECONTROLLER = eINSTANCE.getEController();

		/**
		 * The meta object literal for the '<em><b>Last Poll Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONTROLLER__LAST_POLL_RESULT = eINSTANCE.getEController_LastPollResult();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONTROLLER__NAME = eINSTANCE.getEController_Name();

		/**
		 * The meta object literal for the '<em><b>Port Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONTROLLER__PORT_NUMBER = eINSTANCE.getEController_PortNumber();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONTROLLER__TYPE = eINSTANCE.getEController_Type();

		/**
		 * The meta object literal for the '<em><b>Port Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONTROLLER__PORT_TYPE = eINSTANCE.getEController_PortType();

		/**
		 * The meta object literal for the '<em><b>Pojo Controller</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONTROLLER__POJO_CONTROLLER = eINSTANCE.getEController_PojoController();

		/**
		 * The meta object literal for the '<em><b>EComponents</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECONTROLLER__ECOMPONENTS = eINSTANCE.getEController_EComponents();

		/**
		 * The meta object literal for the '<em><b>Controller Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONTROLLER__CONTROLLER_COUNT = eINSTANCE.getEController_ControllerCount();

		/**
		 * The meta object literal for the '<em><b>Poll</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTROLLER___POLL = eINSTANCE.getEController__Poll();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.io.jinput.impl.EControllerEnvironmentImpl <em>EController Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.io.jinput.impl.EControllerEnvironmentImpl
		 * @see org.eclipse.symphony.common.io.jinput.impl.Symphony__CommonIOJInputPackageImpl#getEControllerEnvironment()
		 * @generated
		 */
		EClass ECONTROLLER_ENVIRONMENT = eINSTANCE.getEControllerEnvironment();

		/**
		 * The meta object literal for the '<em><b>Supported</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONTROLLER_ENVIRONMENT__SUPPORTED = eINSTANCE.getEControllerEnvironment_Supported();

		/**
		 * The meta object literal for the '<em><b>Controllers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECONTROLLER_ENVIRONMENT__CONTROLLERS = eINSTANCE.getEControllerEnvironment_Controllers();

		/**
		 * The meta object literal for the '<em><b>Refresh Requested</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONTROLLER_ENVIRONMENT__REFRESH_REQUESTED = eINSTANCE.getEControllerEnvironment_RefreshRequested();

		/**
		 * The meta object literal for the '<em><b>Polling Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONTROLLER_ENVIRONMENT__POLLING_COUNT = eINSTANCE.getEControllerEnvironment_PollingCount();

		/**
		 * The meta object literal for the '<em><b>Polling Job</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONTROLLER_ENVIRONMENT__POLLING_JOB = eINSTANCE.getEControllerEnvironment_PollingJob();

		/**
		 * The meta object literal for the '<em><b>Polling Problem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONTROLLER_ENVIRONMENT__POLLING_PROBLEM = eINSTANCE.getEControllerEnvironment_PollingProblem();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTROLLER_ENVIRONMENT___REFRESH = eINSTANCE.getEControllerEnvironment__Refresh();

		/**
		 * The meta object literal for the '<em><b>Start Polling</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTROLLER_ENVIRONMENT___START_POLLING = eINSTANCE.getEControllerEnvironment__StartPolling();

		/**
		 * The meta object literal for the '<em><b>Stop Polling</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTROLLER_ENVIRONMENT___STOP_POLLING = eINSTANCE.getEControllerEnvironment__StopPolling();

		/**
		 * The meta object literal for the '<em><b>Resolve Controller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTROLLER_ENVIRONMENT___RESOLVE_CONTROLLER__STRING = eINSTANCE.getEControllerEnvironment__ResolveController__String();

		/**
		 * The meta object literal for the '<em><b>Resolve EComponent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTROLLER_ENVIRONMENT___RESOLVE_ECOMPONENT__STRING_ECONTROLLER = eINSTANCE.getEControllerEnvironment__ResolveEComponent__String_EController();

		/**
		 * The meta object literal for the '<em><b>Resolve EComponent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECONTROLLER_ENVIRONMENT___RESOLVE_ECOMPONENT__ECOMPONENTQUALIFIER = eINSTANCE.getEControllerEnvironment__ResolveEComponent__EComponentQualifier();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.io.jinput.impl.EComponentImpl <em>EComponent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.io.jinput.impl.EComponentImpl
		 * @see org.eclipse.symphony.common.io.jinput.impl.Symphony__CommonIOJInputPackageImpl#getEComponent()
		 * @generated
		 */
		EClass ECOMPONENT = eINSTANCE.getEComponent();

		/**
		 * The meta object literal for the '<em><b>Dead Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOMPONENT__DEAD_ZONE = eINSTANCE.getEComponent_DeadZone();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOMPONENT__IDENTIFIER = eINSTANCE.getEComponent_Identifier();

		/**
		 * The meta object literal for the '<em><b>Relative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOMPONENT__RELATIVE = eINSTANCE.getEComponent_Relative();

		/**
		 * The meta object literal for the '<em><b>Analog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOMPONENT__ANALOG = eINSTANCE.getEComponent_Analog();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOMPONENT__NAME = eINSTANCE.getEComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Pojo Component</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOMPONENT__POJO_COMPONENT = eINSTANCE.getEComponent_PojoComponent();

		/**
		 * The meta object literal for the '<em><b>Poll Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOMPONENT__POLL_DATA = eINSTANCE.getEComponent_PollData();

		/**
		 * The meta object literal for the '<em><b>EComponents</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOMPONENT__ECOMPONENTS = eINSTANCE.getEComponent_EComponents();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.io.jinput.impl.EComponentsImpl <em>EComponents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.io.jinput.impl.EComponentsImpl
		 * @see org.eclipse.symphony.common.io.jinput.impl.Symphony__CommonIOJInputPackageImpl#getEComponents()
		 * @generated
		 */
		EClass ECOMPONENTS = eINSTANCE.getEComponents();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOMPONENTS__COMPONENTS = eINSTANCE.getEComponents_Components();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOMPONENTS__NAME = eINSTANCE.getEComponents_Name();

		/**
		 * The meta object literal for the '<em><b>EController</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOMPONENTS__ECONTROLLER = eINSTANCE.getEComponents_EController();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.io.jinput.impl.EButtonImpl <em>EButton</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.io.jinput.impl.EButtonImpl
		 * @see org.eclipse.symphony.common.io.jinput.impl.Symphony__CommonIOJInputPackageImpl#getEButton()
		 * @generated
		 */
		EClass EBUTTON = eINSTANCE.getEButton();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.io.jinput.impl.EAxisImpl <em>EAxis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.io.jinput.impl.EAxisImpl
		 * @see org.eclipse.symphony.common.io.jinput.impl.Symphony__CommonIOJInputPackageImpl#getEAxis()
		 * @generated
		 */
		EClass EAXIS = eINSTANCE.getEAxis();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.io.jinput.impl.EKeyImpl <em>EKey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.io.jinput.impl.EKeyImpl
		 * @see org.eclipse.symphony.common.io.jinput.impl.Symphony__CommonIOJInputPackageImpl#getEKey()
		 * @generated
		 */
		EClass EKEY = eINSTANCE.getEKey();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.io.jinput.impl.EComponentQualifierImpl <em>EComponent Qualifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.io.jinput.impl.EComponentQualifierImpl
		 * @see org.eclipse.symphony.common.io.jinput.impl.Symphony__CommonIOJInputPackageImpl#getEComponentQualifier()
		 * @generated
		 */
		EClass ECOMPONENT_QUALIFIER = eINSTANCE.getEComponentQualifier();

		/**
		 * The meta object literal for the '<em><b>EComponent Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOMPONENT_QUALIFIER__ECOMPONENT_NAME = eINSTANCE.getEComponentQualifier_EComponentName();

		/**
		 * The meta object literal for the '<em><b>EController Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOMPONENT_QUALIFIER__ECONTROLLER_NAME = eINSTANCE.getEComponentQualifier_EControllerName();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.io.jinput.impl.EVirtualComponentImpl <em>EVirtual Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.io.jinput.impl.EVirtualComponentImpl
		 * @see org.eclipse.symphony.common.io.jinput.impl.Symphony__CommonIOJInputPackageImpl#getEVirtualComponent()
		 * @generated
		 */
		EClass EVIRTUAL_COMPONENT = eINSTANCE.getEVirtualComponent();

		/**
		 * The meta object literal for the '<em><b>Current Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVIRTUAL_COMPONENT__CURRENT_VALUE = eINSTANCE.getEVirtualComponent_CurrentValue();

		/**
		 * The meta object literal for the '<em>Job</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.jobs.Job
		 * @see org.eclipse.symphony.common.io.jinput.impl.Symphony__CommonIOJInputPackageImpl#getJob()
		 * @generated
		 */
		EDataType JOB = eINSTANCE.getJob();

		/**
		 * The meta object literal for the '<em>Component</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.java.games.input.Component
		 * @see org.eclipse.symphony.common.io.jinput.impl.Symphony__CommonIOJInputPackageImpl#getComponent()
		 * @generated
		 */
		EDataType COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em>Controller</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.java.games.input.Controller
		 * @see org.eclipse.symphony.common.io.jinput.impl.Symphony__CommonIOJInputPackageImpl#getController()
		 * @generated
		 */
		EDataType CONTROLLER = eINSTANCE.getController();

	}

} //Symphony__CommonIOJInputPackage
