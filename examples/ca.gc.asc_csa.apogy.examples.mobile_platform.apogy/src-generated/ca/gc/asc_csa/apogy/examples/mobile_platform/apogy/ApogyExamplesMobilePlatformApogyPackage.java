package ca.gc.asc_csa.apogy.examples.mobile_platform.apogy;
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
import org.eclipse.emf.ecore.EPackage;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage;

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
 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.ApogyExamplesMobilePlatformApogyFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyExamplesMobilePlatformApogy' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyExamplesMobilePlatformApogy' dynamicTemplates='true' templateDirectory='platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates' modelDirectory='/ca.gc.asc_csa.apogy.examples.mobile_platform.apogy/src-generated' editDirectory='/ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.examples.mobile_platform'"
 * @generated
 */
public interface ApogyExamplesMobilePlatformApogyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "apogy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.examples.mobile_platform.apogy";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "apogy";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyExamplesMobilePlatformApogyPackage eINSTANCE = ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.impl.ApogyExamplesMobilePlatformApogyPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.impl.MobilePlatformApogySystemApiAdapterImpl <em>Mobile Platform Apogy System Api Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.impl.MobilePlatformApogySystemApiAdapterImpl
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.impl.ApogyExamplesMobilePlatformApogyPackageImpl#getMobilePlatformApogySystemApiAdapter()
	 * @generated
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_API_ADAPTER = 0;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_API_ADAPTER__ENVIRONMENT = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_API_ADAPTER__INSTANCE = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_API_ADAPTER__ELEMENT_TYPE = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_API_ADAPTER__POSE_TRANSFORM = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_TRANSFORM;

	/**
	 * The feature id for the '<em><b>Pose Corrector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_API_ADAPTER__POSE_CORRECTOR = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_CORRECTOR;

	/**
	 * The feature id for the '<em><b>Apogy System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_API_ADAPTER__APOGY_SYSTEM = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__APOGY_SYSTEM;

	/**
	 * The number of structural features of the '<em>Mobile Platform Apogy System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_API_ADAPTER_FEATURE_COUNT = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA;

	/**
	 * The operation id for the '<em>Create Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_API_ADAPTER___CREATE_INITIALIZATION_DATA = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___CREATE_INITIALIZATION_DATA;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA;

	/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL;

	/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_API_ADAPTER___DISPOSE = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___DISPOSE;

	/**
	 * The operation id for the '<em>Create Result Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL;

	/**
	 * The number of operations of the '<em>Mobile Platform Apogy System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_API_ADAPTER_OPERATION_COUNT = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.impl.MobilePlatformDataImpl <em>Mobile Platform Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.impl.MobilePlatformDataImpl
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.impl.ApogyExamplesMobilePlatformApogyPackageImpl#getMobilePlatformData()
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
	int MOBILE_PLATFORM_DATA__INITIAL_POSE_TRANSFORM = ApogyCorePackage.APOGY_INITIALIZATION_DATA__INITIAL_POSE_TRANSFORM;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_DATA__INITIALIZED = ApogyCorePackage.APOGY_INITIALIZATION_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_DATA__DISPOSED = ApogyCorePackage.APOGY_INITIALIZATION_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Linear Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_DATA__LINEAR_VELOCITY = ApogyCorePackage.APOGY_INITIALIZATION_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Angular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_DATA__ANGULAR_VELOCITY = ApogyCorePackage.APOGY_INITIALIZATION_DATA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Mobile Platform Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_DATA_FEATURE_COUNT = ApogyCorePackage.APOGY_INITIALIZATION_DATA_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Mobile Platform Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_DATA_OPERATION_COUNT = ApogyCorePackage.APOGY_INITIALIZATION_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.impl.MobilePlatformApogySystemAnnotationImpl <em>Mobile Platform Apogy System Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.impl.MobilePlatformApogySystemAnnotationImpl
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.impl.ApogyExamplesMobilePlatformApogyPackageImpl#getMobilePlatformApogySystemAnnotation()
	 * @generated
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_ANNOTATION__VISIBLE = ApogySurfaceEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_ANNOTATION__VARIABLE = ApogySurfaceEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Variable Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_ANNOTATION__VARIABLE_INSTANCE = ApogySurfaceEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VARIABLE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Apogy System Api Adapter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_ANNOTATION__APOGY_SYSTEM_API_ADAPTER = ApogySurfaceEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__APOGY_SYSTEM_API_ADAPTER;

	/**
	 * The feature id for the '<em><b>Vectorlength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_ANNOTATION__VECTORLENGTH = ApogySurfaceEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VECTORLENGTH;

	/**
	 * The feature id for the '<em><b>Vector Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_ANNOTATION__VECTOR_COLOR = ApogySurfaceEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VECTOR_COLOR;

	/**
	 * The feature id for the '<em><b>Show Pose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_ANNOTATION__SHOW_POSE = ApogySurfaceEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__SHOW_POSE;

	/**
	 * The number of structural features of the '<em>Mobile Platform Apogy System Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_ANNOTATION_FEATURE_COUNT = ApogySurfaceEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get XY Shape Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_ANNOTATION___GET_XY_SHAPE_ANNOTATION = ApogySurfaceEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION___GET_XY_SHAPE_ANNOTATION;

	/**
	 * The operation id for the '<em>Update Pose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_ANNOTATION___UPDATE_POSE__MATRIX4X4 = ApogySurfaceEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION___UPDATE_POSE__MATRIX4X4;

	/**
	 * The operation id for the '<em>Update Pose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_ANNOTATION___UPDATE_POSE__DOUBLE_DOUBLE_DOUBLE = ApogySurfaceEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION___UPDATE_POSE__DOUBLE_DOUBLE_DOUBLE;

	/**
	 * The number of operations of the '<em>Mobile Platform Apogy System Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_APOGY_SYSTEM_ANNOTATION_OPERATION_COUNT = ApogySurfaceEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.MobilePlatformApogySystemApiAdapter <em>Mobile Platform Apogy System Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mobile Platform Apogy System Api Adapter</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.MobilePlatformApogySystemApiAdapter
	 * @generated
	 */
	EClass getMobilePlatformApogySystemApiAdapter();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.MobilePlatformData <em>Mobile Platform Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mobile Platform Data</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.MobilePlatformData
	 * @generated
	 */
	EClass getMobilePlatformData();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.MobilePlatformData#isInitialized <em>Initialized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialized</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.MobilePlatformData#isInitialized()
	 * @see #getMobilePlatformData()
	 * @generated
	 */
	EAttribute getMobilePlatformData_Initialized();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.MobilePlatformData#isDisposed <em>Disposed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disposed</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.MobilePlatformData#isDisposed()
	 * @see #getMobilePlatformData()
	 * @generated
	 */
	EAttribute getMobilePlatformData_Disposed();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.MobilePlatformData#getLinearVelocity <em>Linear Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Linear Velocity</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.MobilePlatformData#getLinearVelocity()
	 * @see #getMobilePlatformData()
	 * @generated
	 */
	EAttribute getMobilePlatformData_LinearVelocity();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.MobilePlatformData#getAngularVelocity <em>Angular Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angular Velocity</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.MobilePlatformData#getAngularVelocity()
	 * @see #getMobilePlatformData()
	 * @generated
	 */
	EAttribute getMobilePlatformData_AngularVelocity();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.MobilePlatformApogySystemAnnotation <em>Mobile Platform Apogy System Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mobile Platform Apogy System Annotation</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.MobilePlatformApogySystemAnnotation
	 * @generated
	 */
	EClass getMobilePlatformApogySystemAnnotation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyExamplesMobilePlatformApogyFactory getApogyExamplesMobilePlatformApogyFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.impl.MobilePlatformApogySystemApiAdapterImpl <em>Mobile Platform Apogy System Api Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.impl.MobilePlatformApogySystemApiAdapterImpl
		 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.impl.ApogyExamplesMobilePlatformApogyPackageImpl#getMobilePlatformApogySystemApiAdapter()
		 * @generated
		 */
		EClass MOBILE_PLATFORM_APOGY_SYSTEM_API_ADAPTER = eINSTANCE.getMobilePlatformApogySystemApiAdapter();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.impl.MobilePlatformDataImpl <em>Mobile Platform Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.impl.MobilePlatformDataImpl
		 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.impl.ApogyExamplesMobilePlatformApogyPackageImpl#getMobilePlatformData()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.impl.MobilePlatformApogySystemAnnotationImpl <em>Mobile Platform Apogy System Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.impl.MobilePlatformApogySystemAnnotationImpl
		 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.impl.ApogyExamplesMobilePlatformApogyPackageImpl#getMobilePlatformApogySystemAnnotation()
		 * @generated
		 */
		EClass MOBILE_PLATFORM_APOGY_SYSTEM_ANNOTATION = eINSTANCE.getMobilePlatformApogySystemAnnotation();

	}

} //ApogyExamplesMobilePlatformApogyPackage
