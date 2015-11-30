/**
 */
package org.eclipse.symphony.common.emf;

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
 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Symphony__CommonEMF' childCreationExtenders='true' extensibleProviderFactory='true' modelName='Symphony__CommonEMF' modelDirectory='/org.eclipse.symphony.common.emf/src-generated' editDirectory='/org.eclipse.symphony.common.emf.edit/src-generated' basePackage='org.eclipse.symphony.common'"
 * @generated
 */
public interface Symphony__CommonEMFPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "emf";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "org.eclipse.symphony.common.emf";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "emf";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  Symphony__CommonEMFPackage eINSTANCE = org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFFacadeImpl
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getSymphony__CommonEMFFacade()
	 * @generated
	 */
	int SYMPHONY_COMMON_EMF_FACADE = 0;

		/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE_FEATURE_COUNT = 0;

		/**
	 * The operation id for the '<em>Get All Available EClasses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___GET_ALL_AVAILABLE_ECLASSES = 0;

		/**
	 * The operation id for the '<em>Get All Sub EClasses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___GET_ALL_SUB_ECLASSES__ECLASS = 1;

		/**
	 * The operation id for the '<em>Filter EClasses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___FILTER_ECLASSES__LIST_ECLASSFILTER = 2;

		/**
	 * The operation id for the '<em>Filter EClasses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___FILTER_ECLASSES__LIST_LIST = 3;

		/**
	 * The operation id for the '<em>Get EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___GET_ECLASS__STRING = 4;

		/**
	 * The operation id for the '<em>Sort Alphabetically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___SORT_ALPHABETICALLY__LIST = 5;

		/**
	 * The operation id for the '<em>Get All Available EOperations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___GET_ALL_AVAILABLE_EOPERATIONS__ECLASS = 6;

		/**
	 * The operation id for the '<em>Sort EOperations Alphabetically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___SORT_EOPERATIONS_ALPHABETICALLY__LIST = 7;

		/**
	 * The operation id for the '<em>Get Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___GET_DOCUMENTATION__ETYPEDELEMENT = 8;

		/**
	 * The operation id for the '<em>Get Engineering Units As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___GET_ENGINEERING_UNITS_AS_STRING__ETYPEDELEMENT = 9;

		/**
	 * The operation id for the '<em>Get Engineering Units</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___GET_ENGINEERING_UNITS__ETYPEDELEMENT = 10;

		/**
	 * The operation id for the '<em>Get Value Update Rate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___GET_VALUE_UPDATE_RATE__ETYPEDELEMENT = 11;

		/**
	 * The operation id for the '<em>Get Warning OCL Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___GET_WARNING_OCL_EXPRESSION__ETYPEDELEMENT = 12;

		/**
	 * The operation id for the '<em>Get Alarm OCL Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___GET_ALARM_OCL_EXPRESSION__ETYPEDELEMENT = 13;

		/**
	 * The operation id for the '<em>Get Out Of Range OCL Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___GET_OUT_OF_RANGE_OCL_EXPRESSION__ETYPEDELEMENT = 14;

		/**
	 * The operation id for the '<em>Get Warning Min Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___GET_WARNING_MIN_VALUE__ETYPEDELEMENT = 15;

		/**
	 * The operation id for the '<em>Get Warning Max Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___GET_WARNING_MAX_VALUE__ETYPEDELEMENT = 16;

		/**
	 * The operation id for the '<em>Get Alarm Min Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___GET_ALARM_MIN_VALUE__ETYPEDELEMENT = 17;

		/**
	 * The operation id for the '<em>Get Alarm Max Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___GET_ALARM_MAX_VALUE__ETYPEDELEMENT = 18;

		/**
	 * The operation id for the '<em>Get Out Of Range Min Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___GET_OUT_OF_RANGE_MIN_VALUE__ETYPEDELEMENT = 19;

		/**
	 * The operation id for the '<em>Get Out Of Range Max Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___GET_OUT_OF_RANGE_MAX_VALUE__ETYPEDELEMENT = 20;

		/**
	 * The operation id for the '<em>Get Range</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___GET_RANGE__ETYPEDELEMENT_OBJECT = 21;

		/**
	 * The operation id for the '<em>Get Full Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___GET_FULL_DESCRIPTION__ETYPEDELEMENT = 22;

		/**
	 * The operation id for the '<em>Get Ancestries String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___GET_ANCESTRIES_STRING__ABSTRACTFEATURENODE = 23;

		/**
	 * The operation id for the '<em>Get Feature Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___GET_FEATURE_ROOT__ABSTRACTFEATURENODE = 24;

		/**
	 * The operation id for the '<em>Get Ancestries</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___GET_ANCESTRIES__ABSTRACTFEATURENODE = 25;

		/**
	 * The operation id for the '<em>Get Descendants</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___GET_DESCENDANTS__ABSTRACTFEATURENODE = 26;

		/**
	 * The operation id for the '<em>Get Child EStructural Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___GET_CHILD_ESTRUCTURAL_FEATURES__ABSTRACTFEATURENODE = 27;

		/**
	 * The operation id for the '<em>Resolve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___RESOLVE__EOBJECT_ABSTRACTFEATURENODE = 28;

		/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___SET_VALUE__EOBJECT_ABSTRACTFEATURENODE_OBJECT = 29;

		/**
	 * The operation id for the '<em>Is Resolved</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___IS_RESOLVED__EOBJECT_ABSTRACTFEATURENODE = 30;

		/**
	 * The operation id for the '<em>Get Leaf</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___GET_LEAF__LISTROOTNODE = 31;

		/**
	 * The operation id for the '<em>Get File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___GET_FILE__RESOURCE = 32;

		/**
	 * The operation id for the '<em>Get Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___GET_CONTENT__URI = 33;

		/**
	 * The operation id for the '<em>Sort Timed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___SORT_TIMED__COLLECTION = 34;

		/**
	 * The operation id for the '<em>Get Time Span</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___GET_TIME_SPAN__COLLECTION = 35;

		/**
	 * The operation id for the '<em>Get ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE___GET_ID__EOBJECT = 36;

		/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_EMF_FACADE_OPERATION_COUNT = 37;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.emf.Named <em>Named</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.emf.Named
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getNamed()
	 * @generated
	 */
  int NAMED = 1;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NAMED__NAME = 0;

  /**
	 * The number of structural features of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NAMED_FEATURE_COUNT = 1;

  /**
	 * The number of operations of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NAMED_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.common.emf.Described <em>Described</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.emf.Described
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getDescribed()
	 * @generated
	 */
  int DESCRIBED = 2;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DESCRIBED__DESCRIPTION = 0;

  /**
	 * The number of structural features of the '<em>Described</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DESCRIBED_FEATURE_COUNT = 1;

  /**
	 * The number of operations of the '<em>Described</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DESCRIBED_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.common.emf.Timed <em>Timed</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.emf.Timed
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getTimed()
	 * @generated
	 */
  int TIMED = 3;

  /**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TIMED__TIME = 0;

  /**
	 * The number of structural features of the '<em>Timed</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TIMED_FEATURE_COUNT = 1;

  /**
	 * The number of operations of the '<em>Timed</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TIMED_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.common.emf.impl.StartableImpl <em>Startable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.emf.impl.StartableImpl
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getStartable()
	 * @generated
	 */
	int STARTABLE = 5;

		/**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTABLE__STARTED = 0;

		/**
	 * The number of structural features of the '<em>Startable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTABLE_FEATURE_COUNT = 1;

		/**
	 * The number of operations of the '<em>Startable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTABLE_OPERATION_COUNT = 0;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.emf.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.emf.impl.ServerImpl
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 4;

		/**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__STARTED = STARTABLE__STARTED;

		/**
	 * The feature id for the '<em><b>Server Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SERVER_JOB = STARTABLE_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = STARTABLE_FEATURE_COUNT + 1;

		/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = STARTABLE_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.emf.impl.TimeSourcesListImpl <em>Time Sources List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.emf.impl.TimeSourcesListImpl
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getTimeSourcesList()
	 * @generated
	 */
	int TIME_SOURCES_LIST = 6;

		/**
	 * The feature id for the '<em><b>Time Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SOURCES_LIST__TIME_SOURCES = 0;

		/**
	 * The number of structural features of the '<em>Time Sources List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SOURCES_LIST_FEATURE_COUNT = 1;

		/**
	 * The number of operations of the '<em>Time Sources List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SOURCES_LIST_OPERATION_COUNT = 0;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.emf.impl.TimeSourceImpl <em>Time Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.emf.impl.TimeSourceImpl
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getTimeSource()
	 * @generated
	 */
	int TIME_SOURCE = 7;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SOURCE__NAME = NAMED__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SOURCE__DESCRIPTION = NAMED_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SOURCE__TIME = NAMED_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SOURCE__OFFSET = NAMED_FEATURE_COUNT + 2;

		/**
	 * The number of structural features of the '<em>Time Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SOURCE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 3;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SOURCE___DISPOSE = NAMED_OPERATION_COUNT + 0;

		/**
	 * The number of operations of the '<em>Time Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SOURCE_OPERATION_COUNT = NAMED_OPERATION_COUNT + 1;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.emf.impl.FixedTimeSourceImpl <em>Fixed Time Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.emf.impl.FixedTimeSourceImpl
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getFixedTimeSource()
	 * @generated
	 */
	int FIXED_TIME_SOURCE = 8;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TIME_SOURCE__NAME = TIME_SOURCE__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TIME_SOURCE__DESCRIPTION = TIME_SOURCE__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TIME_SOURCE__TIME = TIME_SOURCE__TIME;

		/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TIME_SOURCE__OFFSET = TIME_SOURCE__OFFSET;

		/**
	 * The number of structural features of the '<em>Fixed Time Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TIME_SOURCE_FEATURE_COUNT = TIME_SOURCE_FEATURE_COUNT + 0;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TIME_SOURCE___DISPOSE = TIME_SOURCE___DISPOSE;

		/**
	 * The number of operations of the '<em>Fixed Time Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TIME_SOURCE_OPERATION_COUNT = TIME_SOURCE_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.emf.impl.CurrentTimeSourceImpl <em>Current Time Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.emf.impl.CurrentTimeSourceImpl
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getCurrentTimeSource()
	 * @generated
	 */
	int CURRENT_TIME_SOURCE = 9;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_SOURCE__NAME = TIME_SOURCE__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_SOURCE__DESCRIPTION = TIME_SOURCE__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_SOURCE__TIME = TIME_SOURCE__TIME;

		/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_SOURCE__OFFSET = TIME_SOURCE__OFFSET;

		/**
	 * The feature id for the '<em><b>Update Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_SOURCE__UPDATE_PERIOD = TIME_SOURCE_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Paused</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_SOURCE__PAUSED = TIME_SOURCE_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Current Time Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_SOURCE_FEATURE_COUNT = TIME_SOURCE_FEATURE_COUNT + 2;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_SOURCE___DISPOSE = TIME_SOURCE___DISPOSE;

		/**
	 * The operation id for the '<em>Pause</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_SOURCE___PAUSE = TIME_SOURCE_OPERATION_COUNT + 0;

		/**
	 * The operation id for the '<em>Resume</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_SOURCE___RESUME = TIME_SOURCE_OPERATION_COUNT + 1;

		/**
	 * The number of operations of the '<em>Current Time Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_SOURCE_OPERATION_COUNT = TIME_SOURCE_OPERATION_COUNT + 2;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.emf.impl.BrowseableTimeSourceImpl <em>Browseable Time Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.emf.impl.BrowseableTimeSourceImpl
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getBrowseableTimeSource()
	 * @generated
	 */
	int BROWSEABLE_TIME_SOURCE = 10;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSEABLE_TIME_SOURCE__NAME = TIME_SOURCE__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSEABLE_TIME_SOURCE__DESCRIPTION = TIME_SOURCE__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSEABLE_TIME_SOURCE__TIME = TIME_SOURCE__TIME;

		/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSEABLE_TIME_SOURCE__OFFSET = TIME_SOURCE__OFFSET;

		/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSEABLE_TIME_SOURCE__START_TIME = TIME_SOURCE_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Update Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSEABLE_TIME_SOURCE__UPDATE_PERIOD = TIME_SOURCE_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Time Acceration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSEABLE_TIME_SOURCE__TIME_ACCERATION = TIME_SOURCE_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Time Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSEABLE_TIME_SOURCE__TIME_DIRECTION = TIME_SOURCE_FEATURE_COUNT + 3;

		/**
	 * The number of structural features of the '<em>Browseable Time Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSEABLE_TIME_SOURCE_FEATURE_COUNT = TIME_SOURCE_FEATURE_COUNT + 4;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSEABLE_TIME_SOURCE___DISPOSE = TIME_SOURCE___DISPOSE;

		/**
	 * The operation id for the '<em>Play Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSEABLE_TIME_SOURCE___PLAY_FORWARD = TIME_SOURCE_OPERATION_COUNT + 0;

		/**
	 * The operation id for the '<em>Play Reverse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSEABLE_TIME_SOURCE___PLAY_REVERSE = TIME_SOURCE_OPERATION_COUNT + 1;

		/**
	 * The operation id for the '<em>Pause</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSEABLE_TIME_SOURCE___PAUSE = TIME_SOURCE_OPERATION_COUNT + 2;

		/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSEABLE_TIME_SOURCE___RESET = TIME_SOURCE_OPERATION_COUNT + 3;

		/**
	 * The number of operations of the '<em>Browseable Time Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSEABLE_TIME_SOURCE_OPERATION_COUNT = TIME_SOURCE_OPERATION_COUNT + 4;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.emf.impl.SelectionBasedTimeSourceImpl <em>Selection Based Time Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.emf.impl.SelectionBasedTimeSourceImpl
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getSelectionBasedTimeSource()
	 * @generated
	 */
	int SELECTION_BASED_TIME_SOURCE = 11;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_BASED_TIME_SOURCE__NAME = TIME_SOURCE__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_BASED_TIME_SOURCE__DESCRIPTION = TIME_SOURCE__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_BASED_TIME_SOURCE__TIME = TIME_SOURCE__TIME;

		/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_BASED_TIME_SOURCE__OFFSET = TIME_SOURCE__OFFSET;

		/**
	 * The number of structural features of the '<em>Selection Based Time Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_BASED_TIME_SOURCE_FEATURE_COUNT = TIME_SOURCE_FEATURE_COUNT + 0;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_BASED_TIME_SOURCE___DISPOSE = TIME_SOURCE___DISPOSE;

		/**
	 * The operation id for the '<em>Set Selection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_BASED_TIME_SOURCE___SET_SELECTION__TIMED = TIME_SOURCE_OPERATION_COUNT + 0;

		/**
	 * The number of operations of the '<em>Selection Based Time Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_BASED_TIME_SOURCE_OPERATION_COUNT = TIME_SOURCE_OPERATION_COUNT + 1;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.emf.impl.CollectionTimedTimeSourceImpl <em>Collection Timed Time Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.emf.impl.CollectionTimedTimeSourceImpl
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getCollectionTimedTimeSource()
	 * @generated
	 */
	int COLLECTION_TIMED_TIME_SOURCE = 12;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE__NAME = BROWSEABLE_TIME_SOURCE__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE__DESCRIPTION = BROWSEABLE_TIME_SOURCE__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE__TIME = BROWSEABLE_TIME_SOURCE__TIME;

		/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE__OFFSET = BROWSEABLE_TIME_SOURCE__OFFSET;

		/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE__START_TIME = BROWSEABLE_TIME_SOURCE__START_TIME;

		/**
	 * The feature id for the '<em><b>Update Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE__UPDATE_PERIOD = BROWSEABLE_TIME_SOURCE__UPDATE_PERIOD;

		/**
	 * The feature id for the '<em><b>Time Acceration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE__TIME_ACCERATION = BROWSEABLE_TIME_SOURCE__TIME_ACCERATION;

		/**
	 * The feature id for the '<em><b>Time Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE__TIME_DIRECTION = BROWSEABLE_TIME_SOURCE__TIME_DIRECTION;

		/**
	 * The feature id for the '<em><b>Loop Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE__LOOP_ENABLE = BROWSEABLE_TIME_SOURCE_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Timeds List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE__TIMEDS_LIST = BROWSEABLE_TIME_SOURCE_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Current Timed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE__CURRENT_TIMED_ELEMENT = BROWSEABLE_TIME_SOURCE_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Earliest Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE__EARLIEST_DATE = BROWSEABLE_TIME_SOURCE_FEATURE_COUNT + 3;

		/**
	 * The feature id for the '<em><b>Latest Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE__LATEST_DATE = BROWSEABLE_TIME_SOURCE_FEATURE_COUNT + 4;

		/**
	 * The number of structural features of the '<em>Collection Timed Time Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE_FEATURE_COUNT = BROWSEABLE_TIME_SOURCE_FEATURE_COUNT + 5;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE___DISPOSE = BROWSEABLE_TIME_SOURCE___DISPOSE;

		/**
	 * The operation id for the '<em>Play Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE___PLAY_FORWARD = BROWSEABLE_TIME_SOURCE___PLAY_FORWARD;

		/**
	 * The operation id for the '<em>Play Reverse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE___PLAY_REVERSE = BROWSEABLE_TIME_SOURCE___PLAY_REVERSE;

		/**
	 * The operation id for the '<em>Pause</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE___PAUSE = BROWSEABLE_TIME_SOURCE___PAUSE;

		/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE___RESET = BROWSEABLE_TIME_SOURCE___RESET;

		/**
	 * The operation id for the '<em>Jump To Next</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE___JUMP_TO_NEXT = BROWSEABLE_TIME_SOURCE_OPERATION_COUNT + 0;

		/**
	 * The operation id for the '<em>Jump To Previous</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE___JUMP_TO_PREVIOUS = BROWSEABLE_TIME_SOURCE_OPERATION_COUNT + 1;

		/**
	 * The number of operations of the '<em>Collection Timed Time Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE_OPERATION_COUNT = BROWSEABLE_TIME_SOURCE_OPERATION_COUNT + 2;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.emf.Disposable <em>Disposable</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.emf.Disposable
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getDisposable()
	 * @generated
	 */
  int DISPOSABLE = 13;

  /**
	 * The number of structural features of the '<em>Disposable</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DISPOSABLE_FEATURE_COUNT = 0;

  /**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DISPOSABLE___DISPOSE = 0;

  /**
	 * The number of operations of the '<em>Disposable</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DISPOSABLE_OPERATION_COUNT = 1;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.common.emf.impl.AbstractFeatureNodeImpl <em>Abstract Feature Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.emf.impl.AbstractFeatureNodeImpl
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getAbstractFeatureNode()
	 * @generated
	 */
  int ABSTRACT_FEATURE_NODE = 15;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.common.emf.impl.FeatureNodeAdapterImpl <em>Feature Node Adapter</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.emf.impl.FeatureNodeAdapterImpl
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getFeatureNodeAdapter()
	 * @generated
	 */
  int FEATURE_NODE_ADAPTER = 14;

  /**
	 * The feature id for the '<em><b>Source Object</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FEATURE_NODE_ADAPTER__SOURCE_OBJECT = 0;

  /**
	 * The feature id for the '<em><b>Feature Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FEATURE_NODE_ADAPTER__FEATURE_NODE = 1;

  /**
	 * The feature id for the '<em><b>Current Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FEATURE_NODE_ADAPTER__CURRENT_VALUE = 2;

  /**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FEATURE_NODE_ADAPTER__RESOLVED = 3;

  /**
	 * The number of structural features of the '<em>Feature Node Adapter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FEATURE_NODE_ADAPTER_FEATURE_COUNT = 4;

  /**
	 * The number of operations of the '<em>Feature Node Adapter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FEATURE_NODE_ADAPTER_OPERATION_COUNT = 0;

  /**
	 * The number of structural features of the '<em>Abstract Feature Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_NODE_FEATURE_COUNT = 0;

  /**
	 * The number of operations of the '<em>Abstract Feature Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_NODE_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.common.emf.impl.AbstractFeatureListNodeImpl <em>Abstract Feature List Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.emf.impl.AbstractFeatureListNodeImpl
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getAbstractFeatureListNode()
	 * @generated
	 */
  int ABSTRACT_FEATURE_LIST_NODE = 16;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_LIST_NODE__PARENT = ABSTRACT_FEATURE_NODE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_LIST_NODE__CHILD = ABSTRACT_FEATURE_NODE_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Abstract Feature List Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_LIST_NODE_FEATURE_COUNT = ABSTRACT_FEATURE_NODE_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Abstract Feature List Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_LIST_NODE_OPERATION_COUNT = ABSTRACT_FEATURE_NODE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.common.emf.impl.AbstractFeatureTreeNodeImpl <em>Abstract Feature Tree Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.emf.impl.AbstractFeatureTreeNodeImpl
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getAbstractFeatureTreeNode()
	 * @generated
	 */
  int ABSTRACT_FEATURE_TREE_NODE = 17;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_TREE_NODE__PARENT = ABSTRACT_FEATURE_NODE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_TREE_NODE__CHILDREN = ABSTRACT_FEATURE_NODE_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Abstract Feature Tree Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_TREE_NODE_FEATURE_COUNT = ABSTRACT_FEATURE_NODE_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Abstract Feature Tree Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_TREE_NODE_OPERATION_COUNT = ABSTRACT_FEATURE_NODE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.common.emf.impl.AbstractRootNodeImpl <em>Abstract Root Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.emf.impl.AbstractRootNodeImpl
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getAbstractRootNode()
	 * @generated
	 */
  int ABSTRACT_ROOT_NODE = 18;

  /**
	 * The feature id for the '<em><b>Source Class</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_ROOT_NODE__SOURCE_CLASS = 0;

  /**
	 * The number of structural features of the '<em>Abstract Root Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_ROOT_NODE_FEATURE_COUNT = 1;

  /**
	 * The number of operations of the '<em>Abstract Root Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_ROOT_NODE_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.common.emf.impl.TreeRootNodeImpl <em>Tree Root Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.emf.impl.TreeRootNodeImpl
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getTreeRootNode()
	 * @generated
	 */
  int TREE_ROOT_NODE = 19;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_ROOT_NODE__PARENT = ABSTRACT_FEATURE_TREE_NODE__PARENT;

  /**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_ROOT_NODE__CHILDREN = ABSTRACT_FEATURE_TREE_NODE__CHILDREN;

  /**
	 * The feature id for the '<em><b>Source Class</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_ROOT_NODE__SOURCE_CLASS = ABSTRACT_FEATURE_TREE_NODE_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Tree Root Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_ROOT_NODE_FEATURE_COUNT = ABSTRACT_FEATURE_TREE_NODE_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Tree Root Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_ROOT_NODE_OPERATION_COUNT = ABSTRACT_FEATURE_TREE_NODE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.common.emf.impl.TreeFeatureNodeImpl <em>Tree Feature Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.emf.impl.TreeFeatureNodeImpl
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getTreeFeatureNode()
	 * @generated
	 */
  int TREE_FEATURE_NODE = 20;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_FEATURE_NODE__PARENT = ABSTRACT_FEATURE_TREE_NODE__PARENT;

  /**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_FEATURE_NODE__CHILDREN = ABSTRACT_FEATURE_TREE_NODE__CHILDREN;

  /**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_FEATURE_NODE__STRUCTURAL_FEATURE = ABSTRACT_FEATURE_TREE_NODE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Multi Valued</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_FEATURE_NODE__MULTI_VALUED = ABSTRACT_FEATURE_TREE_NODE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_FEATURE_NODE__INDEX = ABSTRACT_FEATURE_TREE_NODE_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Tree Feature Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_FEATURE_NODE_FEATURE_COUNT = ABSTRACT_FEATURE_TREE_NODE_FEATURE_COUNT + 3;

  /**
	 * The number of operations of the '<em>Tree Feature Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_FEATURE_NODE_OPERATION_COUNT = ABSTRACT_FEATURE_TREE_NODE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.common.emf.impl.ListRootNodeImpl <em>List Root Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.emf.impl.ListRootNodeImpl
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getListRootNode()
	 * @generated
	 */
  int LIST_ROOT_NODE = 21;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_ROOT_NODE__PARENT = ABSTRACT_FEATURE_LIST_NODE__PARENT;

  /**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_ROOT_NODE__CHILD = ABSTRACT_FEATURE_LIST_NODE__CHILD;

  /**
	 * The feature id for the '<em><b>Source Class</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_ROOT_NODE__SOURCE_CLASS = ABSTRACT_FEATURE_LIST_NODE_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>List Root Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_ROOT_NODE_FEATURE_COUNT = ABSTRACT_FEATURE_LIST_NODE_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>List Root Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_ROOT_NODE_OPERATION_COUNT = ABSTRACT_FEATURE_LIST_NODE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.common.emf.impl.ListFeatureNodeImpl <em>List Feature Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.emf.impl.ListFeatureNodeImpl
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getListFeatureNode()
	 * @generated
	 */
  int LIST_FEATURE_NODE = 22;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_FEATURE_NODE__PARENT = ABSTRACT_FEATURE_LIST_NODE__PARENT;

  /**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_FEATURE_NODE__CHILD = ABSTRACT_FEATURE_LIST_NODE__CHILD;

  /**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_FEATURE_NODE__STRUCTURAL_FEATURE = ABSTRACT_FEATURE_LIST_NODE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Multi Valued</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_FEATURE_NODE__MULTI_VALUED = ABSTRACT_FEATURE_LIST_NODE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_FEATURE_NODE__INDEX = ABSTRACT_FEATURE_LIST_NODE_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>List Feature Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_FEATURE_NODE_FEATURE_COUNT = ABSTRACT_FEATURE_LIST_NODE_FEATURE_COUNT + 3;

  /**
	 * The number of operations of the '<em>List Feature Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_FEATURE_NODE_OPERATION_COUNT = ABSTRACT_FEATURE_LIST_NODE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.common.emf.impl.AbstractFeatureSpecifierImpl <em>Abstract Feature Specifier</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.emf.impl.AbstractFeatureSpecifierImpl
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getAbstractFeatureSpecifier()
	 * @generated
	 */
  int ABSTRACT_FEATURE_SPECIFIER = 23;

  /**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_SPECIFIER__STRUCTURAL_FEATURE = 0;

  /**
	 * The feature id for the '<em><b>Multi Valued</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_SPECIFIER__MULTI_VALUED = 1;

  /**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_SPECIFIER__INDEX = 2;

  /**
	 * The number of structural features of the '<em>Abstract Feature Specifier</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_SPECIFIER_FEATURE_COUNT = 3;

  /**
	 * The number of operations of the '<em>Abstract Feature Specifier</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_SPECIFIER_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.common.emf.TimeDirection <em>Time Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.emf.TimeDirection
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getTimeDirection()
	 * @generated
	 */
	int TIME_DIRECTION = 24;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.emf.Ranges <em>Ranges</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.emf.Ranges
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getRanges()
	 * @generated
	 */
  int RANGES = 25;

  /**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getException()
	 * @generated
	 */
  int EXCEPTION = 26;

  /**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getList()
	 * @generated
	 */
  int LIST = 27;

  /**
	 * The meta object id for the '<em>Sorted Set</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.SortedSet
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getSortedSet()
	 * @generated
	 */
  int SORTED_SET = 28;

  /**
	 * The meta object id for the '<em>EClass Filter</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.emf.EClassFilter
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getEClassFilter()
	 * @generated
	 */
  int ECLASS_FILTER = 29;

  /**
	 * The meta object id for the '<em>Number</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.lang.Number
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getNumber()
	 * @generated
	 */
  int NUMBER = 30;


  /**
	 * The meta object id for the '<em>IFile</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IFile
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getIFile()
	 * @generated
	 */
  int IFILE = 31;

  /**
	 * The meta object id for the '<em>Resource</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.resource.Resource
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getResource()
	 * @generated
	 */
  int RESOURCE = 32;


  /**
	 * The meta object id for the '<em>Unit</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see javax.measure.unit.Unit
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getUnit()
	 * @generated
	 */
  int UNIT = 33;


  /**
	 * The meta object id for the '<em>Collection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Collection
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 34;


		/**
	 * The meta object id for the '<em>EList</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.EList
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getEList()
	 * @generated
	 */
	int ELIST = 35;

		/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.URI
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getURI()
	 * @generated
	 */
	int URI = 36;


		/**
	 * The meta object id for the '<em>Job</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.jobs.Job
	 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getJob()
	 * @generated
	 */
	int JOB = 37;


		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade
	 * @generated
	 */
	EClass getSymphony__CommonEMFFacade();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getAllAvailableEClasses() <em>Get All Available EClasses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Available EClasses</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getAllAvailableEClasses()
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__GetAllAvailableEClasses();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getAllSubEClasses(org.eclipse.emf.ecore.EClass) <em>Get All Sub EClasses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Sub EClasses</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getAllSubEClasses(org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__GetAllSubEClasses__EClass();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#filterEClasses(java.util.List, org.eclipse.symphony.common.emf.EClassFilter) <em>Filter EClasses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Filter EClasses</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#filterEClasses(java.util.List, org.eclipse.symphony.common.emf.EClassFilter)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__FilterEClasses__List_EClassFilter();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#filterEClasses(java.util.List, java.util.List) <em>Filter EClasses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Filter EClasses</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#filterEClasses(java.util.List, java.util.List)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__FilterEClasses__List_List();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getEClass(java.lang.String) <em>Get EClass</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EClass</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getEClass(java.lang.String)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__GetEClass__String();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#sortAlphabetically(java.util.List) <em>Sort Alphabetically</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sort Alphabetically</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#sortAlphabetically(java.util.List)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__SortAlphabetically__List();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getAllAvailableEOperations(org.eclipse.emf.ecore.EClass) <em>Get All Available EOperations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Available EOperations</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getAllAvailableEOperations(org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__GetAllAvailableEOperations__EClass();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#sortEOperationsAlphabetically(java.util.List) <em>Sort EOperations Alphabetically</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sort EOperations Alphabetically</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#sortEOperationsAlphabetically(java.util.List)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__SortEOperationsAlphabetically__List();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getDocumentation(org.eclipse.emf.ecore.ETypedElement) <em>Get Documentation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Documentation</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getDocumentation(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__GetDocumentation__ETypedElement();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getEngineeringUnitsAsString(org.eclipse.emf.ecore.ETypedElement) <em>Get Engineering Units As String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Engineering Units As String</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getEngineeringUnitsAsString(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__GetEngineeringUnitsAsString__ETypedElement();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getEngineeringUnits(org.eclipse.emf.ecore.ETypedElement) <em>Get Engineering Units</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Engineering Units</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getEngineeringUnits(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__GetEngineeringUnits__ETypedElement();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getValueUpdateRate(org.eclipse.emf.ecore.ETypedElement) <em>Get Value Update Rate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value Update Rate</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getValueUpdateRate(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__GetValueUpdateRate__ETypedElement();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getWarningOCLExpression(org.eclipse.emf.ecore.ETypedElement) <em>Get Warning OCL Expression</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Warning OCL Expression</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getWarningOCLExpression(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__GetWarningOCLExpression__ETypedElement();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getAlarmOCLExpression(org.eclipse.emf.ecore.ETypedElement) <em>Get Alarm OCL Expression</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Alarm OCL Expression</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getAlarmOCLExpression(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__GetAlarmOCLExpression__ETypedElement();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getOutOfRangeOCLExpression(org.eclipse.emf.ecore.ETypedElement) <em>Get Out Of Range OCL Expression</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Out Of Range OCL Expression</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getOutOfRangeOCLExpression(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__GetOutOfRangeOCLExpression__ETypedElement();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getWarningMinValue(org.eclipse.emf.ecore.ETypedElement) <em>Get Warning Min Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Warning Min Value</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getWarningMinValue(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__GetWarningMinValue__ETypedElement();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getWarningMaxValue(org.eclipse.emf.ecore.ETypedElement) <em>Get Warning Max Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Warning Max Value</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getWarningMaxValue(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__GetWarningMaxValue__ETypedElement();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getAlarmMinValue(org.eclipse.emf.ecore.ETypedElement) <em>Get Alarm Min Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Alarm Min Value</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getAlarmMinValue(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__GetAlarmMinValue__ETypedElement();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getAlarmMaxValue(org.eclipse.emf.ecore.ETypedElement) <em>Get Alarm Max Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Alarm Max Value</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getAlarmMaxValue(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__GetAlarmMaxValue__ETypedElement();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getOutOfRangeMinValue(org.eclipse.emf.ecore.ETypedElement) <em>Get Out Of Range Min Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Out Of Range Min Value</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getOutOfRangeMinValue(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__GetOutOfRangeMinValue__ETypedElement();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getOutOfRangeMaxValue(org.eclipse.emf.ecore.ETypedElement) <em>Get Out Of Range Max Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Out Of Range Max Value</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getOutOfRangeMaxValue(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__GetOutOfRangeMaxValue__ETypedElement();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getRange(org.eclipse.emf.ecore.ETypedElement, java.lang.Object) <em>Get Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Range</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getRange(org.eclipse.emf.ecore.ETypedElement, java.lang.Object)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__GetRange__ETypedElement_Object();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getFullDescription(org.eclipse.emf.ecore.ETypedElement) <em>Get Full Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Full Description</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getFullDescription(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__GetFullDescription__ETypedElement();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getAncestriesString(org.eclipse.symphony.common.emf.AbstractFeatureNode) <em>Get Ancestries String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Ancestries String</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getAncestriesString(org.eclipse.symphony.common.emf.AbstractFeatureNode)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__GetAncestriesString__AbstractFeatureNode();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getFeatureRoot(org.eclipse.symphony.common.emf.AbstractFeatureNode) <em>Get Feature Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature Root</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getFeatureRoot(org.eclipse.symphony.common.emf.AbstractFeatureNode)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__GetFeatureRoot__AbstractFeatureNode();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getAncestries(org.eclipse.symphony.common.emf.AbstractFeatureNode) <em>Get Ancestries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Ancestries</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getAncestries(org.eclipse.symphony.common.emf.AbstractFeatureNode)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__GetAncestries__AbstractFeatureNode();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getDescendants(org.eclipse.symphony.common.emf.AbstractFeatureNode) <em>Get Descendants</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Descendants</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getDescendants(org.eclipse.symphony.common.emf.AbstractFeatureNode)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__GetDescendants__AbstractFeatureNode();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getChildEStructuralFeatures(org.eclipse.symphony.common.emf.AbstractFeatureNode) <em>Get Child EStructural Features</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Child EStructural Features</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getChildEStructuralFeatures(org.eclipse.symphony.common.emf.AbstractFeatureNode)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__GetChildEStructuralFeatures__AbstractFeatureNode();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#resolve(org.eclipse.emf.ecore.EObject, org.eclipse.symphony.common.emf.AbstractFeatureNode) <em>Resolve</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#resolve(org.eclipse.emf.ecore.EObject, org.eclipse.symphony.common.emf.AbstractFeatureNode)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__Resolve__EObject_AbstractFeatureNode();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#setValue(org.eclipse.emf.ecore.EObject, org.eclipse.symphony.common.emf.AbstractFeatureNode, java.lang.Object) <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#setValue(org.eclipse.emf.ecore.EObject, org.eclipse.symphony.common.emf.AbstractFeatureNode, java.lang.Object)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__SetValue__EObject_AbstractFeatureNode_Object();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#isResolved(org.eclipse.emf.ecore.EObject, org.eclipse.symphony.common.emf.AbstractFeatureNode) <em>Is Resolved</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Resolved</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#isResolved(org.eclipse.emf.ecore.EObject, org.eclipse.symphony.common.emf.AbstractFeatureNode)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__IsResolved__EObject_AbstractFeatureNode();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getLeaf(org.eclipse.symphony.common.emf.ListRootNode) <em>Get Leaf</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Leaf</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getLeaf(org.eclipse.symphony.common.emf.ListRootNode)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__GetLeaf__ListRootNode();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getFile(org.eclipse.emf.ecore.resource.Resource) <em>Get File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get File</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getFile(org.eclipse.emf.ecore.resource.Resource)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__GetFile__Resource();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getContent(org.eclipse.emf.common.util.URI) <em>Get Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Content</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getContent(org.eclipse.emf.common.util.URI)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__GetContent__URI();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#sortTimed(java.util.Collection) <em>Sort Timed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sort Timed</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#sortTimed(java.util.Collection)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__SortTimed__Collection();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getTimeSpan(java.util.Collection) <em>Get Time Span</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Time Span</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getTimeSpan(java.util.Collection)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__GetTimeSpan__Collection();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getID(org.eclipse.emf.ecore.EObject) <em>Get ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get ID</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade#getID(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSymphony__CommonEMFFacade__GetID__EObject();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.emf.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named</em>'.
	 * @see org.eclipse.symphony.common.emf.Named
	 * @generated
	 */
  EClass getNamed();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.emf.Named#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.symphony.common.emf.Named#getName()
	 * @see #getNamed()
	 * @generated
	 */
  EAttribute getNamed_Name();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.emf.Described <em>Described</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Described</em>'.
	 * @see org.eclipse.symphony.common.emf.Described
	 * @generated
	 */
  EClass getDescribed();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.emf.Described#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.symphony.common.emf.Described#getDescription()
	 * @see #getDescribed()
	 * @generated
	 */
  EAttribute getDescribed_Description();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.emf.Timed <em>Timed</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed</em>'.
	 * @see org.eclipse.symphony.common.emf.Timed
	 * @generated
	 */
  EClass getTimed();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.emf.Timed#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.eclipse.symphony.common.emf.Timed#getTime()
	 * @see #getTimed()
	 * @generated
	 */
  EAttribute getTimed_Time();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.emf.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see org.eclipse.symphony.common.emf.Server
	 * @generated
	 */
	EClass getServer();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.emf.Server#getServerJob <em>Server Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Job</em>'.
	 * @see org.eclipse.symphony.common.emf.Server#getServerJob()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_ServerJob();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.emf.Startable <em>Startable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Startable</em>'.
	 * @see org.eclipse.symphony.common.emf.Startable
	 * @generated
	 */
	EClass getStartable();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.emf.Startable#isStarted <em>Started</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Started</em>'.
	 * @see org.eclipse.symphony.common.emf.Startable#isStarted()
	 * @see #getStartable()
	 * @generated
	 */
	EAttribute getStartable_Started();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.emf.TimeSourcesList <em>Time Sources List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Sources List</em>'.
	 * @see org.eclipse.symphony.common.emf.TimeSourcesList
	 * @generated
	 */
	EClass getTimeSourcesList();

		/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.common.emf.TimeSourcesList#getTimeSources <em>Time Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Sources</em>'.
	 * @see org.eclipse.symphony.common.emf.TimeSourcesList#getTimeSources()
	 * @see #getTimeSourcesList()
	 * @generated
	 */
	EReference getTimeSourcesList_TimeSources();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.emf.TimeSource <em>Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Source</em>'.
	 * @see org.eclipse.symphony.common.emf.TimeSource
	 * @generated
	 */
	EClass getTimeSource();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.emf.TimeSource#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.eclipse.symphony.common.emf.TimeSource#getOffset()
	 * @see #getTimeSource()
	 * @generated
	 */
	EAttribute getTimeSource_Offset();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.emf.FixedTimeSource <em>Fixed Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Time Source</em>'.
	 * @see org.eclipse.symphony.common.emf.FixedTimeSource
	 * @generated
	 */
	EClass getFixedTimeSource();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.emf.CurrentTimeSource <em>Current Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Time Source</em>'.
	 * @see org.eclipse.symphony.common.emf.CurrentTimeSource
	 * @generated
	 */
	EClass getCurrentTimeSource();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.emf.CurrentTimeSource#getUpdatePeriod <em>Update Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Period</em>'.
	 * @see org.eclipse.symphony.common.emf.CurrentTimeSource#getUpdatePeriod()
	 * @see #getCurrentTimeSource()
	 * @generated
	 */
	EAttribute getCurrentTimeSource_UpdatePeriod();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.emf.CurrentTimeSource#isPaused <em>Paused</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paused</em>'.
	 * @see org.eclipse.symphony.common.emf.CurrentTimeSource#isPaused()
	 * @see #getCurrentTimeSource()
	 * @generated
	 */
	EAttribute getCurrentTimeSource_Paused();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.CurrentTimeSource#pause() <em>Pause</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pause</em>' operation.
	 * @see org.eclipse.symphony.common.emf.CurrentTimeSource#pause()
	 * @generated
	 */
	EOperation getCurrentTimeSource__Pause();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.CurrentTimeSource#resume() <em>Resume</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resume</em>' operation.
	 * @see org.eclipse.symphony.common.emf.CurrentTimeSource#resume()
	 * @generated
	 */
	EOperation getCurrentTimeSource__Resume();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.emf.BrowseableTimeSource <em>Browseable Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Browseable Time Source</em>'.
	 * @see org.eclipse.symphony.common.emf.BrowseableTimeSource
	 * @generated
	 */
	EClass getBrowseableTimeSource();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.emf.BrowseableTimeSource#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see org.eclipse.symphony.common.emf.BrowseableTimeSource#getStartTime()
	 * @see #getBrowseableTimeSource()
	 * @generated
	 */
	EAttribute getBrowseableTimeSource_StartTime();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.emf.BrowseableTimeSource#getUpdatePeriod <em>Update Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Period</em>'.
	 * @see org.eclipse.symphony.common.emf.BrowseableTimeSource#getUpdatePeriod()
	 * @see #getBrowseableTimeSource()
	 * @generated
	 */
	EAttribute getBrowseableTimeSource_UpdatePeriod();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.emf.BrowseableTimeSource#getTimeAcceration <em>Time Acceration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Acceration</em>'.
	 * @see org.eclipse.symphony.common.emf.BrowseableTimeSource#getTimeAcceration()
	 * @see #getBrowseableTimeSource()
	 * @generated
	 */
	EAttribute getBrowseableTimeSource_TimeAcceration();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.emf.BrowseableTimeSource#getTimeDirection <em>Time Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Direction</em>'.
	 * @see org.eclipse.symphony.common.emf.BrowseableTimeSource#getTimeDirection()
	 * @see #getBrowseableTimeSource()
	 * @generated
	 */
	EAttribute getBrowseableTimeSource_TimeDirection();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.BrowseableTimeSource#playForward() <em>Play Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Play Forward</em>' operation.
	 * @see org.eclipse.symphony.common.emf.BrowseableTimeSource#playForward()
	 * @generated
	 */
	EOperation getBrowseableTimeSource__PlayForward();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.BrowseableTimeSource#playReverse() <em>Play Reverse</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Play Reverse</em>' operation.
	 * @see org.eclipse.symphony.common.emf.BrowseableTimeSource#playReverse()
	 * @generated
	 */
	EOperation getBrowseableTimeSource__PlayReverse();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.BrowseableTimeSource#pause() <em>Pause</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pause</em>' operation.
	 * @see org.eclipse.symphony.common.emf.BrowseableTimeSource#pause()
	 * @generated
	 */
	EOperation getBrowseableTimeSource__Pause();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.BrowseableTimeSource#reset() <em>Reset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset</em>' operation.
	 * @see org.eclipse.symphony.common.emf.BrowseableTimeSource#reset()
	 * @generated
	 */
	EOperation getBrowseableTimeSource__Reset();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.emf.SelectionBasedTimeSource <em>Selection Based Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Based Time Source</em>'.
	 * @see org.eclipse.symphony.common.emf.SelectionBasedTimeSource
	 * @generated
	 */
	EClass getSelectionBasedTimeSource();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.SelectionBasedTimeSource#setSelection(org.eclipse.symphony.common.emf.Timed) <em>Set Selection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Selection</em>' operation.
	 * @see org.eclipse.symphony.common.emf.SelectionBasedTimeSource#setSelection(org.eclipse.symphony.common.emf.Timed)
	 * @generated
	 */
	EOperation getSelectionBasedTimeSource__SetSelection__Timed();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.emf.CollectionTimedTimeSource <em>Collection Timed Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Timed Time Source</em>'.
	 * @see org.eclipse.symphony.common.emf.CollectionTimedTimeSource
	 * @generated
	 */
	EClass getCollectionTimedTimeSource();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.emf.CollectionTimedTimeSource#isLoopEnable <em>Loop Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop Enable</em>'.
	 * @see org.eclipse.symphony.common.emf.CollectionTimedTimeSource#isLoopEnable()
	 * @see #getCollectionTimedTimeSource()
	 * @generated
	 */
	EAttribute getCollectionTimedTimeSource_LoopEnable();

		/**
	 * Returns the meta object for the reference list '{@link org.eclipse.symphony.common.emf.CollectionTimedTimeSource#getTimedsList <em>Timeds List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Timeds List</em>'.
	 * @see org.eclipse.symphony.common.emf.CollectionTimedTimeSource#getTimedsList()
	 * @see #getCollectionTimedTimeSource()
	 * @generated
	 */
	EReference getCollectionTimedTimeSource_TimedsList();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.emf.CollectionTimedTimeSource#getCurrentTimedElement <em>Current Timed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Timed Element</em>'.
	 * @see org.eclipse.symphony.common.emf.CollectionTimedTimeSource#getCurrentTimedElement()
	 * @see #getCollectionTimedTimeSource()
	 * @generated
	 */
	EReference getCollectionTimedTimeSource_CurrentTimedElement();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.emf.CollectionTimedTimeSource#getEarliestDate <em>Earliest Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Earliest Date</em>'.
	 * @see org.eclipse.symphony.common.emf.CollectionTimedTimeSource#getEarliestDate()
	 * @see #getCollectionTimedTimeSource()
	 * @generated
	 */
	EAttribute getCollectionTimedTimeSource_EarliestDate();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.emf.CollectionTimedTimeSource#getLatestDate <em>Latest Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latest Date</em>'.
	 * @see org.eclipse.symphony.common.emf.CollectionTimedTimeSource#getLatestDate()
	 * @see #getCollectionTimedTimeSource()
	 * @generated
	 */
	EAttribute getCollectionTimedTimeSource_LatestDate();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.CollectionTimedTimeSource#jumpToNext() <em>Jump To Next</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Jump To Next</em>' operation.
	 * @see org.eclipse.symphony.common.emf.CollectionTimedTimeSource#jumpToNext()
	 * @generated
	 */
	EOperation getCollectionTimedTimeSource__JumpToNext();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.CollectionTimedTimeSource#jumpToPrevious() <em>Jump To Previous</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Jump To Previous</em>' operation.
	 * @see org.eclipse.symphony.common.emf.CollectionTimedTimeSource#jumpToPrevious()
	 * @generated
	 */
	EOperation getCollectionTimedTimeSource__JumpToPrevious();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.emf.Disposable <em>Disposable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disposable</em>'.
	 * @see org.eclipse.symphony.common.emf.Disposable
	 * @generated
	 */
  EClass getDisposable();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.Disposable#dispose() <em>Dispose</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dispose</em>' operation.
	 * @see org.eclipse.symphony.common.emf.Disposable#dispose()
	 * @generated
	 */
  EOperation getDisposable__Dispose();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.emf.AbstractFeatureNode <em>Abstract Feature Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Feature Node</em>'.
	 * @see org.eclipse.symphony.common.emf.AbstractFeatureNode
	 * @generated
	 */
  EClass getAbstractFeatureNode();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.emf.FeatureNodeAdapter <em>Feature Node Adapter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Node Adapter</em>'.
	 * @see org.eclipse.symphony.common.emf.FeatureNodeAdapter
	 * @generated
	 */
  EClass getFeatureNodeAdapter();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.emf.FeatureNodeAdapter#getSourceObject <em>Source Object</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Object</em>'.
	 * @see org.eclipse.symphony.common.emf.FeatureNodeAdapter#getSourceObject()
	 * @see #getFeatureNodeAdapter()
	 * @generated
	 */
  EReference getFeatureNodeAdapter_SourceObject();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.emf.FeatureNodeAdapter#getFeatureNode <em>Feature Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature Node</em>'.
	 * @see org.eclipse.symphony.common.emf.FeatureNodeAdapter#getFeatureNode()
	 * @see #getFeatureNodeAdapter()
	 * @generated
	 */
  EReference getFeatureNodeAdapter_FeatureNode();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.emf.FeatureNodeAdapter#getCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Value</em>'.
	 * @see org.eclipse.symphony.common.emf.FeatureNodeAdapter#getCurrentValue()
	 * @see #getFeatureNodeAdapter()
	 * @generated
	 */
  EAttribute getFeatureNodeAdapter_CurrentValue();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.emf.FeatureNodeAdapter#isResolved <em>Resolved</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolved</em>'.
	 * @see org.eclipse.symphony.common.emf.FeatureNodeAdapter#isResolved()
	 * @see #getFeatureNodeAdapter()
	 * @generated
	 */
  EAttribute getFeatureNodeAdapter_Resolved();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.emf.AbstractFeatureListNode <em>Abstract Feature List Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Feature List Node</em>'.
	 * @see org.eclipse.symphony.common.emf.AbstractFeatureListNode
	 * @generated
	 */
  EClass getAbstractFeatureListNode();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.common.emf.AbstractFeatureListNode#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.eclipse.symphony.common.emf.AbstractFeatureListNode#getParent()
	 * @see #getAbstractFeatureListNode()
	 * @generated
	 */
  EReference getAbstractFeatureListNode_Parent();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.common.emf.AbstractFeatureListNode#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see org.eclipse.symphony.common.emf.AbstractFeatureListNode#getChild()
	 * @see #getAbstractFeatureListNode()
	 * @generated
	 */
  EReference getAbstractFeatureListNode_Child();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.emf.AbstractFeatureTreeNode <em>Abstract Feature Tree Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Feature Tree Node</em>'.
	 * @see org.eclipse.symphony.common.emf.AbstractFeatureTreeNode
	 * @generated
	 */
  EClass getAbstractFeatureTreeNode();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.common.emf.AbstractFeatureTreeNode#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.eclipse.symphony.common.emf.AbstractFeatureTreeNode#getParent()
	 * @see #getAbstractFeatureTreeNode()
	 * @generated
	 */
  EReference getAbstractFeatureTreeNode_Parent();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.common.emf.AbstractFeatureTreeNode#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.symphony.common.emf.AbstractFeatureTreeNode#getChildren()
	 * @see #getAbstractFeatureTreeNode()
	 * @generated
	 */
  EReference getAbstractFeatureTreeNode_Children();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.emf.AbstractRootNode <em>Abstract Root Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Root Node</em>'.
	 * @see org.eclipse.symphony.common.emf.AbstractRootNode
	 * @generated
	 */
  EClass getAbstractRootNode();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.emf.AbstractRootNode#getSourceClass <em>Source Class</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Class</em>'.
	 * @see org.eclipse.symphony.common.emf.AbstractRootNode#getSourceClass()
	 * @see #getAbstractRootNode()
	 * @generated
	 */
  EReference getAbstractRootNode_SourceClass();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.emf.TreeRootNode <em>Tree Root Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree Root Node</em>'.
	 * @see org.eclipse.symphony.common.emf.TreeRootNode
	 * @generated
	 */
  EClass getTreeRootNode();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.emf.TreeFeatureNode <em>Tree Feature Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree Feature Node</em>'.
	 * @see org.eclipse.symphony.common.emf.TreeFeatureNode
	 * @generated
	 */
  EClass getTreeFeatureNode();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.emf.ListRootNode <em>List Root Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Root Node</em>'.
	 * @see org.eclipse.symphony.common.emf.ListRootNode
	 * @generated
	 */
  EClass getListRootNode();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.emf.ListFeatureNode <em>List Feature Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Feature Node</em>'.
	 * @see org.eclipse.symphony.common.emf.ListFeatureNode
	 * @generated
	 */
  EClass getListFeatureNode();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.emf.AbstractFeatureSpecifier <em>Abstract Feature Specifier</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Feature Specifier</em>'.
	 * @see org.eclipse.symphony.common.emf.AbstractFeatureSpecifier
	 * @generated
	 */
  EClass getAbstractFeatureSpecifier();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.emf.AbstractFeatureSpecifier#getStructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structural Feature</em>'.
	 * @see org.eclipse.symphony.common.emf.AbstractFeatureSpecifier#getStructuralFeature()
	 * @see #getAbstractFeatureSpecifier()
	 * @generated
	 */
  EReference getAbstractFeatureSpecifier_StructuralFeature();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.emf.AbstractFeatureSpecifier#isMultiValued <em>Multi Valued</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Valued</em>'.
	 * @see org.eclipse.symphony.common.emf.AbstractFeatureSpecifier#isMultiValued()
	 * @see #getAbstractFeatureSpecifier()
	 * @generated
	 */
  EAttribute getAbstractFeatureSpecifier_MultiValued();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.emf.AbstractFeatureSpecifier#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.eclipse.symphony.common.emf.AbstractFeatureSpecifier#getIndex()
	 * @see #getAbstractFeatureSpecifier()
	 * @generated
	 */
  EAttribute getAbstractFeatureSpecifier_Index();

  /**
	 * Returns the meta object for enum '{@link org.eclipse.symphony.common.emf.TimeDirection <em>Time Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Direction</em>'.
	 * @see org.eclipse.symphony.common.emf.TimeDirection
	 * @generated
	 */
	EEnum getTimeDirection();

		/**
	 * Returns the meta object for enum '{@link org.eclipse.symphony.common.emf.Ranges <em>Ranges</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ranges</em>'.
	 * @see org.eclipse.symphony.common.emf.Ranges
	 * @generated
	 */
  EEnum getRanges();

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
	 * Returns the meta object for data type '{@link java.util.SortedSet <em>Sorted Set</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sorted Set</em>'.
	 * @see java.util.SortedSet
	 * @model instanceClass="java.util.SortedSet" typeParameters="T"
	 * @generated
	 */
  EDataType getSortedSet();

  /**
	 * Returns the meta object for data type '{@link org.eclipse.symphony.common.emf.EClassFilter <em>EClass Filter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EClass Filter</em>'.
	 * @see org.eclipse.symphony.common.emf.EClassFilter
	 * @model instanceClass="org.eclipse.symphony.common.emf.EClassFilter"
	 * @generated
	 */
  EDataType getEClassFilter();

  /**
	 * Returns the meta object for data type '{@link java.lang.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number</em>'.
	 * @see java.lang.Number
	 * @model instanceClass="java.lang.Number"
	 * @generated
	 */
  EDataType getNumber();

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
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.resource.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Resource</em>'.
	 * @see org.eclipse.emf.ecore.resource.Resource
	 * @model instanceClass="org.eclipse.emf.ecore.resource.Resource"
	 * @generated
	 */
  EDataType getResource();

  /**
	 * Returns the meta object for data type '{@link javax.measure.unit.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unit</em>'.
	 * @see javax.measure.unit.Unit
	 * @model instanceClass="javax.measure.unit.Unit<?>"
	 * @generated
	 */
  EDataType getUnit();

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
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.EList <em>EList</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EList</em>'.
	 * @see org.eclipse.emf.common.util.EList
	 * @model instanceClass="org.eclipse.emf.common.util.EList" typeParameters="EObject"
	 * @generated
	 */
	EDataType getEList();

		/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.URI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see org.eclipse.emf.common.util.URI
	 * @model instanceClass="org.eclipse.emf.common.util.URI"
	 * @generated
	 */
	EDataType getURI();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Symphony__CommonEMFFactory getSymphony__CommonEMFFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFFacadeImpl
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getSymphony__CommonEMFFacade()
		 * @generated
		 */
		EClass SYMPHONY_COMMON_EMF_FACADE = eINSTANCE.getSymphony__CommonEMFFacade();

			/**
		 * The meta object literal for the '<em><b>Get All Available EClasses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___GET_ALL_AVAILABLE_ECLASSES = eINSTANCE.getSymphony__CommonEMFFacade__GetAllAvailableEClasses();

			/**
		 * The meta object literal for the '<em><b>Get All Sub EClasses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___GET_ALL_SUB_ECLASSES__ECLASS = eINSTANCE.getSymphony__CommonEMFFacade__GetAllSubEClasses__EClass();

			/**
		 * The meta object literal for the '<em><b>Filter EClasses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___FILTER_ECLASSES__LIST_ECLASSFILTER = eINSTANCE.getSymphony__CommonEMFFacade__FilterEClasses__List_EClassFilter();

			/**
		 * The meta object literal for the '<em><b>Filter EClasses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___FILTER_ECLASSES__LIST_LIST = eINSTANCE.getSymphony__CommonEMFFacade__FilterEClasses__List_List();

			/**
		 * The meta object literal for the '<em><b>Get EClass</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___GET_ECLASS__STRING = eINSTANCE.getSymphony__CommonEMFFacade__GetEClass__String();

			/**
		 * The meta object literal for the '<em><b>Sort Alphabetically</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___SORT_ALPHABETICALLY__LIST = eINSTANCE.getSymphony__CommonEMFFacade__SortAlphabetically__List();

			/**
		 * The meta object literal for the '<em><b>Get All Available EOperations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___GET_ALL_AVAILABLE_EOPERATIONS__ECLASS = eINSTANCE.getSymphony__CommonEMFFacade__GetAllAvailableEOperations__EClass();

			/**
		 * The meta object literal for the '<em><b>Sort EOperations Alphabetically</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___SORT_EOPERATIONS_ALPHABETICALLY__LIST = eINSTANCE.getSymphony__CommonEMFFacade__SortEOperationsAlphabetically__List();

			/**
		 * The meta object literal for the '<em><b>Get Documentation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___GET_DOCUMENTATION__ETYPEDELEMENT = eINSTANCE.getSymphony__CommonEMFFacade__GetDocumentation__ETypedElement();

			/**
		 * The meta object literal for the '<em><b>Get Engineering Units As String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___GET_ENGINEERING_UNITS_AS_STRING__ETYPEDELEMENT = eINSTANCE.getSymphony__CommonEMFFacade__GetEngineeringUnitsAsString__ETypedElement();

			/**
		 * The meta object literal for the '<em><b>Get Engineering Units</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___GET_ENGINEERING_UNITS__ETYPEDELEMENT = eINSTANCE.getSymphony__CommonEMFFacade__GetEngineeringUnits__ETypedElement();

			/**
		 * The meta object literal for the '<em><b>Get Value Update Rate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___GET_VALUE_UPDATE_RATE__ETYPEDELEMENT = eINSTANCE.getSymphony__CommonEMFFacade__GetValueUpdateRate__ETypedElement();

			/**
		 * The meta object literal for the '<em><b>Get Warning OCL Expression</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___GET_WARNING_OCL_EXPRESSION__ETYPEDELEMENT = eINSTANCE.getSymphony__CommonEMFFacade__GetWarningOCLExpression__ETypedElement();

			/**
		 * The meta object literal for the '<em><b>Get Alarm OCL Expression</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___GET_ALARM_OCL_EXPRESSION__ETYPEDELEMENT = eINSTANCE.getSymphony__CommonEMFFacade__GetAlarmOCLExpression__ETypedElement();

			/**
		 * The meta object literal for the '<em><b>Get Out Of Range OCL Expression</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___GET_OUT_OF_RANGE_OCL_EXPRESSION__ETYPEDELEMENT = eINSTANCE.getSymphony__CommonEMFFacade__GetOutOfRangeOCLExpression__ETypedElement();

			/**
		 * The meta object literal for the '<em><b>Get Warning Min Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___GET_WARNING_MIN_VALUE__ETYPEDELEMENT = eINSTANCE.getSymphony__CommonEMFFacade__GetWarningMinValue__ETypedElement();

			/**
		 * The meta object literal for the '<em><b>Get Warning Max Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___GET_WARNING_MAX_VALUE__ETYPEDELEMENT = eINSTANCE.getSymphony__CommonEMFFacade__GetWarningMaxValue__ETypedElement();

			/**
		 * The meta object literal for the '<em><b>Get Alarm Min Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___GET_ALARM_MIN_VALUE__ETYPEDELEMENT = eINSTANCE.getSymphony__CommonEMFFacade__GetAlarmMinValue__ETypedElement();

			/**
		 * The meta object literal for the '<em><b>Get Alarm Max Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___GET_ALARM_MAX_VALUE__ETYPEDELEMENT = eINSTANCE.getSymphony__CommonEMFFacade__GetAlarmMaxValue__ETypedElement();

			/**
		 * The meta object literal for the '<em><b>Get Out Of Range Min Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___GET_OUT_OF_RANGE_MIN_VALUE__ETYPEDELEMENT = eINSTANCE.getSymphony__CommonEMFFacade__GetOutOfRangeMinValue__ETypedElement();

			/**
		 * The meta object literal for the '<em><b>Get Out Of Range Max Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___GET_OUT_OF_RANGE_MAX_VALUE__ETYPEDELEMENT = eINSTANCE.getSymphony__CommonEMFFacade__GetOutOfRangeMaxValue__ETypedElement();

			/**
		 * The meta object literal for the '<em><b>Get Range</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___GET_RANGE__ETYPEDELEMENT_OBJECT = eINSTANCE.getSymphony__CommonEMFFacade__GetRange__ETypedElement_Object();

			/**
		 * The meta object literal for the '<em><b>Get Full Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___GET_FULL_DESCRIPTION__ETYPEDELEMENT = eINSTANCE.getSymphony__CommonEMFFacade__GetFullDescription__ETypedElement();

			/**
		 * The meta object literal for the '<em><b>Get Ancestries String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___GET_ANCESTRIES_STRING__ABSTRACTFEATURENODE = eINSTANCE.getSymphony__CommonEMFFacade__GetAncestriesString__AbstractFeatureNode();

			/**
		 * The meta object literal for the '<em><b>Get Feature Root</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___GET_FEATURE_ROOT__ABSTRACTFEATURENODE = eINSTANCE.getSymphony__CommonEMFFacade__GetFeatureRoot__AbstractFeatureNode();

			/**
		 * The meta object literal for the '<em><b>Get Ancestries</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___GET_ANCESTRIES__ABSTRACTFEATURENODE = eINSTANCE.getSymphony__CommonEMFFacade__GetAncestries__AbstractFeatureNode();

			/**
		 * The meta object literal for the '<em><b>Get Descendants</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___GET_DESCENDANTS__ABSTRACTFEATURENODE = eINSTANCE.getSymphony__CommonEMFFacade__GetDescendants__AbstractFeatureNode();

			/**
		 * The meta object literal for the '<em><b>Get Child EStructural Features</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___GET_CHILD_ESTRUCTURAL_FEATURES__ABSTRACTFEATURENODE = eINSTANCE.getSymphony__CommonEMFFacade__GetChildEStructuralFeatures__AbstractFeatureNode();

			/**
		 * The meta object literal for the '<em><b>Resolve</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___RESOLVE__EOBJECT_ABSTRACTFEATURENODE = eINSTANCE.getSymphony__CommonEMFFacade__Resolve__EObject_AbstractFeatureNode();

			/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___SET_VALUE__EOBJECT_ABSTRACTFEATURENODE_OBJECT = eINSTANCE.getSymphony__CommonEMFFacade__SetValue__EObject_AbstractFeatureNode_Object();

			/**
		 * The meta object literal for the '<em><b>Is Resolved</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___IS_RESOLVED__EOBJECT_ABSTRACTFEATURENODE = eINSTANCE.getSymphony__CommonEMFFacade__IsResolved__EObject_AbstractFeatureNode();

			/**
		 * The meta object literal for the '<em><b>Get Leaf</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___GET_LEAF__LISTROOTNODE = eINSTANCE.getSymphony__CommonEMFFacade__GetLeaf__ListRootNode();

			/**
		 * The meta object literal for the '<em><b>Get File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___GET_FILE__RESOURCE = eINSTANCE.getSymphony__CommonEMFFacade__GetFile__Resource();

			/**
		 * The meta object literal for the '<em><b>Get Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___GET_CONTENT__URI = eINSTANCE.getSymphony__CommonEMFFacade__GetContent__URI();

			/**
		 * The meta object literal for the '<em><b>Sort Timed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___SORT_TIMED__COLLECTION = eINSTANCE.getSymphony__CommonEMFFacade__SortTimed__Collection();

			/**
		 * The meta object literal for the '<em><b>Get Time Span</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___GET_TIME_SPAN__COLLECTION = eINSTANCE.getSymphony__CommonEMFFacade__GetTimeSpan__Collection();

			/**
		 * The meta object literal for the '<em><b>Get ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_EMF_FACADE___GET_ID__EOBJECT = eINSTANCE.getSymphony__CommonEMFFacade__GetID__EObject();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.emf.Named <em>Named</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.emf.Named
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getNamed()
		 * @generated
		 */
    EClass NAMED = eINSTANCE.getNamed();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NAMED__NAME = eINSTANCE.getNamed_Name();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.emf.Described <em>Described</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.emf.Described
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getDescribed()
		 * @generated
		 */
    EClass DESCRIBED = eINSTANCE.getDescribed();

    /**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DESCRIBED__DESCRIPTION = eINSTANCE.getDescribed_Description();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.emf.Timed <em>Timed</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.emf.Timed
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getTimed()
		 * @generated
		 */
    EClass TIMED = eINSTANCE.getTimed();

    /**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TIMED__TIME = eINSTANCE.getTimed_Time();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.emf.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.emf.impl.ServerImpl
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

				/**
		 * The meta object literal for the '<em><b>Server Job</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__SERVER_JOB = eINSTANCE.getServer_ServerJob();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.emf.impl.StartableImpl <em>Startable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.emf.impl.StartableImpl
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getStartable()
		 * @generated
		 */
		EClass STARTABLE = eINSTANCE.getStartable();

				/**
		 * The meta object literal for the '<em><b>Started</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STARTABLE__STARTED = eINSTANCE.getStartable_Started();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.emf.impl.TimeSourcesListImpl <em>Time Sources List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.emf.impl.TimeSourcesListImpl
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getTimeSourcesList()
		 * @generated
		 */
		EClass TIME_SOURCES_LIST = eINSTANCE.getTimeSourcesList();

				/**
		 * The meta object literal for the '<em><b>Time Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SOURCES_LIST__TIME_SOURCES = eINSTANCE.getTimeSourcesList_TimeSources();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.emf.impl.TimeSourceImpl <em>Time Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.emf.impl.TimeSourceImpl
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getTimeSource()
		 * @generated
		 */
		EClass TIME_SOURCE = eINSTANCE.getTimeSource();

				/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SOURCE__OFFSET = eINSTANCE.getTimeSource_Offset();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.emf.impl.FixedTimeSourceImpl <em>Fixed Time Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.emf.impl.FixedTimeSourceImpl
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getFixedTimeSource()
		 * @generated
		 */
		EClass FIXED_TIME_SOURCE = eINSTANCE.getFixedTimeSource();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.emf.impl.CurrentTimeSourceImpl <em>Current Time Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.emf.impl.CurrentTimeSourceImpl
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getCurrentTimeSource()
		 * @generated
		 */
		EClass CURRENT_TIME_SOURCE = eINSTANCE.getCurrentTimeSource();

				/**
		 * The meta object literal for the '<em><b>Update Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_TIME_SOURCE__UPDATE_PERIOD = eINSTANCE.getCurrentTimeSource_UpdatePeriod();

				/**
		 * The meta object literal for the '<em><b>Paused</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_TIME_SOURCE__PAUSED = eINSTANCE.getCurrentTimeSource_Paused();

				/**
		 * The meta object literal for the '<em><b>Pause</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CURRENT_TIME_SOURCE___PAUSE = eINSTANCE.getCurrentTimeSource__Pause();

				/**
		 * The meta object literal for the '<em><b>Resume</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CURRENT_TIME_SOURCE___RESUME = eINSTANCE.getCurrentTimeSource__Resume();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.emf.impl.BrowseableTimeSourceImpl <em>Browseable Time Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.emf.impl.BrowseableTimeSourceImpl
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getBrowseableTimeSource()
		 * @generated
		 */
		EClass BROWSEABLE_TIME_SOURCE = eINSTANCE.getBrowseableTimeSource();

				/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROWSEABLE_TIME_SOURCE__START_TIME = eINSTANCE.getBrowseableTimeSource_StartTime();

				/**
		 * The meta object literal for the '<em><b>Update Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROWSEABLE_TIME_SOURCE__UPDATE_PERIOD = eINSTANCE.getBrowseableTimeSource_UpdatePeriod();

				/**
		 * The meta object literal for the '<em><b>Time Acceration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROWSEABLE_TIME_SOURCE__TIME_ACCERATION = eINSTANCE.getBrowseableTimeSource_TimeAcceration();

				/**
		 * The meta object literal for the '<em><b>Time Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROWSEABLE_TIME_SOURCE__TIME_DIRECTION = eINSTANCE.getBrowseableTimeSource_TimeDirection();

				/**
		 * The meta object literal for the '<em><b>Play Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BROWSEABLE_TIME_SOURCE___PLAY_FORWARD = eINSTANCE.getBrowseableTimeSource__PlayForward();

				/**
		 * The meta object literal for the '<em><b>Play Reverse</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BROWSEABLE_TIME_SOURCE___PLAY_REVERSE = eINSTANCE.getBrowseableTimeSource__PlayReverse();

				/**
		 * The meta object literal for the '<em><b>Pause</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BROWSEABLE_TIME_SOURCE___PAUSE = eINSTANCE.getBrowseableTimeSource__Pause();

				/**
		 * The meta object literal for the '<em><b>Reset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BROWSEABLE_TIME_SOURCE___RESET = eINSTANCE.getBrowseableTimeSource__Reset();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.emf.impl.SelectionBasedTimeSourceImpl <em>Selection Based Time Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.emf.impl.SelectionBasedTimeSourceImpl
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getSelectionBasedTimeSource()
		 * @generated
		 */
		EClass SELECTION_BASED_TIME_SOURCE = eINSTANCE.getSelectionBasedTimeSource();

				/**
		 * The meta object literal for the '<em><b>Set Selection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SELECTION_BASED_TIME_SOURCE___SET_SELECTION__TIMED = eINSTANCE.getSelectionBasedTimeSource__SetSelection__Timed();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.emf.impl.CollectionTimedTimeSourceImpl <em>Collection Timed Time Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.emf.impl.CollectionTimedTimeSourceImpl
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getCollectionTimedTimeSource()
		 * @generated
		 */
		EClass COLLECTION_TIMED_TIME_SOURCE = eINSTANCE.getCollectionTimedTimeSource();

				/**
		 * The meta object literal for the '<em><b>Loop Enable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_TIMED_TIME_SOURCE__LOOP_ENABLE = eINSTANCE.getCollectionTimedTimeSource_LoopEnable();

				/**
		 * The meta object literal for the '<em><b>Timeds List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_TIMED_TIME_SOURCE__TIMEDS_LIST = eINSTANCE.getCollectionTimedTimeSource_TimedsList();

				/**
		 * The meta object literal for the '<em><b>Current Timed Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_TIMED_TIME_SOURCE__CURRENT_TIMED_ELEMENT = eINSTANCE.getCollectionTimedTimeSource_CurrentTimedElement();

				/**
		 * The meta object literal for the '<em><b>Earliest Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_TIMED_TIME_SOURCE__EARLIEST_DATE = eINSTANCE.getCollectionTimedTimeSource_EarliestDate();

				/**
		 * The meta object literal for the '<em><b>Latest Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_TIMED_TIME_SOURCE__LATEST_DATE = eINSTANCE.getCollectionTimedTimeSource_LatestDate();

				/**
		 * The meta object literal for the '<em><b>Jump To Next</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLLECTION_TIMED_TIME_SOURCE___JUMP_TO_NEXT = eINSTANCE.getCollectionTimedTimeSource__JumpToNext();

				/**
		 * The meta object literal for the '<em><b>Jump To Previous</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLLECTION_TIMED_TIME_SOURCE___JUMP_TO_PREVIOUS = eINSTANCE.getCollectionTimedTimeSource__JumpToPrevious();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.emf.Disposable <em>Disposable</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.emf.Disposable
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getDisposable()
		 * @generated
		 */
    EClass DISPOSABLE = eINSTANCE.getDisposable();

    /**
		 * The meta object literal for the '<em><b>Dispose</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation DISPOSABLE___DISPOSE = eINSTANCE.getDisposable__Dispose();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.emf.impl.AbstractFeatureNodeImpl <em>Abstract Feature Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.emf.impl.AbstractFeatureNodeImpl
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getAbstractFeatureNode()
		 * @generated
		 */
    EClass ABSTRACT_FEATURE_NODE = eINSTANCE.getAbstractFeatureNode();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.emf.impl.FeatureNodeAdapterImpl <em>Feature Node Adapter</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.emf.impl.FeatureNodeAdapterImpl
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getFeatureNodeAdapter()
		 * @generated
		 */
    EClass FEATURE_NODE_ADAPTER = eINSTANCE.getFeatureNodeAdapter();

    /**
		 * The meta object literal for the '<em><b>Source Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference FEATURE_NODE_ADAPTER__SOURCE_OBJECT = eINSTANCE.getFeatureNodeAdapter_SourceObject();

    /**
		 * The meta object literal for the '<em><b>Feature Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference FEATURE_NODE_ADAPTER__FEATURE_NODE = eINSTANCE.getFeatureNodeAdapter_FeatureNode();

    /**
		 * The meta object literal for the '<em><b>Current Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FEATURE_NODE_ADAPTER__CURRENT_VALUE = eINSTANCE.getFeatureNodeAdapter_CurrentValue();

    /**
		 * The meta object literal for the '<em><b>Resolved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FEATURE_NODE_ADAPTER__RESOLVED = eINSTANCE.getFeatureNodeAdapter_Resolved();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.emf.impl.AbstractFeatureListNodeImpl <em>Abstract Feature List Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.emf.impl.AbstractFeatureListNodeImpl
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getAbstractFeatureListNode()
		 * @generated
		 */
    EClass ABSTRACT_FEATURE_LIST_NODE = eINSTANCE.getAbstractFeatureListNode();

    /**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_FEATURE_LIST_NODE__PARENT = eINSTANCE.getAbstractFeatureListNode_Parent();

    /**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_FEATURE_LIST_NODE__CHILD = eINSTANCE.getAbstractFeatureListNode_Child();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.emf.impl.AbstractFeatureTreeNodeImpl <em>Abstract Feature Tree Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.emf.impl.AbstractFeatureTreeNodeImpl
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getAbstractFeatureTreeNode()
		 * @generated
		 */
    EClass ABSTRACT_FEATURE_TREE_NODE = eINSTANCE.getAbstractFeatureTreeNode();

    /**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_FEATURE_TREE_NODE__PARENT = eINSTANCE.getAbstractFeatureTreeNode_Parent();

    /**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_FEATURE_TREE_NODE__CHILDREN = eINSTANCE.getAbstractFeatureTreeNode_Children();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.emf.impl.AbstractRootNodeImpl <em>Abstract Root Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.emf.impl.AbstractRootNodeImpl
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getAbstractRootNode()
		 * @generated
		 */
    EClass ABSTRACT_ROOT_NODE = eINSTANCE.getAbstractRootNode();

    /**
		 * The meta object literal for the '<em><b>Source Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_ROOT_NODE__SOURCE_CLASS = eINSTANCE.getAbstractRootNode_SourceClass();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.emf.impl.TreeRootNodeImpl <em>Tree Root Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.emf.impl.TreeRootNodeImpl
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getTreeRootNode()
		 * @generated
		 */
    EClass TREE_ROOT_NODE = eINSTANCE.getTreeRootNode();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.emf.impl.TreeFeatureNodeImpl <em>Tree Feature Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.emf.impl.TreeFeatureNodeImpl
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getTreeFeatureNode()
		 * @generated
		 */
    EClass TREE_FEATURE_NODE = eINSTANCE.getTreeFeatureNode();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.emf.impl.ListRootNodeImpl <em>List Root Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.emf.impl.ListRootNodeImpl
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getListRootNode()
		 * @generated
		 */
    EClass LIST_ROOT_NODE = eINSTANCE.getListRootNode();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.emf.impl.ListFeatureNodeImpl <em>List Feature Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.emf.impl.ListFeatureNodeImpl
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getListFeatureNode()
		 * @generated
		 */
    EClass LIST_FEATURE_NODE = eINSTANCE.getListFeatureNode();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.emf.impl.AbstractFeatureSpecifierImpl <em>Abstract Feature Specifier</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.emf.impl.AbstractFeatureSpecifierImpl
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getAbstractFeatureSpecifier()
		 * @generated
		 */
    EClass ABSTRACT_FEATURE_SPECIFIER = eINSTANCE.getAbstractFeatureSpecifier();

    /**
		 * The meta object literal for the '<em><b>Structural Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_FEATURE_SPECIFIER__STRUCTURAL_FEATURE = eINSTANCE.getAbstractFeatureSpecifier_StructuralFeature();

    /**
		 * The meta object literal for the '<em><b>Multi Valued</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ABSTRACT_FEATURE_SPECIFIER__MULTI_VALUED = eINSTANCE.getAbstractFeatureSpecifier_MultiValued();

    /**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ABSTRACT_FEATURE_SPECIFIER__INDEX = eINSTANCE.getAbstractFeatureSpecifier_Index();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.emf.TimeDirection <em>Time Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.emf.TimeDirection
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getTimeDirection()
		 * @generated
		 */
		EEnum TIME_DIRECTION = eINSTANCE.getTimeDirection();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.emf.Ranges <em>Ranges</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.emf.Ranges
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getRanges()
		 * @generated
		 */
    EEnum RANGES = eINSTANCE.getRanges();

    /**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getException()
		 * @generated
		 */
    EDataType EXCEPTION = eINSTANCE.getException();

    /**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getList()
		 * @generated
		 */
    EDataType LIST = eINSTANCE.getList();

    /**
		 * The meta object literal for the '<em>Sorted Set</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.util.SortedSet
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getSortedSet()
		 * @generated
		 */
    EDataType SORTED_SET = eINSTANCE.getSortedSet();

    /**
		 * The meta object literal for the '<em>EClass Filter</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.emf.EClassFilter
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getEClassFilter()
		 * @generated
		 */
    EDataType ECLASS_FILTER = eINSTANCE.getEClassFilter();

    /**
		 * The meta object literal for the '<em>Number</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.lang.Number
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getNumber()
		 * @generated
		 */
    EDataType NUMBER = eINSTANCE.getNumber();

    /**
		 * The meta object literal for the '<em>IFile</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IFile
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getIFile()
		 * @generated
		 */
    EDataType IFILE = eINSTANCE.getIFile();

    /**
		 * The meta object literal for the '<em>Resource</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.resource.Resource
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getResource()
		 * @generated
		 */
    EDataType RESOURCE = eINSTANCE.getResource();

    /**
		 * The meta object literal for the '<em>Unit</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see javax.measure.unit.Unit
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getUnit()
		 * @generated
		 */
    EDataType UNIT = eINSTANCE.getUnit();

				/**
		 * The meta object literal for the '<em>Collection</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Collection
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getCollection()
		 * @generated
		 */
		EDataType COLLECTION = eINSTANCE.getCollection();

				/**
		 * The meta object literal for the '<em>EList</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.EList
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getEList()
		 * @generated
		 */
		EDataType ELIST = eINSTANCE.getEList();

				/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.URI
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

				/**
		 * The meta object literal for the '<em>Job</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.jobs.Job
		 * @see org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFPackageImpl#getJob()
		 * @generated
		 */
		EDataType JOB = eINSTANCE.getJob();

  }

} //Symphony__CommonEMFPackage
