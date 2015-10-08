/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.mobile_platform.symphony;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.symphony.core.SymphonyCorePackage;
import org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage;

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
 * @see org.eclipse.symphony.examples.mobile_platform.symphony.SymphonyExampleMobilePlatformFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='SymphonyExampleMobilePlatform' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015' modelName='SymphonyExampleMobilePlatform' modelDirectory='/org.eclipse.symphony.examples.mobile_platform.symphony/src-generated' editDirectory='/org.eclipse.symphony.examples.mobile_platform.symphony.edit/src-generated' basePackage='org.eclipse.symphony.examples.mobile_platform'"
 * @generated
 */
public interface SymphonyExampleMobilePlatformPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "symphony";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.symphony.examples.mobile_platform.symphony";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "symphony";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SymphonyExampleMobilePlatformPackage eINSTANCE = org.eclipse.symphony.examples.mobile_platform.symphony.impl.SymphonyExampleMobilePlatformPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.mobile_platform.symphony.impl.MobilePlatformSymphonySystemApiAdapterImpl <em>Mobile Platform Symphony System Api Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.mobile_platform.symphony.impl.MobilePlatformSymphonySystemApiAdapterImpl
	 * @see org.eclipse.symphony.examples.mobile_platform.symphony.impl.SymphonyExampleMobilePlatformPackageImpl#getMobilePlatformSymphonySystemApiAdapter()
	 * @generated
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_API_ADAPTER = 0;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_API_ADAPTER__ENVIRONMENT = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_API_ADAPTER__INSTANCE = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_API_ADAPTER__ELEMENT_TYPE = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_API_ADAPTER__POSE_TRANSFORM = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_TRANSFORM;

	/**
	 * The feature id for the '<em><b>Pose Corrector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR;

	/**
	 * The feature id for the '<em><b>Symphony System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_API_ADAPTER__SYMPHONY_SYSTEM = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__SYMPHONY_SYSTEM;

	/**
	 * The number of structural features of the '<em>Mobile Platform Symphony System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_API_ADAPTER_FEATURE_COUNT = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA;

	/**
	 * The operation id for the '<em>Create Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_INITIALIZATION_DATA = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_INITIALIZATION_DATA;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA;

	/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL;

	/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_API_ADAPTER___DISPOSE = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___DISPOSE;

	/**
	 * The operation id for the '<em>Create Result Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL;

	/**
	 * The number of operations of the '<em>Mobile Platform Symphony System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_API_ADAPTER_OPERATION_COUNT = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.mobile_platform.symphony.impl.MobilePlatformDataImpl <em>Mobile Platform Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.mobile_platform.symphony.impl.MobilePlatformDataImpl
	 * @see org.eclipse.symphony.examples.mobile_platform.symphony.impl.SymphonyExampleMobilePlatformPackageImpl#getMobilePlatformData()
	 * @generated
	 */
	int MOBILE_PLATFORM_DATA = 1;

	/**
	 * The feature id for the '<em><b>Initial Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_DATA__INITIAL_POSE_TRANSFORM = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA__INITIAL_POSE_TRANSFORM;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_DATA__INITIALIZED = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_DATA__DISPOSED = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Linear Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_DATA__LINEAR_VELOCITY = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Angular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_DATA__ANGULAR_VELOCITY = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Mobile Platform Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_DATA_FEATURE_COUNT = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Mobile Platform Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_DATA_OPERATION_COUNT = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.mobile_platform.symphony.impl.MobilePlatformSymphonySystemAnnotationImpl <em>Mobile Platform Symphony System Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.mobile_platform.symphony.impl.MobilePlatformSymphonySystemAnnotationImpl
	 * @see org.eclipse.symphony.examples.mobile_platform.symphony.impl.SymphonyExampleMobilePlatformPackageImpl#getMobilePlatformSymphonySystemAnnotation()
	 * @generated
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_ANNOTATION__VISIBLE = SymphonyEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_ANNOTATION__VARIABLE = SymphonyEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Variable Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_ANNOTATION__VARIABLE_INSTANCE = SymphonyEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VARIABLE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Symphony System Api Adapter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_ANNOTATION__SYMPHONY_SYSTEM_API_ADAPTER = SymphonyEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__SYMPHONY_SYSTEM_API_ADAPTER;

	/**
	 * The feature id for the '<em><b>Vectorlength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_ANNOTATION__VECTORLENGTH = SymphonyEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VECTORLENGTH;

	/**
	 * The feature id for the '<em><b>Vector Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_ANNOTATION__VECTOR_COLOR = SymphonyEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VECTOR_COLOR;

	/**
	 * The feature id for the '<em><b>Show Pose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_ANNOTATION__SHOW_POSE = SymphonyEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__SHOW_POSE;

	/**
	 * The number of structural features of the '<em>Mobile Platform Symphony System Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_ANNOTATION_FEATURE_COUNT = SymphonyEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get XY Shape Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_ANNOTATION___GET_XY_SHAPE_ANNOTATION = SymphonyEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION___GET_XY_SHAPE_ANNOTATION;

	/**
	 * The operation id for the '<em>Update Pose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_ANNOTATION___UPDATE_POSE__MATRIX4X4 = SymphonyEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION___UPDATE_POSE__MATRIX4X4;

	/**
	 * The operation id for the '<em>Update Pose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_ANNOTATION___UPDATE_POSE__DOUBLE_DOUBLE_DOUBLE = SymphonyEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION___UPDATE_POSE__DOUBLE_DOUBLE_DOUBLE;

	/**
	 * The number of operations of the '<em>Mobile Platform Symphony System Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_SYMPHONY_SYSTEM_ANNOTATION_OPERATION_COUNT = SymphonyEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.mobile_platform.symphony.MobilePlatformSymphonySystemApiAdapter <em>Mobile Platform Symphony System Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mobile Platform Symphony System Api Adapter</em>'.
	 * @see org.eclipse.symphony.examples.mobile_platform.symphony.MobilePlatformSymphonySystemApiAdapter
	 * @generated
	 */
	EClass getMobilePlatformSymphonySystemApiAdapter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.mobile_platform.symphony.MobilePlatformData <em>Mobile Platform Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mobile Platform Data</em>'.
	 * @see org.eclipse.symphony.examples.mobile_platform.symphony.MobilePlatformData
	 * @generated
	 */
	EClass getMobilePlatformData();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.mobile_platform.symphony.MobilePlatformData#isInitialized <em>Initialized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialized</em>'.
	 * @see org.eclipse.symphony.examples.mobile_platform.symphony.MobilePlatformData#isInitialized()
	 * @see #getMobilePlatformData()
	 * @generated
	 */
	EAttribute getMobilePlatformData_Initialized();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.mobile_platform.symphony.MobilePlatformData#isDisposed <em>Disposed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disposed</em>'.
	 * @see org.eclipse.symphony.examples.mobile_platform.symphony.MobilePlatformData#isDisposed()
	 * @see #getMobilePlatformData()
	 * @generated
	 */
	EAttribute getMobilePlatformData_Disposed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.mobile_platform.symphony.MobilePlatformData#getLinearVelocity <em>Linear Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Linear Velocity</em>'.
	 * @see org.eclipse.symphony.examples.mobile_platform.symphony.MobilePlatformData#getLinearVelocity()
	 * @see #getMobilePlatformData()
	 * @generated
	 */
	EAttribute getMobilePlatformData_LinearVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.mobile_platform.symphony.MobilePlatformData#getAngularVelocity <em>Angular Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angular Velocity</em>'.
	 * @see org.eclipse.symphony.examples.mobile_platform.symphony.MobilePlatformData#getAngularVelocity()
	 * @see #getMobilePlatformData()
	 * @generated
	 */
	EAttribute getMobilePlatformData_AngularVelocity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.mobile_platform.symphony.MobilePlatformSymphonySystemAnnotation <em>Mobile Platform Symphony System Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mobile Platform Symphony System Annotation</em>'.
	 * @see org.eclipse.symphony.examples.mobile_platform.symphony.MobilePlatformSymphonySystemAnnotation
	 * @generated
	 */
	EClass getMobilePlatformSymphonySystemAnnotation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SymphonyExampleMobilePlatformFactory getSymphonyExampleMobilePlatformFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.mobile_platform.symphony.impl.MobilePlatformSymphonySystemApiAdapterImpl <em>Mobile Platform Symphony System Api Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.mobile_platform.symphony.impl.MobilePlatformSymphonySystemApiAdapterImpl
		 * @see org.eclipse.symphony.examples.mobile_platform.symphony.impl.SymphonyExampleMobilePlatformPackageImpl#getMobilePlatformSymphonySystemApiAdapter()
		 * @generated
		 */
		EClass MOBILE_PLATFORM_SYMPHONY_SYSTEM_API_ADAPTER = eINSTANCE.getMobilePlatformSymphonySystemApiAdapter();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.mobile_platform.symphony.impl.MobilePlatformDataImpl <em>Mobile Platform Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.mobile_platform.symphony.impl.MobilePlatformDataImpl
		 * @see org.eclipse.symphony.examples.mobile_platform.symphony.impl.SymphonyExampleMobilePlatformPackageImpl#getMobilePlatformData()
		 * @generated
		 */
		EClass MOBILE_PLATFORM_DATA = eINSTANCE.getMobilePlatformData();

		/**
		 * The meta object literal for the '<em><b>Initialized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBILE_PLATFORM_DATA__INITIALIZED = eINSTANCE.getMobilePlatformData_Initialized();

		/**
		 * The meta object literal for the '<em><b>Disposed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBILE_PLATFORM_DATA__DISPOSED = eINSTANCE.getMobilePlatformData_Disposed();

		/**
		 * The meta object literal for the '<em><b>Linear Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBILE_PLATFORM_DATA__LINEAR_VELOCITY = eINSTANCE.getMobilePlatformData_LinearVelocity();

		/**
		 * The meta object literal for the '<em><b>Angular Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBILE_PLATFORM_DATA__ANGULAR_VELOCITY = eINSTANCE.getMobilePlatformData_AngularVelocity();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.mobile_platform.symphony.impl.MobilePlatformSymphonySystemAnnotationImpl <em>Mobile Platform Symphony System Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.mobile_platform.symphony.impl.MobilePlatformSymphonySystemAnnotationImpl
		 * @see org.eclipse.symphony.examples.mobile_platform.symphony.impl.SymphonyExampleMobilePlatformPackageImpl#getMobilePlatformSymphonySystemAnnotation()
		 * @generated
		 */
		EClass MOBILE_PLATFORM_SYMPHONY_SYSTEM_ANNOTATION = eINSTANCE.getMobilePlatformSymphonySystemAnnotation();

	}

} //SymphonyExampleMobilePlatformPackage
