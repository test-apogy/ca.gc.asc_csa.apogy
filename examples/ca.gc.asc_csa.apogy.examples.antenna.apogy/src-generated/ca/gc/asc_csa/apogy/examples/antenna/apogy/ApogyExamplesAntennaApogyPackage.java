package ca.gc.asc_csa.apogy.examples.antenna.apogy;
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
import org.eclipse.emf.ecore.EReference;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;

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
 * @see ca.gc.asc_csa.apogy.examples.antenna.apogy.ApogyExamplesAntennaApogyFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyExamplesAntennaApogy' copyrightText='Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyExamplesAntennaApogy' childCreationExtenders='true' extensibleProviderFactory='true' suppressGenModelAnnotations='false' dynamicTemplates='true' templateDirectory='platform:/plugin/ca.gc.asc_csa.apogy.common.emf/templates' modelDirectory='/ca.gc.asc_csa.apogy.examples.antenna.apogy/src-generated' editDirectory='/ca.gc.asc_csa.apogy.examples.antenna.apogy.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.examples.antenna'"
 * @generated
 */
public interface ApogyExamplesAntennaApogyPackage extends EPackage {
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
	String eNS_URI = "ca.gc.asc_csa.apogy.examples.antenna.apogy";

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
	ApogyExamplesAntennaApogyPackage eINSTANCE = ca.gc.asc_csa.apogy.examples.antenna.apogy.impl.ApogyExamplesAntennaApogyPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.antenna.apogy.impl.PTUDishAntennaApogySystemApiAdapterImpl <em>PTU Dish Antenna Apogy System Api Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.antenna.apogy.impl.PTUDishAntennaApogySystemApiAdapterImpl
	 * @see ca.gc.asc_csa.apogy.examples.antenna.apogy.impl.ApogyExamplesAntennaApogyPackageImpl#getPTUDishAntennaApogySystemApiAdapter()
	 * @generated
	 */
	int PTU_DISH_ANTENNA_APOGY_SYSTEM_API_ADAPTER = 0;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_APOGY_SYSTEM_API_ADAPTER__ENVIRONMENT = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_APOGY_SYSTEM_API_ADAPTER__INSTANCE = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_APOGY_SYSTEM_API_ADAPTER__ELEMENT_TYPE = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_APOGY_SYSTEM_API_ADAPTER__POSE_TRANSFORM = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_TRANSFORM;

	/**
	 * The feature id for the '<em><b>Pose Corrector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_APOGY_SYSTEM_API_ADAPTER__POSE_CORRECTOR = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_CORRECTOR;

	/**
	 * The feature id for the '<em><b>Apogy System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_APOGY_SYSTEM_API_ADAPTER__APOGY_SYSTEM = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__APOGY_SYSTEM;

	/**
	 * The number of structural features of the '<em>PTU Dish Antenna Apogy System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_APOGY_SYSTEM_API_ADAPTER_FEATURE_COUNT = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_APOGY_SYSTEM_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_APOGY_SYSTEM_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA;

	/**
	 * The operation id for the '<em>Create Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_APOGY_SYSTEM_API_ADAPTER___CREATE_INITIALIZATION_DATA = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___CREATE_INITIALIZATION_DATA;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_APOGY_SYSTEM_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA;

	/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_APOGY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL;

	/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_APOGY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_APOGY_SYSTEM_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_APOGY_SYSTEM_API_ADAPTER___DISPOSE = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___DISPOSE;

	/**
	 * The operation id for the '<em>Create Result Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_APOGY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL;

	/**
	 * The number of operations of the '<em>PTU Dish Antenna Apogy System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_APOGY_SYSTEM_API_ADAPTER_OPERATION_COUNT = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.antenna.apogy.impl.PTUDishAntennaDataImpl <em>PTU Dish Antenna Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.antenna.apogy.impl.PTUDishAntennaDataImpl
	 * @see ca.gc.asc_csa.apogy.examples.antenna.apogy.impl.ApogyExamplesAntennaApogyPackageImpl#getPTUDishAntennaData()
	 * @generated
	 */
	int PTU_DISH_ANTENNA_DATA = 1;

	/**
	 * The feature id for the '<em><b>Initial Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_DATA__INITIAL_POSE_TRANSFORM = ApogyCorePackage.APOGY_INITIALIZATION_DATA__INITIAL_POSE_TRANSFORM;

	/**
	 * The feature id for the '<em><b>Fov</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_DATA__FOV = ApogyCorePackage.APOGY_INITIALIZATION_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pan Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_DATA__PAN_ANGLE = ApogyCorePackage.APOGY_INITIALIZATION_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tilt Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_DATA__TILT_ANGLE = ApogyCorePackage.APOGY_INITIALIZATION_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tracking Sun</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_DATA__TRACKING_SUN = ApogyCorePackage.APOGY_INITIALIZATION_DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_DATA__INITIALIZED = ApogyCorePackage.APOGY_INITIALIZATION_DATA_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>PTU Dish Antenna Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_DATA_FEATURE_COUNT = ApogyCorePackage.APOGY_INITIALIZATION_DATA_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>PTU Dish Antenna Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTU_DISH_ANTENNA_DATA_OPERATION_COUNT = ApogyCorePackage.APOGY_INITIALIZATION_DATA_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaApogySystemApiAdapter <em>PTU Dish Antenna Apogy System Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PTU Dish Antenna Apogy System Api Adapter</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaApogySystemApiAdapter
	 * @generated
	 */
	EClass getPTUDishAntennaApogySystemApiAdapter();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaData <em>PTU Dish Antenna Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PTU Dish Antenna Data</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaData
	 * @generated
	 */
	EClass getPTUDishAntennaData();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaData#getFov <em>Fov</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fov</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaData#getFov()
	 * @see #getPTUDishAntennaData()
	 * @generated
	 */
	EReference getPTUDishAntennaData_Fov();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaData#getPanAngle <em>Pan Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pan Angle</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaData#getPanAngle()
	 * @see #getPTUDishAntennaData()
	 * @generated
	 */
	EAttribute getPTUDishAntennaData_PanAngle();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaData#getTiltAngle <em>Tilt Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tilt Angle</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaData#getTiltAngle()
	 * @see #getPTUDishAntennaData()
	 * @generated
	 */
	EAttribute getPTUDishAntennaData_TiltAngle();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaData#isTrackingSun <em>Tracking Sun</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tracking Sun</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaData#isTrackingSun()
	 * @see #getPTUDishAntennaData()
	 * @generated
	 */
	EAttribute getPTUDishAntennaData_TrackingSun();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaData#isInitialized <em>Initialized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialized</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaData#isInitialized()
	 * @see #getPTUDishAntennaData()
	 * @generated
	 */
	EAttribute getPTUDishAntennaData_Initialized();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyExamplesAntennaApogyFactory getApogyExamplesAntennaApogyFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.antenna.apogy.impl.PTUDishAntennaApogySystemApiAdapterImpl <em>PTU Dish Antenna Apogy System Api Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.antenna.apogy.impl.PTUDishAntennaApogySystemApiAdapterImpl
		 * @see ca.gc.asc_csa.apogy.examples.antenna.apogy.impl.ApogyExamplesAntennaApogyPackageImpl#getPTUDishAntennaApogySystemApiAdapter()
		 * @generated
		 */
		EClass PTU_DISH_ANTENNA_APOGY_SYSTEM_API_ADAPTER = eINSTANCE.getPTUDishAntennaApogySystemApiAdapter();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.antenna.apogy.impl.PTUDishAntennaDataImpl <em>PTU Dish Antenna Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.antenna.apogy.impl.PTUDishAntennaDataImpl
		 * @see ca.gc.asc_csa.apogy.examples.antenna.apogy.impl.ApogyExamplesAntennaApogyPackageImpl#getPTUDishAntennaData()
		 * @generated
		 */
		EClass PTU_DISH_ANTENNA_DATA = eINSTANCE.getPTUDishAntennaData();

		/**
		 * The meta object literal for the '<em><b>Fov</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTU_DISH_ANTENNA_DATA__FOV = eINSTANCE.getPTUDishAntennaData_Fov();

		/**
		 * The meta object literal for the '<em><b>Pan Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTU_DISH_ANTENNA_DATA__PAN_ANGLE = eINSTANCE.getPTUDishAntennaData_PanAngle();

		/**
		 * The meta object literal for the '<em><b>Tilt Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTU_DISH_ANTENNA_DATA__TILT_ANGLE = eINSTANCE.getPTUDishAntennaData_TiltAngle();

		/**
		 * The meta object literal for the '<em><b>Tracking Sun</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTU_DISH_ANTENNA_DATA__TRACKING_SUN = eINSTANCE.getPTUDishAntennaData_TrackingSun();

		/**
		 * The meta object literal for the '<em><b>Initialized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTU_DISH_ANTENNA_DATA__INITIALIZED = eINSTANCE.getPTUDishAntennaData_Initialized();

	}

} //ApogyExamplesAntennaApogyPackage
