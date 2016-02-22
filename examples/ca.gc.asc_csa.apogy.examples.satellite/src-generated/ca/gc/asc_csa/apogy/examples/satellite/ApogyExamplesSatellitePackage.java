package ca.gc.asc_csa.apogy.examples.satellite;
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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;

import ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesPackage;

import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;

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
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatelliteFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyExamplesSatellite' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyExamplesSatellite' childCreationExtenders='true' extensibleProviderFactory='true' suppressGenModelAnnotations='false' modelDirectory='/ca.gc.asc_csa.apogy.examples.satellite/src-generated' editDirectory='/ca.gc.asc_csa.apogy.examples.satellite.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.examples'"
 * @generated
 */
public interface ApogyExamplesSatellitePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "satellite";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.examples.satellite";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "satellite";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyExamplesSatellitePackage eINSTANCE = ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationImpl <em>Abstract Constellation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getAbstractConstellation()
	 * @generated
	 */
	int ABSTRACT_CONSTELLATION = 0;

	/**
	 * The feature id for the '<em><b>Satellites List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION__SATELLITES_LIST = 0;

	/**
	 * The feature id for the '<em><b>Ground Stations References List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION__GROUND_STATIONS_REFERENCES_LIST = 1;

	/**
	 * The feature id for the '<em><b>Downlinks Lists</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION__DOWNLINKS_LISTS = 2;

	/**
	 * The feature id for the '<em><b>Constellation Requests List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION__CONSTELLATION_REQUESTS_LIST = 3;

	/**
	 * The number of structural features of the '<em>Abstract Constellation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Plan</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION___PLAN__DATE_DATE = 0;

	/**
	 * The operation id for the '<em>Plan</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION___PLAN__LIST_DATE_DATE = 1;

	/**
	 * The operation id for the '<em>Commit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION___COMMIT__LIST = 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION___APPLY__CONSTELLATIONDOWNLINK = 3;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION___ADD__ABSTRACTCONSTELLATIONREQUEST = 4;

	/**
	 * The operation id for the '<em>Add All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION___ADD_ALL__LIST = 5;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION___REMOVE__ABSTRACTCONSTELLATIONREQUEST = 6;

	/**
	 * The operation id for the '<em>Remove All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION___REMOVE_ALL__LIST = 7;

	/**
	 * The number of operations of the '<em>Abstract Constellation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationCommandPlanImpl <em>Constellation Command Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationCommandPlanImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getConstellationCommandPlan()
	 * @generated
	 */
	int CONSTELLATION_COMMAND_PLAN = 1;

	/**
	 * The feature id for the '<em><b>Constellation Command Plan Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_COMMAND_PLAN__CONSTELLATION_COMMAND_PLAN_ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Constellation Command Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_COMMAND_PLAN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constellation Command Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_COMMAND_PLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationCommandPlanItemImpl <em>Constellation Command Plan Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationCommandPlanItemImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getConstellationCommandPlanItem()
	 * @generated
	 */
	int CONSTELLATION_COMMAND_PLAN_ITEM = 2;

	/**
	 * The feature id for the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_COMMAND_PLAN_ITEM__REQUEST = 0;

	/**
	 * The feature id for the '<em><b>Satellite Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_COMMAND_PLAN_ITEM__SATELLITE_COMMAND = 1;

	/**
	 * The number of structural features of the '<em>Constellation Command Plan Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_COMMAND_PLAN_ITEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Constellation Command Plan Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_COMMAND_PLAN_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.DefaultConstellationImpl <em>Default Constellation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.DefaultConstellationImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getDefaultConstellation()
	 * @generated
	 */
	int DEFAULT_CONSTELLATION = 3;

	/**
	 * The feature id for the '<em><b>Satellites List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION__SATELLITES_LIST = ABSTRACT_CONSTELLATION__SATELLITES_LIST;

	/**
	 * The feature id for the '<em><b>Ground Stations References List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION__GROUND_STATIONS_REFERENCES_LIST = ABSTRACT_CONSTELLATION__GROUND_STATIONS_REFERENCES_LIST;

	/**
	 * The feature id for the '<em><b>Downlinks Lists</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION__DOWNLINKS_LISTS = ABSTRACT_CONSTELLATION__DOWNLINKS_LISTS;

	/**
	 * The feature id for the '<em><b>Constellation Requests List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION__CONSTELLATION_REQUESTS_LIST = ABSTRACT_CONSTELLATION__CONSTELLATION_REQUESTS_LIST;

	/**
	 * The number of structural features of the '<em>Default Constellation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION_FEATURE_COUNT = ABSTRACT_CONSTELLATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Plan</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION___PLAN__DATE_DATE = ABSTRACT_CONSTELLATION___PLAN__DATE_DATE;

	/**
	 * The operation id for the '<em>Plan</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION___PLAN__LIST_DATE_DATE = ABSTRACT_CONSTELLATION___PLAN__LIST_DATE_DATE;

	/**
	 * The operation id for the '<em>Commit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION___COMMIT__LIST = ABSTRACT_CONSTELLATION___COMMIT__LIST;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION___APPLY__CONSTELLATIONDOWNLINK = ABSTRACT_CONSTELLATION___APPLY__CONSTELLATIONDOWNLINK;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION___ADD__ABSTRACTCONSTELLATIONREQUEST = ABSTRACT_CONSTELLATION___ADD__ABSTRACTCONSTELLATIONREQUEST;

	/**
	 * The operation id for the '<em>Add All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION___ADD_ALL__LIST = ABSTRACT_CONSTELLATION___ADD_ALL__LIST;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION___REMOVE__ABSTRACTCONSTELLATIONREQUEST = ABSTRACT_CONSTELLATION___REMOVE__ABSTRACTCONSTELLATIONREQUEST;

	/**
	 * The operation id for the '<em>Remove All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION___REMOVE_ALL__LIST = ABSTRACT_CONSTELLATION___REMOVE_ALL__LIST;

	/**
	 * The number of operations of the '<em>Default Constellation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION_OPERATION_COUNT = ABSTRACT_CONSTELLATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationRequestsListImpl <em>Constellation Requests List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationRequestsListImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getConstellationRequestsList()
	 * @generated
	 */
	int CONSTELLATION_REQUESTS_LIST = 4;

	/**
	 * The feature id for the '<em><b>Constellation Requests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_REQUESTS_LIST__CONSTELLATION_REQUESTS = 0;

	/**
	 * The number of structural features of the '<em>Constellation Requests List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_REQUESTS_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constellation Requests List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_REQUESTS_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationRequestImpl <em>Abstract Constellation Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationRequestImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getAbstractConstellationRequest()
	 * @generated
	 */
	int ABSTRACT_CONSTELLATION_REQUEST = 5;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_REQUEST__UID = 0;

	/**
	 * The feature id for the '<em><b>Order Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_REQUEST__ORDER_PRIORITY = 1;

	/**
	 * The feature id for the '<em><b>Order Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_REQUEST__ORDER_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Satellite Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_REQUEST__SATELLITE_COMMAND = 3;

	/**
	 * The number of structural features of the '<em>Abstract Constellation Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_REQUEST_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Abstract Constellation Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ImageConstellationRequestImpl <em>Image Constellation Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ImageConstellationRequestImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getImageConstellationRequest()
	 * @generated
	 */
	int IMAGE_CONSTELLATION_REQUEST = 6;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONSTELLATION_REQUEST__UID = ABSTRACT_CONSTELLATION_REQUEST__UID;

	/**
	 * The feature id for the '<em><b>Order Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONSTELLATION_REQUEST__ORDER_PRIORITY = ABSTRACT_CONSTELLATION_REQUEST__ORDER_PRIORITY;

	/**
	 * The feature id for the '<em><b>Order Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONSTELLATION_REQUEST__ORDER_STATUS = ABSTRACT_CONSTELLATION_REQUEST__ORDER_STATUS;

	/**
	 * The feature id for the '<em><b>Satellite Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONSTELLATION_REQUEST__SATELLITE_COMMAND = ABSTRACT_CONSTELLATION_REQUEST__SATELLITE_COMMAND;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONSTELLATION_REQUEST__LONGITUDE = ABSTRACT_CONSTELLATION_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONSTELLATION_REQUEST__LATITUDE = ABSTRACT_CONSTELLATION_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elevation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONSTELLATION_REQUEST__ELEVATION = ABSTRACT_CONSTELLATION_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONSTELLATION_REQUEST__IMAGE = ABSTRACT_CONSTELLATION_REQUEST_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Image Constellation Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONSTELLATION_REQUEST_FEATURE_COUNT = ABSTRACT_CONSTELLATION_REQUEST_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Image Constellation Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONSTELLATION_REQUEST_OPERATION_COUNT = ABSTRACT_CONSTELLATION_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.SatellitesListImpl <em>Satellites List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.SatellitesListImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getSatellitesList()
	 * @generated
	 */
	int SATELLITES_LIST = 7;

	/**
	 * The feature id for the '<em><b>Satellites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITES_LIST__SATELLITES = 0;

	/**
	 * The number of structural features of the '<em>Satellites List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITES_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Satellites List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITES_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.SatelliteImpl <em>Satellite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.SatelliteImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getSatellite()
	 * @generated
	 */
	int SATELLITE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Orbit Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE__ORBIT_MODEL = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum Roll Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE__MAXIMUM_ROLL_RATE = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Maximum Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE__MAXIMUM_ROLL = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Satellite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Satellite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractSatelliteCommandImpl <em>Abstract Satellite Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractSatelliteCommandImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getAbstractSatelliteCommand()
	 * @generated
	 */
	int ABSTRACT_SATELLITE_COMMAND = 9;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SATELLITE_COMMAND__LONGITUDE = ApogyCoreEnvironmentPackage.GEOGRAPHIC_COORDINATES__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SATELLITE_COMMAND__LATITUDE = ApogyCoreEnvironmentPackage.GEOGRAPHIC_COORDINATES__LATITUDE;

	/**
	 * The feature id for the '<em><b>Elevation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SATELLITE_COMMAND__ELEVATION = ApogyCoreEnvironmentPackage.GEOGRAPHIC_COORDINATES__ELEVATION;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SATELLITE_COMMAND__TIME = ApogyCoreEnvironmentPackage.GEOGRAPHIC_COORDINATES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Satellite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SATELLITE_COMMAND__SATELLITE = ApogyCoreEnvironmentPackage.GEOGRAPHIC_COORDINATES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constellation Request</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SATELLITE_COMMAND__CONSTELLATION_REQUEST = ApogyCoreEnvironmentPackage.GEOGRAPHIC_COORDINATES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Satellite Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SATELLITE_COMMAND_FEATURE_COUNT = ApogyCoreEnvironmentPackage.GEOGRAPHIC_COORDINATES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Abstract Satellite Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SATELLITE_COMMAND_OPERATION_COUNT = ApogyCoreEnvironmentPackage.GEOGRAPHIC_COORDINATES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AcquireImageSatelliteCommandImpl <em>Acquire Image Satellite Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.AcquireImageSatelliteCommandImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getAcquireImageSatelliteCommand()
	 * @generated
	 */
	int ACQUIRE_IMAGE_SATELLITE_COMMAND = 10;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_IMAGE_SATELLITE_COMMAND__LONGITUDE = ABSTRACT_SATELLITE_COMMAND__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_IMAGE_SATELLITE_COMMAND__LATITUDE = ABSTRACT_SATELLITE_COMMAND__LATITUDE;

	/**
	 * The feature id for the '<em><b>Elevation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_IMAGE_SATELLITE_COMMAND__ELEVATION = ABSTRACT_SATELLITE_COMMAND__ELEVATION;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_IMAGE_SATELLITE_COMMAND__TIME = ABSTRACT_SATELLITE_COMMAND__TIME;

	/**
	 * The feature id for the '<em><b>Satellite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_IMAGE_SATELLITE_COMMAND__SATELLITE = ABSTRACT_SATELLITE_COMMAND__SATELLITE;

	/**
	 * The feature id for the '<em><b>Constellation Request</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_IMAGE_SATELLITE_COMMAND__CONSTELLATION_REQUEST = ABSTRACT_SATELLITE_COMMAND__CONSTELLATION_REQUEST;

	/**
	 * The feature id for the '<em><b>Roll Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_IMAGE_SATELLITE_COMMAND__ROLL_ANGLE = ABSTRACT_SATELLITE_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Acquire Image Satellite Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_IMAGE_SATELLITE_COMMAND_FEATURE_COUNT = ABSTRACT_SATELLITE_COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Acquire Image Satellite Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_IMAGE_SATELLITE_COMMAND_OPERATION_COUNT = ABSTRACT_SATELLITE_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.OrbitalImageImpl <em>Orbital Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.OrbitalImageImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getOrbitalImage()
	 * @generated
	 */
	int ORBITAL_IMAGE = 11;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBITAL_IMAGE__WIDTH = ApogyCommonImagesPackage.EIMAGE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBITAL_IMAGE__HEIGHT = ApogyCommonImagesPackage.EIMAGE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Image Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBITAL_IMAGE__IMAGE_CONTENT = ApogyCommonImagesPackage.EIMAGE__IMAGE_CONTENT;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBITAL_IMAGE__COORDINATES = ApogyCommonImagesPackage.EIMAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roll Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBITAL_IMAGE__ROLL_ANGLE = ApogyCommonImagesPackage.EIMAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Orbital Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBITAL_IMAGE_FEATURE_COUNT = ApogyCommonImagesPackage.EIMAGE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>As Buffered Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBITAL_IMAGE___AS_BUFFERED_IMAGE = ApogyCommonImagesPackage.EIMAGE___AS_BUFFERED_IMAGE;

	/**
	 * The number of operations of the '<em>Orbital Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBITAL_IMAGE_OPERATION_COUNT = ApogyCommonImagesPackage.EIMAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationDownlinksListImpl <em>Constellation Downlinks List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationDownlinksListImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getConstellationDownlinksList()
	 * @generated
	 */
	int CONSTELLATION_DOWNLINKS_LIST = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_DOWNLINKS_LIST__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_DOWNLINKS_LIST__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Downlinks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_DOWNLINKS_LIST__DOWNLINKS = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constellation Downlinks List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_DOWNLINKS_LIST_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Constellation Downlinks List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_DOWNLINKS_LIST_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationDownlinkImpl <em>Constellation Downlink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationDownlinkImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getConstellationDownlink()
	 * @generated
	 */
	int CONSTELLATION_DOWNLINK = 13;

	/**
	 * The feature id for the '<em><b>Downlink Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_DOWNLINK__DOWNLINK_ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Constellation Downlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_DOWNLINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constellation Downlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_DOWNLINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationDownlinkItemImpl <em>Abstract Constellation Downlink Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationDownlinkItemImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getAbstractConstellationDownlinkItem()
	 * @generated
	 */
	int ABSTRACT_CONSTELLATION_DOWNLINK_ITEM = 14;

	/**
	 * The feature id for the '<em><b>Request UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_DOWNLINK_ITEM__REQUEST_UID = 0;

	/**
	 * The number of structural features of the '<em>Abstract Constellation Downlink Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_DOWNLINK_ITEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Constellation Downlink Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_DOWNLINK_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.OrbitalImageConstellationDownlinkItemImpl <em>Orbital Image Constellation Downlink Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.OrbitalImageConstellationDownlinkItemImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getOrbitalImageConstellationDownlinkItem()
	 * @generated
	 */
	int ORBITAL_IMAGE_CONSTELLATION_DOWNLINK_ITEM = 15;

	/**
	 * The feature id for the '<em><b>Request UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBITAL_IMAGE_CONSTELLATION_DOWNLINK_ITEM__REQUEST_UID = ABSTRACT_CONSTELLATION_DOWNLINK_ITEM__REQUEST_UID;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBITAL_IMAGE_CONSTELLATION_DOWNLINK_ITEM__IMAGE = ABSTRACT_CONSTELLATION_DOWNLINK_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Orbital Image Constellation Downlink Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBITAL_IMAGE_CONSTELLATION_DOWNLINK_ITEM_FEATURE_COUNT = ABSTRACT_CONSTELLATION_DOWNLINK_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Orbital Image Constellation Downlink Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBITAL_IMAGE_CONSTELLATION_DOWNLINK_ITEM_OPERATION_COUNT = ABSTRACT_CONSTELLATION_DOWNLINK_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationUtilitiesImpl <em>Constellation Utilities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationUtilitiesImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getConstellationUtilities()
	 * @generated
	 */
	int CONSTELLATION_UTILITIES = 16;

	/**
	 * The number of structural features of the '<em>Constellation Utilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_UTILITIES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Sort By Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_UTILITIES___SORT_BY_PRIORITY__LIST = 0;

	/**
	 * The number of operations of the '<em>Constellation Utilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_UTILITIES_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestPriority <em>Constellation Request Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestPriority
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getConstellationRequestPriority()
	 * @generated
	 */
	int CONSTELLATION_REQUEST_PRIORITY = 17;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestStatus <em>Constellation Request Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestStatus
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getConstellationRequestStatus()
	 * @generated
	 */
	int CONSTELLATION_REQUEST_STATUS = 18;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getList()
	 * @generated
	 */
	int LIST = 19;

	/**
	 * The meta object id for the '<em>Sorted Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.SortedSet
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getSortedSet()
	 * @generated
	 */
	int SORTED_SET = 20;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation <em>Abstract Constellation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Constellation</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation
	 * @generated
	 */
	EClass getAbstractConstellation();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#getSatellitesList <em>Satellites List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Satellites List</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#getSatellitesList()
	 * @see #getAbstractConstellation()
	 * @generated
	 */
	EReference getAbstractConstellation_SatellitesList();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#getGroundStationsReferencesList <em>Ground Stations References List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ground Stations References List</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#getGroundStationsReferencesList()
	 * @see #getAbstractConstellation()
	 * @generated
	 */
	EReference getAbstractConstellation_GroundStationsReferencesList();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#getDownlinksLists <em>Downlinks Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Downlinks Lists</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#getDownlinksLists()
	 * @see #getAbstractConstellation()
	 * @generated
	 */
	EReference getAbstractConstellation_DownlinksLists();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#getConstellationRequestsList <em>Constellation Requests List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constellation Requests List</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#getConstellationRequestsList()
	 * @see #getAbstractConstellation()
	 * @generated
	 */
	EReference getAbstractConstellation_ConstellationRequestsList();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#plan(java.util.Date, java.util.Date) <em>Plan</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Plan</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#plan(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getAbstractConstellation__Plan__Date_Date();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#plan(java.util.List, java.util.Date, java.util.Date) <em>Plan</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Plan</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#plan(java.util.List, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getAbstractConstellation__Plan__List_Date_Date();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#commit(java.util.List) <em>Commit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Commit</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#commit(java.util.List)
	 * @generated
	 */
	EOperation getAbstractConstellation__Commit__List();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#apply(ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlink) <em>Apply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#apply(ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlink)
	 * @generated
	 */
	EOperation getAbstractConstellation__Apply__ConstellationDownlink();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#add(ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest) <em>Add</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#add(ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest)
	 * @generated
	 */
	EOperation getAbstractConstellation__Add__AbstractConstellationRequest();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#addAll(java.util.List) <em>Add All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add All</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#addAll(java.util.List)
	 * @generated
	 */
	EOperation getAbstractConstellation__AddAll__List();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#remove(ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest) <em>Remove</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#remove(ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest)
	 * @generated
	 */
	EOperation getAbstractConstellation__Remove__AbstractConstellationRequest();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#removeAll(java.util.List) <em>Remove All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove All</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#removeAll(java.util.List)
	 * @generated
	 */
	EOperation getAbstractConstellation__RemoveAll__List();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlan <em>Constellation Command Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constellation Command Plan</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlan
	 * @generated
	 */
	EClass getConstellationCommandPlan();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlan#getConstellationCommandPlanItems <em>Constellation Command Plan Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constellation Command Plan Items</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlan#getConstellationCommandPlanItems()
	 * @see #getConstellationCommandPlan()
	 * @generated
	 */
	EReference getConstellationCommandPlan_ConstellationCommandPlanItems();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlanItem <em>Constellation Command Plan Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constellation Command Plan Item</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlanItem
	 * @generated
	 */
	EClass getConstellationCommandPlanItem();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlanItem#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Request</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlanItem#getRequest()
	 * @see #getConstellationCommandPlanItem()
	 * @generated
	 */
	EReference getConstellationCommandPlanItem_Request();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlanItem#getSatelliteCommand <em>Satellite Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Satellite Command</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlanItem#getSatelliteCommand()
	 * @see #getConstellationCommandPlanItem()
	 * @generated
	 */
	EReference getConstellationCommandPlanItem_SatelliteCommand();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellation <em>Default Constellation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Constellation</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellation
	 * @generated
	 */
	EClass getDefaultConstellation();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList <em>Constellation Requests List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constellation Requests List</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList
	 * @generated
	 */
	EClass getConstellationRequestsList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList#getConstellationRequests <em>Constellation Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constellation Requests</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList#getConstellationRequests()
	 * @see #getConstellationRequestsList()
	 * @generated
	 */
	EReference getConstellationRequestsList_ConstellationRequests();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest <em>Abstract Constellation Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Constellation Request</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest
	 * @generated
	 */
	EClass getAbstractConstellationRequest();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest#getUid()
	 * @see #getAbstractConstellationRequest()
	 * @generated
	 */
	EAttribute getAbstractConstellationRequest_Uid();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest#getOrderPriority <em>Order Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Priority</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest#getOrderPriority()
	 * @see #getAbstractConstellationRequest()
	 * @generated
	 */
	EAttribute getAbstractConstellationRequest_OrderPriority();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest#getOrderStatus <em>Order Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Status</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest#getOrderStatus()
	 * @see #getAbstractConstellationRequest()
	 * @generated
	 */
	EAttribute getAbstractConstellationRequest_OrderStatus();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest#getSatelliteCommand <em>Satellite Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Satellite Command</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest#getSatelliteCommand()
	 * @see #getAbstractConstellationRequest()
	 * @generated
	 */
	EReference getAbstractConstellationRequest_SatelliteCommand();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.ImageConstellationRequest <em>Image Constellation Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Constellation Request</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ImageConstellationRequest
	 * @generated
	 */
	EClass getImageConstellationRequest();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.satellite.ImageConstellationRequest#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ImageConstellationRequest#getImage()
	 * @see #getImageConstellationRequest()
	 * @generated
	 */
	EReference getImageConstellationRequest_Image();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.SatellitesList <em>Satellites List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satellites List</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.SatellitesList
	 * @generated
	 */
	EClass getSatellitesList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.examples.satellite.SatellitesList#getSatellites <em>Satellites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Satellites</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.SatellitesList#getSatellites()
	 * @see #getSatellitesList()
	 * @generated
	 */
	EReference getSatellitesList_Satellites();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.Satellite <em>Satellite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satellite</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.Satellite
	 * @generated
	 */
	EClass getSatellite();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.examples.satellite.Satellite#getOrbitModel <em>Orbit Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Orbit Model</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.Satellite#getOrbitModel()
	 * @see #getSatellite()
	 * @generated
	 */
	EReference getSatellite_OrbitModel();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.satellite.Satellite#getMaximumRollRate <em>Maximum Roll Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Roll Rate</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.Satellite#getMaximumRollRate()
	 * @see #getSatellite()
	 * @generated
	 */
	EAttribute getSatellite_MaximumRollRate();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.satellite.Satellite#getMaximumRoll <em>Maximum Roll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Roll</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.Satellite#getMaximumRoll()
	 * @see #getSatellite()
	 * @generated
	 */
	EAttribute getSatellite_MaximumRoll();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractSatelliteCommand <em>Abstract Satellite Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Satellite Command</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractSatelliteCommand
	 * @generated
	 */
	EClass getAbstractSatelliteCommand();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractSatelliteCommand#getSatellite <em>Satellite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Satellite</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractSatelliteCommand#getSatellite()
	 * @see #getAbstractSatelliteCommand()
	 * @generated
	 */
	EReference getAbstractSatelliteCommand_Satellite();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractSatelliteCommand#getConstellationRequest <em>Constellation Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Constellation Request</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractSatelliteCommand#getConstellationRequest()
	 * @see #getAbstractSatelliteCommand()
	 * @generated
	 */
	EReference getAbstractSatelliteCommand_ConstellationRequest();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.AcquireImageSatelliteCommand <em>Acquire Image Satellite Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acquire Image Satellite Command</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AcquireImageSatelliteCommand
	 * @generated
	 */
	EClass getAcquireImageSatelliteCommand();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.satellite.AcquireImageSatelliteCommand#getRollAngle <em>Roll Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roll Angle</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AcquireImageSatelliteCommand#getRollAngle()
	 * @see #getAcquireImageSatelliteCommand()
	 * @generated
	 */
	EAttribute getAcquireImageSatelliteCommand_RollAngle();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.OrbitalImage <em>Orbital Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orbital Image</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.OrbitalImage
	 * @generated
	 */
	EClass getOrbitalImage();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.satellite.OrbitalImage#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coordinates</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.OrbitalImage#getCoordinates()
	 * @see #getOrbitalImage()
	 * @generated
	 */
	EReference getOrbitalImage_Coordinates();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.satellite.OrbitalImage#getRollAngle <em>Roll Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roll Angle</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.OrbitalImage#getRollAngle()
	 * @see #getOrbitalImage()
	 * @generated
	 */
	EAttribute getOrbitalImage_RollAngle();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlinksList <em>Constellation Downlinks List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constellation Downlinks List</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlinksList
	 * @generated
	 */
	EClass getConstellationDownlinksList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlinksList#getDownlinks <em>Downlinks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Downlinks</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlinksList#getDownlinks()
	 * @see #getConstellationDownlinksList()
	 * @generated
	 */
	EReference getConstellationDownlinksList_Downlinks();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlink <em>Constellation Downlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constellation Downlink</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlink
	 * @generated
	 */
	EClass getConstellationDownlink();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlink#getDownlinkItems <em>Downlink Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Downlink Items</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlink#getDownlinkItems()
	 * @see #getConstellationDownlink()
	 * @generated
	 */
	EReference getConstellationDownlink_DownlinkItems();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationDownlinkItem <em>Abstract Constellation Downlink Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Constellation Downlink Item</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationDownlinkItem
	 * @generated
	 */
	EClass getAbstractConstellationDownlinkItem();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationDownlinkItem#getRequestUID <em>Request UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request UID</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationDownlinkItem#getRequestUID()
	 * @see #getAbstractConstellationDownlinkItem()
	 * @generated
	 */
	EAttribute getAbstractConstellationDownlinkItem_RequestUID();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.OrbitalImageConstellationDownlinkItem <em>Orbital Image Constellation Downlink Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orbital Image Constellation Downlink Item</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.OrbitalImageConstellationDownlinkItem
	 * @generated
	 */
	EClass getOrbitalImageConstellationDownlinkItem();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.satellite.OrbitalImageConstellationDownlinkItem#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.OrbitalImageConstellationDownlinkItem#getImage()
	 * @see #getOrbitalImageConstellationDownlinkItem()
	 * @generated
	 */
	EReference getOrbitalImageConstellationDownlinkItem_Image();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationUtilities <em>Constellation Utilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constellation Utilities</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationUtilities
	 * @generated
	 */
	EClass getConstellationUtilities();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationUtilities#sortByPriority(java.util.List) <em>Sort By Priority</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sort By Priority</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationUtilities#sortByPriority(java.util.List)
	 * @generated
	 */
	EOperation getConstellationUtilities__SortByPriority__List();

	/**
	 * Returns the meta object for enum '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestPriority <em>Constellation Request Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constellation Request Priority</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestPriority
	 * @generated
	 */
	EEnum getConstellationRequestPriority();

	/**
	 * Returns the meta object for enum '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestStatus <em>Constellation Request Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constellation Request Status</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestStatus
	 * @generated
	 */
	EEnum getConstellationRequestStatus();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyExamplesSatelliteFactory getApogyExamplesSatelliteFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationImpl <em>Abstract Constellation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getAbstractConstellation()
		 * @generated
		 */
		EClass ABSTRACT_CONSTELLATION = eINSTANCE.getAbstractConstellation();

		/**
		 * The meta object literal for the '<em><b>Satellites List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONSTELLATION__SATELLITES_LIST = eINSTANCE.getAbstractConstellation_SatellitesList();

		/**
		 * The meta object literal for the '<em><b>Ground Stations References List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONSTELLATION__GROUND_STATIONS_REFERENCES_LIST = eINSTANCE.getAbstractConstellation_GroundStationsReferencesList();

		/**
		 * The meta object literal for the '<em><b>Downlinks Lists</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONSTELLATION__DOWNLINKS_LISTS = eINSTANCE.getAbstractConstellation_DownlinksLists();

		/**
		 * The meta object literal for the '<em><b>Constellation Requests List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONSTELLATION__CONSTELLATION_REQUESTS_LIST = eINSTANCE.getAbstractConstellation_ConstellationRequestsList();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONSTELLATION___PLAN__DATE_DATE = eINSTANCE.getAbstractConstellation__Plan__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONSTELLATION___PLAN__LIST_DATE_DATE = eINSTANCE.getAbstractConstellation__Plan__List_Date_Date();

		/**
		 * The meta object literal for the '<em><b>Commit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONSTELLATION___COMMIT__LIST = eINSTANCE.getAbstractConstellation__Commit__List();

		/**
		 * The meta object literal for the '<em><b>Apply</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONSTELLATION___APPLY__CONSTELLATIONDOWNLINK = eINSTANCE.getAbstractConstellation__Apply__ConstellationDownlink();

		/**
		 * The meta object literal for the '<em><b>Add</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONSTELLATION___ADD__ABSTRACTCONSTELLATIONREQUEST = eINSTANCE.getAbstractConstellation__Add__AbstractConstellationRequest();

		/**
		 * The meta object literal for the '<em><b>Add All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONSTELLATION___ADD_ALL__LIST = eINSTANCE.getAbstractConstellation__AddAll__List();

		/**
		 * The meta object literal for the '<em><b>Remove</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONSTELLATION___REMOVE__ABSTRACTCONSTELLATIONREQUEST = eINSTANCE.getAbstractConstellation__Remove__AbstractConstellationRequest();

		/**
		 * The meta object literal for the '<em><b>Remove All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONSTELLATION___REMOVE_ALL__LIST = eINSTANCE.getAbstractConstellation__RemoveAll__List();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationCommandPlanImpl <em>Constellation Command Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationCommandPlanImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getConstellationCommandPlan()
		 * @generated
		 */
		EClass CONSTELLATION_COMMAND_PLAN = eINSTANCE.getConstellationCommandPlan();

		/**
		 * The meta object literal for the '<em><b>Constellation Command Plan Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTELLATION_COMMAND_PLAN__CONSTELLATION_COMMAND_PLAN_ITEMS = eINSTANCE.getConstellationCommandPlan_ConstellationCommandPlanItems();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationCommandPlanItemImpl <em>Constellation Command Plan Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationCommandPlanItemImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getConstellationCommandPlanItem()
		 * @generated
		 */
		EClass CONSTELLATION_COMMAND_PLAN_ITEM = eINSTANCE.getConstellationCommandPlanItem();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTELLATION_COMMAND_PLAN_ITEM__REQUEST = eINSTANCE.getConstellationCommandPlanItem_Request();

		/**
		 * The meta object literal for the '<em><b>Satellite Command</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTELLATION_COMMAND_PLAN_ITEM__SATELLITE_COMMAND = eINSTANCE.getConstellationCommandPlanItem_SatelliteCommand();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.DefaultConstellationImpl <em>Default Constellation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.DefaultConstellationImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getDefaultConstellation()
		 * @generated
		 */
		EClass DEFAULT_CONSTELLATION = eINSTANCE.getDefaultConstellation();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationRequestsListImpl <em>Constellation Requests List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationRequestsListImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getConstellationRequestsList()
		 * @generated
		 */
		EClass CONSTELLATION_REQUESTS_LIST = eINSTANCE.getConstellationRequestsList();

		/**
		 * The meta object literal for the '<em><b>Constellation Requests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTELLATION_REQUESTS_LIST__CONSTELLATION_REQUESTS = eINSTANCE.getConstellationRequestsList_ConstellationRequests();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationRequestImpl <em>Abstract Constellation Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationRequestImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getAbstractConstellationRequest()
		 * @generated
		 */
		EClass ABSTRACT_CONSTELLATION_REQUEST = eINSTANCE.getAbstractConstellationRequest();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CONSTELLATION_REQUEST__UID = eINSTANCE.getAbstractConstellationRequest_Uid();

		/**
		 * The meta object literal for the '<em><b>Order Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CONSTELLATION_REQUEST__ORDER_PRIORITY = eINSTANCE.getAbstractConstellationRequest_OrderPriority();

		/**
		 * The meta object literal for the '<em><b>Order Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CONSTELLATION_REQUEST__ORDER_STATUS = eINSTANCE.getAbstractConstellationRequest_OrderStatus();

		/**
		 * The meta object literal for the '<em><b>Satellite Command</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONSTELLATION_REQUEST__SATELLITE_COMMAND = eINSTANCE.getAbstractConstellationRequest_SatelliteCommand();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ImageConstellationRequestImpl <em>Image Constellation Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ImageConstellationRequestImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getImageConstellationRequest()
		 * @generated
		 */
		EClass IMAGE_CONSTELLATION_REQUEST = eINSTANCE.getImageConstellationRequest();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_CONSTELLATION_REQUEST__IMAGE = eINSTANCE.getImageConstellationRequest_Image();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.SatellitesListImpl <em>Satellites List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.SatellitesListImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getSatellitesList()
		 * @generated
		 */
		EClass SATELLITES_LIST = eINSTANCE.getSatellitesList();

		/**
		 * The meta object literal for the '<em><b>Satellites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATELLITES_LIST__SATELLITES = eINSTANCE.getSatellitesList_Satellites();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.SatelliteImpl <em>Satellite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.SatelliteImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getSatellite()
		 * @generated
		 */
		EClass SATELLITE = eINSTANCE.getSatellite();

		/**
		 * The meta object literal for the '<em><b>Orbit Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATELLITE__ORBIT_MODEL = eINSTANCE.getSatellite_OrbitModel();

		/**
		 * The meta object literal for the '<em><b>Maximum Roll Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SATELLITE__MAXIMUM_ROLL_RATE = eINSTANCE.getSatellite_MaximumRollRate();

		/**
		 * The meta object literal for the '<em><b>Maximum Roll</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SATELLITE__MAXIMUM_ROLL = eINSTANCE.getSatellite_MaximumRoll();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractSatelliteCommandImpl <em>Abstract Satellite Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractSatelliteCommandImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getAbstractSatelliteCommand()
		 * @generated
		 */
		EClass ABSTRACT_SATELLITE_COMMAND = eINSTANCE.getAbstractSatelliteCommand();

		/**
		 * The meta object literal for the '<em><b>Satellite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SATELLITE_COMMAND__SATELLITE = eINSTANCE.getAbstractSatelliteCommand_Satellite();

		/**
		 * The meta object literal for the '<em><b>Constellation Request</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SATELLITE_COMMAND__CONSTELLATION_REQUEST = eINSTANCE.getAbstractSatelliteCommand_ConstellationRequest();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AcquireImageSatelliteCommandImpl <em>Acquire Image Satellite Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.AcquireImageSatelliteCommandImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getAcquireImageSatelliteCommand()
		 * @generated
		 */
		EClass ACQUIRE_IMAGE_SATELLITE_COMMAND = eINSTANCE.getAcquireImageSatelliteCommand();

		/**
		 * The meta object literal for the '<em><b>Roll Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACQUIRE_IMAGE_SATELLITE_COMMAND__ROLL_ANGLE = eINSTANCE.getAcquireImageSatelliteCommand_RollAngle();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.OrbitalImageImpl <em>Orbital Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.OrbitalImageImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getOrbitalImage()
		 * @generated
		 */
		EClass ORBITAL_IMAGE = eINSTANCE.getOrbitalImage();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORBITAL_IMAGE__COORDINATES = eINSTANCE.getOrbitalImage_Coordinates();

		/**
		 * The meta object literal for the '<em><b>Roll Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORBITAL_IMAGE__ROLL_ANGLE = eINSTANCE.getOrbitalImage_RollAngle();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationDownlinksListImpl <em>Constellation Downlinks List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationDownlinksListImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getConstellationDownlinksList()
		 * @generated
		 */
		EClass CONSTELLATION_DOWNLINKS_LIST = eINSTANCE.getConstellationDownlinksList();

		/**
		 * The meta object literal for the '<em><b>Downlinks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTELLATION_DOWNLINKS_LIST__DOWNLINKS = eINSTANCE.getConstellationDownlinksList_Downlinks();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationDownlinkImpl <em>Constellation Downlink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationDownlinkImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getConstellationDownlink()
		 * @generated
		 */
		EClass CONSTELLATION_DOWNLINK = eINSTANCE.getConstellationDownlink();

		/**
		 * The meta object literal for the '<em><b>Downlink Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTELLATION_DOWNLINK__DOWNLINK_ITEMS = eINSTANCE.getConstellationDownlink_DownlinkItems();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationDownlinkItemImpl <em>Abstract Constellation Downlink Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationDownlinkItemImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getAbstractConstellationDownlinkItem()
		 * @generated
		 */
		EClass ABSTRACT_CONSTELLATION_DOWNLINK_ITEM = eINSTANCE.getAbstractConstellationDownlinkItem();

		/**
		 * The meta object literal for the '<em><b>Request UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CONSTELLATION_DOWNLINK_ITEM__REQUEST_UID = eINSTANCE.getAbstractConstellationDownlinkItem_RequestUID();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.OrbitalImageConstellationDownlinkItemImpl <em>Orbital Image Constellation Downlink Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.OrbitalImageConstellationDownlinkItemImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getOrbitalImageConstellationDownlinkItem()
		 * @generated
		 */
		EClass ORBITAL_IMAGE_CONSTELLATION_DOWNLINK_ITEM = eINSTANCE.getOrbitalImageConstellationDownlinkItem();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORBITAL_IMAGE_CONSTELLATION_DOWNLINK_ITEM__IMAGE = eINSTANCE.getOrbitalImageConstellationDownlinkItem_Image();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationUtilitiesImpl <em>Constellation Utilities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationUtilitiesImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getConstellationUtilities()
		 * @generated
		 */
		EClass CONSTELLATION_UTILITIES = eINSTANCE.getConstellationUtilities();

		/**
		 * The meta object literal for the '<em><b>Sort By Priority</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONSTELLATION_UTILITIES___SORT_BY_PRIORITY__LIST = eINSTANCE.getConstellationUtilities__SortByPriority__List();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestPriority <em>Constellation Request Priority</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestPriority
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getConstellationRequestPriority()
		 * @generated
		 */
		EEnum CONSTELLATION_REQUEST_PRIORITY = eINSTANCE.getConstellationRequestPriority();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestStatus <em>Constellation Request Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestStatus
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getConstellationRequestStatus()
		 * @generated
		 */
		EEnum CONSTELLATION_REQUEST_STATUS = eINSTANCE.getConstellationRequestStatus();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em>Sorted Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.SortedSet
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getSortedSet()
		 * @generated
		 */
		EDataType SORTED_SET = eINSTANCE.getSortedSet();

	}

} //ApogyExamplesSatellitePackage
