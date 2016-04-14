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
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyExamplesSatellite' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\nCanadian Space Agency (CSA) - Initial API and implementation\n-Pierre Allard (Pierre.Allard@canada.ca),\n-Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n-Sebastien Gemme (Sebastien.Gemme@canada.ca)' modelName='ApogyExamplesSatellite' childCreationExtenders='true' extensibleProviderFactory='true' suppressGenModelAnnotations='false' dynamicTemplates='true' templateDirectory='platform:/plugin/ca.gc.asc_csa.apogy.common.emf/templates' modelDirectory='/ca.gc.asc_csa.apogy.examples.satellite/src-generated' editDirectory='/ca.gc.asc_csa.apogy.examples.satellite.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.examples'"
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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractUIDImpl <em>Abstract UID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractUIDImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getAbstractUID()
	 * @generated
	 */
	int ABSTRACT_UID = 0;

	/**
	 * The number of structural features of the '<em>Abstract UID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UID_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract UID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.StringUIDImpl <em>String UID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.StringUIDImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getStringUID()
	 * @generated
	 */
	int STRING_UID = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_UID__ID = ABSTRACT_UID_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String UID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_UID_FEATURE_COUNT = ABSTRACT_UID_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String UID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_UID_OPERATION_COUNT = ABSTRACT_UID_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationCommandPlansListImpl <em>Constellation Command Plans List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationCommandPlansListImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getConstellationCommandPlansList()
	 * @generated
	 */
	int CONSTELLATION_COMMAND_PLANS_LIST = 2;

	/**
	 * The feature id for the '<em><b>Plans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_COMMAND_PLANS_LIST__PLANS = 0;

	/**
	 * The number of structural features of the '<em>Constellation Command Plans List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_COMMAND_PLANS_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constellation Command Plans List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_COMMAND_PLANS_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationStateImpl <em>Constellation State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationStateImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getConstellationState()
	 * @generated
	 */
	int CONSTELLATION_STATE = 3;

	/**
	 * The feature id for the '<em><b>Constellation Command Plans List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_STATE__CONSTELLATION_COMMAND_PLANS_LIST = 0;

	/**
	 * The feature id for the '<em><b>Satellites List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_STATE__SATELLITES_LIST = 1;

	/**
	 * The feature id for the '<em><b>Ground Stations References List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_STATE__GROUND_STATIONS_REFERENCES_LIST = 2;

	/**
	 * The feature id for the '<em><b>Downlinks Lists</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_STATE__DOWNLINKS_LISTS = 3;

	/**
	 * The feature id for the '<em><b>Constellation Requests List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_STATE__CONSTELLATION_REQUESTS_LIST = 4;

	/**
	 * The feature id for the '<em><b>Constellation Planner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_STATE__CONSTELLATION_PLANNER = 5;

	/**
	 * The number of structural features of the '<em>Constellation State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_STATE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Constellation State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationImpl <em>Abstract Constellation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getAbstractConstellation()
	 * @generated
	 */
	int ABSTRACT_CONSTELLATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constellation State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION__CONSTELLATION_STATE = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Constellation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Export</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION___EXPORT__ABSTRACTCONSTELLATIONCOMMANDPLAN_STRING = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Commit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION___COMMIT__ABSTRACTCONSTELLATIONCOMMANDPLAN = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION___APPLY__CONSTELLATIONDOWNLINK = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Import Constellation Downlink</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION___IMPORT_CONSTELLATION_DOWNLINK__STRING = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Import Constellation Requests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION___IMPORT_CONSTELLATION_REQUESTS__STRING = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Abstract Constellation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.DefaultConstellationImpl <em>Default Constellation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.DefaultConstellationImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getDefaultConstellation()
	 * @generated
	 */
	int DEFAULT_CONSTELLATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION__NAME = ABSTRACT_CONSTELLATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION__DESCRIPTION = ABSTRACT_CONSTELLATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constellation State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION__CONSTELLATION_STATE = ABSTRACT_CONSTELLATION__CONSTELLATION_STATE;

	/**
	 * The number of structural features of the '<em>Default Constellation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION_FEATURE_COUNT = ABSTRACT_CONSTELLATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Export</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION___EXPORT__ABSTRACTCONSTELLATIONCOMMANDPLAN_STRING = ABSTRACT_CONSTELLATION___EXPORT__ABSTRACTCONSTELLATIONCOMMANDPLAN_STRING;

	/**
	 * The operation id for the '<em>Commit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION___COMMIT__ABSTRACTCONSTELLATIONCOMMANDPLAN = ABSTRACT_CONSTELLATION___COMMIT__ABSTRACTCONSTELLATIONCOMMANDPLAN;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION___APPLY__CONSTELLATIONDOWNLINK = ABSTRACT_CONSTELLATION___APPLY__CONSTELLATIONDOWNLINK;

	/**
	 * The operation id for the '<em>Import Constellation Downlink</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION___IMPORT_CONSTELLATION_DOWNLINK__STRING = ABSTRACT_CONSTELLATION___IMPORT_CONSTELLATION_DOWNLINK__STRING;

	/**
	 * The operation id for the '<em>Import Constellation Requests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION___IMPORT_CONSTELLATION_REQUESTS__STRING = ABSTRACT_CONSTELLATION___IMPORT_CONSTELLATION_REQUESTS__STRING;

	/**
	 * The number of operations of the '<em>Default Constellation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION_OPERATION_COUNT = ABSTRACT_CONSTELLATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationPlannerImpl <em>Abstract Constellation Planner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationPlannerImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getAbstractConstellationPlanner()
	 * @generated
	 */
	int ABSTRACT_CONSTELLATION_PLANNER = 6;

	/**
	 * The feature id for the '<em><b>Constellation State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_STATE = 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_PLANNER__START_DATE = 1;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_PLANNER__END_DATE = 2;

	/**
	 * The feature id for the '<em><b>Constellation Requests List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_REQUESTS_LIST = 3;

	/**
	 * The feature id for the '<em><b>Constellation Command Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_COMMAND_PLAN = 4;

	/**
	 * The feature id for the '<em><b>Max Number Threads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_PLANNER__MAX_NUMBER_THREADS = 5;

	/**
	 * The feature id for the '<em><b>Command Duplicates Preserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_PLANNER__COMMAND_DUPLICATES_PRESERVED = 6;

	/**
	 * The feature id for the '<em><b>Elevation Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_PLANNER__ELEVATION_MASK = 7;

	/**
	 * The number of structural features of the '<em>Abstract Constellation Planner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_PLANNER_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_PLANNER___IS_VALID__VISIBILITYPASS = 0;

	/**
	 * The operation id for the '<em>Get Satellite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_PLANNER___GET_SATELLITE__EARTHORBITMODEL = 1;

	/**
	 * The operation id for the '<em>Plan</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_PLANNER___PLAN = 2;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_PLANNER___VALIDATE = 3;

	/**
	 * The operation id for the '<em>Get Request Based Satellite Commands Comparator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_PLANNER___GET_REQUEST_BASED_SATELLITE_COMMANDS_COMPARATOR = 4;

	/**
	 * The operation id for the '<em>Create Visibility Pass Based Satellite Command</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_PLANNER___CREATE_VISIBILITY_PASS_BASED_SATELLITE_COMMAND__OBSERVATIONCONSTELLATIONREQUEST_VISIBILITYPASS = 5;

	/**
	 * The number of operations of the '<em>Abstract Constellation Planner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_PLANNER_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.DefaultConstellationPlannerImpl <em>Default Constellation Planner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.DefaultConstellationPlannerImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getDefaultConstellationPlanner()
	 * @generated
	 */
	int DEFAULT_CONSTELLATION_PLANNER = 7;

	/**
	 * The feature id for the '<em><b>Constellation State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION_PLANNER__CONSTELLATION_STATE = ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_STATE;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION_PLANNER__START_DATE = ABSTRACT_CONSTELLATION_PLANNER__START_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION_PLANNER__END_DATE = ABSTRACT_CONSTELLATION_PLANNER__END_DATE;

	/**
	 * The feature id for the '<em><b>Constellation Requests List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION_PLANNER__CONSTELLATION_REQUESTS_LIST = ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_REQUESTS_LIST;

	/**
	 * The feature id for the '<em><b>Constellation Command Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION_PLANNER__CONSTELLATION_COMMAND_PLAN = ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_COMMAND_PLAN;

	/**
	 * The feature id for the '<em><b>Max Number Threads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION_PLANNER__MAX_NUMBER_THREADS = ABSTRACT_CONSTELLATION_PLANNER__MAX_NUMBER_THREADS;

	/**
	 * The feature id for the '<em><b>Command Duplicates Preserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION_PLANNER__COMMAND_DUPLICATES_PRESERVED = ABSTRACT_CONSTELLATION_PLANNER__COMMAND_DUPLICATES_PRESERVED;

	/**
	 * The feature id for the '<em><b>Elevation Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION_PLANNER__ELEVATION_MASK = ABSTRACT_CONSTELLATION_PLANNER__ELEVATION_MASK;

	/**
	 * The feature id for the '<em><b>Umbra Passes Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION_PLANNER__UMBRA_PASSES_VALID = ABSTRACT_CONSTELLATION_PLANNER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Satellite Roll Command Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION_PLANNER__SATELLITE_ROLL_COMMAND_VALID = ABSTRACT_CONSTELLATION_PLANNER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sun Horizon Angle Umbra Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION_PLANNER__SUN_HORIZON_ANGLE_UMBRA_THRESHOLD = ABSTRACT_CONSTELLATION_PLANNER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Default Constellation Planner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION_PLANNER_FEATURE_COUNT = ABSTRACT_CONSTELLATION_PLANNER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION_PLANNER___IS_VALID__VISIBILITYPASS = ABSTRACT_CONSTELLATION_PLANNER___IS_VALID__VISIBILITYPASS;

	/**
	 * The operation id for the '<em>Get Satellite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION_PLANNER___GET_SATELLITE__EARTHORBITMODEL = ABSTRACT_CONSTELLATION_PLANNER___GET_SATELLITE__EARTHORBITMODEL;

	/**
	 * The operation id for the '<em>Plan</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION_PLANNER___PLAN = ABSTRACT_CONSTELLATION_PLANNER___PLAN;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION_PLANNER___VALIDATE = ABSTRACT_CONSTELLATION_PLANNER___VALIDATE;

	/**
	 * The operation id for the '<em>Get Request Based Satellite Commands Comparator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION_PLANNER___GET_REQUEST_BASED_SATELLITE_COMMANDS_COMPARATOR = ABSTRACT_CONSTELLATION_PLANNER___GET_REQUEST_BASED_SATELLITE_COMMANDS_COMPARATOR;

	/**
	 * The operation id for the '<em>Create Visibility Pass Based Satellite Command</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION_PLANNER___CREATE_VISIBILITY_PASS_BASED_SATELLITE_COMMAND__OBSERVATIONCONSTELLATIONREQUEST_VISIBILITYPASS = ABSTRACT_CONSTELLATION_PLANNER___CREATE_VISIBILITY_PASS_BASED_SATELLITE_COMMAND__OBSERVATIONCONSTELLATIONREQUEST_VISIBILITYPASS;

	/**
	 * The number of operations of the '<em>Default Constellation Planner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION_PLANNER_OPERATION_COUNT = ABSTRACT_CONSTELLATION_PLANNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationCommandPlanImpl <em>Abstract Constellation Command Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationCommandPlanImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getAbstractConstellationCommandPlan()
	 * @generated
	 */
	int ABSTRACT_CONSTELLATION_COMMAND_PLAN = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_COMMAND_PLAN__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_COMMAND_PLAN__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constellation Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_COMMAND_PLAN__CONSTELLATION_COMMANDS = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Constellation Command Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_COMMAND_PLAN_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Constellation Command Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_COMMAND_PLAN_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.DefaultConstellationCommandPlanImpl <em>Default Constellation Command Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.DefaultConstellationCommandPlanImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getDefaultConstellationCommandPlan()
	 * @generated
	 */
	int DEFAULT_CONSTELLATION_COMMAND_PLAN = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION_COMMAND_PLAN__NAME = ABSTRACT_CONSTELLATION_COMMAND_PLAN__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION_COMMAND_PLAN__DESCRIPTION = ABSTRACT_CONSTELLATION_COMMAND_PLAN__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constellation Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION_COMMAND_PLAN__CONSTELLATION_COMMANDS = ABSTRACT_CONSTELLATION_COMMAND_PLAN__CONSTELLATION_COMMANDS;

	/**
	 * The number of structural features of the '<em>Default Constellation Command Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION_COMMAND_PLAN_FEATURE_COUNT = ABSTRACT_CONSTELLATION_COMMAND_PLAN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Default Constellation Command Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_CONSTELLATION_COMMAND_PLAN_OPERATION_COUNT = ABSTRACT_CONSTELLATION_COMMAND_PLAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationRequestsListImpl <em>Constellation Requests List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationRequestsListImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getConstellationRequestsList()
	 * @generated
	 */
	int CONSTELLATION_REQUESTS_LIST = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_REQUESTS_LIST__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_REQUESTS_LIST__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constellation Requests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_REQUESTS_LIST__CONSTELLATION_REQUESTS = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constellation Requests List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_REQUESTS_LIST_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Constellation Requests List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_REQUESTS_LIST_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationRequestImpl <em>Abstract Constellation Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationRequestImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getAbstractConstellationRequest()
	 * @generated
	 */
	int ABSTRACT_CONSTELLATION_REQUEST = 11;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' containment reference.
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
	 * The number of structural features of the '<em>Abstract Constellation Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_REQUEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Abstract Constellation Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTELLATION_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.SimpleRequestImpl <em>Simple Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.SimpleRequestImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getSimpleRequest()
	 * @generated
	 */
	int SIMPLE_REQUEST = 12;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_REQUEST__UID = ABSTRACT_CONSTELLATION_REQUEST__UID;

	/**
	 * The feature id for the '<em><b>Order Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_REQUEST__ORDER_PRIORITY = ABSTRACT_CONSTELLATION_REQUEST__ORDER_PRIORITY;

	/**
	 * The feature id for the '<em><b>Order Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_REQUEST__ORDER_STATUS = ABSTRACT_CONSTELLATION_REQUEST__ORDER_STATUS;

	/**
	 * The number of structural features of the '<em>Simple Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_REQUEST_FEATURE_COUNT = ABSTRACT_CONSTELLATION_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_REQUEST_OPERATION_COUNT = ABSTRACT_CONSTELLATION_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ObservationConstellationRequestImpl <em>Observation Constellation Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ObservationConstellationRequestImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getObservationConstellationRequest()
	 * @generated
	 */
	int OBSERVATION_CONSTELLATION_REQUEST = 13;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_CONSTELLATION_REQUEST__UID = ABSTRACT_CONSTELLATION_REQUEST__UID;

	/**
	 * The feature id for the '<em><b>Order Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_CONSTELLATION_REQUEST__ORDER_PRIORITY = ABSTRACT_CONSTELLATION_REQUEST__ORDER_PRIORITY;

	/**
	 * The feature id for the '<em><b>Order Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_CONSTELLATION_REQUEST__ORDER_STATUS = ABSTRACT_CONSTELLATION_REQUEST__ORDER_STATUS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_CONSTELLATION_REQUEST__LOCATION = ABSTRACT_CONSTELLATION_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Observation Constellation Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_CONSTELLATION_REQUEST_FEATURE_COUNT = ABSTRACT_CONSTELLATION_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Observation Constellation Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_CONSTELLATION_REQUEST_OPERATION_COUNT = ABSTRACT_CONSTELLATION_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ImageConstellationRequestImpl <em>Image Constellation Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ImageConstellationRequestImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getImageConstellationRequest()
	 * @generated
	 */
	int IMAGE_CONSTELLATION_REQUEST = 14;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONSTELLATION_REQUEST__UID = OBSERVATION_CONSTELLATION_REQUEST__UID;

	/**
	 * The feature id for the '<em><b>Order Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONSTELLATION_REQUEST__ORDER_PRIORITY = OBSERVATION_CONSTELLATION_REQUEST__ORDER_PRIORITY;

	/**
	 * The feature id for the '<em><b>Order Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONSTELLATION_REQUEST__ORDER_STATUS = OBSERVATION_CONSTELLATION_REQUEST__ORDER_STATUS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONSTELLATION_REQUEST__LOCATION = OBSERVATION_CONSTELLATION_REQUEST__LOCATION;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONSTELLATION_REQUEST__IMAGE = OBSERVATION_CONSTELLATION_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image Constellation Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONSTELLATION_REQUEST_FEATURE_COUNT = OBSERVATION_CONSTELLATION_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Image Constellation Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONSTELLATION_REQUEST_OPERATION_COUNT = OBSERVATION_CONSTELLATION_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.SatellitesListImpl <em>Satellites List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.SatellitesListImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getSatellitesList()
	 * @generated
	 */
	int SATELLITES_LIST = 15;

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
	int SATELLITE = 16;

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
	 * The feature id for the '<em><b>Maximum Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE__MAXIMUM_ROLL = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Satellite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATELLITE_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

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
	int ABSTRACT_SATELLITE_COMMAND = 17;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SATELLITE_COMMAND__TIME = ApogyCommonEMFPackage.TIMED__TIME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SATELLITE_COMMAND__UID = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Satellite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SATELLITE_COMMAND__SATELLITE = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Satellite Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SATELLITE_COMMAND_FEATURE_COUNT = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Satellite Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SATELLITE_COMMAND_OPERATION_COUNT = ApogyCommonEMFPackage.TIMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractRequestBasedSatelliteCommandImpl <em>Abstract Request Based Satellite Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractRequestBasedSatelliteCommandImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getAbstractRequestBasedSatelliteCommand()
	 * @generated
	 */
	int ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND = 18;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND__TIME = ABSTRACT_SATELLITE_COMMAND__TIME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND__UID = ABSTRACT_SATELLITE_COMMAND__UID;

	/**
	 * The feature id for the '<em><b>Satellite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND__SATELLITE = ABSTRACT_SATELLITE_COMMAND__SATELLITE;

	/**
	 * The feature id for the '<em><b>Constellation Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND__CONSTELLATION_REQUEST = ABSTRACT_SATELLITE_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Request Based Satellite Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND_FEATURE_COUNT = ABSTRACT_SATELLITE_COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Request Based Satellite Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND_OPERATION_COUNT = ABSTRACT_SATELLITE_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.VisibilityPassBasedSatelliteCommandImpl <em>Visibility Pass Based Satellite Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.VisibilityPassBasedSatelliteCommandImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getVisibilityPassBasedSatelliteCommand()
	 * @generated
	 */
	int VISIBILITY_PASS_BASED_SATELLITE_COMMAND = 19;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS_BASED_SATELLITE_COMMAND__TIME = ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND__TIME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS_BASED_SATELLITE_COMMAND__UID = ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND__UID;

	/**
	 * The feature id for the '<em><b>Satellite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS_BASED_SATELLITE_COMMAND__SATELLITE = ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND__SATELLITE;

	/**
	 * The feature id for the '<em><b>Constellation Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS_BASED_SATELLITE_COMMAND__CONSTELLATION_REQUEST = ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND__CONSTELLATION_REQUEST;

	/**
	 * The feature id for the '<em><b>Visibility Pass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS_BASED_SATELLITE_COMMAND__VISIBILITY_PASS = ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Visibility Pass Based Satellite Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS_BASED_SATELLITE_COMMAND_FEATURE_COUNT = ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Visibility Pass Based Satellite Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS_BASED_SATELLITE_COMMAND_OPERATION_COUNT = ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AcquireImageSatelliteCommandImpl <em>Acquire Image Satellite Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.AcquireImageSatelliteCommandImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getAcquireImageSatelliteCommand()
	 * @generated
	 */
	int ACQUIRE_IMAGE_SATELLITE_COMMAND = 20;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_IMAGE_SATELLITE_COMMAND__TIME = ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND__TIME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_IMAGE_SATELLITE_COMMAND__UID = ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND__UID;

	/**
	 * The feature id for the '<em><b>Satellite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_IMAGE_SATELLITE_COMMAND__SATELLITE = ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND__SATELLITE;

	/**
	 * The feature id for the '<em><b>Constellation Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_IMAGE_SATELLITE_COMMAND__CONSTELLATION_REQUEST = ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND__CONSTELLATION_REQUEST;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_IMAGE_SATELLITE_COMMAND__LONGITUDE = ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_IMAGE_SATELLITE_COMMAND__LATITUDE = ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elevation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_IMAGE_SATELLITE_COMMAND__ELEVATION = ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Roll Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_IMAGE_SATELLITE_COMMAND__ROLL_ANGLE = ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Acquire Image Satellite Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_IMAGE_SATELLITE_COMMAND_FEATURE_COUNT = ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Acquire Image Satellite Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_IMAGE_SATELLITE_COMMAND_OPERATION_COUNT = ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.OrbitalImageImpl <em>Orbital Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.OrbitalImageImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getOrbitalImage()
	 * @generated
	 */
	int ORBITAL_IMAGE = 21;

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
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBITAL_IMAGE__LONGITUDE = ApogyCommonImagesPackage.EIMAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBITAL_IMAGE__LATITUDE = ApogyCommonImagesPackage.EIMAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elevation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBITAL_IMAGE__ELEVATION = ApogyCommonImagesPackage.EIMAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Roll Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBITAL_IMAGE__ROLL_ANGLE = ApogyCommonImagesPackage.EIMAGE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Orbital Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBITAL_IMAGE_FEATURE_COUNT = ApogyCommonImagesPackage.EIMAGE_FEATURE_COUNT + 4;

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
	int CONSTELLATION_DOWNLINKS_LIST = 22;

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
	int CONSTELLATION_DOWNLINK = 23;

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
	int ABSTRACT_CONSTELLATION_DOWNLINK_ITEM = 24;

	/**
	 * The feature id for the '<em><b>Request UID</b></em>' containment reference.
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
	int ORBITAL_IMAGE_CONSTELLATION_DOWNLINK_ITEM = 25;

	/**
	 * The feature id for the '<em><b>Request UID</b></em>' containment reference.
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
	int CONSTELLATION_UTILITIES = 26;

	/**
	 * The number of structural features of the '<em>Constellation Utilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_UTILITIES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Add All Requests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_UTILITIES___ADD_ALL_REQUESTS__CONSTELLATIONREQUESTSLIST_LIST = 0;

	/**
	 * The operation id for the '<em>Add Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_UTILITIES___ADD_REQUEST__CONSTELLATIONREQUESTSLIST_ABSTRACTCONSTELLATIONREQUEST = 1;

	/**
	 * The operation id for the '<em>Remove Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_UTILITIES___REMOVE_REQUEST__CONSTELLATIONREQUESTSLIST_ABSTRACTCONSTELLATIONREQUEST = 2;

	/**
	 * The operation id for the '<em>Remove All Requests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_UTILITIES___REMOVE_ALL_REQUESTS__CONSTELLATIONREQUESTSLIST_LIST = 3;

	/**
	 * The number of operations of the '<em>Constellation Utilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_UTILITIES_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestPriority <em>Constellation Request Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestPriority
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getConstellationRequestPriority()
	 * @generated
	 */
	int CONSTELLATION_REQUEST_PRIORITY = 27;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestStatus <em>Constellation Request Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestStatus
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getConstellationRequestStatus()
	 * @generated
	 */
	int CONSTELLATION_REQUEST_STATUS = 28;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getList()
	 * @generated
	 */
	int LIST = 29;

	/**
	 * The meta object id for the '<em>Sorted Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.SortedSet
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getSortedSet()
	 * @generated
	 */
	int SORTED_SET = 30;


	/**
	 * The meta object id for the '<em>Comparator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Comparator
	 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getComparator()
	 * @generated
	 */
	int COMPARATOR = 31;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractUID <em>Abstract UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract UID</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractUID
	 * @generated
	 */
	EClass getAbstractUID();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.StringUID <em>String UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String UID</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.StringUID
	 * @generated
	 */
	EClass getStringUID();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.satellite.StringUID#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.StringUID#getId()
	 * @see #getStringUID()
	 * @generated
	 */
	EAttribute getStringUID_Id();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlansList <em>Constellation Command Plans List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constellation Command Plans List</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlansList
	 * @generated
	 */
	EClass getConstellationCommandPlansList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlansList#getPlans <em>Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plans</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlansList#getPlans()
	 * @see #getConstellationCommandPlansList()
	 * @generated
	 */
	EReference getConstellationCommandPlansList_Plans();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationState <em>Constellation State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constellation State</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationState
	 * @generated
	 */
	EClass getConstellationState();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getConstellationCommandPlansList <em>Constellation Command Plans List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constellation Command Plans List</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getConstellationCommandPlansList()
	 * @see #getConstellationState()
	 * @generated
	 */
	EReference getConstellationState_ConstellationCommandPlansList();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getSatellitesList <em>Satellites List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Satellites List</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getSatellitesList()
	 * @see #getConstellationState()
	 * @generated
	 */
	EReference getConstellationState_SatellitesList();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getGroundStationsReferencesList <em>Ground Stations References List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ground Stations References List</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getGroundStationsReferencesList()
	 * @see #getConstellationState()
	 * @generated
	 */
	EReference getConstellationState_GroundStationsReferencesList();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getDownlinksLists <em>Downlinks Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Downlinks Lists</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getDownlinksLists()
	 * @see #getConstellationState()
	 * @generated
	 */
	EReference getConstellationState_DownlinksLists();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getConstellationRequestsList <em>Constellation Requests List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constellation Requests List</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getConstellationRequestsList()
	 * @see #getConstellationState()
	 * @generated
	 */
	EReference getConstellationState_ConstellationRequestsList();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getConstellationPlanner <em>Constellation Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constellation Planner</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getConstellationPlanner()
	 * @see #getConstellationState()
	 * @generated
	 */
	EReference getConstellationState_ConstellationPlanner();

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
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#getConstellationState <em>Constellation State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constellation State</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#getConstellationState()
	 * @see #getAbstractConstellation()
	 * @generated
	 */
	EReference getAbstractConstellation_ConstellationState();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#export(ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationCommandPlan, java.lang.String) <em>Export</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Export</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#export(ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationCommandPlan, java.lang.String)
	 * @generated
	 */
	EOperation getAbstractConstellation__Export__AbstractConstellationCommandPlan_String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#commit(ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationCommandPlan) <em>Commit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Commit</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#commit(ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationCommandPlan)
	 * @generated
	 */
	EOperation getAbstractConstellation__Commit__AbstractConstellationCommandPlan();

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
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#importConstellationDownlink(java.lang.String) <em>Import Constellation Downlink</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Import Constellation Downlink</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#importConstellationDownlink(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractConstellation__ImportConstellationDownlink__String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#importConstellationRequests(java.lang.String) <em>Import Constellation Requests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Import Constellation Requests</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#importConstellationRequests(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractConstellation__ImportConstellationRequests__String();

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
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner <em>Abstract Constellation Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Constellation Planner</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner
	 * @generated
	 */
	EClass getAbstractConstellationPlanner();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getConstellationState <em>Constellation State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Constellation State</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getConstellationState()
	 * @see #getAbstractConstellationPlanner()
	 * @generated
	 */
	EReference getAbstractConstellationPlanner_ConstellationState();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getStartDate()
	 * @see #getAbstractConstellationPlanner()
	 * @generated
	 */
	EAttribute getAbstractConstellationPlanner_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getEndDate()
	 * @see #getAbstractConstellationPlanner()
	 * @generated
	 */
	EAttribute getAbstractConstellationPlanner_EndDate();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getConstellationRequestsList <em>Constellation Requests List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constellation Requests List</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getConstellationRequestsList()
	 * @see #getAbstractConstellationPlanner()
	 * @generated
	 */
	EReference getAbstractConstellationPlanner_ConstellationRequestsList();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getConstellationCommandPlan <em>Constellation Command Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constellation Command Plan</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getConstellationCommandPlan()
	 * @see #getAbstractConstellationPlanner()
	 * @generated
	 */
	EReference getAbstractConstellationPlanner_ConstellationCommandPlan();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getMaxNumberThreads <em>Max Number Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Number Threads</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getMaxNumberThreads()
	 * @see #getAbstractConstellationPlanner()
	 * @generated
	 */
	EAttribute getAbstractConstellationPlanner_MaxNumberThreads();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#isCommandDuplicatesPreserved <em>Command Duplicates Preserved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command Duplicates Preserved</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#isCommandDuplicatesPreserved()
	 * @see #getAbstractConstellationPlanner()
	 * @generated
	 */
	EAttribute getAbstractConstellationPlanner_CommandDuplicatesPreserved();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getElevationMask <em>Elevation Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elevation Mask</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getElevationMask()
	 * @see #getAbstractConstellationPlanner()
	 * @generated
	 */
	EReference getAbstractConstellationPlanner_ElevationMask();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#isValid(ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass) <em>Is Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#isValid(ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass)
	 * @generated
	 */
	EOperation getAbstractConstellationPlanner__IsValid__VisibilityPass();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getSatellite(ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitModel) <em>Get Satellite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Satellite</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getSatellite(ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitModel)
	 * @generated
	 */
	EOperation getAbstractConstellationPlanner__GetSatellite__EarthOrbitModel();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#plan() <em>Plan</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Plan</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#plan()
	 * @generated
	 */
	EOperation getAbstractConstellationPlanner__Plan();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#validate() <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#validate()
	 * @generated
	 */
	EOperation getAbstractConstellationPlanner__Validate();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getRequestBasedSatelliteCommandsComparator() <em>Get Request Based Satellite Commands Comparator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Request Based Satellite Commands Comparator</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getRequestBasedSatelliteCommandsComparator()
	 * @generated
	 */
	EOperation getAbstractConstellationPlanner__GetRequestBasedSatelliteCommandsComparator();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#createVisibilityPassBasedSatelliteCommand(ca.gc.asc_csa.apogy.examples.satellite.ObservationConstellationRequest, ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass) <em>Create Visibility Pass Based Satellite Command</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Visibility Pass Based Satellite Command</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#createVisibilityPassBasedSatelliteCommand(ca.gc.asc_csa.apogy.examples.satellite.ObservationConstellationRequest, ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass)
	 * @generated
	 */
	EOperation getAbstractConstellationPlanner__CreateVisibilityPassBasedSatelliteCommand__ObservationConstellationRequest_VisibilityPass();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellationPlanner <em>Default Constellation Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Constellation Planner</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellationPlanner
	 * @generated
	 */
	EClass getDefaultConstellationPlanner();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellationPlanner#isUmbraPassesValid <em>Umbra Passes Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Umbra Passes Valid</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellationPlanner#isUmbraPassesValid()
	 * @see #getDefaultConstellationPlanner()
	 * @generated
	 */
	EAttribute getDefaultConstellationPlanner_UmbraPassesValid();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellationPlanner#isSatelliteRollCommandValid <em>Satellite Roll Command Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Satellite Roll Command Valid</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellationPlanner#isSatelliteRollCommandValid()
	 * @see #getDefaultConstellationPlanner()
	 * @generated
	 */
	EAttribute getDefaultConstellationPlanner_SatelliteRollCommandValid();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellationPlanner#getSunHorizonAngleUmbraThreshold <em>Sun Horizon Angle Umbra Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sun Horizon Angle Umbra Threshold</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellationPlanner#getSunHorizonAngleUmbraThreshold()
	 * @see #getDefaultConstellationPlanner()
	 * @generated
	 */
	EAttribute getDefaultConstellationPlanner_SunHorizonAngleUmbraThreshold();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationCommandPlan <em>Abstract Constellation Command Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Constellation Command Plan</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationCommandPlan
	 * @generated
	 */
	EClass getAbstractConstellationCommandPlan();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationCommandPlan#getConstellationCommands <em>Constellation Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constellation Commands</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationCommandPlan#getConstellationCommands()
	 * @see #getAbstractConstellationCommandPlan()
	 * @generated
	 */
	EReference getAbstractConstellationCommandPlan_ConstellationCommands();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellationCommandPlan <em>Default Constellation Command Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Constellation Command Plan</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellationCommandPlan
	 * @generated
	 */
	EClass getDefaultConstellationCommandPlan();

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
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uid</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest#getUid()
	 * @see #getAbstractConstellationRequest()
	 * @generated
	 */
	EReference getAbstractConstellationRequest_Uid();

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
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.SimpleRequest <em>Simple Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Request</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.SimpleRequest
	 * @generated
	 */
	EClass getSimpleRequest();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.ObservationConstellationRequest <em>Observation Constellation Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observation Constellation Request</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ObservationConstellationRequest
	 * @generated
	 */
	EClass getObservationConstellationRequest();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.satellite.ObservationConstellationRequest#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ObservationConstellationRequest#getLocation()
	 * @see #getObservationConstellationRequest()
	 * @generated
	 */
	EReference getObservationConstellationRequest_Location();

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
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractSatelliteCommand#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uid</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractSatelliteCommand#getUid()
	 * @see #getAbstractSatelliteCommand()
	 * @generated
	 */
	EReference getAbstractSatelliteCommand_Uid();

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
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractRequestBasedSatelliteCommand <em>Abstract Request Based Satellite Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Request Based Satellite Command</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractRequestBasedSatelliteCommand
	 * @generated
	 */
	EClass getAbstractRequestBasedSatelliteCommand();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractRequestBasedSatelliteCommand#getConstellationRequest <em>Constellation Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constellation Request</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractRequestBasedSatelliteCommand#getConstellationRequest()
	 * @see #getAbstractRequestBasedSatelliteCommand()
	 * @generated
	 */
	EReference getAbstractRequestBasedSatelliteCommand_ConstellationRequest();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.VisibilityPassBasedSatelliteCommand <em>Visibility Pass Based Satellite Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visibility Pass Based Satellite Command</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.VisibilityPassBasedSatelliteCommand
	 * @generated
	 */
	EClass getVisibilityPassBasedSatelliteCommand();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.satellite.VisibilityPassBasedSatelliteCommand#getVisibilityPass <em>Visibility Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Visibility Pass</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.VisibilityPassBasedSatelliteCommand#getVisibilityPass()
	 * @see #getVisibilityPassBasedSatelliteCommand()
	 * @generated
	 */
	EReference getVisibilityPassBasedSatelliteCommand_VisibilityPass();

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
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationDownlinkItem#getRequestUID <em>Request UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request UID</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationDownlinkItem#getRequestUID()
	 * @see #getAbstractConstellationDownlinkItem()
	 * @generated
	 */
	EReference getAbstractConstellationDownlinkItem_RequestUID();

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
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationUtilities#addAllRequests(ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList, java.util.List) <em>Add All Requests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add All Requests</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationUtilities#addAllRequests(ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList, java.util.List)
	 * @generated
	 */
	EOperation getConstellationUtilities__AddAllRequests__ConstellationRequestsList_List();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationUtilities#addRequest(ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList, ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest) <em>Add Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Request</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationUtilities#addRequest(ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList, ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest)
	 * @generated
	 */
	EOperation getConstellationUtilities__AddRequest__ConstellationRequestsList_AbstractConstellationRequest();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationUtilities#removeRequest(ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList, ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest) <em>Remove Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Request</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationUtilities#removeRequest(ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList, ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest)
	 * @generated
	 */
	EOperation getConstellationUtilities__RemoveRequest__ConstellationRequestsList_AbstractConstellationRequest();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationUtilities#removeAllRequests(ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList, java.util.List) <em>Remove All Requests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove All Requests</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationUtilities#removeAllRequests(ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList, java.util.List)
	 * @generated
	 */
	EOperation getConstellationUtilities__RemoveAllRequests__ConstellationRequestsList_List();

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
	 * Returns the meta object for data type '{@link java.util.Comparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Comparator</em>'.
	 * @see java.util.Comparator
	 * @model instanceClass="java.util.Comparator" typeParameters="T"
	 * @generated
	 */
	EDataType getComparator();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractUIDImpl <em>Abstract UID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractUIDImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getAbstractUID()
		 * @generated
		 */
		EClass ABSTRACT_UID = eINSTANCE.getAbstractUID();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.StringUIDImpl <em>String UID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.StringUIDImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getStringUID()
		 * @generated
		 */
		EClass STRING_UID = eINSTANCE.getStringUID();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_UID__ID = eINSTANCE.getStringUID_Id();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationCommandPlansListImpl <em>Constellation Command Plans List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationCommandPlansListImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getConstellationCommandPlansList()
		 * @generated
		 */
		EClass CONSTELLATION_COMMAND_PLANS_LIST = eINSTANCE.getConstellationCommandPlansList();

		/**
		 * The meta object literal for the '<em><b>Plans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTELLATION_COMMAND_PLANS_LIST__PLANS = eINSTANCE.getConstellationCommandPlansList_Plans();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationStateImpl <em>Constellation State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationStateImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getConstellationState()
		 * @generated
		 */
		EClass CONSTELLATION_STATE = eINSTANCE.getConstellationState();

		/**
		 * The meta object literal for the '<em><b>Constellation Command Plans List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTELLATION_STATE__CONSTELLATION_COMMAND_PLANS_LIST = eINSTANCE.getConstellationState_ConstellationCommandPlansList();

		/**
		 * The meta object literal for the '<em><b>Satellites List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTELLATION_STATE__SATELLITES_LIST = eINSTANCE.getConstellationState_SatellitesList();

		/**
		 * The meta object literal for the '<em><b>Ground Stations References List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTELLATION_STATE__GROUND_STATIONS_REFERENCES_LIST = eINSTANCE.getConstellationState_GroundStationsReferencesList();

		/**
		 * The meta object literal for the '<em><b>Downlinks Lists</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTELLATION_STATE__DOWNLINKS_LISTS = eINSTANCE.getConstellationState_DownlinksLists();

		/**
		 * The meta object literal for the '<em><b>Constellation Requests List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTELLATION_STATE__CONSTELLATION_REQUESTS_LIST = eINSTANCE.getConstellationState_ConstellationRequestsList();

		/**
		 * The meta object literal for the '<em><b>Constellation Planner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTELLATION_STATE__CONSTELLATION_PLANNER = eINSTANCE.getConstellationState_ConstellationPlanner();

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
		 * The meta object literal for the '<em><b>Constellation State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONSTELLATION__CONSTELLATION_STATE = eINSTANCE.getAbstractConstellation_ConstellationState();

		/**
		 * The meta object literal for the '<em><b>Export</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONSTELLATION___EXPORT__ABSTRACTCONSTELLATIONCOMMANDPLAN_STRING = eINSTANCE.getAbstractConstellation__Export__AbstractConstellationCommandPlan_String();

		/**
		 * The meta object literal for the '<em><b>Commit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONSTELLATION___COMMIT__ABSTRACTCONSTELLATIONCOMMANDPLAN = eINSTANCE.getAbstractConstellation__Commit__AbstractConstellationCommandPlan();

		/**
		 * The meta object literal for the '<em><b>Apply</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONSTELLATION___APPLY__CONSTELLATIONDOWNLINK = eINSTANCE.getAbstractConstellation__Apply__ConstellationDownlink();

		/**
		 * The meta object literal for the '<em><b>Import Constellation Downlink</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONSTELLATION___IMPORT_CONSTELLATION_DOWNLINK__STRING = eINSTANCE.getAbstractConstellation__ImportConstellationDownlink__String();

		/**
		 * The meta object literal for the '<em><b>Import Constellation Requests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONSTELLATION___IMPORT_CONSTELLATION_REQUESTS__STRING = eINSTANCE.getAbstractConstellation__ImportConstellationRequests__String();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationPlannerImpl <em>Abstract Constellation Planner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationPlannerImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getAbstractConstellationPlanner()
		 * @generated
		 */
		EClass ABSTRACT_CONSTELLATION_PLANNER = eINSTANCE.getAbstractConstellationPlanner();

		/**
		 * The meta object literal for the '<em><b>Constellation State</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_STATE = eINSTANCE.getAbstractConstellationPlanner_ConstellationState();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CONSTELLATION_PLANNER__START_DATE = eINSTANCE.getAbstractConstellationPlanner_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CONSTELLATION_PLANNER__END_DATE = eINSTANCE.getAbstractConstellationPlanner_EndDate();

		/**
		 * The meta object literal for the '<em><b>Constellation Requests List</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_REQUESTS_LIST = eINSTANCE.getAbstractConstellationPlanner_ConstellationRequestsList();

		/**
		 * The meta object literal for the '<em><b>Constellation Command Plan</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_COMMAND_PLAN = eINSTANCE.getAbstractConstellationPlanner_ConstellationCommandPlan();

		/**
		 * The meta object literal for the '<em><b>Max Number Threads</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CONSTELLATION_PLANNER__MAX_NUMBER_THREADS = eINSTANCE.getAbstractConstellationPlanner_MaxNumberThreads();

		/**
		 * The meta object literal for the '<em><b>Command Duplicates Preserved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CONSTELLATION_PLANNER__COMMAND_DUPLICATES_PRESERVED = eINSTANCE.getAbstractConstellationPlanner_CommandDuplicatesPreserved();

		/**
		 * The meta object literal for the '<em><b>Elevation Mask</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONSTELLATION_PLANNER__ELEVATION_MASK = eINSTANCE.getAbstractConstellationPlanner_ElevationMask();

		/**
		 * The meta object literal for the '<em><b>Is Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONSTELLATION_PLANNER___IS_VALID__VISIBILITYPASS = eINSTANCE.getAbstractConstellationPlanner__IsValid__VisibilityPass();

		/**
		 * The meta object literal for the '<em><b>Get Satellite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONSTELLATION_PLANNER___GET_SATELLITE__EARTHORBITMODEL = eINSTANCE.getAbstractConstellationPlanner__GetSatellite__EarthOrbitModel();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONSTELLATION_PLANNER___PLAN = eINSTANCE.getAbstractConstellationPlanner__Plan();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONSTELLATION_PLANNER___VALIDATE = eINSTANCE.getAbstractConstellationPlanner__Validate();

		/**
		 * The meta object literal for the '<em><b>Get Request Based Satellite Commands Comparator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONSTELLATION_PLANNER___GET_REQUEST_BASED_SATELLITE_COMMANDS_COMPARATOR = eINSTANCE.getAbstractConstellationPlanner__GetRequestBasedSatelliteCommandsComparator();

		/**
		 * The meta object literal for the '<em><b>Create Visibility Pass Based Satellite Command</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONSTELLATION_PLANNER___CREATE_VISIBILITY_PASS_BASED_SATELLITE_COMMAND__OBSERVATIONCONSTELLATIONREQUEST_VISIBILITYPASS = eINSTANCE.getAbstractConstellationPlanner__CreateVisibilityPassBasedSatelliteCommand__ObservationConstellationRequest_VisibilityPass();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.DefaultConstellationPlannerImpl <em>Default Constellation Planner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.DefaultConstellationPlannerImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getDefaultConstellationPlanner()
		 * @generated
		 */
		EClass DEFAULT_CONSTELLATION_PLANNER = eINSTANCE.getDefaultConstellationPlanner();

		/**
		 * The meta object literal for the '<em><b>Umbra Passes Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_CONSTELLATION_PLANNER__UMBRA_PASSES_VALID = eINSTANCE.getDefaultConstellationPlanner_UmbraPassesValid();

		/**
		 * The meta object literal for the '<em><b>Satellite Roll Command Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_CONSTELLATION_PLANNER__SATELLITE_ROLL_COMMAND_VALID = eINSTANCE.getDefaultConstellationPlanner_SatelliteRollCommandValid();

		/**
		 * The meta object literal for the '<em><b>Sun Horizon Angle Umbra Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_CONSTELLATION_PLANNER__SUN_HORIZON_ANGLE_UMBRA_THRESHOLD = eINSTANCE.getDefaultConstellationPlanner_SunHorizonAngleUmbraThreshold();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationCommandPlanImpl <em>Abstract Constellation Command Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationCommandPlanImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getAbstractConstellationCommandPlan()
		 * @generated
		 */
		EClass ABSTRACT_CONSTELLATION_COMMAND_PLAN = eINSTANCE.getAbstractConstellationCommandPlan();

		/**
		 * The meta object literal for the '<em><b>Constellation Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONSTELLATION_COMMAND_PLAN__CONSTELLATION_COMMANDS = eINSTANCE.getAbstractConstellationCommandPlan_ConstellationCommands();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.DefaultConstellationCommandPlanImpl <em>Default Constellation Command Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.DefaultConstellationCommandPlanImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getDefaultConstellationCommandPlan()
		 * @generated
		 */
		EClass DEFAULT_CONSTELLATION_COMMAND_PLAN = eINSTANCE.getDefaultConstellationCommandPlan();

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
		 * The meta object literal for the '<em><b>Uid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONSTELLATION_REQUEST__UID = eINSTANCE.getAbstractConstellationRequest_Uid();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.SimpleRequestImpl <em>Simple Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.SimpleRequestImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getSimpleRequest()
		 * @generated
		 */
		EClass SIMPLE_REQUEST = eINSTANCE.getSimpleRequest();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ObservationConstellationRequestImpl <em>Observation Constellation Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ObservationConstellationRequestImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getObservationConstellationRequest()
		 * @generated
		 */
		EClass OBSERVATION_CONSTELLATION_REQUEST = eINSTANCE.getObservationConstellationRequest();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVATION_CONSTELLATION_REQUEST__LOCATION = eINSTANCE.getObservationConstellationRequest_Location();

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
		 * The meta object literal for the '<em><b>Uid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SATELLITE_COMMAND__UID = eINSTANCE.getAbstractSatelliteCommand_Uid();

		/**
		 * The meta object literal for the '<em><b>Satellite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SATELLITE_COMMAND__SATELLITE = eINSTANCE.getAbstractSatelliteCommand_Satellite();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractRequestBasedSatelliteCommandImpl <em>Abstract Request Based Satellite Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractRequestBasedSatelliteCommandImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getAbstractRequestBasedSatelliteCommand()
		 * @generated
		 */
		EClass ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND = eINSTANCE.getAbstractRequestBasedSatelliteCommand();

		/**
		 * The meta object literal for the '<em><b>Constellation Request</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND__CONSTELLATION_REQUEST = eINSTANCE.getAbstractRequestBasedSatelliteCommand_ConstellationRequest();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.impl.VisibilityPassBasedSatelliteCommandImpl <em>Visibility Pass Based Satellite Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.VisibilityPassBasedSatelliteCommandImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getVisibilityPassBasedSatelliteCommand()
		 * @generated
		 */
		EClass VISIBILITY_PASS_BASED_SATELLITE_COMMAND = eINSTANCE.getVisibilityPassBasedSatelliteCommand();

		/**
		 * The meta object literal for the '<em><b>Visibility Pass</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISIBILITY_PASS_BASED_SATELLITE_COMMAND__VISIBILITY_PASS = eINSTANCE.getVisibilityPassBasedSatelliteCommand_VisibilityPass();

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
		 * The meta object literal for the '<em><b>Request UID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONSTELLATION_DOWNLINK_ITEM__REQUEST_UID = eINSTANCE.getAbstractConstellationDownlinkItem_RequestUID();

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
		 * The meta object literal for the '<em><b>Add All Requests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONSTELLATION_UTILITIES___ADD_ALL_REQUESTS__CONSTELLATIONREQUESTSLIST_LIST = eINSTANCE.getConstellationUtilities__AddAllRequests__ConstellationRequestsList_List();

		/**
		 * The meta object literal for the '<em><b>Add Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONSTELLATION_UTILITIES___ADD_REQUEST__CONSTELLATIONREQUESTSLIST_ABSTRACTCONSTELLATIONREQUEST = eINSTANCE.getConstellationUtilities__AddRequest__ConstellationRequestsList_AbstractConstellationRequest();

		/**
		 * The meta object literal for the '<em><b>Remove Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONSTELLATION_UTILITIES___REMOVE_REQUEST__CONSTELLATIONREQUESTSLIST_ABSTRACTCONSTELLATIONREQUEST = eINSTANCE.getConstellationUtilities__RemoveRequest__ConstellationRequestsList_AbstractConstellationRequest();

		/**
		 * The meta object literal for the '<em><b>Remove All Requests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONSTELLATION_UTILITIES___REMOVE_ALL_REQUESTS__CONSTELLATIONREQUESTSLIST_LIST = eINSTANCE.getConstellationUtilities__RemoveAllRequests__ConstellationRequestsList_List();

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

		/**
		 * The meta object literal for the '<em>Comparator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Comparator
		 * @see ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatellitePackageImpl#getComparator()
		 * @generated
		 */
		EDataType COMPARATOR = eINSTANCE.getComparator();

	}

} //ApogyExamplesSatellitePackage
