/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.lander.symphony;

import ca.gc.asc_csa.symphony.core.SymphonyCorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.eclipse.symphony.examples.lander.symphony.SymphonyExampleLanderFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='SymphonyExampleLander' copyrightText='Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015' modelName='SymphonyExampleLander' modelDirectory='/org.eclipse.symphony.examples.lander.symphony/src-generated' editDirectory='/org.eclipse.symphony.examples.lander.symphony.edit/src-generated' basePackage='org.eclipse.symphony.examples.lander'"
 * @generated
 */
public interface SymphonyExampleLanderPackage extends EPackage {
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
	String eNS_URI = "org.eclipse.symphony.examples.lander.symphony";

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
	SymphonyExampleLanderPackage eINSTANCE = org.eclipse.symphony.examples.lander.symphony.impl.SymphonyExampleLanderPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.lander.symphony.impl.LanderSymphonySystemApiAdapterImpl <em>Lander Symphony System Api Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.lander.symphony.impl.LanderSymphonySystemApiAdapterImpl
	 * @see org.eclipse.symphony.examples.lander.symphony.impl.SymphonyExampleLanderPackageImpl#getLanderSymphonySystemApiAdapter()
	 * @generated
	 */
	int LANDER_SYMPHONY_SYSTEM_API_ADAPTER = 0;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SYMPHONY_SYSTEM_API_ADAPTER__ENVIRONMENT = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SYMPHONY_SYSTEM_API_ADAPTER__INSTANCE = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SYMPHONY_SYSTEM_API_ADAPTER__ELEMENT_TYPE = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SYMPHONY_SYSTEM_API_ADAPTER__POSE_TRANSFORM = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_TRANSFORM;

	/**
	 * The feature id for the '<em><b>Pose Corrector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR;

	/**
	 * The feature id for the '<em><b>Symphony System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SYMPHONY_SYSTEM_API_ADAPTER__SYMPHONY_SYSTEM = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__SYMPHONY_SYSTEM;

	/**
	 * The number of structural features of the '<em>Lander Symphony System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SYMPHONY_SYSTEM_API_ADAPTER_FEATURE_COUNT = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SYMPHONY_SYSTEM_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SYMPHONY_SYSTEM_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA;

	/**
	 * The operation id for the '<em>Create Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_INITIALIZATION_DATA = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_INITIALIZATION_DATA;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SYMPHONY_SYSTEM_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA;

	/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL;

	/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SYMPHONY_SYSTEM_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SYMPHONY_SYSTEM_API_ADAPTER___DISPOSE = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___DISPOSE;

	/**
	 * The operation id for the '<em>Create Result Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL;

	/**
	 * The number of operations of the '<em>Lander Symphony System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SYMPHONY_SYSTEM_API_ADAPTER_OPERATION_COUNT = SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.lander.symphony.impl.LanderDataImpl <em>Lander Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.lander.symphony.impl.LanderDataImpl
	 * @see org.eclipse.symphony.examples.lander.symphony.impl.SymphonyExampleLanderPackageImpl#getLanderData()
	 * @generated
	 */
	int LANDER_DATA = 1;

	/**
	 * The feature id for the '<em><b>Initial Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_DATA__INITIAL_POSE_TRANSFORM = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA__INITIAL_POSE_TRANSFORM;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_DATA__INITIALIZED = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_DATA__DISPOSED = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Flying Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_DATA__FLYING_ENABLED = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Leg AExtension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_DATA__LEG_AEXTENSION = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Leg BExtension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_DATA__LEG_BEXTENSION = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Leg CExtension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_DATA__LEG_CEXTENSION = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Curr Thrust Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_DATA__CURR_THRUST_LEVEL = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Min Thrust Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_DATA__MIN_THRUST_LEVEL = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Max Thrust Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_DATA__MAX_THRUST_LEVEL = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>XAngular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_DATA__XANGULAR_VELOCITY = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>YAngular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_DATA__YANGULAR_VELOCITY = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Lander Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_DATA_FEATURE_COUNT = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Lander Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_DATA_OPERATION_COUNT = SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.lander.symphony.LanderSymphonySystemApiAdapter <em>Lander Symphony System Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lander Symphony System Api Adapter</em>'.
	 * @see org.eclipse.symphony.examples.lander.symphony.LanderSymphonySystemApiAdapter
	 * @generated
	 */
	EClass getLanderSymphonySystemApiAdapter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.lander.symphony.LanderData <em>Lander Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lander Data</em>'.
	 * @see org.eclipse.symphony.examples.lander.symphony.LanderData
	 * @generated
	 */
	EClass getLanderData();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.lander.symphony.LanderData#isInitialized <em>Initialized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialized</em>'.
	 * @see org.eclipse.symphony.examples.lander.symphony.LanderData#isInitialized()
	 * @see #getLanderData()
	 * @generated
	 */
	EAttribute getLanderData_Initialized();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.lander.symphony.LanderData#isDisposed <em>Disposed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disposed</em>'.
	 * @see org.eclipse.symphony.examples.lander.symphony.LanderData#isDisposed()
	 * @see #getLanderData()
	 * @generated
	 */
	EAttribute getLanderData_Disposed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.lander.symphony.LanderData#isFlyingEnabled <em>Flying Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flying Enabled</em>'.
	 * @see org.eclipse.symphony.examples.lander.symphony.LanderData#isFlyingEnabled()
	 * @see #getLanderData()
	 * @generated
	 */
	EAttribute getLanderData_FlyingEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.lander.symphony.LanderData#getLegAExtension <em>Leg AExtension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leg AExtension</em>'.
	 * @see org.eclipse.symphony.examples.lander.symphony.LanderData#getLegAExtension()
	 * @see #getLanderData()
	 * @generated
	 */
	EAttribute getLanderData_LegAExtension();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.lander.symphony.LanderData#getLegBExtension <em>Leg BExtension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leg BExtension</em>'.
	 * @see org.eclipse.symphony.examples.lander.symphony.LanderData#getLegBExtension()
	 * @see #getLanderData()
	 * @generated
	 */
	EAttribute getLanderData_LegBExtension();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.lander.symphony.LanderData#getLegCExtension <em>Leg CExtension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leg CExtension</em>'.
	 * @see org.eclipse.symphony.examples.lander.symphony.LanderData#getLegCExtension()
	 * @see #getLanderData()
	 * @generated
	 */
	EAttribute getLanderData_LegCExtension();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.lander.symphony.LanderData#getCurrThrustLevel <em>Curr Thrust Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curr Thrust Level</em>'.
	 * @see org.eclipse.symphony.examples.lander.symphony.LanderData#getCurrThrustLevel()
	 * @see #getLanderData()
	 * @generated
	 */
	EAttribute getLanderData_CurrThrustLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.lander.symphony.LanderData#getMinThrustLevel <em>Min Thrust Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Thrust Level</em>'.
	 * @see org.eclipse.symphony.examples.lander.symphony.LanderData#getMinThrustLevel()
	 * @see #getLanderData()
	 * @generated
	 */
	EAttribute getLanderData_MinThrustLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.lander.symphony.LanderData#getMaxThrustLevel <em>Max Thrust Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Thrust Level</em>'.
	 * @see org.eclipse.symphony.examples.lander.symphony.LanderData#getMaxThrustLevel()
	 * @see #getLanderData()
	 * @generated
	 */
	EAttribute getLanderData_MaxThrustLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.lander.symphony.LanderData#getXAngularVelocity <em>XAngular Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XAngular Velocity</em>'.
	 * @see org.eclipse.symphony.examples.lander.symphony.LanderData#getXAngularVelocity()
	 * @see #getLanderData()
	 * @generated
	 */
	EAttribute getLanderData_XAngularVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.lander.symphony.LanderData#getYAngularVelocity <em>YAngular Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YAngular Velocity</em>'.
	 * @see org.eclipse.symphony.examples.lander.symphony.LanderData#getYAngularVelocity()
	 * @see #getLanderData()
	 * @generated
	 */
	EAttribute getLanderData_YAngularVelocity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SymphonyExampleLanderFactory getSymphonyExampleLanderFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.lander.symphony.impl.LanderSymphonySystemApiAdapterImpl <em>Lander Symphony System Api Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.lander.symphony.impl.LanderSymphonySystemApiAdapterImpl
		 * @see org.eclipse.symphony.examples.lander.symphony.impl.SymphonyExampleLanderPackageImpl#getLanderSymphonySystemApiAdapter()
		 * @generated
		 */
		EClass LANDER_SYMPHONY_SYSTEM_API_ADAPTER = eINSTANCE.getLanderSymphonySystemApiAdapter();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.lander.symphony.impl.LanderDataImpl <em>Lander Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.lander.symphony.impl.LanderDataImpl
		 * @see org.eclipse.symphony.examples.lander.symphony.impl.SymphonyExampleLanderPackageImpl#getLanderData()
		 * @generated
		 */
		EClass LANDER_DATA = eINSTANCE.getLanderData();

		/**
		 * The meta object literal for the '<em><b>Initialized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDER_DATA__INITIALIZED = eINSTANCE.getLanderData_Initialized();

		/**
		 * The meta object literal for the '<em><b>Disposed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDER_DATA__DISPOSED = eINSTANCE.getLanderData_Disposed();

		/**
		 * The meta object literal for the '<em><b>Flying Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDER_DATA__FLYING_ENABLED = eINSTANCE.getLanderData_FlyingEnabled();

		/**
		 * The meta object literal for the '<em><b>Leg AExtension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDER_DATA__LEG_AEXTENSION = eINSTANCE.getLanderData_LegAExtension();

		/**
		 * The meta object literal for the '<em><b>Leg BExtension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDER_DATA__LEG_BEXTENSION = eINSTANCE.getLanderData_LegBExtension();

		/**
		 * The meta object literal for the '<em><b>Leg CExtension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDER_DATA__LEG_CEXTENSION = eINSTANCE.getLanderData_LegCExtension();

		/**
		 * The meta object literal for the '<em><b>Curr Thrust Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDER_DATA__CURR_THRUST_LEVEL = eINSTANCE.getLanderData_CurrThrustLevel();

		/**
		 * The meta object literal for the '<em><b>Min Thrust Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDER_DATA__MIN_THRUST_LEVEL = eINSTANCE.getLanderData_MinThrustLevel();

		/**
		 * The meta object literal for the '<em><b>Max Thrust Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDER_DATA__MAX_THRUST_LEVEL = eINSTANCE.getLanderData_MaxThrustLevel();

		/**
		 * The meta object literal for the '<em><b>XAngular Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDER_DATA__XANGULAR_VELOCITY = eINSTANCE.getLanderData_XAngularVelocity();

		/**
		 * The meta object literal for the '<em><b>YAngular Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDER_DATA__YANGULAR_VELOCITY = eINSTANCE.getLanderData_YAngularVelocity();

	}

} //SymphonyExampleLanderPackage
