package ca.gc.asc_csa.apogy.examples.satellite.apogy;
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
 * @see ca.gc.asc_csa.apogy.examples.satellite.apogy.ApogyExamplesSatelliteApogyFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyExamplesSatelliteApogy' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\nContributors:\nCanadian Space Agency (CSA) - Initial API and implementation\n-Pierre Allard (Pierre.Allard@canada.ca),\n-Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n-Sebastien Gemme (Sebastien.Gemme@canada.ca)' modelName='ApogyExamplesSatelliteApogy' childCreationExtenders='true' extensibleProviderFactory='true' suppressGenModelAnnotations='false' modelDirectory='/ca.gc.asc_csa.apogy.examples.satellite.apogy/src-generated' editDirectory='/ca.gc.asc_csa.apogy.examples.satellite.apogy.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.examples.satellite'"
 * @generated
 */
public interface ApogyExamplesSatelliteApogyPackage extends EPackage {
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
	String eNS_URI = "ca.gc.asc_csa.apogy.examples.satellite.apogy";

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
	ApogyExamplesSatelliteApogyPackage eINSTANCE = ca.gc.asc_csa.apogy.examples.satellite.apogy.impl.ApogyExamplesSatelliteApogyPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.apogy.impl.ConstellationSystemApiAdapterImpl <em>Constellation System Api Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.apogy.impl.ConstellationSystemApiAdapterImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.apogy.impl.ApogyExamplesSatelliteApogyPackageImpl#getConstellationSystemApiAdapter()
	 * @generated
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER = 0;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER__ENVIRONMENT = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER__INSTANCE = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__INSTANCE;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER__ELEMENT_TYPE = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER__POSE_TRANSFORM = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_TRANSFORM;

	/**
	 * The feature id for the '<em><b>Pose Corrector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER__POSE_CORRECTOR = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_CORRECTOR;

	/**
	 * The feature id for the '<em><b>Apogy System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER__APOGY_SYSTEM = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__APOGY_SYSTEM;

	/**
	 * The number of structural features of the '<em>Constellation System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER_FEATURE_COUNT = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA;

	/**
	 * The operation id for the '<em>Create Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER___CREATE_INITIALIZATION_DATA = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___CREATE_INITIALIZATION_DATA;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA;

	/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL;

	/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER___DISPOSE = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___DISPOSE;

	/**
	 * The operation id for the '<em>Create Result Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL;

	/**
	 * The number of operations of the '<em>Constellation System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_SYSTEM_API_ADAPTER_OPERATION_COUNT = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.apogy.impl.ConstellationDataImpl <em>Constellation Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.apogy.impl.ConstellationDataImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.apogy.impl.ApogyExamplesSatelliteApogyPackageImpl#getConstellationData()
	 * @generated
	 */
	int CONSTELLATION_DATA = 1;

	/**
	 * The feature id for the '<em><b>Initial Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_DATA__INITIAL_POSE_TRANSFORM = ApogyCorePackage.APOGY_INITIALIZATION_DATA__INITIAL_POSE_TRANSFORM;

	/**
	 * The feature id for the '<em><b>Satellites List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_DATA__SATELLITES_LIST = ApogyCorePackage.APOGY_INITIALIZATION_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ground Stations References List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_DATA__GROUND_STATIONS_REFERENCES_LIST = ApogyCorePackage.APOGY_INITIALIZATION_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Downlinks Lists</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_DATA__DOWNLINKS_LISTS = ApogyCorePackage.APOGY_INITIALIZATION_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constellation Requests List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_DATA__CONSTELLATION_REQUESTS_LIST = ApogyCorePackage.APOGY_INITIALIZATION_DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constellation Command Plans List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_DATA__CONSTELLATION_COMMAND_PLANS_LIST = ApogyCorePackage.APOGY_INITIALIZATION_DATA_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Constellation Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_DATA_FEATURE_COUNT = ApogyCorePackage.APOGY_INITIALIZATION_DATA_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Constellation Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_DATA_OPERATION_COUNT = ApogyCorePackage.APOGY_INITIALIZATION_DATA_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.apogy.ConstellationSystemApiAdapter <em>Constellation System Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constellation System Api Adapter</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.apogy.ConstellationSystemApiAdapter
	 * @generated
	 */
	EClass getConstellationSystemApiAdapter();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.apogy.ConstellationData <em>Constellation Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constellation Data</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.apogy.ConstellationData
	 * @generated
	 */
	EClass getConstellationData();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.satellite.apogy.ConstellationData#getSatellitesList <em>Satellites List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Satellites List</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.apogy.ConstellationData#getSatellitesList()
	 * @see #getConstellationData()
	 * @generated
	 */
	EReference getConstellationData_SatellitesList();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.satellite.apogy.ConstellationData#getGroundStationsReferencesList <em>Ground Stations References List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ground Stations References List</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.apogy.ConstellationData#getGroundStationsReferencesList()
	 * @see #getConstellationData()
	 * @generated
	 */
	EReference getConstellationData_GroundStationsReferencesList();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.satellite.apogy.ConstellationData#getDownlinksLists <em>Downlinks Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Downlinks Lists</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.apogy.ConstellationData#getDownlinksLists()
	 * @see #getConstellationData()
	 * @generated
	 */
	EReference getConstellationData_DownlinksLists();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.satellite.apogy.ConstellationData#getConstellationRequestsList <em>Constellation Requests List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constellation Requests List</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.apogy.ConstellationData#getConstellationRequestsList()
	 * @see #getConstellationData()
	 * @generated
	 */
	EReference getConstellationData_ConstellationRequestsList();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.satellite.apogy.ConstellationData#getConstellationCommandPlansList <em>Constellation Command Plans List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constellation Command Plans List</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.apogy.ConstellationData#getConstellationCommandPlansList()
	 * @see #getConstellationData()
	 * @generated
	 */
	EReference getConstellationData_ConstellationCommandPlansList();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyExamplesSatelliteApogyFactory getApogyExamplesSatelliteApogyFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.apogy.impl.ConstellationSystemApiAdapterImpl <em>Constellation System Api Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.apogy.impl.ConstellationSystemApiAdapterImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.apogy.impl.ApogyExamplesSatelliteApogyPackageImpl#getConstellationSystemApiAdapter()
		 * @generated
		 */
		EClass CONSTELLATION_SYSTEM_API_ADAPTER = eINSTANCE.getConstellationSystemApiAdapter();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.apogy.impl.ConstellationDataImpl <em>Constellation Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.apogy.impl.ConstellationDataImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.apogy.impl.ApogyExamplesSatelliteApogyPackageImpl#getConstellationData()
		 * @generated
		 */
		EClass CONSTELLATION_DATA = eINSTANCE.getConstellationData();

		/**
		 * The meta object literal for the '<em><b>Satellites List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTELLATION_DATA__SATELLITES_LIST = eINSTANCE.getConstellationData_SatellitesList();

		/**
		 * The meta object literal for the '<em><b>Ground Stations References List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTELLATION_DATA__GROUND_STATIONS_REFERENCES_LIST = eINSTANCE.getConstellationData_GroundStationsReferencesList();

		/**
		 * The meta object literal for the '<em><b>Downlinks Lists</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTELLATION_DATA__DOWNLINKS_LISTS = eINSTANCE.getConstellationData_DownlinksLists();

		/**
		 * The meta object literal for the '<em><b>Constellation Requests List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTELLATION_DATA__CONSTELLATION_REQUESTS_LIST = eINSTANCE.getConstellationData_ConstellationRequestsList();

		/**
		 * The meta object literal for the '<em><b>Constellation Command Plans List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTELLATION_DATA__CONSTELLATION_COMMAND_PLANS_LIST = eINSTANCE.getConstellationData_ConstellationCommandPlansList();

	}

} //ApogyExamplesSatelliteApogyPackage
